
package services.amadeus.lowfarematrix;

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
 *         &lt;element name="OTA_AirLowFareSearchMatrixRS" type="{http://traveltalk.com/wsLowFareMatrix}OTA_AirLowFareSearchMatrixRS" minOccurs="0"/>
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
    "otaAirLowFareSearchMatrixRS"
})
@XmlRootElement(name = "wmLowFareMatrixResponse")
public class WmLowFareMatrixResponse {

    @XmlElement(name = "OTA_AirLowFareSearchMatrixRS")
    protected OTAAirLowFareSearchMatrixRS otaAirLowFareSearchMatrixRS;

    /**
     * Gets the value of the otaAirLowFareSearchMatrixRS property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirLowFareSearchMatrixRS }
     *     
     */
    public OTAAirLowFareSearchMatrixRS getOTAAirLowFareSearchMatrixRS() {
        return otaAirLowFareSearchMatrixRS;
    }

    /**
     * Sets the value of the otaAirLowFareSearchMatrixRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirLowFareSearchMatrixRS }
     *     
     */
    public void setOTAAirLowFareSearchMatrixRS(OTAAirLowFareSearchMatrixRS value) {
        this.otaAirLowFareSearchMatrixRS = value;
    }

}
