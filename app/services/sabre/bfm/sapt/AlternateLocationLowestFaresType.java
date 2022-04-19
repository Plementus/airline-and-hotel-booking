
package services.sabre.bfm.sapt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * IntelliSell Type . lowest fare for alternate origin / destination pair.
 * 
 * <p>Java class for AlternateLocationLowestFaresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlternateLocationLowestFaresType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginLocation" type="{http://www.opentravel.org/OTA/2003/05}ResponseLocationType"/>
 *         &lt;element name="DestinationLocation" type="{http://www.opentravel.org/OTA/2003/05}ResponseLocationType"/>
 *         &lt;element name="LowestFare" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternateLocationLowestFaresType", propOrder = {
    "originLocation",
    "destinationLocation",
    "lowestFare"
})
public class AlternateLocationLowestFaresType {

    @XmlElement(name = "OriginLocation", required = true)
    protected ResponseLocationType originLocation;
    @XmlElement(name = "DestinationLocation", required = true)
    protected ResponseLocationType destinationLocation;
    @XmlElement(name = "LowestFare", required = true)
    protected CurrencyAmountType lowestFare;

    /**
     * Gets the value of the originLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseLocationType }
     *     
     */
    public ResponseLocationType getOriginLocation() {
        return originLocation;
    }

    /**
     * Sets the value of the originLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseLocationType }
     *     
     */
    public void setOriginLocation(ResponseLocationType value) {
        this.originLocation = value;
    }

    /**
     * Gets the value of the destinationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseLocationType }
     *     
     */
    public ResponseLocationType getDestinationLocation() {
        return destinationLocation;
    }

    /**
     * Sets the value of the destinationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseLocationType }
     *     
     */
    public void setDestinationLocation(ResponseLocationType value) {
        this.destinationLocation = value;
    }

    /**
     * Gets the value of the lowestFare property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getLowestFare() {
        return lowestFare;
    }

    /**
     * Sets the value of the lowestFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setLowestFare(CurrencyAmountType value) {
        this.lowestFare = value;
    }

}
