
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
 *         &lt;element name="OTA_AirLowFareSearchMatrixRQ" type="{http://traveltalk.com/wsLowFareMatrix}OTA_AirLowFareSearchMatrixRQ" minOccurs="0"/>
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
    "otaAirLowFareSearchMatrixRQ"
})
@XmlRootElement(name = "wmLowFareMatrix")
public class WmLowFareMatrix {

    @XmlElement(name = "OTA_AirLowFareSearchMatrixRQ")
    protected OTAAirLowFareSearchMatrixRQ otaAirLowFareSearchMatrixRQ;

    /**
     * Gets the value of the otaAirLowFareSearchMatrixRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirLowFareSearchMatrixRQ }
     *     
     */
    public OTAAirLowFareSearchMatrixRQ getOTAAirLowFareSearchMatrixRQ() {
        return otaAirLowFareSearchMatrixRQ;
    }

    /**
     * Sets the value of the otaAirLowFareSearchMatrixRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirLowFareSearchMatrixRQ }
     *     
     */
    public void setOTAAirLowFareSearchMatrixRQ(OTAAirLowFareSearchMatrixRQ value) {
        this.otaAirLowFareSearchMatrixRQ = value;
    }

}
