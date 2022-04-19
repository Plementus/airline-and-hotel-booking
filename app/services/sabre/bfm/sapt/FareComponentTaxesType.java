
package services.sabre.bfm.sapt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareComponentTaxesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareComponentTaxesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightSegment" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="DepartureAirportCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="ArrivalAirportCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareComponentTaxesType", propOrder = {
    "flightSegment",
    "tax"
})
public class FareComponentTaxesType {

    @XmlElement(name = "FlightSegment", required = true)
    protected List<FlightSegment> flightSegment;
    @XmlElement(name = "Tax")
    protected List<AirTaxType> tax;

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
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirTaxType }
     * 
     * 
     */
    public List<AirTaxType> getTax() {
        if (tax == null) {
            tax = new ArrayList<AirTaxType>();
        }
        return this.tax;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="DepartureAirportCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="ArrivalAirportCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FlightSegment {

        @XmlAttribute(name = "DepartureAirportCode")
        @XmlSchemaType(name = "anySimpleType")
        protected String departureAirportCode;
        @XmlAttribute(name = "ArrivalAirportCode")
        @XmlSchemaType(name = "anySimpleType")
        protected String arrivalAirportCode;

        /**
         * Gets the value of the departureAirportCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartureAirportCode() {
            return departureAirportCode;
        }

        /**
         * Sets the value of the departureAirportCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartureAirportCode(String value) {
            this.departureAirportCode = value;
        }

        /**
         * Gets the value of the arrivalAirportCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArrivalAirportCode() {
            return arrivalAirportCode;
        }

        /**
         * Sets the value of the arrivalAirportCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArrivalAirportCode(String value) {
            this.arrivalAirportCode = value;
        }

    }

}
