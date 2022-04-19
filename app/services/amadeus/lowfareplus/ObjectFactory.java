
package services.amadeus.lowfareplus;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import java.lang.*;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap.client.lowfareplus package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and core representing the binding of schema
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TripXML_QNAME = new QName("http://traveltalk.com/wsLowFarePlus", "TripXML");
    private final static QName _String_QNAME = new QName("http://traveltalk.com/wsLowFarePlus", "string");
    private final static QName _VendorPrefAClasses_QNAME = new QName("http://traveltalk.com/wsLowFarePlus", "AClasses");
    private final static QName _TPAExtensionsRSText_QNAME = new QName("http://traveltalk.com/wsLowFarePlus", "Text");
    private final static QName _TPAExtensionsRSJourneyTotalDuration_QNAME = new QName("http://traveltalk.com/wsLowFarePlus", "JourneyTotalDuration");
    private final static QName _TPAExtensionsRSFlightContext_QNAME = new QName("http://traveltalk.com/wsLowFarePlus", "FlightContext");
    private final static QName _TPAExtensionsRSStopInfo_QNAME = new QName("http://traveltalk.com/wsLowFarePlus", "StopInfo");
    private final static QName _TPAExtensionsRSJourneyDuration_QNAME = new QName("http://traveltalk.com/wsLowFarePlus", "JourneyDuration");
    private final static QName _TPAExtensionsRSCabinType_QNAME = new QName("http://traveltalk.com/wsLowFarePlus", "CabinType");
    private final static QName _TPAExtensionsRSPricedCode_QNAME = new QName("http://traveltalk.com/wsLowFarePlus", "PricedCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived core for package: soap.client.lowfareplus
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WmLowFarePlus }
     * 
     */
    public WmLowFarePlus createWmLowFarePlus() {
        return new WmLowFarePlus();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchPlusRQ }
     * 
     */
    public OTAAirLowFareSearchPlusRQ createOTAAirLowFareSearchPlusRQ() {
        return new OTAAirLowFareSearchPlusRQ();
    }

    /**
     * Create an instance of {@link WmLowFarePlusXml }
     * 
     */
    public WmLowFarePlusXml createWmLowFarePlusXml() {
        return new WmLowFarePlusXml();
    }

    /**
     * Create an instance of {@link WmLowFarePlusXmlResponse }
     * 
     */
    public WmLowFarePlusXmlResponse createWmLowFarePlusXmlResponse() {
        return new WmLowFarePlusXmlResponse();
    }

    /**
     * Create an instance of {@link TripXML }
     * 
     */
    public TripXML createTripXML() {
        return new TripXML();
    }

    /**
     * Create an instance of {@link WmLowFarePlusResponse }
     * 
     */
    public WmLowFarePlusResponse createWmLowFarePlusResponse() {
        return new WmLowFarePlusResponse();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchPlusRS }
     * 
     */
    public OTAAirLowFareSearchPlusRS createOTAAirLowFareSearchPlusRS() {
        return new OTAAirLowFareSearchPlusRS();
    }

    /**
     * Create an instance of {@link FlightTypePref }
     * 
     */
    public FlightTypePref createFlightTypePref() {
        return new FlightTypePref();
    }

    /**
     * Create an instance of {@link ChargesRules }
     * 
     */
    public ChargesRules createChargesRules() {
        return new ChargesRules();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Airline }
     * 
     */
    public Airline createAirline() {
        return new Airline();
    }

    /**
     * Create an instance of {@link PTCFareBreakdown }
     * 
     */
    public PTCFareBreakdown createPTCFareBreakdown() {
        return new PTCFareBreakdown();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link Success }
     * 
     */
    public Success createSuccess() {
        return new Success();
    }

    /**
     * Create an instance of {@link AirItinerary }
     * 
     */
    public AirItinerary createAirItinerary() {
        return new AirItinerary();
    }

    /**
     * Create an instance of {@link NegotiatedFareCode }
     * 
     */
    public NegotiatedFareCode createNegotiatedFareCode() {
        return new NegotiatedFareCode();
    }

    /**
     * Create an instance of {@link FareInfo }
     * 
     */
    public FareInfo createFareInfo() {
        return new FareInfo();
    }

    /**
     * Create an instance of {@link ArrivalDateTime }
     * 
     */
    public ArrivalDateTime createArrivalDateTime() {
        return new ArrivalDateTime();
    }

    /**
     * Create an instance of {@link AdvReservationRS }
     * 
     */
    public AdvReservationRS createAdvReservationRS() {
        return new AdvReservationRS();
    }

    /**
     * Create an instance of {@link VoluntaryChangesRS }
     * 
     */
    public VoluntaryChangesRS createVoluntaryChangesRS() {
        return new VoluntaryChangesRS();
    }

    /**
     * Create an instance of {@link MinimumStayRS }
     * 
     */
    public MinimumStayRS createMinimumStayRS() {
        return new MinimumStayRS();
    }

    /**
     * Create an instance of {@link DestinationLocation }
     * 
     */
    public DestinationLocation createDestinationLocation() {
        return new DestinationLocation();
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
     * Create an instance of {@link MaximumStayRS }
     * 
     */
    public MaximumStayRS createMaximumStayRS() {
        return new MaximumStayRS();
    }

    /**
     * Create an instance of {@link ArrayOfPTCFareBreakdown }
     * 
     */
    public ArrayOfPTCFareBreakdown createArrayOfPTCFareBreakdown() {
        return new ArrayOfPTCFareBreakdown();
    }

    /**
     * Create an instance of {@link AirTravelerType }
     * 
     */
    public AirTravelerType createAirTravelerType() {
        return new AirTravelerType();
    }

    /**
     * Create an instance of {@link RequestorID }
     * 
     */
    public RequestorID createRequestorID() {
        return new RequestorID();
    }

    /**
     * Create an instance of {@link VoluntaryChanges }
     * 
     */
    public VoluntaryChanges createVoluntaryChanges() {
        return new VoluntaryChanges();
    }

    /**
     * Create an instance of {@link CabinPref }
     * 
     */
    public CabinPref createCabinPref() {
        return new CabinPref();
    }

    /**
     * Create an instance of {@link POS }
     * 
     */
    public POS createPOS() {
        return new POS();
    }

    /**
     * Create an instance of {@link TicketAdvisory }
     * 
     */
    public TicketAdvisory createTicketAdvisory() {
        return new TicketAdvisory();
    }

    /**
     * Create an instance of {@link ArrayOfFareInfo }
     * 
     */
    public ArrayOfFareInfo createArrayOfFareInfo() {
        return new ArrayOfFareInfo();
    }

    /**
     * Create an instance of {@link ArrayOfTax }
     * 
     */
    public ArrayOfTax createArrayOfTax() {
        return new ArrayOfTax();
    }

    /**
     * Create an instance of {@link OriginLocation }
     * 
     */
    public OriginLocation createOriginLocation() {
        return new OriginLocation();
    }

    /**
     * Create an instance of {@link ArrayOfConnectionLocation }
     * 
     */
    public ArrayOfConnectionLocation createArrayOfConnectionLocation() {
        return new ArrayOfConnectionLocation();
    }

    /**
     * Create an instance of {@link Warning }
     * 
     */
    public Warning createWarning() {
        return new Warning();
    }

    /**
     * Create an instance of {@link CountryName }
     * 
     */
    public CountryName createCountryName() {
        return new CountryName();
    }

    /**
     * Create an instance of {@link StayRestrictions }
     * 
     */
    public StayRestrictions createStayRestrictions() {
        return new StayRestrictions();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfo }
     * 
     */
    public AirItineraryPricingInfo createAirItineraryPricingInfo() {
        return new AirItineraryPricingInfo();
    }

    /**
     * Create an instance of {@link TPAExtensionsRS }
     * 
     */
    public TPAExtensionsRS createTPAExtensionsRS() {
        return new TPAExtensionsRS();
    }

    /**
     * Create an instance of {@link AirTravelerAvail }
     * 
     */
    public AirTravelerAvail createAirTravelerAvail() {
        return new AirTravelerAvail();
    }

    /**
     * Create an instance of {@link FlightSegment }
     * 
     */
    public FlightSegment createFlightSegment() {
        return new FlightSegment();
    }

    /**
     * Create an instance of {@link ProfileRef }
     * 
     */
    public ProfileRef createProfileRef() {
        return new ProfileRef();
    }

    /**
     * Create an instance of {@link ArrayOfPricedItinerary }
     * 
     */
    public ArrayOfPricedItinerary createArrayOfPricedItinerary() {
        return new ArrayOfPricedItinerary();
    }

    /**
     * Create an instance of {@link SpecificFlightInfo }
     * 
     */
    public SpecificFlightInfo createSpecificFlightInfo() {
        return new SpecificFlightInfo();
    }

    /**
     * Create an instance of {@link OriginDestinationInformation }
     * 
     */
    public OriginDestinationInformation createOriginDestinationInformation() {
        return new OriginDestinationInformation();
    }

    /**
     * Create an instance of {@link CabinType }
     * 
     */
    public CabinType createCabinType() {
        return new CabinType();
    }

    /**
     * Create an instance of {@link StateProv }
     * 
     */
    public StateProv createStateProv() {
        return new StateProv();
    }

    /**
     * Create an instance of {@link AdvTicketingRS }
     * 
     */
    public AdvTicketingRS createAdvTicketingRS() {
        return new AdvTicketingRS();
    }

    /**
     * Create an instance of {@link Fee }
     * 
     */
    public Fee createFee() {
        return new Fee();
    }

    /**
     * Create an instance of {@link TotalFare }
     * 
     */
    public TotalFare createTotalFare() {
        return new TotalFare();
    }

    /**
     * Create an instance of {@link PassengerTypeQuantityRS }
     * 
     */
    public PassengerTypeQuantityRS createPassengerTypeQuantityRS() {
        return new PassengerTypeQuantityRS();
    }

    /**
     * Create an instance of {@link BookingChannel }
     * 
     */
    public BookingChannel createBookingChannel() {
        return new BookingChannel();
    }

    /**
     * Create an instance of {@link AdvTicketing }
     * 
     */
    public AdvTicketing createAdvTicketing() {
        return new AdvTicketing();
    }

    /**
     * Create an instance of {@link ConnectionLocation }
     * 
     */
    public ConnectionLocation createConnectionLocation() {
        return new ConnectionLocation();
    }

    /**
     * Create an instance of {@link UniqueID }
     * 
     */
    public UniqueID createUniqueID() {
        return new UniqueID();
    }

    /**
     * Create an instance of {@link Email }
     * 
     */
    public Email createEmail() {
        return new Email();
    }

    /**
     * Create an instance of {@link AdvResTicketingRS }
     * 
     */
    public AdvResTicketingRS createAdvResTicketingRS() {
        return new AdvResTicketingRS();
    }

    /**
     * Create an instance of {@link BaseFare }
     * 
     */
    public BaseFare createBaseFare() {
        return new BaseFare();
    }

    /**
     * Create an instance of {@link Tax }
     * 
     */
    public Tax createTax() {
        return new Tax();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link CompanyName }
     * 
     */
    public CompanyName createCompanyName() {
        return new CompanyName();
    }

    /**
     * Create an instance of {@link VendorPref }
     * 
     */
    public VendorPref createVendorPref() {
        return new VendorPref();
    }

    /**
     * Create an instance of {@link MaximumStay }
     * 
     */
    public MaximumStay createMaximumStay() {
        return new MaximumStay();
    }

    /**
     * Create an instance of {@link ArrayOfFlightSegmentRPH }
     * 
     */
    public ArrayOfFlightSegmentRPH createArrayOfFlightSegmentRPH() {
        return new ArrayOfFlightSegmentRPH();
    }

    /**
     * Create an instance of {@link FlightSegmentRPH }
     * 
     */
    public FlightSegmentRPH createFlightSegmentRPH() {
        return new FlightSegmentRPH();
    }

    /**
     * Create an instance of {@link CustLoyalty }
     * 
     */
    public CustLoyalty createCustLoyalty() {
        return new CustLoyalty();
    }

    /**
     * Create an instance of {@link TravelerInfoSummary }
     * 
     */
    public TravelerInfoSummary createTravelerInfoSummary() {
        return new TravelerInfoSummary();
    }

    /**
     * Create an instance of {@link FareRestrictPref }
     * 
     */
    public FareRestrictPref createFareRestrictPref() {
        return new FareRestrictPref();
    }

    /**
     * Create an instance of {@link AdvReservation }
     * 
     */
    public AdvReservation createAdvReservation() {
        return new AdvReservation();
    }

    /**
     * Create an instance of {@link OriginDestinationOption }
     * 
     */
    public OriginDestinationOption createOriginDestinationOption() {
        return new OriginDestinationOption();
    }

    /**
     * Create an instance of {@link LengthOfStayRules }
     * 
     */
    public LengthOfStayRules createLengthOfStayRules() {
        return new LengthOfStayRules();
    }

    /**
     * Create an instance of {@link TicketDistribPref }
     * 
     */
    public TicketDistribPref createTicketDistribPref() {
        return new TicketDistribPref();
    }

    /**
     * Create an instance of {@link BookingClassPref }
     * 
     */
    public BookingClassPref createBookingClassPref() {
        return new BookingClassPref();
    }

    /**
     * Create an instance of {@link PassengerTypeQuantity }
     * 
     */
    public PassengerTypeQuantity createPassengerTypeQuantity() {
        return new PassengerTypeQuantity();
    }

    /**
     * Create an instance of {@link EquivFare }
     * 
     */
    public EquivFare createEquivFare() {
        return new EquivFare();
    }

    /**
     * Create an instance of {@link PriceRequestInformation }
     * 
     */
    public PriceRequestInformation createPriceRequestInformation() {
        return new PriceRequestInformation();
    }

    /**
     * Create an instance of {@link ArrayOfWarning }
     * 
     */
    public ArrayOfWarning createArrayOfWarning() {
        return new ArrayOfWarning();
    }

    /**
     * Create an instance of {@link RuleInfo }
     * 
     */
    public RuleInfo createRuleInfo() {
        return new RuleInfo();
    }

    /**
     * Create an instance of {@link PenaltyRS }
     * 
     */
    public PenaltyRS createPenaltyRS() {
        return new PenaltyRS();
    }

    /**
     * Create an instance of {@link FilingAirline }
     * 
     */
    public FilingAirline createFilingAirline() {
        return new FilingAirline();
    }

    /**
     * Create an instance of {@link Telephone }
     * 
     */
    public Telephone createTelephone() {
        return new Telephone();
    }

    /**
     * Create an instance of {@link ArrivalAirport }
     * 
     */
    public ArrivalAirport createArrivalAirport() {
        return new ArrivalAirport();
    }

    /**
     * Create an instance of {@link ArrayOfOriginDestinationOption }
     * 
     */
    public ArrayOfOriginDestinationOption createArrayOfOriginDestinationOption() {
        return new ArrayOfOriginDestinationOption();
    }

    /**
     * Create an instance of {@link TPAExtensions }
     * 
     */
    public TPAExtensions createTPAExtensions() {
        return new TPAExtensions();
    }

    /**
     * Create an instance of {@link TravelerRefNumber }
     * 
     */
    public TravelerRefNumber createTravelerRefNumber() {
        return new TravelerRefNumber();
    }

    /**
     * Create an instance of {@link Source }
     * 
     */
    public Source createSource() {
        return new Source();
    }

    /**
     * Create an instance of {@link ArrayOfFee }
     * 
     */
    public ArrayOfFee createArrayOfFee() {
        return new ArrayOfFee();
    }

    /**
     * Create an instance of {@link PricedItinerary }
     * 
     */
    public PricedItinerary createPricedItinerary() {
        return new PricedItinerary();
    }

    /**
     * Create an instance of {@link PassengerFare }
     * 
     */
    public PassengerFare createPassengerFare() {
        return new PassengerFare();
    }

    /**
     * Create an instance of {@link AdvResTicketing }
     * 
     */
    public AdvResTicketing createAdvResTicketing() {
        return new AdvResTicketing();
    }

    /**
     * Create an instance of {@link OperatingAirline }
     * 
     */
    public OperatingAirline createOperatingAirline() {
        return new OperatingAirline();
    }

    /**
     * Create an instance of {@link StreetNmbr }
     * 
     */
    public StreetNmbr createStreetNmbr() {
        return new StreetNmbr();
    }

    /**
     * Create an instance of {@link EquipPref }
     * 
     */
    public EquipPref createEquipPref() {
        return new EquipPref();
    }

    /**
     * Create an instance of {@link Notes }
     * 
     */
    public Notes createNotes() {
        return new Notes();
    }

    /**
     * Create an instance of {@link DepartureAirport }
     * 
     */
    public DepartureAirport createDepartureAirport() {
        return new DepartureAirport();
    }

    /**
     * Create an instance of {@link PersonName }
     * 
     */
    public PersonName createPersonName() {
        return new PersonName();
    }

    /**
     * Create an instance of {@link AClasses }
     * 
     */
    public AClasses createAClasses() {
        return new AClasses();
    }

    /**
     * Create an instance of {@link MinimumStay }
     * 
     */
    public MinimumStay createMinimumStay() {
        return new MinimumStay();
    }

    /**
     * Create an instance of {@link ArrayOfError }
     * 
     */
    public ArrayOfError createArrayOfError() {
        return new ArrayOfError();
    }

    /**
     * Create an instance of {@link TravelPreferences }
     * 
     */
    public TravelPreferences createTravelPreferences() {
        return new TravelPreferences();
    }

    /**
     * Create an instance of {@link java.lang.Error }
     * 
     */
    public java.lang.Error createError() {
        return new java.lang.Error();
    }

    /**
     * Create an instance of {@link Penalty }
     * 
     */
    public Penalty createPenalty() {
        return new Penalty();
    }

    /**
     * Create an instance of {@link Provider }
     * 
     */
    public Provider createProvider() {
        return new Provider();
    }

    /**
     * Create an instance of {@link Equipment }
     * 
     */
    public Equipment createEquipment() {
        return new Equipment();
    }

    /**
     * Create an instance of {@link DepartureDateTime }
     * 
     */
    public DepartureDateTime createDepartureDateTime() {
        return new DepartureDateTime();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link ResTicketingRules }
     * 
     */
    public ResTicketingRules createResTicketingRules() {
        return new ResTicketingRules();
    }

    /**
     * Create an instance of {@link ItinTotalFare }
     * 
     */
    public ItinTotalFare createItinTotalFare() {
        return new ItinTotalFare();
    }

    /**
     * Create an instance of {@link StopInfo }
     * 
     */
    public StopInfo createStopInfo() {
        return new StopInfo();
    }

    /**
     * Create an instance of {@link TicketingInfo }
     * 
     */
    public TicketingInfo createTicketingInfo() {
        return new TicketingInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripXML }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsLowFarePlus", name = "TripXML")
    public JAXBElement<TripXML> createTripXML(TripXML value) {
        return new JAXBElement<TripXML>(_TripXML_QNAME, TripXML.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsLowFarePlus", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AClasses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsLowFarePlus", name = "AClasses", scope = VendorPref.class)
    public JAXBElement<AClasses> createVendorPrefAClasses(AClasses value) {
        return new JAXBElement<AClasses>(_VendorPrefAClasses_QNAME, AClasses.class, VendorPref.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsLowFarePlus", name = "Text", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSText(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSText_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsLowFarePlus", name = "JourneyTotalDuration", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSJourneyTotalDuration(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSJourneyTotalDuration_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsLowFarePlus", name = "FlightContext", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSFlightContext(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSFlightContext_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsLowFarePlus", name = "StopInfo", scope = TPAExtensionsRS.class)
    public JAXBElement<StopInfo> createTPAExtensionsRSStopInfo(StopInfo value) {
        return new JAXBElement<StopInfo>(_TPAExtensionsRSStopInfo_QNAME, StopInfo.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsLowFarePlus", name = "JourneyDuration", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSJourneyDuration(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSJourneyDuration_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CabinType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsLowFarePlus", name = "CabinType", scope = TPAExtensionsRS.class)
    public JAXBElement<CabinType> createTPAExtensionsRSCabinType(CabinType value) {
        return new JAXBElement<CabinType>(_TPAExtensionsRSCabinType_QNAME, CabinType.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsLowFarePlus", name = "PricedCode", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSPricedCode(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSPricedCode_QNAME, String.class, TPAExtensionsRS.class, value);
    }

}
