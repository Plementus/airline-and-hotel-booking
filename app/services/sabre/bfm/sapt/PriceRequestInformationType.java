
package services.sabre.bfm.sapt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Identify pricing source, if negotiated fares are requested and if it is a reprice request.
 * 
 * <p>Java class for PriceRequestInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceRequestInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="NegotiatedFareCode" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Supplier" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;element name="TPA_Extensions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListAirGroup"/>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="AccountCode" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to20" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="TPA_Extensions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PublicFare" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PrivateFare" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Priority" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Price">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Priority" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                           &lt;minInclusive value="1"/>
 *                                           &lt;maxInclusive value="4"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DirectFlights">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Priority" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                           &lt;minInclusive value="1"/>
 *                                           &lt;maxInclusive value="4"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Time">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Priority" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                           &lt;minInclusive value="1"/>
 *                                           &lt;maxInclusive value="4"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Vendor">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Priority" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                           &lt;minInclusive value="1"/>
 *                                           &lt;maxInclusive value="4"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Indicators" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RetainFare" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="MinMaxStay" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RefundPenalty" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ResTicketing" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TravelPolicy" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PromoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CustomerType" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="REGULAR"/>
 *                                 &lt;enumeration value="TVLYPREF"/>
 *                                 &lt;enumeration value="PREFELITE"/>
 *                                 &lt;enumeration value="LOYALTY"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MultipleTravelerGroups" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ItinerariesPerGroup" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BrandedFareIndicators" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ReturnCheapestUnbrandedFare" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="SingleBrandedFare" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="MultipleBrandedFares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PassengerStatus" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;sequence>
 *                               &lt;element name="StateCode" type="{http://www.opentravel.org/OTA/2003/05}StateCodeType" minOccurs="0"/>
 *                               &lt;element name="CountryCode" type="{http://www.opentravel.org/OTA/2003/05}ISO3166"/>
 *                             &lt;/sequence>
 *                             &lt;element name="CityCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3"/>
 *                           &lt;/choice>
 *                           &lt;attribute name="Type" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="R"/>
 *                                 &lt;enumeration value="E"/>
 *                                 &lt;enumeration value="N"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PointOfSaleOverride" type="{http://www.opentravel.org/OTA/2003/05}PointOfSaleOverrideType" minOccurs="0"/>
 *                   &lt;element name="PointOfTicketingOverride" type="{http://www.opentravel.org/OTA/2003/05}PointOfTicketingOverrideType" minOccurs="0"/>
 *                   &lt;element name="OBFees" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="RType" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="TType" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FareBreaksAtLegs" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FareAdjustment" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.opentravel.org/OTA/2003/05}FloatSignedCountOrPercentage" />
 *                           &lt;attribute name="Currency" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
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
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceRequestAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceRequestInformationType", propOrder = {
    "negotiatedFareCodeOrAccountCode",
    "tpaExtensions"
})
public class PriceRequestInformationType {

