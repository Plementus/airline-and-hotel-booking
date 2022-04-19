/**
 * Created by Ibrahim Olanrewaju on 4/19/2016.
 */

package service.sabre.utils

import java.util.{List => JList}

import core.gdsbookingengine.booking.{BookingResponse, PriceComparison, PriceQuote, ReservationItem}
import core.gdsbookingengine.{FlightSegmentWSResponse, PassengerCode, PassengerType}
import services.sabre.client.FlightAvailabilityRequest
import services.sabre.utils.SabreXMLRequestUtils

import scala.collection.mutable.ArrayBuffer
import scala.collection.JavaConversions._
import scala.xml.{Node, NodeSeq}

object EnhancedAirBookSOAPUtil extends SabreXMLRequestUtils with BookingResponses {
  val SERVICE = config.getString("sabre.enhancedAirBook.service").get
  val ACTION = config.getString("sabre.enhancedAirBook.action").get
  val DESCRIPTION = config.getString("sabre.enhancedAirBook.description").get

  def enhancedAirBook(binarySecurityToken: String, flightAvailabilityRequest: FlightAvailabilityRequest) = {
    val requestXml = {
      <EnhancedAirBookRQ version="3.2.0" xmlns="http://services.sabre.com/sp/eab/v3_2" IgnoreOnError="true" HaltOnError="true">
        <OTA_AirBookRQ>
          {getHaltOnStatusNodes}
          <OriginDestinationInformation>
            {toFlightSegmentNodes(flightAvailabilityRequest.getFlightSegmentWSResponses, flightAvailabilityRequest.getNumberInParty)}
          </OriginDestinationInformation>
        </OTA_AirBookRQ>
        <OTA_AirPriceRQ>
          <PriceComparison AmountSpecified={flightAvailabilityRequest.getTotalFare.toString}/>
          {getPriceRequestInformationNode(flightAvailabilityRequest.getPassengerTypes)}
        </OTA_AirPriceRQ>
        {getPostProcessingNodes}
        <PreProcessing IgnoreBefore="true" />
      </EnhancedAirBookRQ>
    }
    soapTemplateWithToken(binarySecurityToken, SERVICE, ACTION, DESCRIPTION, requestXml)
  }

  private def toFlightSegmentNodes(flightSegments: JList[FlightSegmentWSResponse], numberInParty: Int): ArrayBuffer[Node] = {
    val nodeBuffer = new ArrayBuffer[Node]()
    for (flightSegment <- flightSegments) yield {
      <FlightSegment ResBookDesigCode={flightSegment.getResBookDesigCode} FlightNumber={flightSegment.getFlightNumber} DepartureDateTime={flightSegment.getDepartureDateTime} ArrivalDateTime={flightSegment.getArrivalDateTime} NumberInParty={numberInParty.toString} Status="NN">
        <DestinationLocation LocationCode={flightSegment.getArrivalAirportCode}/>
        <Equipment AirEquipType={flightSegment.getAirEquipType}/>
        <MarketingAirline FlightNumber={flightSegment.getFlightNumber} Code={flightSegment.getMarketingAirlineCode}/>
          <MarriageGrp Ind={if(flightSegment.getMarriageGrp.equals("I")) "true" else "false"}/>
        <OperatingAirline Code={flightSegment.getMarketingAirlineCode}/>
        <OriginLocation LocationCode={flightSegment.getDepartureAirportCode}/>
      </FlightSegment>
    }.foreach(nodeBuffer += _)
    nodeBuffer
  }

  private def toPassengerTypeNodes(passengerTypes: JList[PassengerType]): ArrayBuffer[Node] = {
    val nodeBuffer = new ArrayBuffer[Node]()
    for (passengerType <- passengerTypes) yield {
        <PassengerType Code={passengerType.getCode.value()} Quantity={passengerType.getQuantity.toString}/>
    }.foreach(nodeBuffer += _)
    nodeBuffer
  }

  private def getHaltOnStatusNodes = {
    <HaltOnStatus Code="NO"/>
    <HaltOnStatus Code="NN"/>
    <HaltOnStatus Code="UC"/>
    <HaltOnStatus Code="US"/>
  }

  private def getPostProcessingNodes = {
    <PostProcessing IgnoreAfter="false">
      <RedisplayReservation WaitInterval="5000" />
    </PostProcessing>
  }

  private def getPriceRequestInformationNode(passengerTypes: JList[PassengerType]) = {
    <PriceRequestInformation Retain="true">
      <OptionalQualifiers>
        <PricingQualifiers CurrencyCode={CURRENCY}>
          <BargainFinder Rebook="true"/>
          {toPassengerTypeNodes(passengerTypes)}
        </PricingQualifiers>
      </OptionalQualifiers>
    </PriceRequestInformation>
  }
}

