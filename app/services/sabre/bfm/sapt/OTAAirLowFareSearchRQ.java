
package services.sabre.bfm.sapt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POS" type="{http://www.opentravel.org/OTA/2003/05}POS_Type"/>
 *         &lt;sequence>
 *           &lt;element name="OriginDestinationInformation" maxOccurs="10" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OriginDestinationInformationType">
 *                   &lt;sequence>
 *                     &lt;element name="TPA_Extensions" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="Flight" type="{http://www.opentravel.org/OTA/2003/05}OriginDestinationFlightType" maxOccurs="unbounded" minOccurs="0"/>
 *                               &lt;element name="Routing" type="{http://www.opentravel.org/OTA/2003/05}RoutingDefinitionType" maxOccurs="unbounded" minOccurs="0"/>
 *                               &lt;group ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationInformationTPA_ExtensionsGroup"/>
 *                               &lt;element name="IncludeVendorPref" type="{http://www.opentravel.org/OTA/2003/05}IncludeVendorPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *                               &lt;element name="IncludeAlliancePref" type="{http://www.opentravel.org/OTA/2003/05}AllianceType" maxOccurs="unbounded" minOccurs="0"/>
 *                               &lt;element name="DepartureDays" type="{http://www.opentravel.org/OTA/2003/05}DepartureDaysType" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                   &lt;attribute name="Fixed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                   &lt;attribute name="FullDiversity" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="TravelPreferences" type="{http://www.opentravel.org/OTA/2003/05}AirSearchPrefsType" minOccurs="0"/>
 *           &lt;element name="TravelerInfoSummary" type="{http://www.opentravel.org/OTA/2003/05}TravelerInfoSummaryType"/>
 *         &lt;/sequence>
 *         &lt;element name="TPA_Extensions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IntelliSellTransaction" type="{http://www.opentravel.org/OTA/2003/05}TransactionType" minOccurs="0"/>
 *                   &lt;element name="DiversityControl" type="{http://www.opentravel.org/OTA/2003/05}DiversityControlType" minOccurs="0"/>
 *                   &lt;element name="MessagingDetails" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MDRSubset" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;choice>
 *                     &lt;element name="AlternateAirportCities" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="SpecifiedLocation">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="LocationCode">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;pattern value="[A-Z]*"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="AlternateLocation" maxOccurs="5">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="LocationCode">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;pattern value="[A-Z]*"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="AlternateAirportMileage" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                   &lt;element name="SplitTaxes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ByLeg" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="ByFareComponent" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MultiTicket" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="DisplayPolicy">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="SOW"/>
 *                                 &lt;enumeration value="GOW2RT"/>
 *                                 &lt;enumeration value="SCHS"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Partitions" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice maxOccurs="unbounded">
 *                             &lt;element name="Partition" type="{http://www.opentravel.org/OTA/2003/05}CachePartitionType"/>
 *                             &lt;element name="Group" type="{http://www.opentravel.org/OTA/2003/05}CachePartitionGroupType"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ReservationData" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="DKNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AlternatePCC" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TravelPreferences" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="VendorPref" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                                               &lt;attribute name="PreferLevel" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" default="Preferred" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="TPA_Extensions" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="IncludeAlliancePref" type="{http://www.opentravel.org/OTA/2003/05}AllianceType" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="ExcludeAlliancePref" type="{http://www.opentravel.org/OTA/2003/05}AllianceType" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="PseudoCityCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OTA_PayloadStdAttributes"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MaxResponsesGroup"/>
 *       &lt;attribute name="DirectFlightsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AvailableFlightsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="ResponseType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ResponseVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pos",
    "originDestinationInformation",
    "travelPreferences",
    "travelerInfoSummary",
    "tpaExtensions"
})
@XmlRootElement(name = "OTA_AirLowFareSearchRQ")
public class OTAAirLowFareSearchRQ {

    @XmlElement(name = "POS", required = true)
    protected POSType pos;
    @XmlElement(name = "OriginDestinationInformation")
    protected List<OriginDestinationInformation> originDestinationInformation;
    @XmlElement(name = "TravelPreferences")
    protected AirSearchPrefsType travelPreferences;
    @XmlElement(name = "TravelerInfoSummary", required = true)
    protected TravelerInfoSummaryType travelerInfoSummary;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensions tpaExtensions;
    @XmlAttribute(name = "DirectFlightsOnly")
    protected Boolean directFlightsOnly;
    @XmlAttribute(name = "AvailableFlightsOnly")
    protected Boolean availableFlightsOnly;
    @XmlAttribute(name = "ResponseType")
    protected String responseType;
    @XmlAttribute(name = "ResponseVersion")
    protected String responseVersion;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    protected String timeStamp;
    @XmlAttribute(name = "Target")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String target;
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlAttribute(name = "SequenceNmbr")
    protected String sequenceNmbr;
    @XmlAttribute(name = "TransactionStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transactionStatusCode;
    @XmlAttribute(name = "PrimaryLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String primaryLangID;
    @XmlAttribute(name = "AltLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String altLangID;
    @XmlAttribute(name = "MaxResponses")
    protected String maxResponses;

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link POSType }
     *     
     */
    public POSType getPOS() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSType }
     *     
     */
    public void setPOS(POSType value) {
        this.pos = value;
    }

    /**
     * Gets the value of the originDestinationInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestinationInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestinationInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginDestinationInformation }
     * 
     * 
     */
    public List<OriginDestinationInformation> getOriginDestinationInformation() {
        if (originDestinationInformation == null) {
            originDestinationInformation = new ArrayList<OriginDestinationInformation>();
        }
        return this.originDestinationInformation;
    }

    /**
     * Gets the value of the travelPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchPrefsType }
     *     
     */
    public AirSearchPrefsType getTravelPreferences() {
        return travelPreferences;
    }

    /**
     * Sets the value of the travelPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchPrefsType }
     *     
     */
    public void setTravelPreferences(AirSearchPrefsType value) {
        this.travelPreferences = value;
    }

    /**
     * Gets the value of the travelerInfoSummary property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerInfoSummaryType }
     *     
     */
    public TravelerInfoSummaryType getTravelerInfoSummary() {
        return travelerInfoSummary;
    }

    /**
     * Sets the value of the travelerInfoSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerInfoSummaryType }
     *     
     */
    public void setTravelerInfoSummary(TravelerInfoSummaryType value) {
        this.travelerInfoSummary = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensions }
     *     
     */
    public TPAExtensions getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensions }
     *     
     */
    public void setTPAExtensions(TPAExtensions value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the directFlightsOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDirectFlightsOnly() {
        if (directFlightsOnly == null) {
            return false;
        } else {
            return directFlightsOnly;
        }
    }

    /**
     * Sets the value of the directFlightsOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectFlightsOnly(Boolean value) {
        this.directFlightsOnly = value;
    }

    /**
     * Gets the value of the availableFlightsOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAvailableFlightsOnly() {
        if (availableFlightsOnly == null) {
            return true;
        } else {
            return availableFlightsOnly;
        }
    }

    /**
     * Sets the value of the availableFlightsOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailableFlightsOnly(Boolean value) {
        this.availableFlightsOnly = value;
    }

    /**
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseType() {
        return responseType;
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseType(String value) {
        this.responseType = value;
    }

    /**
     * Gets the value of the responseVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseVersion() {
        return responseVersion;
    }

    /**
     * Sets the value of the responseVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseVersion(String value) {
        this.responseVersion = value;
    }

    /**
     * Gets the value of the echoToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoToken() {
        return echoToken;
    }

    /**
     * Sets the value of the echoToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoToken(String value) {
        this.echoToken = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        if (target == null) {
            return "Production";
        } else {
            return target;
        }
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the transactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * Sets the value of the transactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIdentifier(String value) {
        this.transactionIdentifier = value;
    }

    /**
     * Gets the value of the sequenceNmbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNmbr() {
        return sequenceNmbr;
    }

    /**
     * Sets the value of the sequenceNmbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNmbr(String value) {
        this.sequenceNmbr = value;
    }

    /**
     * Gets the value of the transactionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /**
     * Sets the value of the transactionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatusCode(String value) {
        this.transactionStatusCode = value;
    }

    /**
     * Gets the value of the primaryLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /**
     * Sets the value of the primaryLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLangID(String value) {
        this.primaryLangID = value;
    }

    /**
     * Gets the value of the altLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltLangID() {
        return altLangID;
    }

    /**
     * Sets the value of the altLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltLangID(String value) {
        this.altLangID = value;
    }

    /**
     * Gets the value of the maxResponses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxResponses() {
        return maxResponses;
    }

    /**
     * Sets the value of the maxResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxResponses(String value) {
        this.maxResponses = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OriginDestinationInformationType">
     *       &lt;sequence>
     *         &lt;element name="TPA_Extensions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Flight" type="{http://www.opentravel.org/OTA/2003/05}OriginDestinationFlightType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="Routing" type="{http://www.opentravel.org/OTA/2003/05}RoutingDefinitionType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;group ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationInformationTPA_ExtensionsGroup"/>
     *                   &lt;element name="IncludeVendorPref" type="{http://www.opentravel.org/OTA/2003/05}IncludeVendorPrefType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="IncludeAlliancePref" type="{http://www.opentravel.org/OTA/2003/05}AllianceType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="DepartureDays" type="{http://www.opentravel.org/OTA/2003/05}DepartureDaysType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="Fixed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="FullDiversity" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tpaExtensions"
    })
    public static class OriginDestinationInformation
        extends OriginDestinationInformationType
    {

        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensions tpaExtensions;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "Fixed")
        protected Boolean fixed;
        @XmlAttribute(name = "FullDiversity")
        protected Boolean fullDiversity;

        /**
         * Gets the value of the tpaExtensions property.
         * 
         * @return
         *     possible object is
         *     {@link TPAExtensions }
         *     
         */
        public TPAExtensions getTPAExtensions() {
            return tpaExtensions;
        }

        /**
         * Sets the value of the tpaExtensions property.
         * 
         * @param value
         *     allowed object is
         *     {@link TPAExtensions }
         *     
         */
        public void setTPAExtensions(TPAExtensions value) {
            this.tpaExtensions = value;
        }

        /**
         * Gets the value of the rph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * Sets the value of the rph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * Gets the value of the fixed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isFixed() {
            if (fixed == null) {
                return false;
            } else {
                return fixed;
            }
        }

        /**
         * Sets the value of the fixed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFixed(Boolean value) {
            this.fixed = value;
        }

        /**
         * Gets the value of the fullDiversity property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isFullDiversity() {
            if (fullDiversity == null) {
                return false;
            } else {
                return fullDiversity;
            }
        }

        /**
         * Sets the value of the fullDiversity property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFullDiversity(Boolean value) {
            this.fullDiversity = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Flight" type="{http://www.opentravel.org/OTA/2003/05}OriginDestinationFlightType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="Routing" type="{http://www.opentravel.org/OTA/2003/05}RoutingDefinitionType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;group ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationInformationTPA_ExtensionsGroup"/>
         *         &lt;element name="IncludeVendorPref" type="{http://www.opentravel.org/OTA/2003/05}IncludeVendorPrefType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="IncludeAlliancePref" type="{http://www.opentravel.org/OTA/2003/05}AllianceType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="DepartureDays" type="{http://www.opentravel.org/OTA/2003/05}DepartureDaysType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "flight",
            "routing",
            "dateFlexibility",
            "sisterDestinationLocation",
            "sisterDestinationMileage",
            "sisterOriginLocation",
            "sisterOriginMileage",
            "segmentType",
            "alternateTime",
            "maxOneWayOptions",
            "numOneWayOptions",
            "cabinPref",
            "connectionTime",
            "totalTravelTime",
            "includeVendorPref",
            "includeAlliancePref",
            "departureDays"
        })
        public static class TPAExtensions {

            @XmlElement(name = "Flight")
            protected List<OriginDestinationFlightType> flight;
            @XmlElement(name = "Routing")
            protected List<RoutingDefinitionType> routing;
            @XmlElement(name = "DateFlexibility")
            protected List<ExchangeOriginDestinationInformationType.DateFlexibility> dateFlexibility;
            @XmlElement(name = "SisterDestinationLocation")
            protected List<RequestLocationType> sisterDestinationLocation;
            @XmlElement(name = "SisterDestinationMileage")
            protected ExchangeOriginDestinationInformationType.SisterDestinationMileage sisterDestinationMileage;
            @XmlElement(name = "SisterOriginLocation")
            protected List<RequestLocationType> sisterOriginLocation;
            @XmlElement(name = "SisterOriginMileage")
            protected ExchangeOriginDestinationInformationType.SisterOriginMileage sisterOriginMileage;
            @XmlElement(name = "SegmentType")
            protected ExchangeOriginDestinationInformationType.SegmentType segmentType;
            @XmlElement(name = "AlternateTime")
            protected ExchangeOriginDestinationInformationType.AlternateTime alternateTime;
            @XmlElement(name = "MaxOneWayOptions")
            protected ExchangeOriginDestinationInformationType.MaxOneWayOptions maxOneWayOptions;
            @XmlElement(name = "NumOneWayOptions")
            protected ExchangeOriginDestinationInformationType.NumOneWayOptions numOneWayOptions;
            @XmlElement(name = "CabinPref")
            protected CabinPrefType cabinPref;
            @XmlElement(name = "ConnectionTime")
            protected ExchangeOriginDestinationInformationType.ConnectionTime connectionTime;
            @XmlElement(name = "TotalTravelTime")
            protected ExchangeOriginDestinationInformationType.TotalTravelTime totalTravelTime;
            @XmlElement(name = "IncludeVendorPref")
            protected List<IncludeVendorPrefType> includeVendorPref;
            @XmlElement(name = "IncludeAlliancePref")
            protected List<AllianceType> includeAlliancePref;
            @XmlElement(name = "DepartureDays")
            protected DepartureDaysType departureDays;

            /**
             * Gets the value of the flight property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flight property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFlight().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OriginDestinationFlightType }
             * 
             * 
             */
            public List<OriginDestinationFlightType> getFlight() {
                if (flight == null) {
                    flight = new ArrayList<OriginDestinationFlightType>();
                }
                return this.flight;
            }

            /**
             * Gets the value of the routing property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the routing property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRouting().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RoutingDefinitionType }
             * 
             * 
             */
            public List<RoutingDefinitionType> getRouting() {
                if (routing == null) {
                    routing = new ArrayList<RoutingDefinitionType>();
                }
                return this.routing;
            }

            /**
             * Gets the value of the dateFlexibility property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the dateFlexibility property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDateFlexibility().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ExchangeOriginDestinationInformationType.DateFlexibility }
             * 
             * 
             */
            public List<ExchangeOriginDestinationInformationType.DateFlexibility> getDateFlexibility() {
                if (dateFlexibility == null) {
                    dateFlexibility = new ArrayList<ExchangeOriginDestinationInformationType.DateFlexibility>();
                }
                return this.dateFlexibility;
            }

            /**
             * Gets the value of the sisterDestinationLocation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the sisterDestinationLocation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSisterDestinationLocation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RequestLocationType }
             * 
             * 
             */
            public List<RequestLocationType> getSisterDestinationLocation() {
                if (sisterDestinationLocation == null) {
                    sisterDestinationLocation = new ArrayList<RequestLocationType>();
                }
                return this.sisterDestinationLocation;
            }

            /**
             * Gets the value of the sisterDestinationMileage property.
             * 
             * @return
             *     possible object is
             *     {@link ExchangeOriginDestinationInformationType.SisterDestinationMileage }
             *     
             */
            public ExchangeOriginDestinationInformationType.SisterDestinationMileage getSisterDestinationMileage() {
                return sisterDestinationMileage;
            }

            /**
             * Sets the value of the sisterDestinationMileage property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExchangeOriginDestinationInformationType.SisterDestinationMileage }
             *     
             */
            public void setSisterDestinationMileage(ExchangeOriginDestinationInformationType.SisterDestinationMileage value) {
                this.sisterDestinationMileage = value;
            }

            /**
             * Gets the value of the sisterOriginLocation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the sisterOriginLocation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSisterOriginLocation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RequestLocationType }
             * 
             * 
             */
            public List<RequestLocationType> getSisterOriginLocation() {
                if (sisterOriginLocation == null) {
                    sisterOriginLocation = new ArrayList<RequestLocationType>();
                }
                return this.sisterOriginLocation;
            }

            /**
             * Gets the value of the sisterOriginMileage property.
             * 
             * @return
             *     possible object is
             *     {@link ExchangeOriginDestinationInformationType.SisterOriginMileage }
             *     
             */
            public ExchangeOriginDestinationInformationType.SisterOriginMileage getSisterOriginMileage() {
                return sisterOriginMileage;
            }

            /**
             * Sets the value of the sisterOriginMileage property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExchangeOriginDestinationInformationType.SisterOriginMileage }
             *     
             */
            public void setSisterOriginMileage(ExchangeOriginDestinationInformationType.SisterOriginMileage value) {
                this.sisterOriginMileage = value;
            }

            /**
             * Gets the value of the segmentType property.
             * 
             * @return
             *     possible object is
             *     {@link ExchangeOriginDestinationInformationType.SegmentType }
             *     
             */
            public ExchangeOriginDestinationInformationType.SegmentType getSegmentType() {
                return segmentType;
            }

            /**
             * Sets the value of the segmentType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExchangeOriginDestinationInformationType.SegmentType }
             *     
             */
            public void setSegmentType(ExchangeOriginDestinationInformationType.SegmentType value) {
                this.segmentType = value;
            }

            /**
             * Gets the value of the alternateTime property.
             * 
             * @return
             *     possible object is
             *     {@link ExchangeOriginDestinationInformationType.AlternateTime }
             *     
             */
            public ExchangeOriginDestinationInformationType.AlternateTime getAlternateTime() {
                return alternateTime;
            }

            /**
             * Sets the value of the alternateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExchangeOriginDestinationInformationType.AlternateTime }
             *     
             */
            public void setAlternateTime(ExchangeOriginDestinationInformationType.AlternateTime value) {
                this.alternateTime = value;
            }

            /**
             * Gets the value of the maxOneWayOptions property.
             * 
             * @return
             *     possible object is
             *     {@link ExchangeOriginDestinationInformationType.MaxOneWayOptions }
             *     
             */
            public ExchangeOriginDestinationInformationType.MaxOneWayOptions getMaxOneWayOptions() {
                return maxOneWayOptions;
            }

            /**
             * Sets the value of the maxOneWayOptions property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExchangeOriginDestinationInformationType.MaxOneWayOptions }
             *     
             */
            public void setMaxOneWayOptions(ExchangeOriginDestinationInformationType.MaxOneWayOptions value) {
                this.maxOneWayOptions = value;
            }

            /**
             * Gets the value of the numOneWayOptions property.
             * 
             * @return
             *     possible object is
             *     {@link ExchangeOriginDestinationInformationType.NumOneWayOptions }
             *     
             */
            public ExchangeOriginDestinationInformationType.NumOneWayOptions getNumOneWayOptions() {
                return numOneWayOptions;
            }

            /**
             * Sets the value of the numOneWayOptions property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExchangeOriginDestinationInformationType.NumOneWayOptions }
             *     
             */
            public void setNumOneWayOptions(ExchangeOriginDestinationInformationType.NumOneWayOptions value) {
                this.numOneWayOptions = value;
            }

            /**
             * Gets the value of the cabinPref property.
             * 
             * @return
             *     possible object is
             *     {@link CabinPrefType }
             *     
             */
            public CabinPrefType getCabinPref() {
                return cabinPref;
            }

            /**
             * Sets the value of the cabinPref property.
             * 
             * @param value
             *     allowed object is
             *     {@link CabinPrefType }
             *     
             */
            public void setCabinPref(CabinPrefType value) {
                this.cabinPref = value;
            }

            /**
             * Gets the value of the connectionTime property.
             * 
             * @return
             *     possible object is
             *     {@link ExchangeOriginDestinationInformationType.ConnectionTime }
             *     
             */
            public ExchangeOriginDestinationInformationType.ConnectionTime getConnectionTime() {
                return connectionTime;
            }

            /**
             * Sets the value of the connectionTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExchangeOriginDestinationInformationType.ConnectionTime }
             *     
             */
            public void setConnectionTime(ExchangeOriginDestinationInformationType.ConnectionTime value) {
                this.connectionTime = value;
            }

            /**
             * Gets the value of the totalTravelTime property.
             * 
             * @return
             *     possible object is
             *     {@link ExchangeOriginDestinationInformationType.TotalTravelTime }
             *     
             */
            public ExchangeOriginDestinationInformationType.TotalTravelTime getTotalTravelTime() {
                return totalTravelTime;
            }

            /**
             * Sets the value of the totalTravelTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExchangeOriginDestinationInformationType.TotalTravelTime }
             *     
             */
            public void setTotalTravelTime(ExchangeOriginDestinationInformationType.TotalTravelTime value) {
                this.totalTravelTime = value;
            }

            /**
             * Gets the value of the includeVendorPref property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the includeVendorPref property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIncludeVendorPref().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IncludeVendorPrefType }
             * 
             * 
             */
            public List<IncludeVendorPrefType> getIncludeVendorPref() {
                if (includeVendorPref == null) {
                    includeVendorPref = new ArrayList<IncludeVendorPrefType>();
                }
                return this.includeVendorPref;
            }

            /**
             * Gets the value of the includeAlliancePref property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the includeAlliancePref property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIncludeAlliancePref().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AllianceType }
             * 
             * 
             */
            public List<AllianceType> getIncludeAlliancePref() {
                if (includeAlliancePref == null) {
                    includeAlliancePref = new ArrayList<AllianceType>();
                }
                return this.includeAlliancePref;
            }

            /**
             * Gets the value of the departureDays property.
             * 
             * @return
             *     possible object is
             *     {@link DepartureDaysType }
             *     
             */
            public DepartureDaysType getDepartureDays() {
                return departureDays;
            }

            /**
             * Sets the value of the departureDays property.
             * 
             * @param value
             *     allowed object is
             *     {@link DepartureDaysType }
             *     
             */
            public void setDepartureDays(DepartureDaysType value) {
                this.departureDays = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="IntelliSellTransaction" type="{http://www.opentravel.org/OTA/2003/05}TransactionType" minOccurs="0"/>
     *         &lt;element name="DiversityControl" type="{http://www.opentravel.org/OTA/2003/05}DiversityControlType" minOccurs="0"/>
     *         &lt;element name="MessagingDetails" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MDRSubset" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;choice>
     *           &lt;element name="AlternateAirportCities" maxOccurs="unbounded" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="SpecifiedLocation">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="LocationCode">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;pattern value="[A-Z]*"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/attribute>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="AlternateLocation" maxOccurs="5">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="LocationCode">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;pattern value="[A-Z]*"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/attribute>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="AlternateAirportMileage" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element name="SplitTaxes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ByLeg" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="ByFareComponent" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MultiTicket" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="DisplayPolicy">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="SOW"/>
     *                       &lt;enumeration value="GOW2RT"/>
     *                       &lt;enumeration value="SCHS"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Partitions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice maxOccurs="unbounded">
     *                   &lt;element name="Partition" type="{http://www.opentravel.org/OTA/2003/05}CachePartitionType"/>
     *                   &lt;element name="Group" type="{http://www.opentravel.org/OTA/2003/05}CachePartitionGroupType"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ReservationData" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="DKNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AlternatePCC" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TravelPreferences" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="VendorPref" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *                                     &lt;attribute name="PreferLevel" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" default="Preferred" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="TPA_Extensions" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="IncludeAlliancePref" type="{http://www.opentravel.org/OTA/2003/05}AllianceType" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="ExcludeAlliancePref" type="{http://www.opentravel.org/OTA/2003/05}AllianceType" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="PseudoCityCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "intelliSellTransaction",
        "diversityControl",
        "messagingDetails",
        "alternateAirportCities",
        "alternateAirportMileage",
        "splitTaxes",
        "multiTicket",
        "partitions",
        "reservationData",
        "alternatePCC"
    })
    public static class TPAExtensions {

        @XmlElement(name = "IntelliSellTransaction")
        protected TransactionType intelliSellTransaction;
        @XmlElement(name = "DiversityControl")
        protected DiversityControlType diversityControl;
        @XmlElement(name = "MessagingDetails")
        protected MessagingDetails messagingDetails;
        @XmlElement(name = "AlternateAirportCities")
        protected List<AlternateAirportCities> alternateAirportCities;
        @XmlElement(name = "AlternateAirportMileage")
        protected AlternateAirportMileage alternateAirportMileage;
        @XmlElement(name = "SplitTaxes")
        protected SplitTaxes splitTaxes;
        @XmlElement(name = "MultiTicket")
        protected MultiTicket multiTicket;
        @XmlElement(name = "Partitions")
        protected Partitions partitions;
        @XmlElement(name = "ReservationData")
        protected ReservationData reservationData;
        @XmlElement(name = "AlternatePCC")
        protected List<AlternatePCC> alternatePCC;

        /**
         * Gets the value of the intelliSellTransaction property.
         * 
         * @return
         *     possible object is
         *     {@link TransactionType }
         *     
         */
        public TransactionType getIntelliSellTransaction() {
            return intelliSellTransaction;
        }

        /**
         * Sets the value of the intelliSellTransaction property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransactionType }
         *     
         */
        public void setIntelliSellTransaction(TransactionType value) {
            this.intelliSellTransaction = value;
        }

        /**
         * Gets the value of the diversityControl property.
         * 
         * @return
         *     possible object is
         *     {@link DiversityControlType }
         *     
         */
        public DiversityControlType getDiversityControl() {
            return diversityControl;
        }

        /**
         * Sets the value of the diversityControl property.
         * 
         * @param value
         *     allowed object is
         *     {@link DiversityControlType }
         *     
         */
        public void setDiversityControl(DiversityControlType value) {
            this.diversityControl = value;
        }

        /**
         * Gets the value of the messagingDetails property.
         * 
         * @return
         *     possible object is
         *     {@link MessagingDetails }
         *     
         */
        public MessagingDetails getMessagingDetails() {
            return messagingDetails;
        }

        /**
         * Sets the value of the messagingDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link MessagingDetails }
         *     
         */
        public void setMessagingDetails(MessagingDetails value) {
            this.messagingDetails = value;
        }

        /**
         * Gets the value of the alternateAirportCities property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alternateAirportCities property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlternateAirportCities().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AlternateAirportCities }
         * 
         * 
         */
        public List<AlternateAirportCities> getAlternateAirportCities() {
            if (alternateAirportCities == null) {
                alternateAirportCities = new ArrayList<AlternateAirportCities>();
            }
            return this.alternateAirportCities;
        }

        /**
         * Gets the value of the alternateAirportMileage property.
         * 
         * @return
         *     possible object is
         *     {@link AlternateAirportMileage }
         *     
         */
        public AlternateAirportMileage getAlternateAirportMileage() {
            return alternateAirportMileage;
        }

        /**
         * Sets the value of the alternateAirportMileage property.
         * 
         * @param value
         *     allowed object is
         *     {@link AlternateAirportMileage }
         *     
         */
        public void setAlternateAirportMileage(AlternateAirportMileage value) {
            this.alternateAirportMileage = value;
        }

        /**
         * Gets the value of the splitTaxes property.
         * 
         * @return
         *     possible object is
         *     {@link SplitTaxes }
         *     
         */
        public SplitTaxes getSplitTaxes() {
            return splitTaxes;
        }

        /**
         * Sets the value of the splitTaxes property.
         * 
         * @param value
         *     allowed object is
         *     {@link SplitTaxes }
         *     
         */
        public void setSplitTaxes(SplitTaxes value) {
            this.splitTaxes = value;
        }

        /**
         * Gets the value of the multiTicket property.
         * 
         * @return
         *     possible object is
         *     {@link MultiTicket }
         *     
         */
        public MultiTicket getMultiTicket() {
            return multiTicket;
        }

        /**
         * Sets the value of the multiTicket property.
         * 
         * @param value
         *     allowed object is
         *     {@link MultiTicket }
         *     
         */
        public void setMultiTicket(MultiTicket value) {
            this.multiTicket = value;
        }

        /**
         * Gets the value of the partitions property.
         * 
         * @return
         *     possible object is
         *     {@link Partitions }
         *     
         */
        public Partitions getPartitions() {
            return partitions;
        }

        /**
         * Sets the value of the partitions property.
         * 
         * @param value
         *     allowed object is
         *     {@link Partitions }
         *     
         */
        public void setPartitions(Partitions value) {
            this.partitions = value;
        }

        /**
         * Gets the value of the reservationData property.
         * 
         * @return
         *     possible object is
         *     {@link ReservationData }
         *     
         */
        public ReservationData getReservationData() {
            return reservationData;
        }

        /**
         * Sets the value of the reservationData property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReservationData }
         *     
         */
        public void setReservationData(ReservationData value) {
            this.reservationData = value;
        }

        /**
         * Gets the value of the alternatePCC property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alternatePCC property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlternatePCC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AlternatePCC }
         * 
         * 
         */
        public List<AlternatePCC> getAlternatePCC() {
            if (alternatePCC == null) {
                alternatePCC = new ArrayList<AlternatePCC>();
            }
            return this.alternatePCC;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="SpecifiedLocation">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="LocationCode">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;pattern value="[A-Z]*"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="AlternateLocation" maxOccurs="5">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="LocationCode">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;pattern value="[A-Z]*"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "specifiedLocation",
            "alternateLocation"
        })
        public static class AlternateAirportCities {

            @XmlElement(name = "SpecifiedLocation", required = true)
            protected SpecifiedLocation specifiedLocation;
            @XmlElement(name = "AlternateLocation", required = true)
            protected List<AlternateLocation> alternateLocation;

            /**
             * Gets the value of the specifiedLocation property.
             * 
             * @return
             *     possible object is
             *     {@link SpecifiedLocation }
             *     
             */
            public SpecifiedLocation getSpecifiedLocation() {
                return specifiedLocation;
            }

            /**
             * Sets the value of the specifiedLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link SpecifiedLocation }
             *     
             */
            public void setSpecifiedLocation(SpecifiedLocation value) {
                this.specifiedLocation = value;
            }

            /**
             * Gets the value of the alternateLocation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the alternateLocation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAlternateLocation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AlternateLocation }
             * 
             * 
             */
            public List<AlternateLocation> getAlternateLocation() {
                if (alternateLocation == null) {
                    alternateLocation = new ArrayList<AlternateLocation>();
                }
                return this.alternateLocation;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="LocationCode">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;pattern value="[A-Z]*"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class AlternateLocation {

                @XmlAttribute(name = "LocationCode")
                protected String locationCode;

                /**
                 * Gets the value of the locationCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLocationCode() {
                    return locationCode;
                }

                /**
                 * Sets the value of the locationCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLocationCode(String value) {
                    this.locationCode = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="LocationCode">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;pattern value="[A-Z]*"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class SpecifiedLocation {

                @XmlAttribute(name = "LocationCode")
                protected String locationCode;

                /**
                 * Gets the value of the locationCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLocationCode() {
                    return locationCode;
                }

                /**
                 * Sets the value of the locationCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLocationCode(String value) {
                    this.locationCode = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AlternateAirportMileage {

            @XmlAttribute(name = "Number", required = true)
            protected String number;

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumber(String value) {
                this.number = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="TravelPreferences" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="VendorPref" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
         *                           &lt;attribute name="PreferLevel" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" default="Preferred" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="TPA_Extensions" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="IncludeAlliancePref" type="{http://www.opentravel.org/OTA/2003/05}AllianceType" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="ExcludeAlliancePref" type="{http://www.opentravel.org/OTA/2003/05}AllianceType" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="PseudoCityCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "travelPreferences"
        })
        public static class AlternatePCC {

            @XmlElement(name = "TravelPreferences")
            protected TravelPreferences travelPreferences;
            @XmlAttribute(name = "PseudoCityCode", required = true)
            protected String pseudoCityCode;

            /**
             * Gets the value of the travelPreferences property.
             * 
             * @return
             *     possible object is
             *     {@link TravelPreferences }
             *     
             */
            public TravelPreferences getTravelPreferences() {
                return travelPreferences;
            }

            /**
             * Sets the value of the travelPreferences property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravelPreferences }
             *     
             */
            public void setTravelPreferences(TravelPreferences value) {
                this.travelPreferences = value;
            }

            /**
             * Gets the value of the pseudoCityCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPseudoCityCode() {
                return pseudoCityCode;
            }

            /**
             * Sets the value of the pseudoCityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPseudoCityCode(String value) {
                this.pseudoCityCode = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="VendorPref" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
             *                 &lt;attribute name="PreferLevel" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" default="Preferred" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="TPA_Extensions" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="IncludeAlliancePref" type="{http://www.opentravel.org/OTA/2003/05}AllianceType" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="ExcludeAlliancePref" type="{http://www.opentravel.org/OTA/2003/05}AllianceType" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "vendorPref",
                "tpaExtensions"
            })
            public static class TravelPreferences {

                @XmlElement(name = "VendorPref")
                protected List<VendorPref> vendorPref;
                @XmlElement(name = "TPA_Extensions")
                protected services.sabre.bfm.sapt.travelpreferences.TPAExtensions tpaExtensions;

                /**
                 * Gets the value of the vendorPref property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the vendorPref property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getVendorPref().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link VendorPref }
                 * 
                 * 
                 */
                public List<VendorPref> getVendorPref() {
                    if (vendorPref == null) {
                        vendorPref = new ArrayList<VendorPref>();
                    }
                    return this.vendorPref;
                }

                /**
                 * Gets the value of the tpaExtensions property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TPAExtensions }
                 *     
                 */
                public services.sabre.bfm.sapt.travelpreferences.TPAExtensions getTPAExtensions() {
                    return tpaExtensions;
                }

                /**
                 * Sets the value of the tpaExtensions property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TPAExtensions }
                 *     
                 */
                public void setTPAExtensions(services.sabre.bfm.sapt.travelpreferences.TPAExtensions value) {
                    this.tpaExtensions = value;
                }

                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
                 *       &lt;attribute name="PreferLevel" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" default="Preferred" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class VendorPref {

                    @XmlAttribute(name = "Code", required = true)
                    protected String code;
                    @XmlAttribute(name = "PreferLevel")
                    protected PreferLevelType preferLevel;

                    /**
                     * Gets the value of the code property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCode() {
                        return code;
                    }

                    /**
                     * Sets the value of the code property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCode(String value) {
                        this.code = value;
                    }

                    /**
                     * Gets the value of the preferLevel property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PreferLevelType }
                     *     
                     */
                    public PreferLevelType getPreferLevel() {
                        if (preferLevel == null) {
                            return PreferLevelType.PREFERRED;
                        } else {
                            return preferLevel;
                        }
                    }

                    /**
                     * Sets the value of the preferLevel property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PreferLevelType }
                     *     
                     */
                    public void setPreferLevel(PreferLevelType value) {
                        this.preferLevel = value;
                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="MDRSubset" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "mdrSubset"
        })
        public static class MessagingDetails {

            @XmlElement(name = "MDRSubset")
            protected MDRSubset mdrSubset;

            /**
             * Gets the value of the mdrSubset property.
             * 
             * @return
             *     possible object is
             *     {@link MDRSubset }
             *     
             */
            public MDRSubset getMDRSubset() {
                return mdrSubset;
            }

            /**
             * Sets the value of the mdrSubset property.
             * 
             * @param value
             *     allowed object is
             *     {@link MDRSubset }
             *     
             */
            public void setMDRSubset(MDRSubset value) {
                this.mdrSubset = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class MDRSubset {

                @XmlAttribute(name = "Code")
                protected String code;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="DisplayPolicy">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="SOW"/>
         *             &lt;enumeration value="GOW2RT"/>
         *             &lt;enumeration value="SCHS"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MultiTicket {

            @XmlAttribute(name = "DisplayPolicy")
            protected String displayPolicy;

            /**
             * Gets the value of the displayPolicy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDisplayPolicy() {
                return displayPolicy;
            }

            /**
             * Sets the value of the displayPolicy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDisplayPolicy(String value) {
                this.displayPolicy = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;choice maxOccurs="unbounded">
         *         &lt;element name="Partition" type="{http://www.opentravel.org/OTA/2003/05}CachePartitionType"/>
         *         &lt;element name="Group" type="{http://www.opentravel.org/OTA/2003/05}CachePartitionGroupType"/>
         *       &lt;/choice>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "partitionOrGroup"
        })
        public static class Partitions {

            @XmlElements({
                @XmlElement(name = "Partition", type = CachePartitionType.class),
                @XmlElement(name = "Group", type = CachePartitionGroupType.class)
            })
            protected List<Object> partitionOrGroup;

            /**
             * Gets the value of the partitionOrGroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the partitionOrGroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPartitionOrGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CachePartitionType }
             * {@link CachePartitionGroupType }
             * 
             * 
             */
            public List<Object> getPartitionOrGroup() {
                if (partitionOrGroup == null) {
                    partitionOrGroup = new ArrayList<Object>();
                }
                return this.partitionOrGroup;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="DKNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ReservationData {

            @XmlAttribute(name = "DKNumber")
            protected String dkNumber;

            /**
             * Gets the value of the dkNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDKNumber() {
                return dkNumber;
            }

            /**
             * Sets the value of the dkNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDKNumber(String value) {
                this.dkNumber = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="ByLeg" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="ByFareComponent" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SplitTaxes {

            @XmlAttribute(name = "ByLeg")
            protected Boolean byLeg;
            @XmlAttribute(name = "ByFareComponent")
            protected Boolean byFareComponent;

            /**
             * Gets the value of the byLeg property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isByLeg() {
                return byLeg;
            }

            /**
             * Sets the value of the byLeg property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setByLeg(Boolean value) {
                this.byLeg = value;
            }

            /**
             * Gets the value of the byFareComponent property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isByFareComponent() {
                return byFareComponent;
            }

            /**
             * Sets the value of the byFareComponent property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setByFareComponent(Boolean value) {
                this.byFareComponent = value;
            }

        }

    }

}
