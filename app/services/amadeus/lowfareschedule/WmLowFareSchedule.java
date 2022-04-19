
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
 *         &lt;element name="OTA_AirLowFareSearchScheduleRQ" type="{http://traveltalk.com/wsLowFareSchedule}OTA_AirLowFareSearchScheduleRQ" minOccurs="0"/>
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
    "otaAirLowFareSearchScheduleRQ"
})
@XmlRootElement(name = "wmLowFareSchedule")
public class WmLowFareSchedule {

    @XmlElement(name = "OTA_AirLowFareSearchScheduleRQ")
    protected OTAAirLowFareSearchScheduleRQ otaAirLowFareSearchScheduleRQ;

    /**
     * Gets the value of the otaAirLowFareSearchScheduleRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirLowFareSearchScheduleRQ }
     *     
     */
    public OTAAirLowFareSearchScheduleRQ getOTAAirLowFareSearchScheduleRQ() {
        return otaAirLowFareSearchScheduleRQ;
    }

    /**
     * Sets the value of the otaAirLowFareSearchScheduleRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirLowFareSearchScheduleRQ }
     *     
     */
    public void setOTAAirLowFareSearchScheduleRQ(OTAAirLowFareSearchScheduleRQ value) {
        this.otaAirLowFareSearchScheduleRQ = value;
    }

}
