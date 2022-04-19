
package services.sabre.bfm.sapt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArunkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArunkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginLocation" type="{http://www.opentravel.org/OTA/2003/05}RequestLocationType"/>
 *         &lt;element name="DestinationLocation" type="{http://www.opentravel.org/OTA/2003/05}RequestLocationType"/>
 *         &lt;element name="SideTrip" type="{http://www.opentravel.org/OTA/2003/05}SideTripType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArunkType", propOrder = {
    "originLocation",
    "destinationLocation",
    "sideTrip"
})
public class ArunkType {

    @XmlElement(name = "OriginLocation", required = true)
    protected RequestLocationType originLocation;
    @XmlElement(name = "DestinationLocation", required = true)
    protected RequestLocationType destinationLocation;
    @XmlElement(name = "SideTrip")
    protected SideTripType sideTrip;

    /**
     * Gets the value of the originLocation property.
     * 
     * @return
     *     possible object is
     *     {@link RequestLocationType }
     *     
     */
    public RequestLocationType getOriginLocation() {
        return originLocation;
    }

    /**
     * Sets the value of the originLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestLocationType }
     *     
     */
    public void setOriginLocation(RequestLocationType value) {
        this.originLocation = value;
    }

    /**
     * Gets the value of the destinationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link RequestLocationType }
     *     
     */
    public RequestLocationType getDestinationLocation() {
        return destinationLocation;
    }

    /**
     * Sets the value of the destinationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestLocationType }
     *     
     */
    public void setDestinationLocation(RequestLocationType value) {
        this.destinationLocation = value;
    }

    /**
     * Gets the value of the sideTrip property.
     * 
     * @return
     *     possible object is
     *     {@link SideTripType }
     *     
     */
    public SideTripType getSideTrip() {
        return sideTrip;
    }

    /**
     * Sets the value of the sideTrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link SideTripType }
     *     
     */
    public void setSideTrip(SideTripType value) {
        this.sideTrip = value;
    }

}
