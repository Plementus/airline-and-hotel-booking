
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for RateDistance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateDistance">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="Unlimited" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="DistUnitName" use="required" type="{http://traveltalk.com/wsTravelBuild}RateDistanceDistUnitName" />
 *       &lt;attribute name="VehiclePeriodUnitName" type="{http://traveltalk.com/wsTravelBuild}RateDistanceVehiclePeriodUnitName" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateDistance", propOrder = {
    "value"
})
public class RateDistance {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Unlimited", required = true)
    protected boolean unlimited;
    @XmlAttribute(name = "Quantity")
    protected Integer quantity;
    @XmlAttribute(name = "DistUnitName", required = true)
    protected RateDistanceDistUnitName distUnitName;
    @XmlAttribute(name = "VehiclePeriodUnitName")
    protected RateDistanceVehiclePeriodUnitName vehiclePeriodUnitName;

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
     * Gets the value of the unlimited property.
     * 
     */
    public boolean isUnlimited() {
        return unlimited;
    }

    /**
     * Sets the value of the unlimited property.
     * 
     */
    public void setUnlimited(boolean value) {
        this.unlimited = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the distUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link RateDistanceDistUnitName }
     *     
     */
    public RateDistanceDistUnitName getDistUnitName() {
        return distUnitName;
    }

    /**
     * Sets the value of the distUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateDistanceDistUnitName }
     *     
     */
    public void setDistUnitName(RateDistanceDistUnitName value) {
        this.distUnitName = value;
    }

    /**
     * Gets the value of the vehiclePeriodUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link RateDistanceVehiclePeriodUnitName }
     *     
     */
    public RateDistanceVehiclePeriodUnitName getVehiclePeriodUnitName() {
        return vehiclePeriodUnitName;
    }

    /**
     * Sets the value of the vehiclePeriodUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateDistanceVehiclePeriodUnitName }
     *     
     */
    public void setVehiclePeriodUnitName(RateDistanceVehiclePeriodUnitName value) {
        this.vehiclePeriodUnitName = value;
    }

}
