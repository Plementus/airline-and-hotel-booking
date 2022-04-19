
package services.sabre.bfm.altdate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies actual airline, flight number, or booking class.
 * 
 * <p>Java class for SpecificFlightInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificFlightInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightNumber" type="{http://www.opentravel.org/OTA/2003/05}FlightNumberType" minOccurs="0"/>
 *         &lt;element name="Airline" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="BookingClassPref" type="{http://www.opentravel.org/OTA/2003/05}BookingClassPrefType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificFlightInfoType", propOrder = {
    "flightNumber",
    "airline",
    "bookingClassPref"
})
public class SpecificFlightInfoType {

    @XmlElement(name = "FlightNumber")
    protected String flightNumber;
    @XmlElement(name = "Airline")
    protected CompanyNameType airline;
    @XmlElement(name = "BookingClassPref")
    protected BookingClassPrefType bookingClassPref;

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
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getAirline() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setAirline(CompanyNameType value) {
        this.airline = value;
    }

    /**
     * Gets the value of the bookingClassPref property.
     * 
     * @return
     *     possible object is
     *     {@link BookingClassPrefType }
     *     
     */
    public BookingClassPrefType getBookingClassPref() {
        return bookingClassPref;
    }

    /**
     * Sets the value of the bookingClassPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingClassPrefType }
     *     
     */
    public void setBookingClassPref(BookingClassPrefType value) {
        this.bookingClassPref = value;
    }

}
