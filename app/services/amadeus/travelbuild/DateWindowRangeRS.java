
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DateWindowRangeRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateWindowRangeRS">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
 *       &lt;attribute name="WindowBefore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="WindowAfter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CrossDateAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateWindowRangeRS", propOrder = {
    "value"
})
public class DateWindowRangeRS {

    @XmlValue
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar value;
    @XmlAttribute(name = "WindowBefore")
    protected String windowBefore;
    @XmlAttribute(name = "WindowAfter")
    protected String windowAfter;
    @XmlAttribute(name = "CrossDateAllowedIndicator")
    protected Boolean crossDateAllowedIndicator;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValue(XMLGregorianCalendar value) {
        this.value = value;
    }

    /**
     * Gets the value of the windowBefore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindowBefore() {
        return windowBefore;
    }

    /**
     * Sets the value of the windowBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindowBefore(String value) {
        this.windowBefore = value;
    }

    /**
     * Gets the value of the windowAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindowAfter() {
        return windowAfter;
    }

    /**
     * Sets the value of the windowAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindowAfter(String value) {
        this.windowAfter = value;
    }

    /**
     * Gets the value of the crossDateAllowedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossDateAllowedIndicator() {
        return crossDateAllowedIndicator;
    }

    /**
     * Sets the value of the crossDateAllowedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossDateAllowedIndicator(Boolean value) {
        this.crossDateAllowedIndicator = value;
    }

}
