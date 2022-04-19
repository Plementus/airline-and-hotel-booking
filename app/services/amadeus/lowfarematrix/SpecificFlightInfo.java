
package services.amadeus.lowfarematrix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecificFlightInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificFlightInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Airline" type="{http://traveltalk.com/wsLowFareMatrix}Airline" minOccurs="0"/>
 *         &lt;element name="BookingClassPref" type="{http://traveltalk.com/wsLowFareMatrix}BookingClassPref" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificFlightInfo", propOrder = {
    "flightNumber",
    "airline",
    "bookingClassPref"
})
public class SpecificFlightInfo {

    @XmlElement(name = "FlightNumber")
    protected String flightNumber;
    @XmlElement(name = "Airline")
    protected Airline airline;
    @XmlElement(name = "BookingClassPref")
    protected BookingClassPref bookingClassPref;

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link Airline }
     *     
     */
    public Airline getAirline() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Airline }
     *     
     */
    public void setAirline(Airline value) {
        this.airline = value;
    }

    /**
     * Gets the value of the bookingClassPref property.
     * 
     * @return
     *     possible object is
     *     {@link BookingClassPref }
     *     
     */
    public BookingClassPref getBookingClassPref() {
        return bookingClassPref;
    }

    /**
     * Sets the value of the bookingClassPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingClassPref }
     *     
     */
    public void setBookingClassPref(BookingClassPref value) {
        this.bookingClassPref = value;
    }

}
