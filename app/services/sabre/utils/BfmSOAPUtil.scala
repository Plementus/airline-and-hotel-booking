/**
  * Created by Ibrahim Olanrewaju on 4/22/2016.
  */

package service.sabre.utils

import java.time.Duration
import java.util.{List => JList}

import core.gdsbookingengine._
import services.sabre.utils.SabreXMLRequestUtils

import scala.collection.mutable.ArrayBuffer
import scala.collection.JavaConversions._
import scala.xml._


object BfmSOAPUtil extends SabreXMLRequestUtils with PricedItineraryWSResponses with LowFareSearchConfig {

  def bfmXmlRequest(binarySecurityToken: String, flightRequest: FlightSearchRequest) = {
    val bfmConfig = bfmConfigOptions.get(flightRequest.isFlexibleDate).get
    val bfmXml = {
      <OTA_AirLowFareSearchRQ Version={bfmConfig.version} ResponseType={SERVICE_TYPE} ResponseVersion={bfmConfig.version} xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns="http://www.opentravel.org/OTA/2003/05" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" Target="Production" AvailableFlightsOnly="true">
        <POS>
          <Source PseudoCityCode={SABRE_PCC}>
            <RequestorID ID="1" Type="1">
              <CompanyName Code="TN"/>
            </RequestorID>
          </Source>
        </POS>
        {toOriginDestinationNodes(flightRequest.getOriginDestinationRequests, bfmConfig)}
        <TravelPreferences ValidInterlineTicket="true" MaxStopsQuantity="4" ETicketDesired="true">
          <CabinPref PreferLevel={flightRequest.getCabinPrefLevel.value()} Cabin={flightRequest.getPreferredCabin.value()}/>
          <TPA_Extensions>
            <NumTripsWithRouting Number="1"/>
            <OnlineIndicator Ind="true"/>
            <TripType Value={flightRequest.getTripType.value()}/>
            <ExcludeCallDirectCarriers Enabled="true"/>{getFlexibleFaresNode}
        </TPA_Extensions>
      </TravelPreferences>
        <TravelerInfoSummary>
          <AirTravelerAvail>
            {toPassengerTypeQuantityNodes(flightRequest.getPassengerTypes)}
          </AirTravelerAvail>{getPricedInformationRequestNode}
        </TravelerInfoSummary>
        <TPA_Extensions>
          <IntelliSellTransaction>
            <RequestType Name={bfmConfig.requestType}/>
          </IntelliSellTransaction>
        </TPA_Extensions>
      </OTA_AirLowFareSearchRQ>
    }
    soapTemplateWithToken(binarySecurityToken, bfmConfig.service, bfmConfig.action, bfmConfig.description, bfmXml)
  }

  private def toOriginDestinationNodes(originDestinations: JList[OriginDestinationRequest], bfmConfig: BfmConfig): ArrayBuffer[Node] = {
    val nodeBuffer = new ArrayBuffer[Node]()
    for (originDestination <- originDestinations) yield {
      <OriginDestinationInformation RPH={originDestination.getRPH}>
        <DepartureDateTime>{originDestination.getDepartureDateTime}</DepartureDateTime>
        <OriginLocation LocationCode={originDestination.getOrigin}/>
        <DestinationLocation LocationCode={originDestination.getDestination}/>
        <TPA_Extensions>
          <SegmentType Code={bfmConfig.segmentType}/>
          <ConnectionTime Max={bfmConfig.connectTimeMax}/>
        </TPA_Extensions>
      </OriginDestinationInformation>
    }.foreach(nodeBuffer += _)
    nodeBuffer
  }

  private def toPassengerTypeQuantityNodes(passengerTypes: JList[PassengerType]): ArrayBuffer[Node] = {
    val nodeBuffer = new ArrayBuffer[Node]()
    for (passengerType <- passengerTypes) yield {
        <PassengerTypeQuantity Code={passengerType.getCode.value()} Quantity={passengerType.getQuantity.toString}/>
    }.foreach(nodeBuffer += _)
    nodeBuffer
  }

