/**
 * Created by Ibrahim Olanrewaju on 4/5/2016.
 */

package services.utils.soap

import java.io.ByteArrayInputStream
import javax.xml.soap.{MessageFactory, SOAPConnectionFactory, SOAPMessage}

import core.gdsbookingengine.FlightSearchRequest
import core.gdsbookingengine.clients.amadeus.BasePOSBuilder
import play.api.Play
import play.api.Play.current

import scala.xml.Elem

object LowFareMatrixSoapUtils extends SoapUtils {
  val config = Play.application.configuration

  def getLowFareMatrixRSSoapMessage(flightRequest: FlightSearchRequest): SOAPMessage = {
    val xmlString = soapTemplate(lowFareMatrixSoapMessage(flightRequest))
    println(xmlString)
    soapRequest2(xmlString, config.getString("lowfarematrix.endpoint").get)
  }

  private def soapTemplate(body: Elem) = {
    s"""
        <soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema"
                   xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
        <soap:Body>
        <wmLowFareMatrixXml xmlns="http://traveltalk.com/wsLowFareMatrix">
        <xmlRequest>
        <![CDATA[
          ${body.toString()}
        ]]>
        </xmlRequest>
        </wmLowFareMatrixXml>
        </soap:Body>
      </soap:Envelope>""".stripMargin
  }

  def lowFareMatrixSoapMessage(flightRequest: FlightSearchRequest) = {
    val departure = flightRequest.getOriginDestinationRequests.get(0)
    val arrival = flightRequest.getOriginDestinationRequests.get(1)
    val passenger = flightRequest.getPassengerTypes.get(0)

    <OTA_AirLowFareSearchMatrixRQ>
      {posXML}
      <OriginDestinationInformation>
        <DepartureDateTime>{departure.getDepartureDateTime}</DepartureDateTime>
        <OriginLocation LocationCode={departure.getOrigin}/>
        <DestinationLocation LocationCode={departure.getDestination}/>
      </OriginDestinationInformation>
      <OriginDestinationInformation>
        <DepartureDateTime>{arrival.getDepartureDateTime}</DepartureDateTime>
        <OriginLocation LocationCode={arrival.getOrigin}/>
        <DestinationLocation LocationCode={arrival.getDestination}/>
      </OriginDestinationInformation>
      <TravelerInfoSummary>
        <SeatsRequested>{flightRequest.getSeatCount}</SeatsRequested>
        <AirTravelerAvail>
          <PassengerTypeQuantity Code={passenger.getCode.value()} Quantity={passenger.getQuantity.toString}/>
        </AirTravelerAvail>
        <PriceRequestInformation PricingSource="Both"/>
      </TravelerInfoSummary>
    </OTA_AirLowFareSearchMatrixRQ>
  }

  private def posXML = {
    <POS>
      <Source PseudoCityCode={BasePOSBuilder.PCC}>
        <RequestorID Type={BasePOSBuilder.REQUESTOR_TYPE} ID={BasePOSBuilder.USERNAME}/>
      </Source>
      <TPA_Extensions>
        <Provider>
          <Name>{BasePOSBuilder.NAME}</Name>
          <System>{BasePOSBuilder.SYSTEM}</System>
          <Userid>{BasePOSBuilder.USERNAME}</Userid>
          <Password>{BasePOSBuilder.PASSWORD}</Password>
        </Provider>
      </TPA_Extensions>
    </POS>
  }

  private def soapRequest2(soapMessage: String, endpointUrl: String): SOAPMessage = {
    try {
      val soapConnectionFactory = SOAPConnectionFactory.newInstance()
      val connection = soapConnectionFactory.createConnection()
      val inputStream = new ByteArrayInputStream(soapMessage.getBytes)
      val request: SOAPMessage = MessageFactory.newInstance.createMessage(null, inputStream)
      request.getMimeHeaders.setHeader("SOAPAction", config.getString("lowfarematrix.soapAction").get)
      val endpoint = new java.net.URL(endpointUrl)

      val soapResponse = connection.call(request, endpoint)
      connection.close()
      soapResponse
    } catch {case ex: Exception => throw new RuntimeException(ex)}
  }
}