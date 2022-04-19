
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for Remark complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Remark">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TravelerRefNumberRPHList" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FlightRefNumberRPHList" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Remark", propOrder = {
    "value"
})
public class Remark {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "Category")
    protected String category;
    @XmlAttribute(name = "TravelerRefNumberRPHList")
    protected String travelerRefNumberRPHList;
    @XmlAttribute(name = "FlightRefNumberRPHList")
    protected String flightRefNumberRPHList;

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

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
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

}