trait BookingResponses {
  def toBookingResponse(enhancedAirBookRSNode: Node) = {
    val bookingResponse = new BookingResponse
    val otaAirPriceRSNode = enhancedAirBookRSNode \ "OTA_AirPriceRS"
    val priceComparisonNode = otaAirPriceRSNode \ "PriceComparison"
    val travelItineraryReadRSNode = enhancedAirBookRSNode \ "TravelItineraryReadRS"
    val itineraryInfoNode = travelItineraryReadRSNode \ "TravelItinerary" \ "ItineraryInfo"
    val itineraryPricingNode = itineraryInfoNode \ "ItineraryPricing"
    val reservationItems =  itineraryInfoNode \ "ReservationItems" \ "Item"

    bookingResponse.setPriceComparison(toPriceComparison(priceComparisonNode))
    (itineraryPricingNode \ "PriceQuote").foreach {priceQuoteNode => bookingResponse.getPriceQuotes.add(toPriceQuote(priceQuoteNode))}
    reservationItems.foreach {item => bookingResponse.getReservationItems.add(toReservationItem(item))}
    bookingResponse
  }

  private def toPriceComparison(priceComparisonNode: NodeSeq) = {
    val priceComparison = new PriceComparison
    priceComparison.setAmountReturned((priceComparisonNode \@ "AmountReturned").toDouble)
    priceComparison.setAmountSpecified((priceComparisonNode \@ "AmountSpecified").toDouble)
    priceComparison
  }

  private def toPriceQuote(priceQuoteNode: NodeSeq) = {
    val priceQuote = new PriceQuote
    val totals = priceQuoteNode \\ "Totals"
    val passengerTypeQty = priceQuoteNode \\ "PassengerTypeQuantity"
    priceQuote.setRPH(priceQuoteNode \@ "RPH")
    priceQuote.setBaseFare((totals \ "EquivFare" \@ "Amount").toDouble)
    priceQuote.setTotalTax((totals \ "Taxes" \ "Tax" \@ "Amount").toDouble)
    priceQuote.setTotalFare((totals \ "TotalFare" \@ "Amount").toDouble)
    priceQuote.setPassengerType(new PassengerType(PassengerCode.fromValue(passengerTypeQty \@ "Code"), (passengerTypeQty \@ "Quantity").toInt))
    priceQuote
  }

  private def toReservationItem(item: NodeSeq) = {
    val reservationItem = new ReservationItem
    val flightSegment = item \ "FlightSegment"

    reservationItem.setRPH(item \@ "RPH")
    reservationItem.seteTicketType((flightSegment \@ "eTicket").toBoolean)
    reservationItem.setStopQuantity((flightSegment \@ "StopQuantity").toInt)
    reservationItem.setStatus(flightSegment \@ "Status")
    reservationItem.setSpecialMeal((flightSegment \@ "SpecialMeal").toBoolean)
    reservationItem.setSmokingAllowed((flightSegment \@ "SmokingAllowed").toBoolean)
    reservationItem.setSegmentNumber((flightSegment \@ "SegmentNumber").toInt)
    reservationItem.setResBookingCode(flightSegment \@ "ResBookDesigCode")
    reservationItem.setNumberInParty((flightSegment \@ "NumberInParty").toInt)
    reservationItem.setFlightNumber((flightSegment \@ "FlightNumber").toInt)
    reservationItem.setElapsedTime(flightSegment \@ "ElapsedTime")
    reservationItem.setDepartureDateTime(flightSegment \@ "DepartureDateTime")
    reservationItem.setDayOfWeekInd(flightSegment \@ "DayOfWeekInd")
    reservationItem.setArrivalDateTime(flightSegment \@ "ArrivalDateTime")
    reservationItem.setAirMilesFlown((flightSegment \@ "AirMilesFlown").toInt)
    reservationItem.setDestinationLocationCode(flightSegment \ "DestinationLocation" \@ "LocationCode")
    reservationItem.setAirEquipType(flightSegment \ "Equipment" \@ "AirEquipType")
    reservationItem.setAirline(flightSegment \ "MarketingAirline" \@ "Code")
    reservationItem.setMarriageGrp(flightSegment \ "MarriageGrp" \@ "Ind")
    reservationItem.setMealCode(flightSegment \ "Meal" \@ "Code")
    reservationItem.setOriginLocationCode(flightSegment \ "OriginLocation" \@ "LocationCode")
    reservationItem.setUpdatedArrivalTime((flightSegment \ "UpdatedArrivalTime").text)
    reservationItem.setUpdatedDepartureTime((flightSegment \ "UpdatedDepartureTime").text)
    reservationItem
  }
}
