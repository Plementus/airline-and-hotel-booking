
package services.amadeus.lowfareschedule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for ArrivalDateTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrivalDateTime">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="WindowBefore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="WindowAfter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrivalDateTime", propOrder = {
    "value"
})
public class ArrivalDateTime {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "WindowBefore")
    protected String windowBefore;
    @XmlAttribute(name = "WindowAfter")
    protected String windowAfter;

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

}
