
package services.amadeus.lowfareschedule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MinimumStay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MinimumStay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ReturnTimeOfDay" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MinStay" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StayUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MinStayDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MinimumStay")
public class MinimumStay {

    @XmlAttribute(name = "ReturnTimeOfDay")
    protected String returnTimeOfDay;
    @XmlAttribute(name = "MinStay")
    protected String minStay;
    @XmlAttribute(name = "StayUnit")
    protected String stayUnit;
    @XmlAttribute(name = "MinStayDate")
    protected String minStayDate;

    /**
     * Gets the value of the returnTimeOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnTimeOfDay() {
        return returnTimeOfDay;
    }

    /**
     * Sets the value of the returnTimeOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnTimeOfDay(String value) {
        this.returnTimeOfDay = value;
    }

    /**
     * Gets the value of the minStay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinStay() {
        return minStay;
    }

    /**
     * Sets the value of the minStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinStay(String value) {
        this.minStay = value;
    }

    /**
     * Gets the value of the stayUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStayUnit() {
        return stayUnit;
    }

    /**
     * Sets the value of the stayUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStayUnit(String value) {
        this.stayUnit = value;
    }

    /**
     * Gets the value of the minStayDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinStayDate() {
        return minStayDate;
    }

    /**
     * Sets the value of the minStayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinStayDate(String value) {
        this.minStayDate = value;
    }

}
