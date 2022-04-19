
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartureAirport" type="{http://traveltalk.com/wsTravelBuild}DepartureAirport" minOccurs="0"/>
 *         &lt;element name="ArrivalAirport" type="{http://traveltalk.com/wsTravelBuild}ArrivalAirport" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SeatPreference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SmokingAllowed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TravelerRefNumberRPHList" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FlightRefNumberRPHList" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Chargeable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatRequest", propOrder = {
    "departureAirport",
    "arrivalAirport"
})
public class SeatRequest {

    @XmlElement(name = "DepartureAirport")
    protected DepartureAirport departureAirport;
    @XmlElement(name = "ArrivalAirport")
    protected ArrivalAirport arrivalAirport;
    @XmlAttribute(name = "SeatNumber")
    protected String seatNumber;
    @XmlAttribute(name = "SeatPreference")
    protected String seatPreference;
    @XmlAttribute(name = "SmokingAllowed", required = true)
    protected boolean smokingAllowed;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "TravelerRefNumberRPHList")
    protected String travelerRefNumberRPHList;
    @XmlAttribute(name = "FlightRefNumberRPHList")
    protected String flightRefNumberRPHList;
    @XmlAttribute(name = "Chargeable", required = true)
    protected boolean chargeable;

    /**
     * Gets the value of the departureAirport property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureAirport }
     *     
     */
    public DepartureAirport getDepartureAirport() {
        return departureAirport;
    }

    /**
     * Sets the value of the departureAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureAirport }
     *     
     */
    public void setDepartureAirport(DepartureAirport value) {
        this.departureAirport = value;
    }

    /**
     * Gets the value of the arrivalAirport property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalAirport }
     *     
     */
    public ArrivalAirport getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * Sets the value of the arrivalAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalAirport }
     *     
     */
    public void setArrivalAirport(ArrivalAirport value) {
        this.arrivalAirport = value;
    }

    /**
     * Gets the value of the seatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * Sets the value of the seatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumber(String value) {
        this.seatNumber = value;
    }

    /**
     * Gets the value of the seatPreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatPreference() {
        return seatPreference;
    }

    /**
     * Sets the value of the seatPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatPreference(String value) {
        this.seatPreference = value;
    }

    /**
     * Gets the value of the smokingAllowed property.
     * 
     */
    public boolean isSmokingAllowed() {
        return smokingAllowed;
    }

    /**
     * Sets the value of the smokingAllowed property.
     * 
     */
    public void setSmokingAllowed(boolean value) {
        this.smokingAllowed = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the travelerRefNumberRPHList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelerRefNumberRPHList() {
        return travelerRefNumberRPHList;
    }

    /**
     * Sets the value of the travelerRefNumberRPHList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelerRefNumberRPHList(String value) {
        this.travelerRefNumberRPHList = value;
    }

    /**
     * Gets the value of the flightRefNumberRPHList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightRefNumberRPHList() {
        return flightRefNumberRPHList;
    }

    /**
     * Sets the value of the flightRefNumberRPHList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightRefNumberRPHList(String value) {
        this.flightRefNumberRPHList = value;
    }

    /**
     * Gets the value of the chargeable property.
     * 
     */
    public boolean isChargeable() {
        return chargeable;
    }

    /**
     * Sets the value of the chargeable property.
     * 
     */
    public void setChargeable(boolean value) {
        this.chargeable = value;
    }

}
