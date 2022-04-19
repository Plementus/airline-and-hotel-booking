
package services.amadeus.travelbuild;

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
 *         &lt;element name="OTA_TravelItineraryRQ" type="{http://traveltalk.com/wsTravelBuild}OTA_TravelItineraryRQ" minOccurs="0"/>
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
    "otaTravelItineraryRQ"
})
@XmlRootElement(name = "wmTravelBuild")
public class WmTravelBuild {

    @XmlElement(name = "OTA_TravelItineraryRQ")
    protected OTATravelItineraryRQ otaTravelItineraryRQ;

    /**
     * Gets the value of the otaTravelItineraryRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTATravelItineraryRQ }
     *     
     */
    public OTATravelItineraryRQ getOTATravelItineraryRQ() {
        return otaTravelItineraryRQ;
    }

    /**
     * Sets the value of the otaTravelItineraryRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTATravelItineraryRQ }
     *     
     */
    public void setOTATravelItineraryRQ(OTATravelItineraryRQ value) {
        this.otaTravelItineraryRQ = value;
    }

}
