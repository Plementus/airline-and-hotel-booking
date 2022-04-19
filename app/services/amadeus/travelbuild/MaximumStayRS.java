
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MaximumStayRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaximumStayRS">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="ReturnType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReturnTimeOfDay" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="MaxStay" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StayUnit" type="{http://traveltalk.com/wsTravelBuild}MaximumStayStayUnit" />
 *       &lt;attribute name="MaxStayDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaximumStayRS", propOrder = {
    "value"
})
public class MaximumStayRS {

    @XmlValue
    protected String value;
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
