
package services.amadeus.lowfareplus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AdvReservationRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvReservationRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="LatestTimeOfDay" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="LatestPeriod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LatestUnit" type="{http://traveltalk.com/wsLowFarePlus}AdvReservationLatestUnit" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvReservationRS")
public class AdvReservationRS {

    @XmlAttribute(name = "LatestTimeOfDay")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestTimeOfDay;
    @XmlAttribute(name = "LatestPeriod")
    protected String latestPeriod;
    @XmlAttribute(name = "LatestUnit")
    protected AdvReservationLatestUnit latestUnit;

    /**
     * Gets the value of the latestTimeOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestTimeOfDay() {
        return latestTimeOfDay;
    }

    /**
     * Sets the value of the latestTimeOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestTimeOfDay(XMLGregorianCalendar value) {
        this.latestTimeOfDay = value;
    }

    /**
     * Gets the value of the latestPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestPeriod() {
        return latestPeriod;
    }

    /**
     * Sets the value of the latestPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestPeriod(String value) {
        this.latestPeriod = value;
    }

    /**
     * Gets the value of the latestUnit property.
     * 
     * @return
     *     possible object is
     *     {@link AdvReservationLatestUnit }
     *     
     */
    public AdvReservationLatestUnit getLatestUnit() {
        return latestUnit;
    }

    /**
     * Sets the value of the latestUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvReservationLatestUnit }
     *     
     */
    public void setLatestUnit(AdvReservationLatestUnit value) {
        this.latestUnit = value;
    }

}
