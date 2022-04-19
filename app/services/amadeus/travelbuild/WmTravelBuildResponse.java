
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
 *         &lt;element name="OTA_TravelItineraryRS" type="{http://traveltalk.com/wsTravelBuild}OTA_TravelItineraryRS" minOccurs="0"/>
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
    "otaTravelItineraryRS"
})
@XmlRootElement(name = "wmTravelBuildResponse")
public class WmTravelBuildResponse {

    @XmlElement(name = "OTA_TravelItineraryRS")
    protected OTATravelItineraryRS otaTravelItineraryRS;

    /**
     * Gets the value of the otaTravelItineraryRS property.
     * 
     * @return
     *     possible object is
     *     {@link OTATravelItineraryRS }
     *     
     */
    public OTATravelItineraryRS getOTATravelItineraryRS() {
        return otaTravelItineraryRS;
    }

    /**
     * Sets the value of the otaTravelItineraryRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTATravelItineraryRS }
     *     
     */
    public void setOTATravelItineraryRS(OTATravelItineraryRS value) {
        this.otaTravelItineraryRS = value;
    }

}
