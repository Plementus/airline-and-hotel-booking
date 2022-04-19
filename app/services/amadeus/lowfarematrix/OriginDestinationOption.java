
package services.amadeus.lowfarematrix;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginDestinationOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginDestinationOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightSegment" type="{http://traveltalk.com/wsLowFareMatrix}FlightSegment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SectorSequence" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestinationOption", propOrder = {
    "flightSegment"
})
public class OriginDestinationOption {

    @XmlElement(name = "FlightSegment")
    protected List<FlightSegment> flightSegment;
    @XmlAttribute(name = "SectorSequence")
    protected String sectorSequence;

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
     * {@link FlightSegment }
     * 
     * 
     */
    public List<FlightSegment> getFlightSegment() {
        if (flightSegment == null) {
            flightSegment = new ArrayList<FlightSegment>();
        }
        return this.flightSegment;
    }

    /**
     * Gets the value of the sectorSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectorSequence() {
        return sectorSequence;
    }

    /**
     * Sets the value of the sectorSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectorSequence(String value) {
        this.sectorSequence = value;
    }

}
