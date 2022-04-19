
package services.sabre.bfm.altdate;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Pricing Information for an Air Itinerary
 * 
 * <p>Java class for AirItineraryPricingInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirItineraryPricingInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItinTotalFare" type="{http://www.opentravel.org/OTA/2003/05}ItinTotalFareType" minOccurs="0"/>
 *         &lt;element name="PTC_FareBreakdowns" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PTC_FareBreakdown" type="{http://www.opentravel.org/OTA/2003/05}PTCFareBreakdownType" maxOccurs="20"/>
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
 *                             &lt;element name="DepartureAirport" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
 *                             &lt;element name="ArrivalAirport" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
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
 *         &lt;element name="TPA_Extensions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DivideInParty" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Indicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PromoOffer" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="PromoID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="CorpID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ContentID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                   &lt;element name="PromoRedemption" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="PromoID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Eligible" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="ContentID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                   &lt;element name="MultipleTravelerGroups" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="GroupNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="PrimaryGroup" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AncillaryFeeGroups" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AncillaryFeeGroup" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AncillaryFeeItem" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OCFeeType">
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Message" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Message" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Legs" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Leg" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Segment" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="BrandID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="FareStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="FareStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ValidatingCarrier" type="{http://www.opentravel.org/OTA/2003/05}ValidatingCarrierInfoType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareSourceAndTypeAttributes"/>
 *       &lt;attribute name="LastTicketDate" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *       &lt;attribute name="PrivateFareType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="SpanishFamilyDiscountIndicator">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="A"/>
 *             &lt;enumeration value="B"/>
 *             &lt;enumeration value="C"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="FlexibleFareID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirItineraryPricingInfoType", propOrder = {
    "itinTotalFare",
    "ptcFareBreakdowns",
    "fareInfos",
    "tpaExtensions"
})
@XmlSeeAlso({
    PricedItineraryType.AirItineraryPricingInfo.class,
    PricedItineraryType.TPAExtensions.AdditionalFares.AirItineraryPricingInfo.class
})
public class AirItineraryPricingInfoType {

    @XmlElement(name = "ItinTotalFare")
    protected ItinTotalFareType itinTotalFare;
    @XmlElement(name = "PTC_FareBreakdowns")
    protected PTCFareBreakdowns ptcFareBreakdowns;
    @XmlElement(name = "FareInfos")
    protected FareInfos fareInfos;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensions tpaExtensions;
    @XmlAttribute(name = "LastTicketDate")
    protected String lastTicketDate;
    @XmlAttribute(name = "PrivateFareType")
    protected String privateFareType;
    @XmlAttribute(name = "SpanishFamilyDiscountIndicator")
    protected String spanishFamilyDiscountIndicator;
    @XmlAttribute(name = "FlexibleFareID")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger flexibleFareID;
    @XmlAttribute(name = "PricingSource")
    protected String pricingSource;
    @XmlAttribute(name = "PricingSubSource")
    protected String pricingSubSource;
    @XmlAttribute(name = "BrandID")
    protected String brandID;
    @XmlAttribute(name = "FareReturned")
    protected Boolean fareReturned;
    @XmlAttribute(name = "FareStatus")
    protected String fareStatus;
    @XmlAttribute(name = "CachedItin")
    protected Boolean cachedItin;
    @XmlAttribute(name = "CachePartition")
    protected String cachePartition;
    @XmlAttribute(name = "CachePartitionPriority")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cachePartitionPriority;
    @XmlAttribute(name = "CacheVersion")
    protected String cacheVersion;
    @XmlAttribute(name = "TimeToLive")
    protected BigInteger timeToLive;
    @XmlAttribute(name = "AlternateCityOption")
    protected Boolean alternateCityOption;

    /**
     * Gets the value of the itinTotalFare property.
     * 
     * @return
     *     possible object is
     *     {@link ItinTotalFareType }
     *     
     */
    public ItinTotalFareType getItinTotalFare() {
        return itinTotalFare;
    }

    /**
     * Sets the value of the itinTotalFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinTotalFareType }
     *     
     */
    public void setItinTotalFare(ItinTotalFareType value) {
        this.itinTotalFare = value;
    }

    /**
     * Gets the value of the ptcFareBreakdowns property.
     * 
     * @return
     *     possible object is
     *     {@link PTCFareBreakdowns }
     *     
     */
    public PTCFareBreakdowns getPTCFareBreakdowns() {
        return ptcFareBreakdowns;
    }

    /**
     * Sets the value of the ptcFareBreakdowns property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTCFareBreakdowns }
     *     
     */
    public void setPTCFareBreakdowns(PTCFareBreakdowns value) {
        this.ptcFareBreakdowns = value;
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
     * Gets the value of the spanishFamilyDiscountIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpanishFamilyDiscountIndicator() {
        return spanishFamilyDiscountIndicator;
    }

    /**
     * Sets the value of the spanishFamilyDiscountIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpanishFamilyDiscountIndicator(String value) {
        this.spanishFamilyDiscountIndicator = value;
    }

    /**
     * Gets the value of the flexibleFareID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlexibleFareID() {
        return flexibleFareID;
    }

    /**
     * Sets the value of the flexibleFareID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlexibleFareID(BigInteger value) {
        this.flexibleFareID = value;
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
     * Gets the value of the pricingSubSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingSubSource() {
        return pricingSubSource;
    }

    /**
     * Sets the value of the pricingSubSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingSubSource(String value) {
        this.pricingSubSource = value;
    }

    /**
     * Gets the value of the brandID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandID() {
        return brandID;
    }

    /**
     * Sets the value of the brandID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandID(String value) {
        this.brandID = value;
    }

    /**
     * Gets the value of the fareReturned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFareReturned() {
        return fareReturned;
    }

    /**
     * Sets the value of the fareReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFareReturned(Boolean value) {
        this.fareReturned = value;
    }

    /**
     * Gets the value of the fareStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareStatus() {
        return fareStatus;
    }

    /**
     * Sets the value of the fareStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareStatus(String value) {
        this.fareStatus = value;
    }

    /**
     * Gets the value of the cachedItin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCachedItin() {
        if (cachedItin == null) {
            return false;
        } else {
            return cachedItin;
        }
    }

    /**
     * Sets the value of the cachedItin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCachedItin(Boolean value) {
        this.cachedItin = value;
    }

    /**
     * Gets the value of the cachePartition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCachePartition() {
        return cachePartition;
    }

    /**
     * Sets the value of the cachePartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCachePartition(String value) {
        this.cachePartition = value;
    }

    /**
     * Gets the value of the cachePartitionPriority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCachePartitionPriority() {
        return cachePartitionPriority;
    }

    /**
     * Sets the value of the cachePartitionPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCachePartitionPriority(BigInteger value) {
        this.cachePartitionPriority = value;
    }

    /**
     * Gets the value of the cacheVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCacheVersion() {
        return cacheVersion;
    }

    /**
     * Sets the value of the cacheVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCacheVersion(String value) {
        this.cacheVersion = value;
    }

    /**
     * Gets the value of the timeToLive property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeToLive() {
        return timeToLive;
    }

    /**
     * Sets the value of the timeToLive property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeToLive(BigInteger value) {
        this.timeToLive = value;
    }

    /**
     * Gets the value of the alternateCityOption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAlternateCityOption() {
        if (alternateCityOption == null) {
            return false;
        } else {
            return alternateCityOption;
        }
    }

    /**
     * Sets the value of the alternateCityOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlternateCityOption(Boolean value) {
        this.alternateCityOption = value;
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
     *                   &lt;element name="DepartureAirport" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
     *                   &lt;element name="ArrivalAirport" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
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
         *         &lt;element name="DepartureAirport" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
         *         &lt;element name="ArrivalAirport" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
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
            protected LocationType departureAirport;
            @XmlElement(name = "ArrivalAirport")
            protected LocationType arrivalAirport;
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
             *     {@link LocationType }
             *     
             */
            public LocationType getDepartureAirport() {
                return departureAirport;
            }

            /**
             * Sets the value of the departureAirport property.
             * 
             * @param value
             *     allowed object is
             *     {@link LocationType }
             *     
             */
            public void setDepartureAirport(LocationType value) {
                this.departureAirport = value;
            }

            /**
             * Gets the value of the arrivalAirport property.
             * 
             * @return
             *     possible object is
             *     {@link LocationType }
             *     
             */
            public LocationType getArrivalAirport() {
                return arrivalAirport;
            }

            /**
             * Sets the value of the arrivalAirport property.
             * 
             * @param value
             *     allowed object is
             *     {@link LocationType }
             *     
             */
            public void setArrivalAirport(LocationType value) {
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
     *         &lt;element name="PTC_FareBreakdown" type="{http://www.opentravel.org/OTA/2003/05}PTCFareBreakdownType" maxOccurs="20"/>
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
        "ptcFareBreakdown"
    })
    public static class PTCFareBreakdowns {

        @XmlElement(name = "PTC_FareBreakdown", required = true)
        protected List<PTCFareBreakdownType> ptcFareBreakdown;

        /**
         * Gets the value of the ptcFareBreakdown property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ptcFareBreakdown property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPTCFareBreakdown().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PTCFareBreakdownType }
         * 
         * 
         */
        public List<PTCFareBreakdownType> getPTCFareBreakdown() {
            if (ptcFareBreakdown == null) {
                ptcFareBreakdown = new ArrayList<PTCFareBreakdownType>();
            }
            return this.ptcFareBreakdown;
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
     *         &lt;element name="DivideInParty" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Indicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PromoOffer" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="PromoID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="CorpID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ContentID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *         &lt;element name="PromoRedemption" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="PromoID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Eligible" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="ContentID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *         &lt;element name="MultipleTravelerGroups" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="GroupNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="PrimaryGroup" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AncillaryFeeGroups" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AncillaryFeeGroup" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AncillaryFeeItem" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OCFeeType">
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Message" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Message" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Legs" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Leg" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Segment" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="BrandID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="FareStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="FareStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ValidatingCarrier" type="{http://www.opentravel.org/OTA/2003/05}ValidatingCarrierInfoType" minOccurs="0"/>
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
        "divideInParty",
        "promoOffer",
        "fareNote",
        "promoRedemption",
        "rule",
        "multipleTravelerGroups",
        "ancillaryFeeGroups",
        "legs",
        "validatingCarrier"
    })
    public static class TPAExtensions {

        @XmlElement(name = "DivideInParty")
        protected DivideInParty divideInParty;
        @XmlElement(name = "PromoOffer")
        protected PromoOffer promoOffer;
        @XmlElement(name = "FareNote")
        protected List<FareNote> fareNote;
        @XmlElement(name = "PromoRedemption")
        protected PromoRedemption promoRedemption;
        @XmlElement(name = "Rule")
        protected List<Rule> rule;
        @XmlElement(name = "MultipleTravelerGroups")
        protected MultipleTravelerGroups multipleTravelerGroups;
        @XmlElement(name = "AncillaryFeeGroups")
        protected AncillaryFeeGroups ancillaryFeeGroups;
        @XmlElement(name = "Legs")
        protected Legs legs;
        @XmlElement(name = "ValidatingCarrier")
        protected ValidatingCarrierInfoType validatingCarrier;

        /**
         * Gets the value of the divideInParty property.
         * 
         * @return
         *     possible object is
         *     {@link DivideInParty }
         *     
         */
        public DivideInParty getDivideInParty() {
            return divideInParty;
        }

        /**
         * Sets the value of the divideInParty property.
         * 
         * @param value
         *     allowed object is
         *     {@link DivideInParty }
         *     
         */
        public void setDivideInParty(DivideInParty value) {
            this.divideInParty = value;
        }

        /**
         * Gets the value of the promoOffer property.
         * 
         * @return
         *     possible object is
         *     {@link PromoOffer }
         *     
         */
        public PromoOffer getPromoOffer() {
            return promoOffer;
        }

        /**
         * Sets the value of the promoOffer property.
         * 
         * @param value
         *     allowed object is
         *     {@link PromoOffer }
         *     
         */
        public void setPromoOffer(PromoOffer value) {
            this.promoOffer = value;
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
         * Gets the value of the promoRedemption property.
         * 
         * @return
         *     possible object is
         *     {@link PromoRedemption }
         *     
         */
        public PromoRedemption getPromoRedemption() {
            return promoRedemption;
        }

        /**
         * Sets the value of the promoRedemption property.
         * 
         * @param value
         *     allowed object is
         *     {@link PromoRedemption }
         *     
         */
        public void setPromoRedemption(PromoRedemption value) {
            this.promoRedemption = value;
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
         * Gets the value of the multipleTravelerGroups property.
         * 
         * @return
         *     possible object is
         *     {@link MultipleTravelerGroups }
         *     
         */
        public MultipleTravelerGroups getMultipleTravelerGroups() {
            return multipleTravelerGroups;
        }

        /**
         * Sets the value of the multipleTravelerGroups property.
         * 
         * @param value
         *     allowed object is
         *     {@link MultipleTravelerGroups }
         *     
         */
        public void setMultipleTravelerGroups(MultipleTravelerGroups value) {
            this.multipleTravelerGroups = value;
        }

        /**
         * Gets the value of the ancillaryFeeGroups property.
         * 
         * @return
         *     possible object is
         *     {@link AncillaryFeeGroups }
         *     
         */
        public AncillaryFeeGroups getAncillaryFeeGroups() {
            return ancillaryFeeGroups;
        }

        /**
         * Sets the value of the ancillaryFeeGroups property.
         * 
         * @param value
         *     allowed object is
         *     {@link AncillaryFeeGroups }
         *     
         */
        public void setAncillaryFeeGroups(AncillaryFeeGroups value) {
            this.ancillaryFeeGroups = value;
        }

        /**
         * Gets the value of the legs property.
         * 
         * @return
         *     possible object is
         *     {@link Legs }
         *     
         */
        public Legs getLegs() {
            return legs;
        }

        /**
         * Sets the value of the legs property.
         * 
         * @param value
         *     allowed object is
         *     {@link Legs }
         *     
         */
        public void setLegs(Legs value) {
            this.legs = value;
        }

        /**
         * Gets the value of the validatingCarrier property.
         * 
         * @return
         *     possible object is
         *     {@link ValidatingCarrierInfoType }
         *     
         */
        public ValidatingCarrierInfoType getValidatingCarrier() {
            return validatingCarrier;
        }

        /**
         * Sets the value of the validatingCarrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link ValidatingCarrierInfoType }
         *     
         */
        public void setValidatingCarrier(ValidatingCarrierInfoType value) {
            this.validatingCarrier = value;
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
         *         &lt;element name="AncillaryFeeGroup" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AncillaryFeeItem" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OCFeeType">
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Message" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Message" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ancillaryFeeGroup"
        })
        public static class AncillaryFeeGroups {

            @XmlElement(name = "AncillaryFeeGroup")
            protected List<AncillaryFeeGroup> ancillaryFeeGroup;
            @XmlAttribute(name = "Message")
            protected String message;

            /**
             * Gets the value of the ancillaryFeeGroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ancillaryFeeGroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAncillaryFeeGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AncillaryFeeGroup }
             * 
             * 
             */
            public List<AncillaryFeeGroup> getAncillaryFeeGroup() {
                if (ancillaryFeeGroup == null) {
                    ancillaryFeeGroup = new ArrayList<AncillaryFeeGroup>();
                }
                return this.ancillaryFeeGroup;
            }

            /**
             * Gets the value of the message property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMessage() {
                return message;
            }

            /**
             * Sets the value of the message property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMessage(String value) {
                this.message = value;
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
             *         &lt;element name="AncillaryFeeItem" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OCFeeType">
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Message" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "ancillaryFeeItem"
            })
            public static class AncillaryFeeGroup {

                @XmlElement(name = "AncillaryFeeItem")
                protected List<AncillaryFeeItem> ancillaryFeeItem;
                @XmlAttribute(name = "Code", required = true)
                protected String code;
                @XmlAttribute(name = "Name", required = true)
                protected String name;
                @XmlAttribute(name = "Message")
                protected String message;

                /**
                 * Gets the value of the ancillaryFeeItem property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the ancillaryFeeItem property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAncillaryFeeItem().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AncillaryFeeItem }
                 * 
                 * 
                 */
                public List<AncillaryFeeItem> getAncillaryFeeItem() {
                    if (ancillaryFeeItem == null) {
                        ancillaryFeeItem = new ArrayList<AncillaryFeeItem>();
                    }
                    return this.ancillaryFeeItem;
                }

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

                /**
                 * Gets the value of the message property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMessage() {
                    return message;
                }

                /**
                 * Sets the value of the message property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMessage(String value) {
                    this.message = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OCFeeType">
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class AncillaryFeeItem
                    extends OCFeeType
                {


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
         *       &lt;attribute name="Indicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DivideInParty {

            @XmlAttribute(name = "Indicator")
            protected Boolean indicator;

            /**
             * Gets the value of the indicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIndicator() {
                return indicator;
            }

            /**
             * Sets the value of the indicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIndicator(Boolean value) {
                this.indicator = value;
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
         *       &lt;sequence>
         *         &lt;element name="Leg" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Segment" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="BrandID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="FareStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="FareStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "leg"
        })
        public static class Legs {

            @XmlElement(name = "Leg", required = true)
            protected List<Leg> leg;

            /**
             * Gets the value of the leg property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the leg property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLeg().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Leg }
             * 
             * 
             */
            public List<Leg> getLeg() {
                if (leg == null) {
                    leg = new ArrayList<Leg>();
                }
                return this.leg;
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
             *         &lt;element name="Segment" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="BrandID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="FareStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="FareStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "segment"
            })
            public static class Leg {

                @XmlElement(name = "Segment")
                protected List<Segment> segment;
                @XmlAttribute(name = "Number")
                protected String number;
                @XmlAttribute(name = "FareStatus")
                protected String fareStatus;

                /**
                 * Gets the value of the segment property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the segment property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSegment().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Segment }
                 * 
                 * 
                 */
                public List<Segment> getSegment() {
                    if (segment == null) {
                        segment = new ArrayList<Segment>();
                    }
                    return this.segment;
                }

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

                /**
                 * Gets the value of the fareStatus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFareStatus() {
                    return fareStatus;
                }

                /**
                 * Sets the value of the fareStatus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFareStatus(String value) {
                    this.fareStatus = value;
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
                 *       &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="BrandID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="FareStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Segment {

                    @XmlAttribute(name = "Number")
                    protected Integer number;
                    @XmlAttribute(name = "ProgramID")
                    protected String programID;
                    @XmlAttribute(name = "BrandID")
                    protected String brandID;
                    @XmlAttribute(name = "BrandName")
                    protected String brandName;
                    @XmlAttribute(name = "FareStatus")
                    protected String fareStatus;

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
                     * Gets the value of the programID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProgramID() {
                        return programID;
                    }

                    /**
                     * Sets the value of the programID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProgramID(String value) {
                        this.programID = value;
                    }

                    /**
                     * Gets the value of the brandID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBrandID() {
                        return brandID;
                    }

                    /**
                     * Sets the value of the brandID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBrandID(String value) {
                        this.brandID = value;
                    }

                    /**
                     * Gets the value of the brandName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBrandName() {
                        return brandName;
                    }

                    /**
                     * Sets the value of the brandName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBrandName(String value) {
                        this.brandName = value;
                    }

                    /**
                     * Gets the value of the fareStatus property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFareStatus() {
                        return fareStatus;
                    }

                    /**
                     * Sets the value of the fareStatus property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFareStatus(String value) {
                        this.fareStatus = value;
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
         *       &lt;attribute name="GroupNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="PrimaryGroup" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MultipleTravelerGroups {

            @XmlAttribute(name = "GroupNumber")
            protected BigInteger groupNumber;
            @XmlAttribute(name = "PrimaryGroup")
            protected Boolean primaryGroup;

            /**
             * Gets the value of the groupNumber property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getGroupNumber() {
                return groupNumber;
            }

            /**
             * Sets the value of the groupNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setGroupNumber(BigInteger value) {
                this.groupNumber = value;
            }

            /**
             * Gets the value of the primaryGroup property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPrimaryGroup() {
                return primaryGroup;
            }

            /**
             * Sets the value of the primaryGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPrimaryGroup(Boolean value) {
                this.primaryGroup = value;
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
         *       &lt;attribute name="PromoID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="CorpID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class PromoOffer {

            @XmlAttribute(name = "PromoID")
            protected String promoID;
            @XmlAttribute(name = "CorpID")
            protected String corpID;
            @XmlAttribute(name = "ContentID")
            protected String contentID;

            /**
             * Gets the value of the promoID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPromoID() {
                return promoID;
            }

            /**
             * Sets the value of the promoID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPromoID(String value) {
                this.promoID = value;
            }

            /**
             * Gets the value of the corpID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCorpID() {
                return corpID;
            }

            /**
             * Sets the value of the corpID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCorpID(String value) {
                this.corpID = value;
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
         *       &lt;attribute name="PromoID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Eligible" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        public static class PromoRedemption {

            @XmlAttribute(name = "PromoID")
            protected String promoID;
            @XmlAttribute(name = "Eligible")
            protected Boolean eligible;
            @XmlAttribute(name = "ContentID")
            protected String contentID;

            /**
             * Gets the value of the promoID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPromoID() {
                return promoID;
            }

            /**
             * Sets the value of the promoID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPromoID(String value) {
                this.promoID = value;
            }

            /**
             * Gets the value of the eligible property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isEligible() {
                return eligible;
            }

            /**
             * Sets the value of the eligible property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setEligible(Boolean value) {
                this.eligible = value;
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

    }

}
