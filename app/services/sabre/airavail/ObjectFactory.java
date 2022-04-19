
package services.sabre.airavail;

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
 * generated in the client package. 
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
    private final static QName _Action_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "Action");
    private final static QName _Fault_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Fault");
    private final static QName _ProblemInformation_QNAME = new QName("http://services.service.sabre.com/STL/v01", "ProblemInformation");
    private final static QName _KeyInfo_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyInfo");
    private final static QName _Timestamp_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "Timestamp");
    private final static QName _ResultSummary_QNAME = new QName("http://services.service.sabre.com/STL_Header/v120", "ResultSummary");
    private final static QName _Service_QNAME = new QName("http://services.service.sabre.com/STL_Header/v120", "Service");
    private final static QName _RefToMessageId_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "RefToMessageId");
    private final static QName _ApplicationResults_QNAME = new QName("http://services.service.sabre.com/STL/v01", "ApplicationResults");
    private final static QName _DuplicateElimination_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "DuplicateElimination");
    private final static QName _SignatureProperty_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureProperty");
    private final static QName _RSAKeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "RSAKeyValue");
    private final static QName _SignatureMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureMethod");
    private final static QName _Object_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Object");
    private final static QName _Identification_QNAME = new QName("http://services.service.sabre.com/STL_Header/v120", "Identification");
    private final static QName _PGPData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "PGPData");
    private final static QName _RetrievalMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "RetrievalMethod");
    private final static QName _DSAKeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DSAKeyValue");
    private final static QName _CPAId_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "CPAId");
    private final static QName _Header_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Header");
    private final static QName _Diagnostics_QNAME = new QName("http://services.service.sabre.com/STL_Header/v120", "Diagnostics");
    private final static QName _MessageId_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "MessageId");
    private final static QName _Results_QNAME = new QName("http://services.service.sabre.com/STL/v01", "Results");
    private final static QName _SPKIData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SPKIData");
    private final static QName _Envelope_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Envelope");
    private final static QName _SignatureValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureValue");
    private final static QName _SabreHeader_QNAME = new QName("http://services.service.sabre.com/STL_Header/v120", "SabreHeader");
    private final static QName _KeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyValue");
    private final static QName _Body_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Body");
    private final static QName _Transforms_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Transforms");
    private final static QName _DigestMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestMethod");
    private final static QName _SequenceNumber_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "SequenceNumber");
    private final static QName _Traces_QNAME = new QName("http://services.service.sabre.com/STL_Header/v120", "Traces");
    private final static QName _X509Data_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509Data");
    private final static QName _TimeToLive_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "TimeToLive");
    private final static QName _KeyName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyName");
    private final static QName _Signature_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
    private final static QName _Timeout_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "Timeout");
    private final static QName _MgmtData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "MgmtData");
    private final static QName _SignatureProperties_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureProperties");
    private final static QName _Transform_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Transform");
    private final static QName _Security_QNAME = new QName("http://services.service.sabre.com/STL_Header/v120", "Security");
    private final static QName _Reference_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Reference");
    private final static QName _DigestValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestValue");
    private final static QName _STLPayload_QNAME = new QName("http://services.service.sabre.com/STL/v01", "STL_Payload");
    private final static QName _CanonicalizationMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "CanonicalizationMethod");
    private final static QName _SignedInfo_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignedInfo");
    private final static QName _Manifest_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Manifest");
    private final static QName _SPKIDataTypeSPKISexp_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SPKISexp");
    private final static QName _TransformTypeXPath_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "XPath");
    private final static QName _X509DataTypeX509IssuerSerial_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509IssuerSerial");
    private final static QName _X509DataTypeX509CRL_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509CRL");
    private final static QName _X509DataTypeX509SubjectName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SubjectName");
    private final static QName _X509DataTypeX509SKI_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SKI");
    private final static QName _X509DataTypeX509Certificate_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509Certificate");
    private final static QName _SignatureMethodTypeHMACOutputLength_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "HMACOutputLength");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OTAAirAvailRS }
     * 
     */
    public OTAAirAvailRS createOTAAirAvailRS() {
        return new OTAAirAvailRS();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ }
     * 
     */
    public OTAAirAvailRQ createOTAAirAvailRQ() {
        return new OTAAirAvailRQ();
    }

    /**
     * Create an instance of {@link Security2 }
     * 
     */
    public Security2 createSecurity2() {
        return new Security2();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OriginDestinationInformation }
     * 
     */
    public OTAAirAvailRQ.OriginDestinationInformation createOTAAirAvailRQOriginDestinationInformation() {
        return new OTAAirAvailRQ.OriginDestinationInformation();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OriginDestinationInformation.FlightSegment }
     * 
     */
    public OTAAirAvailRQ.OriginDestinationInformation.FlightSegment createOTAAirAvailRQOriginDestinationInformationFlightSegment() {
        return new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations }
     * 
     */
    public OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations createOTAAirAvailRQOriginDestinationInformationFlightSegmentConnectionLocations() {
        return new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.ConnectionLocation }
     * 
     */
    public OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.ConnectionLocation createOTAAirAvailRQOriginDestinationInformationFlightSegmentConnectionLocationsConnectionLocation() {
        return new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.ConnectionLocation();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay }
     * 
     */
    public OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay createOTAAirAvailRQOriginDestinationInformationFlightSegmentConnectionLocationsCarrierSpecificDisplay() {
        return new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegTwo }
     * 
     */
    public OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegTwo createOTAAirAvailRQOriginDestinationInformationFlightSegmentConnectionLocationsCarrierSpecificDisplayLegTwo() {
        return new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegTwo();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegTwo.VendorPrefs }
     * 
     */
    public OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegTwo.VendorPrefs createOTAAirAvailRQOriginDestinationInformationFlightSegmentConnectionLocationsCarrierSpecificDisplayLegTwoVendorPrefs() {
        return new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegTwo.VendorPrefs();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegThree }
     * 
     */
    public OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegThree createOTAAirAvailRQOriginDestinationInformationFlightSegmentConnectionLocationsCarrierSpecificDisplayLegThree() {
        return new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegThree();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegThree.VendorPrefs }
     * 
     */
    public OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegThree.VendorPrefs createOTAAirAvailRQOriginDestinationInformationFlightSegmentConnectionLocationsCarrierSpecificDisplayLegThreeVendorPrefs() {
        return new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegThree.VendorPrefs();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegOne }
     * 
     */
    public OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegOne createOTAAirAvailRQOriginDestinationInformationFlightSegmentConnectionLocationsCarrierSpecificDisplayLegOne() {
        return new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegOne();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegOne.VendorPrefs }
     * 
     */
    public OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegOne.VendorPrefs createOTAAirAvailRQOriginDestinationInformationFlightSegmentConnectionLocationsCarrierSpecificDisplayLegOneVendorPrefs() {
        return new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegOne.VendorPrefs();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OptionalQualifiers }
     * 
     */
    public OTAAirAvailRQ.OptionalQualifiers createOTAAirAvailRQOptionalQualifiers() {
        return new OTAAirAvailRQ.OptionalQualifiers();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OptionalQualifiers.TimeQualifiers }
     * 
     */
    public OTAAirAvailRQ.OptionalQualifiers.TimeQualifiers createOTAAirAvailRQOptionalQualifiersTimeQualifiers() {
        return new OTAAirAvailRQ.OptionalQualifiers.TimeQualifiers();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OptionalQualifiers.FlightQualifiers }
     * 
     */
    public OTAAirAvailRQ.OptionalQualifiers.FlightQualifiers createOTAAirAvailRQOptionalQualifiersFlightQualifiers() {
        return new OTAAirAvailRQ.OptionalQualifiers.FlightQualifiers();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OptionalQualifiers.FlightQualifiers.VendorPrefs }
     * 
     */
    public OTAAirAvailRQ.OptionalQualifiers.FlightQualifiers.VendorPrefs createOTAAirAvailRQOptionalQualifiersFlightQualifiersVendorPrefs() {
        return new OTAAirAvailRQ.OptionalQualifiers.FlightQualifiers.VendorPrefs();
    }

    /**
     * Create an instance of {@link OTAAirAvailRS.OriginDestinationOptions }
     * 
     */
    public OTAAirAvailRS.OriginDestinationOptions createOTAAirAvailRSOriginDestinationOptions() {
        return new OTAAirAvailRS.OriginDestinationOptions();
    }

    /**
     * Create an instance of {@link OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption }
     * 
     */
    public OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption createOTAAirAvailRSOriginDestinationOptionsOriginDestinationOption() {
        return new OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption();
    }

    /**
     * Create an instance of {@link OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment }
     * 
     */
    public OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment createOTAAirAvailRSOriginDestinationOptionsOriginDestinationOptionFlightSegment() {
        return new OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment();
    }

    /**
     * Create an instance of {@link OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.DaysOfOperation }
     * 
     */
    public OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.DaysOfOperation createOTAAirAvailRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentDaysOfOperation() {
        return new OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.DaysOfOperation();
    }

    /**
     * Create an instance of {@link OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.DaysOfOperation.OperationSchedule }
     * 
     */
    public OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.DaysOfOperation.OperationSchedule createOTAAirAvailRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentDaysOfOperationOperationSchedule() {
        return new OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.DaysOfOperation.OperationSchedule();
    }

    /**
     * Create an instance of {@link OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.DaysOfOperation.OperationSchedule.OperationTimes }
     * 
     */
    public OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.DaysOfOperation.OperationSchedule.OperationTimes createOTAAirAvailRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentDaysOfOperationOperationScheduleOperationTimes() {
        return new OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.DaysOfOperation.OperationSchedule.OperationTimes();
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
     * Create an instance of {@link ProblemInformation }
     * 
     */
    public ProblemInformation createProblemInformation() {
        return new ProblemInformation();
    }

    /**
     * Create an instance of {@link STLPayload }
     * 
     */
    public STLPayload createSTLPayload() {
        return new STLPayload();
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
     * Create an instance of {@link Diagnostics }
     * 
     */
    public Diagnostics createDiagnostics() {
        return new Diagnostics();
    }

    /**
     * Create an instance of {@link Traces }
     * 
     */
    public Traces createTraces() {
        return new Traces();
    }

    /**
     * Create an instance of {@link SabreHeader }
     * 
     */
    public SabreHeader createSabreHeader() {
        return new SabreHeader();
    }

    /**
     * Create an instance of {@link ResultSummary }
     * 
     */
    public ResultSummary createResultSummary() {
        return new ResultSummary();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link Identification }
     * 
     */
    public Identification createIdentification() {
        return new Identification();
    }

    /**
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link MessageCondition }
     * 
     */
    public MessageCondition createMessageCondition() {
        return new MessageCondition();
    }

    /**
     * Create an instance of {@link TrackingID }
     * 
     */
    public TrackingID createTrackingID() {
        return new TrackingID();
    }

    /**
     * Create an instance of {@link ProblemSummary }
     * 
     */
    public ProblemSummary createProblemSummary() {
        return new ProblemSummary();
    }

    /**
     * Create an instance of {@link TraceRecord }
     * 
     */
    public TraceRecord createTraceRecord() {
        return new TraceRecord();
    }

    /**
     * Create an instance of {@link ProblemBase }
     * 
     */
    public ProblemBase createProblemBase() {
        return new ProblemBase();
    }

    /**
     * Create an instance of {@link DiagnosticResults }
     * 
     */
    public DiagnosticResults createDiagnosticResults() {
        return new DiagnosticResults();
    }

    /**
     * Create an instance of {@link IdentifierSystem }
     * 
     */
    public IdentifierSystem createIdentifierSystem() {
        return new IdentifierSystem();
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
     * Create an instance of {@link Service2 }
     * 
     */
    public Service2 createService2() {
        return new Service2();
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
     * Create an instance of {@link Security2 .UsernameToken }
     * 
     */
    public Security2 .UsernameToken createSecurity2UsernameToken() {
        return new Security2 .UsernameToken();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.DestinationLocation }
     * 
     */
    public OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.DestinationLocation createOTAAirAvailRQOriginDestinationInformationFlightSegmentDestinationLocation() {
        return new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.DestinationLocation();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.OriginLocation }
     * 
     */
    public OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.OriginLocation createOTAAirAvailRQOriginDestinationInformationFlightSegmentOriginLocation() {
        return new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.OriginLocation();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.ConnectionLocation.ConnectTimeOverrides }
     * 
     */
    public OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.ConnectionLocation.ConnectTimeOverrides createOTAAirAvailRQOriginDestinationInformationFlightSegmentConnectionLocationsConnectionLocationConnectTimeOverrides() {
        return new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.ConnectionLocation.ConnectTimeOverrides();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegTwo.VendorPrefs.Airline }
     * 
     */
    public OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegTwo.VendorPrefs.Airline createOTAAirAvailRQOriginDestinationInformationFlightSegmentConnectionLocationsCarrierSpecificDisplayLegTwoVendorPrefsAirline() {
        return new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegTwo.VendorPrefs.Airline();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegThree.VendorPrefs.Airline }
     * 
     */
    public OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegThree.VendorPrefs.Airline createOTAAirAvailRQOriginDestinationInformationFlightSegmentConnectionLocationsCarrierSpecificDisplayLegThreeVendorPrefsAirline() {
        return new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegThree.VendorPrefs.Airline();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegOne.VendorPrefs.Airline }
     * 
     */
    public OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegOne.VendorPrefs.Airline createOTAAirAvailRQOriginDestinationInformationFlightSegmentConnectionLocationsCarrierSpecificDisplayLegOneVendorPrefsAirline() {
        return new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegOne.VendorPrefs.Airline();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OptionalQualifiers.AdditionalAvailability }
     * 
     */
    public OTAAirAvailRQ.OptionalQualifiers.AdditionalAvailability createOTAAirAvailRQOptionalQualifiersAdditionalAvailability() {
        return new OTAAirAvailRQ.OptionalQualifiers.AdditionalAvailability();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OptionalQualifiers.TimeQualifiers.ArrivalTime }
     * 
     */
    public OTAAirAvailRQ.OptionalQualifiers.TimeQualifiers.ArrivalTime createOTAAirAvailRQOptionalQualifiersTimeQualifiersArrivalTime() {
        return new OTAAirAvailRQ.OptionalQualifiers.TimeQualifiers.ArrivalTime();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OptionalQualifiers.TimeQualifiers.DepartureTime }
     * 
     */
    public OTAAirAvailRQ.OptionalQualifiers.TimeQualifiers.DepartureTime createOTAAirAvailRQOptionalQualifiersTimeQualifiersDepartureTime() {
        return new OTAAirAvailRQ.OptionalQualifiers.TimeQualifiers.DepartureTime();
    }

    /**
     * Create an instance of {@link OTAAirAvailRQ.OptionalQualifiers.FlightQualifiers.VendorPrefs.Airline }
     * 
     */
    public OTAAirAvailRQ.OptionalQualifiers.FlightQualifiers.VendorPrefs.Airline createOTAAirAvailRQOptionalQualifiersFlightQualifiersVendorPrefsAirline() {
        return new OTAAirAvailRQ.OptionalQualifiers.FlightQualifiers.VendorPrefs.Airline();
    }

    /**
     * Create an instance of {@link OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.BookingClassAvail }
     * 
     */
    public OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.BookingClassAvail createOTAAirAvailRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentBookingClassAvail() {
        return new OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.BookingClassAvail();
    }

    /**
     * Create an instance of {@link OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.DestinationLocation }
     * 
     */
    public OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.DestinationLocation createOTAAirAvailRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentDestinationLocation() {
        return new OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.DestinationLocation();
    }

    /**
     * Create an instance of {@link OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.DisclosureAirline }
     * 
     */
    public OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.DisclosureAirline createOTAAirAvailRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentDisclosureAirline() {
        return new OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.DisclosureAirline();
    }

    /**
     * Create an instance of {@link OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.Equipment }
     * 
     */
    public OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.Equipment createOTAAirAvailRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentEquipment() {
        return new OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.Equipment();
    }

    /**
     * Create an instance of {@link OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.FlightDetails }
     * 
     */
    public OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.FlightDetails createOTAAirAvailRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentFlightDetails() {
        return new OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.FlightDetails();
    }

    /**
     * Create an instance of {@link OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.MarketingAirline }
     * 
     */
    public OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.MarketingAirline createOTAAirAvailRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentMarketingAirline() {
        return new OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.MarketingAirline();
    }

    /**
     * Create an instance of {@link OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.Meal }
     * 
     */
    public OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.Meal createOTAAirAvailRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentMeal() {
        return new OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.Meal();
    }

    /**
     * Create an instance of {@link OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.OperatingAirline }
     * 
     */
    public OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.OperatingAirline createOTAAirAvailRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentOperatingAirline() {
        return new OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.OperatingAirline();
    }

    /**
     * Create an instance of {@link OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.OriginLocation }
     * 
     */
    public OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.OriginLocation createOTAAirAvailRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentOriginLocation() {
        return new OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.OriginLocation();
    }

    /**
     * Create an instance of {@link OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.DaysOfOperation.OperationSchedule.OperationTimes.OperationTime }
     * 
     */
    public OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.DaysOfOperation.OperationSchedule.OperationTimes.OperationTime createOTAAirAvailRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentDaysOfOperationOperationScheduleOperationTimesOperationTime() {
        return new OTAAirAvailRS.OriginDestinationOptions.OriginDestinationOption.FlightSegment.DaysOfOperation.OperationSchedule.OperationTimes.OperationTime();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebxml.org/namespaces/messageHeader", name = "Action")
    public JAXBElement<String> createAction(String value) {
        return new JAXBElement<String>(_Action_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ProblemInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.sabre.com/STL/v01", name = "ProblemInformation")
    public JAXBElement<ProblemInformation> createProblemInformation(ProblemInformation value) {
        return new JAXBElement<ProblemInformation>(_ProblemInformation_QNAME, ProblemInformation.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebxml.org/namespaces/messageHeader", name = "Timestamp")
    public JAXBElement<String> createTimestamp(String value) {
        return new JAXBElement<String>(_Timestamp_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.sabre.com/STL_Header/v120", name = "ResultSummary")
    public JAXBElement<ResultSummary> createResultSummary(ResultSummary value) {
        return new JAXBElement<ResultSummary>(_ResultSummary_QNAME, ResultSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Service }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.sabre.com/STL_Header/v120", name = "Service")
    public JAXBElement<Service> createService(Service value) {
        return new JAXBElement<Service>(_Service_QNAME, Service.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.sabre.com/STL/v01", name = "ApplicationResults", substitutionHeadNamespace = "http://services.service.sabre.com/STL/v01", substitutionHeadName = "Results")
    public JAXBElement<ApplicationResults> createApplicationResults(ApplicationResults value) {
        return new JAXBElement<ApplicationResults>(_ApplicationResults_QNAME, ApplicationResults.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SignaturePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureProperty")
    public JAXBElement<SignaturePropertyType> createSignatureProperty(SignaturePropertyType value) {
        return new JAXBElement<SignaturePropertyType>(_SignatureProperty_QNAME, SignaturePropertyType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Identification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.sabre.com/STL_Header/v120", name = "Identification")
    public JAXBElement<Identification> createIdentification(Identification value) {
        return new JAXBElement<Identification>(_Identification_QNAME, Identification.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebxml.org/namespaces/messageHeader", name = "CPAId")
    public JAXBElement<String> createCPAId(String value) {
        return new JAXBElement<String>(_CPAId_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Diagnostics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.sabre.com/STL_Header/v120", name = "Diagnostics")
    public JAXBElement<Diagnostics> createDiagnostics(Diagnostics value) {
        return new JAXBElement<Diagnostics>(_Diagnostics_QNAME, Diagnostics.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Results }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.sabre.com/STL/v01", name = "Results")
    public JAXBElement<Results> createResults(Results value) {
        return new JAXBElement<Results>(_Results_QNAME, Results.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Envelope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Envelope")
    public JAXBElement<Envelope> createEnvelope(Envelope value) {
        return new JAXBElement<Envelope>(_Envelope_QNAME, Envelope.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SabreHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.sabre.com/STL_Header/v120", name = "SabreHeader")
    public JAXBElement<SabreHeader> createSabreHeader(SabreHeader value) {
        return new JAXBElement<SabreHeader>(_SabreHeader_QNAME, SabreHeader.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Traces }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.sabre.com/STL_Header/v120", name = "Traces")
    public JAXBElement<Traces> createTraces(Traces value) {
        return new JAXBElement<Traces>(_Traces_QNAME, Traces.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Security }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.sabre.com/STL_Header/v120", name = "Security")
    public JAXBElement<Security> createSecurity(Security value) {
        return new JAXBElement<Security>(_Security_QNAME, Security.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DigestValue")
    public JAXBElement<byte[]> createDigestValue(byte[] value) {
        return new JAXBElement<byte[]>(_DigestValue_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link STLPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.sabre.com/STL/v01", name = "STL_Payload")
    public JAXBElement<STLPayload> createSTLPayload(STLPayload value) {
        return new JAXBElement<STLPayload>(_STLPayload_QNAME, STLPayload.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SignedInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignedInfo")
    public JAXBElement<SignedInfoType> createSignedInfo(SignedInfoType value) {
        return new JAXBElement<SignedInfoType>(_SignedInfo_QNAME, SignedInfoType.class, null, value);
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
