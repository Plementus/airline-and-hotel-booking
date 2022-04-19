
package services.amadeus.airfliforq;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import java.lang.*;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap.client.airfliforq package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TripXML_QNAME = new QName("http://traveltalk.com/wsAirFlifo", "TripXML");
    private final static QName _String_QNAME = new QName("http://traveltalk.com/wsAirFlifo", "string");
    private final static QName _DepartureAirportRSComment_QNAME = new QName("http://traveltalk.com/wsAirFlifo", "Comment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap.client.airfliforq
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WmAirFlifoXml }
     * 
     */
    public WmAirFlifoXml createWmAirFlifoXml() {
        return new WmAirFlifoXml();
    }

    /**
     * Create an instance of {@link WmAirFlifoXmlResponse }
     * 
     */
    public WmAirFlifoXmlResponse createWmAirFlifoXmlResponse() {
        return new WmAirFlifoXmlResponse();
    }

    /**
     * Create an instance of {@link WmAirFlifoResponse }
     * 
     */
    public WmAirFlifoResponse createWmAirFlifoResponse() {
        return new WmAirFlifoResponse();
    }

    /**
     * Create an instance of {@link OTAAirFlifoRS }
     * 
     */
    public OTAAirFlifoRS createOTAAirFlifoRS() {
        return new OTAAirFlifoRS();
    }

    /**
     * Create an instance of {@link TripXML }
     * 
     */
    public TripXML createTripXML() {
        return new TripXML();
    }

    /**
     * Create an instance of {@link WmAirFlifo }
     * 
     */
    public WmAirFlifo createWmAirFlifo() {
        return new WmAirFlifo();
    }

    /**
     * Create an instance of {@link OTAAirFlifoRQ }
     * 
     */
    public OTAAirFlifoRQ createOTAAirFlifoRQ() {
        return new OTAAirFlifoRQ();
    }

    /**
     * Create an instance of {@link Warning }
     * 
     */
    public Warning createWarning() {
        return new Warning();
    }

    /**
     * Create an instance of {@link ArrivalAirport }
     * 
     */
    public ArrivalAirport createArrivalAirport() {
        return new ArrivalAirport();
    }

    /**
     * Create an instance of {@link Airline }
     * 
     */
    public Airline createAirline() {
        return new Airline();
    }

    /**
     * Create an instance of {@link TPAExtensions }
     * 
     */
    public TPAExtensions createTPAExtensions() {
        return new TPAExtensions();
    }

    /**
     * Create an instance of {@link DepartureAirportRS }
     * 
     */
    public DepartureAirportRS createDepartureAirportRS() {
        return new DepartureAirportRS();
    }

    /**
     * Create an instance of {@link ArrivalAirportRS }
     * 
     */
    public ArrivalAirportRS createArrivalAirportRS() {
        return new ArrivalAirportRS();
    }

    /**
     * Create an instance of {@link Source }
     * 
     */
    public Source createSource() {
        return new Source();
    }

    /**
     * Create an instance of {@link Success }
     * 
     */
    public Success createSuccess() {
        return new Success();
    }

    /**
     * Create an instance of {@link CompanyName }
     * 
     */
    public CompanyName createCompanyName() {
        return new CompanyName();
    }

    /**
     * Create an instance of {@link ArrivalDateTime }
     * 
     */
    public ArrivalDateTime createArrivalDateTime() {
        return new ArrivalDateTime();
    }

    /**
     * Create an instance of {@link FlightLegInfo }
     * 
     */
    public FlightLegInfo createFlightLegInfo() {
        return new FlightLegInfo();
    }

    /**
     * Create an instance of {@link OperatingAirline }
     * 
     */
    public OperatingAirline createOperatingAirline() {
        return new OperatingAirline();
    }

    /**
     * Create an instance of {@link DepartureAirport }
     * 
     */
    public DepartureAirport createDepartureAirport() {
        return new DepartureAirport();
    }

    /**
     * Create an instance of {@link Comment }
     * 
     */
    public Comment createComment() {
        return new Comment();
    }

    /**
     * Create an instance of {@link MarketingAirline }
     * 
     */
    public MarketingAirline createMarketingAirline() {
        return new MarketingAirline();
    }

    /**
     * Create an instance of {@link Position }
     * 
     */
    public Position createPosition() {
        return new Position();
    }

    /**
     * Create an instance of {@link ArrayOfError }
     * 
     */
    public ArrayOfError createArrayOfError() {
        return new ArrayOfError();
    }

    /**
     * Create an instance of {@link java.lang.Error }
     * 
     */
    public java.lang.Error createError() {
        return new java.lang.Error();
    }

    /**
     * Create an instance of {@link FlightInfoDetails }
     * 
     */
    public FlightInfoDetails createFlightInfoDetails() {
        return new FlightInfoDetails();
    }

    /**
     * Create an instance of {@link ReasonCode }
     * 
     */
    public ReasonCode createReasonCode() {
        return new ReasonCode();
    }

    /**
     * Create an instance of {@link OperationTime }
     * 
     */
    public OperationTime createOperationTime() {
        return new OperationTime();
    }

    /**
     * Create an instance of {@link RequestorID }
     * 
     */
    public RequestorID createRequestorID() {
        return new RequestorID();
    }

    /**
     * Create an instance of {@link Provider }
     * 
     */
    public Provider createProvider() {
        return new Provider();
    }

    /**
     * Create an instance of {@link ArrayOfOperationTime }
     * 
     */
    public ArrayOfOperationTime createArrayOfOperationTime() {
        return new ArrayOfOperationTime();
    }

    /**
     * Create an instance of {@link Equipment }
     * 
     */
    public Equipment createEquipment() {
        return new Equipment();
    }

    /**
     * Create an instance of {@link POS }
     * 
     */
    public POS createPOS() {
        return new POS();
    }

    /**
     * Create an instance of {@link BookingChannel }
     * 
     */
    public BookingChannel createBookingChannel() {
        return new BookingChannel();
    }

    /**
     * Create an instance of {@link DepartureDateTime }
     * 
     */
    public DepartureDateTime createDepartureDateTime() {
        return new DepartureDateTime();
    }

    /**
     * Create an instance of {@link ArrayOfWarning }
     * 
     */
    public ArrayOfWarning createArrayOfWarning() {
        return new ArrayOfWarning();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripXML }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsAirFlifo", name = "TripXML")
    public JAXBElement<TripXML> createTripXML(TripXML value) {
        return new JAXBElement<TripXML>(_TripXML_QNAME, TripXML.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsAirFlifo", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Comment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsAirFlifo", name = "Comment", scope = DepartureAirportRS.class)
    public JAXBElement<Comment> createDepartureAirportRSComment(Comment value) {
        return new JAXBElement<Comment>(_DepartureAirportRSComment_QNAME, Comment.class, DepartureAirportRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Comment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsAirFlifo", name = "Comment", scope = ArrivalAirportRS.class)
    public JAXBElement<Comment> createArrivalAirportRSComment(Comment value) {
        return new JAXBElement<Comment>(_DepartureAirportRSComment_QNAME, Comment.class, ArrivalAirportRS.class, value);
    }

}
