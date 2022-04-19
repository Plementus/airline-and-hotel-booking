
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PTC_FareBreakdownRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PTC_FareBreakdownRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerTypeQuantity" type="{http://traveltalk.com/wsTravelBuild}PassengerTypeQuantityRS" minOccurs="0"/>
 *         &lt;element name="FareBasisCodes" type="{http://traveltalk.com/wsTravelBuild}ArrayOfString1" minOccurs="0"/>
 *         &lt;element name="PassengerFare" type="{http://traveltalk.com/wsTravelBuild}PassengerFareRS" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://traveltalk.com/wsTravelBuild}TPA_ExtensionsRS" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PricingSource" type="{http://traveltalk.com/wsTravelBuild}PTC_FareBreakdownPricingSource" />
 *       &lt;attribute name="TravelerRefNumberRPHList" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FlightRefNumberRPHList" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTC_FareBreakdownRS", propOrder = {
    "passengerTypeQuantity",
    "fareBasisCodes",
    "passengerFare",
    "tpaExtensions"
})
public class PTCFareBreakdownRS {

    @XmlElement(name = "PassengerTypeQuantity")
    protected PassengerTypeQuantityRS passengerTypeQuantity;
    @XmlElement(name = "FareBasisCodes")
    protected ArrayOfString1 fareBasisCodes;
    @XmlElement(name = "PassengerFare")
    protected PassengerFareRS passengerFare;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsRS tpaExtensions;
    @XmlAttribute(name = "PricingSource")
    protected PTCFareBreakdownPricingSource pricingSource;
    @XmlAttribute(name = "TravelerRefNumberRPHList")
    protected String travelerRefNumberRPHList;
    @XmlAttribute(name = "FlightRefNumberRPHList")
    protected String flightRefNumberRPHList;
    @XmlAttribute(name = "RPH")
    protected String rph;

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
     *     {@link PassengerFareRS }
     *     
     */
    public PassengerFareRS getPassengerFare() {
        return passengerFare;
    }

    /**
     * Sets the value of the passengerFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerFareRS }
     *     
     */
    public void setPassengerFare(PassengerFareRS value) {
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

    /**
     * Gets the value of the travelerRefNumberRPHList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelerRefNumberRPHList() {
        return travelerRefNumberRPHList;
    }

    /**
     * Sets the value of the travelerRefNumberRPHList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelerRefNumberRPHList(String value) {
        this.travelerRefNumberRPHList = value;
    }

    /**
     * Gets the value of the flightRefNumberRPHList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightRefNumberRPHList() {
        return flightRefNumberRPHList;
    }

    /**
     * Sets the value of the flightRefNumberRPHList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightRefNumberRPHList(String value) {
        this.flightRefNumberRPHList = value;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

}
