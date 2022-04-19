
package services.amadeus.travelbuild;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BagAllowance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BagAllowance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Weight" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="Type" type="{http://traveltalk.com/wsTravelBuild}BagAllowanceType" />
 *       &lt;attribute name="Unit" type="{http://traveltalk.com/wsTravelBuild}BagAllowanceUnit" />
 *       &lt;attribute name="ItinSeqNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagAllowance")
public class BagAllowance {

    @XmlAttribute(name = "Quantity")
    protected Integer quantity;
    @XmlAttribute(name = "Weight")
    protected BigDecimal weight;
    @XmlAttribute(name = "Type")
    protected BagAllowanceType type;
    @XmlAttribute(name = "Unit")
    protected BagAllowanceUnit unit;
    @XmlAttribute(name = "ItinSeqNumber")
    protected String itinSeqNumber;

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
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BagAllowanceType }
     *     
     */
    public BagAllowanceType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagAllowanceType }
     *     
     */
    public void setType(BagAllowanceType value) {
        this.type = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link BagAllowanceUnit }
     *     
     */
    public BagAllowanceUnit getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagAllowanceUnit }
     *     
     */
    public void setUnit(BagAllowanceUnit value) {
        this.unit = value;
    }

    /**
     * Gets the value of the itinSeqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItinSeqNumber() {
        return itinSeqNumber;
    }

    /**
     * Sets the value of the itinSeqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItinSeqNumber(String value) {
        this.itinSeqNumber = value;
    }

}
