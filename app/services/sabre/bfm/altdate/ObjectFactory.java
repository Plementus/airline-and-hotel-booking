
package services.sabre.bfm.altdate;

import java.lang.*;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bfm.altdate package. 
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

    private final static QName _ConversationId_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "ConversationId");
    private final static QName _SPKIData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SPKIData");
    private final static QName _TPAExtensions_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "TPA_Extensions");
    private final static QName _Action_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "Action");
    private final static QName _Envelope_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Envelope");
    private final static QName _Fault_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Fault");
    private final static QName _KeyInfo_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyInfo");
    private final static QName _SignatureValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureValue");
    private final static QName _Timestamp_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "Timestamp");
    private final static QName _KeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyValue");
    private final static QName _RefToMessageId_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "RefToMessageId");
    private final static QName _Body_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Body");
    private final static QName _Transforms_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Transforms");
    private final static QName _DigestMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestMethod");
    private final static QName _SequenceNumber_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "SequenceNumber");
    private final static QName _DuplicateElimination_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "DuplicateElimination");
    private final static QName _X509Data_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509Data");
    private final static QName _SignatureProperty_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureProperty");
    private final static QName _TimeToLive_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "TimeToLive");
    private final static QName _KeyName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyName");
    private final static QName _RSAKeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "RSAKeyValue");
    private final static QName _Signature_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
    private final static QName _Timeout_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "Timeout");
    private final static QName _MgmtData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "MgmtData");
    private final static QName _SignatureMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureMethod");
    private final static QName _Object_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Object");
    private final static QName _SignatureProperties_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureProperties");
    private final static QName _Transform_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Transform");
    private final static QName _PGPData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "PGPData");
    private final static QName _Reference_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Reference");
    private final static QName _RetrievalMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "RetrievalMethod");
    private final static QName _DSAKeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DSAKeyValue");
    private final static QName _DigestValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestValue");
    private final static QName _CPAId_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "CPAId");
    private final static QName _CanonicalizationMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "CanonicalizationMethod");
    private final static QName _Header_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Header");
    private final static QName _SignedInfo_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignedInfo");
    private final static QName _MessageId_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "MessageId");
    private final static QName _Manifest_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Manifest");
    private final static QName _X509DataTypeX509IssuerSerial_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509IssuerSerial");
    private final static QName _X509DataTypeX509CRL_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509CRL");
    private final static QName _X509DataTypeX509SubjectName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SubjectName");
    private final static QName _X509DataTypeX509SKI_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SKI");
    private final static QName _X509DataTypeX509Certificate_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509Certificate");
    private final static QName _SignatureMethodTypeHMACOutputLength_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "HMACOutputLength");
    private final static QName _SPKIDataTypeSPKISexp_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SPKISexp");
    private final static QName _TransformTypeXPath_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "XPath");
    private final static QName _PriceRequestInformationTypeNegotiatedFareCodeSupplier_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Supplier");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bfm.altdate
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRQ }
     * 
     */
    public OTAAirLowFareSearchRQ createOTAAirLowFareSearchRQ() {
        return new OTAAirLowFareSearchRQ();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRS }
     * 
     */
    public OTAAirLowFareSearchRS createOTAAirLowFareSearchRS() {
        return new OTAAirLowFareSearchRS();
    }

    /**
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link TravelDateTimeType }
     * 
     */
    public TravelDateTimeType createTravelDateTimeType() {
        return new TravelDateTimeType();
    }

    /**
     * Create an instance of {@link OriginDestinationInformationType }
     * 
     */
    public OriginDestinationInformationType createOriginDestinationInformationType() {
        return new OriginDestinationInformationType();
    }

    /**
     * Create an instance of {@link TravelDateTimeType.DepartureDates }
     * 
     */
    public TravelDateTimeType.DepartureDates createTravelDateTimeTypeDepartureDates() {
        return new TravelDateTimeType.DepartureDates();
    }

    /**
     * Create an instance of {@link PricedItineraryType }
     * 
     */
    public PricedItineraryType createPricedItineraryType() {
        return new PricedItineraryType();
    }

    /**
     * Create an instance of {@link PricedItineraryType.TPAExtensions }
     * 
     */
    public PricedItineraryType.TPAExtensions createPricedItineraryTypeTPAExtensions() {
        return new PricedItineraryType.TPAExtensions();
    }

    /**
     * Create an instance of {@link PricedItineraryType.TPAExtensions.Ops }
     * 
     */
    public PricedItineraryType.TPAExtensions.Ops createPricedItineraryTypeTPAExtensionsOps() {
        return new PricedItineraryType.TPAExtensions.Ops();
    }

    /**
     * Create an instance of {@link PricedItineraryType.TPAExtensions.Ops.FareTypes }
     * 
     */
    public PricedItineraryType.TPAExtensions.Ops.FareTypes createPricedItineraryTypeTPAExtensionsOpsFareTypes() {
        return new PricedItineraryType.TPAExtensions.Ops.FareTypes();
    }

    /**
     * Create an instance of {@link PricedItineraryType.TPAExtensions.AdditionalFares }
     * 
     */
    public PricedItineraryType.TPAExtensions.AdditionalFares createPricedItineraryTypeTPAExtensionsAdditionalFares() {
        return new PricedItineraryType.TPAExtensions.AdditionalFares();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType }
     * 
     */
    public AirItineraryPricingInfoType createAirItineraryPricingInfoType() {
        return new AirItineraryPricingInfoType();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.TPAExtensions }
     * 
     */
    public AirItineraryPricingInfoType.TPAExtensions createAirItineraryPricingInfoTypeTPAExtensions() {
        return new AirItineraryPricingInfoType.TPAExtensions();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.TPAExtensions.Legs }
     * 
     */
    public AirItineraryPricingInfoType.TPAExtensions.Legs createAirItineraryPricingInfoTypeTPAExtensionsLegs() {
        return new AirItineraryPricingInfoType.TPAExtensions.Legs();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.TPAExtensions.Legs.Leg }
     * 
     */
    public AirItineraryPricingInfoType.TPAExtensions.Legs.Leg createAirItineraryPricingInfoTypeTPAExtensionsLegsLeg() {
        return new AirItineraryPricingInfoType.TPAExtensions.Legs.Leg();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.TPAExtensions.AncillaryFeeGroups }
     * 
     */
    public AirItineraryPricingInfoType.TPAExtensions.AncillaryFeeGroups createAirItineraryPricingInfoTypeTPAExtensionsAncillaryFeeGroups() {
        return new AirItineraryPricingInfoType.TPAExtensions.AncillaryFeeGroups();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.TPAExtensions.AncillaryFeeGroups.AncillaryFeeGroup }
     * 
     */
    public AirItineraryPricingInfoType.TPAExtensions.AncillaryFeeGroups.AncillaryFeeGroup createAirItineraryPricingInfoTypeTPAExtensionsAncillaryFeeGroupsAncillaryFeeGroup() {
        return new AirItineraryPricingInfoType.TPAExtensions.AncillaryFeeGroups.AncillaryFeeGroup();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.FareInfos }
     * 
     */
    public AirItineraryPricingInfoType.FareInfos createAirItineraryPricingInfoTypeFareInfos() {
        return new AirItineraryPricingInfoType.FareInfos();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.FareInfos.FareInfo }
     * 
     */
    public AirItineraryPricingInfoType.FareInfos.FareInfo createAirItineraryPricingInfoTypeFareInfosFareInfo() {
        return new AirItineraryPricingInfoType.FareInfos.FareInfo();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.FareInfos.FareInfo.TPAExtensions }
     * 
     */
    public AirItineraryPricingInfoType.FareInfos.FareInfo.TPAExtensions createAirItineraryPricingInfoTypeFareInfosFareInfoTPAExtensions() {
        return new AirItineraryPricingInfoType.FareInfos.FareInfo.TPAExtensions();
    }

    /**
     * Create an instance of {@link AdvResTicketingType }
     * 
     */
    public AdvResTicketingType createAdvResTicketingType() {
        return new AdvResTicketingType();
    }

    /**
     * Create an instance of {@link VoluntaryChangesType }
     * 
     */
    public VoluntaryChangesType createVoluntaryChangesType() {
        return new VoluntaryChangesType();
    }

    /**
     * Create an instance of {@link TicketPricingType }
     * 
     */
    public TicketPricingType createTicketPricingType() {
        return new TicketPricingType();
    }

    /**
     * Create an instance of {@link TicketPricingType.TPAExtensions }
     * 
     */
    public TicketPricingType.TPAExtensions createTicketPricingTypeTPAExtensions() {
        return new TicketPricingType.TPAExtensions();
    }

    /**
     * Create an instance of {@link TicketPricingType.OriginDestinationOptions }
     * 
     */
    public TicketPricingType.OriginDestinationOptions createTicketPricingTypeOriginDestinationOptions() {
        return new TicketPricingType.OriginDestinationOptions();
    }

    /**
     * Create an instance of {@link TicketPricingType.OriginDestinationOptions.OriginDestinationOption }
     * 
     */
    public TicketPricingType.OriginDestinationOptions.OriginDestinationOption createTicketPricingTypeOriginDestinationOptionsOriginDestinationOption() {
        return new TicketPricingType.OriginDestinationOptions.OriginDestinationOption();
    }

    /**
     * Create an instance of {@link TransactionType }
     * 
     */
    public TransactionType createTransactionType() {
        return new TransactionType();
    }

    /**
     * Create an instance of {@link TransactionType.FareOverrides }
     * 
     */
    public TransactionType.FareOverrides createTransactionTypeFareOverrides() {
        return new TransactionType.FareOverrides();
    }

    /**
     * Create an instance of {@link FareMessagesType }
     * 
     */
    public FareMessagesType createFareMessagesType() {
        return new FareMessagesType();
    }

    /**
     * Create an instance of {@link FareType }
     * 
     */
    public FareType createFareType() {
        return new FareType();
    }

    /**
     * Create an instance of {@link FareType.TPAExtensions }
     * 
     */
    public FareType.TPAExtensions createFareTypeTPAExtensions() {
        return new FareType.TPAExtensions();
    }

    /**
     * Create an instance of {@link FareType.TPAExtensions.FareComponents }
     * 
     */
    public FareType.TPAExtensions.FareComponents createFareTypeTPAExtensionsFareComponents() {
        return new FareType.TPAExtensions.FareComponents();
    }

    /**
     * Create an instance of {@link SummaryPriceInformation }
     * 
     */
    public SummaryPriceInformation createSummaryPriceInformation() {
        return new SummaryPriceInformation();
    }

    /**
     * Create an instance of {@link FareType.TPAExtensions.Legs }
     * 
     */
    public FareType.TPAExtensions.Legs createFareTypeTPAExtensionsLegs() {
        return new FareType.TPAExtensions.Legs();
    }

    /**
     * Create an instance of {@link FareType.Taxes }
     * 
     */
    public FareType.Taxes createFareTypeTaxes() {
        return new FareType.Taxes();
    }

    /**
     * Create an instance of {@link FareType.Taxes.LegsTaxes }
     * 
     */
    public FareType.Taxes.LegsTaxes createFareTypeTaxesLegsTaxes() {
        return new FareType.Taxes.LegsTaxes();
    }

    /**
     * Create an instance of {@link ConnectionType }
     * 
     */
    public ConnectionType createConnectionType() {
        return new ConnectionType();
    }

    /**
     * Create an instance of {@link StayRestrictionsType }
     * 
     */
    public StayRestrictionsType createStayRestrictionsType() {
        return new StayRestrictionsType();
    }

    /**
     * Create an instance of {@link RuleInfoType }
     * 
     */
    public RuleInfoType createRuleInfoType() {
        return new RuleInfoType();
    }

    /**
     * Create an instance of {@link FareComponentTaxesType }
     * 
     */
    public FareComponentTaxesType createFareComponentTaxesType() {
        return new FareComponentTaxesType();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType }
     * 
     */
    public BookFlightSegmentType createBookFlightSegmentType() {
        return new BookFlightSegmentType();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType.TPAExtensions }
     * 
     */
    public BookFlightSegmentType.TPAExtensions createBookFlightSegmentTypeTPAExtensions() {
        return new BookFlightSegmentType.TPAExtensions();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType.StopAirports }
     * 
     */
    public BookFlightSegmentType.StopAirports createBookFlightSegmentTypeStopAirports() {
        return new BookFlightSegmentType.StopAirports();
    }

    /**
     * Create an instance of {@link PassengerTypeQuantityType }
     * 
     */
    public PassengerTypeQuantityType createPassengerTypeQuantityType() {
        return new PassengerTypeQuantityType();
    }

    /**
     * Create an instance of {@link PassengerTypeQuantityType.TPAExtensions }
     * 
     */
    public PassengerTypeQuantityType.TPAExtensions createPassengerTypeQuantityTypeTPAExtensions() {
        return new PassengerTypeQuantityType.TPAExtensions();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType }
     * 
     */
    public PTCFareBreakdownType createPTCFareBreakdownType() {
        return new PTCFareBreakdownType();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.FareInfos }
     * 
     */
    public PTCFareBreakdownType.FareInfos createPTCFareBreakdownTypeFareInfos() {
        return new PTCFareBreakdownType.FareInfos();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.FareInfos.FareInfo }
     * 
     */
    public PTCFareBreakdownType.FareInfos.FareInfo createPTCFareBreakdownTypeFareInfosFareInfo() {
        return new PTCFareBreakdownType.FareInfos.FareInfo();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.FareInfos.FareInfo.TPAExtensions }
     * 
     */
    public PTCFareBreakdownType.FareInfos.FareInfo.TPAExtensions createPTCFareBreakdownTypeFareInfosFareInfoTPAExtensions() {
        return new PTCFareBreakdownType.FareInfos.FareInfo.TPAExtensions();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.TPAExtensions }
     * 
     */
    public PTCFareBreakdownType.TPAExtensions createPTCFareBreakdownTypeTPAExtensions() {
        return new PTCFareBreakdownType.TPAExtensions();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.Endorsements }
     * 
     */
    public PTCFareBreakdownType.Endorsements createPTCFareBreakdownTypeEndorsements() {
        return new PTCFareBreakdownType.Endorsements();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.FareBasisCodes }
     * 
     */
    public PTCFareBreakdownType.FareBasisCodes createPTCFareBreakdownTypeFareBasisCodes() {
        return new PTCFareBreakdownType.FareBasisCodes();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType }
     * 
     */
    public PriceRequestInformationType createPriceRequestInformationType() {
        return new PriceRequestInformationType();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.TPAExtensions }
     * 
     */
    public PriceRequestInformationType.TPAExtensions createPriceRequestInformationTypeTPAExtensions() {
        return new PriceRequestInformationType.TPAExtensions();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.TPAExtensions.BrandedFareIndicators }
     * 
     */
    public PriceRequestInformationType.TPAExtensions.BrandedFareIndicators createPriceRequestInformationTypeTPAExtensionsBrandedFareIndicators() {
        return new PriceRequestInformationType.TPAExtensions.BrandedFareIndicators();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.TPAExtensions.Indicators }
     * 
     */
    public PriceRequestInformationType.TPAExtensions.Indicators createPriceRequestInformationTypeTPAExtensionsIndicators() {
        return new PriceRequestInformationType.TPAExtensions.Indicators();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.TPAExtensions.Priority }
     * 
     */
    public PriceRequestInformationType.TPAExtensions.Priority createPriceRequestInformationTypeTPAExtensionsPriority() {
        return new PriceRequestInformationType.TPAExtensions.Priority();
    }

    /**
     * Create an instance of {@link BaggageInformationType }
     * 
     */
    public BaggageInformationType createBaggageInformationType() {
        return new BaggageInformationType();
    }

    /**
     * Create an instance of {@link AirTravelerType }
     * 
     */
    public AirTravelerType createAirTravelerType() {
        return new AirTravelerType();
    }

    /**
     * Create an instance of {@link FlexibleFaresType }
     * 
     */
    public FlexibleFaresType createFlexibleFaresType() {
        return new FlexibleFaresType();
    }

    /**
     * Create an instance of {@link FlexibleFaresType.FareParameters }
     * 
     */
    public FlexibleFaresType.FareParameters createFlexibleFaresTypeFareParameters() {
        return new FlexibleFaresType.FareParameters();
    }

    /**
     * Create an instance of {@link ItinTotalFareType }
     * 
     */
    public ItinTotalFareType createItinTotalFareType() {
        return new ItinTotalFareType();
    }

    /**
     * Create an instance of {@link AirItineraryType }
     * 
     */
    public AirItineraryType createAirItineraryType() {
        return new AirItineraryType();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRS.TPAExtensions }
     * 
     */
    public OTAAirLowFareSearchRS.TPAExtensions createOTAAirLowFareSearchRSTPAExtensions() {
        return new OTAAirLowFareSearchRS.TPAExtensions();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRS.TPAExtensions.AirlineOrderList }
     * 
     */
    public OTAAirLowFareSearchRS.TPAExtensions.AirlineOrderList createOTAAirLowFareSearchRSTPAExtensionsAirlineOrderList() {
        return new OTAAirLowFareSearchRS.TPAExtensions.AirlineOrderList();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRS.OneWayItineraries }
     * 
     */
    public OTAAirLowFareSearchRS.OneWayItineraries createOTAAirLowFareSearchRSOneWayItineraries() {
        return new OTAAirLowFareSearchRS.OneWayItineraries();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRQ.TPAExtensions }
     * 
     */
    public OTAAirLowFareSearchRQ.TPAExtensions createOTAAirLowFareSearchRQTPAExtensions() {
        return new OTAAirLowFareSearchRQ.TPAExtensions();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRQ.TPAExtensions.AlternateAirportCities }
     * 
     */
    public OTAAirLowFareSearchRQ.TPAExtensions.AlternateAirportCities createOTAAirLowFareSearchRQTPAExtensionsAlternateAirportCities() {
        return new OTAAirLowFareSearchRQ.TPAExtensions.AlternateAirportCities();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRQ.TPAExtensions.MessagingDetails }
     * 
     */
    public OTAAirLowFareSearchRQ.TPAExtensions.MessagingDetails createOTAAirLowFareSearchRQTPAExtensionsMessagingDetails() {
        return new OTAAirLowFareSearchRQ.TPAExtensions.MessagingDetails();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType }
     * 
     */
    public AirSearchPrefsType createAirSearchPrefsType() {
        return new AirSearchPrefsType();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.AncillaryFees }
     * 
     */
    public AirSearchPrefsType.AncillaryFees createAirSearchPrefsTypeAncillaryFees() {
        return new AirSearchPrefsType.AncillaryFees();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions }
     * 
     */
    public AirSearchPrefsType.TPAExtensions createAirSearchPrefsTypeTPAExtensions() {
        return new AirSearchPrefsType.TPAExtensions();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.DiversityParameters }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.DiversityParameters createAirSearchPrefsTypeTPAExtensionsDiversityParameters() {
        return new AirSearchPrefsType.TPAExtensions.DiversityParameters();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.DiversityParameters.TimeOfDayDistribution }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.DiversityParameters.TimeOfDayDistribution createAirSearchPrefsTypeTPAExtensionsDiversityParametersTimeOfDayDistribution() {
        return new AirSearchPrefsType.TPAExtensions.DiversityParameters.TimeOfDayDistribution();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRQ.OriginDestinationInformation }
     * 
     */
    public OTAAirLowFareSearchRQ.OriginDestinationInformation createOTAAirLowFareSearchRQOriginDestinationInformation() {
        return new OTAAirLowFareSearchRQ.OriginDestinationInformation();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions }
     * 
     */
    public OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions createOTAAirLowFareSearchRQOriginDestinationInformationTPAExtensions() {
        return new OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions();
    }

    /**
     * Create an instance of {@link CompressedResponse }
     * 
     */
    public CompressedResponse createCompressedResponse() {
        return new CompressedResponse();
    }

    /**
     * Create an instance of {@link TPAExtensionsType }
     * 
     */
    public TPAExtensionsType createTPAExtensionsType() {
        return new TPAExtensionsType();
    }

    /**
     * Create an instance of {@link POSType }
     * 
     */
    public POSType createPOSType() {
        return new POSType();
    }

    /**
     * Create an instance of {@link SpecificFlightInfoType }
     * 
     */
    public SpecificFlightInfoType createSpecificFlightInfoType() {
        return new SpecificFlightInfoType();
    }

    /**
     * Create an instance of {@link TravelerInfoSummaryType }
     * 
     */
    public TravelerInfoSummaryType createTravelerInfoSummaryType() {
        return new TravelerInfoSummaryType();
    }

    /**
     * Create an instance of {@link SuccessType }
     * 
     */
    public SuccessType createSuccessType() {
        return new SuccessType();
    }

    /**
     * Create an instance of {@link WarningsType }
     * 
     */
    public WarningsType createWarningsType() {
        return new WarningsType();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRS.PricedItineraries }
     * 
     */
    public OTAAirLowFareSearchRS.PricedItineraries createOTAAirLowFareSearchRSPricedItineraries() {
        return new OTAAirLowFareSearchRS.PricedItineraries();
    }

    /**
     * Create an instance of {@link ErrorsType }
     * 
     */
    public ErrorsType createErrorsType() {
        return new ErrorsType();
    }

    /**
     * Create an instance of {@link UnflownPriceType }
     * 
     */
    public UnflownPriceType createUnflownPriceType() {
        return new UnflownPriceType();
    }

    /**
     * Create an instance of {@link EmailType }
     * 
     */
    public EmailType createEmailType() {
        return new EmailType();
    }

    /**
     * Create an instance of {@link XOFaresType }
     * 
     */
    public XOFaresType createXOFaresType() {
        return new XOFaresType();
    }

    /**
     * Create an instance of {@link MileageDisplayType }
     * 
     */
    public MileageDisplayType createMileageDisplayType() {
        return new MileageDisplayType();
    }

    /**
     * Create an instance of {@link ValidatingCarrierType }
     * 
     */
    public ValidatingCarrierType createValidatingCarrierType() {
        return new ValidatingCarrierType();
    }

    /**
     * Create an instance of {@link BookingClassPrefType }
     * 
     */
    public BookingClassPrefType createBookingClassPrefType() {
        return new BookingClassPrefType();
    }

    /**
     * Create an instance of {@link StateProvType }
     * 
     */
    public StateProvType createStateProvType() {
        return new StateProvType();
    }

    /**
     * Create an instance of {@link TelephoneType }
     * 
     */
    public TelephoneType createTelephoneType() {
        return new TelephoneType();
    }

    /**
     * Create an instance of {@link FareInfoType }
     * 
     */
    public FareInfoType createFareInfoType() {
        return new FareInfoType();
    }

    /**
     * Create an instance of {@link OperatingAirlineType }
     * 
     */
    public OperatingAirlineType createOperatingAirlineType() {
        return new OperatingAirlineType();
    }

    /**
     * Create an instance of {@link AirTaxType }
     * 
     */
    public AirTaxType createAirTaxType() {
        return new AirTaxType();
    }

    /**
     * Create an instance of {@link ValidatingCarrierInfoType }
     * 
     */
    public ValidatingCarrierInfoType createValidatingCarrierInfoType() {
        return new ValidatingCarrierInfoType();
    }

    /**
     * Create an instance of {@link FareRestrictPrefType }
     * 
     */
    public FareRestrictPrefType createFareRestrictPrefType() {
        return new FareRestrictPrefType();
    }

    /**
     * Create an instance of {@link NumTripsType }
     * 
     */
    public NumTripsType createNumTripsType() {
        return new NumTripsType();
    }

    /**
     * Create an instance of {@link SurchargesType }
     * 
     */
    public SurchargesType createSurchargesType() {
        return new SurchargesType();
    }

    /**
     * Create an instance of {@link CurrencyAmountType }
     * 
     */
    public CurrencyAmountType createCurrencyAmountType() {
        return new CurrencyAmountType();
    }

    /**
     * Create an instance of {@link FlightStopsAsConnectionsType }
     * 
     */
    public FlightStopsAsConnectionsType createFlightStopsAsConnectionsType() {
        return new FlightStopsAsConnectionsType();
    }

    /**
     * Create an instance of {@link TravelerInformationType }
     * 
     */
    public TravelerInformationType createTravelerInformationType() {
        return new TravelerInformationType();
    }

    /**
     * Create an instance of {@link TicketsPricingType }
     * 
     */
    public TicketsPricingType createTicketsPricingType() {
        return new TicketsPricingType();
    }

    /**
     * Create an instance of {@link BookingChannelType }
     * 
     */
    public BookingChannelType createBookingChannelType() {
        return new BookingChannelType();
    }

    /**
     * Create an instance of {@link AirFeeType }
     * 
     */
    public AirFeeType createAirFeeType() {
        return new AirFeeType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link AwardShoppingType }
     * 
     */
    public AwardShoppingType createAwardShoppingType() {
        return new AwardShoppingType();
    }

    /**
     * Create an instance of {@link CabinPrefType }
     * 
     */
    public CabinPrefType createCabinPrefType() {
        return new CabinPrefType();
    }

    /**
     * Create an instance of {@link PricedItinerariesType }
     * 
     */
    public PricedItinerariesType createPricedItinerariesType() {
        return new PricedItinerariesType();
    }

    /**
     * Create an instance of {@link CustLoyaltyType }
     * 
     */
    public CustLoyaltyType createCustLoyaltyType() {
        return new CustLoyaltyType();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link TaxCodeType }
     * 
     */
    public TaxCodeType createTaxCodeType() {
        return new TaxCodeType();
    }

    /**
     * Create an instance of {@link SideTripType }
     * 
     */
    public SideTripType createSideTripType() {
        return new SideTripType();
    }

    /**
     * Create an instance of {@link WarningType }
     * 
     */
    public WarningType createWarningType() {
        return new WarningType();
    }

    /**
     * Create an instance of {@link ReservationType }
     * 
     */
    public ReservationType createReservationType() {
        return new ReservationType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link OCFeeType }
     * 
     */
    public OCFeeType createOCFeeType() {
        return new OCFeeType();
    }

    /**
     * Create an instance of {@link TravelerRefNumberType }
     * 
     */
    public TravelerRefNumberType createTravelerRefNumberType() {
        return new TravelerRefNumberType();
    }

    /**
     * Create an instance of {@link PointOfTicketingOverrideType }
     * 
     */
    public PointOfTicketingOverrideType createPointOfTicketingOverrideType() {
        return new PointOfTicketingOverrideType();
    }

    /**
     * Create an instance of {@link SourceType }
     * 
     */
    public SourceType createSourceType() {
        return new SourceType();
    }

    /**
     * Create an instance of {@link StreetNmbrType }
     * 
     */
    public StreetNmbrType createStreetNmbrType() {
        return new StreetNmbrType();
    }

    /**
     * Create an instance of {@link OriginDestinationOptionType }
     * 
     */
    public OriginDestinationOptionType createOriginDestinationOptionType() {
        return new OriginDestinationOptionType();
    }

    /**
     * Create an instance of {@link OptionsPerDatePairType }
     * 
     */
    public OptionsPerDatePairType createOptionsPerDatePairType() {
        return new OptionsPerDatePairType();
    }

    /**
     * Create an instance of {@link EquipmentType }
     * 
     */
    public EquipmentType createEquipmentType() {
        return new EquipmentType();
    }

    /**
     * Create an instance of {@link PointOfSaleOverrideType }
     * 
     */
    public PointOfSaleOverrideType createPointOfSaleOverrideType() {
        return new PointOfSaleOverrideType();
    }

    /**
     * Create an instance of {@link BaggageInformationListType }
     * 
     */
    public BaggageInformationListType createBaggageInformationListType() {
        return new BaggageInformationListType();
    }

    /**
     * Create an instance of {@link TicketingInfoRSType }
     * 
     */
    public TicketingInfoRSType createTicketingInfoRSType() {
        return new TicketingInfoRSType();
    }

    /**
     * Create an instance of {@link SourceBookingChannelType }
     * 
     */
    public SourceBookingChannelType createSourceBookingChannelType() {
        return new SourceBookingChannelType();
    }

    /**
     * Create an instance of {@link ApplyResidentDiscountType }
     * 
     */
    public ApplyResidentDiscountType createApplyResidentDiscountType() {
        return new ApplyResidentDiscountType();
    }

    /**
     * Create an instance of {@link TicketDistribPrefType }
     * 
     */
    public TicketDistribPrefType createTicketDistribPrefType() {
        return new TicketDistribPrefType();
    }

    /**
     * Create an instance of {@link FlightTypePrefType }
     * 
     */
    public FlightTypePrefType createFlightTypePrefType() {
        return new FlightTypePrefType();
    }

    /**
     * Create an instance of {@link RoutingLegType }
     * 
     */
    public RoutingLegType createRoutingLegType() {
        return new RoutingLegType();
    }

    /**
     * Create an instance of {@link AllianceType }
     * 
     */
    public AllianceType createAllianceType() {
        return new AllianceType();
    }

    /**
     * Create an instance of {@link OBFeeType }
     * 
     */
    public OBFeeType createOBFeeType() {
        return new OBFeeType();
    }

    /**
     * Create an instance of {@link EquipmentTypePref }
     * 
     */
    public EquipmentTypePref createEquipmentTypePref() {
        return new EquipmentTypePref();
    }

    /**
     * Create an instance of {@link CompanyNamePrefType }
     * 
     */
    public CompanyNamePrefType createCompanyNamePrefType() {
        return new CompanyNamePrefType();
    }

    /**
     * Create an instance of {@link TaxCodeAmountType }
     * 
     */
    public TaxCodeAmountType createTaxCodeAmountType() {
        return new TaxCodeAmountType();
    }

    /**
     * Create an instance of {@link UniqueIDType }
     * 
     */
    public UniqueIDType createUniqueIDType() {
        return new UniqueIDType();
    }

    /**
     * Create an instance of {@link CompanyNameType }
     * 
     */
    public CompanyNameType createCompanyNameType() {
        return new CompanyNameType();
    }

    /**
     * Create an instance of {@link AirportInformationType }
     * 
     */
    public AirportInformationType createAirportInformationType() {
        return new AirportInformationType();
    }

    /**
     * Create an instance of {@link RoutingDefinitionType }
     * 
     */
    public RoutingDefinitionType createRoutingDefinitionType() {
        return new RoutingDefinitionType();
    }

    /**
     * Create an instance of {@link FreeTextType }
     * 
     */
    public FreeTextType createFreeTextType() {
        return new FreeTextType();
    }

    /**
     * Create an instance of {@link TravelerCountType }
     * 
     */
    public TravelerCountType createTravelerCountType() {
        return new TravelerCountType();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link DepartureDaysType }
     * 
     */
    public DepartureDaysType createDepartureDaysType() {
        return new DepartureDaysType();
    }

    /**
     * Create an instance of {@link JumpCabinLogicType }
     * 
     */
    public JumpCabinLogicType createJumpCabinLogicType() {
        return new JumpCabinLogicType();
    }

    /**
     * Create an instance of {@link CountryNameType }
     * 
     */
    public CountryNameType createCountryNameType() {
        return new CountryNameType();
    }

    /**
     * Create an instance of {@link PositionType }
     * 
     */
    public PositionType createPositionType() {
        return new PositionType();
    }

    /**
     * Create an instance of {@link GoverningCarrierOverrideType }
     * 
     */
    public GoverningCarrierOverrideType createGoverningCarrierOverrideType() {
        return new GoverningCarrierOverrideType();
    }

    /**
     * Create an instance of {@link IncludeVendorPrefType }
     * 
     */
    public IncludeVendorPrefType createIncludeVendorPrefType() {
        return new IncludeVendorPrefType();
    }

    /**
     * Create an instance of {@link FareCalcLineType }
     * 
     */
    public FareCalcLineType createFareCalcLineType() {
        return new FareCalcLineType();
    }

    /**
     * Create an instance of {@link AirlineType }
     * 
     */
    public AirlineType createAirlineType() {
        return new AirlineType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link SyncReply }
     * 
     */
    public SyncReply createSyncReply() {
        return new SyncReply();
    }

    /**
     * Create an instance of {@link StatusRequest }
     * 
     */
    public StatusRequest createStatusRequest() {
        return new StatusRequest();
    }

    /**
     * Create an instance of {@link Description }
     * 
     */
    public Description createDescription() {
        return new Description();
    }

    /**
     * Create an instance of {@link Schema }
     * 
     */
    public Schema createSchema() {
        return new Schema();
    }

    /**
     * Create an instance of {@link AckRequested }
     * 
     */
    public AckRequested createAckRequested() {
        return new AckRequested();
    }

    /**
     * Create an instance of {@link SequenceNumberType }
     * 
     */
    public SequenceNumberType createSequenceNumberType() {
        return new SequenceNumberType();
    }

    /**
     * Create an instance of {@link Acknowledgment }
     * 
     */
    public Acknowledgment createAcknowledgment() {
        return new Acknowledgment();
    }

    /**
     * Create an instance of {@link From }
     * 
     */
    public From createFrom() {
        return new From();
    }

    /**
     * Create an instance of {@link PartyId }
     * 
     */
    public PartyId createPartyId() {
        return new PartyId();
    }

    /**
     * Create an instance of {@link Reference }
     * 
     */
    public Reference createReference() {
        return new Reference();
    }

    /**
     * Create an instance of {@link To }
     * 
     */
    public To createTo() {
        return new To();
    }

    /**
     * Create an instance of {@link MessageData }
     * 
     */
    public MessageData createMessageData() {
        return new MessageData();
    }

    /**
     * Create an instance of {@link MessageOrder }
     * 
     */
    public MessageOrder createMessageOrder() {
        return new MessageOrder();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link java.lang.Error }
     * 
     */
    public java.lang.Error createError() {
        return new java.lang.Error();
    }

    /**
     * Create an instance of {@link StatusResponse }
     * 
     */
    public StatusResponse createStatusResponse() {
        return new StatusResponse();
    }

    /**
     * Create an instance of {@link Manifest }
     * 
     */
    public Manifest createManifest() {
        return new Manifest();
    }

    /**
     * Create an instance of {@link ErrorList }
     * 
     */
    public ErrorList createErrorList() {
        return new ErrorList();
    }

    /**
     * Create an instance of {@link MessageHeader }
     * 
     */
    public MessageHeader createMessageHeader() {
        return new MessageHeader();
    }

    /**
     * Create an instance of {@link PGPDataType }
     * 
     */
    public PGPDataType createPGPDataType() {
        return new PGPDataType();
    }

    /**
     * Create an instance of {@link KeyValueType }
     * 
     */
    public KeyValueType createKeyValueType() {
        return new KeyValueType();
    }

    /**
     * Create an instance of {@link DSAKeyValueType }
     * 
     */
    public DSAKeyValueType createDSAKeyValueType() {
        return new DSAKeyValueType();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link RetrievalMethodType }
     * 
     */
    public RetrievalMethodType createRetrievalMethodType() {
        return new RetrievalMethodType();
    }

    /**
     * Create an instance of {@link TransformsType }
     * 
     */
    public TransformsType createTransformsType() {
        return new TransformsType();
    }

    /**
     * Create an instance of {@link CanonicalizationMethodType }
     * 
     */
    public CanonicalizationMethodType createCanonicalizationMethodType() {
        return new CanonicalizationMethodType();
    }

    /**
     * Create an instance of {@link DigestMethodType }
     * 
     */
    public DigestMethodType createDigestMethodType() {
        return new DigestMethodType();
    }

    /**
     * Create an instance of {@link ManifestType }
     * 
     */
    public ManifestType createManifestType() {
        return new ManifestType();
    }

    /**
     * Create an instance of {@link SignaturePropertyType }
     * 
     */
    public SignaturePropertyType createSignaturePropertyType() {
        return new SignaturePropertyType();
    }

    /**
     * Create an instance of {@link X509DataType }
     * 
     */
    public X509DataType createX509DataType() {
        return new X509DataType();
    }

    /**
     * Create an instance of {@link SignedInfoType }
     * 
     */
    public SignedInfoType createSignedInfoType() {
        return new SignedInfoType();
    }

    /**
     * Create an instance of {@link RSAKeyValueType }
     * 
     */
    public RSAKeyValueType createRSAKeyValueType() {
        return new RSAKeyValueType();
    }

    /**
     * Create an instance of {@link SPKIDataType }
     * 
     */
    public SPKIDataType createSPKIDataType() {
        return new SPKIDataType();
    }

    /**
     * Create an instance of {@link SignatureValueType }
     * 
     */
    public SignatureValueType createSignatureValueType() {
        return new SignatureValueType();
    }

    /**
     * Create an instance of {@link KeyInfoType }
     * 
     */
    public KeyInfoType createKeyInfoType() {
        return new KeyInfoType();
    }

    /**
     * Create an instance of {@link SignatureType }
     * 
     */
    public SignatureType createSignatureType() {
        return new SignatureType();
    }

    /**
     * Create an instance of {@link SignaturePropertiesType }
     * 
     */
    public SignaturePropertiesType createSignaturePropertiesType() {
        return new SignaturePropertiesType();
    }

    /**
     * Create an instance of {@link SignatureMethodType }
     * 
     */
    public SignatureMethodType createSignatureMethodType() {
        return new SignatureMethodType();
    }

    /**
     * Create an instance of {@link ObjectType }
     * 
     */
    public ObjectType createObjectType() {
        return new ObjectType();
    }

    /**
     * Create an instance of {@link TransformType }
     * 
     */
    public TransformType createTransformType() {
        return new TransformType();
    }

    /**
     * Create an instance of {@link X509IssuerSerialType }
     * 
     */
    public X509IssuerSerialType createX509IssuerSerialType() {
        return new X509IssuerSerialType();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link Fault }
     * 
     */
    public Fault createFault() {
        return new Fault();
    }

    /**
     * Create an instance of {@link Envelope }
     * 
     */
    public Envelope createEnvelope() {
        return new Envelope();
    }

    /**
     * Create an instance of {@link Body }
     * 
     */
    public Body createBody() {
        return new Body();
    }

    /**
     * Create an instance of {@link Detail }
     * 
     */
    public Detail createDetail() {
        return new Detail();
    }

    /**
     * Create an instance of {@link Security.UsernameToken }
     * 
     */
    public Security.UsernameToken createSecurityUsernameToken() {
        return new Security.UsernameToken();
    }

    /**
     * Create an instance of {@link OriginDestinationInformationType.OriginLocation }
     * 
     */
    public OriginDestinationInformationType.OriginLocation createOriginDestinationInformationTypeOriginLocation() {
        return new OriginDestinationInformationType.OriginLocation();
    }

    /**
     * Create an instance of {@link OriginDestinationInformationType.DestinationLocation }
     * 
     */
    public OriginDestinationInformationType.DestinationLocation createOriginDestinationInformationTypeDestinationLocation() {
        return new OriginDestinationInformationType.DestinationLocation();
    }

    /**
     * Create an instance of {@link TravelDateTimeType.DepartureDates.Day }
     * 
     */
    public TravelDateTimeType.DepartureDates.Day createTravelDateTimeTypeDepartureDatesDay() {
        return new TravelDateTimeType.DepartureDates.Day();
    }

    /**
     * Create an instance of {@link TravelDateTimeType.DepartureDates.DaysRange }
     * 
     */
    public TravelDateTimeType.DepartureDates.DaysRange createTravelDateTimeTypeDepartureDatesDaysRange() {
        return new TravelDateTimeType.DepartureDates.DaysRange();
    }

    /**
     * Create an instance of {@link TravelDateTimeType.DepartureDates.LengthOfStay }
     * 
     */
    public TravelDateTimeType.DepartureDates.LengthOfStay createTravelDateTimeTypeDepartureDatesLengthOfStay() {
        return new TravelDateTimeType.DepartureDates.LengthOfStay();
    }

    /**
     * Create an instance of {@link TravelDateTimeType.DepartureDates.LengthOfStayRange }
     * 
     */
    public TravelDateTimeType.DepartureDates.LengthOfStayRange createTravelDateTimeTypeDepartureDatesLengthOfStayRange() {
        return new TravelDateTimeType.DepartureDates.LengthOfStayRange();
    }

    /**
     * Create an instance of {@link PricedItineraryType.AirItineraryPricingInfo }
     * 
     */
    public PricedItineraryType.AirItineraryPricingInfo createPricedItineraryTypeAirItineraryPricingInfo() {
        return new PricedItineraryType.AirItineraryPricingInfo();
    }

    /**
     * Create an instance of {@link PricedItineraryType.TPAExtensions.ItinSource }
     * 
     */
    public PricedItineraryType.TPAExtensions.ItinSource createPricedItineraryTypeTPAExtensionsItinSource() {
        return new PricedItineraryType.TPAExtensions.ItinSource();
    }

    /**
     * Create an instance of {@link PricedItineraryType.TPAExtensions.ValidatingCarrier }
     * 
     */
    public PricedItineraryType.TPAExtensions.ValidatingCarrier createPricedItineraryTypeTPAExtensionsValidatingCarrier() {
        return new PricedItineraryType.TPAExtensions.ValidatingCarrier();
    }

    /**
     * Create an instance of {@link PricedItineraryType.TPAExtensions.ValueBucket }
     * 
     */
    public PricedItineraryType.TPAExtensions.ValueBucket createPricedItineraryTypeTPAExtensionsValueBucket() {
        return new PricedItineraryType.TPAExtensions.ValueBucket();
    }

    /**
     * Create an instance of {@link PricedItineraryType.TPAExtensions.Ops.FareTypes.FareType }
     * 
     */
    public PricedItineraryType.TPAExtensions.Ops.FareTypes.FareType createPricedItineraryTypeTPAExtensionsOpsFareTypesFareType() {
        return new PricedItineraryType.TPAExtensions.Ops.FareTypes.FareType();
    }

    /**
     * Create an instance of {@link PricedItineraryType.TPAExtensions.AdditionalFares.AirItineraryPricingInfo }
     * 
     */
    public PricedItineraryType.TPAExtensions.AdditionalFares.AirItineraryPricingInfo createPricedItineraryTypeTPAExtensionsAdditionalFaresAirItineraryPricingInfo() {
        return new PricedItineraryType.TPAExtensions.AdditionalFares.AirItineraryPricingInfo();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.PTCFareBreakdowns }
     * 
     */
    public AirItineraryPricingInfoType.PTCFareBreakdowns createAirItineraryPricingInfoTypePTCFareBreakdowns() {
        return new AirItineraryPricingInfoType.PTCFareBreakdowns();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.TPAExtensions.DivideInParty }
     * 
     */
    public AirItineraryPricingInfoType.TPAExtensions.DivideInParty createAirItineraryPricingInfoTypeTPAExtensionsDivideInParty() {
        return new AirItineraryPricingInfoType.TPAExtensions.DivideInParty();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.TPAExtensions.PromoOffer }
     * 
     */
    public AirItineraryPricingInfoType.TPAExtensions.PromoOffer createAirItineraryPricingInfoTypeTPAExtensionsPromoOffer() {
        return new AirItineraryPricingInfoType.TPAExtensions.PromoOffer();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.TPAExtensions.FareNote }
     * 
     */
    public AirItineraryPricingInfoType.TPAExtensions.FareNote createAirItineraryPricingInfoTypeTPAExtensionsFareNote() {
        return new AirItineraryPricingInfoType.TPAExtensions.FareNote();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.TPAExtensions.PromoRedemption }
     * 
     */
    public AirItineraryPricingInfoType.TPAExtensions.PromoRedemption createAirItineraryPricingInfoTypeTPAExtensionsPromoRedemption() {
        return new AirItineraryPricingInfoType.TPAExtensions.PromoRedemption();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.TPAExtensions.Rule }
     * 
     */
    public AirItineraryPricingInfoType.TPAExtensions.Rule createAirItineraryPricingInfoTypeTPAExtensionsRule() {
        return new AirItineraryPricingInfoType.TPAExtensions.Rule();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.TPAExtensions.MultipleTravelerGroups }
     * 
     */
    public AirItineraryPricingInfoType.TPAExtensions.MultipleTravelerGroups createAirItineraryPricingInfoTypeTPAExtensionsMultipleTravelerGroups() {
        return new AirItineraryPricingInfoType.TPAExtensions.MultipleTravelerGroups();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.TPAExtensions.Legs.Leg.Segment }
     * 
     */
    public AirItineraryPricingInfoType.TPAExtensions.Legs.Leg.Segment createAirItineraryPricingInfoTypeTPAExtensionsLegsLegSegment() {
        return new AirItineraryPricingInfoType.TPAExtensions.Legs.Leg.Segment();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.TPAExtensions.AncillaryFeeGroups.AncillaryFeeGroup.AncillaryFeeItem }
     * 
     */
    public AirItineraryPricingInfoType.TPAExtensions.AncillaryFeeGroups.AncillaryFeeGroup.AncillaryFeeItem createAirItineraryPricingInfoTypeTPAExtensionsAncillaryFeeGroupsAncillaryFeeGroupAncillaryFeeItem() {
        return new AirItineraryPricingInfoType.TPAExtensions.AncillaryFeeGroups.AncillaryFeeGroup.AncillaryFeeItem();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.FareInfos.FareInfo.TPAExtensions.SeatsRemaining }
     * 
     */
    public AirItineraryPricingInfoType.FareInfos.FareInfo.TPAExtensions.SeatsRemaining createAirItineraryPricingInfoTypeFareInfosFareInfoTPAExtensionsSeatsRemaining() {
        return new AirItineraryPricingInfoType.FareInfos.FareInfo.TPAExtensions.SeatsRemaining();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.FareInfos.FareInfo.TPAExtensions.Cabin }
     * 
     */
    public AirItineraryPricingInfoType.FareInfos.FareInfo.TPAExtensions.Cabin createAirItineraryPricingInfoTypeFareInfosFareInfoTPAExtensionsCabin() {
        return new AirItineraryPricingInfoType.FareInfos.FareInfo.TPAExtensions.Cabin();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.FareInfos.FareInfo.TPAExtensions.FareNote }
     * 
     */
    public AirItineraryPricingInfoType.FareInfos.FareInfo.TPAExtensions.FareNote createAirItineraryPricingInfoTypeFareInfosFareInfoTPAExtensionsFareNote() {
        return new AirItineraryPricingInfoType.FareInfos.FareInfo.TPAExtensions.FareNote();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.FareInfos.FareInfo.TPAExtensions.Meal }
     * 
     */
    public AirItineraryPricingInfoType.FareInfos.FareInfo.TPAExtensions.Meal createAirItineraryPricingInfoTypeFareInfosFareInfoTPAExtensionsMeal() {
        return new AirItineraryPricingInfoType.FareInfos.FareInfo.TPAExtensions.Meal();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.FareInfos.FareInfo.TPAExtensions.Rule }
     * 
     */
    public AirItineraryPricingInfoType.FareInfos.FareInfo.TPAExtensions.Rule createAirItineraryPricingInfoTypeFareInfosFareInfoTPAExtensionsRule() {
        return new AirItineraryPricingInfoType.FareInfos.FareInfo.TPAExtensions.Rule();
    }

    /**
     * Create an instance of {@link AdvResTicketingType.AdvReservation }
     * 
     */
    public AdvResTicketingType.AdvReservation createAdvResTicketingTypeAdvReservation() {
        return new AdvResTicketingType.AdvReservation();
    }

    /**
     * Create an instance of {@link AdvResTicketingType.AdvTicketing }
     * 
     */
    public AdvResTicketingType.AdvTicketing createAdvResTicketingTypeAdvTicketing() {
        return new AdvResTicketingType.AdvTicketing();
    }

    /**
     * Create an instance of {@link VoluntaryChangesType.Penalty }
     * 
     */
    public VoluntaryChangesType.Penalty createVoluntaryChangesTypePenalty() {
        return new VoluntaryChangesType.Penalty();
    }

    /**
     * Create an instance of {@link TicketPricingType.TPAExtensions.ValidatingCarrier }
     * 
     */
    public TicketPricingType.TPAExtensions.ValidatingCarrier createTicketPricingTypeTPAExtensionsValidatingCarrier() {
        return new TicketPricingType.TPAExtensions.ValidatingCarrier();
    }

    /**
     * Create an instance of {@link TicketPricingType.OriginDestinationOptions.OriginDestinationOption.FlightSegment }
     * 
     */
    public TicketPricingType.OriginDestinationOptions.OriginDestinationOption.FlightSegment createTicketPricingTypeOriginDestinationOptionsOriginDestinationOptionFlightSegment() {
        return new TicketPricingType.OriginDestinationOptions.OriginDestinationOption.FlightSegment();
    }

    /**
     * Create an instance of {@link TransactionType.RequestType }
     * 
     */
    public TransactionType.RequestType createTransactionTypeRequestType() {
        return new TransactionType.RequestType();
    }

    /**
     * Create an instance of {@link TransactionType.ServiceTag }
     * 
     */
    public TransactionType.ServiceTag createTransactionTypeServiceTag() {
        return new TransactionType.ServiceTag();
    }

    /**
     * Create an instance of {@link TransactionType.PurchaseType }
     * 
     */
    public TransactionType.PurchaseType createTransactionTypePurchaseType() {
        return new TransactionType.PurchaseType();
    }

    /**
     * Create an instance of {@link TransactionType.SabreAth }
     * 
     */
    public TransactionType.SabreAth createTransactionTypeSabreAth() {
        return new TransactionType.SabreAth();
    }

    /**
     * Create an instance of {@link TransactionType.TranID }
     * 
     */
    public TransactionType.TranID createTransactionTypeTranID() {
        return new TransactionType.TranID();
    }

    /**
     * Create an instance of {@link TransactionType.ClientSessionID }
     * 
     */
    public TransactionType.ClientSessionID createTransactionTypeClientSessionID() {
        return new TransactionType.ClientSessionID();
    }

    /**
     * Create an instance of {@link TransactionType.Branch }
     * 
     */
    public TransactionType.Branch createTransactionTypeBranch() {
        return new TransactionType.Branch();
    }

    /**
     * Create an instance of {@link TransactionType.CompressResponse }
     * 
     */
    public TransactionType.CompressResponse createTransactionTypeCompressResponse() {
        return new TransactionType.CompressResponse();
    }

    /**
     * Create an instance of {@link TransactionType.SubagentData }
     * 
     */
    public TransactionType.SubagentData createTransactionTypeSubagentData() {
        return new TransactionType.SubagentData();
    }

    /**
     * Create an instance of {@link TransactionType.ResponseSorting }
     * 
     */
    public TransactionType.ResponseSorting createTransactionTypeResponseSorting() {
        return new TransactionType.ResponseSorting();
    }

    /**
     * Create an instance of {@link TransactionType.FareOverrides.FareOverride }
     * 
     */
    public TransactionType.FareOverrides.FareOverride createTransactionTypeFareOverridesFareOverride() {
        return new TransactionType.FareOverrides.FareOverride();
    }

    /**
     * Create an instance of {@link FareMessagesType.Message }
     * 
     */
    public FareMessagesType.Message createFareMessagesTypeMessage() {
        return new FareMessagesType.Message();
    }

    /**
     * Create an instance of {@link FareType.Fees }
     * 
     */
    public FareType.Fees createFareTypeFees() {
        return new FareType.Fees();
    }

    /**
     * Create an instance of {@link FareType.OBFees }
     * 
     */
    public FareType.OBFees createFareTypeOBFees() {
        return new FareType.OBFees();
    }

    /**
     * Create an instance of {@link FareType.TPAExtensions.FareComponents.FareComponent }
     * 
     */
    public FareType.TPAExtensions.FareComponents.FareComponent createFareTypeTPAExtensionsFareComponentsFareComponent() {
        return new FareType.TPAExtensions.FareComponents.FareComponent();
    }

    /**
     * Create an instance of {@link SummaryPriceInformation.Taxes }
     * 
     */
    public SummaryPriceInformation.Taxes createSummaryPriceInformationTaxes() {
        return new SummaryPriceInformation.Taxes();
    }

    /**
     * Create an instance of {@link SummaryPriceInformation.Segment }
     * 
     */
    public SummaryPriceInformation.Segment createSummaryPriceInformationSegment() {
        return new SummaryPriceInformation.Segment();
    }

    /**
     * Create an instance of {@link FareType.TPAExtensions.Legs.Leg }
     * 
     */
    public FareType.TPAExtensions.Legs.Leg createFareTypeTPAExtensionsLegsLeg() {
        return new FareType.TPAExtensions.Legs.Leg();
    }

    /**
     * Create an instance of {@link FareType.Taxes.FareComponentsTaxes }
     * 
     */
    public FareType.Taxes.FareComponentsTaxes createFareTypeTaxesFareComponentsTaxes() {
        return new FareType.Taxes.FareComponentsTaxes();
    }

    /**
     * Create an instance of {@link FareType.Taxes.LegsTaxes.LegTaxes }
     * 
     */
    public FareType.Taxes.LegsTaxes.LegTaxes createFareTypeTaxesLegsTaxesLegTaxes() {
        return new FareType.Taxes.LegsTaxes.LegTaxes();
    }

    /**
     * Create an instance of {@link ConnectionType.ConnectionLocation }
     * 
     */
    public ConnectionType.ConnectionLocation createConnectionTypeConnectionLocation() {
        return new ConnectionType.ConnectionLocation();
    }

    /**
     * Create an instance of {@link StayRestrictionsType.MinimumStay }
     * 
     */
    public StayRestrictionsType.MinimumStay createStayRestrictionsTypeMinimumStay() {
        return new StayRestrictionsType.MinimumStay();
    }

    /**
     * Create an instance of {@link StayRestrictionsType.MaximumStay }
     * 
     */
    public StayRestrictionsType.MaximumStay createStayRestrictionsTypeMaximumStay() {
        return new StayRestrictionsType.MaximumStay();
    }

    /**
     * Create an instance of {@link RuleInfoType.ResTicketingRules }
     * 
     */
    public RuleInfoType.ResTicketingRules createRuleInfoTypeResTicketingRules() {
        return new RuleInfoType.ResTicketingRules();
    }

    /**
     * Create an instance of {@link FareComponentTaxesType.FlightSegment }
     * 
     */
    public FareComponentTaxesType.FlightSegment createFareComponentTaxesTypeFlightSegment() {
        return new FareComponentTaxesType.FlightSegment();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType.DepartureTimeZone }
     * 
     */
    public BookFlightSegmentType.DepartureTimeZone createBookFlightSegmentTypeDepartureTimeZone() {
        return new BookFlightSegmentType.DepartureTimeZone();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType.ArrivalTimeZone }
     * 
     */
    public BookFlightSegmentType.ArrivalTimeZone createBookFlightSegmentTypeArrivalTimeZone() {
        return new BookFlightSegmentType.ArrivalTimeZone();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType.OnTimePerformance }
     * 
     */
    public BookFlightSegmentType.OnTimePerformance createBookFlightSegmentTypeOnTimePerformance() {
        return new BookFlightSegmentType.OnTimePerformance();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType.TPAExtensions.ETicket }
     * 
     */
    public BookFlightSegmentType.TPAExtensions.ETicket createBookFlightSegmentTypeTPAExtensionsETicket() {
        return new BookFlightSegmentType.TPAExtensions.ETicket();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType.TPAExtensions.DataElement }
     * 
     */
    public BookFlightSegmentType.TPAExtensions.DataElement createBookFlightSegmentTypeTPAExtensionsDataElement() {
        return new BookFlightSegmentType.TPAExtensions.DataElement();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType.TPAExtensions.Message }
     * 
     */
    public BookFlightSegmentType.TPAExtensions.Message createBookFlightSegmentTypeTPAExtensionsMessage() {
        return new BookFlightSegmentType.TPAExtensions.Message();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType.StopAirports.StopAirport }
     * 
     */
    public BookFlightSegmentType.StopAirports.StopAirport createBookFlightSegmentTypeStopAirportsStopAirport() {
        return new BookFlightSegmentType.StopAirports.StopAirport();
    }

    /**
     * Create an instance of {@link PassengerTypeQuantityType.TPAExtensions.BirthDate }
     * 
     */
    public PassengerTypeQuantityType.TPAExtensions.BirthDate createPassengerTypeQuantityTypeTPAExtensionsBirthDate() {
        return new PassengerTypeQuantityType.TPAExtensions.BirthDate();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.FareInfos.FareInfo.TPAExtensions.SeatsRemaining }
     * 
     */
    public PTCFareBreakdownType.FareInfos.FareInfo.TPAExtensions.SeatsRemaining createPTCFareBreakdownTypeFareInfosFareInfoTPAExtensionsSeatsRemaining() {
        return new PTCFareBreakdownType.FareInfos.FareInfo.TPAExtensions.SeatsRemaining();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.FareInfos.FareInfo.TPAExtensions.Cabin }
     * 
     */
    public PTCFareBreakdownType.FareInfos.FareInfo.TPAExtensions.Cabin createPTCFareBreakdownTypeFareInfosFareInfoTPAExtensionsCabin() {
        return new PTCFareBreakdownType.FareInfos.FareInfo.TPAExtensions.Cabin();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.FareInfos.FareInfo.TPAExtensions.FareNote }
     * 
     */
    public PTCFareBreakdownType.FareInfos.FareInfo.TPAExtensions.FareNote createPTCFareBreakdownTypeFareInfosFareInfoTPAExtensionsFareNote() {
        return new PTCFareBreakdownType.FareInfos.FareInfo.TPAExtensions.FareNote();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.FareInfos.FareInfo.TPAExtensions.Meal }
     * 
     */
    public PTCFareBreakdownType.FareInfos.FareInfo.TPAExtensions.Meal createPTCFareBreakdownTypeFareInfosFareInfoTPAExtensionsMeal() {
        return new PTCFareBreakdownType.FareInfos.FareInfo.TPAExtensions.Meal();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.FareInfos.FareInfo.TPAExtensions.Rule }
     * 
     */
    public PTCFareBreakdownType.FareInfos.FareInfo.TPAExtensions.Rule createPTCFareBreakdownTypeFareInfosFareInfoTPAExtensionsRule() {
        return new PTCFareBreakdownType.FareInfos.FareInfo.TPAExtensions.Rule();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.TPAExtensions.FareType }
     * 
     */
    public PTCFareBreakdownType.TPAExtensions.FareType createPTCFareBreakdownTypeTPAExtensionsFareType() {
        return new PTCFareBreakdownType.TPAExtensions.FareType();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.Endorsements.Endorsement }
     * 
     */
    public PTCFareBreakdownType.Endorsements.Endorsement createPTCFareBreakdownTypeEndorsementsEndorsement() {
        return new PTCFareBreakdownType.Endorsements.Endorsement();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.FareBasisCodes.FareBasisCode }
     * 
     */
    public PTCFareBreakdownType.FareBasisCodes.FareBasisCode createPTCFareBreakdownTypeFareBasisCodesFareBasisCode() {
        return new PTCFareBreakdownType.FareBasisCodes.FareBasisCode();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.NegotiatedFareCode }
     * 
     */
    public PriceRequestInformationType.NegotiatedFareCode createPriceRequestInformationTypeNegotiatedFareCode() {
        return new PriceRequestInformationType.NegotiatedFareCode();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.AccountCode }
     * 
     */
    public PriceRequestInformationType.AccountCode createPriceRequestInformationTypeAccountCode() {
        return new PriceRequestInformationType.AccountCode();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.TPAExtensions.PublicFare }
     * 
     */
    public PriceRequestInformationType.TPAExtensions.PublicFare createPriceRequestInformationTypeTPAExtensionsPublicFare() {
        return new PriceRequestInformationType.TPAExtensions.PublicFare();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.TPAExtensions.PrivateFare }
     * 
     */
    public PriceRequestInformationType.TPAExtensions.PrivateFare createPriceRequestInformationTypeTPAExtensionsPrivateFare() {
        return new PriceRequestInformationType.TPAExtensions.PrivateFare();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.TPAExtensions.CustomerType }
     * 
     */
    public PriceRequestInformationType.TPAExtensions.CustomerType createPriceRequestInformationTypeTPAExtensionsCustomerType() {
        return new PriceRequestInformationType.TPAExtensions.CustomerType();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.TPAExtensions.MultipleTravelerGroups }
     * 
     */
    public PriceRequestInformationType.TPAExtensions.MultipleTravelerGroups createPriceRequestInformationTypeTPAExtensionsMultipleTravelerGroups() {
        return new PriceRequestInformationType.TPAExtensions.MultipleTravelerGroups();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.TPAExtensions.PassengerStatus }
     * 
     */
    public PriceRequestInformationType.TPAExtensions.PassengerStatus createPriceRequestInformationTypeTPAExtensionsPassengerStatus() {
        return new PriceRequestInformationType.TPAExtensions.PassengerStatus();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.TPAExtensions.OBFees }
     * 
     */
    public PriceRequestInformationType.TPAExtensions.OBFees createPriceRequestInformationTypeTPAExtensionsOBFees() {
        return new PriceRequestInformationType.TPAExtensions.OBFees();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.TPAExtensions.BrandedFareIndicators.ReturnCheapestUnbrandedFare }
     * 
     */
    public PriceRequestInformationType.TPAExtensions.BrandedFareIndicators.ReturnCheapestUnbrandedFare createPriceRequestInformationTypeTPAExtensionsBrandedFareIndicatorsReturnCheapestUnbrandedFare() {
        return new PriceRequestInformationType.TPAExtensions.BrandedFareIndicators.ReturnCheapestUnbrandedFare();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.TPAExtensions.Indicators.RetainFare }
     * 
     */
    public PriceRequestInformationType.TPAExtensions.Indicators.RetainFare createPriceRequestInformationTypeTPAExtensionsIndicatorsRetainFare() {
        return new PriceRequestInformationType.TPAExtensions.Indicators.RetainFare();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.TPAExtensions.Indicators.MinMaxStay }
     * 
     */
    public PriceRequestInformationType.TPAExtensions.Indicators.MinMaxStay createPriceRequestInformationTypeTPAExtensionsIndicatorsMinMaxStay() {
        return new PriceRequestInformationType.TPAExtensions.Indicators.MinMaxStay();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.TPAExtensions.Indicators.RefundPenalty }
     * 
     */
    public PriceRequestInformationType.TPAExtensions.Indicators.RefundPenalty createPriceRequestInformationTypeTPAExtensionsIndicatorsRefundPenalty() {
        return new PriceRequestInformationType.TPAExtensions.Indicators.RefundPenalty();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.TPAExtensions.Indicators.ResTicketing }
     * 
     */
    public PriceRequestInformationType.TPAExtensions.Indicators.ResTicketing createPriceRequestInformationTypeTPAExtensionsIndicatorsResTicketing() {
        return new PriceRequestInformationType.TPAExtensions.Indicators.ResTicketing();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.TPAExtensions.Indicators.TravelPolicy }
     * 
     */
    public PriceRequestInformationType.TPAExtensions.Indicators.TravelPolicy createPriceRequestInformationTypeTPAExtensionsIndicatorsTravelPolicy() {
        return new PriceRequestInformationType.TPAExtensions.Indicators.TravelPolicy();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.TPAExtensions.Priority.Price }
     * 
     */
    public PriceRequestInformationType.TPAExtensions.Priority.Price createPriceRequestInformationTypeTPAExtensionsPriorityPrice() {
        return new PriceRequestInformationType.TPAExtensions.Priority.Price();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.TPAExtensions.Priority.DirectFlights }
     * 
     */
    public PriceRequestInformationType.TPAExtensions.Priority.DirectFlights createPriceRequestInformationTypeTPAExtensionsPriorityDirectFlights() {
        return new PriceRequestInformationType.TPAExtensions.Priority.DirectFlights();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.TPAExtensions.Priority.Time }
     * 
     */
    public PriceRequestInformationType.TPAExtensions.Priority.Time createPriceRequestInformationTypeTPAExtensionsPriorityTime() {
        return new PriceRequestInformationType.TPAExtensions.Priority.Time();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.TPAExtensions.Priority.Vendor }
     * 
     */
    public PriceRequestInformationType.TPAExtensions.Priority.Vendor createPriceRequestInformationTypeTPAExtensionsPriorityVendor() {
        return new PriceRequestInformationType.TPAExtensions.Priority.Vendor();
    }

    /**
     * Create an instance of {@link BaggageInformationType.Segment }
     * 
     */
    public BaggageInformationType.Segment createBaggageInformationTypeSegment() {
        return new BaggageInformationType.Segment();
    }

    /**
     * Create an instance of {@link BaggageInformationType.Allowance }
     * 
     */
    public BaggageInformationType.Allowance createBaggageInformationTypeAllowance() {
        return new BaggageInformationType.Allowance();
    }

    /**
     * Create an instance of {@link AirTravelerType.ProfileRef }
     * 
     */
    public AirTravelerType.ProfileRef createAirTravelerTypeProfileRef() {
        return new AirTravelerType.ProfileRef();
    }

    /**
     * Create an instance of {@link AirTravelerType.FlightSegmentRPHs }
     * 
     */
    public AirTravelerType.FlightSegmentRPHs createAirTravelerTypeFlightSegmentRPHs() {
        return new AirTravelerType.FlightSegmentRPHs();
    }

    /**
     * Create an instance of {@link FlexibleFaresType.FareParameters.ExcludeRestricted }
     * 
     */
    public FlexibleFaresType.FareParameters.ExcludeRestricted createFlexibleFaresTypeFareParametersExcludeRestricted() {
        return new FlexibleFaresType.FareParameters.ExcludeRestricted();
    }

    /**
     * Create an instance of {@link FlexibleFaresType.FareParameters.ResTicketing }
     * 
     */
    public FlexibleFaresType.FareParameters.ResTicketing createFlexibleFaresTypeFareParametersResTicketing() {
        return new FlexibleFaresType.FareParameters.ResTicketing();
    }

    /**
     * Create an instance of {@link FlexibleFaresType.FareParameters.MinMaxStay }
     * 
     */
    public FlexibleFaresType.FareParameters.MinMaxStay createFlexibleFaresTypeFareParametersMinMaxStay() {
        return new FlexibleFaresType.FareParameters.MinMaxStay();
    }

    /**
     * Create an instance of {@link FlexibleFaresType.FareParameters.RefundPenalty }
     * 
     */
    public FlexibleFaresType.FareParameters.RefundPenalty createFlexibleFaresTypeFareParametersRefundPenalty() {
        return new FlexibleFaresType.FareParameters.RefundPenalty();
    }

    /**
     * Create an instance of {@link FlexibleFaresType.FareParameters.PublicFare }
     * 
     */
    public FlexibleFaresType.FareParameters.PublicFare createFlexibleFaresTypeFareParametersPublicFare() {
        return new FlexibleFaresType.FareParameters.PublicFare();
    }

    /**
     * Create an instance of {@link FlexibleFaresType.FareParameters.PrivateFare }
     * 
     */
    public FlexibleFaresType.FareParameters.PrivateFare createFlexibleFaresTypeFareParametersPrivateFare() {
        return new FlexibleFaresType.FareParameters.PrivateFare();
    }

    /**
     * Create an instance of {@link FlexibleFaresType.FareParameters.Cabin }
     * 
     */
    public FlexibleFaresType.FareParameters.Cabin createFlexibleFaresTypeFareParametersCabin() {
        return new FlexibleFaresType.FareParameters.Cabin();
    }

    /**
     * Create an instance of {@link FlexibleFaresType.FareParameters.PassengerType }
     * 
     */
    public FlexibleFaresType.FareParameters.PassengerType createFlexibleFaresTypeFareParametersPassengerType() {
        return new FlexibleFaresType.FareParameters.PassengerType();
    }

    /**
     * Create an instance of {@link FlexibleFaresType.FareParameters.CorporateID }
     * 
     */
    public FlexibleFaresType.FareParameters.CorporateID createFlexibleFaresTypeFareParametersCorporateID() {
        return new FlexibleFaresType.FareParameters.CorporateID();
    }

    /**
     * Create an instance of {@link FlexibleFaresType.FareParameters.AccountCode }
     * 
     */
    public FlexibleFaresType.FareParameters.AccountCode createFlexibleFaresTypeFareParametersAccountCode() {
        return new FlexibleFaresType.FareParameters.AccountCode();
    }

    /**
     * Create an instance of {@link ItinTotalFareType.Extras }
     * 
     */
    public ItinTotalFareType.Extras createItinTotalFareTypeExtras() {
        return new ItinTotalFareType.Extras();
    }

    /**
     * Create an instance of {@link ItinTotalFareType.TotalWithExtras }
     * 
     */
    public ItinTotalFareType.TotalWithExtras createItinTotalFareTypeTotalWithExtras() {
        return new ItinTotalFareType.TotalWithExtras();
    }

    /**
     * Create an instance of {@link ItinTotalFareType.ServiceFee }
     * 
     */
    public ItinTotalFareType.ServiceFee createItinTotalFareTypeServiceFee() {
        return new ItinTotalFareType.ServiceFee();
    }

    /**
     * Create an instance of {@link AirItineraryType.OriginDestinationOptions }
     * 
     */
    public AirItineraryType.OriginDestinationOptions createAirItineraryTypeOriginDestinationOptions() {
        return new AirItineraryType.OriginDestinationOptions();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRS.TPAExtensions.AirlineOrderList.AirlineOrder }
     * 
     */
    public OTAAirLowFareSearchRS.TPAExtensions.AirlineOrderList.AirlineOrder createOTAAirLowFareSearchRSTPAExtensionsAirlineOrderListAirlineOrder() {
        return new OTAAirLowFareSearchRS.TPAExtensions.AirlineOrderList.AirlineOrder();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRS.OneWayItineraries.BrandedOneWayItineraries }
     * 
     */
    public OTAAirLowFareSearchRS.OneWayItineraries.BrandedOneWayItineraries createOTAAirLowFareSearchRSOneWayItinerariesBrandedOneWayItineraries() {
        return new OTAAirLowFareSearchRS.OneWayItineraries.BrandedOneWayItineraries();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRS.OneWayItineraries.SimpleOneWayItineraries }
     * 
     */
    public OTAAirLowFareSearchRS.OneWayItineraries.SimpleOneWayItineraries createOTAAirLowFareSearchRSOneWayItinerariesSimpleOneWayItineraries() {
        return new OTAAirLowFareSearchRS.OneWayItineraries.SimpleOneWayItineraries();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRQ.TPAExtensions.AlternateAirportMileage }
     * 
     */
    public OTAAirLowFareSearchRQ.TPAExtensions.AlternateAirportMileage createOTAAirLowFareSearchRQTPAExtensionsAlternateAirportMileage() {
        return new OTAAirLowFareSearchRQ.TPAExtensions.AlternateAirportMileage();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRQ.TPAExtensions.SplitTaxes }
     * 
     */
    public OTAAirLowFareSearchRQ.TPAExtensions.SplitTaxes createOTAAirLowFareSearchRQTPAExtensionsSplitTaxes() {
        return new OTAAirLowFareSearchRQ.TPAExtensions.SplitTaxes();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRQ.TPAExtensions.MultiTicket }
     * 
     */
    public OTAAirLowFareSearchRQ.TPAExtensions.MultiTicket createOTAAirLowFareSearchRQTPAExtensionsMultiTicket() {
        return new OTAAirLowFareSearchRQ.TPAExtensions.MultiTicket();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRQ.TPAExtensions.AlternateAirportCities.SpecifiedLocation }
     * 
     */
    public OTAAirLowFareSearchRQ.TPAExtensions.AlternateAirportCities.SpecifiedLocation createOTAAirLowFareSearchRQTPAExtensionsAlternateAirportCitiesSpecifiedLocation() {
        return new OTAAirLowFareSearchRQ.TPAExtensions.AlternateAirportCities.SpecifiedLocation();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRQ.TPAExtensions.AlternateAirportCities.AlternateLocation }
     * 
     */
    public OTAAirLowFareSearchRQ.TPAExtensions.AlternateAirportCities.AlternateLocation createOTAAirLowFareSearchRQTPAExtensionsAlternateAirportCitiesAlternateLocation() {
        return new OTAAirLowFareSearchRQ.TPAExtensions.AlternateAirportCities.AlternateLocation();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRQ.TPAExtensions.MessagingDetails.MDRSubset }
     * 
     */
    public OTAAirLowFareSearchRQ.TPAExtensions.MessagingDetails.MDRSubset createOTAAirLowFareSearchRQTPAExtensionsMessagingDetailsMDRSubset() {
        return new OTAAirLowFareSearchRQ.TPAExtensions.MessagingDetails.MDRSubset();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.FareRestrictPref }
     * 
     */
    public AirSearchPrefsType.FareRestrictPref createAirSearchPrefsTypeFareRestrictPref() {
        return new AirSearchPrefsType.FareRestrictPref();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.SpanishFamilyDiscount }
     * 
     */
    public AirSearchPrefsType.SpanishFamilyDiscount createAirSearchPrefsTypeSpanishFamilyDiscount() {
        return new AirSearchPrefsType.SpanishFamilyDiscount();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.AncillaryFees.AncillaryFeeGroup }
     * 
     */
    public AirSearchPrefsType.AncillaryFees.AncillaryFeeGroup createAirSearchPrefsTypeAncillaryFeesAncillaryFeeGroup() {
        return new AirSearchPrefsType.AncillaryFees.AncillaryFeeGroup();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.ExcludeVendorPref }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.ExcludeVendorPref createAirSearchPrefsTypeTPAExtensionsExcludeVendorPref() {
        return new AirSearchPrefsType.TPAExtensions.ExcludeVendorPref();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.NumTripsWithRouting }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.NumTripsWithRouting createAirSearchPrefsTypeTPAExtensionsNumTripsWithRouting() {
        return new AirSearchPrefsType.TPAExtensions.NumTripsWithRouting();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.OnlineIndicator }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.OnlineIndicator createAirSearchPrefsTypeTPAExtensionsOnlineIndicator() {
        return new AirSearchPrefsType.TPAExtensions.OnlineIndicator();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.InterlineIndicator }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.InterlineIndicator createAirSearchPrefsTypeTPAExtensionsInterlineIndicator() {
        return new AirSearchPrefsType.TPAExtensions.InterlineIndicator();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.TripType }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.TripType createAirSearchPrefsTypeTPAExtensionsTripType() {
        return new AirSearchPrefsType.TPAExtensions.TripType();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.MaxPrice }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.MaxPrice createAirSearchPrefsTypeTPAExtensionsMaxPrice() {
        return new AirSearchPrefsType.TPAExtensions.MaxPrice();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.DomesticLayoverTime }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.DomesticLayoverTime createAirSearchPrefsTypeTPAExtensionsDomesticLayoverTime() {
        return new AirSearchPrefsType.TPAExtensions.DomesticLayoverTime();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.LongConnectTime }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.LongConnectTime createAirSearchPrefsTypeTPAExtensionsLongConnectTime() {
        return new AirSearchPrefsType.TPAExtensions.LongConnectTime();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.AirServiceOnly }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.AirServiceOnly createAirSearchPrefsTypeTPAExtensionsAirServiceOnly() {
        return new AirSearchPrefsType.TPAExtensions.AirServiceOnly();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.JetServiceOnly }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.JetServiceOnly createAirSearchPrefsTypeTPAExtensionsJetServiceOnly() {
        return new AirSearchPrefsType.TPAExtensions.JetServiceOnly();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.SameConnectionAirportOnly }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.SameConnectionAirportOnly createAirSearchPrefsTypeTPAExtensionsSameConnectionAirportOnly() {
        return new AirSearchPrefsType.TPAExtensions.SameConnectionAirportOnly();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.SameOriginAirportOnly }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.SameOriginAirportOnly createAirSearchPrefsTypeTPAExtensionsSameOriginAirportOnly() {
        return new AirSearchPrefsType.TPAExtensions.SameOriginAirportOnly();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.SameTurnaroundAirportOnly }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.SameTurnaroundAirportOnly createAirSearchPrefsTypeTPAExtensionsSameTurnaroundAirportOnly() {
        return new AirSearchPrefsType.TPAExtensions.SameTurnaroundAirportOnly();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.AircraftTypePenalty }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.AircraftTypePenalty createAirSearchPrefsTypeTPAExtensionsAircraftTypePenalty() {
        return new AirSearchPrefsType.TPAExtensions.AircraftTypePenalty();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.AlternateAirportPenalty }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.AlternateAirportPenalty createAirSearchPrefsTypeTPAExtensionsAlternateAirportPenalty() {
        return new AirSearchPrefsType.TPAExtensions.AlternateAirportPenalty();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.FareAmountThreshold }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.FareAmountThreshold createAirSearchPrefsTypeTPAExtensionsFareAmountThreshold() {
        return new AirSearchPrefsType.TPAExtensions.FareAmountThreshold();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.NumOfLowFareSol }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.NumOfLowFareSol createAirSearchPrefsTypeTPAExtensionsNumOfLowFareSol() {
        return new AirSearchPrefsType.TPAExtensions.NumOfLowFareSol();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.NumOfMustPriceOnlSol }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.NumOfMustPriceOnlSol createAirSearchPrefsTypeTPAExtensionsNumOfMustPriceOnlSol() {
        return new AirSearchPrefsType.TPAExtensions.NumOfMustPriceOnlSol();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.NumOfMustPriceInrlSol }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.NumOfMustPriceInrlSol createAirSearchPrefsTypeTPAExtensionsNumOfMustPriceInrlSol() {
        return new AirSearchPrefsType.TPAExtensions.NumOfMustPriceInrlSol();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.NumOfMustPriceNStpOnlSol }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.NumOfMustPriceNStpOnlSol createAirSearchPrefsTypeTPAExtensionsNumOfMustPriceNStpOnlSol() {
        return new AirSearchPrefsType.TPAExtensions.NumOfMustPriceNStpOnlSol();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.NumOfMustPriceNStpInrlSol }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.NumOfMustPriceNStpInrlSol createAirSearchPrefsTypeTPAExtensionsNumOfMustPriceNStpInrlSol() {
        return new AirSearchPrefsType.TPAExtensions.NumOfMustPriceNStpInrlSol();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.NumOfMustPriceSStopOnlSol }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.NumOfMustPriceSStopOnlSol createAirSearchPrefsTypeTPAExtensionsNumOfMustPriceSStopOnlSol() {
        return new AirSearchPrefsType.TPAExtensions.NumOfMustPriceSStopOnlSol();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.StpPenaltyInUSD }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.StpPenaltyInUSD createAirSearchPrefsTypeTPAExtensionsStpPenaltyInUSD() {
        return new AirSearchPrefsType.TPAExtensions.StpPenaltyInUSD();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.DurPenaltyInUSD }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.DurPenaltyInUSD createAirSearchPrefsTypeTPAExtensionsDurPenaltyInUSD() {
        return new AirSearchPrefsType.TPAExtensions.DurPenaltyInUSD();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.DepPenaltyInUSD }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.DepPenaltyInUSD createAirSearchPrefsTypeTPAExtensionsDepPenaltyInUSD() {
        return new AirSearchPrefsType.TPAExtensions.DepPenaltyInUSD();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.MaxAllowedMustPriceOveragePerCrr }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.MaxAllowedMustPriceOveragePerCrr createAirSearchPrefsTypeTPAExtensionsMaxAllowedMustPriceOveragePerCrr() {
        return new AirSearchPrefsType.TPAExtensions.MaxAllowedMustPriceOveragePerCrr();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.FltOptMustPriceReuseLimit }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.FltOptMustPriceReuseLimit createAirSearchPrefsTypeTPAExtensionsFltOptMustPriceReuseLimit() {
        return new AirSearchPrefsType.TPAExtensions.FltOptMustPriceReuseLimit();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.UpperBoundMustPriceFactorForNotNonStp }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.UpperBoundMustPriceFactorForNotNonStp createAirSearchPrefsTypeTPAExtensionsUpperBoundMustPriceFactorForNotNonStp() {
        return new AirSearchPrefsType.TPAExtensions.UpperBoundMustPriceFactorForNotNonStp();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.UpperBoundLFSFactor }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.UpperBoundLFSFactor createAirSearchPrefsTypeTPAExtensionsUpperBoundLFSFactor() {
        return new AirSearchPrefsType.TPAExtensions.UpperBoundLFSFactor();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.NumOfMustPriceNStp1StpOnlSol }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.NumOfMustPriceNStp1StpOnlSol createAirSearchPrefsTypeTPAExtensionsNumOfMustPriceNStp1StpOnlSol() {
        return new AirSearchPrefsType.TPAExtensions.NumOfMustPriceNStp1StpOnlSol();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.NumOfMustPriceNStp1StpInrlSol }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.NumOfMustPriceNStp1StpInrlSol createAirSearchPrefsTypeTPAExtensionsNumOfMustPriceNStp1StpInrlSol() {
        return new AirSearchPrefsType.TPAExtensions.NumOfMustPriceNStp1StpInrlSol();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.UpperBoundMustPriceFactorForNonStp }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.UpperBoundMustPriceFactorForNonStp createAirSearchPrefsTypeTPAExtensionsUpperBoundMustPriceFactorForNonStp() {
        return new AirSearchPrefsType.TPAExtensions.UpperBoundMustPriceFactorForNonStp();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.MaxAllowedLFSOveragePerCrrPercent }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.MaxAllowedLFSOveragePerCrrPercent createAirSearchPrefsTypeTPAExtensionsMaxAllowedLFSOveragePerCrrPercent() {
        return new AirSearchPrefsType.TPAExtensions.MaxAllowedLFSOveragePerCrrPercent();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.TargetMinNumOfLFSOnlSolPerCrr }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.TargetMinNumOfLFSOnlSolPerCrr createAirSearchPrefsTypeTPAExtensionsTargetMinNumOfLFSOnlSolPerCrr() {
        return new AirSearchPrefsType.TPAExtensions.TargetMinNumOfLFSOnlSolPerCrr();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.TargetMinNumOfLFSTotOnlSolPercent }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.TargetMinNumOfLFSTotOnlSolPercent createAirSearchPrefsTypeTPAExtensionsTargetMinNumOfLFSTotOnlSolPercent() {
        return new AirSearchPrefsType.TPAExtensions.TargetMinNumOfLFSTotOnlSolPercent();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.FltOptLFSReuseLimitForNonAVS }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.FltOptLFSReuseLimitForNonAVS createAirSearchPrefsTypeTPAExtensionsFltOptLFSReuseLimitForNonAVS() {
        return new AirSearchPrefsType.TPAExtensions.FltOptLFSReuseLimitForNonAVS();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.FltOptLFSReuseLimitForAVS }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.FltOptLFSReuseLimitForAVS createAirSearchPrefsTypeTPAExtensionsFltOptLFSReuseLimitForAVS() {
        return new AirSearchPrefsType.TPAExtensions.FltOptLFSReuseLimitForAVS();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.AvsPenaltyCrrs }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.AvsPenaltyCrrs createAirSearchPrefsTypeTPAExtensionsAvsPenaltyCrrs() {
        return new AirSearchPrefsType.TPAExtensions.AvsPenaltyCrrs();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.MaxNumOfNonStpOnlSol }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.MaxNumOfNonStpOnlSol createAirSearchPrefsTypeTPAExtensionsMaxNumOfNonStpOnlSol() {
        return new AirSearchPrefsType.TPAExtensions.MaxNumOfNonStpOnlSol();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.MaxNumOfNonStpInrlSol }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.MaxNumOfNonStpInrlSol createAirSearchPrefsTypeTPAExtensionsMaxNumOfNonStpInrlSol() {
        return new AirSearchPrefsType.TPAExtensions.MaxNumOfNonStpInrlSol();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.MaxNumOfSingleStpOnlSol }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.MaxNumOfSingleStpOnlSol createAirSearchPrefsTypeTPAExtensionsMaxNumOfSingleStpOnlSol() {
        return new AirSearchPrefsType.TPAExtensions.MaxNumOfSingleStpOnlSol();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.MaxNumOf2PlusStpSol }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.MaxNumOf2PlusStpSol createAirSearchPrefsTypeTPAExtensionsMaxNumOf2PlusStpSol() {
        return new AirSearchPrefsType.TPAExtensions.MaxNumOf2PlusStpSol();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.MinAllowedOveragePerCrrPercent }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.MinAllowedOveragePerCrrPercent createAirSearchPrefsTypeTPAExtensionsMinAllowedOveragePerCrrPercent() {
        return new AirSearchPrefsType.TPAExtensions.MinAllowedOveragePerCrrPercent();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.MinAllowedOveragePerCrr }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.MinAllowedOveragePerCrr createAirSearchPrefsTypeTPAExtensionsMinAllowedOveragePerCrr() {
        return new AirSearchPrefsType.TPAExtensions.MinAllowedOveragePerCrr();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.MaxRelFareLvlOfxForNonStp }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.MaxRelFareLvlOfxForNonStp createAirSearchPrefsTypeTPAExtensionsMaxRelFareLvlOfxForNonStp() {
        return new AirSearchPrefsType.TPAExtensions.MaxRelFareLvlOfxForNonStp();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.MaxRelFareLvlOfxForCnx }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.MaxRelFareLvlOfxForCnx createAirSearchPrefsTypeTPAExtensionsMaxRelFareLvlOfxForCnx() {
        return new AirSearchPrefsType.TPAExtensions.MaxRelFareLvlOfxForCnx();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.NumOfMustPrice2PlusStpSol }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.NumOfMustPrice2PlusStpSol createAirSearchPrefsTypeTPAExtensionsNumOfMustPrice2PlusStpSol() {
        return new AirSearchPrefsType.TPAExtensions.NumOfMustPrice2PlusStpSol();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.ItineraryNumberThreshold }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.ItineraryNumberThreshold createAirSearchPrefsTypeTPAExtensionsItineraryNumberThreshold() {
        return new AirSearchPrefsType.TPAExtensions.ItineraryNumberThreshold();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.ExemptAllTaxes }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.ExemptAllTaxes createAirSearchPrefsTypeTPAExtensionsExemptAllTaxes() {
        return new AirSearchPrefsType.TPAExtensions.ExemptAllTaxes();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.ExemptAllTaxesAndFees }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.ExemptAllTaxesAndFees createAirSearchPrefsTypeTPAExtensionsExemptAllTaxesAndFees() {
        return new AirSearchPrefsType.TPAExtensions.ExemptAllTaxesAndFees();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.Taxes }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.Taxes createAirSearchPrefsTypeTPAExtensionsTaxes() {
        return new AirSearchPrefsType.TPAExtensions.Taxes();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.TicketingSumOfLocals }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.TicketingSumOfLocals createAirSearchPrefsTypeTPAExtensionsTicketingSumOfLocals() {
        return new AirSearchPrefsType.TPAExtensions.TicketingSumOfLocals();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.ExcludeCallDirectCarriers }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.ExcludeCallDirectCarriers createAirSearchPrefsTypeTPAExtensionsExcludeCallDirectCarriers() {
        return new AirSearchPrefsType.TPAExtensions.ExcludeCallDirectCarriers();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.AdditionalFareLimit }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.AdditionalFareLimit createAirSearchPrefsTypeTPAExtensionsAdditionalFareLimit() {
        return new AirSearchPrefsType.TPAExtensions.AdditionalFareLimit();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.OptionsPerDatePairList }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.OptionsPerDatePairList createAirSearchPrefsTypeTPAExtensionsOptionsPerDatePairList() {
        return new AirSearchPrefsType.TPAExtensions.OptionsPerDatePairList();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.DiversityParameters.Weightings }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.DiversityParameters.Weightings createAirSearchPrefsTypeTPAExtensionsDiversityParametersWeightings() {
        return new AirSearchPrefsType.TPAExtensions.DiversityParameters.Weightings();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TPAExtensions.DiversityParameters.TimeOfDayDistribution.TimeOfDayRange }
     * 
     */
    public AirSearchPrefsType.TPAExtensions.DiversityParameters.TimeOfDayDistribution.TimeOfDayRange createAirSearchPrefsTypeTPAExtensionsDiversityParametersTimeOfDayDistributionTimeOfDayRange() {
        return new AirSearchPrefsType.TPAExtensions.DiversityParameters.TimeOfDayDistribution.TimeOfDayRange();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.DateFlexibility }
     * 
     */
    public OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.DateFlexibility createOTAAirLowFareSearchRQOriginDestinationInformationTPAExtensionsDateFlexibility() {
        return new OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.DateFlexibility();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.SisterDestinationMileage }
     * 
     */
    public OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.SisterDestinationMileage createOTAAirLowFareSearchRQOriginDestinationInformationTPAExtensionsSisterDestinationMileage() {
        return new OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.SisterDestinationMileage();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.SisterOriginMileage }
     * 
     */
    public OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.SisterOriginMileage createOTAAirLowFareSearchRQOriginDestinationInformationTPAExtensionsSisterOriginMileage() {
        return new OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.SisterOriginMileage();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.SegmentType }
     * 
     */
    public OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.SegmentType createOTAAirLowFareSearchRQOriginDestinationInformationTPAExtensionsSegmentType() {
        return new OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.SegmentType();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.AlternateTime }
     * 
     */
    public OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.AlternateTime createOTAAirLowFareSearchRQOriginDestinationInformationTPAExtensionsAlternateTime() {
        return new OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.AlternateTime();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.MaxOneWayOptions }
     * 
     */
    public OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.MaxOneWayOptions createOTAAirLowFareSearchRQOriginDestinationInformationTPAExtensionsMaxOneWayOptions() {
        return new OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.MaxOneWayOptions();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.NumOneWayOptions }
     * 
     */
    public OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.NumOneWayOptions createOTAAirLowFareSearchRQOriginDestinationInformationTPAExtensionsNumOneWayOptions() {
        return new OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.NumOneWayOptions();
    }

    /**
     * Create an instance of {@link OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.ConnectionTime }
     * 
     */
    public OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.ConnectionTime createOTAAirLowFareSearchRQOriginDestinationInformationTPAExtensionsConnectionTime() {
        return new OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.ConnectionTime();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebxml.org/namespaces/messageHeader", name = "ConversationId")
    public JAXBElement<String> createConversationId(String value) {
        return new JAXBElement<String>(_ConversationId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SPKIDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SPKIData")
    public JAXBElement<SPKIDataType> createSPKIData(SPKIDataType value) {
        return new JAXBElement<SPKIDataType>(_SPKIData_QNAME, SPKIDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TPAExtensionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "TPA_Extensions")
    public JAXBElement<TPAExtensionsType> createTPAExtensions(TPAExtensionsType value) {
        return new JAXBElement<TPAExtensionsType>(_TPAExtensions_QNAME, TPAExtensionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebxml.org/namespaces/messageHeader", name = "Action")
    public JAXBElement<String> createAction(String value) {
        return new JAXBElement<String>(_Action_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Envelope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Envelope")
    public JAXBElement<Envelope> createEnvelope(Envelope value) {
        return new JAXBElement<Envelope>(_Envelope_QNAME, Envelope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Fault")
    public JAXBElement<Fault> createFault(Fault value) {
        return new JAXBElement<Fault>(_Fault_QNAME, Fault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyInfo")
    public JAXBElement<KeyInfoType> createKeyInfo(KeyInfoType value) {
        return new JAXBElement<KeyInfoType>(_KeyInfo_QNAME, KeyInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureValue")
    public JAXBElement<SignatureValueType> createSignatureValue(SignatureValueType value) {
        return new JAXBElement<SignatureValueType>(_SignatureValue_QNAME, SignatureValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebxml.org/namespaces/messageHeader", name = "Timestamp")
    public JAXBElement<String> createTimestamp(String value) {
        return new JAXBElement<String>(_Timestamp_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyValue")
    public JAXBElement<KeyValueType> createKeyValue(KeyValueType value) {
        return new JAXBElement<KeyValueType>(_KeyValue_QNAME, KeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebxml.org/namespaces/messageHeader", name = "RefToMessageId")
    public JAXBElement<String> createRefToMessageId(String value) {
        return new JAXBElement<String>(_RefToMessageId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Body }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Body")
    public JAXBElement<Body> createBody(Body value) {
        return new JAXBElement<Body>(_Body_QNAME, Body.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Transforms")
    public JAXBElement<TransformsType> createTransforms(TransformsType value) {
        return new JAXBElement<TransformsType>(_Transforms_QNAME, TransformsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DigestMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DigestMethod")
    public JAXBElement<DigestMethodType> createDigestMethod(DigestMethodType value) {
        return new JAXBElement<DigestMethodType>(_DigestMethod_QNAME, DigestMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SequenceNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebxml.org/namespaces/messageHeader", name = "SequenceNumber")
    public JAXBElement<SequenceNumberType> createSequenceNumber(SequenceNumberType value) {
        return new JAXBElement<SequenceNumberType>(_SequenceNumber_QNAME, SequenceNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebxml.org/namespaces/messageHeader", name = "DuplicateElimination")
    public JAXBElement<Object> createDuplicateElimination(Object value) {
        return new JAXBElement<Object>(_DuplicateElimination_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X509DataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509Data")
    public JAXBElement<X509DataType> createX509Data(X509DataType value) {
        return new JAXBElement<X509DataType>(_X509Data_QNAME, X509DataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignaturePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureProperty")
    public JAXBElement<SignaturePropertyType> createSignatureProperty(SignaturePropertyType value) {
        return new JAXBElement<SignaturePropertyType>(_SignatureProperty_QNAME, SignaturePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebxml.org/namespaces/messageHeader", name = "TimeToLive")
    public JAXBElement<XMLGregorianCalendar> createTimeToLive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TimeToLive_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyName")
    public JAXBElement<String> createKeyName(String value) {
        return new JAXBElement<String>(_KeyName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSAKeyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "RSAKeyValue")
    public JAXBElement<RSAKeyValueType> createRSAKeyValue(RSAKeyValueType value) {
        return new JAXBElement<RSAKeyValueType>(_RSAKeyValue_QNAME, RSAKeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Signature")
    public JAXBElement<SignatureType> createSignature(SignatureType value) {
        return new JAXBElement<SignatureType>(_Signature_QNAME, SignatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebxml.org/namespaces/messageHeader", name = "Timeout")
    public JAXBElement<BigInteger> createTimeout(BigInteger value) {
        return new JAXBElement<BigInteger>(_Timeout_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "MgmtData")
    public JAXBElement<String> createMgmtData(String value) {
        return new JAXBElement<String>(_MgmtData_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureMethod")
    public JAXBElement<SignatureMethodType> createSignatureMethod(SignatureMethodType value) {
        return new JAXBElement<SignatureMethodType>(_SignatureMethod_QNAME, SignatureMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Object")
    public JAXBElement<ObjectType> createObject(ObjectType value) {
        return new JAXBElement<ObjectType>(_Object_QNAME, ObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignaturePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureProperties")
    public JAXBElement<SignaturePropertiesType> createSignatureProperties(SignaturePropertiesType value) {
        return new JAXBElement<SignaturePropertiesType>(_SignatureProperties_QNAME, SignaturePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Transform")
    public JAXBElement<TransformType> createTransform(TransformType value) {
        return new JAXBElement<TransformType>(_Transform_QNAME, TransformType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PGPDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "PGPData")
    public JAXBElement<PGPDataType> createPGPData(PGPDataType value) {
        return new JAXBElement<PGPDataType>(_PGPData_QNAME, PGPDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Reference")
    public JAXBElement<ReferenceType> createReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_Reference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievalMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "RetrievalMethod")
    public JAXBElement<RetrievalMethodType> createRetrievalMethod(RetrievalMethodType value) {
        return new JAXBElement<RetrievalMethodType>(_RetrievalMethod_QNAME, RetrievalMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSAKeyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DSAKeyValue")
    public JAXBElement<DSAKeyValueType> createDSAKeyValue(DSAKeyValueType value) {
        return new JAXBElement<DSAKeyValueType>(_DSAKeyValue_QNAME, DSAKeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DigestValue")
    public JAXBElement<byte[]> createDigestValue(byte[] value) {
        return new JAXBElement<byte[]>(_DigestValue_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebxml.org/namespaces/messageHeader", name = "CPAId")
    public JAXBElement<String> createCPAId(String value) {
        return new JAXBElement<String>(_CPAId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanonicalizationMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "CanonicalizationMethod")
    public JAXBElement<CanonicalizationMethodType> createCanonicalizationMethod(CanonicalizationMethodType value) {
        return new JAXBElement<CanonicalizationMethodType>(_CanonicalizationMethod_QNAME, CanonicalizationMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Header }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Header")
    public JAXBElement<Header> createHeader(Header value) {
        return new JAXBElement<Header>(_Header_QNAME, Header.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignedInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignedInfo")
    public JAXBElement<SignedInfoType> createSignedInfo(SignedInfoType value) {
        return new JAXBElement<SignedInfoType>(_SignedInfo_QNAME, SignedInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebxml.org/namespaces/messageHeader", name = "MessageId")
    public JAXBElement<String> createMessageId(String value) {
        return new JAXBElement<String>(_MessageId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManifestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Manifest")
    public JAXBElement<ManifestType> createManifest(ManifestType value) {
        return new JAXBElement<ManifestType>(_Manifest_QNAME, ManifestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X509IssuerSerialType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509IssuerSerial", scope = X509DataType.class)
    public JAXBElement<X509IssuerSerialType> createX509DataTypeX509IssuerSerial(X509IssuerSerialType value) {
        return new JAXBElement<X509IssuerSerialType>(_X509DataTypeX509IssuerSerial_QNAME, X509IssuerSerialType.class, X509DataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509CRL", scope = X509DataType.class)
    public JAXBElement<byte[]> createX509DataTypeX509CRL(byte[] value) {
        return new JAXBElement<byte[]>(_X509DataTypeX509CRL_QNAME, byte[].class, X509DataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509SubjectName", scope = X509DataType.class)
    public JAXBElement<String> createX509DataTypeX509SubjectName(String value) {
        return new JAXBElement<String>(_X509DataTypeX509SubjectName_QNAME, String.class, X509DataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509SKI", scope = X509DataType.class)
    public JAXBElement<byte[]> createX509DataTypeX509SKI(byte[] value) {
        return new JAXBElement<byte[]>(_X509DataTypeX509SKI_QNAME, byte[].class, X509DataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509Certificate", scope = X509DataType.class)
    public JAXBElement<byte[]> createX509DataTypeX509Certificate(byte[] value) {
        return new JAXBElement<byte[]>(_X509DataTypeX509Certificate_QNAME, byte[].class, X509DataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "HMACOutputLength", scope = SignatureMethodType.class)
    public JAXBElement<BigInteger> createSignatureMethodTypeHMACOutputLength(BigInteger value) {
        return new JAXBElement<BigInteger>(_SignatureMethodTypeHMACOutputLength_QNAME, BigInteger.class, SignatureMethodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SPKISexp", scope = SPKIDataType.class)
    public JAXBElement<byte[]> createSPKIDataTypeSPKISexp(byte[] value) {
        return new JAXBElement<byte[]>(_SPKIDataTypeSPKISexp_QNAME, byte[].class, SPKIDataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "XPath", scope = TransformType.class)
    public JAXBElement<String> createTransformTypeXPath(String value) {
        return new JAXBElement<String>(_TransformTypeXPath_QNAME, String.class, TransformType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "TPA_Extensions", scope = PriceRequestInformationType.NegotiatedFareCode.class)
    public JAXBElement<String> createPriceRequestInformationTypeNegotiatedFareCodeTPAExtensions(String value) {
        return new JAXBElement<String>(_TPAExtensions_QNAME, String.class, PriceRequestInformationType.NegotiatedFareCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Supplier", scope = PriceRequestInformationType.NegotiatedFareCode.class)
    public JAXBElement<CompanyNameType> createPriceRequestInformationTypeNegotiatedFareCodeSupplier(CompanyNameType value) {
        return new JAXBElement<CompanyNameType>(_PriceRequestInformationTypeNegotiatedFareCodeSupplier_QNAME, CompanyNameType.class, PriceRequestInformationType.NegotiatedFareCode.class, value);
    }

}
