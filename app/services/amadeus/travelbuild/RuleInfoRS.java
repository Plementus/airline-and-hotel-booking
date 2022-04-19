
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RuleInfoRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleInfoRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResTicketingRules" type="{http://traveltalk.com/wsTravelBuild}ResTicketingRulesRS" minOccurs="0"/>
 *         &lt;element name="LengthOfStayRules" type="{http://traveltalk.com/wsTravelBuild}LengthOfStayRulesRS" minOccurs="0"/>
 *         &lt;element name="ChargesRules" type="{http://traveltalk.com/wsTravelBuild}ChargesRulesRS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleInfoRS", propOrder = {
    "resTicketingRules",
    "lengthOfStayRules",
    "chargesRules"
})
public class RuleInfoRS {

    @XmlElement(name = "ResTicketingRules")
    protected ResTicketingRulesRS resTicketingRules;
    @XmlElement(name = "LengthOfStayRules")
    protected LengthOfStayRulesRS lengthOfStayRules;
    @XmlElement(name = "ChargesRules")
    protected ChargesRulesRS chargesRules;

    /**
     * Gets the value of the resTicketingRules property.
     * 
     * @return
     *     possible object is
     *     {@link ResTicketingRulesRS }
     *     
     */
    public ResTicketingRulesRS getResTicketingRules() {
        return resTicketingRules;
    }

    /**
     * Sets the value of the resTicketingRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResTicketingRulesRS }
     *     
     */
    public void setResTicketingRules(ResTicketingRulesRS value) {
        this.resTicketingRules = value;
    }

    /**
     * Gets the value of the lengthOfStayRules property.
     * 
     * @return
     *     possible object is
     *     {@link LengthOfStayRulesRS }
     *     
     */
    public LengthOfStayRulesRS getLengthOfStayRules() {
        return lengthOfStayRules;
    }

    /**
     * Sets the value of the lengthOfStayRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthOfStayRulesRS }
     *     
     */
    public void setLengthOfStayRules(LengthOfStayRulesRS value) {
        this.lengthOfStayRules = value;
    }

    /**
     * Gets the value of the chargesRules property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesRulesRS }
     *     
     */
    public ChargesRulesRS getChargesRules() {
        return chargesRules;
    }

    /**
     * Sets the value of the chargesRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesRulesRS }
     *     
     */
    public void setChargesRules(ChargesRulesRS value) {
        this.chargesRules = value;
    }

}
