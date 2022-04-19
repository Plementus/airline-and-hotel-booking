
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RentalRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RentalRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RateDistance" type="{http://traveltalk.com/wsTravelBuild}RateDistance" minOccurs="0"/>
 *         &lt;element name="VehicleCharges" type="{http://traveltalk.com/wsTravelBuild}VehicleCharges" minOccurs="0"/>
 *         &lt;element name="RateQualifier" type="{http://traveltalk.com/wsTravelBuild}RateQualifierRS" minOccurs="0"/>
 *         &lt;element name="RateRestrictions" type="{http://traveltalk.com/wsTravelBuild}RateRestrictions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RentalRate", propOrder = {
    "rateDistance",
    "vehicleCharges",
    "rateQualifier",
    "rateRestrictions"
})
public class RentalRate {

    @XmlElement(name = "RateDistance")
    protected RateDistance rateDistance;
    @XmlElement(name = "VehicleCharges")
    protected VehicleCharges vehicleCharges;
    @XmlElement(name = "RateQualifier")
    protected RateQualifierRS rateQualifier;
    @XmlElement(name = "RateRestrictions")
    protected RateRestrictions rateRestrictions;

    /**
     * Gets the value of the rateDistance property.
     * 
     * @return
     *     possible object is
     *     {@link RateDistance }
     *     
     */
    public RateDistance getRateDistance() {
        return rateDistance;
    }

    /**
     * Sets the value of the rateDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateDistance }
     *     
     */
    public void setRateDistance(RateDistance value) {
        this.rateDistance = value;
    }

    /**
     * Gets the value of the vehicleCharges property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCharges }
     *     
     */
    public VehicleCharges getVehicleCharges() {
        return vehicleCharges;
    }

    /**
     * Sets the value of the vehicleCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCharges }
     *     
     */
    public void setVehicleCharges(VehicleCharges value) {
        this.vehicleCharges = value;
    }

    /**
     * Gets the value of the rateQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link RateQualifierRS }
     *     
     */
    public RateQualifierRS getRateQualifier() {
        return rateQualifier;
    }

    /**
     * Sets the value of the rateQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateQualifierRS }
     *     
     */
    public void setRateQualifier(RateQualifierRS value) {
        this.rateQualifier = value;
    }

    /**
     * Gets the value of the rateRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link RateRestrictions }
     *     
     */
    public RateRestrictions getRateRestrictions() {
        return rateRestrictions;
    }

    /**
     * Sets the value of the rateRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRestrictions }
     *     
     */
    public void setRateRestrictions(RateRestrictions value) {
        this.rateRestrictions = value;
    }

}
