/**
 * Created by Ibrahim Olanrewaju on 2/27/2016.
 */

package services.sabre.client

import java.io.{File, PrintWriter}
import java.util.{List => JList}

import core.gdsbookingengine.booking.{BookingRequest, PriceQuote}
import core.gdsbookingengine.{FlightSearchRequest, NoCombinableFaresException}
import play.api.Play
import play.api.Play.current
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.libs.Json
import service.sabre.utils._
import services.sabre.utils.{SabreXMLRequestUtils, UCSegStatusNotAllowedException}
import services.utils.soap.SoapUtils

import scala.collection.mutable.ArrayBuffer
import scala.concurrent.Future
import scala.xml.{Node, PrettyPrinter}

object SabreSoapService extends SoapUtils with SabreXMLLogger with SabreServiceResponseParser {
  val endpoint = SabreXMLRequestUtils.ENDPOINT_URL

  def flight(flightRequest: FlightSearchRequest) = {
    val request = BfmSOAPUtil.bfmXmlRequest(session, flightRequest)
    val response = callService(request)
    val pricedItineraries = (response \\ "PricedItinerary").map {pricedItinerary =>
      BfmSOAPUtil.toPricingItineraryWSResponse(pricedItinerary, flightRequest)
    }.toList

    Future{logXml(request, BFM_RQ_LOGFILE); logXml(response, BFM_RS_LOGFILE)}
    BfmFlightSearchResponse(pricedItineraries)
  }

  def enhancedAirBook(binaryToken: String, flightAvailabilityRequest: FlightAvailabilityRequest) = {
    val response = callService(EnhancedAirBookSOAPUtil.enhancedAirBook(binaryToken, flightAvailabilityRequest))
    Future{logXml(response, ENHANCED_AIRBOOK_RS_LOGFILE)}
    EnhancedAirBookSOAPUtil.toBookingResponse(parseEnhancedAirBookRS(response))
  }

  def passengerDetails(binaryToken: String, bookingRequest: BookingRequest, priceQuotes: JList[PriceQuote]) = {
    val response = callService(PassengerDetailsSOAPUtil.passengerDetailsRequest(binaryToken, bookingRequest, priceQuotes))
    Future{logXml(response, PASSENGER_RS_LOGFILE)}
    PassengerDetailsSOAPUtil.toPNRDetails(parsePassengerDetailsRS(response) \ "ItineraryRef")
  }

  def session = {
    val response = callService(SabreXMLRequestUtils.sessionCreateXmlRequest)
    Future{logXml(response, SESSION_RS_LOGFILE)}
    (response \\ "BinarySecurityToken").text
  }

  private def callService(request: Node): Node = {
    toNode(soapRequest(request.toString(), endpoint))
  }
}

trait SabreXMLLogger {
  val prettyPrinter = new PrettyPrinter(80, 2)
  val absolutePath = Play.application.path.getAbsolutePath
  val SESSION_RS_LOGFILE = "session_response.xml"
  val BFM_RQ_LOGFILE = "flight_request.xml"
  val BFM_RS_LOGFILE = "flight_response.xml"
  val ENHANCED_AIRBOOK_RS_LOGFILE = "enhanced_response.xml"
  val PASSENGER_RS_LOGFILE = "passengerdetails_rs.xml"

  def logXml(content: Node, fileName: String) = {
    new PrintWriter(s"$absolutePath${File.separator}tmp${File.separator}sabre_log${File.separator}$fileName")
    { write(prettyPrinter.format(content)); close() }
  }
}

trait SabreServiceResponseParser {
  def parseEnhancedAirBookRS(response: Node) = {
    val exceptions = Map("NO COMBINABLE FARES" -> new NoCombinableFaresException, "UC SEG STATUS NOT ALLOWED" -> new UCSegStatusNotAllowedException)
    val enhancedAirBookNode = response \\ "EnhancedAirBookRS"
    if ((enhancedAirBookNode \ "OTA_AirPriceRS").isEmpty) {
      val message = enhancedAirBookNode \ "Application" \ "Error" \\ "Message"
      val optionalKey = exceptions.keys.find(key => message.head.text.toLowerCase.contains(key.toLowerCase))
      optionalKey match {
        case Some(key) => throw exceptions.get(key).get
        case None => throw new RuntimeException("booking error")
      }
    }
    val enhancedAirBookNodeSeq = ArrayBuffer(enhancedAirBookNode \ "OTA_AirBookRS", enhancedAirBookNode \ "OTA_AirPriceRS", enhancedAirBookNode \ "TravelItineraryReadRS")
    <EnhancedAirBookRS>{enhancedAirBookNodeSeq}</EnhancedAirBookRS>
  }

  def parsePassengerDetailsRS(response: Node) = {
    val passengerDetailsRSNode = response \\ "PassengerDetailsRS"
    val passengerDetailsRSNodeSeq = ArrayBuffer(passengerDetailsRSNode \ "ItineraryRef", passengerDetailsRSNode \ "TravelItineraryReadRS")
    <PassengerDetailsRS>{passengerDetailsRSNodeSeq}</PassengerDetailsRS>
  }
}