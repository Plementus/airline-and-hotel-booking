
package services.amadeus.lowfareschedule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginDestinationInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginDestinationInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartureDateTime" type="{http://traveltalk.com/wsLowFareSchedule}DepartureDateTime" minOccurs="0"/>
 *         &lt;element name="ArrivalDateTime" type="{http://traveltalk.com/wsLowFareSchedule}ArrivalDateTime" minOccurs="0"/>
 *         &lt;element name="OriginLocation" type="{http://traveltalk.com/wsLowFareSchedule}OriginLocation" minOccurs="0"/>
 *         &lt;element name="DestinationLocation" type="{http://traveltalk.com/wsLowFareSchedule}DestinationLocation" minOccurs="0"/>
 *         &lt;element name="ConnectionLocations" type="{http://traveltalk.com/wsLowFareSchedule}ArrayOfConnectionLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestinationInformation", propOrder = {
    "departureDateTime",
    "arrivalDateTime",
    "originLocation",
    "destinationLocation",
    "connectionLocations"
})
public class OriginDestinationInformation {

    @XmlElement(name = "DepartureDateTime")
    protected DepartureDateTime departureDateTime;
    @XmlElement(name = "ArrivalDateTime")
    protected ArrivalDateTime arrivalDateTime;
    @XmlElement(name = "OriginLocation")
    protected OriginLocation originLocation;
    @XmlElement(name = "DestinationLocation")
    protected DestinationLocation destinationLocation;
    @XmlElement(name = "ConnectionLocations")
    protected ArrayOfConnectionLocation connectionLocations;

    /**
     * Gets the value of the departureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureDateTime }
     *     
     */
    public DepartureDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * Sets the value of the departureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureDateTime }
     *     
     */
    public void setDepartureDateTime(DepartureDateTime value) {
        this.departureDateTime = value;
    }

    /**
     * Gets the value of the arrivalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalDateTime }
     *     
     */
    public ArrivalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * Sets the value of the arrivalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalDateTime }
     *     
     */
    public void setArrivalDateTime(ArrivalDateTime value) {
        this.arrivalDateTime = value;
    }

    /**
     * Gets the value of the originLocation property.
     * 
     * @return
     *     possible object is
     *     {@link OriginLocation }
     *     
     */
    public OriginLocation getOriginLocation() {
        return originLocation;
    }

    /**
     * Sets the value of the originLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginLocation }
     *     
     */
    public void setOriginLocation(OriginLocation value) {
        this.originLocation = value;
    }

    /**
     * Gets the value of the destinationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationLocation }
     *     
     */
    public DestinationLocation getDestinationLocation() {
        return destinationLocation;
    }

    /**
     * Sets the value of the destinationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationLocation }
     *     
     */
    public void setDestinationLocation(DestinationLocation value) {
        this.destinationLocation = value;
    }

    /**
     * Gets the value of the connectionLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConnectionLocation }
     *     
     */
    public ArrayOfConnectionLocation getConnectionLocations() {
        return connectionLocations;
    }

    /**
     * Sets the value of the connectionLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConnectionLocation }
     *     
     */
    public void setConnectionLocations(ArrayOfConnectionLocation value) {
        this.connectionLocations = value;
    }

}
