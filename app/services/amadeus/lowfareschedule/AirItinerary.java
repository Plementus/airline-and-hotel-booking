
package services.amadeus.lowfareschedule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirItinerary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirItinerary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginDestinationOptions" type="{http://traveltalk.com/wsLowFareSchedule}ArrayOfArrayOfFlightSegment" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DirectionInd" type="{http://traveltalk.com/wsLowFareSchedule}AirItineraryDirectionInd" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirItinerary", propOrder = {
    "originDestinationOptions"
})
public class AirItinerary {

    @XmlElement(name = "OriginDestinationOptions")
    protected ArrayOfArrayOfFlightSegment originDestinationOptions;
    @XmlAttribute(name = "DirectionInd")
    protected AirItineraryDirectionInd directionInd;

    /**
     * Gets the value of the originDestinationOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrayOfFlightSegment }
     *     
     */
    public ArrayOfArrayOfFlightSegment getOriginDestinationOptions() {
        return originDestinationOptions;
    }

    /**
     * Sets the value of the originDestinationOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrayOfFlightSegment }
     *     
     */
    public void setOriginDestinationOptions(ArrayOfArrayOfFlightSegment value) {
        this.originDestinationOptions = value;
    }

    /**
     * Gets the value of the directionInd property.
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryDirectionInd }
     *     
     */
    public AirItineraryDirectionInd getDirectionInd() {
        return directionInd;
    }

    /**
     * Sets the value of the directionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryDirectionInd }
     *     
     */
    public void setDirectionInd(AirItineraryDirectionInd value) {
        this.directionInd = value;
    }

}
