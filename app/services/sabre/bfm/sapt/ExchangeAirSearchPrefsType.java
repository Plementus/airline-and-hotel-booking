
package services.sabre.bfm.sapt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeAirSearchPrefsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeAirSearchPrefsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}ExchangeTravelPreferencesTPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ValidInterlineTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeAirSearchPrefsType", propOrder = {
    "tpaExtensions"
})
public class ExchangeAirSearchPrefsType {

    @XmlElement(name = "TPA_Extensions")
    protected ExchangeTravelPreferencesTPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "ValidInterlineTicket")
    protected Boolean validInterlineTicket;

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeTravelPreferencesTPAExtensionsType }
     *     
     */
    public ExchangeTravelPreferencesTPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeTravelPreferencesTPAExtensionsType }
     *     
     */
    public void setTPAExtensions(ExchangeTravelPreferencesTPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the validInterlineTicket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isValidInterlineTicket() {
        if (validInterlineTicket == null) {
            return false;
        } else {
            return validInterlineTicket;
        }
    }

    /**
     * Sets the value of the validInterlineTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidInterlineTicket(Boolean value) {
        this.validInterlineTicket = value;
    }

}
