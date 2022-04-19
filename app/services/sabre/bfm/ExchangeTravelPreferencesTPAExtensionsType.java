
package services.sabre.bfm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeTravelPreferencesTPA_ExtensionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeTravelPreferencesTPA_ExtensionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.opentravel.org/OTA/2003/05}TravelPreferencesTPA_ExtensionsTaxesGroup"/>
 *         &lt;element name="SettlementMethod" type="{http://www.opentravel.org/OTA/2003/05}SettlementMethodType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeTravelPreferencesTPA_ExtensionsType", propOrder = {
    "exemptAllTaxes",
    "exemptAllTaxesAndFees",
    "taxes",
    "exemptTax",
    "settlementMethod"
})
public class ExchangeTravelPreferencesTPAExtensionsType {

    @XmlElement(name = "ExemptAllTaxes")
    protected ExemptAllTaxes exemptAllTaxes;
    @XmlElement(name = "ExemptAllTaxesAndFees")
    protected ExemptAllTaxesAndFees exemptAllTaxesAndFees;
    @XmlElement(name = "Taxes")
    protected Taxes taxes;
    @XmlElement(name = "ExemptTax")
    protected List<TaxCodeType> exemptTax;
    @XmlElement(name = "SettlementMethod")
    protected String settlementMethod;

    /**
     * Gets the value of the exemptAllTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link ExemptAllTaxes }
     *     
     */
    public ExemptAllTaxes getExemptAllTaxes() {
        return exemptAllTaxes;
    }

    /**
     * Sets the value of the exemptAllTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExemptAllTaxes }
     *     
     */
    public void setExemptAllTaxes(ExemptAllTaxes value) {
        this.exemptAllTaxes = value;
    }

    /**
     * Gets the value of the exemptAllTaxesAndFees property.
     * 
     * @return
     *     possible object is
     *     {@link ExemptAllTaxesAndFees }
     *     
     */
    public ExemptAllTaxesAndFees getExemptAllTaxesAndFees() {
        return exemptAllTaxesAndFees;
    }

    /**
     * Sets the value of the exemptAllTaxesAndFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExemptAllTaxesAndFees }
     *     
     */
    public void setExemptAllTaxesAndFees(ExemptAllTaxesAndFees value) {
        this.exemptAllTaxesAndFees = value;
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
     * Gets the value of the exemptTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exemptTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExemptTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxCodeType }
     * 
     * 
     */
    public List<TaxCodeType> getExemptTax() {
        if (exemptTax == null) {
            exemptTax = new ArrayList<TaxCodeType>();
        }
        return this.exemptTax;
    }

    /**
     * Gets the value of the settlementMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementMethod() {
        return settlementMethod;
    }

    /**
     * Sets the value of the settlementMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementMethod(String value) {
        this.settlementMethod = value;
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
     *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ExemptAllTaxes {

        @XmlAttribute(name = "Value", required = true)
        protected boolean value;

        /**
         * Gets the value of the value property.
         * 
         */
        public boolean isValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(boolean value) {
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
     *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ExemptAllTaxesAndFees {

        @XmlAttribute(name = "Value", required = true)
        protected boolean value;

        /**
         * Gets the value of the value property.
         * 
         */
        public boolean isValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(boolean value) {
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
     *       &lt;sequence>
     *         &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}TaxCodeAmountType" maxOccurs="unbounded" minOccurs="0"/>
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
        "tax"
    })
    public static class Taxes {

        @XmlElement(name = "Tax")
        protected List<TaxCodeAmountType> tax;

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
         * {@link TaxCodeAmountType }
         * 
         * 
         */
        public List<TaxCodeAmountType> getTax() {
            if (tax == null) {
                tax = new ArrayList<TaxCodeAmountType>();
            }
            return this.tax;
        }

    }

}