  private def getPricedInformationRequestNode = {
    <PriceRequestInformation CurrencyCode={CURRENCY}>
      <TPA_Extensions>
        <PublicFare Ind="false"/>
        <PrivateFare Ind="false"/>
        <Priority>
          <Price Priority="1"/>
          <DirectFlights Priority="2"/>
          <Time Priority="3"/>
          <Vendor Priority="4"/>
        </Priority>
      </TPA_Extensions>
    </PriceRequestInformation>
  }

  private def getFlexibleFaresNode = {
    <FlexibleFares>
      <FareParameters>
        <PublicFare Ind="true"/>
      </FareParameters>
      <FareParameters>
        <PrivateFare Ind="true"/>
      </FareParameters>
    </FlexibleFares>
  }
}

case class BfmConfig(version: String, service: String, serviceType: String, action: String, description: String, requestType: String, segmentType: String, connectTimeMax: String)

//case class FareBrakeDownConfig(adultBaseFare: Double, adultTaxFare: Double, var adultTotalFare: Double, childBaseFare: Double, childTaxFare: Double, var childTotalTotal: Double, infantBaseFare: Double, infantTaxFare: Double, var infantTotalFare: Double) {
//  adultTotalFare = adultBaseFare.+(adultTaxFare)
//  childTotalTotal = childBaseFare.+(childTaxFare)
//  infantTotalFare = infantBaseFare.+(infantTaxFare)
//}

trait PricedItineraryWSResponses {

  def toPricingItineraryWSResponse(pricedItinerary: NodeSeq, flightSearchRequest: FlightSearchRequest) = {
    val airItineraryWSResponse = toAirItineraryWSResponse(pricedItinerary \ "AirItinerary")
    val pricingInfoWSResponse = toPricingInfoWSResponse(pricedItinerary \ "AirItineraryPricingInfo", flightSearchRequest)
    val ticketingInfoWSResponse = toTicketingInfoWSResponse(pricedItinerary \ "TicketingInfo")

    new PricedItineraryWSResponse(airItineraryWSResponse, pricingInfoWSResponse, ticketingInfoWSResponse, flightSearchRequest)
  }

  def toAirItineraryWSResponse(airItinerary: NodeSeq) = {
    val airItineraryWSResponse = new AirItineraryWSResponse
    val originDestinationOptionsNode = airItinerary \\ "OriginDestinationOption"
    originDestinationOptionsNode.foreach { originDestinationOption => {
      val originDestinationWSResponse = toOriginDestinationWSResponse(originDestinationOption)
      airItineraryWSResponse.getOriginDestinationWSResponses.add(originDestinationWSResponse)
    }
    }
    airItineraryWSResponse.setDirectionIndicator(airItinerary \@ "DirectionInd")
    airItineraryWSResponse
  }

