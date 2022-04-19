
package services.sabre.bfm.sapt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This element allows a user to specify the number of itineraries returned.
 * 
 * <p>Java class for NumTripsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumTripsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Number" default="9">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *             &lt;minInclusive value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PerDateMin" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *       &lt;attribute name="PerDateMax" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *       &lt;attribute name="PerMarket" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *       &lt;attribute name="PerMonth" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumTripsType")
public class NumTripsType {

    @XmlAttribute(name = "Number")
    protected Short number;
    @XmlAttribute(name = "PerDateMin")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer perDateMin;
    @XmlAttribute(name = "PerDateMax")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer perDateMax;
    @XmlAttribute(name = "PerMarket")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer perMarket;
    @XmlAttribute(name = "PerMonth")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer perMonth;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public short getNumber() {
        if (number == null) {
            return ((short) 9);
        } else {
            return number;
        }
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumber(Short value) {
        this.number = value;
    }

    /**
     * Gets the value of the perDateMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPerDateMin() {
        return perDateMin;
    }

    /**
     * Sets the value of the perDateMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPerDateMin(Integer value) {
        this.perDateMin = value;
    }

    /**
     * Gets the value of the perDateMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPerDateMax() {
        return perDateMax;
    }

    /**
     * Sets the value of the perDateMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPerDateMax(Integer value) {
        this.perDateMax = value;
    }

    /**
     * Gets the value of the perMarket property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPerMarket() {
        return perMarket;
    }

    /**
     * Sets the value of the perMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPerMarket(Integer value) {
        this.perMarket = value;
    }

    /**
     * Gets the value of the perMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPerMonth() {
        return perMonth;
    }

    /**
     * Sets the value of the perMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPerMonth(Integer value) {
        this.perMonth = value;
    }

}
