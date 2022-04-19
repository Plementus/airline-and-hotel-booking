
package services.amadeus.airfliforq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ArrivalDateTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrivalDateTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Scheduled" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Estimated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Actual" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrivalDateTime")
public class ArrivalDateTime {

    @XmlAttribute(name = "Scheduled")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduled;
    @XmlAttribute(name = "Estimated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimated;
    @XmlAttribute(name = "Actual")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actual;

    /**
     * Gets the value of the scheduled property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduled() {
        return scheduled;
    }

    /**
     * Sets the value of the scheduled property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduled(XMLGregorianCalendar value) {
        this.scheduled = value;
    }

    /**
     * Gets the value of the estimated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimated() {
        return estimated;
    }

    /**
     * Sets the value of the estimated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimated(XMLGregorianCalendar value) {
        this.estimated = value;
    }

    /**
     * Gets the value of the actual property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActual() {
        return actual;
    }

    /**
     * Sets the value of the actual property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActual(XMLGregorianCalendar value) {
        this.actual = value;
    }

}