  def toPricingInfoWSResponse(airItineraryPricingInfo: NodeSeq, flightSearchRequest: FlightSearchRequest) = {
    val pricingInfoWSResponse = new PricingInfoWSResponse
    val itineraryTotalFare = airItineraryPricingInfo \ "ItinTotalFare"
    val taxTotal = itineraryTotalFare \ "Taxes" \ "Tax"
    val totalFare = itineraryTotalFare \ "TotalFare"
    val ptcFareBreakdowns = airItineraryPricingInfo \\ "PTC_FareBreakdown"

    pricingInfoWSResponse.setPricingSource(airItineraryPricingInfo \@ "PricingSource")
    if ((itineraryTotalFare \ "EquivFare" \@ "Amount").nonEmpty) pricingInfoWSResponse.setBaseFare((itineraryTotalFare \ "EquivFare" \@ "Amount").toDouble)
    pricingInfoWSResponse.setTotalTax((taxTotal \@ "Amount").toDouble)
    pricingInfoWSResponse.setTotalFare((totalFare \@ "Amount").toDouble)
    pricingInfoWSResponse.setCurrencyCode(totalFare \@ "CurrencyCode")
    ptcFareBreakdowns.foreach { ptcFareBreakdown => {
        val fareBreakDown = toFareBreakDown(ptcFareBreakdown)
        pricingInfoWSResponse.getFareBreakDowns.add(fareBreakDown)
      }
    }
    var childBase: Double = 0
    var childTax: Double = 0
    var infantBase: Double = 0
    var infantTax: Double = 0
    var adultBase: Double = 0
    var adultTax: Double = 0
    for(fareBreakDown <- pricingInfoWSResponse.getFareBreakDowns) {
      var numberOfAdult: Int = 1
      if (fareBreakDown.getPassengerType.getCode == PassengerCode.ADULT) {
        numberOfAdult = fareBreakDown.getPassengerType.getQuantity
      }
      if (fareBreakDown.getPassengerType.getCode == PassengerCode.SABRE_CHILD) {
        childBase = fareBreakDown.getPassengerFare.getBaseFare / numberOfAdult * 70 / 100 * fareBreakDown.getPassengerType.getQuantity
        childTax = fareBreakDown.getPassengerFare.getTotalTax / numberOfAdult * 70 / 100 * fareBreakDown.getPassengerType.getQuantity
        pricingInfoWSResponse.setChildrenBaseFair(childBase)
        pricingInfoWSResponse.setChildrenTaxFair(childTax)
        pricingInfoWSResponse.setChildrenTotal(childBase + childTax)
      }
      if (fareBreakDown.getPassengerType.getCode == PassengerCode.INFANT) {
        infantBase = fareBreakDown.getPassengerFare.getBaseFare / numberOfAdult * 10 / 100 * fareBreakDown.getPassengerType.getQuantity
        infantTax = fareBreakDown.getPassengerFare.getTotalTax / numberOfAdult * 10 / 100 * fareBreakDown.getPassengerType.getQuantity
        pricingInfoWSResponse.setInfantBaseFair(infantBase)
        pricingInfoWSResponse.setInfantTaxFair(infantTax)
        pricingInfoWSResponse.setInfantTotal(infantBase + infantTax)
      }
      if (fareBreakDown.getPassengerType.getCode == PassengerCode.ADULT) {
        adultTax = fareBreakDown.getPassengerFare.getTotalTax - (childTax + infantTax)
        adultBase = fareBreakDown.getPassengerFare.getBaseFare - (childBase + infantBase)
        pricingInfoWSResponse.setAdultBaseFair(adultBase)
        pricingInfoWSResponse.setAdultTaxFair(adultTax)
        pricingInfoWSResponse.setAdultTotal(adultBase + adultTax)
      }
    }
    pricingInfoWSResponse
  }

  def toTicketingInfoWSResponse(ticketingInfo: NodeSeq) = {
    val ticketingInfoWSResponse = new TicketingInfoWSResponse
    val ticketType = ticketingInfo \@ "TicketType"
    ticketingInfoWSResponse.setTicketType(TicketType.fromValue(ticketType))

    ticketingInfoWSResponse
  }

  def toOriginDestinationWSResponse(originDestinationOption: NodeSeq) = {
    val originDestinationWSResponse = new OriginDestinationWSResponse
    val flightSegmentNodes = originDestinationOption \ "FlightSegment"
    flightSegmentNodes.foreach { flightSegment => {
      val flightSegmentWSResponse = toFlightSegmentWSResponse(flightSegment)
      originDestinationWSResponse.getFlightSegmentWSResponses.add(flightSegmentWSResponse)
    }
    }
    originDestinationWSResponse.setDuration(Duration.ofMinutes((originDestinationOption \@ "ElapsedTime").toLong).toString.substring(2))
    originDestinationWSResponse
  }

