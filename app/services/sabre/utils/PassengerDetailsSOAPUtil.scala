/**
 * Created by Ibrahim Olanrewaju on 4/22/2016.
 */

package service.sabre.utils

import java.util.{List => JList}

import core.gdsbookingengine.{PNRDetails, PassengerCode, PassengerType}
import core.gdsbookingengine.booking.{BookingRequest, Passenger, PriceQuote}
import services.sabre.utils.SabreXMLRequestUtils

import scala.collection.JavaConversions._
import scala.xml.NodeSeq

object PassengerDetailsSOAPUtil extends SabreXMLRequestUtils {
  val SERVICE = config.getString("sabre.passengerDetails.service").get
  val ACTION = config.getString("sabre.passengerDetails.action").get
  val DESCRIPTION = config.getString("sabre.passengerDetails.description").get
  val TICKET_TYPE = config.getString("sabre.passengerDetails.ticketType").get
  val ADDRESS_LINE = config.getString("sabre.agency.addressLine").get
  val CITY_NAME = config.getString("sabre.agency.city").get
  val COUNTRY_CODE = config.getString("sabre.agency.countryCode").get
  val POSTAL_CODE = config.getString("sabre.agency.postalCode").get
  val STATE_CODE = config.getString("sabre.agency.stateCode").get
  val STREET_NUMBER = config.getString("sabre.agency.streetNumber").get
  val defaultNameNumber = 1.1

  def passengerDetailsRequest(binarySecurityToken: String, bookingRequest: BookingRequest, priceQuotes: JList[PriceQuote]) = {
    val passengers: JList[Passenger] = bookingRequest.getPassengers
    val passengerDetailsRQ = {
      <PassengerDetailsRQ version="3.2.0" xmlns="http://services.sabre.com/sp/pd/v3_2" IgnoreOnError="true" HaltOnError="true">
        {getPostProcessingNode}
        <PriceQuoteInfo>
          {getPriceQuoteInfoLinkNodes(priceQuotes,passengers)}
        </PriceQuoteInfo>
        <TravelItineraryAddInfoRQ>
          {getAgencyInfo}
          <CustomerInfo>
            <ContactNumbers>
              {toContactNumberNodes(passengers)}
            </ContactNumbers>
            {getPersonNameNodesWithEmailNodes(passengers)}
          </CustomerInfo>
        </TravelItineraryAddInfoRQ>
      </PassengerDetailsRQ>
    }
    soapTemplateWithToken(binarySecurityToken, SERVICE, ACTION, DESCRIPTION, passengerDetailsRQ)
  }

  private def toContactNumberNodes(passengers: JList[Passenger]) = {
    for {
      index <- passengers.indices
      telephones = passengers(index).getTelephones.toList
      nameNumber = defaultNameNumber + index
      if telephones.nonEmpty
      telephone <- telephones
    } yield { <ContactNumber LocationCode={telephone.getLocationCode} NameNumber={nameNumber.toString} Phone={telephone.getPhoneNumber} PhoneUseType={telephone.getPhoneUseType.value()}/> }
  }

  private def getPersonNameNodesWithEmailNodes(passengers: JList[Passenger]) = {
    toEmailNodes(passengers) ++ toPersonNameNodes(passengers)
  }

  private def toEmailNodes(passengers: JList[Passenger]) = {
    val emailsWithNameNumber = for {
     index <- passengers.indices
     emails = passengers(index).getEmails.toList
     nameNumber = defaultNameNumber + index
     if emails.nonEmpty
    } yield {nameNumber -> emails}

    emailsWithNameNumber.toSeq.flatMap {
      case (nameNumber, emails) => emails.map {email => <Email Address={email} NameNumber={nameNumber.toString}/>}
    }
  }

  private def toPersonNameNodes(passengers: JList[Passenger]) = {
    val personNameNodes = for {
      index <- passengers.indices
      passenger = passengers(index)
      nameNumber = defaultNameNumber + index
    } yield {
      <PersonName NameNumber={nameNumber.toString} Infant={if (passenger.getCode == PassengerCode.INFANT) "true" else "false"} PassengerType={passenger.getCode.value()}>
        <GivenName>{s"${passenger.getGivenName} ${if (passenger.getCode != PassengerCode.INFANT) passenger.getNamePrefix}"}</GivenName>
        <Surname>{passenger.getSurname}</Surname>
      </PersonName>
    }
    personNameNodes.toList
  }

  private def getPostProcessingNode = {
    <PostProcessing RedisplayReservation="true">
      <ARUNK_RQ/>
      <EndTransactionRQ>
        <EndTransaction Ind="true"/>
        <Source ReceivedFrom={AGENCY_NAME}/>
      </EndTransactionRQ>
    </PostProcessing>
  }

  private def getPriceQuoteInfoLinkNodes(priceQuotes: JList[PriceQuote], passengers: JList[Passenger]) = {
    for {
      index <- passengers.indices
      passenger = passengers(index)
      nameNumber = defaultNameNumber + index
      priceQuote <- priceQuotes
      if priceQuote.getPassengerType.getCode.equals(passenger.getCode)
    } yield {<Link NameNumber={nameNumber.toString} Record={priceQuote.getRPH}/>}
  }

  private def getAgencyInfo = {
    <AgencyInfo>
      <Address>
        <AddressLine>{ADDRESS_LINE}</AddressLine>
        <CityName>{CITY_NAME}</CityName>
        <CountryCode>{COUNTRY_CODE}</CountryCode>
        <PostalCode>{POSTAL_CODE}</PostalCode>
        <StateCountyProv StateCode={STATE_CODE}/>
        <StreetNmbr>{STREET_NUMBER}</StreetNmbr>
      </Address>
    <Ticketing PseudoCityCode={SABRE_PCC} QueueNumber="75" ShortText="PNR Generated From SabreWA Server" TicketType={TICKET_TYPE}/>
    </AgencyInfo>
  }

  def getPriceQuotes = {
    val firstPriceQuote = new PriceQuote
    val secondPriceQuote = new PriceQuote

    firstPriceQuote.setPassengerType(new PassengerType(PassengerCode.ADULT, 2))
    firstPriceQuote.setRPH("1")

    secondPriceQuote.setPassengerType(new PassengerType(PassengerCode.SABRE_CHILD, 1))
    secondPriceQuote.setRPH("2")
    List(firstPriceQuote, secondPriceQuote)
  }

  def toPNRDetails(itineraryRef: NodeSeq) = {
    new PNRDetails(itineraryRef \@ "ID")
  }
}