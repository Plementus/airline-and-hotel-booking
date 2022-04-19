
package services.amadeus.lowfareplus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvReservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvReservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="LatestTimeOfDay" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LatestPeriod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LatestUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvReservation")
public class AdvReservation {

    @XmlAttribute(name = "LatestTimeOfDay")
    protected String latestTimeOfDay;
    @XmlAttribute(name = "LatestPeriod")
    protected String latestPeriod;
    @XmlAttribute(name = "LatestUnit")
    protected String latestUnit;

    /**
     * Gets the value of the latestTimeOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestTimeOfDay() {
        return latestTimeOfDay;
    }

    /**
     * Sets the value of the latestTimeOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestTimeOfDay(String value) {
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
     *     {@link String }
     *     
     */
    public String getLatestUnit() {
        return latestUnit;
    }

    /**
     * Sets the value of the latestUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestUnit(String value) {
        this.latestUnit = value;
    }

}
