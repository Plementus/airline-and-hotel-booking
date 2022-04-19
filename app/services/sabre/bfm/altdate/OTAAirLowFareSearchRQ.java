
package services.sabre.bfm.altdate;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="SpecificFlightInfo" type="{http://www.opentravel.org/OTA/2003/05}SpecificFlightInfoType" minOccurs="0"/>
 *           &lt;element name="TravelPreferences" type="{http://www.opentravel.org/OTA/2003/05}AirSearchPrefsType" minOccurs="0"/>
 *           &lt;element name="TravelerInfoSummary" type="{http://www.opentravel.org/OTA/2003/05}TravelerInfoSummaryType"/>
 *         &lt;/sequence>
 *         &lt;element name="TPA_Extensions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IntelliSellTransaction" type="{http://www.opentravel.org/OTA/2003/05}TransactionType" minOccurs="0"/>
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
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MaxResponsesGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OTA_PayloadStdAttributes"/>
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
    "specificFlightInfo",
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
    @XmlElement(name = "SpecificFlightInfo")
    protected SpecificFlightInfoType specificFlightInfo;
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
    @XmlAttribute(name = "MaxResponses")
    protected String maxResponses;
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
     * Gets the value of the specificFlightInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificFlightInfoType }
     *     
     */
    public SpecificFlightInfoType getSpecificFlightInfo() {
        return specificFlightInfo;
    }

    /**
     * Sets the value of the specificFlightInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificFlightInfoType }
     *     
     */
    public void setSpecificFlightInfo(SpecificFlightInfoType value) {
        this.specificFlightInfo = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
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
            "includeVendorPref",
            "includeAlliancePref",
            "departureDays"
        })
        public static class TPAExtensions {

            @XmlElement(name = "Routing")
            protected List<RoutingDefinitionType> routing;
            @XmlElement(name = "DateFlexibility")
            protected DateFlexibility dateFlexibility;
            @XmlElement(name = "SisterDestinationLocation")
            protected List<LocationType> sisterDestinationLocation;
            @XmlElement(name = "SisterDestinationMileage")
            protected SisterDestinationMileage sisterDestinationMileage;
            @XmlElement(name = "SisterOriginLocation")
            protected List<LocationType> sisterOriginLocation;
            @XmlElement(name = "SisterOriginMileage")
            protected SisterOriginMileage sisterOriginMileage;
            @XmlElement(name = "SegmentType")
            protected SegmentType segmentType;
            @XmlElement(name = "AlternateTime")
            protected AlternateTime alternateTime;
            @XmlElement(name = "MaxOneWayOptions")
            protected MaxOneWayOptions maxOneWayOptions;
            @XmlElement(name = "NumOneWayOptions")
            protected NumOneWayOptions numOneWayOptions;
            @XmlElement(name = "CabinPref")
            protected CabinPrefType cabinPref;
            @XmlElement(name = "ConnectionTime")
            protected ConnectionTime connectionTime;
            @XmlElement(name = "IncludeVendorPref")
            protected List<IncludeVendorPrefType> includeVendorPref;
            @XmlElement(name = "IncludeAlliancePref")
            protected List<AllianceType> includeAlliancePref;
            @XmlElement(name = "DepartureDays")
            protected DepartureDaysType departureDays;

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
             * @return
             *     possible object is
             *     {@link DateFlexibility }
             *     
             */
            public DateFlexibility getDateFlexibility() {
                return dateFlexibility;
            }

            /**
             * Sets the value of the dateFlexibility property.
             * 
             * @param value
             *     allowed object is
             *     {@link DateFlexibility }
             *     
             */
            public void setDateFlexibility(DateFlexibility value) {
                this.dateFlexibility = value;
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
             * {@link LocationType }
             * 
             * 
             */
            public List<LocationType> getSisterDestinationLocation() {
                if (sisterDestinationLocation == null) {
                    sisterDestinationLocation = new ArrayList<LocationType>();
                }
                return this.sisterDestinationLocation;
            }

            /**
             * Gets the value of the sisterDestinationMileage property.
             * 
             * @return
             *     possible object is
             *     {@link SisterDestinationMileage }
             *     
             */
            public SisterDestinationMileage getSisterDestinationMileage() {
                return sisterDestinationMileage;
            }

            /**
             * Sets the value of the sisterDestinationMileage property.
             * 
             * @param value
             *     allowed object is
             *     {@link SisterDestinationMileage }
             *     
             */
            public void setSisterDestinationMileage(SisterDestinationMileage value) {
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
             * {@link LocationType }
             * 
             * 
             */
            public List<LocationType> getSisterOriginLocation() {
                if (sisterOriginLocation == null) {
                    sisterOriginLocation = new ArrayList<LocationType>();
                }
                return this.sisterOriginLocation;
            }

            /**
             * Gets the value of the sisterOriginMileage property.
             * 
             * @return
             *     possible object is
             *     {@link SisterOriginMileage }
             *     
             */
            public SisterOriginMileage getSisterOriginMileage() {
                return sisterOriginMileage;
            }

            /**
             * Sets the value of the sisterOriginMileage property.
             * 
             * @param value
             *     allowed object is
             *     {@link SisterOriginMileage }
             *     
             */
            public void setSisterOriginMileage(SisterOriginMileage value) {
                this.sisterOriginMileage = value;
            }

            /**
             * Gets the value of the segmentType property.
             * 
             * @return
             *     possible object is
             *     {@link SegmentType }
             *     
             */
            public SegmentType getSegmentType() {
                return segmentType;
            }

            /**
             * Sets the value of the segmentType property.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentType }
             *     
             */
            public void setSegmentType(SegmentType value) {
                this.segmentType = value;
            }

            /**
             * Gets the value of the alternateTime property.
             * 
             * @return
             *     possible object is
             *     {@link AlternateTime }
             *     
             */
            public AlternateTime getAlternateTime() {
                return alternateTime;
            }

            /**
             * Sets the value of the alternateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link AlternateTime }
             *     
             */
            public void setAlternateTime(AlternateTime value) {
                this.alternateTime = value;
            }

            /**
             * Gets the value of the maxOneWayOptions property.
             * 
             * @return
             *     possible object is
             *     {@link MaxOneWayOptions }
             *     
             */
            public MaxOneWayOptions getMaxOneWayOptions() {
                return maxOneWayOptions;
            }

            /**
             * Sets the value of the maxOneWayOptions property.
             * 
             * @param value
             *     allowed object is
             *     {@link MaxOneWayOptions }
             *     
             */
            public void setMaxOneWayOptions(MaxOneWayOptions value) {
                this.maxOneWayOptions = value;
            }

            /**
             * Gets the value of the numOneWayOptions property.
             * 
             * @return
             *     possible object is
             *     {@link NumOneWayOptions }
             *     
             */
            public NumOneWayOptions getNumOneWayOptions() {
                return numOneWayOptions;
            }

            /**
             * Sets the value of the numOneWayOptions property.
             * 
             * @param value
             *     allowed object is
             *     {@link NumOneWayOptions }
             *     
             */
            public void setNumOneWayOptions(NumOneWayOptions value) {
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
             *     {@link ConnectionTime }
             *     
             */
            public ConnectionTime getConnectionTime() {
                return connectionTime;
            }

            /**
             * Sets the value of the connectionTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConnectionTime }
             *     
             */
            public void setConnectionTime(ConnectionTime value) {
                this.connectionTime = value;
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


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="PlusMinus" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to9" />
             *       &lt;attribute name="Minus" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to72" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class AlternateTime {

                @XmlAttribute(name = "PlusMinus")
                protected Integer plusMinus;
                @XmlAttribute(name = "Minus")
                protected Integer minus;

                /**
                 * Gets the value of the plusMinus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getPlusMinus() {
                    return plusMinus;
                }

                /**
                 * Sets the value of the plusMinus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setPlusMinus(Integer value) {
                    this.plusMinus = value;
                }

                /**
                 * Gets the value of the minus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getMinus() {
                    return minus;
                }

                /**
                 * Sets the value of the minus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setMinus(Integer value) {
                    this.minus = value;
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
             *       &lt;attribute name="Min" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="Max" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ConnectionTime {

                @XmlAttribute(name = "Min")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger min;
                @XmlAttribute(name = "Max")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger max;

                /**
                 * Gets the value of the min property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getMin() {
                    return min;
                }

                /**
                 * Sets the value of the min property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setMin(BigInteger value) {
                    this.min = value;
                }

                /**
                 * Gets the value of the max property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getMax() {
                    return max;
                }

                /**
                 * Sets the value of the max property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setMax(BigInteger value) {
                    this.max = value;
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
             *       &lt;attribute name="NbrOfDays" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="Plus" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="Minus" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class DateFlexibility {

                @XmlAttribute(name = "NbrOfDays")
                protected Integer nbrOfDays;
                @XmlAttribute(name = "Plus")
                protected Integer plus;
                @XmlAttribute(name = "Minus")
                protected Integer minus;

                /**
                 * Gets the value of the nbrOfDays property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getNbrOfDays() {
                    return nbrOfDays;
                }

                /**
                 * Sets the value of the nbrOfDays property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setNbrOfDays(Integer value) {
                    this.nbrOfDays = value;
                }

                /**
                 * Gets the value of the plus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getPlus() {
                    return plus;
                }

                /**
                 * Sets the value of the plus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setPlus(Integer value) {
                    this.plus = value;
                }

                /**
                 * Gets the value of the minus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getMinus() {
                    return minus;
                }

                /**
                 * Sets the value of the minus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setMinus(Integer value) {
                    this.minus = value;
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
             *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class MaxOneWayOptions {

                @XmlAttribute(name = "Value", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int value;

                /**
                 * Gets the value of the value property.
                 * 
                 */
                public int getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 */
                public void setValue(int value) {
                    this.value = value;
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
             *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class NumOneWayOptions {

                @XmlAttribute(name = "Number", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int number;

                /**
                 * Gets the value of the number property.
                 * 
                 */
                public int getNumber() {
                    return number;
                }

                /**
                 * Sets the value of the number property.
                 * 
                 */
                public void setNumber(int value) {
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
             *       &lt;attribute name="Code">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="ARUNK"/>
             *             &lt;enumeration value="O"/>
             *             &lt;enumeration value="X"/>
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
            public static class SegmentType {

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


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class SisterDestinationMileage {

                @XmlAttribute(name = "Number", required = true)
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger number;

                /**
                 * Gets the value of the number property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getNumber() {
                    return number;
                }

                /**
                 * Sets the value of the number property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setNumber(BigInteger value) {
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
             *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class SisterOriginMileage {

                @XmlAttribute(name = "Number", required = true)
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger number;

                /**
                 * Gets the value of the number property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getNumber() {
                    return number;
                }

                /**
                 * Sets the value of the number property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setNumber(BigInteger value) {
                    this.number = value;
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
     *         &lt;element name="IntelliSellTransaction" type="{http://www.opentravel.org/OTA/2003/05}TransactionType" minOccurs="0"/>
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
        "messagingDetails",
        "alternateAirportCities",
        "alternateAirportMileage",
        "splitTaxes",
        "multiTicket"
    })
    public static class TPAExtensions {

        @XmlElement(name = "IntelliSellTransaction")
        protected TransactionType intelliSellTransaction;
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
