
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
 *         &lt;element name="OTA_AirFlifoRQ" type="{http://traveltalk.com/wsAirFlifo}OTA_AirFlifoRQ" minOccurs="0"/>
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
    "otaAirFlifoRQ"
})
@XmlRootElement(name = "wmAirFlifo")
public class WmAirFlifo {

    @XmlElement(name = "OTA_AirFlifoRQ")
    protected OTAAirFlifoRQ otaAirFlifoRQ;

    /**
     * Gets the value of the otaAirFlifoRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirFlifoRQ }
     *     
     */
    public OTAAirFlifoRQ getOTAAirFlifoRQ() {
        return otaAirFlifoRQ;
    }

    /**
     * Sets the value of the otaAirFlifoRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirFlifoRQ }
     *     
     */
    public void setOTAAirFlifoRQ(OTAAirFlifoRQ value) {
        this.otaAirFlifoRQ = value;
    }

}
