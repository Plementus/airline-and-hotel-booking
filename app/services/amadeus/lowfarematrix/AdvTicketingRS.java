
package services.amadeus.lowfarematrix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AdvTicketingRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvTicketingRS">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="FromResTimeOfDay" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="FromResPeriod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FromResUnit" type="{http://traveltalk.com/wsLowFareMatrix}AdvTicketingFromResUnit" />
 *       &lt;attribute name="FromDepartTimeOfDay" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="FromDepartPeriod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FromDepartUnit" type="{http://traveltalk.com/wsLowFareMatrix}AdvTicketingFromDepartUnit" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvTicketingRS", propOrder = {
    "value"
})
public class AdvTicketingRS {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "FromResTimeOfDay")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromResTimeOfDay;
    @XmlAttribute(name = "FromResPeriod")
    protected String fromResPeriod;
    @XmlAttribute(name = "FromResUnit")
    protected AdvTicketingFromResUnit fromResUnit;
    @XmlAttribute(name = "FromDepartTimeOfDay")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDepartTimeOfDay;
    @XmlAttribute(name = "FromDepartPeriod")
    protected String fromDepartPeriod;
    @XmlAttribute(name = "FromDepartUnit")
    protected AdvTicketingFromDepartUnit fromDepartUnit;

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
     * Gets the value of the fromResTimeOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromResTimeOfDay() {
        return fromResTimeOfDay;
    }

    /**
     * Sets the value of the fromResTimeOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromResTimeOfDay(XMLGregorianCalendar value) {
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
     *     {@link AdvTicketingFromResUnit }
     *     
     */
    public AdvTicketingFromResUnit getFromResUnit() {
        return fromResUnit;
    }

    /**
     * Sets the value of the fromResUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvTicketingFromResUnit }
     *     
     */
    public void setFromResUnit(AdvTicketingFromResUnit value) {
        this.fromResUnit = value;
    }

    /**
     * Gets the value of the fromDepartTimeOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDepartTimeOfDay() {
        return fromDepartTimeOfDay;
    }

    /**
     * Sets the value of the fromDepartTimeOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDepartTimeOfDay(XMLGregorianCalendar value) {
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
     *     {@link AdvTicketingFromDepartUnit }
     *     
     */
    public AdvTicketingFromDepartUnit getFromDepartUnit() {
        return fromDepartUnit;
    }

    /**
     * Sets the value of the fromDepartUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvTicketingFromDepartUnit }
     *     
     */
    public void setFromDepartUnit(AdvTicketingFromDepartUnit value) {
        this.fromDepartUnit = value;
    }

}
