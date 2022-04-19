
package services.amadeus.lowfareschedule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MaximumStayRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaximumStayRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ReturnType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReturnTimeOfDay" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="MaxStay" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StayUnit" type="{http://traveltalk.com/wsLowFareSchedule}MaximumStayStayUnit" />
 *       &lt;attribute name="MaxStayDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaximumStayRS")
public class MaximumStayRS {

    @XmlAttribute(name = "ReturnType")
    protected String returnType;
    @XmlAttribute(name = "ReturnTimeOfDay")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar returnTimeOfDay;
    @XmlAttribute(name = "MaxStay")
    protected String maxStay;
    @XmlAttribute(name = "StayUnit")
    protected MaximumStayStayUnit stayUnit;
    @XmlAttribute(name = "MaxStayDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maxStayDate;

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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnTimeOfDay() {
        return returnTimeOfDay;
    }

    /**
     * Sets the value of the returnTimeOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnTimeOfDay(XMLGregorianCalendar value) {
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
     *     {@link MaximumStayStayUnit }
     *     
     */
    public MaximumStayStayUnit getStayUnit() {
        return stayUnit;
    }

    /**
     * Sets the value of the stayUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumStayStayUnit }
     *     
     */
    public void setStayUnit(MaximumStayStayUnit value) {
        this.stayUnit = value;
    }

    /**
     * Gets the value of the maxStayDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaxStayDate() {
        return maxStayDate;
    }

    /**
     * Sets the value of the maxStayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaxStayDate(XMLGregorianCalendar value) {
        this.maxStayDate = value;
    }

}
