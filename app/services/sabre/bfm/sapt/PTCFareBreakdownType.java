
package services.sabre.bfm.sapt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Per passenger type code pricing for this itinerary. Set if fareBreakdown was requested.
 * 
 * <p>Java class for PTCFareBreakdownType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PTCFareBreakdownType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerTypeQuantity" type="{http://www.opentravel.org/OTA/2003/05}PassengerTypeQuantityType"/>
 *         &lt;element name="FareBasisCodes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FareBasisCode" maxOccurs="400">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength1to16">
 *                           &lt;attribute name="PrivateFareType">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="1"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="AccountCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to20" />
 *                           &lt;attribute name="Mileage" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="BookingCode">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="1"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="AvailabilityBreak" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="DepartureAirportCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="ArrivalAirportCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="FareComponentBeginAirport" type="{http://www.opentravel.org/OTA/2003/05}AirportCode" />
 *                           &lt;attribute name="FareComponentEndAirport" type="{http://www.opentravel.org/OTA/2003/05}AirportCode" />
 *                           &lt;attribute name="FareComponentDirectionality" type="{http://www.opentravel.org/OTA/2003/05}FareDirectionality" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PassengerFare" type="{http://www.opentravel.org/OTA/2003/05}FareType"/>
 *         &lt;element name="Endorsements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Endorsement" maxOccurs="9" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TPA_Extensions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="NonRefundableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NonEndorsableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TPA_Extensions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FareCalcLine" type="{http://www.opentravel.org/OTA/2003/05}FareCalcLineType" minOccurs="0"/>
 *                   &lt;element name="FareType" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FareInfo" maxOccurs="10">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FareReference" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8"/>
 *                             &lt;element name="RuleInfo" type="{http://www.opentravel.org/OTA/2003/05}RuleInfoType" minOccurs="0"/>
 *                             &lt;element name="MarketingAirline" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="DepartureAirport" type="{http://www.opentravel.org/OTA/2003/05}ResponseLocationType" minOccurs="0"/>
 *                             &lt;element name="ArrivalAirport" type="{http://www.opentravel.org/OTA/2003/05}ResponseLocationType" minOccurs="0"/>
 *                             &lt;element name="TPA_Extensions" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SeatsRemaining" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="BelowMin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Cabin" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Cabin" type="{http://www.w3.org/2001/XMLSchema}string" default="Economy" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="FareNote" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="FareTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="PriorityLevel" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="ContentID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Meal" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Rule" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}int" />
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
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}NegotiatedFareAttributes"/>
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
 *       &lt;attribute name="PricingSource" type="{http://www.opentravel.org/OTA/2003/05}ResponsePricingSourceType" />
 *       &lt;attribute name="PrivateFareType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="LastTicketDate" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *       &lt;attribute name="PreviousExchangeDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ReissueExchange">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
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
@XmlType(name = "PTCFareBreakdownType", propOrder = {
    "passengerTypeQuantity",
    "fareBasisCodes",
    "passengerFare",
    "endorsements",
    "tpaExtensions",
    "fareInfos"
})
public class PTCFareBreakdownType {

    @XmlElement(name = "PassengerTypeQuantity", required = true)
    protected PassengerTypeQuantityType passengerTypeQuantity;
    @XmlElement(name = "FareBasisCodes", required = true)
    protected FareBasisCodes fareBasisCodes;
    @XmlElement(name = "PassengerFare", required = true)
    protected FareType passengerFare;
    @XmlElement(name = "Endorsements")
    protected Endorsements endorsements;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensions tpaExtensions;
    @XmlElement(name = "FareInfos")
    protected FareInfos fareInfos;
    @XmlAttribute(name = "PricingSource")
    protected String pricingSource;
    @XmlAttribute(name = "PrivateFareType")
    protected String privateFareType;
    @XmlAttribute(name = "LastTicketDate")
    protected String lastTicketDate;
    @XmlAttribute(name = "PreviousExchangeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar previousExchangeDate;
    @XmlAttribute(name = "ReissueExchange")
    protected Integer reissueExchange;

    /**
     * Gets the value of the passengerTypeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerTypeQuantityType }
     *     
     */
    public PassengerTypeQuantityType getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }

    /**
     * Sets the value of the passengerTypeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerTypeQuantityType }
     *     
     */
    public void setPassengerTypeQuantity(PassengerTypeQuantityType value) {
        this.passengerTypeQuantity = value;
    }