    @XmlElements({
        @XmlElement(name = "NegotiatedFareCode", type = NegotiatedFareCode.class),
        @XmlElement(name = "AccountCode", type = AccountCode.class)
    })
    protected List<Object> negotiatedFareCodeOrAccountCode;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensions tpaExtensions;
    @XmlAttribute(name = "FareQualifier")
    protected String fareQualifier;
    @XmlAttribute(name = "NegotiatedFaresOnly")
    protected Boolean negotiatedFaresOnly;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "PricingSource")
    protected RequestPricingSourceType pricingSource;
    @XmlAttribute(name = "Reprice")
    protected Boolean reprice;
    @XmlAttribute(name = "ProcessThruFaresOnly")
    protected Boolean processThruFaresOnly;
    @XmlAttribute(name = "PurchaseDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar purchaseDate;
    @XmlAttribute(name = "NetFaresUsed")
    protected Boolean netFaresUsed;

    /**
     * Gets the value of the negotiatedFareCodeOrAccountCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the negotiatedFareCodeOrAccountCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNegotiatedFareCodeOrAccountCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NegotiatedFareCode }
     * {@link AccountCode }
     * 
     * 
     */
    public List<Object> getNegotiatedFareCodeOrAccountCode() {
        if (negotiatedFareCodeOrAccountCode == null) {
            negotiatedFareCodeOrAccountCode = new ArrayList<Object>();
        }
        return this.negotiatedFareCodeOrAccountCode;
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
     * Gets the value of the fareQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareQualifier() {
        return fareQualifier;
    }

    /**
     * Sets the value of the fareQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareQualifier(String value) {
        this.fareQualifier = value;
    }

    /**
     * Gets the value of the negotiatedFaresOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegotiatedFaresOnly() {
        return negotiatedFaresOnly;
    }

    /**
     * Sets the value of the negotiatedFaresOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegotiatedFaresOnly(Boolean value) {
        this.negotiatedFaresOnly = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the pricingSource property.
     * 
     * @return
     *     possible object is
     *     {@link RequestPricingSourceType }
     *     
     */
    public RequestPricingSourceType getPricingSource() {
        return pricingSource;
    }

    /**
     * Sets the value of the pricingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestPricingSourceType }
     *     
     */
    public void setPricingSource(RequestPricingSourceType value) {
        this.pricingSource = value;
    }

    /**
     * Gets the value of the reprice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReprice() {
        return reprice;
    }

    /**
     * Sets the value of the reprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReprice(Boolean value) {
        this.reprice = value;
    }

    /**
     * Gets the value of the processThruFaresOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessThruFaresOnly() {
        return processThruFaresOnly;
    }

    /**
     * Sets the value of the processThruFaresOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessThruFaresOnly(Boolean value) {
        this.processThruFaresOnly = value;
    }

    /**
     * Gets the value of the purchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Sets the value of the purchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurchaseDate(XMLGregorianCalendar value) {
        this.purchaseDate = value;
    }

    /**
     * Gets the value of the netFaresUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetFaresUsed() {
        return netFaresUsed;
    }

    /**
     * Sets the value of the netFaresUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetFaresUsed(Boolean value) {
        this.netFaresUsed = value;
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
     *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to20" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AccountCode {

        @XmlAttribute(name = "Code", required = true)
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
     *       &lt;sequence>
     *         &lt;element name="Supplier" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="TPA_Extensions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListAirGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class NegotiatedFareCode {

        @XmlElementRefs({
            @XmlElementRef(name = "TPA_Extensions", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "Supplier", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class, required = false)
        })
        @XmlMixed
        protected List<Serializable> content;
        @XmlAttribute(name = "SecondaryCode")
        protected String secondaryCode;
        @XmlAttribute(name = "SupplierCode")
        protected String supplierCode;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;
        @XmlAttribute(name = "Quantity")
        protected Integer quantity;

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
         * {@link JAXBElement }{@code <}{@link CompanyNameType }{@code >}
         * {@link String }
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
         * Gets the value of the secondaryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecondaryCode() {
            return secondaryCode;
        }

        /**
         * Sets the value of the secondaryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecondaryCode(String value) {
            this.secondaryCode = value;
        }

        /**
         * Gets the value of the supplierCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSupplierCode() {
            return supplierCode;
        }

        /**
         * Sets the value of the supplierCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSupplierCode(String value) {
            this.supplierCode = value;
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
         * Gets the value of the codeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeContext() {
            return codeContext;
        }

        /**
         * Sets the value of the codeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
        }

        /**
         * Gets the value of the uri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURI() {
            return uri;
        }

        /**
         * Sets the value of the uri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURI(String value) {
            this.uri = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setQuantity(Integer value) {
            this.quantity = value;
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
     *         &lt;element name="PublicFare" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PrivateFare" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Priority" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Price">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Priority" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                                 &lt;minInclusive value="1"/>
     *                                 &lt;maxInclusive value="4"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DirectFlights">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Priority" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                                 &lt;minInclusive value="1"/>
     *                                 &lt;maxInclusive value="4"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Time">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Priority" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                                 &lt;minInclusive value="1"/>
     *                                 &lt;maxInclusive value="4"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Vendor">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Priority" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                                 &lt;minInclusive value="1"/>
     *                                 &lt;maxInclusive value="4"/>
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
     *         &lt;element name="Indicators" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RetainFare" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="MinMaxStay" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RefundPenalty" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ResTicketing" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TravelPolicy" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PromoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CustomerType" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="REGULAR"/>
     *                       &lt;enumeration value="TVLYPREF"/>
     *                       &lt;enumeration value="PREFELITE"/>
     *                       &lt;enumeration value="LOYALTY"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MultipleTravelerGroups" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ItinerariesPerGroup" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BrandedFareIndicators" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ReturnCheapestUnbrandedFare" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="SingleBrandedFare" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="MultipleBrandedFares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PassengerStatus" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;sequence>
     *                     &lt;element name="StateCode" type="{http://www.opentravel.org/OTA/2003/05}StateCodeType" minOccurs="0"/>
     *                     &lt;element name="CountryCode" type="{http://www.opentravel.org/OTA/2003/05}ISO3166"/>
     *                   &lt;/sequence>
     *                   &lt;element name="CityCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3"/>
     *                 &lt;/choice>
     *                 &lt;attribute name="Type" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="R"/>
     *                       &lt;enumeration value="E"/>
     *                       &lt;enumeration value="N"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PointOfSaleOverride" type="{http://www.opentravel.org/OTA/2003/05}PointOfSaleOverrideType" minOccurs="0"/>
     *         &lt;element name="PointOfTicketingOverride" type="{http://www.opentravel.org/OTA/2003/05}PointOfTicketingOverrideType" minOccurs="0"/>
     *         &lt;element name="OBFees" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="RType" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="TType" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FareBreaksAtLegs" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FareAdjustment" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.opentravel.org/OTA/2003/05}FloatSignedCountOrPercentage" />
     *                 &lt;attribute name="Currency" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
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
        "publicFare",
        "privateFare",
        "priority",
        "indicators",
        "promoID",
        "customerType",
        "multipleTravelerGroups",
        "brandedFareIndicators",
        "passengerStatus",
        "pointOfSaleOverride",
        "pointOfTicketingOverride",
        "obFees",
        "fareBreaksAtLegs",
        "fareAdjustment"
    })
    public static class TPAExtensions {

        @XmlElement(name = "PublicFare")
        protected PublicFare publicFare;
        @XmlElement(name = "PrivateFare")
        protected PrivateFare privateFare;
        @XmlElement(name = "Priority")
        protected Priority priority;
        @XmlElement(name = "Indicators")
        protected Indicators indicators;
        @XmlElement(name = "PromoID")
        protected String promoID;
        @XmlElement(name = "CustomerType")
        protected CustomerType customerType;
        @XmlElement(name = "MultipleTravelerGroups")
        protected MultipleTravelerGroups multipleTravelerGroups;
        @XmlElement(name = "BrandedFareIndicators")
        protected BrandedFareIndicators brandedFareIndicators;
        @XmlElement(name = "PassengerStatus")
        protected PassengerStatus passengerStatus;
        @XmlElement(name = "PointOfSaleOverride")
        protected PointOfSaleOverrideType pointOfSaleOverride;
        @XmlElement(name = "PointOfTicketingOverride")
        protected PointOfTicketingOverrideType pointOfTicketingOverride;
        @XmlElement(name = "OBFees")
        protected OBFees obFees;
        @XmlElement(name = "FareBreaksAtLegs")
        protected FareBreaksAtLegs fareBreaksAtLegs;
        @XmlElement(name = "FareAdjustment")
        protected FareAdjustment fareAdjustment;

        /**
         * Gets the value of the publicFare property.
         * 
         * @return
         *     possible object is
         *     {@link PublicFare }
         *     
         */
        public PublicFare getPublicFare() {
            return publicFare;
        }

        /**
         * Sets the value of the publicFare property.
         * 
         * @param value
         *     allowed object is
         *     {@link PublicFare }
         *     
         */
        public void setPublicFare(PublicFare value) {
            this.publicFare = value;
        }

        /**
         * Gets the value of the privateFare property.
         * 
         * @return
         *     possible object is
         *     {@link PrivateFare }
         *     
         */
        public PrivateFare getPrivateFare() {
            return privateFare;
        }

        /**
         * Sets the value of the privateFare property.
         * 
         * @param value
         *     allowed object is
         *     {@link PrivateFare }
         *     
         */
        public void setPrivateFare(PrivateFare value) {
            this.privateFare = value;
        }

        /**
         * Gets the value of the priority property.
         * 
         * @return
         *     possible object is
         *     {@link Priority }
         *     
         */
        public Priority getPriority() {
            return priority;
        }

        /**
         * Sets the value of the priority property.
         * 
         * @param value
         *     allowed object is
         *     {@link Priority }
         *     
         */
        public void setPriority(Priority value) {
            this.priority = value;
        }

        /**
         * Gets the value of the indicators property.
         * 
         * @return
         *     possible object is
         *     {@link Indicators }
         *     
         */
        public Indicators getIndicators() {
            return indicators;
        }

        /**
         * Sets the value of the indicators property.
         * 
         * @param value
         *     allowed object is
         *     {@link Indicators }
         *     
         */
        public void setIndicators(Indicators value) {
            this.indicators = value;
        }

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
         * Gets the value of the customerType property.
         * 
         * @return
         *     possible object is
         *     {@link CustomerType }
         *     
         */
        public CustomerType getCustomerType() {
            return customerType;
        }

        /**
         * Sets the value of the customerType property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustomerType }
         *     
         */
        public void setCustomerType(CustomerType value) {
            this.customerType = value;
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
         * Gets the value of the brandedFareIndicators property.
         * 
         * @return
         *     possible object is
         *     {@link BrandedFareIndicators }
         *     
         */
        public BrandedFareIndicators getBrandedFareIndicators() {
            return brandedFareIndicators;
        }

        /**
         * Sets the value of the brandedFareIndicators property.
         * 
         * @param value
         *     allowed object is
         *     {@link BrandedFareIndicators }
         *     
         */
        public void setBrandedFareIndicators(BrandedFareIndicators value) {
            this.brandedFareIndicators = value;
        }

        /**
         * Gets the value of the passengerStatus property.
         * 
         * @return
         *     possible object is
         *     {@link PassengerStatus }
         *     
         */
        public PassengerStatus getPassengerStatus() {
            return passengerStatus;
        }

        /**
         * Sets the value of the passengerStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link PassengerStatus }
         *     
         */
        public void setPassengerStatus(PassengerStatus value) {
            this.passengerStatus = value;
        }

        /**
         * Gets the value of the pointOfSaleOverride property.
         * 
         * @return
         *     possible object is
         *     {@link PointOfSaleOverrideType }
         *     
         */
        public PointOfSaleOverrideType getPointOfSaleOverride() {
            return pointOfSaleOverride;
        }

        /**
         * Sets the value of the pointOfSaleOverride property.
         * 
         * @param value
         *     allowed object is
         *     {@link PointOfSaleOverrideType }
         *     
         */
        public void setPointOfSaleOverride(PointOfSaleOverrideType value) {
            this.pointOfSaleOverride = value;
        }

        /**
         * Gets the value of the pointOfTicketingOverride property.
         * 
         * @return
         *     possible object is
         *     {@link PointOfTicketingOverrideType }
         *     
         */
        public PointOfTicketingOverrideType getPointOfTicketingOverride() {
            return pointOfTicketingOverride;
        }

        /**
         * Sets the value of the pointOfTicketingOverride property.
         * 
         * @param value
         *     allowed object is
         *     {@link PointOfTicketingOverrideType }
         *     
         */
        public void setPointOfTicketingOverride(PointOfTicketingOverrideType value) {
            this.pointOfTicketingOverride = value;
        }

        /**
         * Gets the value of the obFees property.
         * 
         * @return
         *     possible object is
         *     {@link OBFees }
         *     
         */
        public OBFees getOBFees() {
            return obFees;
        }

        /**
         * Sets the value of the obFees property.
         * 
         * @param value
         *     allowed object is
         *     {@link OBFees }
         *     
         */
        public void setOBFees(OBFees value) {
            this.obFees = value;
        }

        /**
         * Gets the value of the fareBreaksAtLegs property.
         * 
         * @return
         *     possible object is
         *     {@link FareBreaksAtLegs }
         *     
         */
        public FareBreaksAtLegs getFareBreaksAtLegs() {
            return fareBreaksAtLegs;
        }

        /**
         * Sets the value of the fareBreaksAtLegs property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareBreaksAtLegs }
         *     
         */
        public void setFareBreaksAtLegs(FareBreaksAtLegs value) {
            this.fareBreaksAtLegs = value;
        }

        /**
         * Gets the value of the fareAdjustment property.
         * 
         * @return
         *     possible object is
         *     {@link FareAdjustment }
         *     
         */
        public FareAdjustment getFareAdjustment() {
            return fareAdjustment;
        }

        /**
         * Sets the value of the fareAdjustment property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareAdjustment }
         *     
         */
        public void setFareAdjustment(FareAdjustment value) {
            this.fareAdjustment = value;
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
         *         &lt;element name="ReturnCheapestUnbrandedFare" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="SingleBrandedFare" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="MultipleBrandedFares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "returnCheapestUnbrandedFare"
        })
        public static class BrandedFareIndicators {

            @XmlElement(name = "ReturnCheapestUnbrandedFare")
            protected ReturnCheapestUnbrandedFare returnCheapestUnbrandedFare;
            @XmlAttribute(name = "SingleBrandedFare")
            protected Boolean singleBrandedFare;
            @XmlAttribute(name = "MultipleBrandedFares")
            protected Boolean multipleBrandedFares;

            /**
             * Gets the value of the returnCheapestUnbrandedFare property.
             * 
             * @return
             *     possible object is
             *     {@link ReturnCheapestUnbrandedFare }
             *     
             */
            public ReturnCheapestUnbrandedFare getReturnCheapestUnbrandedFare() {
                return returnCheapestUnbrandedFare;
            }

            /**
             * Sets the value of the returnCheapestUnbrandedFare property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReturnCheapestUnbrandedFare }
             *     
             */
            public void setReturnCheapestUnbrandedFare(ReturnCheapestUnbrandedFare value) {
                this.returnCheapestUnbrandedFare = value;
            }

            /**
             * Gets the value of the singleBrandedFare property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSingleBrandedFare() {
                return singleBrandedFare;
            }

            /**
             * Sets the value of the singleBrandedFare property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSingleBrandedFare(Boolean value) {
                this.singleBrandedFare = value;
            }

            /**
             * Gets the value of the multipleBrandedFares property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isMultipleBrandedFares() {
                return multipleBrandedFares;
            }

            /**
             * Sets the value of the multipleBrandedFares property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setMultipleBrandedFares(Boolean value) {
                this.multipleBrandedFares = value;
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
             *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ReturnCheapestUnbrandedFare {

                @XmlAttribute(name = "Ind", required = true)
                protected boolean ind;

                /**
                 * Gets the value of the ind property.
                 * 
                 */
                public boolean isInd() {
                    return ind;
                }

                /**
                 * Sets the value of the ind property.
                 * 
                 */
                public void setInd(boolean value) {
                    this.ind = value;
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
         *       &lt;attribute name="Value" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="REGULAR"/>
         *             &lt;enumeration value="TVLYPREF"/>
         *             &lt;enumeration value="PREFELITE"/>
         *             &lt;enumeration value="LOYALTY"/>
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
        public static class CustomerType {

            @XmlAttribute(name = "Value", required = true)
            protected String value;

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
         *       &lt;attribute name="Value" use="required" type="{http://www.opentravel.org/OTA/2003/05}FloatSignedCountOrPercentage" />
         *       &lt;attribute name="Currency" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FareAdjustment {

            @XmlAttribute(name = "Value", required = true)
            protected String value;
            @XmlAttribute(name = "Currency")
            protected String currency;

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
             * Gets the value of the currency property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrency() {
                return currency;
            }

            /**
             * Sets the value of the currency property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrency(String value) {
                this.currency = value;
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
         *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FareBreaksAtLegs {

            @XmlAttribute(name = "Ind")
            protected Boolean ind;

            /**
             * Gets the value of the ind property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isInd() {
                return ind;
            }

            /**
             * Sets the value of the ind property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setInd(Boolean value) {
                this.ind = value;
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
         *         &lt;element name="RetainFare" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="MinMaxStay" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RefundPenalty" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ResTicketing" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TravelPolicy" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
            "retainFare",
            "minMaxStay",
            "refundPenalty",
            "resTicketing",
            "travelPolicy"
        })
        public static class Indicators {

            @XmlElement(name = "RetainFare")
            protected RetainFare retainFare;
            @XmlElement(name = "MinMaxStay")
            protected MinMaxStay minMaxStay;
            @XmlElement(name = "RefundPenalty")
            protected RefundPenalty refundPenalty;
            @XmlElement(name = "ResTicketing")
            protected ResTicketing resTicketing;
            @XmlElement(name = "TravelPolicy")
            protected TravelPolicy travelPolicy;

            /**
             * Gets the value of the retainFare property.
             * 
             * @return
             *     possible object is
             *     {@link RetainFare }
             *     
             */
            public RetainFare getRetainFare() {
                return retainFare;
            }

            /**
             * Sets the value of the retainFare property.
             * 
             * @param value
             *     allowed object is
             *     {@link RetainFare }
             *     
             */
            public void setRetainFare(RetainFare value) {
                this.retainFare = value;
            }

            /**
             * Gets the value of the minMaxStay property.
             * 
             * @return
             *     possible object is
             *     {@link MinMaxStay }
             *     
             */
            public MinMaxStay getMinMaxStay() {
                return minMaxStay;
            }

            /**
             * Sets the value of the minMaxStay property.
             * 
             * @param value
             *     allowed object is
             *     {@link MinMaxStay }
             *     
             */
            public void setMinMaxStay(MinMaxStay value) {
                this.minMaxStay = value;
            }

            /**
             * Gets the value of the refundPenalty property.
             * 
             * @return
             *     possible object is
             *     {@link RefundPenalty }
             *     
             */
            public RefundPenalty getRefundPenalty() {
                return refundPenalty;
            }

            /**
             * Sets the value of the refundPenalty property.
             * 
             * @param value
             *     allowed object is
             *     {@link RefundPenalty }
             *     
             */
            public void setRefundPenalty(RefundPenalty value) {
                this.refundPenalty = value;
            }

            /**
             * Gets the value of the resTicketing property.
             * 
             * @return
             *     possible object is
             *     {@link ResTicketing }
             *     
             */
            public ResTicketing getResTicketing() {
                return resTicketing;
            }

            /**
             * Sets the value of the resTicketing property.
             * 
             * @param value
             *     allowed object is
             *     {@link ResTicketing }
             *     
             */
            public void setResTicketing(ResTicketing value) {
                this.resTicketing = value;
            }

            /**
             * Gets the value of the travelPolicy property.
             * 
             * @return
             *     possible object is
             *     {@link TravelPolicy }
             *     
             */
            public TravelPolicy getTravelPolicy() {
                return travelPolicy;
            }

            /**
             * Sets the value of the travelPolicy property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravelPolicy }
             *     
             */
            public void setTravelPolicy(TravelPolicy value) {
                this.travelPolicy = value;
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
             *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class MinMaxStay {

                @XmlAttribute(name = "Ind", required = true)
                protected boolean ind;

                /**
                 * Gets the value of the ind property.
                 * 
                 */
                public boolean isInd() {
                    return ind;
                }

                /**
                 * Sets the value of the ind property.
                 * 
                 */
                public void setInd(boolean value) {
                    this.ind = value;
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
             *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class RefundPenalty {

                @XmlAttribute(name = "Ind", required = true)
                protected boolean ind;

                /**
                 * Gets the value of the ind property.
                 * 
                 */
                public boolean isInd() {
                    return ind;
                }

                /**
                 * Sets the value of the ind property.
                 * 
                 */
                public void setInd(boolean value) {
                    this.ind = value;
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
             *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ResTicketing {

                @XmlAttribute(name = "Ind", required = true)
                protected boolean ind;

                /**
                 * Gets the value of the ind property.
                 * 
                 */
                public boolean isInd() {
                    return ind;
                }

                /**
                 * Sets the value of the ind property.
                 * 
                 */
                public void setInd(boolean value) {
                    this.ind = value;
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
             *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class RetainFare {

                @XmlAttribute(name = "Ind", required = true)
                protected boolean ind;

                /**
                 * Gets the value of the ind property.
                 * 
                 */
                public boolean isInd() {
                    return ind;
                }

                /**
                 * Sets the value of the ind property.
                 * 
                 */
                public void setInd(boolean value) {
                    this.ind = value;
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
             *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class TravelPolicy {

                @XmlAttribute(name = "Ind", required = true)
                protected boolean ind;

                /**
                 * Gets the value of the ind property.
                 * 
                 */
                public boolean isInd() {
                    return ind;
                }

                /**
                 * Sets the value of the ind property.
                 * 
                 */
                public void setInd(boolean value) {
                    this.ind = value;
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
         *       &lt;attribute name="ItinerariesPerGroup" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
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

            @XmlAttribute(name = "ItinerariesPerGroup")
            protected Integer itinerariesPerGroup;

            /**
             * Gets the value of the itinerariesPerGroup property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getItinerariesPerGroup() {
                return itinerariesPerGroup;
            }

            /**
             * Sets the value of the itinerariesPerGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setItinerariesPerGroup(Integer value) {
                this.itinerariesPerGroup = value;
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
         *       &lt;attribute name="RType" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="TType" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OBFees {

            @XmlAttribute(name = "RType")
            protected Boolean rType;
            @XmlAttribute(name = "TType")
            protected Boolean tType;

            /**
             * Gets the value of the rType property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRType() {
                return rType;
            }

            /**
             * Sets the value of the rType property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRType(Boolean value) {
                this.rType = value;
            }

            /**
             * Gets the value of the tType property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isTType() {
                return tType;
            }

            /**
             * Sets the value of the tType property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setTType(Boolean value) {
                this.tType = value;
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
         *       &lt;choice>
         *         &lt;sequence>
         *           &lt;element name="StateCode" type="{http://www.opentravel.org/OTA/2003/05}StateCodeType" minOccurs="0"/>
         *           &lt;element name="CountryCode" type="{http://www.opentravel.org/OTA/2003/05}ISO3166"/>
         *         &lt;/sequence>
         *         &lt;element name="CityCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3"/>
         *       &lt;/choice>
         *       &lt;attribute name="Type" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="R"/>
         *             &lt;enumeration value="E"/>
         *             &lt;enumeration value="N"/>
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
        @XmlType(name = "", propOrder = {
            "stateCode",
            "countryCode",
            "cityCode"
        })
        public static class PassengerStatus {

            @XmlElement(name = "StateCode")
            protected String stateCode;
            @XmlElement(name = "CountryCode")
            protected String countryCode;
            @XmlElement(name = "CityCode")
            protected String cityCode;
            @XmlAttribute(name = "Type", required = true)
            protected String type;

            /**
             * Gets the value of the stateCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStateCode() {
                return stateCode;
            }

            /**
             * Sets the value of the stateCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStateCode(String value) {
                this.stateCode = value;
            }

            /**
             * Gets the value of the countryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryCode() {
                return countryCode;
            }

            /**
             * Sets the value of the countryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryCode(String value) {
                this.countryCode = value;
            }

            /**
             * Gets the value of the cityCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCityCode() {
                return cityCode;
            }

            /**
             * Sets the value of the cityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCityCode(String value) {
                this.cityCode = value;
            }

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
         *         &lt;element name="Price">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Priority" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *                       &lt;minInclusive value="1"/>
         *                       &lt;maxInclusive value="4"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DirectFlights">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Priority" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *                       &lt;minInclusive value="1"/>
         *                       &lt;maxInclusive value="4"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Time">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Priority" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *                       &lt;minInclusive value="1"/>
         *                       &lt;maxInclusive value="4"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Vendor">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Priority" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *                       &lt;minInclusive value="1"/>
         *                       &lt;maxInclusive value="4"/>
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
            "price",
            "directFlights",
            "time",
            "vendor"
        })
        public static class Priority {

            @XmlElement(name = "Price", required = true)
            protected Price price;
            @XmlElement(name = "DirectFlights", required = true)
            protected DirectFlights directFlights;
            @XmlElement(name = "Time", required = true)
            protected Time time;
            @XmlElement(name = "Vendor", required = true)
            protected Vendor vendor;

            /**
             * Gets the value of the price property.
             * 
             * @return
             *     possible object is
             *     {@link Price }
             *     
             */
            public Price getPrice() {
                return price;
            }

            /**
             * Sets the value of the price property.
             * 
             * @param value
             *     allowed object is
             *     {@link Price }
             *     
             */
            public void setPrice(Price value) {
                this.price = value;
            }

            /**
             * Gets the value of the directFlights property.
             * 
             * @return
             *     possible object is
             *     {@link DirectFlights }
             *     
             */
            public DirectFlights getDirectFlights() {
                return directFlights;
            }

            /**
             * Sets the value of the directFlights property.
             * 
             * @param value
             *     allowed object is
             *     {@link DirectFlights }
             *     
             */
            public void setDirectFlights(DirectFlights value) {
                this.directFlights = value;
            }

            /**
             * Gets the value of the time property.
             * 
             * @return
             *     possible object is
             *     {@link Time }
             *     
             */
            public Time getTime() {
                return time;
            }

            /**
             * Sets the value of the time property.
             * 
             * @param value
             *     allowed object is
             *     {@link Time }
             *     
             */
            public void setTime(Time value) {
                this.time = value;
            }

            /**
             * Gets the value of the vendor property.
             * 
             * @return
             *     possible object is
             *     {@link Vendor }
             *     
             */
            public Vendor getVendor() {
                return vendor;
            }

            /**
             * Sets the value of the vendor property.
             * 
             * @param value
             *     allowed object is
             *     {@link Vendor }
             *     
             */
            public void setVendor(Vendor value) {
                this.vendor = value;
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
             *       &lt;attribute name="Priority" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
             *             &lt;minInclusive value="1"/>
             *             &lt;maxInclusive value="4"/>
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
            public static class DirectFlights {

                @XmlAttribute(name = "Priority", required = true)
                protected int priority;

                /**
                 * Gets the value of the priority property.
                 * 
                 */
                public int getPriority() {
                    return priority;
                }

                /**
                 * Sets the value of the priority property.
                 * 
                 */
                public void setPriority(int value) {
                    this.priority = value;
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
             *       &lt;attribute name="Priority" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
             *             &lt;minInclusive value="1"/>
             *             &lt;maxInclusive value="4"/>
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
            public static class Price {

                @XmlAttribute(name = "Priority", required = true)
                protected int priority;

                /**
                 * Gets the value of the priority property.
                 * 
                 */
                public int getPriority() {
                    return priority;
                }

                /**
                 * Sets the value of the priority property.
                 * 
                 */
                public void setPriority(int value) {
                    this.priority = value;
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
             *       &lt;attribute name="Priority" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
             *             &lt;minInclusive value="1"/>
             *             &lt;maxInclusive value="4"/>
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
            public static class Time {

                @XmlAttribute(name = "Priority", required = true)
                protected int priority;

                /**
                 * Gets the value of the priority property.
                 * 
                 */
                public int getPriority() {
                    return priority;
                }

                /**
                 * Sets the value of the priority property.
                 * 
                 */
                public void setPriority(int value) {
                    this.priority = value;
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
             *       &lt;attribute name="Priority" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
             *             &lt;minInclusive value="1"/>
             *             &lt;maxInclusive value="4"/>
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
            public static class Vendor {

                @XmlAttribute(name = "Priority", required = true)
                protected int priority;

                /**
                 * Gets the value of the priority property.
                 * 
                 */
                public int getPriority() {
                    return priority;
                }

                /**
                 * Sets the value of the priority property.
                 * 
                 */
                public void setPriority(int value) {
                    this.priority = value;
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
         *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PrivateFare {

            @XmlAttribute(name = "Ind")
            protected Boolean ind;

            /**
             * Gets the value of the ind property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isInd() {
                if (ind == null) {
                    return false;
                } else {
                    return ind;
                }
            }

            /**
             * Sets the value of the ind property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setInd(Boolean value) {
                this.ind = value;
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
         *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PublicFare {

            @XmlAttribute(name = "Ind")
            protected Boolean ind;

            /**
             * Gets the value of the ind property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isInd() {
                if (ind == null) {
                    return false;
                } else {
                    return ind;
                }
            }

            /**
             * Sets the value of the ind property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setInd(Boolean value) {
                this.ind = value;
            }

        }

    }

}
