/**
 * Created by Babatunde on 2/11/2016.
 */
package services.roombookpro.utils

import core.hotels.HotelAvailableRoomsRequestInterface

import scala.xml.{Elem, XML}

import services.roombookpro.messages._
import java.util.{ArrayList => JavaArrayList}

object RoomBookProXMLRequests {

  def searchSoapMessage(searchRequest: HotelSearchRequest) = {
    val hotelSearch = {
      <zend:search>
        {securityInfoXml}
        <currency>{searchRequest.getCurrency}</currency>
        <city>{searchRequest.getCity}</city>
        <checkInDate>{searchRequest.getCheckIn}</checkInDate>
        <checkOutDate>{searchRequest.getCheckOut}</checkOutDate>
        <rooms>
          <room1>
            <adults>{searchRequest.getAdultCount}</adults>
            {childAgesElem(searchRequest.getChildAges).map {node => node}}
          </room1>
        </rooms>
        <rating>{searchRequest.getRating}</rating>
        <availableOnly>{searchRequest.getAvailableOnly}</availableOnly>
        <nationality>{searchRequest.getNationality}</nationality>
        <payType>{searchRequest.getPayType.value()}</payType>
        <agentMarkup>{searchRequest.getAgentMarkUp}</agentMarkup>
      </zend:search>
    }
    soapMessageTemplate(hotelSearch).toString()
  }

  def roomsSoapMessage(roomsRequest: HotelAvailableRoomsRequestInterface) = {
    val roomsSearch = {
      <zend:rooms>
        {securityInfoXml}
        <search>{roomsRequest.getSearchID.toString}</search>
        <hotel>{roomsRequest.getHotelID.toString}</hotel>
      </zend:rooms>
    }
    soapMessageTemplate(roomsSearch).toString()
  }

  def bookingSoapMessage(bookingRequest: BookingRequest): String = {
    val roomBookingInfo = bookingRequest.getRooms.get(0)
    val leadPax = roomBookingInfo.getGuest
    val bookingXml =  {
            <zend:book>
              {securityInfoXml}
              <search>{bookingRequest.getSearchID.toString}</search>
              <hotel>{bookingRequest.getHotelID.toString}</hotel>
              <rooms>
                <room1>
                  <id>{roomBookingInfo.getRoomID.toString}</id>
                  <title>{leadPax.getTitle}</title>
                  <firstName>{leadPax.getFirstName}</firstName>
                  <lastName>{leadPax.getLastName}</lastName>
                  <dob>{leadPax.getDob}</dob>
                  <email>{leadPax.getEmail}</email>
                  <phone>{leadPax.getPhone}</phone>
                  <address>{leadPax.getAddress}</address>
                  <zip>{leadPax.getZipCode}</zip>
                  <city>{leadPax.getCity}</city>
                </room1>
              </rooms>
              <paymentType>{bookingRequest.getPaymentType.value()}</paymentType>
            </zend:book>
    }
    soapMessageTemplate(bookingXml).toString()
  }

  def cancellationPolicySoapMessage(cancellation: CancellationPolicyRequest): String = {
    val cancellationPolicy = {
          <zend:roomCancellationPolicies>
            {securityInfoXml}
            <search>{cancellation.getSearchID}</search>
            <hotel>{cancellation.getHotelID}</hotel>
            <room>{cancellation.getRoomID}</room>
          </zend:roomCancellationPolicies>
    }
    soapMessageTemplate(cancellationPolicy).toString()
  }

  def cancelBookingSoapMessage(cancellationRequest: CancellationRequest) = {
    val cancelBookingXml = {
      <zend:cancel>
        {securityInfoXml}
        <reference>{cancellationRequest.getRef}</reference>
       </zend:cancel>
    }
    soapMessageTemplate(cancelBookingXml).toString()
  }

  def bookingDetailsSoapMessage(detailsRequest: DetailsRequest) = {
    val bookingDetailsXml = {
      <zend:details>
        {securityInfoXml}
        <reference>{detailsRequest.getBookingRef}</reference>
      </zend:details>
    }
    soapMessageTemplate(bookingDetailsXml).toString()
  }

  lazy val countriesSoapMessage = {
    soapMessageTemplate(
      <zend:getCountries>
        {securityInfoXml}
      </zend:getCountries>
    ).toString()
  }

  def statesSoapMessage(countryCode: String) = {
    soapMessageTemplate(
      <zend:getStates>
        {securityInfoXml}
        <country>{countryCode}</country>
      </zend:getStates>
    ).toString()
  }

  def citiesSoapMessage(city: CitiesRequest) = {
    soapMessageTemplate(
      <zend:getCities>
        {securityInfoXml}
        <country>{city.getCountry}</country>
      </zend:getCities>
    ).toString()
  }

  private def soapMessageTemplate(xml: Elem) = {
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                      xmlns:zend="http://framework.zend.com">
      <soapenv:Header />
      <soapenv:Body>
        {xml}
      </soapenv:Body>
    </soapenv:Envelope>
  }

  lazy val securityInfoXml = {
    import play.Play
    val config = Play.application().configuration()
    <securityInfo>
      <userName>{config.getString("roombookpro.securityinfo.username")}</userName>
      <password>{config.getString("roombookpro.securityinfo.password")}</password>
      <agentCode>{config.getString("roombookpro.securityinfo.agentcode")}</agentCode>
      <lang>{config.getString("roombookpro.lang")}</lang>
    </securityInfo>
  }

  private def childAgesElem(childAges: JavaArrayList[Integer]) = {
    for(i <- 0 until childAges.size()) yield {
      XML.loadString(s"<childAge${i+1}>${childAges.get(i)}</childAge${i+1}>")
    }
  }
}