    /**
     * Gets the value of the fareBasisCodes property.
     * 
     * @return
     *     possible object is
     *     {@link FareBasisCodes }
     *     
     */
    public FareBasisCodes getFareBasisCodes() {
        return fareBasisCodes;
    }

    /**
     * Sets the value of the fareBasisCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareBasisCodes }
     *     
     */
    public void setFareBasisCodes(FareBasisCodes value) {
        this.fareBasisCodes = value;
    }

    /**
     * Gets the value of the passengerFare property.
     * 
     * @return
     *     possible object is
     *     {@link FareType }
     *     
     */
    public FareType getPassengerFare() {
        return passengerFare;
    }

    /**
     * Sets the value of the passengerFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType }
     *     
     */
    public void setPassengerFare(FareType value) {
        this.passengerFare = value;
    }

    /**
     * Gets the value of the endorsements property.
     * 
     * @return
     *     possible object is
     *     {@link Endorsements }
     *     
     */
    public Endorsements getEndorsements() {
        return endorsements;
    }

    /**
     * Sets the value of the endorsements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Endorsements }
     *     
     */
    public void setEndorsements(Endorsements value) {
        this.endorsements = value;
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
     * Gets the value of the fareInfos property.
     * 
     * @return
     *     possible object is
     *     {@link FareInfos }
     *     
     */
    public FareInfos getFareInfos() {
        return fareInfos;
    }

    /**
     * Sets the value of the fareInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareInfos }
     *     
     */
    public void setFareInfos(FareInfos value) {
        this.fareInfos = value;
    }

    /**
     * Gets the value of the pricingSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingSource() {
        return pricingSource;
    }

    /**
     * Sets the value of the pricingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingSource(String value) {
        this.pricingSource = value;
    }

    /**
     * Gets the value of the privateFareType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateFareType() {
        return privateFareType;
    }

    /**
     * Sets the value of the privateFareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateFareType(String value) {
        this.privateFareType = value;
    }

    /**
     * Gets the value of the lastTicketDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastTicketDate() {
        return lastTicketDate;
    }

    /**
     * Sets the value of the lastTicketDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTicketDate(String value) {
        this.lastTicketDate = value;
    }

    /**
     * Gets the value of the previousExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreviousExchangeDate() {
        return previousExchangeDate;
    }

    /**
     * Sets the value of the previousExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreviousExchangeDate(XMLGregorianCalendar value) {
        this.previousExchangeDate = value;
    }

    /**
     * Gets the value of the reissueExchange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReissueExchange() {
        return reissueExchange;
    }

    /**
     * Sets the value of the reissueExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReissueExchange(Integer value) {
        this.reissueExchange = value;
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
     *         &lt;element name="Endorsement" maxOccurs="9" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TPA_Extensions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="NonRefundableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NonEndorsableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "endorsement",
        "tpaExtensions"
    })
    public static class Endorsements {

        @XmlElement(name = "Endorsement")
        protected List<Endorsement> endorsement;
        @XmlElement(name = "TPA_Extensions")
        protected String tpaExtensions;
        @XmlAttribute(name = "NonRefundableIndicator")
        protected Boolean nonRefundableIndicator;
        @XmlAttribute(name = "NonEndorsableIndicator")
        protected Boolean nonEndorsableIndicator;

        /**
         * Gets the value of the endorsement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the endorsement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEndorsement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Endorsement }
         * 
         * 
         */
        public List<Endorsement> getEndorsement() {
            if (endorsement == null) {
                endorsement = new ArrayList<Endorsement>();
            }
            return this.endorsement;
        }

        /**
         * Gets the value of the tpaExtensions property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTPAExtensions() {
            return tpaExtensions;
        }

        /**
         * Sets the value of the tpaExtensions property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTPAExtensions(String value) {
            this.tpaExtensions = value;
        }

        /**
         * Gets the value of the nonRefundableIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonRefundableIndicator() {
            return nonRefundableIndicator;
        }

        /**
         * Sets the value of the nonRefundableIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonRefundableIndicator(Boolean value) {
            this.nonRefundableIndicator = value;
        }

        /**
         * Gets the value of the nonEndorsableIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonEndorsableIndicator() {
            return nonEndorsableIndicator;
        }

        /**
         * Sets the value of the nonEndorsableIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonEndorsableIndicator(Boolean value) {
            this.nonEndorsableIndicator = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Endorsement
            extends FreeTextType
        {


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
     *         &lt;element name="FareBasisCode" maxOccurs="400">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength1to16">
     *                 &lt;attribute name="PrivateFareType">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;length value="1"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="AccountCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to20" />
     *                 &lt;attribute name="Mileage" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="BookingCode">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;length value="1"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="AvailabilityBreak" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="DepartureAirportCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="ArrivalAirportCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="FareComponentBeginAirport" type="{http://www.opentravel.org/OTA/2003/05}AirportCode" />
     *                 &lt;attribute name="FareComponentEndAirport" type="{http://www.opentravel.org/OTA/2003/05}AirportCode" />
     *                 &lt;attribute name="FareComponentDirectionality" type="{http://www.opentravel.org/OTA/2003/05}FareDirectionality" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
        "fareBasisCode"
    })
    public static class FareBasisCodes {

        @XmlElement(name = "FareBasisCode", required = true)
        protected List<FareBasisCode> fareBasisCode;

        /**
         * Gets the value of the fareBasisCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareBasisCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareBasisCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareBasisCode }
         * 
         * 
         */
        public List<FareBasisCode> getFareBasisCode() {
            if (fareBasisCode == null) {
                fareBasisCode = new ArrayList<FareBasisCode>();
            }
            return this.fareBasisCode;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength1to16">
         *       &lt;attribute name="PrivateFareType">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;length value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="AccountCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to20" />
         *       &lt;attribute name="Mileage" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="BookingCode">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;length value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="AvailabilityBreak" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="DepartureAirportCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="ArrivalAirportCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="FareComponentBeginAirport" type="{http://www.opentravel.org/OTA/2003/05}AirportCode" />
         *       &lt;attribute name="FareComponentEndAirport" type="{http://www.opentravel.org/OTA/2003/05}AirportCode" />
         *       &lt;attribute name="FareComponentDirectionality" type="{http://www.opentravel.org/OTA/2003/05}FareDirectionality" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class FareBasisCode {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "PrivateFareType")
            protected String privateFareType;
            @XmlAttribute(name = "AccountCode")
            protected String accountCode;
            @XmlAttribute(name = "Mileage")
            protected Integer mileage;
            @XmlAttribute(name = "BookingCode")
            protected String bookingCode;
            @XmlAttribute(name = "AvailabilityBreak")
            protected Boolean availabilityBreak;
            @XmlAttribute(name = "DepartureAirportCode")
            @XmlSchemaType(name = "anySimpleType")
            protected String departureAirportCode;
            @XmlAttribute(name = "ArrivalAirportCode")
            @XmlSchemaType(name = "anySimpleType")
            protected String arrivalAirportCode;
            @XmlAttribute(name = "FareComponentBeginAirport")
            protected String fareComponentBeginAirport;
            @XmlAttribute(name = "FareComponentEndAirport")
            protected String fareComponentEndAirport;
            @XmlAttribute(name = "FareComponentDirectionality")
            protected FareDirectionality fareComponentDirectionality;

            /**
             * Used for Character Strings, length 1 to 16
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the privateFareType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrivateFareType() {
                return privateFareType;
            }

            /**
             * Sets the value of the privateFareType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrivateFareType(String value) {
                this.privateFareType = value;
            }

            /**
             * Gets the value of the accountCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountCode() {
                return accountCode;
            }

            /**
             * Sets the value of the accountCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountCode(String value) {
                this.accountCode = value;
            }

            /**
             * Gets the value of the mileage property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMileage() {
                return mileage;
            }

            /**
             * Sets the value of the mileage property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMileage(Integer value) {
                this.mileage = value;
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
             * Gets the value of the availabilityBreak property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAvailabilityBreak() {
                return availabilityBreak;
            }

            /**
             * Sets the value of the availabilityBreak property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAvailabilityBreak(Boolean value) {
                this.availabilityBreak = value;
            }

            /**
             * Gets the value of the departureAirportCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartureAirportCode() {
                return departureAirportCode;
            }

            /**
             * Sets the value of the departureAirportCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartureAirportCode(String value) {
                this.departureAirportCode = value;
            }

            /**
             * Gets the value of the arrivalAirportCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArrivalAirportCode() {
                return arrivalAirportCode;
            }

            /**
             * Sets the value of the arrivalAirportCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArrivalAirportCode(String value) {
                this.arrivalAirportCode = value;
            }

            /**
             * Gets the value of the fareComponentBeginAirport property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFareComponentBeginAirport() {
                return fareComponentBeginAirport;
            }

            /**
             * Sets the value of the fareComponentBeginAirport property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFareComponentBeginAirport(String value) {
                this.fareComponentBeginAirport = value;
            }

            /**
             * Gets the value of the fareComponentEndAirport property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFareComponentEndAirport() {
                return fareComponentEndAirport;
            }

            /**
             * Sets the value of the fareComponentEndAirport property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFareComponentEndAirport(String value) {
                this.fareComponentEndAirport = value;
            }

            /**
             * Gets the value of the fareComponentDirectionality property.
             * 
             * @return
             *     possible object is
             *     {@link FareDirectionality }
             *     
             */
            public FareDirectionality getFareComponentDirectionality() {
                return fareComponentDirectionality;
            }

            /**
             * Sets the value of the fareComponentDirectionality property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareDirectionality }
             *     
             */
            public void setFareComponentDirectionality(FareDirectionality value) {
                this.fareComponentDirectionality = value;
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
     *         &lt;element name="FareInfo" maxOccurs="10">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FareReference" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8"/>
     *                   &lt;element name="RuleInfo" type="{http://www.opentravel.org/OTA/2003/05}RuleInfoType" minOccurs="0"/>
     *                   &lt;element name="MarketingAirline" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="DepartureAirport" type="{http://www.opentravel.org/OTA/2003/05}ResponseLocationType" minOccurs="0"/>
     *                   &lt;element name="ArrivalAirport" type="{http://www.opentravel.org/OTA/2003/05}ResponseLocationType" minOccurs="0"/>
     *                   &lt;element name="TPA_Extensions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SeatsRemaining" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="BelowMin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Cabin" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Cabin" type="{http://www.w3.org/2001/XMLSchema}string" default="Economy" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="FareNote" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="FareTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="PriorityLevel" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="ContentID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Meal" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Rule" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}int" />
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
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}NegotiatedFareAttributes"/>
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
        "fareInfo"
    })
    public static class FareInfos {

        @XmlElement(name = "FareInfo", required = true)
        protected List<FareInfo> fareInfo;

        /**
         * Gets the value of the fareInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareInfo }
         * 
         * 
         */
        public List<FareInfo> getFareInfo() {
            if (fareInfo == null) {
                fareInfo = new ArrayList<FareInfo>();
            }
            return this.fareInfo;
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
         *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FareReference" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8"/>
         *         &lt;element name="RuleInfo" type="{http://www.opentravel.org/OTA/2003/05}RuleInfoType" minOccurs="0"/>
         *         &lt;element name="MarketingAirline" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="DepartureAirport" type="{http://www.opentravel.org/OTA/2003/05}ResponseLocationType" minOccurs="0"/>
         *         &lt;element name="ArrivalAirport" type="{http://www.opentravel.org/OTA/2003/05}ResponseLocationType" minOccurs="0"/>
         *         &lt;element name="TPA_Extensions" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SeatsRemaining" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="BelowMin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Cabin" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Cabin" type="{http://www.w3.org/2001/XMLSchema}string" default="Economy" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="FareNote" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="FareTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="PriorityLevel" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="ContentID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Meal" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Rule" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}int" />
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}NegotiatedFareAttributes"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "departureDate",
            "fareReference",
            "ruleInfo",
            "marketingAirline",
            "departureAirport",
            "arrivalAirport",
            "tpaExtensions"
        })
        public static class FareInfo {

            @XmlElement(name = "DepartureDate")
            protected String departureDate;
            @XmlElement(name = "FareReference", required = true)
            protected String fareReference;
            @XmlElement(name = "RuleInfo")
            protected RuleInfoType ruleInfo;
            @XmlElement(name = "MarketingAirline")
            protected List<CompanyNameType> marketingAirline;
            @XmlElement(name = "DepartureAirport")
            protected ResponseLocationType departureAirport;
            @XmlElement(name = "ArrivalAirport")
            protected ResponseLocationType arrivalAirport;
            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensions tpaExtensions;
            @XmlAttribute(name = "NegotiatedFare")
            protected Boolean negotiatedFare;
            @XmlAttribute(name = "NegotiatedFareCode")
            protected String negotiatedFareCode;

            /**
             * Gets the value of the departureDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartureDate() {
                return departureDate;
            }

            /**
             * Sets the value of the departureDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartureDate(String value) {
                this.departureDate = value;
            }

            /**
             * Gets the value of the fareReference property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFareReference() {
                return fareReference;
            }

            /**
             * Sets the value of the fareReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFareReference(String value) {
                this.fareReference = value;
            }

            /**
             * Gets the value of the ruleInfo property.
             * 
             * @return
             *     possible object is
             *     {@link RuleInfoType }
             *     
             */
            public RuleInfoType getRuleInfo() {
                return ruleInfo;
            }

            /**
             * Sets the value of the ruleInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link RuleInfoType }
             *     
             */
            public void setRuleInfo(RuleInfoType value) {
                this.ruleInfo = value;
            }

            /**
             * Gets the value of the marketingAirline property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the marketingAirline property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMarketingAirline().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CompanyNameType }
             * 
             * 
             */
            public List<CompanyNameType> getMarketingAirline() {
                if (marketingAirline == null) {
                    marketingAirline = new ArrayList<CompanyNameType>();
                }
                return this.marketingAirline;
            }

            /**
             * Gets the value of the departureAirport property.
             * 
             * @return
             *     possible object is
             *     {@link ResponseLocationType }
             *     
             */
            public ResponseLocationType getDepartureAirport() {
                return departureAirport;
            }

            /**
             * Sets the value of the departureAirport property.
             * 
             * @param value
             *     allowed object is
             *     {@link ResponseLocationType }
             *     
             */
            public void setDepartureAirport(ResponseLocationType value) {
                this.departureAirport = value;
            }

            /**
             * Gets the value of the arrivalAirport property.
             * 
             * @return
             *     possible object is
             *     {@link ResponseLocationType }
             *     
             */
            public ResponseLocationType getArrivalAirport() {
                return arrivalAirport;
            }

            /**
             * Sets the value of the arrivalAirport property.
             * 
             * @param value
             *     allowed object is
             *     {@link ResponseLocationType }
             *     
             */
            public void setArrivalAirport(ResponseLocationType value) {
                this.arrivalAirport = value;
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
             * Gets the value of the negotiatedFare property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isNegotiatedFare() {
                if (negotiatedFare == null) {
                    return false;
                } else {
                    return negotiatedFare;
                }
            }

            /**
             * Sets the value of the negotiatedFare property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setNegotiatedFare(Boolean value) {
                this.negotiatedFare = value;
            }

            /**
             * Gets the value of the negotiatedFareCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNegotiatedFareCode() {
                return negotiatedFareCode;
            }

            /**
             * Sets the value of the negotiatedFareCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNegotiatedFareCode(String value) {
                this.negotiatedFareCode = value;
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
             *         &lt;element name="SeatsRemaining" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="BelowMin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Cabin" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Cabin" type="{http://www.w3.org/2001/XMLSchema}string" default="Economy" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="FareNote" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="FareTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="PriorityLevel" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="ContentID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Meal" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Rule" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}int" />
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
                "seatsRemaining",
                "cabin",
                "fareNote",
                "meal",
                "rule"
            })
            public static class TPAExtensions {

                @XmlElement(name = "SeatsRemaining")
                protected SeatsRemaining seatsRemaining;
                @XmlElement(name = "Cabin")
                protected Cabin cabin;
                @XmlElement(name = "FareNote")
                protected List<FareNote> fareNote;
                @XmlElement(name = "Meal")
                protected Meal meal;
                @XmlElement(name = "Rule")
                protected List<Rule> rule;

                /**
                 * Gets the value of the seatsRemaining property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SeatsRemaining }
                 *     
                 */
                public SeatsRemaining getSeatsRemaining() {
                    return seatsRemaining;
                }

                /**
                 * Sets the value of the seatsRemaining property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SeatsRemaining }
                 *     
                 */
                public void setSeatsRemaining(SeatsRemaining value) {
                    this.seatsRemaining = value;
                }

                /**
                 * Gets the value of the cabin property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Cabin }
                 *     
                 */
                public Cabin getCabin() {
                    return cabin;
                }

                /**
                 * Sets the value of the cabin property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Cabin }
                 *     
                 */
                public void setCabin(Cabin value) {
                    this.cabin = value;
                }

                /**
                 * Gets the value of the fareNote property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the fareNote property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFareNote().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FareNote }
                 * 
                 * 
                 */
                public List<FareNote> getFareNote() {
                    if (fareNote == null) {
                        fareNote = new ArrayList<FareNote>();
                    }
                    return this.fareNote;
                }

                /**
                 * Gets the value of the meal property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Meal }
                 *     
                 */
                public Meal getMeal() {
                    return meal;
                }

                /**
                 * Sets the value of the meal property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Meal }
                 *     
                 */
                public void setMeal(Meal value) {
                    this.meal = value;
                }

                /**
                 * Gets the value of the rule property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the rule property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRule().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Rule }
                 * 
                 * 
                 */
                public List<Rule> getRule() {
                    if (rule == null) {
                        rule = new ArrayList<Rule>();
                    }
                    return this.rule;
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
                 *       &lt;attribute name="Cabin" type="{http://www.w3.org/2001/XMLSchema}string" default="Economy" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Cabin {

                    @XmlAttribute(name = "Cabin")
                    protected String cabin;

                    /**
                     * Gets the value of the cabin property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCabin() {
                        if (cabin == null) {
                            return "Economy";
                        } else {
                            return cabin;
                        }
                    }

                    /**
                     * Sets the value of the cabin property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCabin(String value) {
                        this.cabin = value;
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
                 *       &lt;attribute name="FareTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="PriorityLevel" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="ContentID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class FareNote {

                    @XmlAttribute(name = "FareTypeName")
                    protected String fareTypeName;
                    @XmlAttribute(name = "PriorityLevel")
                    protected Integer priorityLevel;
                    @XmlAttribute(name = "ContentID")
                    protected String contentID;

                    /**
                     * Gets the value of the fareTypeName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFareTypeName() {
                        return fareTypeName;
                    }

                    /**
                     * Sets the value of the fareTypeName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFareTypeName(String value) {
                        this.fareTypeName = value;
                    }

                    /**
                     * Gets the value of the priorityLevel property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getPriorityLevel() {
                        return priorityLevel;
                    }

                    /**
                     * Sets the value of the priorityLevel property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setPriorityLevel(Integer value) {
                        this.priorityLevel = value;
                    }

                    /**
                     * Gets the value of the contentID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getContentID() {
                        return contentID;
                    }

                    /**
                     * Sets the value of the contentID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setContentID(String value) {
                        this.contentID = value;
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
                public static class Meal {

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
                 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Rule {

                    @XmlAttribute(name = "Type")
                    protected String type;
                    @XmlAttribute(name = "ID")
                    protected Integer id;

                    /**
                     * Gets the value of the type property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * Sets the value of the type property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                    /**
                     * Gets the value of the id property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getID() {
                        return id;
                    }

                    /**
                     * Sets the value of the id property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setID(Integer value) {
                        this.id = value;
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
                 *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="BelowMin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class SeatsRemaining {

                    @XmlAttribute(name = "Number")
                    protected Integer number;
                    @XmlAttribute(name = "BelowMin")
                    protected Boolean belowMin;

                    /**
                     * Gets the value of the number property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getNumber() {
                        return number;
                    }

                    /**
                     * Sets the value of the number property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setNumber(Integer value) {
                        this.number = value;
                    }

                    /**
                     * Gets the value of the belowMin property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isBelowMin() {
                        return belowMin;
                    }

                    /**
                     * Sets the value of the belowMin property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setBelowMin(Boolean value) {
                        this.belowMin = value;
                    }

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
     *         &lt;element name="FareCalcLine" type="{http://www.opentravel.org/OTA/2003/05}FareCalcLineType" minOccurs="0"/>
     *         &lt;element name="FareType" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
        "fareCalcLine",
        "fareType"
    })
    public static class TPAExtensions {

        @XmlElement(name = "FareCalcLine")
        protected FareCalcLineType fareCalcLine;
        @XmlElement(name = "FareType")
        protected FareType fareType;

        /**
         * Gets the value of the fareCalcLine property.
         * 
         * @return
         *     possible object is
         *     {@link FareCalcLineType }
         *     
         */
        public FareCalcLineType getFareCalcLine() {
            return fareCalcLine;
        }

        /**
         * Sets the value of the fareCalcLine property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareCalcLineType }
         *     
         */
        public void setFareCalcLine(FareCalcLineType value) {
            this.fareCalcLine = value;
        }

        /**
         * Gets the value of the fareType property.
         * 
         * @return
         *     possible object is
         *     {@link FareType }
         *     
         */
        public FareType getFareType() {
            return fareType;
        }

        /**
         * Sets the value of the fareType property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareType }
         *     
         */
        public void setFareType(FareType value) {
            this.fareType = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class FareType {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Name")
            protected String name;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

        }

    }

}
