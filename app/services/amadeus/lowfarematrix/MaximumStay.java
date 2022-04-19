
package services.amadeus.lowfarematrix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaximumStay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaximumStay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ReturnType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReturnTimeOfDay" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MaxStay" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StayUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MaxStayDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaximumStay")
public class MaximumStay {

    @XmlAttribute(name = "ReturnType")
    protected String returnType;
    @XmlAttribute(name = "ReturnTimeOfDay")
    protected String returnTimeOfDay;
    @XmlAttribute(name = "MaxStay")
    protected String maxStay;
    @XmlAttribute(name = "StayUnit")
    protected String stayUnit;
    @XmlAttribute(name = "MaxStayDate")
    protected String maxStayDate;

    /**
     * Gets the value of the returnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnType() {
        return returnType;
    }

    /**
     * Sets the value of the returnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnType(String value) {
        this.returnType = value;
    }

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
     * Gets the value of the maxStay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxStay() {
        return maxStay;
    }

    /**
     * Sets the value of the maxStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxStay(String value) {
        this.maxStay = value;
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
     * Gets the value of the maxStayDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxStayDate() {
        return maxStayDate;
    }

    /**
     * Sets the value of the maxStayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxStayDate(String value) {
        this.maxStayDate = value;
    }

}
