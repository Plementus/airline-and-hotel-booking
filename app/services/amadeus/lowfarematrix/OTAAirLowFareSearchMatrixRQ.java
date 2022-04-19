
package services.amadeus.lowfarematrix;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OTA_AirLowFareSearchMatrixRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_AirLowFareSearchMatrixRQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POS" type="{http://traveltalk.com/wsLowFareMatrix}POS" minOccurs="0"/>
 *         &lt;element name="OriginDestinationInformation" type="{http://traveltalk.com/wsLowFareMatrix}OriginDestinationInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecificFlightInfo" type="{http://traveltalk.com/wsLowFareMatrix}SpecificFlightInfo" minOccurs="0"/>
 *         &lt;element name="TravelPreferences" type="{http://traveltalk.com/wsLowFareMatrix}TravelPreferences" minOccurs="0"/>
 *         &lt;element name="TravelerInfoSummary" type="{http://traveltalk.com/wsLowFareMatrix}TravelerInfoSummary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Target" type="{http://traveltalk.com/wsLowFareMatrix}OTA_AirLowFareSearchPlusRQTarget" default="Production" />
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="PrimaryLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AltLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MaxResponses" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="DirectFlightsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AvailableFlightsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_AirLowFareSearchMatrixRQ", propOrder = {
    "pos",
    "originDestinationInformation",
    "specificFlightInfo",
    "travelPreferences",
    "travelerInfoSummary"
})
public class OTAAirLowFareSearchMatrixRQ {

    @XmlElement(name = "POS")
    protected POS pos;
    @XmlElement(name = "OriginDestinationInformation")
    protected List<OriginDestinationInformation> originDestinationInformation;
    @XmlElement(name = "SpecificFlightInfo")
    protected SpecificFlightInfo specificFlightInfo;
    @XmlElement(name = "TravelPreferences")
    protected TravelPreferences travelPreferences;
    @XmlElement(name = "TravelerInfoSummary")
    protected TravelerInfoSummary travelerInfoSummary;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Target")
    protected OTAAirLowFareSearchPlusRQTarget target;
    @XmlAttribute(name = "Version")
    protected Double version;
    @XmlAttribute(name = "SequenceNmbr")
    protected Integer sequenceNmbr;
    @XmlAttribute(name = "PrimaryLangID")
    protected String primaryLangID;
    @XmlAttribute(name = "AltLangID")
    protected String altLangID;
    @XmlAttribute(name = "MaxResponses")
    protected Integer maxResponses;
    @XmlAttribute(name = "DirectFlightsOnly")
    protected Boolean directFlightsOnly;
    @XmlAttribute(name = "AvailableFlightsOnly")
    protected Boolean availableFlightsOnly;

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link POS }
     *     
     */
    public POS getPOS() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link POS }
     *     
     */
    public void setPOS(POS value) {
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
     *     {@link SpecificFlightInfo }
     *     
     */
    public SpecificFlightInfo getSpecificFlightInfo() {
        return specificFlightInfo;
    }

    /**
     * Sets the value of the specificFlightInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificFlightInfo }
     *     
     */
    public void setSpecificFlightInfo(SpecificFlightInfo value) {
        this.specificFlightInfo = value;
    }

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
     * Gets the value of the travelerInfoSummary property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerInfoSummary }
     *     
     */
    public TravelerInfoSummary getTravelerInfoSummary() {
        return travelerInfoSummary;
    }

    /**
     * Sets the value of the travelerInfoSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerInfoSummary }
     *     
     */
    public void setTravelerInfoSummary(TravelerInfoSummary value) {
        this.travelerInfoSummary = value;
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirLowFareSearchPlusRQTarget }
     *     
     */
    public OTAAirLowFareSearchPlusRQTarget getTarget() {
        if (target == null) {
            return OTAAirLowFareSearchPlusRQTarget.PRODUCTION;
        } else {
            return target;
        }
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirLowFareSearchPlusRQTarget }
     *     
     */
    public void setTarget(OTAAirLowFareSearchPlusRQTarget value) {
        this.target = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVersion(Double value) {
        this.version = value;
    }

    /**
     * Gets the value of the sequenceNmbr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceNmbr() {
        return sequenceNmbr;
    }

    /**
     * Sets the value of the sequenceNmbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenceNmbr(Integer value) {
        this.sequenceNmbr = value;
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
     *     {@link Integer }
     *     
     */
    public Integer getMaxResponses() {
        return maxResponses;
    }

    /**
     * Sets the value of the maxResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxResponses(Integer value) {
        this.maxResponses = value;
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
    public Boolean isAvailableFlightsOnly() {
        return availableFlightsOnly;
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

}
