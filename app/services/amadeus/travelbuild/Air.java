
package services.amadeus.travelbuild;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Air complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Air">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="DepartureAirport" type="{http://traveltalk.com/wsTravelBuild}DepartureAirport" minOccurs="0"/>
 *           &lt;element name="OperatingAirline" type="{http://traveltalk.com/wsTravelBuild}OperatingAirline" minOccurs="0"/>
 *           &lt;element name="Seats" type="{http://traveltalk.com/wsTravelBuild}ArrayOfSeat" minOccurs="0"/>
 *           &lt;element name="MarketingAirline" type="{http://traveltalk.com/wsTravelBuild}MarketingAirline" minOccurs="0"/>
 *           &lt;element name="MarriageGrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="ArrivalAirport" type="{http://traveltalk.com/wsTravelBuild}ArrivalAirport" minOccurs="0"/>
 *           &lt;element name="Equipment" type="{http://traveltalk.com/wsTravelBuild}Equipment" minOccurs="0"/>
 *           &lt;element name="TPA_Extensions" type="{http://traveltalk.com/wsTravelBuild}TPA_ExtensionsRS" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StopQuantity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NumberInParty" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="E_TicketEligibility" type="{http://traveltalk.com/wsTravelBuild}E_TicketEligibilityType" />
 *       &lt;attribute name="MealCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DepartureDay" type="{http://traveltalk.com/wsTravelBuild}DepartureDayType" />
 *       &lt;attribute name="OrginDestType" type="{http://traveltalk.com/wsTravelBuild}AirOrginDestType" />
 *       &lt;attribute name="CouponStatus" type="{http://traveltalk.com/wsTravelBuild}CouponStatus" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Air", propOrder = {
    "content"
})
public class Air {

    @XmlElementRefs({
        @XmlElementRef(name = "Equipment", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MarketingAirline", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Seats", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DepartureAirport", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ArrivalAirport", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MarriageGrp", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TPA_Extensions", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OperatingAirline", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "DepartureDateTime")
    protected String departureDateTime;
    @XmlAttribute(name = "ArrivalDateTime")
    protected String arrivalDateTime;
    @XmlAttribute(name = "StopQuantity")
    protected Integer stopQuantity;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "InfoSource")
    protected String infoSource;
    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "ResBookDesigCode")
    protected String resBookDesigCode;
    @XmlAttribute(name = "NumberInParty")
    protected Integer numberInParty;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "E_TicketEligibility")
    protected ETicketEligibilityType eTicketEligibility;
    @XmlAttribute(name = "MealCode")
    protected String mealCode;
    @XmlAttribute(name = "DepartureDay")
    protected DepartureDayType departureDay;
    @XmlAttribute(name = "OrginDestType")
    protected AirOrginDestType orginDestType;
    @XmlAttribute(name = "CouponStatus")
    protected CouponStatus couponStatus;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Equipment }{@code >}
     * {@link JAXBElement }{@code <}{@link MarketingAirline }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrayOfSeat }{@code >}
     * {@link JAXBElement }{@code <}{@link DepartureAirport }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrivalAirport }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link TPAExtensionsRS }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link OperatingAirline }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Gets the value of the departureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * Sets the value of the departureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDateTime(String value) {
        this.departureDateTime = value;
    }

    /**
     * Gets the value of the arrivalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * Sets the value of the arrivalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalDateTime(String value) {
        this.arrivalDateTime = value;
    }

    /**
     * Gets the value of the stopQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStopQuantity() {
        return stopQuantity;
    }

    /**
     * Sets the value of the stopQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStopQuantity(Integer value) {
        this.stopQuantity = value;
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
     * Gets the value of the infoSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoSource() {
        return infoSource;
    }

    /**
     * Sets the value of the infoSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoSource(String value) {
        this.infoSource = value;
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
     * Gets the value of the resBookDesigCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResBookDesigCode() {
        return resBookDesigCode;
    }

    /**
     * Sets the value of the resBookDesigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResBookDesigCode(String value) {
        this.resBookDesigCode = value;
    }

    /**
     * Gets the value of the numberInParty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberInParty() {
        return numberInParty;
    }

    /**
     * Sets the value of the numberInParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberInParty(Integer value) {
        this.numberInParty = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the eTicketEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link ETicketEligibilityType }
     *     
     */
    public ETicketEligibilityType getETicketEligibility() {
        return eTicketEligibility;
    }

    /**
     * Sets the value of the eTicketEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETicketEligibilityType }
     *     
     */
    public void setETicketEligibility(ETicketEligibilityType value) {
        this.eTicketEligibility = value;
    }

    /**
     * Gets the value of the mealCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealCode() {
        return mealCode;
    }

    /**
     * Sets the value of the mealCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealCode(String value) {
        this.mealCode = value;
    }

    /**
     * Gets the value of the departureDay property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureDayType }
     *     
     */
    public DepartureDayType getDepartureDay() {
        return departureDay;
    }

    /**
     * Sets the value of the departureDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureDayType }
     *     
     */
    public void setDepartureDay(DepartureDayType value) {
        this.departureDay = value;
    }

    /**
     * Gets the value of the orginDestType property.
     * 
     * @return
     *     possible object is
     *     {@link AirOrginDestType }
     *     
     */
    public AirOrginDestType getOrginDestType() {
        return orginDestType;
    }

    /**
     * Sets the value of the orginDestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirOrginDestType }
     *     
     */
    public void setOrginDestType(AirOrginDestType value) {
        this.orginDestType = value;
    }

    /**
     * Gets the value of the couponStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CouponStatus }
     *     
     */
    public CouponStatus getCouponStatus() {
        return couponStatus;
    }

    /**
     * Sets the value of the couponStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponStatus }
     *     
     */
    public void setCouponStatus(CouponStatus value) {
        this.couponStatus = value;
    }

}
