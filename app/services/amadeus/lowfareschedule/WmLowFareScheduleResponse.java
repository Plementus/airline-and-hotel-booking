
package services.amadeus.lowfareschedule;

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
 *         &lt;element name="OTA_AirLowFareSearchPlusRS" type="{http://traveltalk.com/wsLowFareSchedule}OTA_AirLowFareSearchScheduleRS" minOccurs="0"/>
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
@XmlRootElement(name = "wmLowFareScheduleResponse")
public class WmLowFareScheduleResponse {

    @XmlElement(name = "OTA_AirLowFareSearchPlusRS")
    protected OTAAirLowFareSearchScheduleRS otaAirLowFareSearchPlusRS;

    /**
     * Gets the value of the otaAirLowFareSearchPlusRS property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirLowFareSearchScheduleRS }
     *     
     */
    public OTAAirLowFareSearchScheduleRS getOTAAirLowFareSearchPlusRS() {
        return otaAirLowFareSearchPlusRS;
    }

    /**
     * Sets the value of the otaAirLowFareSearchPlusRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirLowFareSearchScheduleRS }
     *     
     */
    public void setOTAAirLowFareSearchPlusRS(OTAAirLowFareSearchScheduleRS value) {
        this.otaAirLowFareSearchPlusRS = value;
    }

}
