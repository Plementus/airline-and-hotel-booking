
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublishedFares complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublishedFares">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareRestrictPref" type="{http://traveltalk.com/wsTravelBuild}FareRestrictPref" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishedFares", propOrder = {
    "fareRestrictPref"
})
public class PublishedFares {

    @XmlElement(name = "FareRestrictPref")
    protected FareRestrictPref fareRestrictPref;

    /**
     * Gets the value of the fareRestrictPref property.
     * 
     * @return
     *     possible object is
     *     {@link FareRestrictPref }
     *     
     */
    public FareRestrictPref getFareRestrictPref() {
        return fareRestrictPref;
    }

    /**
     * Sets the value of the fareRestrictPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRestrictPref }
     *     
     */
    public void setFareRestrictPref(FareRestrictPref value) {
        this.fareRestrictPref = value;
    }

}
