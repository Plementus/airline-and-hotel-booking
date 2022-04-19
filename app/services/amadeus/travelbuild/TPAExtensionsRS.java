
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
 * <p>Java class for TPA_ExtensionsRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPA_ExtensionsRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="MerchantCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="RateQuoted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="AlternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="AgencyCommission" type="{http://traveltalk.com/wsTravelBuild}AgencyCommission" minOccurs="0"/>
 *           &lt;element name="AdvancedDeposit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="CarOptions" type="{http://traveltalk.com/wsTravelBuild}ArrayOfCarOption" minOccurs="0"/>
 *           &lt;element name="RoomLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="Crib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="SupplementalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="GuestFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="GuestLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="Rules" type="{http://traveltalk.com/wsTravelBuild}ArrayOfString3" minOccurs="0"/>
 *           &lt;element name="ExtraChild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="TourNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="OverrideCorporateRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="RollawayChild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="RollawayAdult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="RateRequested" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="CorporateDiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="AgencyServiceFee" type="{http://traveltalk.com/wsTravelBuild}AgencyServiceFee" minOccurs="0"/>
 *           &lt;element name="CarType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="ExtraAdult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="MealPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="AccountingLine" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Arnk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuedTickets" type="{http://traveltalk.com/wsTravelBuild}IssuedTickets" minOccurs="0"/>
 *         &lt;element name="Vendor" type="{http://traveltalk.com/wsTravelBuild}Vendor" minOccurs="0"/>
 *         &lt;element name="OriginCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareCalculation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentRestrictions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentCard" type="{http://traveltalk.com/wsTravelBuild}PaymentCardRS" minOccurs="0"/>
 *         &lt;element name="ValidatingAirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BagAllowance" type="{http://traveltalk.com/wsTravelBuild}BagAllowance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FareRules" type="{http://traveltalk.com/wsTravelBuild}FareRules" minOccurs="0"/>
 *         &lt;element name="OriginRailwayStation" type="{http://traveltalk.com/wsTravelBuild}OriginRailwayStation" minOccurs="0"/>
 *         &lt;element name="DestinationRailwayStation" type="{http://traveltalk.com/wsTravelBuild}DestinationRailwayStation" minOccurs="0"/>
 *         &lt;element name="AccountingInfo" type="{http://traveltalk.com/wsTravelBuild}AccountingInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FuturePriceInfo" type="{http://traveltalk.com/wsTravelBuild}FuturePriceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FlightType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DateChange" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FlownIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="FOPType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BookingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BookingSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NumberInParty" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ManualPricing" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TrainNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ClassOfService" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BookingReference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TrainEquipment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FlightDuration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPA_ExtensionsRS", propOrder = {
    "content"
})
public class TPAExtensionsRS {

    @XmlElementRefs({
        @XmlElementRef(name = "Crib", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AgencyCommission", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AdvancedDeposit", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DestinationRailwayStation", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GuestLastName", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OriginRailwayStation", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OverrideCorporateRate", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RateRequested", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FuturePriceInfo", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Rules", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FareRules", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CorporateDiscount", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OriginCityCode", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BagAllowance", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AlternateCurrency", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RollawayChild", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Arnk", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ValidatingAirlineCode", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CarType", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PaymentRestrictions", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Vendor", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MerchantCurrency", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TourNumber", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MealPlan", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FareCalculation", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AccountingLine", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ExtraChild", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AgencyServiceFee", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GuestFirstName", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SupplementalInfo", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RollawayAdult", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CarOptions", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RoomLocation", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AccountingInfo", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IssuedTickets", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ExtraAdult", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RateQuoted", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PaymentCard", namespace = "http://traveltalk.com/wsTravelBuild", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "FlightType")
    protected String flightType;
    @XmlAttribute(name = "DateChange")
    protected String dateChange;
    @XmlAttribute(name = "FlownIndicator")
    protected Boolean flownIndicator;
    @XmlAttribute(name = "FOPType")
    protected String fopType;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "BookingCode")
    protected String bookingCode;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "BookingSource")
    protected String bookingSource;
    @XmlAttribute(name = "ConfirmationNumber")
    protected String confirmationNumber;
    @XmlAttribute(name = "NumberInParty")
    protected String numberInParty;
    @XmlAttribute(name = "ManualPricing")
    protected Boolean manualPricing;
    @XmlAttribute(name = "TrainNumber")
    protected String trainNumber;
    @XmlAttribute(name = "ClassOfService")
    protected String classOfService;
    @XmlAttribute(name = "BookingReference")
    protected String bookingReference;
    @XmlAttribute(name = "TrainEquipment")
    protected String trainEquipment;
    @XmlAttribute(name = "FlightDuration")
    protected String flightDuration;

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
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link AgencyCommission }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DestinationRailwayStation }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link OriginRailwayStation }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link FuturePriceInfo }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrayOfString3 }{@code >}
     * {@link JAXBElement }{@code <}{@link FareRules }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BagAllowance }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Vendor }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link AgencyServiceFee }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrayOfCarOption }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link AccountingInfo }{@code >}
     * {@link JAXBElement }{@code <}{@link IssuedTickets }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link PaymentCardRS }{@code >}
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
     * Gets the value of the flightType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightType() {
        return flightType;
    }

    /**
     * Sets the value of the flightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightType(String value) {
        this.flightType = value;
    }

    /**
     * Gets the value of the dateChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateChange() {
        return dateChange;
    }

    /**
     * Sets the value of the dateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateChange(String value) {
        this.dateChange = value;
    }

    /**
     * Gets the value of the flownIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlownIndicator() {
        return flownIndicator;
    }

    /**
     * Sets the value of the flownIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlownIndicator(Boolean value) {
        this.flownIndicator = value;
    }

    /**
     * Gets the value of the fopType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOPType() {
        return fopType;
    }

    /**
     * Sets the value of the fopType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOPType(String value) {
        this.fopType = value;
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
     * Gets the value of the bookingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingCode() {
        return bookingCode;
    }

    /**
     * Sets the value of the bookingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingCode(String value) {
        this.bookingCode = value;
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
     * Gets the value of the bookingSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingSource() {
        return bookingSource;
    }

    /**
     * Sets the value of the bookingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingSource(String value) {
        this.bookingSource = value;
    }

    /**
     * Gets the value of the confirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Sets the value of the confirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationNumber(String value) {
        this.confirmationNumber = value;
    }

    /**
     * Gets the value of the numberInParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberInParty() {
        return numberInParty;
    }

    /**
     * Sets the value of the numberInParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberInParty(String value) {
        this.numberInParty = value;
    }

    /**
     * Gets the value of the manualPricing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManualPricing() {
        return manualPricing;
    }

    /**
     * Sets the value of the manualPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManualPricing(Boolean value) {
        this.manualPricing = value;
    }

    /**
     * Gets the value of the trainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    /**
     * Sets the value of the trainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainNumber(String value) {
        this.trainNumber = value;
    }

    /**
     * Gets the value of the classOfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassOfService() {
        return classOfService;
    }

    /**
     * Sets the value of the classOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassOfService(String value) {
        this.classOfService = value;
    }

    /**
     * Gets the value of the bookingReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingReference() {
        return bookingReference;
    }

    /**
     * Sets the value of the bookingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingReference(String value) {
        this.bookingReference = value;
    }

    /**
     * Gets the value of the trainEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainEquipment() {
        return trainEquipment;
    }

    /**
     * Sets the value of the trainEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainEquipment(String value) {
        this.trainEquipment = value;
    }

    /**
     * Gets the value of the flightDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightDuration() {
        return flightDuration;
    }

    /**
     * Sets the value of the flightDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightDuration(String value) {
        this.flightDuration = value;
    }

}
