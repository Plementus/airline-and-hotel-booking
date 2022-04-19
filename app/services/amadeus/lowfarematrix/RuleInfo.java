
package services.amadeus.lowfarematrix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RuleInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResTicketingRules" type="{http://traveltalk.com/wsLowFareMatrix}ResTicketingRules" minOccurs="0"/>
 *         &lt;element name="LengthOfStayRules" type="{http://traveltalk.com/wsLowFareMatrix}LengthOfStayRules" minOccurs="0"/>
 *         &lt;element name="ChargesRules" type="{http://traveltalk.com/wsLowFareMatrix}ChargesRules" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleInfo", propOrder = {
    "resTicketingRules",
    "lengthOfStayRules",
    "chargesRules"
})
public class RuleInfo {

    @XmlElement(name = "ResTicketingRules")
    protected ResTicketingRules resTicketingRules;
    @XmlElement(name = "LengthOfStayRules")
    protected LengthOfStayRules lengthOfStayRules;
    @XmlElement(name = "ChargesRules")
    protected ChargesRules chargesRules;

    /**
     * Gets the value of the resTicketingRules property.
     * 
     * @return
     *     possible object is
     *     {@link ResTicketingRules }
     *     
     */
    public ResTicketingRules getResTicketingRules() {
        return resTicketingRules;
    }

    /**
     * Sets the value of the resTicketingRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResTicketingRules }
     *     
     */
    public void setResTicketingRules(ResTicketingRules value) {
        this.resTicketingRules = value;
    }

    /**
     * Gets the value of the lengthOfStayRules property.
     * 
     * @return
     *     possible object is
     *     {@link LengthOfStayRules }
     *     
     */
    public LengthOfStayRules getLengthOfStayRules() {
        return lengthOfStayRules;
    }

    /**
     * Sets the value of the lengthOfStayRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthOfStayRules }
     *     
     */
    public void setLengthOfStayRules(LengthOfStayRules value) {
        this.lengthOfStayRules = value;
    }

    /**
     * Gets the value of the chargesRules property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesRules }
     *     
     */
    public ChargesRules getChargesRules() {
        return chargesRules;
    }

    /**
     * Sets the value of the chargesRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesRules }
     *     
     */
    public void setChargesRules(ChargesRules value) {
        this.chargesRules = value;
    }

}
