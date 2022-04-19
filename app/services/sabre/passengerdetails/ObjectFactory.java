
package services.sabre.passengerdetails;

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
 * generated in the passengerdetails package. 
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
    private final static QName _TransformTypeXPath_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "XPath");
    private final static QName _SPKIDataTypeSPKISexp_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SPKISexp");
    private final static QName _X509DataTypeX509IssuerSerial_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509IssuerSerial");
    private final static QName _X509DataTypeX509CRL_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509CRL");
    private final static QName _X509DataTypeX509SubjectName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SubjectName");
    private final static QName _X509DataTypeX509SKI_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SKI");
    private final static QName _X509DataTypeX509Certificate_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509Certificate");
    private final static QName _SignatureMethodTypeHMACOutputLength_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "HMACOutputLength");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: passengerdetails
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PassengerDetailsRS }
     * 
     */
    public PassengerDetailsRS createPassengerDetailsRS() {
        return new PassengerDetailsRS();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ }
     * 
     */
    public PassengerDetailsRQ createPassengerDetailsRQ() {
        return new PassengerDetailsRQ();
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
     * Create an instance of {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ }
     * 
     */
    public PassengerDetailsRQ.TravelItineraryAddInfoRQ createPassengerDetailsRQTravelItineraryAddInfoRQ() {
        return new PassengerDetailsRQ.TravelItineraryAddInfoRQ();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo }
     * 
     */
    public PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo createPassengerDetailsRQTravelItineraryAddInfoRQCustomerInfo() {
        return new PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName }
     * 
     */
    public PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName createPassengerDetailsRQTravelItineraryAddInfoRQCustomerInfoPersonName() {
        return new PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo }
     * 
     */
    public PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo createPassengerDetailsRQTravelItineraryAddInfoRQCustomerInfoPersonNameGroupInfo() {
        return new PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs }
     * 
     */
    public PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs createPassengerDetailsRQTravelItineraryAddInfoRQCustomerInfoPersonNameGroupInfoVendorPrefs() {
        return new PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers }
     * 
     */
    public PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers createPassengerDetailsRQTravelItineraryAddInfoRQCustomerInfoContactNumbers() {
        return new PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo }
     * 
     */
    public PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo createPassengerDetailsRQTravelItineraryAddInfoRQAgencyInfo() {
        return new PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address }
     * 
     */
    public PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address createPassengerDetailsRQTravelItineraryAddInfoRQAgencyInfoAddress() {
        return new PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs }
     * 
     */
    public PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs createPassengerDetailsRQTravelItineraryAddInfoRQAgencyInfoAddressVendorPrefs() {
        return new PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails createPassengerDetailsRQSpecialReqDetails() {
        return new PassengerDetailsRQ.SpecialReqDetails();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ createPassengerDetailsRQSpecialReqDetailsSpecialServiceRQ() {
        return new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo createPassengerDetailsRQSpecialReqDetailsSpecialServiceRQSpecialServiceInfo() {
        return new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service createPassengerDetailsRQSpecialReqDetailsSpecialServiceRQSpecialServiceInfoService() {
        return new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.VendorPrefs }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.VendorPrefs createPassengerDetailsRQSpecialReqDetailsSpecialServiceRQSpecialServiceInfoServiceVendorPrefs() {
        return new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.VendorPrefs();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight createPassengerDetailsRQSpecialReqDetailsSpecialServiceRQSpecialServiceInfoSecureFlight() {
        return new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.VendorPrefs }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.VendorPrefs createPassengerDetailsRQSpecialReqDetailsSpecialServiceRQSpecialServiceInfoSecureFlightVendorPrefs() {
        return new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.VendorPrefs();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.AdvancePassenger }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.AdvancePassenger createPassengerDetailsRQSpecialReqDetailsSpecialServiceRQSpecialServiceInfoAdvancePassenger() {
        return new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.AdvancePassenger();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.AdvancePassenger.VendorPrefs }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.AdvancePassenger.VendorPrefs createPassengerDetailsRQSpecialReqDetailsSpecialServiceRQSpecialServiceInfoAdvancePassengerVendorPrefs() {
        return new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.AdvancePassenger.VendorPrefs();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.AdvancePassenger.Document }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.AdvancePassenger.Document createPassengerDetailsRQSpecialReqDetailsSpecialServiceRQSpecialServiceInfoAdvancePassengerDocument() {
        return new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.AdvancePassenger.Document();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.AirSeatRQ }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.AirSeatRQ createPassengerDetailsRQSpecialReqDetailsAirSeatRQ() {
        return new PassengerDetailsRQ.SpecialReqDetails.AirSeatRQ();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.AirSeatRQ.Seats }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.AirSeatRQ.Seats createPassengerDetailsRQSpecialReqDetailsAirSeatRQSeats() {
        return new PassengerDetailsRQ.SpecialReqDetails.AirSeatRQ.Seats();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ createPassengerDetailsRQSpecialReqDetailsAddRemarkRQ() {
        return new PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo createPassengerDetailsRQSpecialReqDetailsAddRemarkRQRemarkInfo() {
        return new PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark createPassengerDetailsRQSpecialReqDetailsAddRemarkRQRemarkInfoFOPRemark() {
        return new PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark.CCInfo }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark.CCInfo createPassengerDetailsRQSpecialReqDetailsAddRemarkRQRemarkInfoFOPRemarkCCInfo() {
        return new PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark.CCInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.ProfileRQ }
     * 
     */
    public PassengerDetailsRQ.ProfileRQ createPassengerDetailsRQProfileRQ() {
        return new PassengerDetailsRQ.ProfileRQ();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.PriceQuoteInfo }
     * 
     */
    public PassengerDetailsRQ.PriceQuoteInfo createPassengerDetailsRQPriceQuoteInfo() {
        return new PassengerDetailsRQ.PriceQuoteInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.PreProcessing }
     * 
     */
    public PassengerDetailsRQ.PreProcessing createPassengerDetailsRQPreProcessing() {
        return new PassengerDetailsRQ.PreProcessing();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.PostProcessing }
     * 
     */
    public PassengerDetailsRQ.PostProcessing createPassengerDetailsRQPostProcessing() {
        return new PassengerDetailsRQ.PostProcessing();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.PostProcessing.QueuePlaceRQ }
     * 
     */
    public PassengerDetailsRQ.PostProcessing.QueuePlaceRQ createPassengerDetailsRQPostProcessingQueuePlaceRQ() {
        return new PassengerDetailsRQ.PostProcessing.QueuePlaceRQ();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo }
     * 
     */
    public PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo createPassengerDetailsRQPostProcessingQueuePlaceRQQueueInfo() {
        return new PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.MultiQueuePlace }
     * 
     */
    public PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.MultiQueuePlace createPassengerDetailsRQPostProcessingQueuePlaceRQMultiQueuePlace() {
        return new PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.MultiQueuePlace();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ }
     * 
     */
    public PassengerDetailsRQ.PostProcessing.EndTransactionRQ createPassengerDetailsRQPostProcessingEndTransactionRQ() {
        return new PassengerDetailsRQ.PostProcessing.EndTransactionRQ();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction }
     * 
     */
    public PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction createPassengerDetailsRQPostProcessingEndTransactionRQEndTransaction() {
        return new PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email }
     * 
     */
    public PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email createPassengerDetailsRQPostProcessingEndTransactionRQEndTransactionEmail() {
        return new PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Itinerary }
     * 
     */
    public PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Itinerary createPassengerDetailsRQPostProcessingEndTransactionRQEndTransactionEmailItinerary() {
        return new PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Itinerary();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.ETicket }
     * 
     */
    public PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.ETicket createPassengerDetailsRQPostProcessingEndTransactionRQEndTransactionEmailETicket() {
        return new PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.ETicket();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.MiscSegmentSellRQ }
     * 
     */
    public PassengerDetailsRQ.MiscSegmentSellRQ createPassengerDetailsRQMiscSegmentSellRQ() {
        return new PassengerDetailsRQ.MiscSegmentSellRQ();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment }
     * 
     */
    public PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment createPassengerDetailsRQMiscSegmentSellRQMiscSegment() {
        return new PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs }
     * 
     */
    public PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs createPassengerDetailsRQMiscSegmentSellRQMiscSegmentVendorPrefs() {
        return new PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS createPassengerDetailsRSTravelItineraryReadRS() {
        return new PassengerDetailsRS.TravelItineraryReadRS();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.VCR }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.VCR createPassengerDetailsRSTravelItineraryReadRSVCR() {
        return new PassengerDetailsRS.TravelItineraryReadRS.VCR();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.VCR.TicketingDocument }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.VCR.TicketingDocument createPassengerDetailsRSTravelItineraryReadRSVCRTicketingDocument() {
        return new PassengerDetailsRS.TravelItineraryReadRS.VCR.TicketingDocument();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary createPassengerDetailsRSTravelItineraryReadRSTravelItinerary() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.SpecialServiceInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.SpecialServiceInfo createPassengerDetailsRSTravelItineraryReadRSTravelItinerarySpecialServiceInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.SpecialServiceInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.SpecialServiceInfo.Service }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.SpecialServiceInfo.Service createPassengerDetailsRSTravelItineraryReadRSTravelItinerarySpecialServiceInfoService() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.SpecialServiceInfo.Service();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.RemarkInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.RemarkInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryRemarkInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.RemarkInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.RemarkInfo.Remark }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.RemarkInfo.Remark createPassengerDetailsRSTravelItineraryReadRSTravelItineraryRemarkInfoRemark() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.RemarkInfo.Remark();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.QueueInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.QueueInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryQueueInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.QueueInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.PayInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.PayInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryPayInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.PayInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryRef }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryRef createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryRef() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryRef();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItems() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItem() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillaries() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryService() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TravelPortions }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TravelPortions createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceTravelPortions() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TravelPortions();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalTaxes }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalTaxes createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceTotalTaxes() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalTaxes();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.Taxes }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.Taxes createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceTaxes() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.Taxes();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicle() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvail() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCore() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreVehicleCharges() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreVehicleChargesVehicleCharge() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge.ChargeDetails }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge.ChargeDetails createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreVehicleChargesVehicleChargeChargeDetails() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge.ChargeDetails();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreRentalRate() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.PricedEquip }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.PricedEquip createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCorePricedEquip() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.PricedEquip();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.GuaranteePrepaid }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.GuaranteePrepaid createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreGuaranteePrepaid() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.GuaranteePrepaid();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreCollectionDeliveryInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreCollectionDeliveryInfoDeliveryInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo.ContactNumbers }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo.ContactNumbers createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreCollectionDeliveryInfoDeliveryInfoContactNumbers() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo.ContactNumbers();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo.Address }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo.Address createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreCollectionDeliveryInfoDeliveryInfoAddress() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo.Address();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreCollectionDeliveryInfoCollectionInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo.ContactNumbers }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo.ContactNumbers createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreCollectionDeliveryInfoCollectionInfoContactNumbers() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo.ContactNumbers();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo.Address }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo.Address createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreCollectionDeliveryInfoCollectionInfoAddress() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo.Address();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehRentalCore() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.LocationDetails }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.LocationDetails createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehRentalCoreLocationDetails() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.LocationDetails();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.LocationDetails.ContactNumbers }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.LocationDetails.ContactNumbers createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehRentalCoreLocationDetailsContactNumbers() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.LocationDetails.ContactNumbers();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.FlightSegment }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.FlightSegment createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehRentalCoreFlightSegment() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.FlightSegment();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.POS }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.POS createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehiclePOS() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.POS();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemTour() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemTourTourDetails() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.HotelInformation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.HotelInformation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemTourTourDetailsHotelInformation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.HotelInformation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemSurface() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.FlightSegment }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.FlightSegment createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemSurfaceFlightSegment() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.FlightSegment();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemSeats() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats.Seat }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats.Seat createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemSeatsSeat() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats.Seat();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats.Seat.FlightSegment }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats.Seat.FlightSegment createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemSeatsSeatFlightSegment() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats.Seat.FlightSegment();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemRail() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.MiscSegment }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.MiscSegment createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemMiscSegment() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.MiscSegment();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemInsurance() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemInsuranceInsuranceDetails() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotel() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRates() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRate() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelTotalPricing() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.TotalSurcharge }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.TotalSurcharge createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelTotalPricingTotalSurcharge() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.TotalSurcharge();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.TotalTax }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.TotalTax createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelTotalPricingTotalTax() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.TotalTax();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelRateDescripton() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton.Additionals }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton.Additionals createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelRateDescriptonAdditionals() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton.Additionals();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton.RateDescriptions }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton.RateDescriptions createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelRateDescriptonRateDescriptions() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton.RateDescriptions();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.POS }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.POS createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelPOS() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.POS();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.Customer }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.Customer createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelCustomer() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.Customer();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelBasicPropertyInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo.ContactNumbers }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo.ContactNumbers createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelBasicPropertyInfoContactNumbers() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo.ContactNumbers();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegment() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemCruise() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.AirTaxi }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.AirTaxi createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAirTaxi() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.AirTaxi();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricing() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteTotals() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.Taxes }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.Taxes createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteTotalsTaxes() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.Taxes();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuote() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePriceQuotePlus() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.PACInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.PACInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePriceQuotePlusPACInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.PACInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.FuturePricingInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.FuturePricingInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePriceQuotePlusFuturePricingInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.FuturePricingInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.TicketingInstructionsInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.TicketingInstructionsInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePriceQuotePlusTicketingInstructionsInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.TicketingInstructionsInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.PassengerInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.PassengerInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePriceQuotePlusPassengerInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.PassengerInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItinerary() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoSellingFareDetails() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.Taxes }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.Taxes createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoSellingFareDetailsTaxes() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.Taxes();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.Commission }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.Commission createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoSellingFareDetailsCommission() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.Commission();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoNetFareDetails() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.Taxes }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.Taxes createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoNetFareDetailsTaxes() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.Taxes();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.Commission }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.Commission createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoNetFareDetailsCommission() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.Commission();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdown() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownFlightSegment() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.Endorsements }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.Endorsements createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownEndorsements() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.Endorsements();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.NetRemits }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.NetRemits createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownNetRemits() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.NetRemits();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareTotals() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.Taxes }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.Taxes createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareTotalsTaxes() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.Taxes();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareTaxes() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.TicketingFees }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.TicketingFees createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationTicketingFees() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.TicketingFees();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationGlobalNetRemit() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationGlobalNetRemitSellingFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationGlobalNetRemitNetFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.FileInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.FileInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryFileInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.FileInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryCustomerInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName createPassengerDetailsRSTravelItineraryReadRSTravelItineraryCustomerInfoPersonName() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.GroupInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.GroupInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryCustomerInfoPersonNameGroupInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.GroupInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.GroupInfo.AssociatedReferenceInformation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.GroupInfo.AssociatedReferenceInformation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryCustomerInfoPersonNameGroupInfoAssociatedReferenceInformation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.GroupInfo.AssociatedReferenceInformation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.GroupInfo.AssociatedReferenceInformation.AssociatedPNRSummaries }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.GroupInfo.AssociatedReferenceInformation.AssociatedPNRSummaries createPassengerDetailsRSTravelItineraryReadRSTravelItineraryCustomerInfoPersonNameGroupInfoAssociatedReferenceInformationAssociatedPNRSummaries() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.GroupInfo.AssociatedReferenceInformation.AssociatedPNRSummaries();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryCustomerInfoPaymentInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment createPassengerDetailsRSTravelItineraryReadRSTravelItineraryCustomerInfoPaymentInfoPayment() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryCustomerInfoPaymentInfoPaymentCCInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo.CardHolderInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo.CardHolderInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryCustomerInfoPaymentInfoPaymentCCInfoCardHolderInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo.CardHolderInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo.CardHolderInfo.ContactNumbers }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo.CardHolderInfo.ContactNumbers createPassengerDetailsRSTravelItineraryReadRSTravelItineraryCustomerInfoPaymentInfoPaymentCCInfoCardHolderInfoContactNumbers() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo.CardHolderInfo.ContactNumbers();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.ContactNumbers }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.ContactNumbers createPassengerDetailsRSTravelItineraryReadRSTravelItineraryCustomerInfoContactNumbers() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.ContactNumbers();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.ContactNumbers.ContactNumber }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.ContactNumbers.ContactNumber createPassengerDetailsRSTravelItineraryReadRSTravelItineraryCustomerInfoContactNumbersContactNumber() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.ContactNumbers.ContactNumber();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.Address }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.Address createPassengerDetailsRSTravelItineraryReadRSTravelItineraryCustomerInfoAddress() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.Address();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryAccountingInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.TicketingInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.TicketingInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryAccountingInfoTicketingInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.TicketingInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Taxes }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Taxes createPassengerDetailsRSTravelItineraryReadRSTravelItineraryAccountingInfoTaxes() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Taxes();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryAccountingInfoPaymentInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo.Payment }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo.Payment createPassengerDetailsRSTravelItineraryReadRSTravelItineraryAccountingInfoPaymentInfoPayment() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo.Payment();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo.Payment.CCInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo.Payment.CCInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryAccountingInfoPaymentInfoPaymentCCInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo.Payment.CCInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.DocumentInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.DocumentInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryAccountingInfoDocumentInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.DocumentInfo();
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
     * Create an instance of {@link PassengerDetailsRS.ItineraryRef }
     * 
     */
    public PassengerDetailsRS.ItineraryRef createPassengerDetailsRSItineraryRef() {
        return new PassengerDetailsRS.ItineraryRef();
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
     * Create an instance of {@link PassengerType.Type }
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
     * Create an instance of {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.Corporate }
     * 
     */
    public PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.Corporate createPassengerDetailsRQTravelItineraryAddInfoRQCustomerInfoCorporate() {
        return new PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.Corporate();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.CustLoyalty }
     * 
     */
    public PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.CustLoyalty createPassengerDetailsRQTravelItineraryAddInfoRQCustomerInfoCustLoyalty() {
        return new PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.CustLoyalty();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.Email }
     * 
     */
    public PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.Email createPassengerDetailsRQTravelItineraryAddInfoRQCustomerInfoEmail() {
        return new PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.Email();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs.Airline }
     * 
     */
    public PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs.Airline createPassengerDetailsRQTravelItineraryAddInfoRQCustomerInfoPersonNameGroupInfoVendorPrefsAirline() {
        return new PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs.Airline();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers.ContactNumber }
     * 
     */
    public PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers.ContactNumber createPassengerDetailsRQTravelItineraryAddInfoRQCustomerInfoContactNumbersContactNumber() {
        return new PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers.ContactNumber();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Ticketing }
     * 
     */
    public PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Ticketing createPassengerDetailsRQTravelItineraryAddInfoRQAgencyInfoTicketing() {
        return new PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Ticketing();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.StateCountyProv }
     * 
     */
    public PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.StateCountyProv createPassengerDetailsRQTravelItineraryAddInfoRQAgencyInfoAddressStateCountyProv() {
        return new PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.StateCountyProv();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs.Airline }
     * 
     */
    public PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs.Airline createPassengerDetailsRQTravelItineraryAddInfoRQAgencyInfoAddressVendorPrefsAirline() {
        return new PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs.Airline();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.PersonName }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.PersonName createPassengerDetailsRQSpecialReqDetailsSpecialServiceRQSpecialServiceInfoServicePersonName() {
        return new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.PersonName();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.VendorPrefs.Airline }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.VendorPrefs.Airline createPassengerDetailsRQSpecialReqDetailsSpecialServiceRQSpecialServiceInfoServiceVendorPrefsAirline() {
        return new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.VendorPrefs.Airline();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.PersonName }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.PersonName createPassengerDetailsRQSpecialReqDetailsSpecialServiceRQSpecialServiceInfoSecureFlightPersonName() {
        return new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.PersonName();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.VendorPrefs.Airline }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.VendorPrefs.Airline createPassengerDetailsRQSpecialReqDetailsSpecialServiceRQSpecialServiceInfoSecureFlightVendorPrefsAirline() {
        return new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.VendorPrefs.Airline();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.AdvancePassenger.PersonName }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.AdvancePassenger.PersonName createPassengerDetailsRQSpecialReqDetailsSpecialServiceRQSpecialServiceInfoAdvancePassengerPersonName() {
        return new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.AdvancePassenger.PersonName();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.AdvancePassenger.ResidentDestinationAddress }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.AdvancePassenger.ResidentDestinationAddress createPassengerDetailsRQSpecialReqDetailsSpecialServiceRQSpecialServiceInfoAdvancePassengerResidentDestinationAddress() {
        return new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.AdvancePassenger.ResidentDestinationAddress();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.AdvancePassenger.VendorPrefs.Airline }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.AdvancePassenger.VendorPrefs.Airline createPassengerDetailsRQSpecialReqDetailsSpecialServiceRQSpecialServiceInfoAdvancePassengerVendorPrefsAirline() {
        return new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.AdvancePassenger.VendorPrefs.Airline();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.AdvancePassenger.Document.Visa }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.AdvancePassenger.Document.Visa createPassengerDetailsRQSpecialReqDetailsSpecialServiceRQSpecialServiceInfoAdvancePassengerDocumentVisa() {
        return new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.AdvancePassenger.Document.Visa();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.AirSeatRQ.Seats.Seat }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.AirSeatRQ.Seats.Seat createPassengerDetailsRQSpecialReqDetailsAirSeatRQSeatsSeat() {
        return new PassengerDetailsRQ.SpecialReqDetails.AirSeatRQ.Seats.Seat();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FutureQueuePlaceRemark }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FutureQueuePlaceRemark createPassengerDetailsRQSpecialReqDetailsAddRemarkRQRemarkInfoFutureQueuePlaceRemark() {
        return new PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FutureQueuePlaceRemark();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.Remark }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.Remark createPassengerDetailsRQSpecialReqDetailsAddRemarkRQRemarkInfoRemark() {
        return new PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.Remark();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark.CCInfo.PaymentCard }
     * 
     */
    public PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark.CCInfo.PaymentCard createPassengerDetailsRQSpecialReqDetailsAddRemarkRQRemarkInfoFOPRemarkCCInfoPaymentCard() {
        return new PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark.CCInfo.PaymentCard();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.ProfileRQ.UniqueID }
     * 
     */
    public PassengerDetailsRQ.ProfileRQ.UniqueID createPassengerDetailsRQProfileRQUniqueID() {
        return new PassengerDetailsRQ.ProfileRQ.UniqueID();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.PriceQuoteInfo.Link }
     * 
     */
    public PassengerDetailsRQ.PriceQuoteInfo.Link createPassengerDetailsRQPriceQuoteInfoLink() {
        return new PassengerDetailsRQ.PriceQuoteInfo.Link();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.PreProcessing.UniqueID }
     * 
     */
    public PassengerDetailsRQ.PreProcessing.UniqueID createPassengerDetailsRQPreProcessingUniqueID() {
        return new PassengerDetailsRQ.PreProcessing.UniqueID();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo.QueueIdentifier }
     * 
     */
    public PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo.QueueIdentifier createPassengerDetailsRQPostProcessingQueuePlaceRQQueueInfoQueueIdentifier() {
        return new PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo.QueueIdentifier();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo.UniqueID }
     * 
     */
    public PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo.UniqueID createPassengerDetailsRQPostProcessingQueuePlaceRQQueueInfoUniqueID() {
        return new PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo.UniqueID();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.MultiQueuePlace.QueueIdentifier }
     * 
     */
    public PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.MultiQueuePlace.QueueIdentifier createPassengerDetailsRQPostProcessingQueuePlaceRQMultiQueuePlaceQueueIdentifier() {
        return new PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.MultiQueuePlace.QueueIdentifier();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.Source }
     * 
     */
    public PassengerDetailsRQ.PostProcessing.EndTransactionRQ.Source createPassengerDetailsRQPostProcessingEndTransactionRQSource() {
        return new PassengerDetailsRQ.PostProcessing.EndTransactionRQ.Source();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Invoice }
     * 
     */
    public PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Invoice createPassengerDetailsRQPostProcessingEndTransactionRQEndTransactionEmailInvoice() {
        return new PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Invoice();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.PersonName }
     * 
     */
    public PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.PersonName createPassengerDetailsRQPostProcessingEndTransactionRQEndTransactionEmailPersonName() {
        return new PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.PersonName();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Itinerary.PDF }
     * 
     */
    public PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Itinerary.PDF createPassengerDetailsRQPostProcessingEndTransactionRQEndTransactionEmailItineraryPDF() {
        return new PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Itinerary.PDF();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Itinerary.Segment }
     * 
     */
    public PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Itinerary.Segment createPassengerDetailsRQPostProcessingEndTransactionRQEndTransactionEmailItinerarySegment() {
        return new PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Itinerary.Segment();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.ETicket.PDF }
     * 
     */
    public PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.ETicket.PDF createPassengerDetailsRQPostProcessingEndTransactionRQEndTransactionEmailETicketPDF() {
        return new PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.ETicket.PDF();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.OriginLocation }
     * 
     */
    public PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.OriginLocation createPassengerDetailsRQMiscSegmentSellRQMiscSegmentOriginLocation() {
        return new PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.OriginLocation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs.Airline }
     * 
     */
    public PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs.Airline createPassengerDetailsRQMiscSegmentSellRQMiscSegmentVendorPrefsAirline() {
        return new PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs.Airline();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.VCR.TicketingDocument.ServiceCoupon }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.VCR.TicketingDocument.ServiceCoupon createPassengerDetailsRSTravelItineraryReadRSVCRTicketingDocumentServiceCoupon() {
        return new PassengerDetailsRS.TravelItineraryReadRS.VCR.TicketingDocument.ServiceCoupon();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.OpenReservationElements }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.OpenReservationElements createPassengerDetailsRSTravelItineraryReadRSTravelItineraryOpenReservationElements() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.OpenReservationElements();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.SpecialServiceInfo.Service.Airline }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.SpecialServiceInfo.Service.Airline createPassengerDetailsRSTravelItineraryReadRSTravelItinerarySpecialServiceInfoServiceAirline() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.SpecialServiceInfo.Service.Airline();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.SpecialServiceInfo.Service.PersonName }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.SpecialServiceInfo.Service.PersonName createPassengerDetailsRSTravelItineraryReadRSTravelItinerarySpecialServiceInfoServicePersonName() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.SpecialServiceInfo.Service.PersonName();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.RemarkInfo.Remark.PersonName }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.RemarkInfo.Remark.PersonName createPassengerDetailsRSTravelItineraryReadRSTravelItineraryRemarkInfoRemarkPersonName() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.RemarkInfo.Remark.PersonName();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.QueueInfo.Placement }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.QueueInfo.Placement createPassengerDetailsRSTravelItineraryReadRSTravelItineraryQueueInfoPlacement() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.QueueInfo.Placement();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.PayInfo.PersonName }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.PayInfo.PersonName createPassengerDetailsRSTravelItineraryReadRSTravelItineraryPayInfoPersonName() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.PayInfo.PersonName();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryRef.Source }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryRef.Source createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryRefSource() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryRef.Source();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryRef.TravelPolicy }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryRef.TravelPolicy createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryRefTravelPolicy() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryRef.TravelPolicy();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.Ticketing }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.Ticketing createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoTicketing() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.Ticketing();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Arunk }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Arunk createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemArunk() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Arunk();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.EquivalentPrice }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.EquivalentPrice createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceEquivalentPrice() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.EquivalentPrice();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TTLPrice }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TTLPrice createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceTTLPrice() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TTLPrice();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.OriginalBasePrice }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.OriginalBasePrice createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceOriginalBasePrice() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.OriginalBasePrice();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TicketCouponNumberAssociation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TicketCouponNumberAssociation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceTicketCouponNumberAssociation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TicketCouponNumberAssociation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalOriginalBasePrice }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalOriginalBasePrice createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceTotalOriginalBasePrice() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalOriginalBasePrice();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalEquivalentPrice }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalEquivalentPrice createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceTotalEquivalentPrice() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalEquivalentPrice();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalTTLPrice }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalTTLPrice createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceTotalTTLPrice() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalTTLPrice();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.Segment }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.Segment createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceSegment() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.Segment();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TravelPortions.TravelPortion }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TravelPortions.TravelPortion createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceTravelPortionsTravelPortion() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TravelPortions.TravelPortion();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalTaxes.Tax }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalTaxes.Tax createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceTotalTaxesTax() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.TotalTaxes.Tax();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.Taxes.Tax }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.Taxes.Tax createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAncillariesAncillaryServiceTaxesTax() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Ancillaries.AncillaryService.Taxes.Tax();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.Vendor }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.Vendor createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVendor() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.Vendor();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge.Commission }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge.Commission createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreVehicleChargesVehicleChargeCommission() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge.Commission();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge.Mileage }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge.Mileage createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreVehicleChargesVehicleChargeMileage() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge.Mileage();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge.ChargeDetails.ApproximateTotalCharge }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge.ChargeDetails.ApproximateTotalCharge createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreVehicleChargesVehicleChargeChargeDetailsApproximateTotalCharge() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.VehicleCharges.VehicleCharge.ChargeDetails.ApproximateTotalCharge();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Billing }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Billing createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreRentalRateBilling() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Billing();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Client }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Client createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreRentalRateClient() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Client();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Corporate }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Corporate createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreRentalRateCorporate() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Corporate();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.CustLoyalty }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.CustLoyalty createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreRentalRateCustLoyalty() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.CustLoyalty();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.InvoiceRemarks }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.InvoiceRemarks createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreRentalRateInvoiceRemarks() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.InvoiceRemarks();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Remarks }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Remarks createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreRentalRateRemarks() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Remarks();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.ServiceInformation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.ServiceInformation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreRentalRateServiceInformation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.ServiceInformation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.TourCode }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.TourCode createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreRentalRateTourCode() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.TourCode();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.VehicleTypes }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.VehicleTypes createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreRentalRateVehicleTypes() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.VehicleTypes();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Voucher }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Voucher createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreRentalRateVoucher() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.RentalRate.Voucher();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.PricedEquip.Equipment }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.PricedEquip.Equipment createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCorePricedEquipEquipment() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.PricedEquip.Equipment();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.GuaranteePrepaid.CancellationRefundAmount }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.GuaranteePrepaid.CancellationRefundAmount createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreGuaranteePrepaidCancellationRefundAmount() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.GuaranteePrepaid.CancellationRefundAmount();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo.ContactNumbers.ContactNumber }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo.ContactNumbers.ContactNumber createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreCollectionDeliveryInfoDeliveryInfoContactNumbersContactNumber() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo.ContactNumbers.ContactNumber();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo.Address.StateCountyProv }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo.Address.StateCountyProv createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreCollectionDeliveryInfoDeliveryInfoAddressStateCountyProv() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.DeliveryInfo.Address.StateCountyProv();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo.ContactNumbers.ContactNumber }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo.ContactNumbers.ContactNumber createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreCollectionDeliveryInfoCollectionInfoContactNumbersContactNumber() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo.ContactNumbers.ContactNumber();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo.Address.StateCountyProv }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo.Address.StateCountyProv createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehVendorAvailVehResCoreCollectionDeliveryInfoCollectionInfoAddressStateCountyProv() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehVendorAvail.VehResCore.CollectionDeliveryInfo.CollectionInfo.Address.StateCountyProv();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.DropOffLocationDetails }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.DropOffLocationDetails createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehRentalCoreDropOffLocationDetails() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.DropOffLocationDetails();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.LocationDetails.ContactNumbers.ContactNumber }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.LocationDetails.ContactNumbers.ContactNumber createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehRentalCoreLocationDetailsContactNumbersContactNumber() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.LocationDetails.ContactNumbers.ContactNumber();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.FlightSegment.MarketingAirline }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.FlightSegment.MarketingAirline createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehicleVehRentalCoreFlightSegmentMarketingAirline() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.VehRentalCore.FlightSegment.MarketingAirline();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.POS.Source }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.POS.Source createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemVehiclePOSSource() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Vehicle.POS.Source();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.Duration }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.Duration createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemTourTourDetailsDuration() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.Duration();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.Price }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.Price createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemTourTourDetailsPrice() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.Price();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.ServiceInformation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.ServiceInformation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemTourTourDetailsServiceInformation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.ServiceInformation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.VehicleInformation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.VehicleInformation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemTourTourDetailsVehicleInformation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.VehicleInformation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.HotelInformation.Room }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.HotelInformation.Room createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemTourTourDetailsHotelInformationRoom() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Tour.TourDetails.HotelInformation.Room();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.OriginLocation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.OriginLocation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemSurfaceOriginLocation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.OriginLocation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.Vendor }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.Vendor createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemSurfaceVendor() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.Vendor();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.FlightSegment.DestinationLocation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.FlightSegment.DestinationLocation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemSurfaceFlightSegmentDestinationLocation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.FlightSegment.DestinationLocation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.FlightSegment.MarketingAirline }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.FlightSegment.MarketingAirline createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemSurfaceFlightSegmentMarketingAirline() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.FlightSegment.MarketingAirline();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.FlightSegment.OriginLocation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.FlightSegment.OriginLocation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemSurfaceFlightSegmentOriginLocation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Surface.FlightSegment.OriginLocation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats.Seat.FlightSegment.DestinationLocation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats.Seat.FlightSegment.DestinationLocation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemSeatsSeatFlightSegmentDestinationLocation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats.Seat.FlightSegment.DestinationLocation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats.Seat.FlightSegment.OriginLocation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats.Seat.FlightSegment.OriginLocation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemSeatsSeatFlightSegmentOriginLocation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Seats.Seat.FlightSegment.OriginLocation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.DestinationLocation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.DestinationLocation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemRailDestinationLocation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.DestinationLocation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.OriginLocation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.OriginLocation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemRailOriginLocation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.OriginLocation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.ServiceInformation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.ServiceInformation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemRailServiceInformation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.ServiceInformation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.SNCFInformation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.SNCFInformation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemRailSNCFInformation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.SNCFInformation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.Train }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.Train createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemRailTrain() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.Train();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.Vendor }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.Vendor createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemRailVendor() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Rail.Vendor();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.MiscSegment.OriginLocation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.MiscSegment.OriginLocation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemMiscSegmentOriginLocation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.MiscSegment.OriginLocation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.MiscSegment.Vendor }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.MiscSegment.Vendor createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemMiscSegmentVendor() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.MiscSegment.Vendor();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.Coverage }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.Coverage createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemInsuranceInsuranceDetailsCoverage() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.Coverage();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.DestinationLocation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.DestinationLocation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemInsuranceInsuranceDetailsDestinationLocation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.DestinationLocation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.OriginLocation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.OriginLocation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemInsuranceInsuranceDetailsOriginLocation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.OriginLocation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.Payment }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.Payment createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemInsuranceInsuranceDetailsPayment() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.Payment();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.PersonName }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.PersonName createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemInsuranceInsuranceDetailsPersonName() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.PersonName();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.Vendor }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.Vendor createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemInsuranceInsuranceDetailsVendor() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Insurance.InsuranceDetails.Vendor();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.SpecialPrefs }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.SpecialPrefs createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelSpecialPrefs() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.SpecialPrefs();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.TimeSpan }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.TimeSpan createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelTimeSpan() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.TimeSpan();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Commission }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Commission createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesCommission() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Commission();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.AdditionalGuestAmounts }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.AdditionalGuestAmounts createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateAdditionalGuestAmounts() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.AdditionalGuestAmounts();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.RateAccessCodeBooked }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.RateAccessCodeBooked createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateRateAccessCodeBooked() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.RateAccessCodeBooked();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.ApproximateTotal }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.ApproximateTotal createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelTotalPricingApproximateTotal() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.ApproximateTotal();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.RateChange }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.RateChange createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelTotalPricingRateChange() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.RateChange();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.Disclaimer }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.Disclaimer createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelTotalPricingDisclaimer() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.Disclaimer();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.TotalSurcharge.Surcharge }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.TotalSurcharge.Surcharge createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelTotalPricingTotalSurchargeSurcharge() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.TotalSurcharge.Surcharge();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.TotalTax.Tax }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.TotalTax.Tax createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelTotalPricingTotalTaxTax() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelTotalPricing.TotalTax.Tax();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton.Additionals.Additional }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton.Additionals.Additional createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelRateDescriptonAdditionalsAdditional() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton.Additionals.Additional();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton.RateDescriptions.RateDescription }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton.RateDescriptions.RateDescription createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelRoomRatesRateHotelRateDescriptonRateDescriptionsRateDescription() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.RoomRates.Rate.HotelRateDescripton.RateDescriptions.RateDescription();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.POS.Source }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.POS.Source createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelPOSSource() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.POS.Source();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.Customer.Corporate }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.Customer.Corporate createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelCustomerCorporate() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.Customer.Corporate();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.Customer.CustLoyalty }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.Customer.CustLoyalty createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelCustomerCustLoyalty() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.Customer.CustLoyalty();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.Customer.ID }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.Customer.ID createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelCustomerID() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.Customer.ID();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo.Address }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo.Address createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelBasicPropertyInfoAddress() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo.Address();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo.CancelPenalty }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo.CancelPenalty createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelBasicPropertyInfoCancelPenalty() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo.CancelPenalty();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo.ContactNumbers.ContactNumber }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo.ContactNumbers.ContactNumber createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemHotelBasicPropertyInfoContactNumbersContactNumber() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Hotel.BasicPropertyInfo.ContactNumbers.ContactNumber();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.BSGRecord }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.BSGRecord createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentBSGRecord() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.BSGRecord();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.CheckInAirline }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.CheckInAirline createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentCheckInAirline() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.CheckInAirline();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.CodeshareRecord }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.CodeshareRecord createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentCodeshareRecord() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.CodeshareRecord();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.DestinationLocation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.DestinationLocation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentDestinationLocation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.DestinationLocation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.Equipment }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.Equipment createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentEquipment() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.Equipment();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.MarketingAirline }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.MarketingAirline createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentMarketingAirline() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.MarketingAirline();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.MarketingCodeshareRecord }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.MarketingCodeshareRecord createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentMarketingCodeshareRecord() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.MarketingCodeshareRecord();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.MarriageGrp }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.MarriageGrp createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentMarriageGrp() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.MarriageGrp();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.Meal }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.Meal createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentMeal() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.Meal();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.OperatingAirline }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.OperatingAirline createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentOperatingAirline() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.OperatingAirline();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.OperatingAirlineRecord }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.OperatingAirlineRecord createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentOperatingAirlineRecord() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.OperatingAirlineRecord();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.OriginLocation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.OriginLocation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentOriginLocation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.OriginLocation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.PartnerCarrier }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.PartnerCarrier createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentPartnerCarrier() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.PartnerCarrier();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.SupplierRef }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.SupplierRef createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemFlightSegmentSupplierRef() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.SupplierRef();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise.DestinationLocation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise.DestinationLocation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemCruiseDestinationLocation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise.DestinationLocation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise.OriginLocation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise.OriginLocation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemCruiseOriginLocation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise.OriginLocation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise.ServiceInformation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise.ServiceInformation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemCruiseServiceInformation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise.ServiceInformation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise.Vendor }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise.Vendor createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemCruiseVendor() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.Cruise.Vendor();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.AirTaxi.DestinationLocation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.AirTaxi.DestinationLocation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAirTaxiDestinationLocation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.AirTaxi.DestinationLocation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.AirTaxi.OriginLocation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.AirTaxi.OriginLocation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAirTaxiOriginLocation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.AirTaxi.OriginLocation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.AirTaxi.Vendor }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.AirTaxi.Vendor createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoReservationItemsItemAirTaxiVendor() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.AirTaxi.Vendor();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.FuturePriceInfo }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.FuturePriceInfo createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingFuturePriceInfo() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.FuturePriceInfo();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.BaseFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.BaseFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteTotalsBaseFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.BaseFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.EquivFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.EquivFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteTotalsEquivFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.EquivFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.TotalFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.TotalFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteTotalsTotalFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.TotalFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.Taxes.Tax }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.Taxes.Tax createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteTotalsTaxesTax() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuoteTotals.Taxes.Tax();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.ResponseHeader }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.ResponseHeader createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteResponseHeader() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.ResponseHeader();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.PACInfo.PAC }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.PACInfo.PAC createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePriceQuotePlusPACInfoPAC() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.PACInfo.PAC();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.FuturePricingInfo.FuturePrice }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.FuturePricingInfo.FuturePrice createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePriceQuotePlusFuturePricingInfoFuturePrice() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.FuturePricingInfo.FuturePrice();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.TicketingInstructionsInfo.TicketingInstruction }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.TicketingInstructionsInfo.TicketingInstruction createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePriceQuotePlusTicketingInstructionsInfoTicketingInstruction() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.TicketingInstructionsInfo.TicketingInstruction();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.PassengerInfo.PassengerData }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.PassengerInfo.PassengerData createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePriceQuotePlusPassengerInfoPassengerData() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PriceQuotePlus.PassengerInfo.PassengerData();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.BaseFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.BaseFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoSellingFareDetailsBaseFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.BaseFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.EquivFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.EquivFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoSellingFareDetailsEquivFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.EquivFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.TotalTax }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.TotalTax createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoSellingFareDetailsTotalTax() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.TotalTax();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.TotalFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.TotalFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoSellingFareDetailsTotalFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.TotalFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.Taxes.Tax }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.Taxes.Tax createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoSellingFareDetailsTaxesTax() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.Taxes.Tax();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.Commission.Percent }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.Commission.Percent createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoSellingFareDetailsCommissionPercent() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.SellingFareDetails.Commission.Percent();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.BaseFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.BaseFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoNetFareDetailsBaseFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.BaseFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.EquivFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.EquivFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoNetFareDetailsEquivFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.EquivFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.TotalTax }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.TotalTax createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoNetFareDetailsTotalTax() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.TotalTax();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.TotalFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.TotalFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoNetFareDetailsTotalFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.TotalFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.Taxes.Tax }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.Taxes.Tax createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoNetFareDetailsTaxesTax() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.Taxes.Tax();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.Commission.Percent }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.Commission.Percent createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryNetTicketingInfoNetFareDetailsCommissionPercent() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.NetTicketingInfo.NetFareDetails.Commission.Percent();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PassengerTypeQuantity }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PassengerTypeQuantity createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPassengerTypeQuantity() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PassengerTypeQuantity();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PrivateFareInformation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PrivateFareInformation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPrivateFareInformation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PrivateFareInformation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareBasis }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareBasis createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownFareBasis() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareBasis();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareCalculation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareCalculation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownFareCalculation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareCalculation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.TourCode }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.TourCode createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownTourCode() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.TourCode();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.BaggageAllowance }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.BaggageAllowance createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownFlightSegmentBaggageAllowance() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.BaggageAllowance();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.FareBasis }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.FareBasis createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownFlightSegmentFareBasis() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.FareBasis();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.MarketingAirline }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.MarketingAirline createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownFlightSegmentMarketingAirline() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.MarketingAirline();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.OriginLocation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.OriginLocation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownFlightSegmentOriginLocation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.OriginLocation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.ValidityDates }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.ValidityDates createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownFlightSegmentValidityDates() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment.ValidityDates();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.Endorsements.Endorsement }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.Endorsements.Endorsement createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownEndorsementsEndorsement() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.Endorsements.Endorsement();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.NetRemits.NetRemit }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.NetRemits.NetRemit createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoPTCFareBreakdownNetRemitsNetRemit() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.NetRemits.NetRemit();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaseFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaseFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareBaseFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaseFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.EquivFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.EquivFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareEquivFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.EquivFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.TotalFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.TotalFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareTotalFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.TotalFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.BaseFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.BaseFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareTotalsBaseFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.BaseFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.EquivFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.EquivFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareTotalsEquivFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.EquivFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.TotalFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.TotalFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareTotalsTotalFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.TotalFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.Taxes.Tax }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.Taxes.Tax createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareTotalsTaxesTax() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Totals.Taxes.Tax();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes.Tax }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes.Tax createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareTaxesTax() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes.Tax();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes.TaxBreakdownCode }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes.TaxBreakdownCode createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuotePricedItineraryAirItineraryPricingInfoItinTotalFareTaxesTaxBreakdownCode() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes.TaxBreakdownCode();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.BaggageFees }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.BaggageFees createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationBaggageFees() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.BaggageFees();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.SignatureLine }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.SignatureLine createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationSignatureLine() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.SignatureLine();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.TicketingFees.FeeInformation }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.TicketingFees.FeeInformation createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationTicketingFeesFeeInformation() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.TicketingFees.FeeInformation();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare.BaseFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare.BaseFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationGlobalNetRemitSellingFareBaseFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare.BaseFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare.EquivFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare.EquivFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationGlobalNetRemitSellingFareEquivFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare.EquivFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare.Taxes }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare.Taxes createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationGlobalNetRemitSellingFareTaxes() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare.Taxes();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare.TotalFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare.TotalFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationGlobalNetRemitSellingFareTotalFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.SellingFare.TotalFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare.BaseFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare.BaseFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationGlobalNetRemitNetFareBaseFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare.BaseFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare.EquivFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare.EquivFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationGlobalNetRemitNetFareEquivFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare.EquivFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare.Taxes }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare.Taxes createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationGlobalNetRemitNetFareTaxes() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare.Taxes();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare.TotalFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare.TotalFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryItineraryInfoItineraryPricingPriceQuoteMiscInformationGlobalNetRemitNetFareTotalFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.GlobalNetRemit.NetFare.TotalFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.FileInfo.File }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.FileInfo.File createPassengerDetailsRSTravelItineraryReadRSTravelItineraryFileInfoFile() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.FileInfo.File();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.CustLoyalty }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.CustLoyalty createPassengerDetailsRSTravelItineraryReadRSTravelItineraryCustomerInfoCustLoyalty() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.CustLoyalty();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.Passport }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.Passport createPassengerDetailsRSTravelItineraryReadRSTravelItineraryCustomerInfoPassport() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.Passport();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.Email }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.Email createPassengerDetailsRSTravelItineraryReadRSTravelItineraryCustomerInfoPersonNameEmail() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.Email();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.ProfileIndex }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.ProfileIndex createPassengerDetailsRSTravelItineraryReadRSTravelItineraryCustomerInfoPersonNameProfileIndex() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.ProfileIndex();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.GroupInfo.AssociatedReferenceInformation.AssociatedPNRSummaries.AssociatedPNRSummary }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.GroupInfo.AssociatedReferenceInformation.AssociatedPNRSummaries.AssociatedPNRSummary createPassengerDetailsRSTravelItineraryReadRSTravelItineraryCustomerInfoPersonNameGroupInfoAssociatedReferenceInformationAssociatedPNRSummariesAssociatedPNRSummary() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName.GroupInfo.AssociatedReferenceInformation.AssociatedPNRSummaries.AssociatedPNRSummary();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.Form }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.Form createPassengerDetailsRSTravelItineraryReadRSTravelItineraryCustomerInfoPaymentInfoPaymentForm() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.Form();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo.CardHolderInfo.Address }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo.CardHolderInfo.Address createPassengerDetailsRSTravelItineraryReadRSTravelItineraryCustomerInfoPaymentInfoPaymentCCInfoCardHolderInfoAddress() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo.CardHolderInfo.Address();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo.CardHolderInfo.ContactNumbers.ContactNumber }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo.CardHolderInfo.ContactNumbers.ContactNumber createPassengerDetailsRSTravelItineraryReadRSTravelItineraryCustomerInfoPaymentInfoPaymentCCInfoCardHolderInfoContactNumbersContactNumber() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PaymentInfo.Payment.CCInfo.CardHolderInfo.ContactNumbers.ContactNumber();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.ContactNumbers.ContactNumber.PersonName }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.ContactNumbers.ContactNumber.PersonName createPassengerDetailsRSTravelItineraryReadRSTravelItineraryCustomerInfoContactNumbersContactNumberPersonName() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.ContactNumbers.ContactNumber.PersonName();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.Address.AddressLine }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.Address.AddressLine createPassengerDetailsRSTravelItineraryReadRSTravelItineraryCustomerInfoAddressAddressLine() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.Address.AddressLine();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.AccountVendor }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.AccountVendor createPassengerDetailsRSTravelItineraryReadRSTravelItineraryAccountingInfoAccountVendor() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.AccountVendor();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Airline }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Airline createPassengerDetailsRSTravelItineraryReadRSTravelItineraryAccountingInfoAirline() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Airline();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.BaseFare }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.BaseFare createPassengerDetailsRSTravelItineraryReadRSTravelItineraryAccountingInfoBaseFare() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.BaseFare();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PersonName }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PersonName createPassengerDetailsRSTravelItineraryReadRSTravelItineraryAccountingInfoPersonName() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PersonName();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.TicketingInfo.ETicket }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.TicketingInfo.ETicket createPassengerDetailsRSTravelItineraryReadRSTravelItineraryAccountingInfoTicketingInfoETicket() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.TicketingInfo.ETicket();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.TicketingInfo.Exchange }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.TicketingInfo.Exchange createPassengerDetailsRSTravelItineraryReadRSTravelItineraryAccountingInfoTicketingInfoExchange() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.TicketingInfo.Exchange();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.TicketingInfo.Ticketing }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.TicketingInfo.Ticketing createPassengerDetailsRSTravelItineraryReadRSTravelItineraryAccountingInfoTicketingInfoTicketing() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.TicketingInfo.Ticketing();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Taxes.GST }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Taxes.GST createPassengerDetailsRSTravelItineraryReadRSTravelItineraryAccountingInfoTaxesGST() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Taxes.GST();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Taxes.QST }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Taxes.QST createPassengerDetailsRSTravelItineraryReadRSTravelItineraryAccountingInfoTaxesQST() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Taxes.QST();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Taxes.Tax }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Taxes.Tax createPassengerDetailsRSTravelItineraryReadRSTravelItineraryAccountingInfoTaxesTax() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.Taxes.Tax();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo.Commission }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo.Commission createPassengerDetailsRSTravelItineraryReadRSTravelItineraryAccountingInfoPaymentInfoCommission() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo.Commission();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo.Payment.CCInfo.PaymentCard }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo.Payment.CCInfo.PaymentCard createPassengerDetailsRSTravelItineraryReadRSTravelItineraryAccountingInfoPaymentInfoPaymentCCInfoPaymentCard() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.PaymentInfo.Payment.CCInfo.PaymentCard();
    }

    /**
     * Create an instance of {@link PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.DocumentInfo.Document }
     * 
     */
    public PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.DocumentInfo.Document createPassengerDetailsRSTravelItineraryReadRSTravelItineraryAccountingInfoDocumentInfoDocument() {
        return new PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.AccountingInfo.DocumentInfo.Document();
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

}
