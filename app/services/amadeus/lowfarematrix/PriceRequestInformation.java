
package services.amadeus.lowfarematrix;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceRequestInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceRequestInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NegotiatedFareCode" type="{http://traveltalk.com/wsLowFareMatrix}NegotiatedFareCode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FareQualifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NegotiatedFaresOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PricingSource" type="{http://traveltalk.com/wsLowFareMatrix}PriceRequestInformationPricingSource" />
 *       &lt;attribute name="Reprice" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceRequestInformation", propOrder = {
    "negotiatedFareCode"
})
public class PriceRequestInformation {

    @XmlElement(name = "NegotiatedFareCode")
    protected List<NegotiatedFareCode> negotiatedFareCode;
    @XmlAttribute(name = "FareQualifier")
    protected String fareQualifier;
    @XmlAttribute(name = "NegotiatedFaresOnly")
    protected Boolean negotiatedFaresOnly;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "PricingSource")
    protected PriceRequestInformationPricingSource pricingSource;
    @XmlAttribute(name = "Reprice")
    protected Boolean reprice;

    /**
     * Gets the value of the negotiatedFareCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the negotiatedFareCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNegotiatedFareCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NegotiatedFareCode }
     * 
     * 
     */
    public List<NegotiatedFareCode> getNegotiatedFareCode() {
        if (negotiatedFareCode == null) {
            negotiatedFareCode = new ArrayList<NegotiatedFareCode>();
        }
        return this.negotiatedFareCode;
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
     *     {@link PriceRequestInformationPricingSource }
     *     
     */
    public PriceRequestInformationPricingSource getPricingSource() {
        return pricingSource;
    }

    /**
     * Sets the value of the pricingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRequestInformationPricingSource }
     *     
     */
    public void setPricingSource(PriceRequestInformationPricingSource value) {
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

}
