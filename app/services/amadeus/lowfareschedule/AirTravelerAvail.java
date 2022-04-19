
package services.amadeus.lowfareschedule;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirTravelerAvail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirTravelerAvail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerTypeQuantity" type="{http://traveltalk.com/wsLowFareSchedule}PassengerTypeQuantity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AirTravelerType" type="{http://traveltalk.com/wsLowFareSchedule}AirTravelerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirTravelerAvail", propOrder = {
    "passengerTypeQuantity",
    "airTravelerType"
})
public class AirTravelerAvail {

    @XmlElement(name = "PassengerTypeQuantity")
    protected List<PassengerTypeQuantity> passengerTypeQuantity;
    @XmlElement(name = "AirTravelerType")
    protected AirTravelerType airTravelerType;

    /**
     * Gets the value of the passengerTypeQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerTypeQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerTypeQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerTypeQuantity }
     * 
     * 
     */
    public List<PassengerTypeQuantity> getPassengerTypeQuantity() {
        if (passengerTypeQuantity == null) {
            passengerTypeQuantity = new ArrayList<PassengerTypeQuantity>();
        }
        return this.passengerTypeQuantity;
    }

    /**
     * Gets the value of the airTravelerType property.
     * 
     * @return
     *     possible object is
     *     {@link AirTravelerType }
     *     
     */
    public AirTravelerType getAirTravelerType() {
        return airTravelerType;
    }

    /**
     * Sets the value of the airTravelerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirTravelerType }
     *     
     */
    public void setAirTravelerType(AirTravelerType value) {
        this.airTravelerType = value;
    }

}
