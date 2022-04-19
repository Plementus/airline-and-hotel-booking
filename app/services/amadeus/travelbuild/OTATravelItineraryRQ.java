
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OTA_TravelItineraryRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_TravelItineraryRQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POS" type="{http://traveltalk.com/wsTravelBuild}POS" minOccurs="0"/>
 *         &lt;element name="UniqueId" type="{http://traveltalk.com/wsTravelBuild}UniqueID" minOccurs="0"/>
 *         &lt;element name="OTA_AirBookRQ" type="{http://traveltalk.com/wsTravelBuild}OTA_AirBookRQ" minOccurs="0"/>
 *         &lt;element name="OTA_HotelResRQ" type="{http://traveltalk.com/wsTravelBuild}OTA_HotelResRQ" minOccurs="0"/>
 *         &lt;element name="OTA_VehResRQ" type="{http://traveltalk.com/wsTravelBuild}OTA_VehResRQ" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://traveltalk.com/wsTravelBuild}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Target" type="{http://traveltalk.com/wsTravelBuild}OTA_TravelItineraryRQTarget" default="Production" />
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="PrimaryLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AltLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ResStatus" type="{http://traveltalk.com/wsTravelBuild}OTA_TravelItineraryRQResStatus" />
 *       &lt;attribute name="ReferenceOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_TravelItineraryRQ", propOrder = {
    "pos",
    "uniqueId",
    "otaAirBookRQ",
    "otaHotelResRQ",
    "otaVehResRQ",
    "tpaExtensions"
})
public class OTATravelItineraryRQ {

    @XmlElement(name = "POS")
    protected POS pos;
    @XmlElement(name = "UniqueId")
    protected UniqueID uniqueId;
    @XmlElement(name = "OTA_AirBookRQ")
    protected OTAAirBookRQ otaAirBookRQ;
    @XmlElement(name = "OTA_HotelResRQ")
    protected OTAHotelResRQ otaHotelResRQ;
    @XmlElement(name = "OTA_VehResRQ")
    protected OTAVehResRQ otaVehResRQ;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensions tpaExtensions;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Target")
    protected OTATravelItineraryRQTarget target;
    @XmlAttribute(name = "Version")
    protected String version;
    @XmlAttribute(name = "SequenceNmbr")
    protected Integer sequenceNmbr;
    @XmlAttribute(name = "PrimaryLangID")
    protected String primaryLangID;
    @XmlAttribute(name = "AltLangID")
    protected String altLangID;
    @XmlAttribute(name = "ResStatus")
    protected OTATravelItineraryRQResStatus resStatus;
    @XmlAttribute(name = "ReferenceOnly")
    protected Boolean referenceOnly;

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
     * Gets the value of the uniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getUniqueId() {
        return uniqueId;
    }

    /**
     * Sets the value of the uniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setUniqueId(UniqueID value) {
        this.uniqueId = value;
    }

    /**
     * Gets the value of the otaAirBookRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirBookRQ }
     *     
     */
    public OTAAirBookRQ getOTAAirBookRQ() {
        return otaAirBookRQ;
    }

    /**
     * Sets the value of the otaAirBookRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirBookRQ }
     *     
     */
    public void setOTAAirBookRQ(OTAAirBookRQ value) {
        this.otaAirBookRQ = value;
    }

    /**
     * Gets the value of the otaHotelResRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelResRQ }
     *     
     */
    public OTAHotelResRQ getOTAHotelResRQ() {
        return otaHotelResRQ;
    }

    /**
     * Sets the value of the otaHotelResRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelResRQ }
     *     
     */
    public void setOTAHotelResRQ(OTAHotelResRQ value) {
        this.otaHotelResRQ = value;
    }

    /**
     * Gets the value of the otaVehResRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTAVehResRQ }
     *     
     */
    public OTAVehResRQ getOTAVehResRQ() {
        return otaVehResRQ;
    }

    /**
     * Sets the value of the otaVehResRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehResRQ }
     *     
     */
    public void setOTAVehResRQ(OTAVehResRQ value) {
        this.otaVehResRQ = value;
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
     *     {@link OTATravelItineraryRQTarget }
     *     
     */
    public OTATravelItineraryRQTarget getTarget() {
        if (target == null) {
            return OTATravelItineraryRQTarget.PRODUCTION;
        } else {
            return target;
        }
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTATravelItineraryRQTarget }
     *     
     */
    public void setTarget(OTATravelItineraryRQTarget value) {
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
     * Gets the value of the resStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OTATravelItineraryRQResStatus }
     *     
     */
    public OTATravelItineraryRQResStatus getResStatus() {
        return resStatus;
    }

    /**
     * Sets the value of the resStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTATravelItineraryRQResStatus }
     *     
     */
    public void setResStatus(OTATravelItineraryRQResStatus value) {
        this.resStatus = value;
    }

    /**
     * Gets the value of the referenceOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReferenceOnly() {
        return referenceOnly;
    }

    /**
     * Sets the value of the referenceOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReferenceOnly(Boolean value) {
        this.referenceOnly = value;
    }

}
