
package services.amadeus.lowfarematrix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PTC_FareBreakdown complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PTC_FareBreakdown">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerTypeQuantity" type="{http://traveltalk.com/wsLowFareMatrix}PassengerTypeQuantityRS" minOccurs="0"/>
 *         &lt;element name="FareBasisCodes" type="{http://traveltalk.com/wsLowFareMatrix}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="PassengerFare" type="{http://traveltalk.com/wsLowFareMatrix}PassengerFare" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://traveltalk.com/wsLowFareMatrix}TPA_ExtensionsRS" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PricingSource" type="{http://traveltalk.com/wsLowFareMatrix}PTC_FareBreakdownPricingSource" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTC_FareBreakdown", propOrder = {
    "passengerTypeQuantity",
    "fareBasisCodes",
    "passengerFare",
    "tpaExtensions"
})
public class PTCFareBreakdown {

    @XmlElement(name = "PassengerTypeQuantity")
    protected PassengerTypeQuantityRS passengerTypeQuantity;
    @XmlElement(name = "FareBasisCodes")
    protected ArrayOfString fareBasisCodes;
    @XmlElement(name = "PassengerFare")
    protected PassengerFare passengerFare;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsRS tpaExtensions;
    @XmlAttribute(name = "PricingSource")
    protected PTCFareBreakdownPricingSource pricingSource;

    /**
     * Gets the value of the passengerTypeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerTypeQuantityRS }
     *     
     */
    public PassengerTypeQuantityRS getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }

    /**
     * Sets the value of the passengerTypeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerTypeQuantityRS }
     *     
     */
    public void setPassengerTypeQuantity(PassengerTypeQuantityRS value) {
        this.passengerTypeQuantity = value;
    }

    /**
     * Gets the value of the fareBasisCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getFareBasisCodes() {
        return fareBasisCodes;
    }

    /**
     * Sets the value of the fareBasisCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setFareBasisCodes(ArrayOfString value) {
        this.fareBasisCodes = value;
    }

    /**
     * Gets the value of the passengerFare property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerFare }
     *     
     */
    public PassengerFare getPassengerFare() {
        return passengerFare;
    }

    /**
     * Sets the value of the passengerFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerFare }
     *     
     */
    public void setPassengerFare(PassengerFare value) {
        this.passengerFare = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsRS }
     *     
     */
    public TPAExtensionsRS getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsRS }
     *     
     */
    public void setTPAExtensions(TPAExtensionsRS value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the pricingSource property.
     * 
     * @return
     *     possible object is
     *     {@link PTCFareBreakdownPricingSource }
     *     
     */
    public PTCFareBreakdownPricingSource getPricingSource() {
        return pricingSource;
    }

    /**
     * Sets the value of the pricingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTCFareBreakdownPricingSource }
     *     
     */
    public void setPricingSource(PTCFareBreakdownPricingSource value) {
        this.pricingSource = value;
    }

}
