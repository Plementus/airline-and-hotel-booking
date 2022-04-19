
package services.amadeus.lowfareplus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="OTA_AirLowFareSearchPlusRS" type="{http://traveltalk.com/wsLowFarePlus}OTA_AirLowFareSearchPlusRS" minOccurs="0"/>
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
    "otaAirLowFareSearchPlusRS"
})
@XmlRootElement(name = "wmLowFarePlusResponse")
public class WmLowFarePlusResponse {

    @XmlElement(name = "OTA_AirLowFareSearchPlusRS")
    protected OTAAirLowFareSearchPlusRS otaAirLowFareSearchPlusRS;

    /**
     * Gets the value of the otaAirLowFareSearchPlusRS property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirLowFareSearchPlusRS }
     *     
     */
    public OTAAirLowFareSearchPlusRS getOTAAirLowFareSearchPlusRS() {
        return otaAirLowFareSearchPlusRS;
    }

    /**
     * Sets the value of the otaAirLowFareSearchPlusRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirLowFareSearchPlusRS }
     *     
     */
    public void setOTAAirLowFareSearchPlusRS(OTAAirLowFareSearchPlusRS value) {
        this.otaAirLowFareSearchPlusRS = value;
    }

}
