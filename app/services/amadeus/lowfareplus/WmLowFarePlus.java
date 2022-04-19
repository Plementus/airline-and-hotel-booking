
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
 *         &lt;element name="OTA_AirLowFareSearchPlusRQ" type="{http://traveltalk.com/wsLowFarePlus}OTA_AirLowFareSearchPlusRQ" minOccurs="0"/>
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
    "otaAirLowFareSearchPlusRQ"
})
@XmlRootElement(name = "wmLowFarePlus")
public class WmLowFarePlus {

    @XmlElement(name = "OTA_AirLowFareSearchPlusRQ")
    protected OTAAirLowFareSearchPlusRQ otaAirLowFareSearchPlusRQ;

    /**
     * Gets the value of the otaAirLowFareSearchPlusRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirLowFareSearchPlusRQ }
     *     
     */
    public OTAAirLowFareSearchPlusRQ getOTAAirLowFareSearchPlusRQ() {
        return otaAirLowFareSearchPlusRQ;
    }

    /**
     * Sets the value of the otaAirLowFareSearchPlusRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirLowFareSearchPlusRQ }
     *     
     */
    public void setOTAAirLowFareSearchPlusRQ(OTAAirLowFareSearchPlusRQ value) {
        this.otaAirLowFareSearchPlusRQ = value;
    }

}
