
package services.amadeus.travelbuild;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import java.lang.*;
import java.lang.Package;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the travelbuild package. 
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

    private final static QName _TripXML_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "TripXML");
    private final static QName _String_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "string");
    private final static QName _TPAExtensionsRSAccountingInfo_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "AccountingInfo");
    private final static QName _TPAExtensionsRSCrib_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "Crib");
    private final static QName _TPAExtensionsRSCorporateDiscount_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "CorporateDiscount");
    private final static QName _TPAExtensionsRSAccountingLine_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "AccountingLine");
    private final static QName _TPAExtensionsRSMealPlan_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "MealPlan");
    private final static QName _TPAExtensionsRSFuturePriceInfo_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "FuturePriceInfo");
    private final static QName _TPAExtensionsRSPaymentCard_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "PaymentCard");
    private final static QName _TPAExtensionsRSDestinationRailwayStation_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "DestinationRailwayStation");
    private final static QName _TPAExtensionsRSGuestLastName_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "GuestLastName");
    private final static QName _TPAExtensionsRSExtraChild_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "ExtraChild");
    private final static QName _TPAExtensionsRSGuestFirstName_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "GuestFirstName");
    private final static QName _TPAExtensionsRSSupplementalInfo_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "SupplementalInfo");
    private final static QName _TPAExtensionsRSAgencyCommission_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "AgencyCommission");
    private final static QName _TPAExtensionsRSExtraAdult_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "ExtraAdult");
    private final static QName _TPAExtensionsRSTourNumber_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "TourNumber");
    private final static QName _TPAExtensionsRSOverrideCorporateRate_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "OverrideCorporateRate");
    private final static QName _TPAExtensionsRSAlternateCurrency_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "AlternateCurrency");
    private final static QName _TPAExtensionsRSArnk_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "Arnk");
    private final static QName _TPAExtensionsRSIssuedTickets_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "IssuedTickets");
    private final static QName _TPAExtensionsRSOriginCityCode_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "OriginCityCode");
    private final static QName _TPAExtensionsRSVendor_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "Vendor");
    private final static QName _TPAExtensionsRSFareRules_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "FareRules");
    private final static QName _TPAExtensionsRSValidatingAirlineCode_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "ValidatingAirlineCode");
    private final static QName _TPAExtensionsRSRules_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "Rules");
    private final static QName _TPAExtensionsRSPaymentRestrictions_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "PaymentRestrictions");
    private final static QName _TPAExtensionsRSCarOptions_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "CarOptions");
    private final static QName _TPAExtensionsRSRateQuoted_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "RateQuoted");
    private final static QName _TPAExtensionsRSRollawayAdult_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "RollawayAdult");
    private final static QName _TPAExtensionsRSRoomLocation_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "RoomLocation");
    private final static QName _TPAExtensionsRSAgencyServiceFee_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "AgencyServiceFee");
    private final static QName _TPAExtensionsRSOriginRailwayStation_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "OriginRailwayStation");
    private final static QName _TPAExtensionsRSCarType_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "CarType");
    private final static QName _TPAExtensionsRSRateRequested_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "RateRequested");
    private final static QName _TPAExtensionsRSMerchantCurrency_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "MerchantCurrency");
    private final static QName _TPAExtensionsRSAdvancedDeposit_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "AdvancedDeposit");
    private final static QName _TPAExtensionsRSFareCalculation_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "FareCalculation");
    private final static QName _TPAExtensionsRSRollawayChild_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "RollawayChild");
    private final static QName _TPAExtensionsRSBagAllowance_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "BagAllowance");
    private final static QName _AirOperatingAirline_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "OperatingAirline");
    private final static QName _AirSeats_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "Seats");
    private final static QName _AirDepartureAirport_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "DepartureAirport");
    private final static QName _AirMarriageGrp_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "MarriageGrp");
    private final static QName _AirTPAExtensions_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "TPA_Extensions");
    private final static QName _AirMarketingAirline_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "MarketingAirline");
    private final static QName _AirArrivalAirport_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "ArrivalAirport");
    private final static QName _AirEquipment_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "Equipment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: travelbuild
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WmTravelBuild }
     * 
     */
    public WmTravelBuild createWmTravelBuild() {
        return new WmTravelBuild();
    }

    /**
     * Create an instance of {@link OTATravelItineraryRQ }
     * 
     */
    public OTATravelItineraryRQ createOTATravelItineraryRQ() {
        return new OTATravelItineraryRQ();
    }

    /**
     * Create an instance of {@link WmTravelBuildResponse }
     * 
     */
    public WmTravelBuildResponse createWmTravelBuildResponse() {
        return new WmTravelBuildResponse();
    }

    /**
     * Create an instance of {@link OTATravelItineraryRS }
     * 
     */
    public OTATravelItineraryRS createOTATravelItineraryRS() {
        return new OTATravelItineraryRS();
    }

    /**
     * Create an instance of {@link WmTravelBuildXmlResponse }
     * 
     */
    public WmTravelBuildXmlResponse createWmTravelBuildXmlResponse() {
        return new WmTravelBuildXmlResponse();
    }

    /**
     * Create an instance of {@link WmTravelBuildXml }
     * 
     */
    public WmTravelBuildXml createWmTravelBuildXml() {
        return new WmTravelBuildXml();
    }

    /**
     * Create an instance of {@link TripXML }
     * 
     */
    public TripXML createTripXML() {
        return new TripXML();
    }

    /**
     * Create an instance of {@link Airline }
     * 
     */
    public Airline createAirline() {
        return new Airline();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link TravelItinerary }
     * 
     */
    public TravelItinerary createTravelItinerary() {
        return new TravelItinerary();
    }

    /**
     * Create an instance of {@link ArrayOfRate }
     * 
     */
    public ArrayOfRate createArrayOfRate() {
        return new ArrayOfRate();
    }

    /**
     * Create an instance of {@link VehRentalCore }
     * 
     */
    public VehRentalCore createVehRentalCore() {
        return new VehRentalCore();
    }

    /**
     * Create an instance of {@link ProfileRefRS }
     * 
     */
    public ProfileRefRS createProfileRefRS() {
        return new ProfileRefRS();
    }

    /**
     * Create an instance of {@link PaymentAmount }
     * 
     */
    public PaymentAmount createPaymentAmount() {
        return new PaymentAmount();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialServiceRequest }
     * 
     */
    public ArrayOfSpecialServiceRequest createArrayOfSpecialServiceRequest() {
        return new ArrayOfSpecialServiceRequest();
    }

    /**
     * Create an instance of {@link TaxAmount }
     * 
     */
    public TaxAmount createTaxAmount() {
        return new TaxAmount();
    }

    /**
     * Create an instance of {@link GuaranteeRS }
     * 
     */
    public GuaranteeRS createGuaranteeRS() {
        return new GuaranteeRS();
    }

    /**
     * Create an instance of {@link TelephoneRS }
     * 
     */
    public TelephoneRS createTelephoneRS() {
        return new TelephoneRS();
    }

    /**
     * Create an instance of {@link RelatedTraveler }
     * 
     */
    public RelatedTraveler createRelatedTraveler() {
        return new RelatedTraveler();
    }

    /**
     * Create an instance of {@link PaymentInfo }
     * 
     */
    public PaymentInfo createPaymentInfo() {
        return new PaymentInfo();
    }

    /**
     * Create an instance of {@link Cruise }
     * 
     */
    public Cruise createCruise() {
        return new Cruise();
    }

    /**
     * Create an instance of {@link CustLoyaltyRS }
     * 
     */
    public CustLoyaltyRS createCustLoyaltyRS() {
        return new CustLoyaltyRS();
    }

    /**
     * Create an instance of {@link FeeRS }
     * 
     */
    public FeeRS createFeeRS() {
        return new FeeRS();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownRS }
     * 
     */
    public PTCFareBreakdownRS createPTCFareBreakdownRS() {
        return new PTCFareBreakdownRS();
    }

    /**
     * Create an instance of {@link Fulfillment }
     * 
     */
    public Fulfillment createFulfillment() {
        return new Fulfillment();
    }

    /**
     * Create an instance of {@link ArrayOfString1 }
     * 
     */
    public ArrayOfString1 createArrayOfString1() {
        return new ArrayOfString1();
    }

    /**
     * Create an instance of {@link ArrayOfString2 }
     * 
     */
    public ArrayOfString2 createArrayOfString2() {
        return new ArrayOfString2();
    }

    /**
     * Create an instance of {@link ArrayOfString3 }
     * 
     */
    public ArrayOfString3 createArrayOfString3() {
        return new ArrayOfString3();
    }

    /**
     * Create an instance of {@link AssocItemRef }
     * 
     */
    public AssocItemRef createAssocItemRef() {
        return new AssocItemRef();
    }

    /**
     * Create an instance of {@link AgencyDataCommission }
     * 
     */
    public AgencyDataCommission createAgencyDataCommission() {
        return new AgencyDataCommission();
    }

    /**
     * Create an instance of {@link FlightRefNumber }
     * 
     */
    public FlightRefNumber createFlightRefNumber() {
        return new FlightRefNumber();
    }

    /**
     * Create an instance of {@link AssocItems }
     * 
     */
    public AssocItems createAssocItems() {
        return new AssocItems();
    }

    /**
     * Create an instance of {@link ArrayOfUniqueRemark }
     * 
     */
    public ArrayOfUniqueRemark createArrayOfUniqueRemark() {
        return new ArrayOfUniqueRemark();
    }

    /**
     * Create an instance of {@link CountryName }
     * 
     */
    public CountryName createCountryName() {
        return new CountryName();
    }

    /**
     * Create an instance of {@link MCOType }
     * 
     */
    public MCOType createMCOType() {
        return new MCOType();
    }

    /**
     * Create an instance of {@link EndDateWindowRS }
     * 
     */
    public EndDateWindowRS createEndDateWindowRS() {
        return new EndDateWindowRS();
    }

    /**
     * Create an instance of {@link VehicleCharge }
     * 
     */
    public VehicleCharge createVehicleCharge() {
        return new VehicleCharge();
    }

    /**
     * Create an instance of {@link TPAExtensionsRS }
     * 
     */
    public TPAExtensionsRS createTPAExtensionsRS() {
        return new TPAExtensionsRS();
    }

    /**
     * Create an instance of {@link SpecialReqPref }
     * 
     */
    public SpecialReqPref createSpecialReqPref() {
        return new SpecialReqPref();
    }

    /**
     * Create an instance of {@link FlightSegment }
     * 
     */
    public FlightSegment createFlightSegment() {
        return new FlightSegment();
    }

    /**
     * Create an instance of {@link ArrivalLocation }
     * 
     */
    public ArrivalLocation createArrivalLocation() {
        return new ArrivalLocation();
    }

    /**
     * Create an instance of {@link PaymentForm }
     * 
     */
    public PaymentForm createPaymentForm() {
        return new PaymentForm();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoRS }
     * 
     */
    public BasicPropertyInfoRS createBasicPropertyInfoRS() {
        return new BasicPropertyInfoRS();
    }

    /**
     * Create an instance of {@link Queue }
     * 
     */
    public Queue createQueue() {
        return new Queue();
    }

    /**
     * Create an instance of {@link RateQualifierRS }
     * 
     */
    public RateQualifierRS createRateQualifierRS() {
        return new RateQualifierRS();
    }

    /**
     * Create an instance of {@link ArrayOfGuaranteeAccepted }
     * 
     */
    public ArrayOfGuaranteeAccepted createArrayOfGuaranteeAccepted() {
        return new ArrayOfGuaranteeAccepted();
    }

    /**
     * Create an instance of {@link StateProv }
     * 
     */
    public StateProv createStateProv() {
        return new StateProv();
    }

    /**
     * Create an instance of {@link GuaranteeDescription }
     * 
     */
    public GuaranteeDescription createGuaranteeDescription() {
        return new GuaranteeDescription();
    }

    /**
     * Create an instance of {@link TotalFare }
     * 
     */
    public TotalFare createTotalFare() {
        return new TotalFare();
    }

    /**
     * Create an instance of {@link RoomStay }
     * 
     */
    public RoomStay createRoomStay() {
        return new RoomStay();
    }

    /**
     * Create an instance of {@link PassengerTypeQuantityRS }
     * 
     */
    public PassengerTypeQuantityRS createPassengerTypeQuantityRS() {
        return new PassengerTypeQuantityRS();
    }

    /**
     * Create an instance of {@link TicketingRS }
     * 
     */
    public TicketingRS createTicketingRS() {
        return new TicketingRS();
    }

    /**
     * Create an instance of {@link AdvTicketing }
     * 
     */
    public AdvTicketing createAdvTicketing() {
        return new AdvTicketing();
    }

    /**
     * Create an instance of {@link AmountPercent }
     * 
     */
    public AmountPercent createAmountPercent() {
        return new AmountPercent();
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
     * Create an instance of {@link CustomerInfoRS }
     * 
     */
    public CustomerInfoRS createCustomerInfoRS() {
        return new CustomerInfoRS();
    }

    /**
     * Create an instance of {@link SpecialServiceRequest }
     * 
     */
    public SpecialServiceRequest createSpecialServiceRequest() {
        return new SpecialServiceRequest();
    }

    /**
     * Create an instance of {@link MinMax }
     * 
     */
    public MinMax createMinMax() {
        return new MinMax();
    }

    /**
     * Create an instance of {@link Vehicle }
     * 
     */
    public Vehicle createVehicle() {
        return new Vehicle();
    }

    /**
     * Create an instance of {@link ArrayOfComment }
     * 
     */
    public ArrayOfComment createArrayOfComment() {
        return new ArrayOfComment();
    }

    /**
     * Create an instance of {@link ItineraryRef }
     * 
     */
    public ItineraryRef createItineraryRef() {
        return new ItineraryRef();
    }

    /**
     * Create an instance of {@link CustLoyalty }
     * 
     */
    public CustLoyalty createCustLoyalty() {
        return new CustLoyalty();
    }

    /**
     * Create an instance of {@link Amenity }
     * 
     */
    public Amenity createAmenity() {
        return new Amenity();
    }

    /**
     * Create an instance of {@link ArrayOfCategorizedRemark }
     * 
     */
    public ArrayOfCategorizedRemark createArrayOfCategorizedRemark() {
        return new ArrayOfCategorizedRemark();
    }

    /**
     * Create an instance of {@link LengthOfStayRules }
     * 
     */
    public LengthOfStayRules createLengthOfStayRules() {
        return new LengthOfStayRules();
    }

    /**
     * Create an instance of {@link MiscellaneousSegments }
     * 
     */
    public MiscellaneousSegments createMiscellaneousSegments() {
        return new MiscellaneousSegments();
    }

    /**
     * Create an instance of {@link VehClass }
     * 
     */
    public VehClass createVehClass() {
        return new VehClass();
    }

    /**
     * Create an instance of {@link RoomRateRS }
     * 
     */
    public RoomRateRS createRoomRateRS() {
        return new RoomRateRS();
    }

    /**
     * Create an instance of {@link FareInfoRS }
     * 
     */
    public FareInfoRS createFareInfoRS() {
        return new FareInfoRS();
    }

    /**
     * Create an instance of {@link PassengerTypeQuantity }
     * 
     */
    public PassengerTypeQuantity createPassengerTypeQuantity() {
        return new PassengerTypeQuantity();
    }

    /**
     * Create an instance of {@link BagAllowance }
     * 
     */
    public BagAllowance createBagAllowance() {
        return new BagAllowance();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialRequest }
     * 
     */
    public ArrayOfSpecialRequest createArrayOfSpecialRequest() {
        return new ArrayOfSpecialRequest();
    }

    /**
     * Create an instance of {@link CarOption }
     * 
     */
    public CarOption createCarOption() {
        return new CarOption();
    }

    /**
     * Create an instance of {@link MiscChargeOrder }
     * 
     */
    public MiscChargeOrder createMiscChargeOrder() {
        return new MiscChargeOrder();
    }

    /**
     * Create an instance of {@link PriceRequestInformation }
     * 
     */
    public PriceRequestInformation createPriceRequestInformation() {
        return new PriceRequestInformation();
    }

    /**
     * Create an instance of {@link RuleInfo }
     * 
     */
    public RuleInfo createRuleInfo() {
        return new RuleInfo();
    }

    /**
     * Create an instance of {@link ArrayOfServiceRPH }
     * 
     */
    public ArrayOfServiceRPH createArrayOfServiceRPH() {
        return new ArrayOfServiceRPH();
    }

    /**
     * Create an instance of {@link CardIssuerName }
     * 
     */
    public CardIssuerName createCardIssuerName() {
        return new CardIssuerName();
    }

    /**
     * Create an instance of {@link PriceData }
     * 
     */
    public PriceData createPriceData() {
        return new PriceData();
    }

    /**
     * Create an instance of {@link BookingReferenceID }
     * 
     */
    public BookingReferenceID createBookingReferenceID() {
        return new BookingReferenceID();
    }

    /**
     * Create an instance of {@link ArrayOfSeatRequest }
     * 
     */
    public ArrayOfSeatRequest createArrayOfSeatRequest() {
        return new ArrayOfSeatRequest();
    }

    /**
     * Create an instance of {@link VehResRQCore }
     * 
     */
    public VehResRQCore createVehResRQCore() {
        return new VehResRQCore();
    }

    /**
     * Create an instance of {@link ArrayOfHotelReservation }
     * 
     */
    public ArrayOfHotelReservation createArrayOfHotelReservation() {
        return new ArrayOfHotelReservation();
    }

    /**
     * Create an instance of {@link ArrayOfAdditionalDetail }
     * 
     */
    public ArrayOfAdditionalDetail createArrayOfAdditionalDetail() {
        return new ArrayOfAdditionalDetail();
    }

    /**
     * Create an instance of {@link CarLocation }
     * 
     */
    public CarLocation createCarLocation() {
        return new CarLocation();
    }

    /**
     * Create an instance of {@link PersonName }
     * 
     */
    public PersonName createPersonName() {
        return new PersonName();
    }

    /**
     * Create an instance of {@link StartDateWindow }
     * 
     */
    public StartDateWindow createStartDateWindow() {
        return new StartDateWindow();
    }

    /**
     * Create an instance of {@link RoomRatesRS }
     * 
     */
    public RoomRatesRS createRoomRatesRS() {
        return new RoomRatesRS();
    }

    /**
     * Create an instance of {@link MinimumStay }
     * 
     */
    public MinimumStay createMinimumStay() {
        return new MinimumStay();
    }

    /**
     * Create an instance of {@link SpecialRemarkRS }
     * 
     */
    public SpecialRemarkRS createSpecialRemarkRS() {
        return new SpecialRemarkRS();
    }

    /**
     * Create an instance of {@link ArrayOfFareInfoRS }
     * 
     */
    public ArrayOfFareInfoRS createArrayOfFareInfoRS() {
        return new ArrayOfFareInfoRS();
    }

    /**
     * Create an instance of {@link ChargesRulesRS }
     * 
     */
    public ChargesRulesRS createChargesRulesRS() {
        return new ChargesRulesRS();
    }

    /**
     * Create an instance of {@link AirFareInfo }
     * 
     */
    public AirFareInfo createAirFareInfo() {
        return new AirFareInfo();
    }

    /**
     * Create an instance of {@link ArrayOfResGuestRPH }
     * 
     */
    public ArrayOfResGuestRPH createArrayOfResGuestRPH() {
        return new ArrayOfResGuestRPH();
    }

    /**
     * Create an instance of {@link RoomTypesRS }
     * 
     */
    public RoomTypesRS createRoomTypesRS() {
        return new RoomTypesRS();
    }

    /**
     * Create an instance of {@link ListItem }
     * 
     */
    public ListItem createListItem() {
        return new ListItem();
    }

    /**
     * Create an instance of {@link LengthOfStayRulesRS }
     * 
     */
    public LengthOfStayRulesRS createLengthOfStayRulesRS() {
        return new LengthOfStayRulesRS();
    }

    /**
     * Create an instance of {@link VoucherRS }
     * 
     */
    public VoucherRS createVoucherRS() {
        return new VoucherRS();
    }

    /**
     * Create an instance of {@link EndRules }
     * 
     */
    public EndRules createEndRules() {
        return new EndRules();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Access }
     * 
     */
    public Access createAccess() {
        return new Access();
    }

    /**
     * Create an instance of {@link LoyaltyRedemption }
     * 
     */
    public LoyaltyRedemption createLoyaltyRedemption() {
        return new LoyaltyRedemption();
    }

    /**
     * Create an instance of {@link ContactPerson }
     * 
     */
    public ContactPerson createContactPerson() {
        return new ContactPerson();
    }

    /**
     * Create an instance of {@link UpdatedBy }
     * 
     */
    public UpdatedBy createUpdatedBy() {
        return new UpdatedBy();
    }

    /**
     * Create an instance of {@link FareInfo }
     * 
     */
    public FareInfo createFareInfo() {
        return new FareInfo();
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
     * Create an instance of {@link Membership }
     * 
     */
    public Membership createMembership() {
        return new Membership();
    }

    /**
     * Create an instance of {@link ContactInfo }
     * 
     */
    public ContactInfo createContactInfo() {
        return new ContactInfo();
    }

    /**
     * Create an instance of {@link Calculation }
     * 
     */
    public Calculation createCalculation() {
        return new Calculation();
    }

    /**
     * Create an instance of {@link ResGuestRPH }
     * 
     */
    public ResGuestRPH createResGuestRPH() {
        return new ResGuestRPH();
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
     * Create an instance of {@link Rate }
     * 
     */
    public Rate createRate() {
        return new Rate();
    }

    /**
     * Create an instance of {@link Air }
     * 
     */
    public Air createAir() {
        return new Air();
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
     * Create an instance of {@link ArrayOfPaymentDetail }
     * 
     */
    public ArrayOfPaymentDetail createArrayOfPaymentDetail() {
        return new ArrayOfPaymentDetail();
    }

    /**
     * Create an instance of {@link ItineraryPricing }
     * 
     */
    public ItineraryPricing createItineraryPricing() {
        return new ItineraryPricing();
    }

    /**
     * Create an instance of {@link ManualDocument }
     * 
     */
    public ManualDocument createManualDocument() {
        return new ManualDocument();
    }

    /**
     * Create an instance of {@link VehClassRS }
     * 
     */
    public VehClassRS createVehClassRS() {
        return new VehClassRS();
    }

    /**
     * Create an instance of {@link Warning }
     * 
     */
    public Warning createWarning() {
        return new Warning();
    }

    /**
     * Create an instance of {@link ArrayOfAcceptedPayment }
     * 
     */
    public ArrayOfAcceptedPayment createArrayOfAcceptedPayment() {
        return new ArrayOfAcceptedPayment();
    }

    /**
     * Create an instance of {@link ArrivalDetails }
     * 
     */
    public ArrivalDetails createArrivalDetails() {
        return new ArrivalDetails();
    }

    /**
     * Create an instance of {@link OTAVehResRQ }
     * 
     */
    public OTAVehResRQ createOTAVehResRQ() {
        return new OTAVehResRQ();
    }

    /**
     * Create an instance of {@link VehTypeRS }
     * 
     */
    public VehTypeRS createVehTypeRS() {
        return new VehTypeRS();
    }

    /**
     * Create an instance of {@link ArrayOfMembership }
     * 
     */
    public ArrayOfMembership createArrayOfMembership() {
        return new ArrayOfMembership();
    }

    /**
     * Create an instance of {@link MCOFare }
     * 
     */
    public MCOFare createMCOFare() {
        return new MCOFare();
    }

    /**
     * Create an instance of {@link TravelCost }
     * 
     */
    public TravelCost createTravelCost() {
        return new TravelCost();
    }

    /**
     * Create an instance of {@link RatePlan }
     * 
     */
    public RatePlan createRatePlan() {
        return new RatePlan();
    }

    /**
     * Create an instance of {@link URL }
     * 
     */
    public URL createURL() {
        return new URL();
    }

    /**
     * Create an instance of {@link CarData }
     * 
     */
    public CarData createCarData() {
        return new CarData();
    }

    /**
     * Create an instance of {@link OTAHotelResRQ }
     * 
     */
    public OTAHotelResRQ createOTAHotelResRQ() {
        return new OTAHotelResRQ();
    }

    /**
     * Create an instance of {@link SpecialEquipPref }
     * 
     */
    public SpecialEquipPref createSpecialEquipPref() {
        return new SpecialEquipPref();
    }

    /**
     * Create an instance of {@link PricedEquip }
     * 
     */
    public PricedEquip createPricedEquip() {
        return new PricedEquip();
    }

    /**
     * Create an instance of {@link AssocItem }
     * 
     */
    public AssocItem createAssocItem() {
        return new AssocItem();
    }

    /**
     * Create an instance of {@link OffLocService }
     * 
     */
    public OffLocService createOffLocService() {
        return new OffLocService();
    }

    /**
     * Create an instance of {@link ArrayOfRoomType }
     * 
     */
    public ArrayOfRoomType createArrayOfRoomType() {
        return new ArrayOfRoomType();
    }

    /**
     * Create an instance of {@link TotalCharge }
     * 
     */
    public TotalCharge createTotalCharge() {
        return new TotalCharge();
    }

    /**
     * Create an instance of {@link SpecialRemark }
     * 
     */
    public SpecialRemark createSpecialRemark() {
        return new SpecialRemark();
    }

    /**
     * Create an instance of {@link EquivFareRS }
     * 
     */
    public EquivFareRS createEquivFareRS() {
        return new EquivFareRS();
    }

    /**
     * Create an instance of {@link MCO }
     * 
     */
    public MCO createMCO() {
        return new MCO();
    }

    /**
     * Create an instance of {@link AgencyServiceFee }
     * 
     */
    public AgencyServiceFee createAgencyServiceFee() {
        return new AgencyServiceFee();
    }

    /**
     * Create an instance of {@link RentalRate }
     * 
     */
    public RentalRate createRentalRate() {
        return new RentalRate();
    }

    /**
     * Create an instance of {@link DocumentInfo }
     * 
     */
    public DocumentInfo createDocumentInfo() {
        return new DocumentInfo();
    }

    /**
     * Create an instance of {@link FuturePriceInfo }
     * 
     */
    public FuturePriceInfo createFuturePriceInfo() {
        return new FuturePriceInfo();
    }

    /**
     * Create an instance of {@link TimeSpanRS }
     * 
     */
    public TimeSpanRS createTimeSpanRS() {
        return new TimeSpanRS();
    }

    /**
     * Create an instance of {@link RoomDescription }
     * 
     */
    public RoomDescription createRoomDescription() {
        return new RoomDescription();
    }

    /**
     * Create an instance of {@link PaymentCard }
     * 
     */
    public PaymentCard createPaymentCard() {
        return new PaymentCard();
    }

    /**
     * Create an instance of {@link TimeSpanRQ }
     * 
     */
    public TimeSpanRQ createTimeSpanRQ() {
        return new TimeSpanRQ();
    }

    /**
     * Create an instance of {@link TravelerInfo }
     * 
     */
    public TravelerInfo createTravelerInfo() {
        return new TravelerInfo();
    }

    /**
     * Create an instance of {@link BankAcct }
     * 
     */
    public BankAcct createBankAcct() {
        return new BankAcct();
    }

    /**
     * Create an instance of {@link StartDateWindowRS }
     * 
     */
    public StartDateWindowRS createStartDateWindowRS() {
        return new StartDateWindowRS();
    }

    /**
     * Create an instance of {@link CompanyName }
     * 
     */
    public CompanyName createCompanyName() {
        return new CompanyName();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link Primary }
     * 
     */
    public Primary createPrimary() {
        return new Primary();
    }

    /**
     * Create an instance of {@link DriverType }
     * 
     */
    public DriverType createDriverType() {
        return new DriverType();
    }

    /**
     * Create an instance of {@link RemarksRS }
     * 
     */
    public RemarksRS createRemarksRS() {
        return new RemarksRS();
    }

    /**
     * Create an instance of {@link AgencyCommission }
     * 
     */
    public AgencyCommission createAgencyCommission() {
        return new AgencyCommission();
    }

    /**
     * Create an instance of {@link Receipt }
     * 
     */
    public Receipt createReceipt() {
        return new Receipt();
    }

    /**
     * Create an instance of {@link DetailDescription }
     * 
     */
    public DetailDescription createDetailDescription() {
        return new DetailDescription();
    }

    /**
     * Create an instance of {@link AccountVendor }
     * 
     */
    public AccountVendor createAccountVendor() {
        return new AccountVendor();
    }

    /**
     * Create an instance of {@link DepositPaymentRS }
     * 
     */
    public DepositPaymentRS createDepositPaymentRS() {
        return new DepositPaymentRS();
    }

    /**
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link RoomDescriptionRS }
     * 
     */
    public RoomDescriptionRS createRoomDescriptionRS() {
        return new RoomDescriptionRS();
    }

    /**
     * Create an instance of {@link ArrayOfCoveragePref }
     * 
     */
    public ArrayOfCoveragePref createArrayOfCoveragePref() {
        return new ArrayOfCoveragePref();
    }

    /**
     * Create an instance of {@link VehType }
     * 
     */
    public VehType createVehType() {
        return new VehType();
    }

    /**
     * Create an instance of {@link FilingAirline }
     * 
     */
    public FilingAirline createFilingAirline() {
        return new FilingAirline();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfFlightSegment }
     * 
     */
    public ArrayOfArrayOfFlightSegment createArrayOfArrayOfFlightSegment() {
        return new ArrayOfArrayOfFlightSegment();
    }

    /**
     * Create an instance of {@link Telephone }
     * 
     */
    public Telephone createTelephone() {
        return new Telephone();
    }

    /**
     * Create an instance of {@link AgencyData }
     * 
     */
    public AgencyData createAgencyData() {
        return new AgencyData();
    }

    /**
     * Create an instance of {@link VehMakeModel }
     * 
     */
    public VehMakeModel createVehMakeModel() {
        return new VehMakeModel();
    }

    /**
     * Create an instance of {@link ArrayOfAcceptedPaymentRS }
     * 
     */
    public ArrayOfAcceptedPaymentRS createArrayOfAcceptedPaymentRS() {
        return new ArrayOfAcceptedPaymentRS();
    }

    /**
     * Create an instance of {@link PriceInfo }
     * 
     */
    public PriceInfo createPriceInfo() {
        return new PriceInfo();
    }

    /**
     * Create an instance of {@link ResTicketingRulesRS }
     * 
     */
    public ResTicketingRulesRS createResTicketingRulesRS() {
        return new ResTicketingRulesRS();
    }

    /**
     * Create an instance of {@link UniqueRemark }
     * 
     */
    public UniqueRemark createUniqueRemark() {
        return new UniqueRemark();
    }

    /**
     * Create an instance of {@link MarketingCompany }
     * 
     */
    public MarketingCompany createMarketingCompany() {
        return new MarketingCompany();
    }

    /**
     * Create an instance of {@link AdvResTicketing }
     * 
     */
    public AdvResTicketing createAdvResTicketing() {
        return new AdvResTicketing();
    }

    /**
     * Create an instance of {@link ItemPricing }
     * 
     */
    public ItemPricing createItemPricing() {
        return new ItemPricing();
    }

    /**
     * Create an instance of {@link Comment }
     * 
     */
    public Comment createComment() {
        return new Comment();
    }

    /**
     * Create an instance of {@link OtherServiceInformation }
     * 
     */
    public OtherServiceInformation createOtherServiceInformation() {
        return new OtherServiceInformation();
    }

    /**
     * Create an instance of {@link EndDateWindow }
     * 
     */
    public EndDateWindow createEndDateWindow() {
        return new EndDateWindow();
    }

    /**
     * Create an instance of {@link java.lang.Error }
     * 
     */
    public java.lang.Error createError() {
        return new java.lang.Error();
    }

    /**
     * Create an instance of {@link Vendor }
     * 
     */
    public Vendor createVendor() {
        return new Vendor();
    }

    /**
     * Create an instance of {@link ItinTotalFare }
     * 
     */
    public ItinTotalFare createItinTotalFare() {
        return new ItinTotalFare();
    }

    /**
     * Create an instance of {@link Traveler }
     * 
     */
    public Traveler createTraveler() {
        return new Traveler();
    }

    /**
     * Create an instance of {@link TicketingInfo }
     * 
     */
    public TicketingInfo createTicketingInfo() {
        return new TicketingInfo();
    }

    /**
     * Create an instance of {@link RoomRate }
     * 
     */
    public RoomRate createRoomRate() {
        return new RoomRate();
    }

    /**
     * Create an instance of {@link Ticketing }
     * 
     */
    public Ticketing createTicketing() {
        return new Ticketing();
    }

    /**
     * Create an instance of {@link ChargesRules }
     * 
     */
    public ChargesRules createChargesRules() {
        return new ChargesRules();
    }

    /**
     * Create an instance of {@link Seat }
     * 
     */
    public Seat createSeat() {
        return new Seat();
    }

    /**
     * Create an instance of {@link GuestCounts }
     * 
     */
    public GuestCounts createGuestCounts() {
        return new GuestCounts();
    }

    /**
     * Create an instance of {@link ArrayOfPricedEquip }
     * 
     */
    public ArrayOfPricedEquip createArrayOfPricedEquip() {
        return new ArrayOfPricedEquip();
    }

    /**
     * Create an instance of {@link PTCFareBreakdown }
     * 
     */
    public PTCFareBreakdown createPTCFareBreakdown() {
        return new PTCFareBreakdown();
    }

    /**
     * Create an instance of {@link PaymentDescription }
     * 
     */
    public PaymentDescription createPaymentDescription() {
        return new PaymentDescription();
    }

    /**
     * Create an instance of {@link IssuedTicket }
     * 
     */
    public IssuedTicket createIssuedTicket() {
        return new IssuedTicket();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link Remark }
     * 
     */
    public Remark createRemark() {
        return new Remark();
    }

    /**
     * Create an instance of {@link ReturnLocation }
     * 
     */
    public ReturnLocation createReturnLocation() {
        return new ReturnLocation();
    }

    /**
     * Create an instance of {@link MaximumStayRS }
     * 
     */
    public MaximumStayRS createMaximumStayRS() {
        return new MaximumStayRS();
    }

    /**
     * Create an instance of {@link CustomerRS }
     * 
     */
    public CustomerRS createCustomerRS() {
        return new CustomerRS();
    }

    /**
     * Create an instance of {@link GuestCountsRS }
     * 
     */
    public GuestCountsRS createGuestCountsRS() {
        return new GuestCountsRS();
    }

    /**
     * Create an instance of {@link POS }
     * 
     */
    public POS createPOS() {
        return new POS();
    }

    /**
     * Create an instance of {@link CoveragePref }
     * 
     */
    public CoveragePref createCoveragePref() {
        return new CoveragePref();
    }

    /**
     * Create an instance of {@link AccessPerson }
     * 
     */
    public AccessPerson createAccessPerson() {
        return new AccessPerson();
    }

    /**
     * Create an instance of {@link ManualTicket }
     * 
     */
    public ManualTicket createManualTicket() {
        return new ManualTicket();
    }

    /**
     * Create an instance of {@link ArrayOfTax }
     * 
     */
    public ArrayOfTax createArrayOfTax() {
        return new ArrayOfTax();
    }

    /**
     * Create an instance of {@link PaymentCardRS }
     * 
     */
    public PaymentCardRS createPaymentCardRS() {
        return new PaymentCardRS();
    }

    /**
     * Create an instance of {@link DirectBillRS }
     * 
     */
    public DirectBillRS createDirectBillRS() {
        return new DirectBillRS();
    }

    /**
     * Create an instance of {@link DeliveryAddress }
     * 
     */
    public DeliveryAddress createDeliveryAddress() {
        return new DeliveryAddress();
    }

    /**
     * Create an instance of {@link ArrayOfRoomStay }
     * 
     */
    public ArrayOfRoomStay createArrayOfRoomStay() {
        return new ArrayOfRoomStay();
    }

    /**
     * Create an instance of {@link IssuedTickets }
     * 
     */
    public IssuedTickets createIssuedTickets() {
        return new IssuedTickets();
    }

    /**
     * Create an instance of {@link Guarantee }
     * 
     */
    public Guarantee createGuarantee() {
        return new Guarantee();
    }

    /**
     * Create an instance of {@link EmployeeInfo }
     * 
     */
    public EmployeeInfo createEmployeeInfo() {
        return new EmployeeInfo();
    }

    /**
     * Create an instance of {@link Tour }
     * 
     */
    public Tour createTour() {
        return new Tour();
    }

    /**
     * Create an instance of {@link GuestCountRS }
     * 
     */
    public GuestCountRS createGuestCountRS() {
        return new GuestCountRS();
    }

    /**
     * Create an instance of {@link AdvTicketingRS }
     * 
     */
    public AdvTicketingRS createAdvTicketingRS() {
        return new AdvTicketingRS();
    }

    /**
     * Create an instance of {@link GuaranteesAcceptedRS }
     * 
     */
    public GuaranteesAcceptedRS createGuaranteesAcceptedRS() {
        return new GuaranteesAcceptedRS();
    }

    /**
     * Create an instance of {@link AgencyAcctNumber }
     * 
     */
    public AgencyAcctNumber createAgencyAcctNumber() {
        return new AgencyAcctNumber();
    }

    /**
     * Create an instance of {@link ReservationItems }
     * 
     */
    public ReservationItems createReservationItems() {
        return new ReservationItems();
    }

    /**
     * Create an instance of {@link PNRData }
     * 
     */
    public PNRData createPNRData() {
        return new PNRData();
    }

    /**
     * Create an instance of {@link RateQualifier }
     * 
     */
    public RateQualifier createRateQualifier() {
        return new RateQualifier();
    }

    /**
     * Create an instance of {@link RoomRateDescription }
     * 
     */
    public RoomRateDescription createRoomRateDescription() {
        return new RoomRateDescription();
    }

    /**
     * Create an instance of {@link CarRate }
     * 
     */
    public CarRate createCarRate() {
        return new CarRate();
    }

    /**
     * Create an instance of {@link UniqueID }
     * 
     */
    public UniqueID createUniqueID() {
        return new UniqueID();
    }

    /**
     * Create an instance of {@link NegoFares }
     * 
     */
    public NegoFares createNegoFares() {
        return new NegoFares();
    }

    /**
     * Create an instance of {@link DocumentRS }
     * 
     */
    public DocumentRS createDocumentRS() {
        return new DocumentRS();
    }

    /**
     * Create an instance of {@link DateWindowRangeRS }
     * 
     */
    public DateWindowRangeRS createDateWindowRangeRS() {
        return new DateWindowRangeRS();
    }

    /**
     * Create an instance of {@link AddressRS }
     * 
     */
    public AddressRS createAddressRS() {
        return new AddressRS();
    }

    /**
     * Create an instance of {@link Commission }
     * 
     */
    public Commission createCommission() {
        return new Commission();
    }

    /**
     * Create an instance of {@link GuestCount }
     * 
     */
    public GuestCount createGuestCount() {
        return new GuestCount();
    }

    /**
     * Create an instance of {@link RentalPaymentPref }
     * 
     */
    public RentalPaymentPref createRentalPaymentPref() {
        return new RentalPaymentPref();
    }

    /**
     * Create an instance of {@link CommentRS }
     * 
     */
    public CommentRS createCommentRS() {
        return new CommentRS();
    }

    /**
     * Create an instance of {@link GuaranteeDescriptionRS }
     * 
     */
    public GuaranteeDescriptionRS createGuaranteeDescriptionRS() {
        return new GuaranteeDescriptionRS();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialEquipPref }
     * 
     */
    public ArrayOfSpecialEquipPref createArrayOfSpecialEquipPref() {
        return new ArrayOfSpecialEquipPref();
    }

    /**
     * Create an instance of {@link IssuedInvoice }
     * 
     */
    public IssuedInvoice createIssuedInvoice() {
        return new IssuedInvoice();
    }

    /**
     * Create an instance of {@link ArrayOfRequiredPayment }
     * 
     */
    public ArrayOfRequiredPayment createArrayOfRequiredPayment() {
        return new ArrayOfRequiredPayment();
    }

    /**
     * Create an instance of {@link TaxesRS }
     * 
     */
    public TaxesRS createTaxesRS() {
        return new TaxesRS();
    }

    /**
     * Create an instance of {@link GuaranteeAcceptedRS }
     * 
     */
    public GuaranteeAcceptedRS createGuaranteeAcceptedRS() {
        return new GuaranteeAcceptedRS();
    }

    /**
     * Create an instance of {@link VehPref }
     * 
     */
    public VehPref createVehPref() {
        return new VehPref();
    }

    /**
     * Create an instance of {@link EquivFare }
     * 
     */
    public EquivFare createEquivFare() {
        return new EquivFare();
    }

    /**
     * Create an instance of {@link General }
     * 
     */
    public General createGeneral() {
        return new General();
    }

    /**
     * Create an instance of {@link SpecialRemarkRSA }
     * 
     */
    public SpecialRemarkRSA createSpecialRemarkRSA() {
        return new SpecialRemarkRSA();
    }

    /**
     * Create an instance of {@link ArrayOfWarning }
     * 
     */
    public ArrayOfWarning createArrayOfWarning() {
        return new ArrayOfWarning();
    }

    /**
     * Create an instance of {@link FareDiscount }
     * 
     */
    public FareDiscount createFareDiscount() {
        return new FareDiscount();
    }

    /**
     * Create an instance of {@link TPAExtensions }
     * 
     */
    public TPAExtensions createTPAExtensions() {
        return new TPAExtensions();
    }

    /**
     * Create an instance of {@link DestinationRailwayStation }
     * 
     */
    public DestinationRailwayStation createDestinationRailwayStation() {
        return new DestinationRailwayStation();
    }

    /**
     * Create an instance of {@link AccountingInfo }
     * 
     */
    public AccountingInfo createAccountingInfo() {
        return new AccountingInfo();
    }

    /**
     * Create an instance of {@link ArrayOfFee }
     * 
     */
    public ArrayOfFee createArrayOfFee() {
        return new ArrayOfFee();
    }

    /**
     * Create an instance of {@link CitizenCountryName }
     * 
     */
    public CitizenCountryName createCitizenCountryName() {
        return new CitizenCountryName();
    }

    /**
     * Create an instance of {@link RuleInfoRS }
     * 
     */
    public RuleInfoRS createRuleInfoRS() {
        return new RuleInfoRS();
    }

    /**
     * Create an instance of {@link DepartureAirport }
     * 
     */
    public DepartureAirport createDepartureAirport() {
        return new DepartureAirport();
    }

    /**
     * Create an instance of {@link SpecialRequest }
     * 
     */
    public SpecialRequest createSpecialRequest() {
        return new SpecialRequest();
    }

    /**
     * Create an instance of {@link ArrayOfSeat }
     * 
     */
    public ArrayOfSeat createArrayOfSeat() {
        return new ArrayOfSeat();
    }

    /**
     * Create an instance of {@link ArrayOfError }
     * 
     */
    public ArrayOfError createArrayOfError() {
        return new ArrayOfError();
    }

    /**
     * Create an instance of {@link Charge }
     * 
     */
    public Charge createCharge() {
        return new Charge();
    }

    /**
     * Create an instance of {@link Penalty }
     * 
     */
    public Penalty createPenalty() {
        return new Penalty();
    }

    /**
     * Create an instance of {@link DateWindowRange }
     * 
     */
    public DateWindowRange createDateWindowRange() {
        return new DateWindowRange();
    }

    /**
     * Create an instance of {@link Base }
     * 
     */
    public Base createBase() {
        return new Base();
    }

    /**
     * Create an instance of {@link Provider }
     * 
     */
    public Provider createProvider() {
        return new Provider();
    }

    /**
     * Create an instance of {@link ArrayOfPTCFareBreakdownRS }
     * 
     */
    public ArrayOfPTCFareBreakdownRS createArrayOfPTCFareBreakdownRS() {
        return new ArrayOfPTCFareBreakdownRS();
    }

    /**
     * Create an instance of {@link Equipment }
     * 
     */
    public Equipment createEquipment() {
        return new Equipment();
    }

    /**
     * Create an instance of {@link CostTotals }
     * 
     */
    public CostTotals createCostTotals() {
        return new CostTotals();
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
     * Create an instance of {@link GuaranteeAccepted }
     * 
     */
    public GuaranteeAccepted createGuaranteeAccepted() {
        return new GuaranteeAccepted();
    }

    /**
     * Create an instance of {@link ArrayOfFeeRS }
     * 
     */
    public ArrayOfFeeRS createArrayOfFeeRS() {
        return new ArrayOfFeeRS();
    }

    /**
     * Create an instance of {@link AirItinerary }
     * 
     */
    public AirItinerary createAirItinerary() {
        return new AirItinerary();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link OTAAirBookRQ }
     * 
     */
    public OTAAirBookRQ createOTAAirBookRQ() {
        return new OTAAirBookRQ();
    }

    /**
     * Create an instance of {@link HotelReservation }
     * 
     */
    public HotelReservation createHotelReservation() {
        return new HotelReservation();
    }

    /**
     * Create an instance of {@link ArrayOfRatePlan }
     * 
     */
    public ArrayOfRatePlan createArrayOfRatePlan() {
        return new ArrayOfRatePlan();
    }

    /**
     * Create an instance of {@link ArrayOfFeeRS1 }
     * 
     */
    public ArrayOfFeeRS1 createArrayOfFeeRS1() {
        return new ArrayOfFeeRS1();
    }

    /**
     * Create an instance of {@link NegotiatedFareCode }
     * 
     */
    public NegotiatedFareCode createNegotiatedFareCode() {
        return new NegotiatedFareCode();
    }

    /**
     * Create an instance of {@link ArrayOfTaxAmount }
     * 
     */
    public ArrayOfTaxAmount createArrayOfTaxAmount() {
        return new ArrayOfTaxAmount();
    }

    /**
     * Create an instance of {@link ServiceRPH }
     * 
     */
    public ServiceRPH createServiceRPH() {
        return new ServiceRPH();
    }

    /**
     * Create an instance of {@link VehicleCharges }
     * 
     */
    public VehicleCharges createVehicleCharges() {
        return new VehicleCharges();
    }

    /**
     * Create an instance of {@link AccessComment }
     * 
     */
    public AccessComment createAccessComment() {
        return new AccessComment();
    }

    /**
     * Create an instance of {@link TaxDescription }
     * 
     */
    public TaxDescription createTaxDescription() {
        return new TaxDescription();
    }

    /**
     * Create an instance of {@link RateRestrictions }
     * 
     */
    public RateRestrictions createRateRestrictions() {
        return new RateRestrictions();
    }

    /**
     * Create an instance of {@link ArrayOfPTCFareBreakdown }
     * 
     */
    public ArrayOfPTCFareBreakdown createArrayOfPTCFareBreakdown() {
        return new ArrayOfPTCFareBreakdown();
    }

    /**
     * Create an instance of {@link AcceptedPaymentRS }
     * 
     */
    public AcceptedPaymentRS createAcceptedPaymentRS() {
        return new AcceptedPaymentRS();
    }

    /**
     * Create an instance of {@link SeatRequest }
     * 
     */
    public SeatRequest createSeatRequest() {
        return new SeatRequest();
    }

    /**
     * Create an instance of {@link ItineraryInfo }
     * 
     */
    public ItineraryInfo createItineraryInfo() {
        return new ItineraryInfo();
    }

    /**
     * Create an instance of {@link TicketAdvisory }
     * 
     */
    public TicketAdvisory createTicketAdvisory() {
        return new TicketAdvisory();
    }

    /**
     * Create an instance of {@link Package }
     * 
     */
    //public Package createPackage() {
     //   return new Package();
    //}

    /**
     * Create an instance of {@link ArrayOfFareInfo }
     * 
     */
    public ArrayOfFareInfo createArrayOfFareInfo() {
        return new ArrayOfFareInfo();
    }

    /**
     * Create an instance of {@link PickUpLocation }
     * 
     */
    public PickUpLocation createPickUpLocation() {
        return new PickUpLocation();
    }

    /**
     * Create an instance of {@link Description }
     * 
     */
    public Description createDescription() {
        return new Description();
    }

    /**
     * Create an instance of {@link CategorizedRemark }
     * 
     */
    public CategorizedRemark createCategorizedRemark() {
        return new CategorizedRemark();
    }

    /**
     * Create an instance of {@link ArrayOfOtherServiceInformation }
     * 
     */
    public ArrayOfOtherServiceInformation createArrayOfOtherServiceInformation() {
        return new ArrayOfOtherServiceInformation();
    }

    /**
     * Create an instance of {@link LoyaltyRedemptionRS }
     * 
     */
    public LoyaltyRedemptionRS createLoyaltyRedemptionRS() {
        return new LoyaltyRedemptionRS();
    }

    /**
     * Create an instance of {@link PublishedFares }
     * 
     */
    public PublishedFares createPublishedFares() {
        return new PublishedFares();
    }

    /**
     * Create an instance of {@link ProfileRef }
     * 
     */
    public ProfileRef createProfileRef() {
        return new ProfileRef();
    }

    /**
     * Create an instance of {@link CitizenCountryNameRS }
     * 
     */
    public CitizenCountryNameRS createCitizenCountryNameRS() {
        return new CitizenCountryNameRS();
    }

    /**
     * Create an instance of {@link RoomType }
     * 
     */
    public RoomType createRoomType() {
        return new RoomType();
    }

    /**
     * Create an instance of {@link PaymentDetail }
     * 
     */
    public PaymentDetail createPaymentDetail() {
        return new PaymentDetail();
    }

    /**
     * Create an instance of {@link TotalFareRS }
     * 
     */
    public TotalFareRS createTotalFareRS() {
        return new TotalFareRS();
    }

    /**
     * Create an instance of {@link AgencyDataServiceFee }
     * 
     */
    public AgencyDataServiceFee createAgencyDataServiceFee() {
        return new AgencyDataServiceFee();
    }

    /**
     * Create an instance of {@link Fee }
     * 
     */
    public Fee createFee() {
        return new Fee();
    }

    /**
     * Create an instance of {@link FormOfPaymentRS }
     * 
     */
    public FormOfPaymentRS createFormOfPaymentRS() {
        return new FormOfPaymentRS();
    }

    /**
     * Create an instance of {@link Veh }
     * 
     */
    public Veh createVeh() {
        return new Veh();
    }

    /**
     * Create an instance of {@link AutomatedTicket }
     * 
     */
    public AutomatedTicket createAutomatedTicket() {
        return new AutomatedTicket();
    }

    /**
     * Create an instance of {@link SpecialReqDetails }
     * 
     */
    public SpecialReqDetails createSpecialReqDetails() {
        return new SpecialReqDetails();
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
     * Create an instance of {@link DirectBill }
     * 
     */
    public DirectBill createDirectBill() {
        return new DirectBill();
    }

    /**
     * Create an instance of {@link Rail }
     * 
     */
    public Rail createRail() {
        return new Rail();
    }

    /**
     * Create an instance of {@link AdditionalDetail }
     * 
     */
    public AdditionalDetail createAdditionalDetail() {
        return new AdditionalDetail();
    }

    /**
     * Create an instance of {@link VendorPref }
     * 
     */
    public VendorPref createVendorPref() {
        return new VendorPref();
    }

    /**
     * Create an instance of {@link CardIssuerNameRS }
     * 
     */
    public CardIssuerNameRS createCardIssuerNameRS() {
        return new CardIssuerNameRS();
    }

    /**
     * Create an instance of {@link BaseFareRS }
     * 
     */
    public BaseFareRS createBaseFareRS() {
        return new BaseFareRS();
    }

    /**
     * Create an instance of {@link MaximumStay }
     * 
     */
    public MaximumStay createMaximumStay() {
        return new MaximumStay();
    }

    /**
     * Create an instance of {@link ArrayOfCommentRS }
     * 
     */
    public ArrayOfCommentRS createArrayOfCommentRS() {
        return new ArrayOfCommentRS();
    }

    /**
     * Create an instance of {@link ElectronicTicket }
     * 
     */
    public ElectronicTicket createElectronicTicket() {
        return new ElectronicTicket();
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
     * Create an instance of {@link PaymentAmountRS }
     * 
     */
    public PaymentAmountRS createPaymentAmountRS() {
        return new PaymentAmountRS();
    }

    /**
     * Create an instance of {@link Deadline }
     * 
     */
    public Deadline createDeadline() {
        return new Deadline();
    }

    /**
     * Create an instance of {@link SpecialRequestDetails }
     * 
     */
    public SpecialRequestDetails createSpecialRequestDetails() {
        return new SpecialRequestDetails();
    }

    /**
     * Create an instance of {@link CustomerInfosRS }
     * 
     */
    public CustomerInfosRS createCustomerInfosRS() {
        return new CustomerInfosRS();
    }

    /**
     * Create an instance of {@link ArrayOfFlightSegment }
     * 
     */
    public ArrayOfFlightSegment createArrayOfFlightSegment() {
        return new ArrayOfFlightSegment();
    }

    /**
     * Create an instance of {@link MiscChargeOrderRS }
     * 
     */
    public MiscChargeOrderRS createMiscChargeOrderRS() {
        return new MiscChargeOrderRS();
    }

    /**
     * Create an instance of {@link ArrayOfCarOption }
     * 
     */
    public ArrayOfCarOption createArrayOfCarOption() {
        return new ArrayOfCarOption();
    }

    /**
     * Create an instance of {@link PenaltyRS }
     * 
     */
    public PenaltyRS createPenaltyRS() {
        return new PenaltyRS();
    }

    /**
     * Create an instance of {@link TaxRS }
     * 
     */
    public TaxRS createTaxRS() {
        return new TaxRS();
    }

    /**
     * Create an instance of {@link ArrivalAirport }
     * 
     */
    public ArrivalAirport createArrivalAirport() {
        return new ArrivalAirport();
    }

    /**
     * Create an instance of {@link ArrayOfRoomRate }
     * 
     */
    public ArrayOfRoomRate createArrayOfRoomRate() {
        return new ArrayOfRoomRate();
    }

    /**
     * Create an instance of {@link VehResRQInfo }
     * 
     */
    public VehResRQInfo createVehResRQInfo() {
        return new VehResRQInfo();
    }

    /**
     * Create an instance of {@link RoomTypeRS }
     * 
     */
    public RoomTypeRS createRoomTypeRS() {
        return new RoomTypeRS();
    }

    /**
     * Create an instance of {@link TravelerRefNumber }
     * 
     */
    public TravelerRefNumber createTravelerRefNumber() {
        return new TravelerRefNumber();
    }

    /**
     * Create an instance of {@link AssociatedContent }
     * 
     */
    public AssociatedContent createAssociatedContent() {
        return new AssociatedContent();
    }

    /**
     * Create an instance of {@link Cost }
     * 
     */
    public Cost createCost() {
        return new Cost();
    }

    /**
     * Create an instance of {@link Source }
     * 
     */
    public Source createSource() {
        return new Source();
    }

    /**
     * Create an instance of {@link Segment }
     * 
     */
    public Segment createSegment() {
        return new Segment();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialRemark }
     * 
     */
    public ArrayOfSpecialRemark createArrayOfSpecialRemark() {
        return new ArrayOfSpecialRemark();
    }

    /**
     * Create an instance of {@link OperatingCompany }
     * 
     */
    public OperatingCompany createOperatingCompany() {
        return new OperatingCompany();
    }

    /**
     * Create an instance of {@link BasicPropertyInfo }
     * 
     */
    public BasicPropertyInfo createBasicPropertyInfo() {
        return new BasicPropertyInfo();
    }

    /**
     * Create an instance of {@link AirTraveler }
     * 
     */
    public AirTraveler createAirTraveler() {
        return new AirTraveler();
    }

    /**
     * Create an instance of {@link PassengerFare }
     * 
     */
    public PassengerFare createPassengerFare() {
        return new PassengerFare();
    }

    /**
     * Create an instance of {@link Pricing }
     * 
     */
    public Pricing createPricing() {
        return new Pricing();
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
     * Create an instance of {@link RequiredPayment }
     * 
     */
    public RequiredPayment createRequiredPayment() {
        return new RequiredPayment();
    }

    /**
     * Create an instance of {@link AcceptedPayment }
     * 
     */
    public AcceptedPayment createAcceptedPayment() {
        return new AcceptedPayment();
    }

    /**
     * Create an instance of {@link RatePlanDescription }
     * 
     */
    public RatePlanDescription createRatePlanDescription() {
        return new RatePlanDescription();
    }

    /**
     * Create an instance of {@link FareRules }
     * 
     */
    public FareRules createFareRules() {
        return new FareRules();
    }

    /**
     * Create an instance of {@link Voucher }
     * 
     */
    public Voucher createVoucher() {
        return new Voucher();
    }

    /**
     * Create an instance of {@link RateDistance }
     * 
     */
    public RateDistance createRateDistance() {
        return new RateDistance();
    }

    /**
     * Create an instance of {@link Additional }
     * 
     */
    public Additional createAdditional() {
        return new Additional();
    }

    /**
     * Create an instance of {@link Total }
     * 
     */
    public Total createTotal() {
        return new Total();
    }

    /**
     * Create an instance of {@link ItinTotalFareRS }
     * 
     */
    public ItinTotalFareRS createItinTotalFareRS() {
        return new ItinTotalFareRS();
    }

    /**
     * Create an instance of {@link OriginRailwayStation }
     * 
     */
    public OriginRailwayStation createOriginRailwayStation() {
        return new OriginRailwayStation();
    }

    /**
     * Create an instance of {@link ConfID }
     * 
     */
    public ConfID createConfID() {
        return new ConfID();
    }

    /**
     * Create an instance of {@link PassengerFareRS }
     * 
     */
    public PassengerFareRS createPassengerFareRS() {
        return new PassengerFareRS();
    }

    /**
     * Create an instance of {@link HotelData }
     * 
     */
    public HotelData createHotelData() {
        return new HotelData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripXML }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "TripXML")
    public JAXBElement<TripXML> createTripXML(TripXML value) {
        return new JAXBElement<TripXML>(_TripXML_QNAME, TripXML.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountingInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "AccountingInfo", scope = TPAExtensionsRS.class)
    public JAXBElement<AccountingInfo> createTPAExtensionsRSAccountingInfo(AccountingInfo value) {
        return new JAXBElement<AccountingInfo>(_TPAExtensionsRSAccountingInfo_QNAME, AccountingInfo.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "Crib", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSCrib(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSCrib_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "CorporateDiscount", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSCorporateDiscount(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSCorporateDiscount_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "AccountingLine", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSAccountingLine(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSAccountingLine_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "MealPlan", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSMealPlan(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSMealPlan_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FuturePriceInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "FuturePriceInfo", scope = TPAExtensionsRS.class)
    public JAXBElement<FuturePriceInfo> createTPAExtensionsRSFuturePriceInfo(FuturePriceInfo value) {
        return new JAXBElement<FuturePriceInfo>(_TPAExtensionsRSFuturePriceInfo_QNAME, FuturePriceInfo.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentCardRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "PaymentCard", scope = TPAExtensionsRS.class)
    public JAXBElement<PaymentCardRS> createTPAExtensionsRSPaymentCard(PaymentCardRS value) {
        return new JAXBElement<PaymentCardRS>(_TPAExtensionsRSPaymentCard_QNAME, PaymentCardRS.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestinationRailwayStation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "DestinationRailwayStation", scope = TPAExtensionsRS.class)
    public JAXBElement<DestinationRailwayStation> createTPAExtensionsRSDestinationRailwayStation(DestinationRailwayStation value) {
        return new JAXBElement<DestinationRailwayStation>(_TPAExtensionsRSDestinationRailwayStation_QNAME, DestinationRailwayStation.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "GuestLastName", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSGuestLastName(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSGuestLastName_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "ExtraChild", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSExtraChild(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSExtraChild_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "GuestFirstName", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSGuestFirstName(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSGuestFirstName_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "SupplementalInfo", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSSupplementalInfo(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSSupplementalInfo_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgencyCommission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "AgencyCommission", scope = TPAExtensionsRS.class)
    public JAXBElement<AgencyCommission> createTPAExtensionsRSAgencyCommission(AgencyCommission value) {
        return new JAXBElement<AgencyCommission>(_TPAExtensionsRSAgencyCommission_QNAME, AgencyCommission.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "ExtraAdult", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSExtraAdult(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSExtraAdult_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "TourNumber", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSTourNumber(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSTourNumber_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "OverrideCorporateRate", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSOverrideCorporateRate(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSOverrideCorporateRate_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "AlternateCurrency", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSAlternateCurrency(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSAlternateCurrency_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "Arnk", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSArnk(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSArnk_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssuedTickets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "IssuedTickets", scope = TPAExtensionsRS.class)
    public JAXBElement<IssuedTickets> createTPAExtensionsRSIssuedTickets(IssuedTickets value) {
        return new JAXBElement<IssuedTickets>(_TPAExtensionsRSIssuedTickets_QNAME, IssuedTickets.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "OriginCityCode", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSOriginCityCode(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSOriginCityCode_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vendor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "Vendor", scope = TPAExtensionsRS.class)
    public JAXBElement<Vendor> createTPAExtensionsRSVendor(Vendor value) {
        return new JAXBElement<Vendor>(_TPAExtensionsRSVendor_QNAME, Vendor.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareRules }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "FareRules", scope = TPAExtensionsRS.class)
    public JAXBElement<FareRules> createTPAExtensionsRSFareRules(FareRules value) {
        return new JAXBElement<FareRules>(_TPAExtensionsRSFareRules_QNAME, FareRules.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "ValidatingAirlineCode", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSValidatingAirlineCode(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSValidatingAirlineCode_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "Rules", scope = TPAExtensionsRS.class)
    public JAXBElement<ArrayOfString3> createTPAExtensionsRSRules(ArrayOfString3 value) {
        return new JAXBElement<ArrayOfString3>(_TPAExtensionsRSRules_QNAME, ArrayOfString3 .class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "PaymentRestrictions", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSPaymentRestrictions(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSPaymentRestrictions_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCarOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "CarOptions", scope = TPAExtensionsRS.class)
    public JAXBElement<ArrayOfCarOption> createTPAExtensionsRSCarOptions(ArrayOfCarOption value) {
        return new JAXBElement<ArrayOfCarOption>(_TPAExtensionsRSCarOptions_QNAME, ArrayOfCarOption.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "RateQuoted", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSRateQuoted(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSRateQuoted_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "RollawayAdult", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSRollawayAdult(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSRollawayAdult_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "RoomLocation", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSRoomLocation(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSRoomLocation_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgencyServiceFee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "AgencyServiceFee", scope = TPAExtensionsRS.class)
    public JAXBElement<AgencyServiceFee> createTPAExtensionsRSAgencyServiceFee(AgencyServiceFee value) {
        return new JAXBElement<AgencyServiceFee>(_TPAExtensionsRSAgencyServiceFee_QNAME, AgencyServiceFee.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginRailwayStation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "OriginRailwayStation", scope = TPAExtensionsRS.class)
    public JAXBElement<OriginRailwayStation> createTPAExtensionsRSOriginRailwayStation(OriginRailwayStation value) {
        return new JAXBElement<OriginRailwayStation>(_TPAExtensionsRSOriginRailwayStation_QNAME, OriginRailwayStation.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "CarType", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSCarType(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSCarType_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "RateRequested", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSRateRequested(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSRateRequested_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "MerchantCurrency", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSMerchantCurrency(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSMerchantCurrency_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "AdvancedDeposit", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSAdvancedDeposit(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSAdvancedDeposit_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "FareCalculation", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSFareCalculation(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSFareCalculation_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "RollawayChild", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSRollawayChild(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSRollawayChild_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BagAllowance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "BagAllowance", scope = TPAExtensionsRS.class)
    public JAXBElement<BagAllowance> createTPAExtensionsRSBagAllowance(BagAllowance value) {
        return new JAXBElement<BagAllowance>(_TPAExtensionsRSBagAllowance_QNAME, BagAllowance.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingAirline }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "OperatingAirline", scope = Air.class)
    public JAXBElement<OperatingAirline> createAirOperatingAirline(OperatingAirline value) {
        return new JAXBElement<OperatingAirline>(_AirOperatingAirline_QNAME, OperatingAirline.class, Air.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSeat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "Seats", scope = Air.class)
    public JAXBElement<ArrayOfSeat> createAirSeats(ArrayOfSeat value) {
        return new JAXBElement<ArrayOfSeat>(_AirSeats_QNAME, ArrayOfSeat.class, Air.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepartureAirport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "DepartureAirport", scope = Air.class)
    public JAXBElement<DepartureAirport> createAirDepartureAirport(DepartureAirport value) {
        return new JAXBElement<DepartureAirport>(_AirDepartureAirport_QNAME, DepartureAirport.class, Air.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "MarriageGrp", scope = Air.class)
    public JAXBElement<String> createAirMarriageGrp(String value) {
        return new JAXBElement<String>(_AirMarriageGrp_QNAME, String.class, Air.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TPAExtensionsRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "TPA_Extensions", scope = Air.class)
    public JAXBElement<TPAExtensionsRS> createAirTPAExtensions(TPAExtensionsRS value) {
        return new JAXBElement<TPAExtensionsRS>(_AirTPAExtensions_QNAME, TPAExtensionsRS.class, Air.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketingAirline }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "MarketingAirline", scope = Air.class)
    public JAXBElement<MarketingAirline> createAirMarketingAirline(MarketingAirline value) {
        return new JAXBElement<MarketingAirline>(_AirMarketingAirline_QNAME, MarketingAirline.class, Air.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrivalAirport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "ArrivalAirport", scope = Air.class)
    public JAXBElement<ArrivalAirport> createAirArrivalAirport(ArrivalAirport value) {
        return new JAXBElement<ArrivalAirport>(_AirArrivalAirport_QNAME, ArrivalAirport.class, Air.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Equipment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsTravelBuild", name = "Equipment", scope = Air.class)
    public JAXBElement<Equipment> createAirEquipment(Equipment value) {
        return new JAXBElement<Equipment>(_AirEquipment_QNAME, Equipment.class, Air.class, value);
    }

}
