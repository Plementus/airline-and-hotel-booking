
package services.amadeus.travelbuild;

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
 *         &lt;element name="PassengerTypeQuantity" type="{http://traveltalk.com/wsTravelBuild}PassengerTypeQuantity" minOccurs="0"/>
 *         &lt;element name="FareBasisCodes" type="{http://traveltalk.com/wsTravelBuild}ArrayOfString1" minOccurs="0"/>
 *         &lt;element name="PassengerFare" type="{http://traveltalk.com/wsTravelBuild}PassengerFare" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PricingSource" type="{http://traveltalk.com/wsTravelBuild}PTC_FareBreakdownPricingSource" />
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
    "passengerFare"
})
public class PTCFareBreakdown {

    @XmlElement(name = "PassengerTypeQuantity")
    protected PassengerTypeQuantity passengerTypeQuantity;
    @XmlElement(name = "FareBasisCodes")
    protected ArrayOfString1 fareBasisCodes;
    @XmlElement(name = "PassengerFare")
    protected PassengerFare passengerFare;
    @XmlAttribute(name = "PricingSource")
    protected PTCFareBreakdownPricingSource pricingSource;

    /**
     * Gets the value of the passengerTypeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerTypeQuantity }
     *     
     */
    public PassengerTypeQuantity getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }

    /**
     * Sets the value of the passengerTypeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerTypeQuantity }
     *     
     */
    public void setPassengerTypeQuantity(PassengerTypeQuantity value) {
        this.passengerTypeQuantity = value;
    }

    /**
     * Gets the value of the fareBasisCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString1 }
     *     
     */
    public ArrayOfString1 getFareBasisCodes() {
        return fareBasisCodes;
    }

    /**
     * Sets the value of the fareBasisCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString1 }
     *     
     */
    public void setFareBasisCodes(ArrayOfString1 value) {
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
