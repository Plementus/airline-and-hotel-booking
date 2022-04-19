
package services.sabre.bfm;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeFareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeFareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeFareAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeFareType")
public class ExchangeFareType {

    @XmlAttribute(name = "BaseFareAmount", required = true)
    protected BigDecimal baseFareAmount;
    @XmlAttribute(name = "BaseFareCurrency", required = true)
    protected String baseFareCurrency;
    @XmlAttribute(name = "FareCalcCurrency", required = true)
    protected String fareCalcCurrency;
    @XmlAttribute(name = "ValidatingCarrier")
    protected String validatingCarrier;
    @XmlAttribute(name = "ROE")
    protected Double roe;

    /**
     * Gets the value of the baseFareAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseFareAmount() {
        return baseFareAmount;
    }

    /**
     * Sets the value of the baseFareAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseFareAmount(BigDecimal value) {
        this.baseFareAmount = value;
    }

    /**
     * Gets the value of the baseFareCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseFareCurrency() {
        return baseFareCurrency;
    }

    /**
     * Sets the value of the baseFareCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseFareCurrency(String value) {
        this.baseFareCurrency = value;
    }

    /**
     * Gets the value of the fareCalcCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCalcCurrency() {
        return fareCalcCurrency;
    }

    /**
     * Sets the value of the fareCalcCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCalcCurrency(String value) {
        this.fareCalcCurrency = value;
    }

    /**
     * Gets the value of the validatingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingCarrier() {
        return validatingCarrier;
    }

    /**
     * Sets the value of the validatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatingCarrier(String value) {
        this.validatingCarrier = value;
    }

    /**
     * Gets the value of the roe property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getROE() {
        return roe;
    }

    /**
     * Sets the value of the roe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setROE(Double value) {
        this.roe = value;
    }

}
