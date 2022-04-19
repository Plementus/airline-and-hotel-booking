
package services.sabre.bfm;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 				Defines the data fields available for air tax.
 * 			
 * 
 * <p>Java class for AirTaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirTaxType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MinMaxTaxAttributeGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirTaxReissueAttributeGroup"/>
 *       &lt;attribute name="TaxCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="CarrierCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *       &lt;attribute name="RateUsed" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="StationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirTaxType", propOrder = {
    "value"
})
public class AirTaxType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "TaxCode", required = true)
    protected String taxCode;
    @XmlAttribute(name = "CarrierCode")
    protected String carrierCode;
    @XmlAttribute(name = "RateUsed")
    protected Double rateUsed;
    @XmlAttribute(name = "StationCode")
    protected String stationCode;
    @XmlAttribute(name = "MinAmount")
    protected Double minAmount;
    @XmlAttribute(name = "MaxAmount")
    protected Double maxAmount;
    @XmlAttribute(name = "MinMaxCurrency")
    protected String minMaxCurrency;
    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger decimalPlaces;
    @XmlAttribute(name = "ReissueTaxType")
    protected String reissueTaxType;
    @XmlAttribute(name = "ReissueRestrictionApplies")
    protected Boolean reissueRestrictionApplies;
    @XmlAttribute(name = "ReissueTaxRefundable")
    protected Boolean reissueTaxRefundable;
    @XmlAttribute(name = "ApplyToReissue")
    protected Boolean applyToReissue;
    @XmlAttribute(name = "ReissueMaxAmount")
    protected Double reissueMaxAmount;
    @XmlAttribute(name = "ReissueCurrency")
    protected String reissueCurrency;
    @XmlAttribute(name = "PublishedAmount")
    protected Double publishedAmount;
    @XmlAttribute(name = "PublishedCurrency")
    protected String publishedCurrency;

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
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCode(String value) {
        this.carrierCode = value;
    }

    /**
     * Gets the value of the rateUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRateUsed() {
        return rateUsed;
    }

    /**
     * Sets the value of the rateUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRateUsed(Double value) {
        this.rateUsed = value;
    }

    /**
     * Gets the value of the stationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationCode() {
        return stationCode;
    }

    /**
     * Sets the value of the stationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationCode(String value) {
        this.stationCode = value;
    }

    /**
     * Gets the value of the minAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinAmount() {
        return minAmount;
    }

    /**
     * Sets the value of the minAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinAmount(Double value) {
        this.minAmount = value;
    }

    /**
     * Gets the value of the maxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxAmount() {
        return maxAmount;
    }

    /**
     * Sets the value of the maxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxAmount(Double value) {
        this.maxAmount = value;
    }

    /**
     * Gets the value of the minMaxCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinMaxCurrency() {
        return minMaxCurrency;
    }

    /**
     * Sets the value of the minMaxCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinMaxCurrency(String value) {
        this.minMaxCurrency = value;
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

    /**
     * Gets the value of the reissueTaxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReissueTaxType() {
        return reissueTaxType;
    }

    /**
     * Sets the value of the reissueTaxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReissueTaxType(String value) {
        this.reissueTaxType = value;
    }

    /**
     * Gets the value of the reissueRestrictionApplies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReissueRestrictionApplies() {
        if (reissueRestrictionApplies == null) {
            return false;
        } else {
            return reissueRestrictionApplies;
        }
    }

    /**
     * Sets the value of the reissueRestrictionApplies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReissueRestrictionApplies(Boolean value) {
        this.reissueRestrictionApplies = value;
    }

    /**
     * Gets the value of the reissueTaxRefundable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReissueTaxRefundable() {
        if (reissueTaxRefundable == null) {
            return false;
        } else {
            return reissueTaxRefundable;
        }
    }

    /**
     * Sets the value of the reissueTaxRefundable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReissueTaxRefundable(Boolean value) {
        this.reissueTaxRefundable = value;
    }

    /**
     * Gets the value of the applyToReissue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isApplyToReissue() {
        if (applyToReissue == null) {
            return false;
        } else {
            return applyToReissue;
        }
    }

    /**
     * Sets the value of the applyToReissue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyToReissue(Boolean value) {
        this.applyToReissue = value;
    }

    /**
     * Gets the value of the reissueMaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReissueMaxAmount() {
        return reissueMaxAmount;
    }

    /**
     * Sets the value of the reissueMaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReissueMaxAmount(Double value) {
        this.reissueMaxAmount = value;
    }

    /**
     * Gets the value of the reissueCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReissueCurrency() {
        return reissueCurrency;
    }

    /**
     * Sets the value of the reissueCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReissueCurrency(String value) {
        this.reissueCurrency = value;
    }

    /**
     * Gets the value of the publishedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPublishedAmount() {
        return publishedAmount;
    }

    /**
     * Sets the value of the publishedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPublishedAmount(Double value) {
        this.publishedAmount = value;
    }

    /**
     * Gets the value of the publishedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishedCurrency() {
        return publishedCurrency;
    }

    /**
     * Sets the value of the publishedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishedCurrency(String value) {
        this.publishedCurrency = value;
    }

}