  def toFlightSegmentWSResponse(flightSegment: NodeSeq) = {
    val flightSegmentWSResponse = new FlightSegmentWSResponse()
    flightSegmentWSResponse.setAirEquipType(flightSegment \ "Equipment" \@ "AirEquipType")
    flightSegmentWSResponse.setArrivalAirportCode(flightSegment \ "ArrivalAirport" \@ "LocationCode")
    flightSegmentWSResponse.setArrivalDateTime(flightSegment \@ "ArrivalDateTime")
    flightSegmentWSResponse.setDepartureAirportCode(flightSegment \ "DepartureAirport" \@ "LocationCode")
    flightSegmentWSResponse.setDepartureDateTime(flightSegment \@ "DepartureDateTime")
    flightSegmentWSResponse.setDuration(Duration.ofMinutes((flightSegment \@ "ElapsedTime").toLong).toString.substring(2))
    flightSegmentWSResponse.setETicketEligible((flightSegment \\ "eTicket" \@ "Ind").toBoolean)
    flightSegmentWSResponse.setFlightNumber(flightSegment \@ "FlightNumber")
    flightSegmentWSResponse.setMarketingAirlineCode(flightSegment \ "MarketingAirline" \@ "Code")
    flightSegmentWSResponse.setMarriageGrp((flightSegment \ "MarriageGrp").text)
    flightSegmentWSResponse.setResBookDesigCode(flightSegment \@ "ResBookDesigCode")
    flightSegmentWSResponse.setStopQuantity(Integer.parseInt(flightSegment \@ "StopQuantity"))
    flightSegmentWSResponse
  }

  def toFareBreakDown(ptcFareBreakdown: NodeSeq) = {
    val fareBreakDown = new FareBreakDown
    fareBreakDown.setPassengerType(toPassengerType(ptcFareBreakdown \ "PassengerTypeQuantity"))
    fareBreakDown.setPassengerFare(toPassengerFare(ptcFareBreakdown \ "PassengerFare"))
    fareBreakDown
  }

  def toPassengerType(passengerTypeQuantity: NodeSeq) = {
    val passengerCode = passengerTypeQuantity \@ "Code"
    val quantity = passengerTypeQuantity \@ "Quantity"
    val passengerType = new PassengerType(PassengerCode.fromValue(passengerCode), quantity.toInt)
    passengerType
  }

  def toPassengerFare(passengerFareNode: NodeSeq) = {
    val passengerFare = new PassengerFare
    val totalTax = passengerFareNode \ "Taxes" \ "TotalTax"
    passengerFare.setBaseFare((passengerFareNode \ "EquivFare" \@ "Amount").toDouble)
    passengerFare.setTotalTax((totalTax \@ "Amount").toDouble)
    passengerFare.setTotalFare((passengerFareNode \ "TotalFare" \@ "Amount").toDouble)
    passengerFare
  }
}

trait LowFareSearchConfig {
  this: SabreXMLRequestUtils =>

  val bfmAd = BfmConfig.apply(config.getString("sabre.bfmAd.version").get, config.getString("sabre.bfmAd.service").get, SERVICE_TYPE, config.getString("sabre.bfmAd.action").get, config.getString("sabre.bfmAd.description").get, config.getString("sabre.bfmAd.requestType").get, config.getString("sabre.bfmAd.segmentType").get, config.getString("sabre.bfmAd.longConnectTime.max").get)
  val bfm = BfmConfig.apply(config.getString("sabre.bfm.version").get, config.getString("sabre.bfm.service").get, SERVICE_TYPE, config.getString("sabre.bfm.action").get, config.getString("sabre.bfm.description").get, config.getString("sabre.bfm.requestType").get, config.getString("sabre.bfm.segmentType").get, config.getString("sabre.bfm.longConnectTime.max").get)
  val bfmConfigOptions: Map[Boolean, BfmConfig] = Map(true -> bfmAd, false -> bfm)

}