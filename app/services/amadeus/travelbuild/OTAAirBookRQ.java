
package services.amadeus.travelbuild;

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
 * <p>Java class for OTA_AirBookRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_AirBookRQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirItinerary" type="{http://traveltalk.com/wsTravelBuild}AirItinerary" minOccurs="0"/>
 *         &lt;element name="MiscellaneousSegments" type="{http://traveltalk.com/wsTravelBuild}MiscellaneousSegments" minOccurs="0"/>
 *         &lt;element name="PriceInfo" type="{http://traveltalk.com/wsTravelBuild}PriceInfo" minOccurs="0"/>
 *         &lt;element name="TravelerInfo" type="{http://traveltalk.com/wsTravelBuild}TravelerInfo" minOccurs="0"/>
 *         &lt;element name="Fulfillment" type="{http://traveltalk.com/wsTravelBuild}Fulfillment" minOccurs="0"/>
 *         &lt;element name="Ticketing" type="{http://traveltalk.com/wsTravelBuild}Ticketing" minOccurs="0"/>
 *         &lt;element name="Queue" type="{http://traveltalk.com/wsTravelBuild}Queue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BookingReferenceID" type="{http://traveltalk.com/wsTravelBuild}BookingReferenceID" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Target" type="{http://traveltalk.com/wsTravelBuild}OTA_AirBookRQTarget" default="Production" />
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="TransactionStatusCode" type="{http://traveltalk.com/wsTravelBuild}OTA_AirBookRQTransactionStatusCode" />
 *       &lt;attribute name="PrimaryLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AltLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_AirBookRQ", propOrder = {
    "airItinerary",
    "miscellaneousSegments",
    "priceInfo",
    "travelerInfo",
    "fulfillment",
    "ticketing",
    "queue",
    "bookingReferenceID"
})
public class OTAAirBookRQ {

    @XmlElement(name = "AirItinerary")
    protected AirItinerary airItinerary;
    @XmlElement(name = "MiscellaneousSegments")
    protected MiscellaneousSegments miscellaneousSegments;
    @XmlElement(name = "PriceInfo")
    protected PriceInfo priceInfo;
    @XmlElement(name = "TravelerInfo")
    protected TravelerInfo travelerInfo;
    @XmlElement(name = "Fulfillment")
    protected Fulfillment fulfillment;
    @XmlElement(name = "Ticketing")
    protected Ticketing ticketing;
    @XmlElement(name = "Queue")
    protected List<Queue> queue;
    @XmlElement(name = "BookingReferenceID")
    protected BookingReferenceID bookingReferenceID;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Target")
    protected OTAAirBookRQTarget target;
    @XmlAttribute(name = "Version")
    protected Double version;
    @XmlAttribute(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlAttribute(name = "SequenceNmbr")
    protected Integer sequenceNmbr;
    @XmlAttribute(name = "TransactionStatusCode")
    protected OTAAirBookRQTransactionStatusCode transactionStatusCode;
    @XmlAttribute(name = "PrimaryLangID")
    protected String primaryLangID;
    @XmlAttribute(name = "AltLangID")
    protected String altLangID;

    /**
     * Gets the value of the airItinerary property.
     * 
     * @return
     *     possible object is
     *     {@link AirItinerary }
     *     
     */
    public AirItinerary getAirItinerary() {
        return airItinerary;
    }

    /**
     * Sets the value of the airItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItinerary }
     *     
     */
    public void setAirItinerary(AirItinerary value) {
        this.airItinerary = value;
    }

    /**
     * Gets the value of the miscellaneousSegments property.
     * 
     * @return
     *     possible object is
     *     {@link MiscellaneousSegments }
     *     
     */
    public MiscellaneousSegments getMiscellaneousSegments() {
        return miscellaneousSegments;
    }

    /**
     * Sets the value of the miscellaneousSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscellaneousSegments }
     *     
     */
    public void setMiscellaneousSegments(MiscellaneousSegments value) {
        this.miscellaneousSegments = value;
    }

    /**
     * Gets the value of the priceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PriceInfo }
     *     
     */
    public PriceInfo getPriceInfo() {
        return priceInfo;
    }

    /**
     * Sets the value of the priceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceInfo }
     *     
     */
    public void setPriceInfo(PriceInfo value) {
        this.priceInfo = value;
    }

    /**
     * Gets the value of the travelerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerInfo }
     *     
     */
    public TravelerInfo getTravelerInfo() {
        return travelerInfo;
    }

    /**
     * Sets the value of the travelerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerInfo }
     *     
     */
    public void setTravelerInfo(TravelerInfo value) {
        this.travelerInfo = value;
    }

    /**
     * Gets the value of the fulfillment property.
     * 
     * @return
     *     possible object is
     *     {@link Fulfillment }
     *     
     */
    public Fulfillment getFulfillment() {
        return fulfillment;
    }

    /**
     * Sets the value of the fulfillment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fulfillment }
     *     
     */
    public void setFulfillment(Fulfillment value) {
        this.fulfillment = value;
    }

    /**
     * Gets the value of the ticketing property.
     * 
     * @return
     *     possible object is
     *     {@link Ticketing }
     *     
     */
    public Ticketing getTicketing() {
        return ticketing;
    }

    /**
     * Sets the value of the ticketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ticketing }
     *     
     */
    public void setTicketing(Ticketing value) {
        this.ticketing = value;
    }

    /**
     * Gets the value of the queue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Queue }
     * 
     * 
     */
    public List<Queue> getQueue() {
        if (queue == null) {
            queue = new ArrayList<Queue>();
        }
        return this.queue;
    }

    /**
     * Gets the value of the bookingReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link BookingReferenceID }
     *     
     */
    public BookingReferenceID getBookingReferenceID() {
        return bookingReferenceID;
    }

    /**
     * Sets the value of the bookingReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingReferenceID }
     *     
     */
    public void setBookingReferenceID(BookingReferenceID value) {
        this.bookingReferenceID = value;
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
     *     {@link OTAAirBookRQTarget }
     *     
     */
    public OTAAirBookRQTarget getTarget() {
        if (target == null) {
            return OTAAirBookRQTarget.PRODUCTION;
        } else {
            return target;
        }
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirBookRQTarget }
     *     
     */
    public void setTarget(OTAAirBookRQTarget value) {
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
     * Gets the value of the transactionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirBookRQTransactionStatusCode }
     *     
     */
    public OTAAirBookRQTransactionStatusCode getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /**
     * Sets the value of the transactionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirBookRQTransactionStatusCode }
     *     
     */
    public void setTransactionStatusCode(OTAAirBookRQTransactionStatusCode value) {
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

}
