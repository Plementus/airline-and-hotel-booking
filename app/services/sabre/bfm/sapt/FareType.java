
package services.sabre.bfm.sapt;

import java.math.BigDecimal;
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
 * Holds a base fare, tax, total and currency information on a price
 * 
 * <p>Java class for FareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseFare" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType"/>
 *         &lt;element name="NonRefundableBaseFare" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
 *         &lt;element name="FareConstruction" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
 *         &lt;element name="EquivFare" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType">
 *                 &lt;attribute name="EffectivePriceDeviation" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Taxes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FareComponentsTaxes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FareComponentTaxes" type="{http://www.opentravel.org/OTA/2003/05}FareComponentTaxesType" maxOccurs="99"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LegsTaxes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LegTaxes" maxOccurs="99">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99"/>
 *                   &lt;element name="TotalTax" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Fees" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Fee" type="{http://www.opentravel.org/OTA/2003/05}AirFeeType" maxOccurs="9"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OBFees" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OBFee" type="{http://www.opentravel.org/OTA/2003/05}OBFeeType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="TTypeAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RateOfExchange" type="{http://www.opentravel.org/OTA/2003/05}RateOfExchangeType" minOccurs="0"/>
 *         &lt;element name="CurrencyConversions" type="{http://www.opentravel.org/OTA/2003/05}CurrencyConversionsType" minOccurs="0"/>
 *         &lt;element name="TotalFare" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType"/>
 *         &lt;element name="ReissueInfoList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ReissueInfo" type="{http://www.opentravel.org/OTA/2003/05}ReissueInfoType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PenaltiesInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Penalty" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                           &lt;attribute name="Type">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Refund"/>
 *                                 &lt;enumeration value="Exchange"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="Applicability">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="After"/>
 *                                 &lt;enumeration value="Before"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="NonApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                           &lt;attribute name="Cat16Info" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
 *                   &lt;element name="Surcharges" type="{http://www.opentravel.org/OTA/2003/05}SurchargesType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Legs" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Leg" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SummaryPriceInformation">
 *                                     &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="FareStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FareComponents" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FareComponent" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SummaryPriceInformation">
 *                                     &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="ProgramDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="ProgramSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="BrandID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Messages" type="{http://www.opentravel.org/OTA/2003/05}FareMessagesType" minOccurs="0"/>
 *                   &lt;element name="BaggageInformationList" type="{http://www.opentravel.org/OTA/2003/05}BaggageInformationListType" minOccurs="0"/>
 *                   &lt;element name="SellingFareDataList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SellingFareData" type="{http://www.opentravel.org/OTA/2003/05}SellingFareDataType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CommissionData" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="VCCInformation" type="{http://www.opentravel.org/OTA/2003/05}VCCInformationType" maxOccurs="23" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Cat35CommissionPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="Cat35CommissionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="Cat35MarkupAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="CommissionAmountInEquivalent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="ValidatingCarrierCommissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "FareType", propOrder = {
    "baseFare",
    "nonRefundableBaseFare",
    "fareConstruction",
    "equivFare",
    "taxes",
    "fees",
    "obFees",
    "rateOfExchange",
    "currencyConversions",
    "totalFare",
    "reissueInfoList",
    "penaltiesInfo",
    "tpaExtensions"
})
@XmlSeeAlso({
    ItinTotalFareType.class
})
public class FareType {

    @XmlElement(name = "BaseFare", required = true)
    protected CurrencyAmountType baseFare;
    @XmlElement(name = "NonRefundableBaseFare")
    protected CurrencyAmountType nonRefundableBaseFare;
    @XmlElement(name = "FareConstruction")
    protected CurrencyAmountType fareConstruction;
    @XmlElement(name = "EquivFare")
    protected EquivFare equivFare;
    @XmlElement(name = "Taxes")
    protected Taxes taxes;
    @XmlElement(name = "Fees")
    protected Fees fees;
    @XmlElement(name = "OBFees")
    protected OBFees obFees;
    @XmlElement(name = "RateOfExchange")
    protected RateOfExchangeType rateOfExchange;
    @XmlElement(name = "CurrencyConversions")
    protected CurrencyConversionsType currencyConversions;
    @XmlElement(name = "TotalFare", required = true)
    protected CurrencyAmountType totalFare;
    @XmlElement(name = "ReissueInfoList")
    protected ReissueInfoList reissueInfoList;
    @XmlElement(name = "PenaltiesInfo")
    protected PenaltiesInfo penaltiesInfo;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensions tpaExtensions;
    @XmlAttribute(name = "NegotiatedFare")
    protected Boolean negotiatedFare;
    @XmlAttribute(name = "NegotiatedFareCode")
    protected String negotiatedFareCode;

    /**
     * Gets the value of the baseFare property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setBaseFare(CurrencyAmountType value) {
        this.baseFare = value;
    }

    /**
     * Gets the value of the nonRefundableBaseFare property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getNonRefundableBaseFare() {
        return nonRefundableBaseFare;
    }

    /**
     * Sets the value of the nonRefundableBaseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setNonRefundableBaseFare(CurrencyAmountType value) {
        this.nonRefundableBaseFare = value;
    }

    /**
     * Gets the value of the fareConstruction property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getFareConstruction() {
        return fareConstruction;
    }

    /**
     * Sets the value of the fareConstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setFareConstruction(CurrencyAmountType value) {
        this.fareConstruction = value;
    }

    /**
     * Gets the value of the equivFare property.
     * 
     * @return
     *     possible object is
     *     {@link EquivFare }
     *     
     */
    public EquivFare getEquivFare() {
        return equivFare;
    }

    /**
     * Sets the value of the equivFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquivFare }
     *     
     */
    public void setEquivFare(EquivFare value) {
        this.equivFare = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link Taxes }
     *     
     */
    public Taxes getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Taxes }
     *     
     */
    public void setTaxes(Taxes value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link Fees }
     *     
     */
    public Fees getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fees }
     *     
     */
    public void setFees(Fees value) {
        this.fees = value;
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
     * Gets the value of the rateOfExchange property.
     * 
     * @return
     *     possible object is
     *     {@link RateOfExchangeType }
     *     
     */
    public RateOfExchangeType getRateOfExchange() {
        return rateOfExchange;
    }

    /**
     * Sets the value of the rateOfExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateOfExchangeType }
     *     
     */
    public void setRateOfExchange(RateOfExchangeType value) {
        this.rateOfExchange = value;
    }

    /**
     * Gets the value of the currencyConversions property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversionsType }
     *     
     */
    public CurrencyConversionsType getCurrencyConversions() {
        return currencyConversions;
    }

    /**
     * Sets the value of the currencyConversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversionsType }
     *     
     */
    public void setCurrencyConversions(CurrencyConversionsType value) {
        this.currencyConversions = value;
    }

    /**
     * Gets the value of the totalFare property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getTotalFare() {
        return totalFare;
    }

    /**
     * Sets the value of the totalFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setTotalFare(CurrencyAmountType value) {
        this.totalFare = value;
    }

    /**
     * Gets the value of the reissueInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link ReissueInfoList }
     *     
     */
    public ReissueInfoList getReissueInfoList() {
        return reissueInfoList;
    }

    /**
     * Sets the value of the reissueInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReissueInfoList }
     *     
     */
    public void setReissueInfoList(ReissueInfoList value) {
        this.reissueInfoList = value;
    }

    /**
     * Gets the value of the penaltiesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltiesInfo }
     *     
     */
    public PenaltiesInfo getPenaltiesInfo() {
        return penaltiesInfo;
    }

    /**
     * Sets the value of the penaltiesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltiesInfo }
     *     
     */
    public void setPenaltiesInfo(PenaltiesInfo value) {
        this.penaltiesInfo = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType">
     *       &lt;attribute name="EffectivePriceDeviation" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EquivFare
        extends CurrencyAmountType
    {

        @XmlAttribute(name = "EffectivePriceDeviation")
        protected BigDecimal effectivePriceDeviation;

        /**
         * Gets the value of the effectivePriceDeviation property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEffectivePriceDeviation() {
            return effectivePriceDeviation;
        }

        /**
         * Sets the value of the effectivePriceDeviation property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEffectivePriceDeviation(BigDecimal value) {
            this.effectivePriceDeviation = value;
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
     *         &lt;element name="Fee" type="{http://www.opentravel.org/OTA/2003/05}AirFeeType" maxOccurs="9"/>
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
        "fee"
    })
    public static class Fees {

        @XmlElement(name = "Fee", required = true)
        protected List<AirFeeType> fee;

        /**
         * Gets the value of the fee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirFeeType }
         * 
         * 
         */
        public List<AirFeeType> getFee() {
            if (fee == null) {
                fee = new ArrayList<AirFeeType>();
            }
            return this.fee;
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
     *         &lt;element name="OBFee" type="{http://www.opentravel.org/OTA/2003/05}OBFeeType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="TTypeAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "obFee"
    })
    public static class OBFees {

        @XmlElement(name = "OBFee")
        protected List<OBFeeType> obFee;
        @XmlAttribute(name = "TTypeAmount")
        protected BigDecimal tTypeAmount;

        /**
         * Gets the value of the obFee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the obFee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOBFee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OBFeeType }
         * 
         * 
         */
        public List<OBFeeType> getOBFee() {
            if (obFee == null) {
                obFee = new ArrayList<OBFeeType>();
            }
            return this.obFee;
        }

        /**
         * Gets the value of the tTypeAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTTypeAmount() {
            return tTypeAmount;
        }

        /**
         * Sets the value of the tTypeAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTTypeAmount(BigDecimal value) {
            this.tTypeAmount = value;
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
     *         &lt;element name="Penalty" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                 &lt;attribute name="Type">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Refund"/>
     *                       &lt;enumeration value="Exchange"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="Applicability">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="After"/>
     *                       &lt;enumeration value="Before"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="NonApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *                 &lt;attribute name="Cat16Info" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
        "penalty"
    })
    public static class PenaltiesInfo {

        @XmlElement(name = "Penalty", required = true)
        protected List<Penalty> penalty;

        /**
         * Gets the value of the penalty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the penalty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPenalty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Penalty }
         * 
         * 
         */
        public List<Penalty> getPenalty() {
            if (penalty == null) {
                penalty = new ArrayList<Penalty>();
            }
            return this.penalty;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *       &lt;attribute name="Type">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Refund"/>
         *             &lt;enumeration value="Exchange"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="Applicability">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="After"/>
         *             &lt;enumeration value="Before"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="NonApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *       &lt;attribute name="Cat16Info" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Penalty {

            @XmlAttribute(name = "Type")
            protected String type;
            @XmlAttribute(name = "Applicability")
            protected String applicability;
            @XmlAttribute(name = "NonApplicable")
            protected Boolean nonApplicable;
            @XmlAttribute(name = "Cat16Info")
            protected Boolean cat16Info;
            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;

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
             * Gets the value of the applicability property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplicability() {
                return applicability;
            }

            /**
             * Sets the value of the applicability property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplicability(String value) {
                this.applicability = value;
            }

            /**
             * Gets the value of the nonApplicable property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isNonApplicable() {
                if (nonApplicable == null) {
                    return false;
                } else {
                    return nonApplicable;
                }
            }

            /**
             * Sets the value of the nonApplicable property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setNonApplicable(Boolean value) {
                this.nonApplicable = value;
            }

            /**
             * Gets the value of the cat16Info property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isCat16Info() {
                if (cat16Info == null) {
                    return false;
                } else {
                    return cat16Info;
                }
            }

            /**
             * Sets the value of the cat16Info property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCat16Info(Boolean value) {
                this.cat16Info = value;
            }

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAmount(BigDecimal value) {
                this.amount = value;
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
             * Gets the value of the decimalPlaces property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDecimalPlaces() {
                return decimalPlaces;
            }

            /**
             * Sets the value of the decimalPlaces property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDecimalPlaces(BigInteger value) {
                this.decimalPlaces = value;
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
     *         &lt;element name="ReissueInfo" type="{http://www.opentravel.org/OTA/2003/05}ReissueInfoType" maxOccurs="unbounded"/>
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
        "reissueInfo"
    })
    public static class ReissueInfoList {

        @XmlElement(name = "ReissueInfo", required = true)
        protected List<ReissueInfoType> reissueInfo;

        /**
         * Gets the value of the reissueInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reissueInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReissueInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReissueInfoType }
         * 
         * 
         */
        public List<ReissueInfoType> getReissueInfo() {
            if (reissueInfo == null) {
                reissueInfo = new ArrayList<ReissueInfoType>();
            }
            return this.reissueInfo;
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
     *         &lt;element name="Surcharges" type="{http://www.opentravel.org/OTA/2003/05}SurchargesType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Legs" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Leg" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SummaryPriceInformation">
     *                           &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="FareStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FareComponents" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FareComponent" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SummaryPriceInformation">
     *                           &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="ProgramDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="ProgramSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="BrandID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Messages" type="{http://www.opentravel.org/OTA/2003/05}FareMessagesType" minOccurs="0"/>
     *         &lt;element name="BaggageInformationList" type="{http://www.opentravel.org/OTA/2003/05}BaggageInformationListType" minOccurs="0"/>
     *         &lt;element name="SellingFareDataList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SellingFareData" type="{http://www.opentravel.org/OTA/2003/05}SellingFareDataType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CommissionData" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="VCCInformation" type="{http://www.opentravel.org/OTA/2003/05}VCCInformationType" maxOccurs="23" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Cat35CommissionPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="Cat35CommissionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="Cat35MarkupAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="CommissionAmountInEquivalent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="ValidatingCarrierCommissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        "surcharges",
        "legs",
        "fareComponents",
        "messages",
        "baggageInformationList",
        "sellingFareDataList",
        "commissionData"
    })
    public static class TPAExtensions {

        @XmlElement(name = "Surcharges")
        protected List<SurchargesType> surcharges;
        @XmlElement(name = "Legs")
        protected Legs legs;
        @XmlElement(name = "FareComponents")
        protected FareComponents fareComponents;
        @XmlElement(name = "Messages")
        protected FareMessagesType messages;
        @XmlElement(name = "BaggageInformationList")
        protected BaggageInformationListType baggageInformationList;
        @XmlElement(name = "SellingFareDataList")
        protected SellingFareDataList sellingFareDataList;
        @XmlElement(name = "CommissionData")
        protected CommissionData commissionData;

        /**
         * Gets the value of the surcharges property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the surcharges property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSurcharges().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SurchargesType }
         * 
         * 
         */
        public List<SurchargesType> getSurcharges() {
            if (surcharges == null) {
                surcharges = new ArrayList<SurchargesType>();
            }
            return this.surcharges;
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
         * Gets the value of the fareComponents property.
         * 
         * @return
         *     possible object is
         *     {@link FareComponents }
         *     
         */
        public FareComponents getFareComponents() {
            return fareComponents;
        }

        /**
         * Sets the value of the fareComponents property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareComponents }
         *     
         */
        public void setFareComponents(FareComponents value) {
            this.fareComponents = value;
        }

        /**
         * Gets the value of the messages property.
         * 
         * @return
         *     possible object is
         *     {@link FareMessagesType }
         *     
         */
        public FareMessagesType getMessages() {
            return messages;
        }

        /**
         * Sets the value of the messages property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareMessagesType }
         *     
         */
        public void setMessages(FareMessagesType value) {
            this.messages = value;
        }

        /**
         * Gets the value of the baggageInformationList property.
         * 
         * @return
         *     possible object is
         *     {@link BaggageInformationListType }
         *     
         */
        public BaggageInformationListType getBaggageInformationList() {
            return baggageInformationList;
        }

        /**
         * Sets the value of the baggageInformationList property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageInformationListType }
         *     
         */
        public void setBaggageInformationList(BaggageInformationListType value) {
            this.baggageInformationList = value;
        }

        /**
         * Gets the value of the sellingFareDataList property.
         * 
         * @return
         *     possible object is
         *     {@link SellingFareDataList }
         *     
         */
        public SellingFareDataList getSellingFareDataList() {
            return sellingFareDataList;
        }

        /**
         * Sets the value of the sellingFareDataList property.
         * 
         * @param value
         *     allowed object is
         *     {@link SellingFareDataList }
         *     
         */
        public void setSellingFareDataList(SellingFareDataList value) {
            this.sellingFareDataList = value;
        }

        /**
         * Gets the value of the commissionData property.
         * 
         * @return
         *     possible object is
         *     {@link CommissionData }
         *     
         */
        public CommissionData getCommissionData() {
            return commissionData;
        }

        /**
         * Sets the value of the commissionData property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommissionData }
         *     
         */
        public void setCommissionData(CommissionData value) {
            this.commissionData = value;
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
         *         &lt;element name="VCCInformation" type="{http://www.opentravel.org/OTA/2003/05}VCCInformationType" maxOccurs="23" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="Cat35CommissionPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="Cat35CommissionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="Cat35MarkupAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="CommissionAmountInEquivalent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="ValidatingCarrierCommissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "vccInformation"
        })
        public static class CommissionData {

            @XmlElement(name = "VCCInformation")
            protected List<VCCInformationType> vccInformation;
            @XmlAttribute(name = "Cat35CommissionPercentage")
            protected BigDecimal cat35CommissionPercentage;
            @XmlAttribute(name = "Cat35CommissionAmount")
            protected BigDecimal cat35CommissionAmount;
            @XmlAttribute(name = "Cat35MarkupAmount")
            protected BigDecimal cat35MarkupAmount;
            @XmlAttribute(name = "CommissionAmountInEquivalent")
            protected BigDecimal commissionAmountInEquivalent;
            @XmlAttribute(name = "ValidatingCarrierCommissionIndicator")
            protected Boolean validatingCarrierCommissionIndicator;

            /**
             * Gets the value of the vccInformation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the vccInformation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVCCInformation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link VCCInformationType }
             * 
             * 
             */
            public List<VCCInformationType> getVCCInformation() {
                if (vccInformation == null) {
                    vccInformation = new ArrayList<VCCInformationType>();
                }
                return this.vccInformation;
            }

            /**
             * Gets the value of the cat35CommissionPercentage property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCat35CommissionPercentage() {
                return cat35CommissionPercentage;
            }

            /**
             * Sets the value of the cat35CommissionPercentage property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCat35CommissionPercentage(BigDecimal value) {
                this.cat35CommissionPercentage = value;
            }

            /**
             * Gets the value of the cat35CommissionAmount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCat35CommissionAmount() {
                return cat35CommissionAmount;
            }

            /**
             * Sets the value of the cat35CommissionAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCat35CommissionAmount(BigDecimal value) {
                this.cat35CommissionAmount = value;
            }

            /**
             * Gets the value of the cat35MarkupAmount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCat35MarkupAmount() {
                return cat35MarkupAmount;
            }

            /**
             * Sets the value of the cat35MarkupAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCat35MarkupAmount(BigDecimal value) {
                this.cat35MarkupAmount = value;
            }

            /**
             * Gets the value of the commissionAmountInEquivalent property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCommissionAmountInEquivalent() {
                return commissionAmountInEquivalent;
            }

            /**
             * Sets the value of the commissionAmountInEquivalent property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCommissionAmountInEquivalent(BigDecimal value) {
                this.commissionAmountInEquivalent = value;
            }

            /**
             * Gets the value of the validatingCarrierCommissionIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isValidatingCarrierCommissionIndicator() {
                return validatingCarrierCommissionIndicator;
            }

            /**
             * Sets the value of the validatingCarrierCommissionIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setValidatingCarrierCommissionIndicator(Boolean value) {
                this.validatingCarrierCommissionIndicator = value;
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
         *         &lt;element name="FareComponent" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SummaryPriceInformation">
         *                 &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="ProgramDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="ProgramSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="BrandID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
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
            "fareComponent"
        })
        public static class FareComponents {

            @XmlElement(name = "FareComponent", required = true)
            protected List<FareComponent> fareComponent;

            /**
             * Gets the value of the fareComponent property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fareComponent property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFareComponent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareComponent }
             * 
             * 
             */
            public List<FareComponent> getFareComponent() {
                if (fareComponent == null) {
                    fareComponent = new ArrayList<FareComponent>();
                }
                return this.fareComponent;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SummaryPriceInformation">
             *       &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="ProgramDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="ProgramSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="BrandID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class FareComponent
                extends SummaryPriceInformation
            {

                @XmlAttribute(name = "ProgramID")
                protected String programID;
                @XmlAttribute(name = "ProgramDescription")
                protected String programDescription;
                @XmlAttribute(name = "ProgramSystemCode")
                protected String programSystemCode;
                @XmlAttribute(name = "BrandID")
                protected String brandID;
                @XmlAttribute(name = "BrandName")
                protected String brandName;

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
                 * Gets the value of the programDescription property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProgramDescription() {
                    return programDescription;
                }

                /**
                 * Sets the value of the programDescription property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProgramDescription(String value) {
                    this.programDescription = value;
                }

                /**
                 * Gets the value of the programSystemCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProgramSystemCode() {
                    return programSystemCode;
                }

                /**
                 * Sets the value of the programSystemCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProgramSystemCode(String value) {
                    this.programSystemCode = value;
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
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SummaryPriceInformation">
         *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="FareStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
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
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SummaryPriceInformation">
             *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="FareStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Leg
                extends SummaryPriceInformation
            {

                @XmlAttribute(name = "Number")
                protected Integer number;
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
         *         &lt;element name="SellingFareData" type="{http://www.opentravel.org/OTA/2003/05}SellingFareDataType" maxOccurs="unbounded"/>
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
            "sellingFareData"
        })
        public static class SellingFareDataList {

            @XmlElement(name = "SellingFareData", required = true)
            protected List<SellingFareDataType> sellingFareData;

            /**
             * Gets the value of the sellingFareData property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the sellingFareData property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSellingFareData().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SellingFareDataType }
             * 
             * 
             */
            public List<SellingFareDataType> getSellingFareData() {
                if (sellingFareData == null) {
                    sellingFareData = new ArrayList<SellingFareDataType>();
                }
                return this.sellingFareData;
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
     *         &lt;element name="FareComponentsTaxes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FareComponentTaxes" type="{http://www.opentravel.org/OTA/2003/05}FareComponentTaxesType" maxOccurs="99"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LegsTaxes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LegTaxes" maxOccurs="99">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99"/>
     *         &lt;element name="TotalTax" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
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
        "fareComponentsTaxes",
        "legsTaxes",
        "tax",
        "totalTax"
    })
    public static class Taxes {

        @XmlElement(name = "FareComponentsTaxes")
        protected FareComponentsTaxes fareComponentsTaxes;
        @XmlElement(name = "LegsTaxes")
        protected LegsTaxes legsTaxes;
        @XmlElement(name = "Tax", required = true)
        protected List<AirTaxType> tax;
        @XmlElement(name = "TotalTax")
        protected CurrencyAmountType totalTax;

        /**
         * Gets the value of the fareComponentsTaxes property.
         * 
         * @return
         *     possible object is
         *     {@link FareComponentsTaxes }
         *     
         */
        public FareComponentsTaxes getFareComponentsTaxes() {
            return fareComponentsTaxes;
        }

        /**
         * Sets the value of the fareComponentsTaxes property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareComponentsTaxes }
         *     
         */
        public void setFareComponentsTaxes(FareComponentsTaxes value) {
            this.fareComponentsTaxes = value;
        }

        /**
         * Gets the value of the legsTaxes property.
         * 
         * @return
         *     possible object is
         *     {@link LegsTaxes }
         *     
         */
        public LegsTaxes getLegsTaxes() {
            return legsTaxes;
        }

        /**
         * Sets the value of the legsTaxes property.
         * 
         * @param value
         *     allowed object is
         *     {@link LegsTaxes }
         *     
         */
        public void setLegsTaxes(LegsTaxes value) {
            this.legsTaxes = value;
        }

        /**
         * Gets the value of the tax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTax().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirTaxType }
         * 
         * 
         */
        public List<AirTaxType> getTax() {
            if (tax == null) {
                tax = new ArrayList<AirTaxType>();
            }
            return this.tax;
        }

        /**
         * Gets the value of the totalTax property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmountType }
         *     
         */
        public CurrencyAmountType getTotalTax() {
            return totalTax;
        }

        /**
         * Sets the value of the totalTax property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmountType }
         *     
         */
        public void setTotalTax(CurrencyAmountType value) {
            this.totalTax = value;
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
         *         &lt;element name="FareComponentTaxes" type="{http://www.opentravel.org/OTA/2003/05}FareComponentTaxesType" maxOccurs="99"/>
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
            "fareComponentTaxes"
        })
        public static class FareComponentsTaxes {

            @XmlElement(name = "FareComponentTaxes", required = true)
            protected List<FareComponentTaxesType> fareComponentTaxes;

            /**
             * Gets the value of the fareComponentTaxes property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fareComponentTaxes property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFareComponentTaxes().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareComponentTaxesType }
             * 
             * 
             */
            public List<FareComponentTaxesType> getFareComponentTaxes() {
                if (fareComponentTaxes == null) {
                    fareComponentTaxes = new ArrayList<FareComponentTaxesType>();
                }
                return this.fareComponentTaxes;
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
         *         &lt;element name="LegTaxes" maxOccurs="99">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
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
            "legTaxes"
        })
        public static class LegsTaxes {

            @XmlElement(name = "LegTaxes", required = true)
            protected List<LegTaxes> legTaxes;

            /**
             * Gets the value of the legTaxes property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the legTaxes property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLegTaxes().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LegTaxes }
             * 
             * 
             */
            public List<LegTaxes> getLegTaxes() {
                if (legTaxes == null) {
                    legTaxes = new ArrayList<LegTaxes>();
                }
                return this.legTaxes;
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
             *         &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99"/>
             *       &lt;/sequence>
             *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "tax"
            })
            public static class LegTaxes {

                @XmlElement(name = "Tax", required = true)
                protected List<AirTaxType> tax;
                @XmlAttribute(name = "Number")
                protected Integer number;

                /**
                 * Gets the value of the tax property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the tax property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTax().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AirTaxType }
                 * 
                 * 
                 */
                public List<AirTaxType> getTax() {
                    if (tax == null) {
                        tax = new ArrayList<AirTaxType>();
                    }
                    return this.tax;
                }

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

            }

        }

    }

}
