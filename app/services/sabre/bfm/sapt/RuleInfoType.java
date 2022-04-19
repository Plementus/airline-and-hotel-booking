
package services.sabre.bfm.sapt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains summary fare rule information as well as detailed Rule Information for Fare Basis Codes.  Information may be actual rules data or the results returned from a rules-based inquiry.
 * 
 * <p>Java class for RuleInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResTicketingRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdvResTicketing" type="{http://www.opentravel.org/OTA/2003/05}AdvResTicketingType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LengthOfStayRules" type="{http://www.opentravel.org/OTA/2003/05}StayRestrictionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleInfoType", propOrder = {
    "resTicketingRules",
    "lengthOfStayRules"
})
public class RuleInfoType {

    @XmlElement(name = "ResTicketingRules")
    protected ResTicketingRules resTicketingRules;
    @XmlElement(name = "LengthOfStayRules")
    protected StayRestrictionsType lengthOfStayRules;

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
     *     {@link StayRestrictionsType }
     *     
     */
    public StayRestrictionsType getLengthOfStayRules() {
        return lengthOfStayRules;
    }

    /**
     * Sets the value of the lengthOfStayRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link StayRestrictionsType }
     *     
     */
    public void setLengthOfStayRules(StayRestrictionsType value) {
        this.lengthOfStayRules = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AdvResTicketing" type="{http://www.opentravel.org/OTA/2003/05}AdvResTicketingType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "advResTicketing"
    })
    public static class ResTicketingRules {

        @XmlElement(name = "AdvResTicketing")
        protected AdvResTicketingType advResTicketing;

        /**
         * Gets the value of the advResTicketing property.
         * 
         * @return
         *     possible object is
         *     {@link AdvResTicketingType }
         *     
         */
        public AdvResTicketingType getAdvResTicketing() {
            return advResTicketing;
        }

        /**
         * Sets the value of the advResTicketing property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdvResTicketingType }
         *     
         */
        public void setAdvResTicketing(AdvResTicketingType value) {
            this.advResTicketing = value;
        }

    }

}
