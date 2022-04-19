
package services.amadeus.lowfarematrix;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFlightSegmentRPH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFlightSegmentRPH">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightSegmentRPH" type="{http://traveltalk.com/wsLowFareMatrix}FlightSegmentRPH" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFlightSegmentRPH", propOrder = {
    "flightSegmentRPH"
})
public class ArrayOfFlightSegmentRPH {

    @XmlElement(name = "FlightSegmentRPH")
    protected List<FlightSegmentRPH> flightSegmentRPH;

    /**
     * Gets the value of the flightSegmentRPH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegmentRPH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegmentRPH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightSegmentRPH }
     * 
     * 
     */
    public List<FlightSegmentRPH> getFlightSegmentRPH() {
        if (flightSegmentRPH == null) {
            flightSegmentRPH = new ArrayList<FlightSegmentRPH>();
        }
        return this.flightSegmentRPH;
    }

}
