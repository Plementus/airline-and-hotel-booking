
package services.amadeus.lowfareschedule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvTicketing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvTicketing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="FromResTimeOfDay" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FromResPeriod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FromResUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FromDepartTimeOfDay" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FromDepartPeriod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FromDepartUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvTicketing")
public class AdvTicketing {

    @XmlAttribute(name = "FromResTimeOfDay")
    protected String fromResTimeOfDay;
    @XmlAttribute(name = "FromResPeriod")
    protected String fromResPeriod;
    @XmlAttribute(name = "FromResUnit")
    protected String fromResUnit;
    @XmlAttribute(name = "FromDepartTimeOfDay")
    protected String fromDepartTimeOfDay;
    @XmlAttribute(name = "FromDepartPeriod")
    protected String fromDepartPeriod;
    @XmlAttribute(name = "FromDepartUnit")
    protected String fromDepartUnit;

    /**
     * Gets the value of the fromResTimeOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromResTimeOfDay() {
        return fromResTimeOfDay;
    }

    /**
     * Sets the value of the fromResTimeOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromResTimeOfDay(String value) {
        this.fromResTimeOfDay = value;
    }

    /**
     * Gets the value of the fromResPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromResPeriod() {
        return fromResPeriod;
    }

    /**
     * Sets the value of the fromResPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromResPeriod(String value) {
        this.fromResPeriod = value;
    }

    /**
     * Gets the value of the fromResUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromResUnit() {
        return fromResUnit;
    }

    /**
     * Sets the value of the fromResUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromResUnit(String value) {
        this.fromResUnit = value;
    }

    /**
     * Gets the value of the fromDepartTimeOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromDepartTimeOfDay() {
        return fromDepartTimeOfDay;
    }

    /**
     * Sets the value of the fromDepartTimeOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDepartTimeOfDay(String value) {
        this.fromDepartTimeOfDay = value;
    }

    /**
     * Gets the value of the fromDepartPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromDepartPeriod() {
        return fromDepartPeriod;
    }

    /**
     * Sets the value of the fromDepartPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDepartPeriod(String value) {
        this.fromDepartPeriod = value;
    }

    /**
     * Gets the value of the fromDepartUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromDepartUnit() {
        return fromDepartUnit;
    }

    /**
     * Sets the value of the fromDepartUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDepartUnit(String value) {
        this.fromDepartUnit = value;
    }

}
