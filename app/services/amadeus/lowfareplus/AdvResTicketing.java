
package services.amadeus.lowfareplus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvResTicketing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvResTicketing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdvReservation" type="{http://traveltalk.com/wsLowFarePlus}AdvReservation" minOccurs="0"/>
 *         &lt;element name="AdvTicketing" type="{http://traveltalk.com/wsLowFarePlus}AdvTicketing" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AdvResInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AdvTicketingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvResTicketing", propOrder = {
    "advReservation",
    "advTicketing"
})
public class AdvResTicketing {

    @XmlElement(name = "AdvReservation")
    protected AdvReservation advReservation;
    @XmlElement(name = "AdvTicketing")
    protected AdvTicketing advTicketing;
    @XmlAttribute(name = "AdvResInd")
    protected Boolean advResInd;
    @XmlAttribute(name = "AdvTicketingInd")
    protected Boolean advTicketingInd;

    /**
     * Gets the value of the advReservation property.
     * 
     * @return
     *     possible object is
     *     {@link AdvReservation }
     *     
     */
    public AdvReservation getAdvReservation() {
        return advReservation;
    }

    /**
     * Sets the value of the advReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvReservation }
     *     
     */
    public void setAdvReservation(AdvReservation value) {
        this.advReservation = value;
    }

    /**
     * Gets the value of the advTicketing property.
     * 
     * @return
     *     possible object is
     *     {@link AdvTicketing }
     *     
     */
    public AdvTicketing getAdvTicketing() {
        return advTicketing;
    }

    /**
     * Sets the value of the advTicketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvTicketing }
     *     
     */
    public void setAdvTicketing(AdvTicketing value) {
        this.advTicketing = value;
    }

    /**
     * Gets the value of the advResInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvResInd() {
        return advResInd;
    }

    /**
     * Sets the value of the advResInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvResInd(Boolean value) {
        this.advResInd = value;
    }

    /**
     * Gets the value of the advTicketingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTicketingInd() {
        return advTicketingInd;
    }

    /**
     * Sets the value of the advTicketingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvTicketingInd(Boolean value) {
        this.advTicketingInd = value;
    }

}
