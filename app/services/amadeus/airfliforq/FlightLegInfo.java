
package services.amadeus.airfliforq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightLegInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightLegInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartureAirport" type="{http://traveltalk.com/wsAirFlifo}DepartureAirportRS" minOccurs="0"/>
 *         &lt;element name="ArrivalAirport" type="{http://traveltalk.com/wsAirFlifo}ArrivalAirportRS" minOccurs="0"/>
 *         &lt;element name="MarketingAirline" type="{http://traveltalk.com/wsAirFlifo}MarketingAirline" minOccurs="0"/>
 *         &lt;element name="OperatingAirline" type="{http://traveltalk.com/wsAirFlifo}OperatingAirline" minOccurs="0"/>
 *         &lt;element name="Equipment" type="{http://traveltalk.com/wsAirFlifo}Equipment" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://traveltalk.com/wsAirFlifo}Comment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DepartureDateTime" type="{http://traveltalk.com/wsAirFlifo}DepartureDateTime" minOccurs="0"/>
 *         &lt;element name="ArrivalDateTime" type="{http://traveltalk.com/wsAirFlifo}ArrivalDateTime" minOccurs="0"/>
 *         &lt;element name="OperationTimes" type="{http://traveltalk.com/wsAirFlifo}ArrayOfOperationTime" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="JourneyDuration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="GroundDuration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AccumulatedDuration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LegDistance" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="FlightStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightLegInfo", propOrder = {
    "departureAirport",
    "arrivalAirport",
    "marketingAirline",
    "operatingAirline",
    "equipment",
    "comment",
    "departureDateTime",
    "arrivalDateTime",
    "operationTimes"
})
public class FlightLegInfo {

    @XmlElement(name = "DepartureAirport")
    protected DepartureAirportRS departureAirport;
    @XmlElement(name = "ArrivalAirport")
    protected ArrivalAirportRS arrivalAirport;
    @XmlElement(name = "MarketingAirline")
    protected MarketingAirline marketingAirline;
    @XmlElement(name = "OperatingAirline")
    protected OperatingAirline operatingAirline;
    @XmlElement(name = "Equipment")
    protected Equipment equipment;
    @XmlElement(name = "Comment")
    protected List<Comment> comment;
    @XmlElement(name = "DepartureDateTime")
    protected DepartureDateTime departureDateTime;
    @XmlElement(name = "ArrivalDateTime")
    protected ArrivalDateTime arrivalDateTime;
    @XmlElement(name = "OperationTimes")
    protected ArrayOfOperationTime operationTimes;
    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "JourneyDuration")
    protected String journeyDuration;
    @XmlAttribute(name = "GroundDuration")
    protected String groundDuration;
    @XmlAttribute(name = "AccumulatedDuration")
    protected String accumulatedDuration;
    @XmlAttribute(name = "LegDistance")
    protected Integer legDistance;
    @XmlAttribute(name = "FlightStatus")
    protected String flightStatus;

    /**
     * Gets the value of the departureAirport property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureAirportRS }
     *     
     */
    public DepartureAirportRS getDepartureAirport() {
        return departureAirport;
    }

    /**
     * Sets the value of the departureAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureAirportRS }
     *     
     */
    public void setDepartureAirport(DepartureAirportRS value) {
        this.departureAirport = value;
    }

    /**
     * Gets the value of the arrivalAirport property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalAirportRS }
     *     
     */
    public ArrivalAirportRS getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * Sets the value of the arrivalAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalAirportRS }
     *     
     */
    public void setArrivalAirport(ArrivalAirportRS value) {
        this.arrivalAirport = value;
    }

    /**
     * Gets the value of the marketingAirline property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingAirline }
     *     
     */
    public MarketingAirline getMarketingAirline() {
        return marketingAirline;
    }

    /**
     * Sets the value of the marketingAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingAirline }
     *     
     */
    public void setMarketingAirline(MarketingAirline value) {
        this.marketingAirline = value;
    }

    /**
     * Gets the value of the operatingAirline property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingAirline }
     *     
     */
    public OperatingAirline getOperatingAirline() {
        return operatingAirline;
    }

    /**
     * Sets the value of the operatingAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingAirline }
     *     
     */
    public void setOperatingAirline(OperatingAirline value) {
        this.operatingAirline = value;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link Equipment }
     *     
     */
    public Equipment getEquipment() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Equipment }
     *     
     */
    public void setEquipment(Equipment value) {
        this.equipment = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getComment() {
        if (comment == null) {
            comment = new ArrayList<Comment>();
        }
        return this.comment;
    }

    /**
     * Gets the value of the departureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureDateTime }
     *     
     */
    public DepartureDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * Sets the value of the departureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureDateTime }
     *     
     */
    public void setDepartureDateTime(DepartureDateTime value) {
        this.departureDateTime = value;
    }

    /**
     * Gets the value of the arrivalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalDateTime }
     *     
     */
    public ArrivalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * Sets the value of the arrivalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalDateTime }
     *     
     */
    public void setArrivalDateTime(ArrivalDateTime value) {
        this.arrivalDateTime = value;
    }

    /**
     * Gets the value of the operationTimes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOperationTime }
     *     
     */
    public ArrayOfOperationTime getOperationTimes() {
        return operationTimes;
    }

    /**
     * Sets the value of the operationTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOperationTime }
     *     
     */
    public void setOperationTimes(ArrayOfOperationTime value) {
        this.operationTimes = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the journeyDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyDuration() {
        return journeyDuration;
    }

    /**
     * Sets the value of the journeyDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyDuration(String value) {
        this.journeyDuration = value;
    }

    /**
     * Gets the value of the groundDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroundDuration() {
        return groundDuration;
    }

    /**
     * Sets the value of the groundDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroundDuration(String value) {
        this.groundDuration = value;
    }

    /**
     * Gets the value of the accumulatedDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccumulatedDuration() {
        return accumulatedDuration;
    }

    /**
     * Sets the value of the accumulatedDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccumulatedDuration(String value) {
        this.accumulatedDuration = value;
    }

    /**
     * Gets the value of the legDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLegDistance() {
        return legDistance;
    }

    /**
     * Sets the value of the legDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLegDistance(Integer value) {
        this.legDistance = value;
    }

    /**
     * Gets the value of the flightStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightStatus() {
        return flightStatus;
    }

    /**
     * Sets the value of the flightStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightStatus(String value) {
        this.flightStatus = value;
    }

}
