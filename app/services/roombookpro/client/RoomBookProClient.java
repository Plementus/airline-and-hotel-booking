/**
 * 1/27/2016.
 */
package services.roombookpro.client;

import core.hotels.HotelAvailableRoomsRequestInterface;
import core.hotels.HotelAvailableRoomsResponseInterface;
import core.hotels.HotelDataPresentationInterface;
import core.hotels.HotelRoomBookingResponse;
import org.w3c.dom.Node;
import play.Play;
import play.libs.F.Promise;
import play.Configuration;
import services.roombookpro.messages.DetailsRequest;
import services.roombookpro.messages.*;
import services.roombookpro.utils.DocumentUtils;
import services.roombookpro.utils.RoomBookProXMLRequests;

import javax.xml.soap.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.List;

public class RoomBookProClient {

  public static Promise<List<HotelDataPresentationInterface>> roomBookHotelSearch(HotelSearchRequest request) {
   return Promise.pure(DocumentUtils.hotelSearchResponses(soapRequest(RoomBookProXMLRequests.searchSoapMessage(request))));
  }

  public static Promise<HotelAvailableRoomsResponseInterface> roomBookRoomsSearch(HotelAvailableRoomsRequestInterface request) {
    return Promise.pure(DocumentUtils.roomsSearchResponse(soapRequest(RoomBookProXMLRequests.roomsSoapMessage(request))));
  }

  public static Promise<CancellationPolicyResponse> roomBookCancellationPolicy(CancellationPolicyRequest request) {
    return Promise.pure(DocumentUtils.cancellationPolicyResponse(soapRequest(RoomBookProXMLRequests.cancellationPolicySoapMessage(request))));
  }

  public static Promise<HotelRoomBookingResponse> roomBookBooking(BookingRequest request) {
    return Promise.pure(DocumentUtils.bookingResponse(soapRequest(RoomBookProXMLRequests.bookingSoapMessage(request))));
  }

  public static Promise<CancellationResponse> cancelBooking(CancellationRequest request) {
    return Promise.pure(DocumentUtils.cancelBookingResponse(soapRequest(RoomBookProXMLRequests.cancelBookingSoapMessage(request))));
  }

  public static Promise<DetailsResponse> bookingDetails(DetailsRequest request) {
    return Promise.pure(DocumentUtils.detailsResponse(soapRequest(RoomBookProXMLRequests.bookingDetailsSoapMessage(request))));
  }

  public static Promise<CitiesResponse> getCities(CitiesRequest city) {
    return Promise.pure(DocumentUtils.citiesResponse(soapRequest(RoomBookProXMLRequests.citiesSoapMessage(city))));
  }

  private static String docToString(Node document) {
    String response;
    DOMSource domSource = new DOMSource(document);
    StringWriter writer = new StringWriter();
    StreamResult result = new StreamResult(writer);
    TransformerFactory tf = TransformerFactory.newInstance();
    try {
      Transformer transformer = tf.newTransformer();
      transformer.transform(domSource, result);
      response = writer.toString();
    } catch(TransformerException exception) {
      response = "TransformerException occurred!.";
    }
    return response;
  }

  private static Node soapRequest(String soapMessage) {
    Node response;
    try {
      SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
      SOAPConnection connection = soapConnectionFactory.createConnection();
      Configuration config = Play.application().configuration();
      java.net.URL endpoint = new java.net.URL(config.getString("roombookpro.endpoint"));
      SOAPMessage request;
      InputStream is = new ByteArrayInputStream(soapMessage.getBytes());
      request = MessageFactory.newInstance().createMessage(null, is);
      SOAPMessage soapResponse = connection.call(request, endpoint);
      connection.close();
      response = soapResponse.getSOAPBody();

    } catch(Exception ex) {throw new RuntimeException(ex);}
    return response;
  }
}