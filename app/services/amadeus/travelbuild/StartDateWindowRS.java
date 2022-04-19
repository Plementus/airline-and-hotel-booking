
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StartDateWindowRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StartDateWindowRS">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="EarliestDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="LatestDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="DOW" type="{http://traveltalk.com/wsTravelBuild}StartDateWindowDOW" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartDateWindowRS", propOrder = {
    "value"
})
public class StartDateWindowRS {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "EarliestDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earliestDate;
    @XmlAttribute(name = "LatestDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar latestDate;
    @XmlAttribute(name = "DOW")
    protected StartDateWindowDOW dow;

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
     * Gets the value of the earliestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestDate() {
        return earliestDate;
    }

    /**
     * Sets the value of the earliestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestDate(XMLGregorianCalendar value) {
        this.earliestDate = value;
    }

    /**
     * Gets the value of the latestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestDate() {
        return latestDate;
    }

    /**
     * Sets the value of the latestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestDate(XMLGregorianCalendar value) {
        this.latestDate = value;
    }

    /**
     * Gets the value of the dow property.
     * 
     * @return
     *     possible object is
     *     {@link StartDateWindowDOW }
     *     
     */
    public StartDateWindowDOW getDOW() {
        return dow;
    }

    /**
     * Sets the value of the dow property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDateWindowDOW }
     *     
     */
    public void setDOW(StartDateWindowDOW value) {
        this.dow = value;
    }

}
