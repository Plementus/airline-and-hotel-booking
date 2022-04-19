
package services.amadeus.airfliforq;

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
 *         &lt;element name="OTA_AirFlifoRS" type="{http://traveltalk.com/wsAirFlifo}OTA_AirFlifoRS" minOccurs="0"/>
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
    "otaAirFlifoRS"
})
@XmlRootElement(name = "wmAirFlifoResponse")
public class WmAirFlifoResponse {

    @XmlElement(name = "OTA_AirFlifoRS")
    protected OTAAirFlifoRS otaAirFlifoRS;

    /**
     * Gets the value of the otaAirFlifoRS property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirFlifoRS }
     *     
     */
    public OTAAirFlifoRS getOTAAirFlifoRS() {
        return otaAirFlifoRS;
    }

    /**
     * Sets the value of the otaAirFlifoRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirFlifoRS }
     *     
     */
    public void setOTAAirFlifoRS(OTAAirFlifoRS value) {
        this.otaAirFlifoRS = value;
    }

}
