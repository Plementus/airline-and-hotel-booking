
package services.amadeus.lowfareplus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvResTicketingRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvResTicketingRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdvReservation" type="{http://traveltalk.com/wsLowFarePlus}AdvReservationRS" minOccurs="0"/>
 *         &lt;element name="AdvTicketing" type="{http://traveltalk.com/wsLowFarePlus}AdvTicketingRS" minOccurs="0"/>
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
@XmlType(name = "AdvResTicketingRS", propOrder = {
    "advReservation",
    "advTicketing"
})
public class AdvResTicketingRS {

    @XmlElement(name = "AdvReservation")
    protected AdvReservationRS advReservation;
    @XmlElement(name = "AdvTicketing")
    protected AdvTicketingRS advTicketing;
    @XmlAttribute(name = "AdvResInd")
    protected Boolean advResInd;
    @XmlAttribute(name = "AdvTicketingInd")
    protected Boolean advTicketingInd;

    /**
     * Gets the value of the advReservation property.
     * 
     * @return
     *     possible object is
     *     {@link AdvReservationRS }
     *     
     */
    public AdvReservationRS getAdvReservation() {
        return advReservation;
    }

    /**
     * Sets the value of the advReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvReservationRS }
     *     
     */
    public void setAdvReservation(AdvReservationRS value) {
        this.advReservation = value;
    }

    /**
     * Gets the value of the advTicketing property.
     * 
     * @return
     *     possible object is
     *     {@link AdvTicketingRS }
     *     
     */
    public AdvTicketingRS getAdvTicketing() {
        return advTicketing;
    }

    /**
     * Sets the value of the advTicketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvTicketingRS }
     *     
     */
    public void setAdvTicketing(AdvTicketingRS value) {
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
