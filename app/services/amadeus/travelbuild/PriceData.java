
package services.amadeus.travelbuild;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PublishedFares" type="{http://traveltalk.com/wsTravelBuild}PublishedFares" minOccurs="0"/>
 *         &lt;element name="NegoFares" type="{http://traveltalk.com/wsTravelBuild}NegoFares" minOccurs="0"/>
 *         &lt;element name="FareDiscount" type="{http://traveltalk.com/wsTravelBuild}FareDiscount" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PassengerTypeQuantity" type="{http://traveltalk.com/wsTravelBuild}PassengerTypeQuantity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PriceType" type="{http://traveltalk.com/wsTravelBuild}PriceDataPriceType" />
 *       &lt;attribute name="AutoTicketing" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ValidatingAirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PricingInstruction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceData", propOrder = {
    "publishedFares",
    "negoFares",
    "fareDiscount",
    "passengerTypeQuantity"
})
public class PriceData {

    @XmlElement(name = "PublishedFares")
    protected PublishedFares publishedFares;
    @XmlElement(name = "NegoFares")
    protected NegoFares negoFares;
    @XmlElement(name = "FareDiscount")
    protected List<FareDiscount> fareDiscount;
    @XmlElement(name = "PassengerTypeQuantity")
    protected List<PassengerTypeQuantity> passengerTypeQuantity;
    @XmlAttribute(name = "PriceType")
    protected PriceDataPriceType priceType;
    @XmlAttribute(name = "AutoTicketing", required = true)
    protected boolean autoTicketing;
    @XmlAttribute(name = "ValidatingAirlineCode")
    protected String validatingAirlineCode;
    @XmlAttribute(name = "PricingInstruction")
    protected String pricingInstruction;

    /**
     * Gets the value of the publishedFares property.
     * 
     * @return
     *     possible object is
     *     {@link PublishedFares }
     *     
     */
    public PublishedFares getPublishedFares() {
        return publishedFares;
    }

    /**
     * Sets the value of the publishedFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublishedFares }
     *     
     */
    public void setPublishedFares(PublishedFares value) {
        this.publishedFares = value;
    }

    /**
     * Gets the value of the negoFares property.
     * 
     * @return
     *     possible object is
     *     {@link NegoFares }
     *     
     */
    public NegoFares getNegoFares() {
        return negoFares;
    }

    /**
     * Sets the value of the negoFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link NegoFares }
     *     
     */
    public void setNegoFares(NegoFares value) {
        this.negoFares = value;
    }

    /**
     * Gets the value of the fareDiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareDiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareDiscount }
     * 
     * 
     */
    public List<FareDiscount> getFareDiscount() {
        if (fareDiscount == null) {
            fareDiscount = new ArrayList<FareDiscount>();
        }
        return this.fareDiscount;
    }

    /**
     * Gets the value of the passengerTypeQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerTypeQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerTypeQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerTypeQuantity }
     * 
     * 
     */
    public List<PassengerTypeQuantity> getPassengerTypeQuantity() {
        if (passengerTypeQuantity == null) {
            passengerTypeQuantity = new ArrayList<PassengerTypeQuantity>();
        }
        return this.passengerTypeQuantity;
    }

    /**
     * Gets the value of the priceType property.
     * 
     * @return
     *     possible object is
     *     {@link PriceDataPriceType }
     *     
     */
    public PriceDataPriceType getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceDataPriceType }
     *     
     */
    public void setPriceType(PriceDataPriceType value) {
        this.priceType = value;
    }

    /**
     * Gets the value of the autoTicketing property.
     * 
     */
    public boolean isAutoTicketing() {
        return autoTicketing;
    }

    /**
     * Sets the value of the autoTicketing property.
     * 
     */
    public void setAutoTicketing(boolean value) {
        this.autoTicketing = value;
    }

    /**
     * Gets the value of the validatingAirlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingAirlineCode() {
        return validatingAirlineCode;
    }

    /**
     * Sets the value of the validatingAirlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatingAirlineCode(String value) {
        this.validatingAirlineCode = value;
    }

    /**
     * Gets the value of the pricingInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingInstruction() {
        return pricingInstruction;
    }

    /**
     * Sets the value of the pricingInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingInstruction(String value) {
        this.pricingInstruction = value;
    }

}
