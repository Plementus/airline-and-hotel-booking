
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResTicketingRulesRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResTicketingRulesRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdvResTicketing" type="{http://traveltalk.com/wsTravelBuild}AdvResTicketingRS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResTicketingRulesRS", propOrder = {
    "advResTicketing"
})
public class ResTicketingRulesRS {

    @XmlElement(name = "AdvResTicketing")
    protected AdvResTicketingRS advResTicketing;

    /**
     * Gets the value of the advResTicketing property.
     * 
     * @return
     *     possible object is
     *     {@link AdvResTicketingRS }
     *     
     */
    public AdvResTicketingRS getAdvResTicketing() {
        return advResTicketing;
    }

    /**
     * Sets the value of the advResTicketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvResTicketingRS }
     *     
     */
    public void setAdvResTicketing(AdvResTicketingRS value) {
        this.advResTicketing = value;
    }

}
