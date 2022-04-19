
package services.sabre.enhancedairbook;

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
 * generated in the enhancedairbook package. 
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
    private final static QName _STLPayload_QNAME = new QName("http://services.sabre.com/STL_Payload/v02_01", "STL_Payload");
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
    private final static QName _ApplicationResults_QNAME = new QName("http://services.sabre.com/STL_Payload/v02_01", "ApplicationResults");
    private final static QName _SignatureProperties_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureProperties");
    private final static QName _STLResponsePayload_QNAME = new QName("http://services.sabre.com/STL_Payload/v02_01", "STL_Response_Payload");
    private final static QName _Transform_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Transform");
    private final static QName _PGPData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "PGPData");
    private final static QName _Reference_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Reference");
    private final static QName _RetrievalMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "RetrievalMethod");
    private final static QName _DSAKeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DSAKeyValue");
    private final static QName _Results_QNAME = new QName("http://services.sabre.com/STL_Payload/v02_01", "Results");
    private final static QName _DigestValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestValue");
    private final static QName _STLNotifPayload_QNAME = new QName("http://services.sabre.com/STL_Payload/v02_01", "STL_Notif_Payload");
    private final static QName _CPAId_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "CPAId");
    private final static QName _CanonicalizationMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "CanonicalizationMethod");
    private final static QName _Header_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Header");
    private final static QName _SignedInfo_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignedInfo");
    private final static QName _MessageId_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "MessageId");
    private final static QName _STLRequestPayload_QNAME = new QName("http://services.sabre.com/STL_Payload/v02_01", "STL_Request_Payload");
    private final static QName _ProblemInformation_QNAME = new QName("http://services.sabre.com/STL_Payload/v02_01", "ProblemInformation");
    private final static QName _Manifest_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Manifest");
    private final static QName _X509DataTypeX509IssuerSerial_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509IssuerSerial");
    private final static QName _X509DataTypeX509CRL_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509CRL");
    private final static QName _X509DataTypeX509SubjectName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SubjectName");
    private final static QName _X509DataTypeX509SKI_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SKI");
    private final static QName _X509DataTypeX509Certificate_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509Certificate");
    private final static QName _SignatureMethodTypeHMACOutputLength_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "HMACOutputLength");
    private final static QName _TransformTypeXPath_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "XPath");
    private final static QName _SPKIDataTypeSPKISexp_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SPKISexp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: enhancedairbook
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS }
     * 
     */
    public EnhancedAirBookRS createEnhancedAirBookRS() {
        return new EnhancedAirBookRS();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ }
     * 
     */
    public EnhancedAirBookRQ createEnhancedAirBookRQ() {
        return new EnhancedAirBookRQ();
    }

    /**
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link AddressType.CountryCodes }
     * 
     */
    public AddressType.CountryCodes createAddressTypeCountryCodes() {
        return new AddressType.CountryCodes();
    }

    /**
     * Create an instance of {@link AddressType.StateProviceCodes }
     * 
     */
    public AddressType.StateProviceCodes createAddressTypeStateProviceCodes() {
        return new AddressType.StateProviceCodes();
    }

    /**
     * Create an instance of {@link AddressType.CityCodes }
     * 
     */
    public AddressType.CityCodes createAddressTypeCityCodes() {
        return new AddressType.CityCodes();
    }

    /**
     * Create an instance of {@link ServiceProviderType }
     * 
     */
    public ServiceProviderType createServiceProviderType() {
        return new ServiceProviderType();
    }

    /**
     * Create an instance of {@link PassengerType }
     * 
     */
    public PassengerType createPassengerType() {
        return new PassengerType();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link DocumentType.DocumentRules }
     * 
     */
    public DocumentType.DocumentRules createDocumentTypeDocumentRules() {
        return new DocumentType.DocumentRules();
    }

    /**
     * Create an instance of {@link DocumentType.FormOfPayment }
     * 
     */
    public DocumentType.FormOfPayment createDocumentTypeFormOfPayment() {
        return new DocumentType.FormOfPayment();
    }

    /**
     * Create an instance of {@link DocumentType.FormOfPayment.CreditCard }
     * 
     */
    public DocumentType.FormOfPayment.CreditCard createDocumentTypeFormOfPaymentCreditCard() {
        return new DocumentType.FormOfPayment.CreditCard();
    }

    /**
     * Create an instance of {@link DocumentType.SegmentReferences }
     * 
     */
    public DocumentType.SegmentReferences createDocumentTypeSegmentReferences() {
        return new DocumentType.SegmentReferences();
    }

    /**
     * Create an instance of {@link DocumentType.PassengerReferences }
     * 
     */
    public DocumentType.PassengerReferences createDocumentTypePassengerReferences() {
        return new DocumentType.PassengerReferences();
    }

    /**
     * Create an instance of {@link HotelType }
     * 
     */
    public HotelType createHotelType() {
        return new HotelType();
    }

    /**
     * Create an instance of {@link HotelProductType }
     * 
     */
    public HotelProductType createHotelProductType() {
        return new HotelProductType();
    }

    /**
     * Create an instance of {@link HotelProductType.HotelPolicy }
     * 
     */
    public HotelProductType.HotelPolicy createHotelProductTypeHotelPolicy() {
        return new HotelProductType.HotelPolicy();
    }

    /**
     * Create an instance of {@link HotelType.AdditionalInformation }
     * 
     */
    public HotelType.AdditionalInformation createHotelTypeAdditionalInformation() {
        return new HotelType.AdditionalInformation();
    }

    /**
     * Create an instance of {@link HotelType.Reservation }
     * 
     */
    public HotelType.Reservation createHotelTypeReservation() {
        return new HotelType.Reservation();
    }

    /**
     * Create an instance of {@link HotelType.Reservation.HotelTotalPricing }
     * 
     */
    public HotelType.Reservation.HotelTotalPricing createHotelTypeReservationHotelTotalPricing() {
        return new HotelType.Reservation.HotelTotalPricing();
    }

    /**
     * Create an instance of {@link HotelType.Reservation.HotelTotalPricing.TotalSurcharge }
     * 
     */
    public HotelType.Reservation.HotelTotalPricing.TotalSurcharge createHotelTypeReservationHotelTotalPricingTotalSurcharge() {
        return new HotelType.Reservation.HotelTotalPricing.TotalSurcharge();
    }

    /**
     * Create an instance of {@link HotelType.Reservation.HotelTotalPricing.TotalTax }
     * 
     */
    public HotelType.Reservation.HotelTotalPricing.TotalTax createHotelTypeReservationHotelTotalPricingTotalTax() {
        return new HotelType.Reservation.HotelTotalPricing.TotalTax();
    }

    /**
     * Create an instance of {@link RailFareType }
     * 
     */
    public RailFareType createRailFareType() {
        return new RailFareType();
    }

    /**
     * Create an instance of {@link RailFareType.Fare }
     * 
     */
    public RailFareType.Fare createRailFareTypeFare() {
        return new RailFareType.Fare();
    }

    /**
     * Create an instance of {@link RailFareType.Fare.FareDescription }
     * 
     */
    public RailFareType.Fare.FareDescription createRailFareTypeFareFareDescription() {
        return new RailFareType.Fare.FareDescription();
    }

    /**
     * Create an instance of {@link RailFareType.Fare.SegmentReferences }
     * 
     */
    public RailFareType.Fare.SegmentReferences createRailFareTypeFareSegmentReferences() {
        return new RailFareType.Fare.SegmentReferences();
    }

    /**
     * Create an instance of {@link RailFareType.Fare.PassengerReferences }
     * 
     */
    public RailFareType.Fare.PassengerReferences createRailFareTypeFarePassengerReferences() {
        return new RailFareType.Fare.PassengerReferences();
    }

    /**
     * Create an instance of {@link ProductDetailsType }
     * 
     */
    public ProductDetailsType createProductDetailsType() {
        return new ProductDetailsType();
    }

    /**
     * Create an instance of {@link RailType }
     * 
     */
    public RailType createRailType() {
        return new RailType();
    }

    /**
     * Create an instance of {@link CompanyType }
     * 
     */
    public CompanyType createCompanyType() {
        return new CompanyType();
    }

    /**
     * Create an instance of {@link LocationDetailsType }
     * 
     */
    public LocationDetailsType createLocationDetailsType() {
        return new LocationDetailsType();
    }

    /**
     * Create an instance of {@link LocationDetailsType.RailwayStationInfo }
     * 
     */
    public LocationDetailsType.RailwayStationInfo createLocationDetailsTypeRailwayStationInfo() {
        return new LocationDetailsType.RailwayStationInfo();
    }

    /**
     * Create an instance of {@link LocationDetailsType.RailwayStationInfo.LocationCodes }
     * 
     */
    public LocationDetailsType.RailwayStationInfo.LocationCodes createLocationDetailsTypeRailwayStationInfoLocationCodes() {
        return new LocationDetailsType.RailwayStationInfo.LocationCodes();
    }

    /**
     * Create an instance of {@link SupplementaryServiceType }
     * 
     */
    public SupplementaryServiceType createSupplementaryServiceType() {
        return new SupplementaryServiceType();
    }

    /**
     * Create an instance of {@link SupplementaryServiceType.PassengerReferences }
     * 
     */
    public SupplementaryServiceType.PassengerReferences createSupplementaryServiceTypePassengerReferences() {
        return new SupplementaryServiceType.PassengerReferences();
    }

    /**
     * Create an instance of {@link RailAccommodationType }
     * 
     */
    public RailAccommodationType createRailAccommodationType() {
        return new RailAccommodationType();
    }

    /**
     * Create an instance of {@link RailAccommodationType.Placement }
     * 
     */
    public RailAccommodationType.Placement createRailAccommodationTypePlacement() {
        return new RailAccommodationType.Placement();
    }

    /**
     * Create an instance of {@link RailAccommodationType.Placement.Coach }
     * 
     */
    public RailAccommodationType.Placement.Coach createRailAccommodationTypePlacementCoach() {
        return new RailAccommodationType.Placement.Coach();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.PreProcessing }
     * 
     */
    public EnhancedAirBookRQ.PreProcessing createEnhancedAirBookRQPreProcessing() {
        return new EnhancedAirBookRQ.PreProcessing();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.PostProcessing }
     * 
     */
    public EnhancedAirBookRQ.PostProcessing createEnhancedAirBookRQPostProcessing() {
        return new EnhancedAirBookRQ.PostProcessing();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ createEnhancedAirBookRQOTAAirPriceRQ() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformation() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiers() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiers() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ValidityDates }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ValidityDates createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersValidityDates() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ValidityDates();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersTaxes() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersOverrides() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.GoverningCarrierOverride }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.GoverningCarrierOverride createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersOverridesGoverningCarrierOverride() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.GoverningCarrierOverride();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersNetRemit() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersItineraryOptions() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.CommandPricing }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.CommandPricing createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersCommandPricing() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.CommandPricing();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersMiscQualifiers() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersMiscQualifiersTourCode() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.BaggageAllowance }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.BaggageAllowance createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersMiscQualifiersBaggageAllowance() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.BaggageAllowance();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersMiscQualifiersAirExtras() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiers() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersSabreSonicTicketing() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersSabreSonicTicketingMultipleFOP() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.Taxes }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.Taxes createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersSabreSonicTicketingMultipleFOPTaxes() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.Taxes();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.FOPTwo }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.FOPTwo createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersSabreSonicTicketingMultipleFOPFOPTwo() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.FOPTwo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.FOPTwo.CCInfo }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.FOPTwo.CCInfo createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersSabreSonicTicketingMultipleFOPFOPTwoCCInfo() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.FOPTwo.CCInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.FOPOne }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.FOPOne createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersSabreSonicTicketingMultipleFOPFOPOne() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.FOPOne();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.FOPOne.CCInfo }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.FOPOne.CCInfo createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersSabreSonicTicketingMultipleFOPFOPOneCCInfo() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.FOPOne.CCInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersSabreSonicTicketingEnhancedMultipleFOP() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.Taxes }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.Taxes createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersSabreSonicTicketingEnhancedMultipleFOPTaxes() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.Taxes();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.FOPTwo }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.FOPTwo createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersSabreSonicTicketingEnhancedMultipleFOPFOPTwo() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.FOPTwo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.FOPTwo.CCInfo }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.FOPTwo.CCInfo createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersSabreSonicTicketingEnhancedMultipleFOPFOPTwoCCInfo() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.FOPTwo.CCInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.FOPOne }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.FOPOne createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersSabreSonicTicketingEnhancedMultipleFOPFOPOne() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.FOPOne();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.FOPOne.CCInfo }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.FOPOne.CCInfo createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersSabreSonicTicketingEnhancedMultipleFOPFOPOneCCInfo() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.FOPOne.CCInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.BasicFOP }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.BasicFOP createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersSabreSonicTicketingBasicFOP() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.BasicFOP();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.BasicFOP.CCInfo }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.BasicFOP.CCInfo createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersSabreSonicTicketingBasicFOPCCInfo() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.BasicFOP.CCInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketing() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.PayLaterPlan }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.PayLaterPlan createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingPayLaterPlan() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.PayLaterPlan();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.PayLaterPlan.FOP }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.PayLaterPlan.FOP createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingPayLaterPlanFOP() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.PayLaterPlan.FOP();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.PayLaterPlan.FOP.CCInfo }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.PayLaterPlan.FOP.CCInfo createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingPayLaterPlanFOPCCInfo() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.PayLaterPlan.FOP.CCInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingMultipleMiscFOP() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP.Taxes }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP.Taxes createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingMultipleMiscFOPTaxes() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP.Taxes();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP.FOPTwo }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP.FOPTwo createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingMultipleMiscFOPFOPTwo() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP.FOPTwo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP.FOPOne }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP.FOPOne createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingMultipleMiscFOPFOPOne() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP.FOPOne();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP.FOPOne.CCInfo }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP.FOPOne.CCInfo createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingMultipleMiscFOPFOPOneCCInfo() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP.FOPOne.CCInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingMultipleFOP() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.Taxes }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.Taxes createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingMultipleFOPTaxes() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.Taxes();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.FOPTwo }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.FOPTwo createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingMultipleFOPFOPTwo() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.FOPTwo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.FOPTwo.CCInfo }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.FOPTwo.CCInfo createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingMultipleFOPFOPTwoCCInfo() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.FOPTwo.CCInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.FOPOne }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.FOPOne createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingMultipleFOPFOPOne() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.FOPOne();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.FOPOne.CCInfo }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.FOPOne.CCInfo createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingMultipleFOPFOPOneCCInfo() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.FOPOne.CCInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BasicFOP }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BasicFOP createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBasicFOP() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BasicFOP();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BasicFOP.CCInfo }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BasicFOP.CCInfo createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBasicFOPCCInfo() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BasicFOP.CCInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFlightQualifiers() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.VendorPrefs }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.VendorPrefs createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFlightQualifiersVendorPrefs() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.VendorPrefs();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirBookRQ }
     * 
     */
    public EnhancedAirBookRQ.OTAAirBookRQ createEnhancedAirBookRQOTAAirBookRQ() {
        return new EnhancedAirBookRQ.OTAAirBookRQ();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation }
     * 
     */
    public EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation createEnhancedAirBookRQOTAAirBookRQOriginDestinationInformation() {
        return new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment }
     * 
     */
    public EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment createEnhancedAirBookRQOTAAirBookRQOriginDestinationInformationFlightSegment() {
        return new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ createEnhancedAirBookRQAirTaxRQ() {
        return new EnhancedAirBookRQ.AirTaxRQ();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.POS }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.POS createEnhancedAirBookRQAirTaxRQPOS() {
        return new EnhancedAirBookRQ.AirTaxRQ.POS();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.POS.Source }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.POS.Source createEnhancedAirBookRQAirTaxRQPOSSource() {
        return new EnhancedAirBookRQ.AirTaxRQ.POS.Source();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions createEnhancedAirBookRQAirTaxRQPOSSourceTPAExtensions() {
        return new EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo createEnhancedAirBookRQAirTaxRQPOSSourceTPAExtensionsUserInfo() {
        return new EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos createEnhancedAirBookRQAirTaxRQItineraryInfos() {
        return new EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo createEnhancedAirBookRQAirTaxRQItineraryInfosItineraryInfo() {
        return new EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems createEnhancedAirBookRQAirTaxRQItineraryInfosItineraryInfoReservationItems() {
        return new EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item createEnhancedAirBookRQAirTaxRQItineraryInfosItineraryInfoReservationItemsItem() {
        return new EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment createEnhancedAirBookRQAirTaxRQItineraryInfosItineraryInfoReservationItemsItemFlightSegment() {
        return new EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.HiddenStops }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.HiddenStops createEnhancedAirBookRQAirTaxRQItineraryInfosItineraryInfoReservationItemsItemFlightSegmentHiddenStops() {
        return new EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.HiddenStops();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.FareBreakInfo }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.FareBreakInfo createEnhancedAirBookRQAirTaxRQItineraryInfosItineraryInfoReservationItemsItemFlightSegmentFareBreakInfo() {
        return new EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.FareBreakInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.AirFareInfo }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.AirFareInfo createEnhancedAirBookRQAirTaxRQItineraryInfosItineraryInfoReservationItemsItemAirFareInfo() {
        return new EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.AirFareInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.AirFareInfo.PTCFareBreakdown }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.AirFareInfo.PTCFareBreakdown createEnhancedAirBookRQAirTaxRQItineraryInfosItineraryInfoReservationItemsItemAirFareInfoPTCFareBreakdown() {
        return new EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.AirFareInfo.PTCFareBreakdown();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.AirFareInfo.PTCFareBreakdown.PassengerFare }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.AirFareInfo.PTCFareBreakdown.PassengerFare createEnhancedAirBookRQAirTaxRQItineraryInfosItineraryInfoReservationItemsItemAirFareInfoPTCFareBreakdownPassengerFare() {
        return new EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.AirFareInfo.PTCFareBreakdown.PassengerFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS createEnhancedAirBookRSTravelItineraryReadRS() {
        return new EnhancedAirBookRS.TravelItineraryReadRS();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.VCR }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.VCR createEnhancedAirBookRSTravelItineraryReadRSVCR() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.VCR();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.VCR.TicketingDocument }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.VCR.TicketingDocument createEnhancedAirBookRSTravelItineraryReadRSVCRTicketingDocument() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.VCR.TicketingDocument();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary createEnhancedAirBookRSTravelItineraryReadRSTravelItinerary() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.SpecialServiceInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.SpecialServiceInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItinerarySpecialServiceInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.SpecialServiceInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.SpecialServiceInfo.Service }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.SpecialServiceInfo.Service createEnhancedAirBookRSTravelItineraryReadRSTravelItinerarySpecialServiceInfoService() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.SpecialServiceInfo.Service();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.RemarkInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.RemarkInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryRemarkInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.RemarkInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.RemarkInfo.Remark }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.RemarkInfo.Remark createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryRemarkInfoRemark() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.RemarkInfo.Remark();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.QueueInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.QueueInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryQueueInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.QueueInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.PayInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.PayInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryPayInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.PayInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryRef }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryRef createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryRef() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryRef();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItems() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItem() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillaries() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryService() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TravelPortions }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TravelPortions createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceTravelPortions() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TravelPortions();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalTaxes }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalTaxes createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceTotalTaxes() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalTaxes();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.Taxes }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.Taxes createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceTaxes() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.Taxes();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicle() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvail() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCore() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreVehicleCharges() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreVehicleChargesVehicleCharge() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge.ChargeDetails }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge.ChargeDetails createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreVehicleChargesVehicleChargeChargeDetails() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge.ChargeDetails();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreRentalRate() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.PricedEquip }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.PricedEquip createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCorePricedEquip() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.PricedEquip();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.GuaranteePrepaid }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.GuaranteePrepaid createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreGuaranteePrepaid() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.GuaranteePrepaid();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreCollectionDeliveryInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreCollectionDeliveryInfoDeliveryInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo.ContactNumbers }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo.ContactNumbers createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreCollectionDeliveryInfoDeliveryInfoContactNumbers() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo.ContactNumbers();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo.Address }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo.Address createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreCollectionDeliveryInfoDeliveryInfoAddress() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo.Address();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreCollectionDeliveryInfoCollectionInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo.ContactNumbers }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo.ContactNumbers createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreCollectionDeliveryInfoCollectionInfoContactNumbers() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo.ContactNumbers();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo.Address }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo.Address createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreCollectionDeliveryInfoCollectionInfoAddress() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo.Address();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehRentalCore() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.LocationDetails }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.LocationDetails createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehRentalCoreLocationDetails() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.LocationDetails();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.LocationDetails.ContactNumbers }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.LocationDetails.ContactNumbers createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehRentalCoreLocationDetailsContactNumbers() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.LocationDetails.ContactNumbers();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.FlightSegment }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.FlightSegment createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehRentalCoreFlightSegment() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.FlightSegment();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.POS }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.POS createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehiclePOS() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.POS();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemTour() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemTourTourDetails() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.HotelInformation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.HotelInformation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemTourTourDetailsHotelInformation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.HotelInformation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemSurface() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.FlightSegment }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.FlightSegment createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemSurfaceFlightSegment() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.FlightSegment();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemSeats() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats.Seat }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats.Seat createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemSeatsSeat() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats.Seat();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats.Seat.FlightSegment }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats.Seat.FlightSegment createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemSeatsSeatFlightSegment() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats.Seat.FlightSegment();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemRail() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.MiscSegment }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.MiscSegment createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemMiscSegment() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.MiscSegment();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemInsurance() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemInsuranceInsuranceDetails() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotel() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRates() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRate() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelTotalPricing() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.TotalSurcharge }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.TotalSurcharge createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelTotalPricingTotalSurcharge() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.TotalSurcharge();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.TotalTax }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.TotalTax createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelTotalPricingTotalTax() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.TotalTax();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelRateDescripton() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton.Additionals }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton.Additionals createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelRateDescriptonAdditionals() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton.Additionals();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton.RateDescriptions }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton.RateDescriptions createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelRateDescriptonRateDescriptions() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton.RateDescriptions();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.POS }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.POS createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelPOS() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.POS();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.Customer }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.Customer createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelCustomer() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.Customer();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelBasicPropertyInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo.ContactNumbers }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo.ContactNumbers createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelBasicPropertyInfoContactNumbers() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo.ContactNumbers();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegment() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemCruise() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.AirTaxi }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.AirTaxi createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAirTaxi() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.AirTaxi();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricing() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteTotals() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.Taxes }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.Taxes createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteTotalsTaxes() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.Taxes();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuote() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePriceQuotePlus() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.PACInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.PACInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePriceQuotePlusPACInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.PACInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.FuturePricingInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.FuturePricingInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePriceQuotePlusFuturePricingInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.FuturePricingInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.TicketingInstructionsInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.TicketingInstructionsInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePriceQuotePlusTicketingInstructionsInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.TicketingInstructionsInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.PassengerInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.PassengerInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePriceQuotePlusPassengerInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.PassengerInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItinerary() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoSellingFareDetails() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.Taxes }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.Taxes createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoSellingFareDetailsTaxes() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.Taxes();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.Commission }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.Commission createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoSellingFareDetailsCommission() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.Commission();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoNetFareDetails() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.Taxes }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.Taxes createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoNetFareDetailsTaxes() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.Taxes();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.Commission }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.Commission createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoNetFareDetailsCommission() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.Commission();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdown() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownFlightSegment() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.Endorsements }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.Endorsements createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownEndorsements() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.Endorsements();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.NetRemits }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.NetRemits createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownNetRemits() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.NetRemits();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareTotals() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.Taxes }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.Taxes createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareTotalsTaxes() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.Taxes();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareTaxes() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.TicketingFees }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.TicketingFees createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationTicketingFees() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.TicketingFees();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationGlobalNetRemit() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationGlobalNetRemitSellingFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationGlobalNetRemitNetFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.FileInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.FileInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryFileInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.FileInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryCustomerInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryCustomerInfoPersonName() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.GroupInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.GroupInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryCustomerInfoPersonNameGroupInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.GroupInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.GroupInfo.AssociatedReferenceInformation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.GroupInfo.AssociatedReferenceInformation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryCustomerInfoPersonNameGroupInfoAssociatedReferenceInformation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.GroupInfo.AssociatedReferenceInformation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.GroupInfo.AssociatedReferenceInformation.AssociatedPNRSummaries }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.GroupInfo.AssociatedReferenceInformation.AssociatedPNRSummaries createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryCustomerInfoPersonNameGroupInfoAssociatedReferenceInformationAssociatedPNRSummaries() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.GroupInfo.AssociatedReferenceInformation.AssociatedPNRSummaries();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryCustomerInfoPaymentInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryCustomerInfoPaymentInfoPayment() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryCustomerInfoPaymentInfoPaymentCCInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo.CardHolderInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo.CardHolderInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryCustomerInfoPaymentInfoPaymentCCInfoCardHolderInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo.CardHolderInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo.CardHolderInfo.ContactNumbers }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo.CardHolderInfo.ContactNumbers createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryCustomerInfoPaymentInfoPaymentCCInfoCardHolderInfoContactNumbers() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo.CardHolderInfo.ContactNumbers();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.ContactNumbers }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.ContactNumbers createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryCustomerInfoContactNumbers() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.ContactNumbers();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.ContactNumbers.ContactNumber }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.ContactNumbers.ContactNumber createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryCustomerInfoContactNumbersContactNumber() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.ContactNumbers.ContactNumber();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.Address }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.Address createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryCustomerInfoAddress() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.Address();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryAccountingInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.TicketingInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.TicketingInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryAccountingInfoTicketingInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.TicketingInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Taxes }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Taxes createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryAccountingInfoTaxes() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Taxes();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryAccountingInfoPaymentInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo.Payment }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo.Payment createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryAccountingInfoPaymentInfoPayment() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo.Payment();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo.Payment.CCInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo.Payment.CCInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryAccountingInfoPaymentInfoPaymentCCInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo.Payment.CCInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.DocumentInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.DocumentInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryAccountingInfoDocumentInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.DocumentInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS createEnhancedAirBookRSOTAAirPriceRS() {
        return new EnhancedAirBookRS.OTAAirPriceRS();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote createEnhancedAirBookRSOTAAirPriceRSPriceQuote() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItinerary() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfo() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.TicketingFees }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.TicketingFees createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoTicketingFees() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.TicketingFees();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdown() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFare() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Warnings }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Warnings createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareWarnings() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Warnings();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareTaxes() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaggageInfo }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaggageInfo createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareBaggageInfo() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaggageInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculationBreakdown }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculationBreakdown createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoFareCalculationBreakdown() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculationBreakdown();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoBaggageProvisions() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.SubCodeInfo }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.SubCodeInfo createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoBaggageProvisionsSubCodeInfo() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.SubCodeInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.PriceInformation }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.PriceInformation createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoBaggageProvisionsPriceInformation() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.PriceInformation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoBaggageProvisionsAssociations() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.AncillaryFees }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.AncillaryFees createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoAncillaryFees() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.AncillaryFees();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformation() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalCharges() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesTicketingInfo() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesTicketingInfoTicketing() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.PersonName }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.PersonName createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesTicketingInfoTicketingPersonName() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.PersonName();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesItineraryInfo() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesItineraryInfoFlightSegment() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesChargeDetails() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.VendorPrefs }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.VendorPrefs createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesChargeDetailsVendorPrefs() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.VendorPrefs();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesChargeDetailsChargeBreakdown() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Taxes }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Taxes createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesChargeDetailsChargeBreakdownTaxes() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Taxes();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationHeaderInformation() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.BargainFinder }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.BargainFinder createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationHeaderInformationBargainFinder() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.BargainFinder();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationBaggageInfo() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationBaggageInfoSubCodeProperties() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationBaggageInfoSubCodePropertiesSizeWeightInfo() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirBookRS }
     * 
     */
    public EnhancedAirBookRS.OTAAirBookRS createEnhancedAirBookRSOTAAirBookRS() {
        return new EnhancedAirBookRS.OTAAirBookRS();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirBookRS.OriginDestinationOption }
     * 
     */
    public EnhancedAirBookRS.OTAAirBookRS.OriginDestinationOption createEnhancedAirBookRSOTAAirBookRSOriginDestinationOption() {
        return new EnhancedAirBookRS.OTAAirBookRS.OriginDestinationOption();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirBookRS.OriginDestinationOption.FlightSegment }
     * 
     */
    public EnhancedAirBookRS.OTAAirBookRS.OriginDestinationOption.FlightSegment createEnhancedAirBookRSOTAAirBookRSOriginDestinationOptionFlightSegment() {
        return new EnhancedAirBookRS.OTAAirBookRS.OriginDestinationOption.FlightSegment();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.AirTaxRS }
     * 
     */
    public EnhancedAirBookRS.AirTaxRS createEnhancedAirBookRSAirTaxRS() {
        return new EnhancedAirBookRS.AirTaxRS();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.AirTaxRS.ItineraryInfos }
     * 
     */
    public EnhancedAirBookRS.AirTaxRS.ItineraryInfos createEnhancedAirBookRSAirTaxRSItineraryInfos() {
        return new EnhancedAirBookRS.AirTaxRS.ItineraryInfos();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.AirTaxRS.ItineraryInfos.ItineraryInfo }
     * 
     */
    public EnhancedAirBookRS.AirTaxRS.ItineraryInfos.ItineraryInfo createEnhancedAirBookRSAirTaxRSItineraryInfosItineraryInfo() {
        return new EnhancedAirBookRS.AirTaxRS.ItineraryInfos.ItineraryInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.AirTaxRS.ItineraryInfos.ItineraryInfo.TaxInfo }
     * 
     */
    public EnhancedAirBookRS.AirTaxRS.ItineraryInfos.ItineraryInfo.TaxInfo createEnhancedAirBookRSAirTaxRSItineraryInfosItineraryInfoTaxInfo() {
        return new EnhancedAirBookRS.AirTaxRS.ItineraryInfos.ItineraryInfo.TaxInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.AirTaxRS.ItineraryInfos.ItineraryInfo.TaxInfo.Taxes }
     * 
     */
    public EnhancedAirBookRS.AirTaxRS.ItineraryInfos.ItineraryInfo.TaxInfo.Taxes createEnhancedAirBookRSAirTaxRSItineraryInfosItineraryInfoTaxInfoTaxes() {
        return new EnhancedAirBookRS.AirTaxRS.ItineraryInfos.ItineraryInfo.TaxInfo.Taxes();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.AirTaxRS.ItineraryInfos.ItineraryInfo.PTCFareBreakdown }
     * 
     */
    public EnhancedAirBookRS.AirTaxRS.ItineraryInfos.ItineraryInfo.PTCFareBreakdown createEnhancedAirBookRSAirTaxRSItineraryInfosItineraryInfoPTCFareBreakdown() {
        return new EnhancedAirBookRS.AirTaxRS.ItineraryInfos.ItineraryInfo.PTCFareBreakdown();
    }

    /**
     * Create an instance of {@link STLResponsePayload }
     * 
     */
    public STLResponsePayload createSTLResponsePayload() {
        return new STLResponsePayload();
    }

    /**
     * Create an instance of {@link STLPayload }
     * 
     */
    public STLPayload createSTLPayload() {
        return new STLPayload();
    }

    /**
     * Create an instance of {@link ApplicationResults }
     * 
     */
    public ApplicationResults createApplicationResults() {
        return new ApplicationResults();
    }

    /**
     * Create an instance of {@link Results }
     * 
     */
    public Results createResults() {
        return new Results();
    }

    /**
     * Create an instance of {@link STLRequestPayload }
     * 
     */
    public STLRequestPayload createSTLRequestPayload() {
        return new STLRequestPayload();
    }

    /**
     * Create an instance of {@link RateQualifierType }
     * 
     */
    public RateQualifierType createRateQualifierType() {
        return new RateQualifierType();
    }

    /**
     * Create an instance of {@link SourceType }
     * 
     */
    public SourceType createSourceType() {
        return new SourceType();
    }

    /**
     * Create an instance of {@link EquipmentType }
     * 
     */
    public EquipmentType createEquipmentType() {
        return new EquipmentType();
    }

    /**
     * Create an instance of {@link AgencyFeesType }
     * 
     */
    public AgencyFeesType createAgencyFeesType() {
        return new AgencyFeesType();
    }

    /**
     * Create an instance of {@link ServiceType }
     * 
     */
    public ServiceType createServiceType() {
        return new ServiceType();
    }

    /**
     * Create an instance of {@link CodeDescriptionType }
     * 
     */
    public CodeDescriptionType createCodeDescriptionType() {
        return new CodeDescriptionType();
    }

    /**
     * Create an instance of {@link CO2ValueType }
     * 
     */
    public CO2ValueType createCO2ValueType() {
        return new CO2ValueType();
    }

    /**
     * Create an instance of {@link TTYRecordLocatorType }
     * 
     */
    public TTYRecordLocatorType createTTYRecordLocatorType() {
        return new TTYRecordLocatorType();
    }

    /**
     * Create an instance of {@link ChargesType }
     * 
     */
    public ChargesType createChargesType() {
        return new ChargesType();
    }

    /**
     * Create an instance of {@link ExternalReservationType }
     * 
     */
    public ExternalReservationType createExternalReservationType() {
        return new ExternalReservationType();
    }

    /**
     * Create an instance of {@link ProductType }
     * 
     */
    public ProductType createProductType() {
        return new ProductType();
    }

    /**
     * Create an instance of {@link OpenReservationElementType }
     * 
     */
    public OpenReservationElementType createOpenReservationElementType() {
        return new OpenReservationElementType();
    }

    /**
     * Create an instance of {@link ProductBaseType }
     * 
     */
    public ProductBaseType createProductBaseType() {
        return new ProductBaseType();
    }

    /**
     * Create an instance of {@link SpecialInputType }
     * 
     */
    public SpecialInputType createSpecialInputType() {
        return new SpecialInputType();
    }

    /**
     * Create an instance of {@link RequestorIDType }
     * 
     */
    public RequestorIDType createRequestorIDType() {
        return new RequestorIDType();
    }

    /**
     * Create an instance of {@link SocialMediaContactType }
     * 
     */
    public SocialMediaContactType createSocialMediaContactType() {
        return new SocialMediaContactType();
    }

    /**
     * Create an instance of {@link PhoneType }
     * 
     */
    public PhoneType createPhoneType() {
        return new PhoneType();
    }

    /**
     * Create an instance of {@link MoneyType }
     * 
     */
    public MoneyType createMoneyType() {
        return new MoneyType();
    }

    /**
     * Create an instance of {@link PriceType }
     * 
     */
    public PriceType createPriceType() {
        return new PriceType();
    }

    /**
     * Create an instance of {@link HotelUniqueIDType }
     * 
     */
    public HotelUniqueIDType createHotelUniqueIDType() {
        return new HotelUniqueIDType();
    }

    /**
     * Create an instance of {@link OACType }
     * 
     */
    public OACType createOACType() {
        return new OACType();
    }

    /**
     * Create an instance of {@link FeeType }
     * 
     */
    public FeeType createFeeType() {
        return new FeeType();
    }

    /**
     * Create an instance of {@link DetailType }
     * 
     */
    public DetailType createDetailType() {
        return new DetailType();
    }

    /**
     * Create an instance of {@link AirportInfoType }
     * 
     */
    public AirportInfoType createAirportInfoType() {
        return new AirportInfoType();
    }

    /**
     * Create an instance of {@link LoyaltyType }
     * 
     */
    public LoyaltyType createLoyaltyType() {
        return new LoyaltyType();
    }

    /**
     * Create an instance of {@link OpenReservationElementsType }
     * 
     */
    public OpenReservationElementsType createOpenReservationElementsType() {
        return new OpenReservationElementsType();
    }

    /**
     * Create an instance of {@link ServiceLevelType }
     * 
     */
    public ServiceLevelType createServiceLevelType() {
        return new ServiceLevelType();
    }

    /**
     * Create an instance of {@link MultilineTextType }
     * 
     */
    public MultilineTextType createMultilineTextType() {
        return new MultilineTextType();
    }

    /**
     * Create an instance of {@link ProductNameType }
     * 
     */
    public ProductNameType createProductNameType() {
        return new ProductNameType();
    }

    /**
     * Create an instance of {@link BookingChannelType }
     * 
     */
    public BookingChannelType createBookingChannelType() {
        return new BookingChannelType();
    }

    /**
     * Create an instance of {@link CompanyNameType }
     * 
     */
    public CompanyNameType createCompanyNameType() {
        return new CompanyNameType();
    }

    /**
     * Create an instance of {@link RestrictionsType }
     * 
     */
    public RestrictionsType createRestrictionsType() {
        return new RestrictionsType();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link MinMaxType }
     * 
     */
    public MinMaxType createMinMaxType() {
        return new MinMaxType();
    }

    /**
     * Create an instance of {@link GroundTransportationType }
     * 
     */
    public GroundTransportationType createGroundTransportationType() {
        return new GroundTransportationType();
    }

    /**
     * Create an instance of {@link TrainDetailsType }
     * 
     */
    public TrainDetailsType createTrainDetailsType() {
        return new TrainDetailsType();
    }

    /**
     * Create an instance of {@link RailwayStationInfoType }
     * 
     */
    public RailwayStationInfoType createRailwayStationInfoType() {
        return new RailwayStationInfoType();
    }

    /**
     * Create an instance of {@link ExternalSystemReferenceType }
     * 
     */
    public ExternalSystemReferenceType createExternalSystemReferenceType() {
        return new ExternalSystemReferenceType();
    }

    /**
     * Create an instance of {@link ArrangerDetailsType }
     * 
     */
    public ArrangerDetailsType createArrangerDetailsType() {
        return new ArrangerDetailsType();
    }

    /**
     * Create an instance of {@link RequestorSourceType }
     * 
     */
    public RequestorSourceType createRequestorSourceType() {
        return new RequestorSourceType();
    }

    /**
     * Create an instance of {@link AdditionalContentType }
     * 
     */
    public AdditionalContentType createAdditionalContentType() {
        return new AdditionalContentType();
    }

    /**
     * Create an instance of {@link POSType }
     * 
     */
    public POSType createPOSType() {
        return new POSType();
    }

    /**
     * Create an instance of {@link CalculationType }
     * 
     */
    public CalculationType createCalculationType() {
        return new CalculationType();
    }

    /**
     * Create an instance of {@link ChargeType }
     * 
     */
    public ChargeType createChargeType() {
        return new ChargeType();
    }

    /**
     * Create an instance of {@link AirlineType }
     * 
     */
    public AirlineType createAirlineType() {
        return new AirlineType();
    }

    /**
     * Create an instance of {@link ProblemInformation }
     * 
     */
    public ProblemInformation createProblemInformation() {
        return new ProblemInformation();
    }

    /**
     * Create an instance of {@link STLNotifPayload }
     * 
     */
    public STLNotifPayload createSTLNotifPayload() {
        return new STLNotifPayload();
    }

    /**
     * Create an instance of {@link SystemSpecificResults }
     * 
     */
    public SystemSpecificResults createSystemSpecificResults() {
        return new SystemSpecificResults();
    }

    /**
     * Create an instance of {@link HostCommand }
     * 
     */
    public HostCommand createHostCommand() {
        return new HostCommand();
    }

    /**
     * Create an instance of {@link MessageCondition }
     * 
     */
    public MessageCondition createMessageCondition() {
        return new MessageCondition();
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
     * Create an instance of {@link AddressType.CountryCodes.Code }
     * 
     */
    public AddressType.CountryCodes.Code createAddressTypeCountryCodesCode() {
        return new AddressType.CountryCodes.Code();
    }

    /**
     * Create an instance of {@link AddressType.StateProviceCodes.Code }
     * 
     */
    public AddressType.StateProviceCodes.Code createAddressTypeStateProviceCodesCode() {
        return new AddressType.StateProviceCodes.Code();
    }

    /**
     * Create an instance of {@link AddressType.CityCodes.Code }
     * 
     */
    public AddressType.CityCodes.Code createAddressTypeCityCodesCode() {
        return new AddressType.CityCodes.Code();
    }

    /**
     * Create an instance of {@link ServiceProviderType.Code }
     * 
     */
    public ServiceProviderType.Code createServiceProviderTypeCode() {
        return new ServiceProviderType.Code();
    }

    /**
     * Create an instance of {@link enhancedairbook.PassengerType.Type }
     * 
     */
    public PassengerType.Type createPassengerTypeType() {
        return new PassengerType.Type();
    }

    /**
     * Create an instance of {@link DocumentType.File }
     * 
     */
    public DocumentType.File createDocumentTypeFile() {
        return new DocumentType.File();
    }

    /**
     * Create an instance of {@link DocumentType.DocumentRules.Rule }
     * 
     */
    public DocumentType.DocumentRules.Rule createDocumentTypeDocumentRulesRule() {
        return new DocumentType.DocumentRules.Rule();
    }

    /**
     * Create an instance of {@link DocumentType.FormOfPayment.CreditCard.CardHolder }
     * 
     */
    public DocumentType.FormOfPayment.CreditCard.CardHolder createDocumentTypeFormOfPaymentCreditCardCardHolder() {
        return new DocumentType.FormOfPayment.CreditCard.CardHolder();
    }

    /**
     * Create an instance of {@link DocumentType.SegmentReferences.SegmentRef }
     * 
     */
    public DocumentType.SegmentReferences.SegmentRef createDocumentTypeSegmentReferencesSegmentRef() {
        return new DocumentType.SegmentReferences.SegmentRef();
    }

    /**
     * Create an instance of {@link DocumentType.PassengerReferences.PassengerRef }
     * 
     */
    public DocumentType.PassengerReferences.PassengerRef createDocumentTypePassengerReferencesPassengerRef() {
        return new DocumentType.PassengerReferences.PassengerRef();
    }

    /**
     * Create an instance of {@link HotelProductType.HotelPolicy.CheckInCheckOutPolicy }
     * 
     */
    public HotelProductType.HotelPolicy.CheckInCheckOutPolicy createHotelProductTypeHotelPolicyCheckInCheckOutPolicy() {
        return new HotelProductType.HotelPolicy.CheckInCheckOutPolicy();
    }

    /**
     * Create an instance of {@link HotelType.AdditionalInformation.ConfirmationNumber }
     * 
     */
    public HotelType.AdditionalInformation.ConfirmationNumber createHotelTypeAdditionalInformationConfirmationNumber() {
        return new HotelType.AdditionalInformation.ConfirmationNumber();
    }

    /**
     * Create an instance of {@link HotelType.AdditionalInformation.Address }
     * 
     */
    public HotelType.AdditionalInformation.Address createHotelTypeAdditionalInformationAddress() {
        return new HotelType.AdditionalInformation.Address();
    }

    /**
     * Create an instance of {@link HotelType.AdditionalInformation.ContactNumbers }
     * 
     */
    public HotelType.AdditionalInformation.ContactNumbers createHotelTypeAdditionalInformationContactNumbers() {
        return new HotelType.AdditionalInformation.ContactNumbers();
    }

    /**
     * Create an instance of {@link HotelType.AdditionalInformation.Commission }
     * 
     */
    public HotelType.AdditionalInformation.Commission createHotelTypeAdditionalInformationCommission() {
        return new HotelType.AdditionalInformation.Commission();
    }

    /**
     * Create an instance of {@link HotelType.Reservation.SpecialPrefs }
     * 
     */
    public HotelType.Reservation.SpecialPrefs createHotelTypeReservationSpecialPrefs() {
        return new HotelType.Reservation.SpecialPrefs();
    }

    /**
     * Create an instance of {@link HotelType.Reservation.RoomType }
     * 
     */
    public HotelType.Reservation.RoomType createHotelTypeReservationRoomType() {
        return new HotelType.Reservation.RoomType();
    }

    /**
     * Create an instance of {@link HotelType.Reservation.RoomRates }
     * 
     */
    public HotelType.Reservation.RoomRates createHotelTypeReservationRoomRates() {
        return new HotelType.Reservation.RoomRates();
    }

    /**
     * Create an instance of {@link HotelType.Reservation.RateAccessCodeBooked }
     * 
     */
    public HotelType.Reservation.RateAccessCodeBooked createHotelTypeReservationRateAccessCodeBooked() {
        return new HotelType.Reservation.RateAccessCodeBooked();
    }

    /**
     * Create an instance of {@link HotelType.Reservation.GuestCounts }
     * 
     */
    public HotelType.Reservation.GuestCounts createHotelTypeReservationGuestCounts() {
        return new HotelType.Reservation.GuestCounts();
    }

    /**
     * Create an instance of {@link HotelType.Reservation.Guarantee }
     * 
     */
    public HotelType.Reservation.Guarantee createHotelTypeReservationGuarantee() {
        return new HotelType.Reservation.Guarantee();
    }

    /**
     * Create an instance of {@link HotelType.Reservation.HotelCode }
     * 
     */
    public HotelType.Reservation.HotelCode createHotelTypeReservationHotelCode() {
        return new HotelType.Reservation.HotelCode();
    }

    /**
     * Create an instance of {@link HotelType.Reservation.HotelTotalPricing.ApproximateTotal }
     * 
     */
    public HotelType.Reservation.HotelTotalPricing.ApproximateTotal createHotelTypeReservationHotelTotalPricingApproximateTotal() {
        return new HotelType.Reservation.HotelTotalPricing.ApproximateTotal();
    }

    /**
     * Create an instance of {@link HotelType.Reservation.HotelTotalPricing.RateChange }
     * 
     */
    public HotelType.Reservation.HotelTotalPricing.RateChange createHotelTypeReservationHotelTotalPricingRateChange() {
        return new HotelType.Reservation.HotelTotalPricing.RateChange();
    }

    /**
     * Create an instance of {@link HotelType.Reservation.HotelTotalPricing.Disclaimer }
     * 
     */
    public HotelType.Reservation.HotelTotalPricing.Disclaimer createHotelTypeReservationHotelTotalPricingDisclaimer() {
        return new HotelType.Reservation.HotelTotalPricing.Disclaimer();
    }

    /**
     * Create an instance of {@link HotelType.Reservation.HotelTotalPricing.TotalSurcharge.Surcharge }
     * 
     */
    public HotelType.Reservation.HotelTotalPricing.TotalSurcharge.Surcharge createHotelTypeReservationHotelTotalPricingTotalSurchargeSurcharge() {
        return new HotelType.Reservation.HotelTotalPricing.TotalSurcharge.Surcharge();
    }

    /**
     * Create an instance of {@link HotelType.Reservation.HotelTotalPricing.TotalTax.Tax }
     * 
     */
    public HotelType.Reservation.HotelTotalPricing.TotalTax.Tax createHotelTypeReservationHotelTotalPricingTotalTaxTax() {
        return new HotelType.Reservation.HotelTotalPricing.TotalTax.Tax();
    }

    /**
     * Create an instance of {@link RailFareType.Fare.FareDescription.Condition }
     * 
     */
    public RailFareType.Fare.FareDescription.Condition createRailFareTypeFareFareDescriptionCondition() {
        return new RailFareType.Fare.FareDescription.Condition();
    }

    /**
     * Create an instance of {@link RailFareType.Fare.FareDescription.Fees }
     * 
     */
    public RailFareType.Fare.FareDescription.Fees createRailFareTypeFareFareDescriptionFees() {
        return new RailFareType.Fare.FareDescription.Fees();
    }

    /**
     * Create an instance of {@link RailFareType.Fare.SegmentReferences.SegmentRef }
     * 
     */
    public RailFareType.Fare.SegmentReferences.SegmentRef createRailFareTypeFareSegmentReferencesSegmentRef() {
        return new RailFareType.Fare.SegmentReferences.SegmentRef();
    }

    /**
     * Create an instance of {@link RailFareType.Fare.PassengerReferences.PassengerRef }
     * 
     */
    public RailFareType.Fare.PassengerReferences.PassengerRef createRailFareTypeFarePassengerReferencesPassengerRef() {
        return new RailFareType.Fare.PassengerReferences.PassengerRef();
    }

    /**
     * Create an instance of {@link ProductDetailsType.TransactionInfo }
     * 
     */
    public ProductDetailsType.TransactionInfo createProductDetailsTypeTransactionInfo() {
        return new ProductDetailsType.TransactionInfo();
    }

    /**
     * Create an instance of {@link RailType.MarketingCarrier }
     * 
     */
    public RailType.MarketingCarrier createRailTypeMarketingCarrier() {
        return new RailType.MarketingCarrier();
    }

    /**
     * Create an instance of {@link RailType.Passengers }
     * 
     */
    public RailType.Passengers createRailTypePassengers() {
        return new RailType.Passengers();
    }

    /**
     * Create an instance of {@link RailType.SupplementaryServices }
     * 
     */
    public RailType.SupplementaryServices createRailTypeSupplementaryServices() {
        return new RailType.SupplementaryServices();
    }

    /**
     * Create an instance of {@link RailType.Documents }
     * 
     */
    public RailType.Documents createRailTypeDocuments() {
        return new RailType.Documents();
    }

    /**
     * Create an instance of {@link RailType.Details }
     * 
     */
    public RailType.Details createRailTypeDetails() {
        return new RailType.Details();
    }

    /**
     * Create an instance of {@link CompanyType.Code }
     * 
     */
    public CompanyType.Code createCompanyTypeCode() {
        return new CompanyType.Code();
    }

    /**
     * Create an instance of {@link LocationDetailsType.RailwayStationInfo.StationName }
     * 
     */
    public LocationDetailsType.RailwayStationInfo.StationName createLocationDetailsTypeRailwayStationInfoStationName() {
        return new LocationDetailsType.RailwayStationInfo.StationName();
    }

    /**
     * Create an instance of {@link LocationDetailsType.RailwayStationInfo.LocalStationName }
     * 
     */
    public LocationDetailsType.RailwayStationInfo.LocalStationName createLocationDetailsTypeRailwayStationInfoLocalStationName() {
        return new LocationDetailsType.RailwayStationInfo.LocalStationName();
    }

    /**
     * Create an instance of {@link LocationDetailsType.RailwayStationInfo.Amenities }
     * 
     */
    public LocationDetailsType.RailwayStationInfo.Amenities createLocationDetailsTypeRailwayStationInfoAmenities() {
        return new LocationDetailsType.RailwayStationInfo.Amenities();
    }

    /**
     * Create an instance of {@link LocationDetailsType.RailwayStationInfo.LocationCodes.Code }
     * 
     */
    public LocationDetailsType.RailwayStationInfo.LocationCodes.Code createLocationDetailsTypeRailwayStationInfoLocationCodesCode() {
        return new LocationDetailsType.RailwayStationInfo.LocationCodes.Code();
    }

    /**
     * Create an instance of {@link SupplementaryServiceType.Description }
     * 
     */
    public SupplementaryServiceType.Description createSupplementaryServiceTypeDescription() {
        return new SupplementaryServiceType.Description();
    }

    /**
     * Create an instance of {@link SupplementaryServiceType.PassengerReferences.PassengerRef }
     * 
     */
    public SupplementaryServiceType.PassengerReferences.PassengerRef createSupplementaryServiceTypePassengerReferencesPassengerRef() {
        return new SupplementaryServiceType.PassengerReferences.PassengerRef();
    }

    /**
     * Create an instance of {@link RailAccommodationType.PassengerRef }
     * 
     */
    public RailAccommodationType.PassengerRef createRailAccommodationTypePassengerRef() {
        return new RailAccommodationType.PassengerRef();
    }

    /**
     * Create an instance of {@link RailAccommodationType.Placement.Coach.PlacementNumber }
     * 
     */
    public RailAccommodationType.Placement.Coach.PlacementNumber createRailAccommodationTypePlacementCoachPlacementNumber() {
        return new RailAccommodationType.Placement.Coach.PlacementNumber();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.PreProcessing.UniqueID }
     * 
     */
    public EnhancedAirBookRQ.PreProcessing.UniqueID createEnhancedAirBookRQPreProcessingUniqueID() {
        return new EnhancedAirBookRQ.PreProcessing.UniqueID();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.PostProcessing.RedisplayReservation }
     * 
     */
    public EnhancedAirBookRQ.PostProcessing.RedisplayReservation createEnhancedAirBookRQPostProcessingRedisplayReservation() {
        return new EnhancedAirBookRQ.PostProcessing.RedisplayReservation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceComparison }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceComparison createEnhancedAirBookRQOTAAirPriceRQPriceComparison() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceComparison();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Account }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Account createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersAccount() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Account();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.BargainFinder }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.BargainFinder createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersBargainFinder() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.BargainFinder();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Brand }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Brand createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersBrand() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Brand();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Corporate }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Corporate createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersCorporate() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Corporate();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Fare }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Fare createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersFare() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Fare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.FareOptions }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.FareOptions createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersFareOptions() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.FareOptions();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NameSelect }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NameSelect createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersNameSelect() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NameSelect();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersPassengerType() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PlusUp }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PlusUp createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersPlusUp() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PlusUp();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ValidityDates.Segment }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ValidityDates.Segment createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersValidityDatesSegment() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ValidityDates.Segment();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.NoTax }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.NoTax createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersTaxesNoTax() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.NoTax();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.TaxExempt }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.TaxExempt createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersTaxesTaxExempt() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.TaxExempt();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.TaxOverride }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.TaxOverride createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersTaxesTaxOverride() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.TaxOverride();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.FuelSurchargeOverride }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.FuelSurchargeOverride createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersOverridesFuelSurchargeOverride() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.FuelSurchargeOverride();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoAdvancePurchase }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoAdvancePurchase createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersOverridesNoAdvancePurchase() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoAdvancePurchase();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoFareRestrictions }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoFareRestrictions createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersOverridesNoFareRestrictions() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoFareRestrictions();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoMinMaxStay }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoMinMaxStay createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersOverridesNoMinMaxStay() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoMinMaxStay();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoPenalty }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoPenalty createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersOverridesNoPenalty() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoPenalty();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.Purchase }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.Purchase createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersOverridesPurchase() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.Purchase();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.Ticketing }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.Ticketing createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersOverridesTicketing() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.Ticketing();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.GoverningCarrierOverride.Airline }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.GoverningCarrierOverride.Airline createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersOverridesGoverningCarrierOverrideAirline() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.GoverningCarrierOverride.Airline();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit.CAR }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit.CAR createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersNetRemitCAR() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit.CAR();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit.Cash }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit.Cash createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersNetRemitCash() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit.Cash();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit.Credit }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit.Credit createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersNetRemitCredit() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit.Credit();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.BreakFare }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.BreakFare createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersItineraryOptionsBreakFare() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.BreakFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.ForceConnection }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.ForceConnection createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersItineraryOptionsForceConnection() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.ForceConnection();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.ForceStopOver }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.ForceStopOver createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersItineraryOptionsForceStopOver() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.ForceStopOver();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.OverrideBreak }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.OverrideBreak createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersItineraryOptionsOverrideBreak() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.OverrideBreak();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.SegmentSelect }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.SegmentSelect createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersItineraryOptionsSegmentSelect() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.SegmentSelect();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.SideTrip }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.SideTrip createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersItineraryOptionsSideTrip() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.SideTrip();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.CommandPricing.Discount }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.CommandPricing.Discount createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersCommandPricingDiscount() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.CommandPricing.Discount();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.CommandPricing.FareBasis }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.CommandPricing.FareBasis createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersPricingQualifiersCommandPricingFareBasis() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.CommandPricing.FareBasis();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Commission }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Commission createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersMiscQualifiersCommission() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Commission();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Endorsements }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Endorsements createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersMiscQualifiersEndorsements() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Endorsements();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.MultiTicket }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.MultiTicket createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersMiscQualifiersMultiTicket() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.MultiTicket();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.SuppressFareReplaceWithBT }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.SuppressFareReplaceWithBT createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersMiscQualifiersTourCodeSuppressFareReplaceWithBT() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.SuppressFareReplaceWithBT();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.SuppressFareReplaceWithIT }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.SuppressFareReplaceWithIT createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersMiscQualifiersTourCodeSuppressFareReplaceWithIT() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.SuppressFareReplaceWithIT();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.SuppressIT }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.SuppressIT createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersMiscQualifiersTourCodeSuppressIT() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.SuppressIT();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.SuppressITSupressFare }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.SuppressITSupressFare createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersMiscQualifiersTourCodeSuppressITSupressFare() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.SuppressITSupressFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.BaggageAllowance.Segment }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.BaggageAllowance.Segment createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersMiscQualifiersBaggageAllowanceSegment() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.BaggageAllowance.Segment();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras.CustLoyalty }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras.CustLoyalty createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersMiscQualifiersAirExtrasCustLoyalty() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras.CustLoyalty();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras.Ticketing }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras.Ticketing createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersMiscQualifiersAirExtrasTicketing() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras.Ticketing();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.Fare }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.Fare createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersSabreSonicTicketingMultipleFOPFare() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.Fare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.Taxes.Tax }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.Taxes.Tax createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersSabreSonicTicketingMultipleFOPTaxesTax() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.Taxes.Tax();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.FOPTwo.CCInfo.PaymentCard }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.FOPTwo.CCInfo.PaymentCard createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersSabreSonicTicketingMultipleFOPFOPTwoCCInfoPaymentCard() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.FOPTwo.CCInfo.PaymentCard();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.FOPOne.CCInfo.PaymentCard }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.FOPOne.CCInfo.PaymentCard createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersSabreSonicTicketingMultipleFOPFOPOneCCInfoPaymentCard() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.MultipleFOP.FOPOne.CCInfo.PaymentCard();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.Fare }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.Fare createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersSabreSonicTicketingEnhancedMultipleFOPFare() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.Fare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.Taxes.Tax }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.Taxes.Tax createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersSabreSonicTicketingEnhancedMultipleFOPTaxesTax() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.Taxes.Tax();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.FOPTwo.CCInfo.PaymentCard }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.FOPTwo.CCInfo.PaymentCard createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersSabreSonicTicketingEnhancedMultipleFOPFOPTwoCCInfoPaymentCard() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.FOPTwo.CCInfo.PaymentCard();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.FOPOne.CCInfo.PaymentCard }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.FOPOne.CCInfo.PaymentCard createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersSabreSonicTicketingEnhancedMultipleFOPFOPOneCCInfoPaymentCard() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.EnhancedMultipleFOP.FOPOne.CCInfo.PaymentCard();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.BasicFOP.CCInfo.PaymentCard }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.BasicFOP.CCInfo.PaymentCard createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersSabreSonicTicketingBasicFOPCCInfoPaymentCard() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.SabreSonicTicketing.BasicFOP.CCInfo.PaymentCard();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.PayLaterPlan.Fare }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.PayLaterPlan.Fare createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingPayLaterPlanFare() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.PayLaterPlan.Fare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.PayLaterPlan.Installment }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.PayLaterPlan.Installment createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingPayLaterPlanInstallment() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.PayLaterPlan.Installment();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.PayLaterPlan.FOP.CCInfo.PaymentCard }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.PayLaterPlan.FOP.CCInfo.PaymentCard createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingPayLaterPlanFOPCCInfoPaymentCard() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.PayLaterPlan.FOP.CCInfo.PaymentCard();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP.Fare }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP.Fare createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingMultipleMiscFOPFare() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP.Fare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP.Taxes.Tax }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP.Taxes.Tax createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingMultipleMiscFOPTaxesTax() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP.Taxes.Tax();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP.FOPTwo.ExtendedPayment }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP.FOPTwo.ExtendedPayment createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingMultipleMiscFOPFOPTwoExtendedPayment() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP.FOPTwo.ExtendedPayment();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP.FOPOne.CCInfo.PaymentCard }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP.FOPOne.CCInfo.PaymentCard createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingMultipleMiscFOPFOPOneCCInfoPaymentCard() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleMiscFOP.FOPOne.CCInfo.PaymentCard();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.Fare }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.Fare createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingMultipleFOPFare() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.Fare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.Taxes.Tax }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.Taxes.Tax createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingMultipleFOPTaxesTax() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.Taxes.Tax();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.FOPTwo.CCInfo.PaymentCard }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.FOPTwo.CCInfo.PaymentCard createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingMultipleFOPFOPTwoCCInfoPaymentCard() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.FOPTwo.CCInfo.PaymentCard();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.FOPOne.CCInfo.PaymentCard }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.FOPOne.CCInfo.PaymentCard createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBSPTicketingMultipleFOPFOPOneCCInfoPaymentCard() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BSPTicketing.MultipleFOP.FOPOne.CCInfo.PaymentCard();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BasicFOP.CCInfo.PaymentCard }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BasicFOP.CCInfo.PaymentCard createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFOPQualifiersBasicFOPCCInfoPaymentCard() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FOPQualifiers.BasicFOP.CCInfo.PaymentCard();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.VendorPrefs.Airline }
     * 
     */
    public EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.VendorPrefs.Airline createEnhancedAirBookRQOTAAirPriceRQPriceRequestInformationOptionalQualifiersFlightQualifiersVendorPrefsAirline() {
        return new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.VendorPrefs.Airline();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirBookRQ.HaltOnStatus }
     * 
     */
    public EnhancedAirBookRQ.OTAAirBookRQ.HaltOnStatus createEnhancedAirBookRQOTAAirBookRQHaltOnStatus() {
        return new EnhancedAirBookRQ.OTAAirBookRQ.HaltOnStatus();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirBookRQ.RedisplayReservation }
     * 
     */
    public EnhancedAirBookRQ.OTAAirBookRQ.RedisplayReservation createEnhancedAirBookRQOTAAirBookRQRedisplayReservation() {
        return new EnhancedAirBookRQ.OTAAirBookRQ.RedisplayReservation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.DestinationLocation }
     * 
     */
    public EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.DestinationLocation createEnhancedAirBookRQOTAAirBookRQOriginDestinationInformationFlightSegmentDestinationLocation() {
        return new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.DestinationLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.Equipment }
     * 
     */
    public EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.Equipment createEnhancedAirBookRQOTAAirBookRQOriginDestinationInformationFlightSegmentEquipment() {
        return new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.Equipment();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.MarketingAirline }
     * 
     */
    public EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.MarketingAirline createEnhancedAirBookRQOTAAirBookRQOriginDestinationInformationFlightSegmentMarketingAirline() {
        return new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.MarketingAirline();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.MarriageGrp }
     * 
     */
    public EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.MarriageGrp createEnhancedAirBookRQOTAAirBookRQOriginDestinationInformationFlightSegmentMarriageGrp() {
        return new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.MarriageGrp();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.OperatingAirline }
     * 
     */
    public EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.OperatingAirline createEnhancedAirBookRQOTAAirBookRQOriginDestinationInformationFlightSegmentOperatingAirline() {
        return new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.OperatingAirline();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.OriginLocation }
     * 
     */
    public EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.OriginLocation createEnhancedAirBookRQOTAAirBookRQOriginDestinationInformationFlightSegmentOriginLocation() {
        return new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.OriginLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo.AAACity }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo.AAACity createEnhancedAirBookRQAirTaxRQPOSSourceTPAExtensionsUserInfoAAACity() {
        return new EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo.AAACity();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo.Action }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo.Action createEnhancedAirBookRQAirTaxRQPOSSourceTPAExtensionsUserInfoAction() {
        return new EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo.Action();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo.AgentSine }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo.AgentSine createEnhancedAirBookRQAirTaxRQPOSSourceTPAExtensionsUserInfoAgentSine() {
        return new EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo.AgentSine();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo.Branch }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo.Branch createEnhancedAirBookRQAirTaxRQPOSSourceTPAExtensionsUserInfoBranch() {
        return new EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo.Branch();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo.Partition }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo.Partition createEnhancedAirBookRQAirTaxRQPOSSourceTPAExtensionsUserInfoPartition() {
        return new EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo.Partition();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo.Service }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo.Service createEnhancedAirBookRQAirTaxRQPOSSourceTPAExtensionsUserInfoService() {
        return new EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo.Service();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo.Station }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo.Station createEnhancedAirBookRQAirTaxRQPOSSourceTPAExtensionsUserInfoStation() {
        return new EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo.Station();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo.Transaction }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo.Transaction createEnhancedAirBookRQAirTaxRQPOSSourceTPAExtensionsUserInfoTransaction() {
        return new EnhancedAirBookRQ.AirTaxRQ.POS.Source.TPAExtensions.UserInfo.Transaction();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.ArrivalAirport }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.ArrivalAirport createEnhancedAirBookRQAirTaxRQItineraryInfosItineraryInfoReservationItemsItemFlightSegmentArrivalAirport() {
        return new EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.ArrivalAirport();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.DepartureAirport }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.DepartureAirport createEnhancedAirBookRQAirTaxRQItineraryInfosItineraryInfoReservationItemsItemFlightSegmentDepartureAirport() {
        return new EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.DepartureAirport();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.Equipment }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.Equipment createEnhancedAirBookRQAirTaxRQItineraryInfosItineraryInfoReservationItemsItemFlightSegmentEquipment() {
        return new EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.Equipment();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.MarketingAirline }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.MarketingAirline createEnhancedAirBookRQAirTaxRQItineraryInfosItineraryInfoReservationItemsItemFlightSegmentMarketingAirline() {
        return new EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.MarketingAirline();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.OperatingAirline }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.OperatingAirline createEnhancedAirBookRQAirTaxRQItineraryInfosItineraryInfoReservationItemsItemFlightSegmentOperatingAirline() {
        return new EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.OperatingAirline();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.HiddenStops.HiddenStop }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.HiddenStops.HiddenStop createEnhancedAirBookRQAirTaxRQItineraryInfosItineraryInfoReservationItemsItemFlightSegmentHiddenStopsHiddenStop() {
        return new EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.HiddenStops.HiddenStop();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.FareBreakInfo.BaseFare }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.FareBreakInfo.BaseFare createEnhancedAirBookRQAirTaxRQItineraryInfosItineraryInfoReservationItemsItemFlightSegmentFareBreakInfoBaseFare() {
        return new EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.FareBreakInfo.BaseFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.FareBreakInfo.EquivFare }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.FareBreakInfo.EquivFare createEnhancedAirBookRQAirTaxRQItineraryInfosItineraryInfoReservationItemsItemFlightSegmentFareBreakInfoEquivFare() {
        return new EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.FlightSegment.FareBreakInfo.EquivFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.AirFareInfo.PTCFareBreakdown.PassengerType }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.AirFareInfo.PTCFareBreakdown.PassengerType createEnhancedAirBookRQAirTaxRQItineraryInfosItineraryInfoReservationItemsItemAirFareInfoPTCFareBreakdownPassengerType() {
        return new EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.AirFareInfo.PTCFareBreakdown.PassengerType();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.AirFareInfo.PTCFareBreakdown.PassengerFare.BaseFare }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.AirFareInfo.PTCFareBreakdown.PassengerFare.BaseFare createEnhancedAirBookRQAirTaxRQItineraryInfosItineraryInfoReservationItemsItemAirFareInfoPTCFareBreakdownPassengerFareBaseFare() {
        return new EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.AirFareInfo.PTCFareBreakdown.PassengerFare.BaseFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.AirFareInfo.PTCFareBreakdown.PassengerFare.EquivFare }
     * 
     */
    public EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.AirFareInfo.PTCFareBreakdown.PassengerFare.EquivFare createEnhancedAirBookRQAirTaxRQItineraryInfosItineraryInfoReservationItemsItemAirFareInfoPTCFareBreakdownPassengerFareEquivFare() {
        return new EnhancedAirBookRQ.AirTaxRQ.ItineraryInfos.ItineraryInfo.ReservationItems.Item.AirFareInfo.PTCFareBreakdown.PassengerFare.EquivFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.VCR.TicketingDocument.ServiceCoupon }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.VCR.TicketingDocument.ServiceCoupon createEnhancedAirBookRSTravelItineraryReadRSVCRTicketingDocumentServiceCoupon() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.VCR.TicketingDocument.ServiceCoupon();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.OpenReservationElements }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.OpenReservationElements createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryOpenReservationElements() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.OpenReservationElements();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.SpecialServiceInfo.Service.Airline }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.SpecialServiceInfo.Service.Airline createEnhancedAirBookRSTravelItineraryReadRSTravelItinerarySpecialServiceInfoServiceAirline() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.SpecialServiceInfo.Service.Airline();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.SpecialServiceInfo.Service.PersonName }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.SpecialServiceInfo.Service.PersonName createEnhancedAirBookRSTravelItineraryReadRSTravelItinerarySpecialServiceInfoServicePersonName() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.SpecialServiceInfo.Service.PersonName();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.RemarkInfo.Remark.PersonName }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.RemarkInfo.Remark.PersonName createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryRemarkInfoRemarkPersonName() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.RemarkInfo.Remark.PersonName();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.QueueInfo.Placement }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.QueueInfo.Placement createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryQueueInfoPlacement() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.QueueInfo.Placement();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.PayInfo.PersonName }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.PayInfo.PersonName createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryPayInfoPersonName() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.PayInfo.PersonName();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryRef.Source }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryRef.Source createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryRefSource() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryRef.Source();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryRef.TravelPolicy }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryRef.TravelPolicy createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryRefTravelPolicy() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryRef.TravelPolicy();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.Ticketing }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.Ticketing createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoTicketing() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.Ticketing();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Arunk }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Arunk createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemArunk() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Arunk();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.EquivalentPrice }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.EquivalentPrice createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceEquivalentPrice() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.EquivalentPrice();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TTLPrice }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TTLPrice createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceTTLPrice() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TTLPrice();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.OriginalBasePrice }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.OriginalBasePrice createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceOriginalBasePrice() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.OriginalBasePrice();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TicketCouponNumberAssociation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TicketCouponNumberAssociation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceTicketCouponNumberAssociation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TicketCouponNumberAssociation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalOriginalBasePrice }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalOriginalBasePrice createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceTotalOriginalBasePrice() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalOriginalBasePrice();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalEquivalentPrice }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalEquivalentPrice createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceTotalEquivalentPrice() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalEquivalentPrice();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalTTLPrice }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalTTLPrice createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceTotalTTLPrice() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalTTLPrice();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.Segment }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.Segment createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceSegment() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.Segment();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TravelPortions.TravelPortion }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TravelPortions.TravelPortion createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceTravelPortionsTravelPortion() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TravelPortions.TravelPortion();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalTaxes.Tax }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalTaxes.Tax createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceTotalTaxesTax() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalTaxes.Tax();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.Taxes.Tax }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.Taxes.Tax createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceTaxesTax() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.Taxes.Tax();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.Vendor }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.Vendor createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVendor() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.Vendor();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge.Commission }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge.Commission createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreVehicleChargesVehicleChargeCommission() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge.Commission();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge.Mileage }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge.Mileage createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreVehicleChargesVehicleChargeMileage() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge.Mileage();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge.ChargeDetails.ApproximateTotalCharge }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge.ChargeDetails.ApproximateTotalCharge createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreVehicleChargesVehicleChargeChargeDetailsApproximateTotalCharge() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge.ChargeDetails.ApproximateTotalCharge();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Billing }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Billing createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreRentalRateBilling() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Billing();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Client }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Client createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreRentalRateClient() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Client();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Corporate }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Corporate createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreRentalRateCorporate() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Corporate();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.CustLoyalty }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.CustLoyalty createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreRentalRateCustLoyalty() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.CustLoyalty();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.InvoiceRemarks }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.InvoiceRemarks createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreRentalRateInvoiceRemarks() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.InvoiceRemarks();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Remarks }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Remarks createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreRentalRateRemarks() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Remarks();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.ServiceInformation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.ServiceInformation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreRentalRateServiceInformation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.ServiceInformation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.TourCode }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.TourCode createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreRentalRateTourCode() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.TourCode();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.VehicleTypes }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.VehicleTypes createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreRentalRateVehicleTypes() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.VehicleTypes();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Voucher }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Voucher createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreRentalRateVoucher() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Voucher();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.PricedEquip.Equipment }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.PricedEquip.Equipment createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCorePricedEquipEquipment() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.PricedEquip.Equipment();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.GuaranteePrepaid.CancellationRefundAmount }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.GuaranteePrepaid.CancellationRefundAmount createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreGuaranteePrepaidCancellationRefundAmount() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.GuaranteePrepaid.CancellationRefundAmount();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo.ContactNumbers.ContactNumber }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo.ContactNumbers.ContactNumber createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreCollectionDeliveryInfoDeliveryInfoContactNumbersContactNumber() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo.ContactNumbers.ContactNumber();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo.Address.StateCountyProv }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo.Address.StateCountyProv createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreCollectionDeliveryInfoDeliveryInfoAddressStateCountyProv() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo.Address.StateCountyProv();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo.ContactNumbers.ContactNumber }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo.ContactNumbers.ContactNumber createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreCollectionDeliveryInfoCollectionInfoContactNumbersContactNumber() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo.ContactNumbers.ContactNumber();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo.Address.StateCountyProv }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo.Address.StateCountyProv createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreCollectionDeliveryInfoCollectionInfoAddressStateCountyProv() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo.Address.StateCountyProv();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.DropOffLocationDetails }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.DropOffLocationDetails createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehRentalCoreDropOffLocationDetails() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.DropOffLocationDetails();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.LocationDetails.ContactNumbers.ContactNumber }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.LocationDetails.ContactNumbers.ContactNumber createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehRentalCoreLocationDetailsContactNumbersContactNumber() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.LocationDetails.ContactNumbers.ContactNumber();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.FlightSegment.MarketingAirline }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.FlightSegment.MarketingAirline createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehRentalCoreFlightSegmentMarketingAirline() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.FlightSegment.MarketingAirline();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.POS.Source }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.POS.Source createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehiclePOSSource() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.POS.Source();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.Duration }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.Duration createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemTourTourDetailsDuration() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.Duration();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.Price }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.Price createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemTourTourDetailsPrice() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.Price();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.ServiceInformation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.ServiceInformation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemTourTourDetailsServiceInformation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.ServiceInformation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.VehicleInformation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.VehicleInformation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemTourTourDetailsVehicleInformation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.VehicleInformation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.HotelInformation.Room }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.HotelInformation.Room createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemTourTourDetailsHotelInformationRoom() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.HotelInformation.Room();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.OriginLocation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.OriginLocation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemSurfaceOriginLocation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.OriginLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.Vendor }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.Vendor createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemSurfaceVendor() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.Vendor();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.FlightSegment.DestinationLocation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.FlightSegment.DestinationLocation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemSurfaceFlightSegmentDestinationLocation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.FlightSegment.DestinationLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.FlightSegment.MarketingAirline }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.FlightSegment.MarketingAirline createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemSurfaceFlightSegmentMarketingAirline() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.FlightSegment.MarketingAirline();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.FlightSegment.OriginLocation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.FlightSegment.OriginLocation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemSurfaceFlightSegmentOriginLocation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.FlightSegment.OriginLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats.Seat.FlightSegment.DestinationLocation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats.Seat.FlightSegment.DestinationLocation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemSeatsSeatFlightSegmentDestinationLocation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats.Seat.FlightSegment.DestinationLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats.Seat.FlightSegment.OriginLocation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats.Seat.FlightSegment.OriginLocation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemSeatsSeatFlightSegmentOriginLocation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats.Seat.FlightSegment.OriginLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.DestinationLocation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.DestinationLocation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemRailDestinationLocation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.DestinationLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.OriginLocation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.OriginLocation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemRailOriginLocation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.OriginLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.ServiceInformation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.ServiceInformation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemRailServiceInformation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.ServiceInformation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.SNCFInformation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.SNCFInformation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemRailSNCFInformation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.SNCFInformation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.Train }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.Train createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemRailTrain() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.Train();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.Vendor }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.Vendor createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemRailVendor() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.Vendor();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.MiscSegment.OriginLocation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.MiscSegment.OriginLocation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemMiscSegmentOriginLocation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.MiscSegment.OriginLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.MiscSegment.Vendor }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.MiscSegment.Vendor createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemMiscSegmentVendor() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.MiscSegment.Vendor();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.Coverage }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.Coverage createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemInsuranceInsuranceDetailsCoverage() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.Coverage();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.DestinationLocation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.DestinationLocation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemInsuranceInsuranceDetailsDestinationLocation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.DestinationLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.OriginLocation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.OriginLocation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemInsuranceInsuranceDetailsOriginLocation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.OriginLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.Payment }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.Payment createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemInsuranceInsuranceDetailsPayment() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.Payment();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.PersonName }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.PersonName createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemInsuranceInsuranceDetailsPersonName() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.PersonName();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.Vendor }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.Vendor createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemInsuranceInsuranceDetailsVendor() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.Vendor();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.SpecialPrefs }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.SpecialPrefs createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelSpecialPrefs() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.SpecialPrefs();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.TimeSpan }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.TimeSpan createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelTimeSpan() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.TimeSpan();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Commission }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Commission createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesCommission() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Commission();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.AdditionalGuestAmounts }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.AdditionalGuestAmounts createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateAdditionalGuestAmounts() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.AdditionalGuestAmounts();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.RateAccessCodeBooked }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.RateAccessCodeBooked createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateRateAccessCodeBooked() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.RateAccessCodeBooked();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.ApproximateTotal }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.ApproximateTotal createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelTotalPricingApproximateTotal() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.ApproximateTotal();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.RateChange }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.RateChange createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelTotalPricingRateChange() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.RateChange();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.Disclaimer }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.Disclaimer createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelTotalPricingDisclaimer() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.Disclaimer();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.TotalSurcharge.Surcharge }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.TotalSurcharge.Surcharge createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelTotalPricingTotalSurchargeSurcharge() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.TotalSurcharge.Surcharge();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.TotalTax.Tax }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.TotalTax.Tax createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelTotalPricingTotalTaxTax() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.TotalTax.Tax();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton.Additionals.Additional }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton.Additionals.Additional createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelRateDescriptonAdditionalsAdditional() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton.Additionals.Additional();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton.RateDescriptions.RateDescription }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton.RateDescriptions.RateDescription createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelRateDescriptonRateDescriptionsRateDescription() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton.RateDescriptions.RateDescription();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.POS.Source }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.POS.Source createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelPOSSource() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.POS.Source();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.Customer.Corporate }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.Customer.Corporate createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelCustomerCorporate() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.Customer.Corporate();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.Customer.CustLoyalty }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.Customer.CustLoyalty createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelCustomerCustLoyalty() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.Customer.CustLoyalty();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.Customer.ID }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.Customer.ID createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelCustomerID() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.Customer.ID();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo.Address }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo.Address createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelBasicPropertyInfoAddress() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo.Address();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo.CancelPenalty }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo.CancelPenalty createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelBasicPropertyInfoCancelPenalty() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo.CancelPenalty();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo.ContactNumbers.ContactNumber }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo.ContactNumbers.ContactNumber createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelBasicPropertyInfoContactNumbersContactNumber() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo.ContactNumbers.ContactNumber();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.BSGRecord }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.BSGRecord createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentBSGRecord() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.BSGRecord();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.CheckInAirline }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.CheckInAirline createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentCheckInAirline() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.CheckInAirline();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.CodeshareRecord }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.CodeshareRecord createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentCodeshareRecord() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.CodeshareRecord();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.DestinationLocation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.DestinationLocation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentDestinationLocation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.DestinationLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.Equipment }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.Equipment createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentEquipment() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.Equipment();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.MarketingAirline }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.MarketingAirline createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentMarketingAirline() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.MarketingAirline();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.MarketingCodeshareRecord }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.MarketingCodeshareRecord createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentMarketingCodeshareRecord() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.MarketingCodeshareRecord();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.MarriageGrp }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.MarriageGrp createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentMarriageGrp() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.MarriageGrp();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.Meal }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.Meal createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentMeal() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.Meal();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.OperatingAirline }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.OperatingAirline createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentOperatingAirline() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.OperatingAirline();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.OperatingAirlineRecord }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.OperatingAirlineRecord createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentOperatingAirlineRecord() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.OperatingAirlineRecord();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.OriginLocation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.OriginLocation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentOriginLocation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.OriginLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.PartnerCarrier }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.PartnerCarrier createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentPartnerCarrier() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.PartnerCarrier();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.SupplierRef }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.SupplierRef createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentSupplierRef() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.SupplierRef();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise.DestinationLocation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise.DestinationLocation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemCruiseDestinationLocation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise.DestinationLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise.OriginLocation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise.OriginLocation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemCruiseOriginLocation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise.OriginLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise.ServiceInformation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise.ServiceInformation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemCruiseServiceInformation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise.ServiceInformation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise.Vendor }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise.Vendor createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemCruiseVendor() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise.Vendor();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.AirTaxi.DestinationLocation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.AirTaxi.DestinationLocation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAirTaxiDestinationLocation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.AirTaxi.DestinationLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.AirTaxi.OriginLocation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.AirTaxi.OriginLocation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAirTaxiOriginLocation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.AirTaxi.OriginLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.AirTaxi.Vendor }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.AirTaxi.Vendor createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAirTaxiVendor() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.AirTaxi.Vendor();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.FuturePriceInfo }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.FuturePriceInfo createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingFuturePriceInfo() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.FuturePriceInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.BaseFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.BaseFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteTotalsBaseFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.BaseFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.EquivFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.EquivFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteTotalsEquivFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.EquivFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.TotalFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.TotalFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteTotalsTotalFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.TotalFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.Taxes.Tax }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.Taxes.Tax createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteTotalsTaxesTax() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.Taxes.Tax();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.ResponseHeader }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.ResponseHeader createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteResponseHeader() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.ResponseHeader();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.PACInfo.PAC }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.PACInfo.PAC createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePriceQuotePlusPACInfoPAC() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.PACInfo.PAC();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.FuturePricingInfo.FuturePrice }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.FuturePricingInfo.FuturePrice createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePriceQuotePlusFuturePricingInfoFuturePrice() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.FuturePricingInfo.FuturePrice();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.TicketingInstructionsInfo.TicketingInstruction }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.TicketingInstructionsInfo.TicketingInstruction createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePriceQuotePlusTicketingInstructionsInfoTicketingInstruction() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.TicketingInstructionsInfo.TicketingInstruction();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.PassengerInfo.PassengerData }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.PassengerInfo.PassengerData createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePriceQuotePlusPassengerInfoPassengerData() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.PassengerInfo.PassengerData();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.BaseFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.BaseFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoSellingFareDetailsBaseFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.BaseFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.EquivFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.EquivFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoSellingFareDetailsEquivFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.EquivFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.TotalTax }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.TotalTax createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoSellingFareDetailsTotalTax() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.TotalTax();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.TotalFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.TotalFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoSellingFareDetailsTotalFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.TotalFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.Taxes.Tax }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.Taxes.Tax createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoSellingFareDetailsTaxesTax() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.Taxes.Tax();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.Commission.Percent }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.Commission.Percent createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoSellingFareDetailsCommissionPercent() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.Commission.Percent();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.BaseFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.BaseFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoNetFareDetailsBaseFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.BaseFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.EquivFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.EquivFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoNetFareDetailsEquivFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.EquivFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.TotalTax }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.TotalTax createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoNetFareDetailsTotalTax() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.TotalTax();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.TotalFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.TotalFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoNetFareDetailsTotalFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.TotalFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.Taxes.Tax }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.Taxes.Tax createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoNetFareDetailsTaxesTax() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.Taxes.Tax();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.Commission.Percent }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.Commission.Percent createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoNetFareDetailsCommissionPercent() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.Commission.Percent();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PassengerTypeQuantity }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PassengerTypeQuantity createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPassengerTypeQuantity() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PassengerTypeQuantity();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PrivateFareInformation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PrivateFareInformation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPrivateFareInformation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PrivateFareInformation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareBasis }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareBasis createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownFareBasis() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareBasis();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareCalculation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareCalculation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownFareCalculation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareCalculation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.TourCode }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.TourCode createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownTourCode() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.TourCode();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.BaggageAllowance }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.BaggageAllowance createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownFlightSegmentBaggageAllowance() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.BaggageAllowance();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.FareBasis }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.FareBasis createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownFlightSegmentFareBasis() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.FareBasis();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.MarketingAirline }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.MarketingAirline createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownFlightSegmentMarketingAirline() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.MarketingAirline();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.OriginLocation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.OriginLocation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownFlightSegmentOriginLocation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.OriginLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.ValidityDates }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.ValidityDates createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownFlightSegmentValidityDates() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.ValidityDates();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.Endorsements.Endorsement }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.Endorsements.Endorsement createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownEndorsementsEndorsement() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.Endorsements.Endorsement();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.NetRemits.NetRemit }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.NetRemits.NetRemit createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownNetRemitsNetRemit() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.NetRemits.NetRemit();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaseFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaseFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareBaseFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaseFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.EquivFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.EquivFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareEquivFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.EquivFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.TotalFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.TotalFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareTotalFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.TotalFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.BaseFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.BaseFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareTotalsBaseFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.BaseFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.EquivFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.EquivFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareTotalsEquivFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.EquivFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.TotalFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.TotalFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareTotalsTotalFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.TotalFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.Taxes.Tax }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.Taxes.Tax createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareTotalsTaxesTax() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.Taxes.Tax();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes.Tax }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes.Tax createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareTaxesTax() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes.Tax();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes.TaxBreakdownCode }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes.TaxBreakdownCode createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareTaxesTaxBreakdownCode() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes.TaxBreakdownCode();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.BaggageFees }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.BaggageFees createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationBaggageFees() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.BaggageFees();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.SignatureLine }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.SignatureLine createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationSignatureLine() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.SignatureLine();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.TicketingFees.FeeInformation }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.TicketingFees.FeeInformation createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationTicketingFeesFeeInformation() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.TicketingFees.FeeInformation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare.BaseFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare.BaseFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationGlobalNetRemitSellingFareBaseFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare.BaseFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare.EquivFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare.EquivFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationGlobalNetRemitSellingFareEquivFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare.EquivFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare.Taxes }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare.Taxes createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationGlobalNetRemitSellingFareTaxes() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare.Taxes();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare.TotalFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare.TotalFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationGlobalNetRemitSellingFareTotalFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare.TotalFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare.BaseFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare.BaseFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationGlobalNetRemitNetFareBaseFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare.BaseFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare.EquivFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare.EquivFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationGlobalNetRemitNetFareEquivFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare.EquivFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare.Taxes }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare.Taxes createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationGlobalNetRemitNetFareTaxes() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare.Taxes();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare.TotalFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare.TotalFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationGlobalNetRemitNetFareTotalFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare.TotalFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.FileInfo.File }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.FileInfo.File createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryFileInfoFile() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.FileInfo.File();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.CustLoyalty }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.CustLoyalty createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryCustomerInfoCustLoyalty() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.CustLoyalty();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.Passport }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.Passport createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryCustomerInfoPassport() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.Passport();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.Email }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.Email createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryCustomerInfoPersonNameEmail() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.Email();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.ProfileIndex }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.ProfileIndex createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryCustomerInfoPersonNameProfileIndex() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.ProfileIndex();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.GroupInfo.AssociatedReferenceInformation.AssociatedPNRSummaries.AssociatedPNRSummary }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.GroupInfo.AssociatedReferenceInformation.AssociatedPNRSummaries.AssociatedPNRSummary createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryCustomerInfoPersonNameGroupInfoAssociatedReferenceInformationAssociatedPNRSummariesAssociatedPNRSummary() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.GroupInfo.AssociatedReferenceInformation.AssociatedPNRSummaries.AssociatedPNRSummary();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.Form }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.Form createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryCustomerInfoPaymentInfoPaymentForm() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.Form();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo.CardHolderInfo.Address }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo.CardHolderInfo.Address createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryCustomerInfoPaymentInfoPaymentCCInfoCardHolderInfoAddress() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo.CardHolderInfo.Address();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo.CardHolderInfo.ContactNumbers.ContactNumber }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo.CardHolderInfo.ContactNumbers.ContactNumber createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryCustomerInfoPaymentInfoPaymentCCInfoCardHolderInfoContactNumbersContactNumber() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo.CardHolderInfo.ContactNumbers.ContactNumber();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.ContactNumbers.ContactNumber.PersonName }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.ContactNumbers.ContactNumber.PersonName createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryCustomerInfoContactNumbersContactNumberPersonName() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.ContactNumbers.ContactNumber.PersonName();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.Address.AddressLine }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.Address.AddressLine createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryCustomerInfoAddressAddressLine() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.Address.AddressLine();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.AccountVendor }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.AccountVendor createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryAccountingInfoAccountVendor() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.AccountVendor();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Airline }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Airline createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryAccountingInfoAirline() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Airline();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.BaseFare }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.BaseFare createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryAccountingInfoBaseFare() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.BaseFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PersonName }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PersonName createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryAccountingInfoPersonName() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PersonName();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.TicketingInfo.ETicket }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.TicketingInfo.ETicket createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryAccountingInfoTicketingInfoETicket() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.TicketingInfo.ETicket();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.TicketingInfo.Exchange }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.TicketingInfo.Exchange createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryAccountingInfoTicketingInfoExchange() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.TicketingInfo.Exchange();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.TicketingInfo.Ticketing }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.TicketingInfo.Ticketing createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryAccountingInfoTicketingInfoTicketing() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.TicketingInfo.Ticketing();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Taxes.GST }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Taxes.GST createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryAccountingInfoTaxesGST() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Taxes.GST();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Taxes.QST }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Taxes.QST createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryAccountingInfoTaxesQST() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Taxes.QST();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Taxes.Tax }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Taxes.Tax createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryAccountingInfoTaxesTax() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Taxes.Tax();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo.Commission }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo.Commission createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryAccountingInfoPaymentInfoCommission() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo.Commission();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo.Payment.CCInfo.PaymentCard }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo.Payment.CCInfo.PaymentCard createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryAccountingInfoPaymentInfoPaymentCCInfoPaymentCard() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo.Payment.CCInfo.PaymentCard();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.DocumentInfo.Document }
     * 
     */
    public EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.DocumentInfo.Document createEnhancedAirBookRSTravelItineraryReadRSTravelItineraryAccountingInfoDocumentInfoDocument() {
        return new EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.DocumentInfo.Document();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceComparison }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceComparison createEnhancedAirBookRSOTAAirPriceRSPriceComparison() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceComparison();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculation }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculation createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoFareCalculation() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PassengerTypeQuantity }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PassengerTypeQuantity createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoPassengerTypeQuantity() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PassengerTypeQuantity();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.TicketingFees.FeeInformation }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.TicketingFees.FeeInformation createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoTicketingFeesFeeInformation() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.TicketingFees.FeeInformation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.BrandedFareInformation }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.BrandedFareInformation createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownBrandedFareInformation() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.BrandedFareInformation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareBasis }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareBasis createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownFareBasis() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareBasis();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.Surcharges }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.Surcharges createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownSurcharges() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.Surcharges();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaseFare }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaseFare createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareBaseFare() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaseFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Commission }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Commission createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareCommission() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Commission();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Endorsements }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Endorsements createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareEndorsements() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Endorsements();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.EquivFare }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.EquivFare createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareEquivFare() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.EquivFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.PrivateFare }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.PrivateFare createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFarePrivateFare() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.PrivateFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.TotalFare }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.TotalFare createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareTotalFare() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.TotalFare();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Warnings.Warning }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Warnings.Warning createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareWarningsWarning() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Warnings.Warning();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes.Tax }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes.Tax createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareTaxesTax() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes.Tax();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaggageInfo.NonUSDOTDisclosure }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaggageInfo.NonUSDOTDisclosure createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareBaggageInfoNonUSDOTDisclosure() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaggageInfo.NonUSDOTDisclosure();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaggageInfo.USDOTDisclosure }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaggageInfo.USDOTDisclosure createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareBaggageInfoUSDOTDisclosure() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaggageInfo.USDOTDisclosure();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculationBreakdown.Branch }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculationBreakdown.Branch createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoFareCalculationBreakdownBranch() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculationBreakdown.Branch();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculationBreakdown.Departure }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculationBreakdown.Departure createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoFareCalculationBreakdownDeparture() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculationBreakdown.Departure();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculationBreakdown.FareBasis }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculationBreakdown.FareBasis createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoFareCalculationBreakdownFareBasis() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculationBreakdown.FareBasis();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculationBreakdown.Mileage }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculationBreakdown.Mileage createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoFareCalculationBreakdownMileage() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculationBreakdown.Mileage();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculationBreakdown.Surcharges }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculationBreakdown.Surcharges createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoFareCalculationBreakdownSurcharges() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculationBreakdown.Surcharges();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculationBreakdown.StopoverCharge }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculationBreakdown.StopoverCharge createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoFareCalculationBreakdownStopoverCharge() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculationBreakdown.StopoverCharge();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.PassengerType }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.PassengerType createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoBaggageProvisionsPassengerType() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.PassengerType();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.WeightLimit }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.WeightLimit createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoBaggageProvisionsWeightLimit() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.WeightLimit();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.SubCodeInfo.SubCodeForAllowance }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.SubCodeInfo.SubCodeForAllowance createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoBaggageProvisionsSubCodeInfoSubCodeForAllowance() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.SubCodeInfo.SubCodeForAllowance();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.PriceInformation.Base }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.PriceInformation.Base createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoBaggageProvisionsPriceInformationBase() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.PriceInformation.Base();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.PriceInformation.Equiv }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.PriceInformation.Equiv createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoBaggageProvisionsPriceInformationEquiv() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.PriceInformation.Equiv();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations.CarrierCode }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations.CarrierCode createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoBaggageProvisionsAssociationsCarrierCode() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations.CarrierCode();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations.DepartureDate }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations.DepartureDate createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoBaggageProvisionsAssociationsDepartureDate() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations.DepartureDate();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations.DestinationLocation }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations.DestinationLocation createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoBaggageProvisionsAssociationsDestinationLocation() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations.DestinationLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations.FlightNumber }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations.FlightNumber createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoBaggageProvisionsAssociationsFlightNumber() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations.FlightNumber();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations.OriginLocation }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations.OriginLocation createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoBaggageProvisionsAssociationsOriginLocation() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations.OriginLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations.PNRSegment }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations.PNRSegment createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoBaggageProvisionsAssociationsPNRSegment() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations.PNRSegment();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations.ResBookDesigCode }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations.ResBookDesigCode createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoBaggageProvisionsAssociationsResBookDesigCode() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations.ResBookDesigCode();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations.StatusCode }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations.StatusCode createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoBaggageProvisionsAssociationsStatusCode() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.BaggageProvisions.Associations.StatusCode();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.AncillaryFees.FeeInformation }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.AncillaryFees.FeeInformation createEnhancedAirBookRSOTAAirPriceRSPriceQuotePricedItineraryAirItineraryPricingInfoAncillaryFeesFeeInformation() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.AncillaryFees.FeeInformation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.MultiTicketInformation }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.MultiTicketInformation createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationMultiTicketInformation() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.MultiTicketInformation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.Coupon }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.Coupon createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesTicketingInfoTicketingCoupon() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.Coupon();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.PersonName.GivenName }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.PersonName.GivenName createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesTicketingInfoTicketingPersonNameGivenName() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.PersonName.GivenName();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.PersonName.Surname }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.PersonName.Surname createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesTicketingInfoTicketingPersonNameSurname() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.PersonName.Surname();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment.DestinationLocation }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment.DestinationLocation createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesItineraryInfoFlightSegmentDestinationLocation() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment.DestinationLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment.MarketingAirline }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment.MarketingAirline createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesItineraryInfoFlightSegmentMarketingAirline() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment.MarketingAirline();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment.OriginLocation }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment.OriginLocation createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesItineraryInfoFlightSegmentOriginLocation() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment.OriginLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ReasonForIssuance }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ReasonForIssuance createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesChargeDetailsReasonForIssuance() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ReasonForIssuance();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.SSIM }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.SSIM createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesChargeDetailsSSIM() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.SSIM();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.SSR }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.SSR createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesChargeDetailsSSR() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.SSR();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.Ticket }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.Ticket createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesChargeDetailsTicket() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.Ticket();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.TourCode }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.TourCode createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesChargeDetailsTourCode() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.TourCode();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.VendorPrefs.Airline }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.VendorPrefs.Airline createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesChargeDetailsVendorPrefsAirline() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.VendorPrefs.Airline();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Base }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Base createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesChargeDetailsChargeBreakdownBase() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Base();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Equiv }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Equiv createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesChargeDetailsChargeBreakdownEquiv() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Equiv();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.PassengerTypeQuantity }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.PassengerTypeQuantity createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesChargeDetailsChargeBreakdownPassengerTypeQuantity() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.PassengerTypeQuantity();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Total }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Total createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesChargeDetailsChargeBreakdownTotal() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Total();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Taxes.Tax }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Taxes.Tax createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationOptionalChargesChargeDetailsChargeBreakdownTaxesTax() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Taxes.Tax();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.DivideParty }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.DivideParty createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationHeaderInformationDivideParty() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.DivideParty();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.ValidatingCarrier }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.ValidatingCarrier createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationHeaderInformationValidatingCarrier() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.ValidatingCarrier();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.BargainFinder.AlternateBooking }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.BargainFinder.AlternateBooking createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationHeaderInformationBargainFinderAlternateBooking() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.BargainFinder.AlternateBooking();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.AncillaryService }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.AncillaryService createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationBaggageInfoSubCodePropertiesAncillaryService() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.AncillaryService();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.DescriptionOne }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.DescriptionOne createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationBaggageInfoSubCodePropertiesDescriptionOne() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.DescriptionOne();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.DescriptionTwo }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.DescriptionTwo createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationBaggageInfoSubCodePropertiesDescriptionTwo() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.DescriptionTwo();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo.MaximumSizeInAlternate }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo.MaximumSizeInAlternate createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationBaggageInfoSubCodePropertiesSizeWeightInfoMaximumSizeInAlternate() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo.MaximumSizeInAlternate();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo.MaximumSize }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo.MaximumSize createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationBaggageInfoSubCodePropertiesSizeWeightInfoMaximumSize() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo.MaximumSize();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo.MaximumWeightInAlternate }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo.MaximumWeightInAlternate createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationBaggageInfoSubCodePropertiesSizeWeightInfoMaximumWeightInAlternate() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo.MaximumWeightInAlternate();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo.MaximumWeight }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo.MaximumWeight createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationBaggageInfoSubCodePropertiesSizeWeightInfoMaximumWeight() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo.MaximumWeight();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo.MinimumSizeInAlternate }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo.MinimumSizeInAlternate createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationBaggageInfoSubCodePropertiesSizeWeightInfoMinimumSizeInAlternate() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo.MinimumSizeInAlternate();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo.MinimumSize }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo.MinimumSize createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationBaggageInfoSubCodePropertiesSizeWeightInfoMinimumSize() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo.MinimumSize();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo.MinimumWeightInAlternate }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo.MinimumWeightInAlternate createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationBaggageInfoSubCodePropertiesSizeWeightInfoMinimumWeightInAlternate() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo.MinimumWeightInAlternate();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo.MinimumWeight }
     * 
     */
    public EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo.MinimumWeight createEnhancedAirBookRSOTAAirPriceRSPriceQuoteMiscInformationBaggageInfoSubCodePropertiesSizeWeightInfoMinimumWeight() {
        return new EnhancedAirBookRS.OTAAirPriceRS.PriceQuote.MiscInformation.BaggageInfo.SubCodeProperties.SizeWeightInfo.MinimumWeight();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirBookRS.OriginDestinationOption.FlightSegment.DestinationLocation }
     * 
     */
    public EnhancedAirBookRS.OTAAirBookRS.OriginDestinationOption.FlightSegment.DestinationLocation createEnhancedAirBookRSOTAAirBookRSOriginDestinationOptionFlightSegmentDestinationLocation() {
        return new EnhancedAirBookRS.OTAAirBookRS.OriginDestinationOption.FlightSegment.DestinationLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirBookRS.OriginDestinationOption.FlightSegment.MarketingAirline }
     * 
     */
    public EnhancedAirBookRS.OTAAirBookRS.OriginDestinationOption.FlightSegment.MarketingAirline createEnhancedAirBookRSOTAAirBookRSOriginDestinationOptionFlightSegmentMarketingAirline() {
        return new EnhancedAirBookRS.OTAAirBookRS.OriginDestinationOption.FlightSegment.MarketingAirline();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirBookRS.OriginDestinationOption.FlightSegment.MarriageGrp }
     * 
     */
    public EnhancedAirBookRS.OTAAirBookRS.OriginDestinationOption.FlightSegment.MarriageGrp createEnhancedAirBookRSOTAAirBookRSOriginDestinationOptionFlightSegmentMarriageGrp() {
        return new EnhancedAirBookRS.OTAAirBookRS.OriginDestinationOption.FlightSegment.MarriageGrp();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.OTAAirBookRS.OriginDestinationOption.FlightSegment.OriginLocation }
     * 
     */
    public EnhancedAirBookRS.OTAAirBookRS.OriginDestinationOption.FlightSegment.OriginLocation createEnhancedAirBookRSOTAAirBookRSOriginDestinationOptionFlightSegmentOriginLocation() {
        return new EnhancedAirBookRS.OTAAirBookRS.OriginDestinationOption.FlightSegment.OriginLocation();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.AirTaxRS.ItineraryInfos.ItineraryInfo.TaxInfo.Taxes.Tax }
     * 
     */
    public EnhancedAirBookRS.AirTaxRS.ItineraryInfos.ItineraryInfo.TaxInfo.Taxes.Tax createEnhancedAirBookRSAirTaxRSItineraryInfosItineraryInfoTaxInfoTaxesTax() {
        return new EnhancedAirBookRS.AirTaxRS.ItineraryInfos.ItineraryInfo.TaxInfo.Taxes.Tax();
    }

    /**
     * Create an instance of {@link EnhancedAirBookRS.AirTaxRS.ItineraryInfos.ItineraryInfo.PTCFareBreakdown.PassengerType }
     * 
     */
    public EnhancedAirBookRS.AirTaxRS.ItineraryInfos.ItineraryInfo.PTCFareBreakdown.PassengerType createEnhancedAirBookRSAirTaxRSItineraryInfosItineraryInfoPTCFareBreakdownPassengerType() {
        return new EnhancedAirBookRS.AirTaxRS.ItineraryInfos.ItineraryInfo.PTCFareBreakdown.PassengerType();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link STLPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Payload/v02_01", name = "STL_Payload")
    public JAXBElement<STLPayload> createSTLPayload(STLPayload value) {
        return new JAXBElement<STLPayload>(_STLPayload_QNAME, STLPayload.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Payload/v02_01", name = "ApplicationResults", substitutionHeadNamespace = "http://services.sabre.com/STL_Payload/v02_01", substitutionHeadName = "Results")
    public JAXBElement<ApplicationResults> createApplicationResults(ApplicationResults value) {
        return new JAXBElement<ApplicationResults>(_ApplicationResults_QNAME, ApplicationResults.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link STLResponsePayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Payload/v02_01", name = "STL_Response_Payload", substitutionHeadNamespace = "http://services.sabre.com/STL_Payload/v02_01", substitutionHeadName = "STL_Payload")
    public JAXBElement<STLResponsePayload> createSTLResponsePayload(STLResponsePayload value) {
        return new JAXBElement<STLResponsePayload>(_STLResponsePayload_QNAME, STLResponsePayload.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Results }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Payload/v02_01", name = "Results")
    public JAXBElement<Results> createResults(Results value) {
        return new JAXBElement<Results>(_Results_QNAME, Results.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link STLNotifPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Payload/v02_01", name = "STL_Notif_Payload", substitutionHeadNamespace = "http://services.sabre.com/STL_Payload/v02_01", substitutionHeadName = "STL_Payload")
    public JAXBElement<STLNotifPayload> createSTLNotifPayload(STLNotifPayload value) {
        return new JAXBElement<STLNotifPayload>(_STLNotifPayload_QNAME, STLNotifPayload.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link STLRequestPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Payload/v02_01", name = "STL_Request_Payload", substitutionHeadNamespace = "http://services.sabre.com/STL_Payload/v02_01", substitutionHeadName = "STL_Payload")
    public JAXBElement<STLRequestPayload> createSTLRequestPayload(STLRequestPayload value) {
        return new JAXBElement<STLRequestPayload>(_STLRequestPayload_QNAME, STLRequestPayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProblemInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Payload/v02_01", name = "ProblemInformation")
    public JAXBElement<ProblemInformation> createProblemInformation(ProblemInformation value) {
        return new JAXBElement<ProblemInformation>(_ProblemInformation_QNAME, ProblemInformation.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "XPath", scope = TransformType.class)
    public JAXBElement<String> createTransformTypeXPath(String value) {
        return new JAXBElement<String>(_TransformTypeXPath_QNAME, String.class, TransformType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SPKISexp", scope = SPKIDataType.class)
    public JAXBElement<byte[]> createSPKIDataTypeSPKISexp(byte[] value) {
        return new JAXBElement<byte[]>(_SPKIDataTypeSPKISexp_QNAME, byte[].class, SPKIDataType.class, ((byte[]) value));
    }

}
