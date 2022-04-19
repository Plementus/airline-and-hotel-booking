
package services.sabre.bfm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *   A container for flight segments.
 *   
 * 
 * <p>Java class for OriginDestinationOptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginDestinationOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightSegment" type="{http://www.opentravel.org/OTA/2003/05}BookFlightSegmentType" maxOccurs="4"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ElapsedTime" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestinationOptionType", propOrder = {
    "flightSegment"
})
public class OriginDestinationOptionType {

    @XmlElement(name = "FlightSegment", required = true)
    protected List<BookFlightSegmentType> flightSegment;
    @XmlAttribute(name = "ElapsedTime")
    protected Integer elapsedTime;

    /**
     * Gets the value of the flightSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookFlightSegmentType }
     * 
     * 
     */
    public List<BookFlightSegmentType> getFlightSegment() {
        if (flightSegment == null) {
            flightSegment = new ArrayList<BookFlightSegmentType>();
        }
        return this.flightSegment;
    }

    /**
     * Gets the value of the elapsedTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getElapsedTime() {
        return elapsedTime;
    }

    /**
     * Sets the value of the elapsedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setElapsedTime(Integer value) {
        this.elapsedTime = value;
    }

}
