
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialServiceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Airline" type="{http://traveltalk.com/wsTravelBuild}Airline" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SSRCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TravelerRefNumberRPHList" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FlightRefNumberRPHList" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialServiceRequest", propOrder = {
    "airline",
    "text"
})
public class SpecialServiceRequest {

    @XmlElement(name = "Airline")
    protected Airline airline;
    @XmlElement(name = "Text")
    protected String text;
    @XmlAttribute(name = "SSRCode")
    protected String ssrCode;
    @XmlAttribute(name = "TravelerRefNumberRPHList")
    protected String travelerRefNumberRPHList;
    @XmlAttribute(name = "FlightRefNumberRPHList")
    protected String flightRefNumberRPHList;

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
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the ssrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRCode() {
        return ssrCode;
    }

    /**
     * Sets the value of the ssrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRCode(String value) {
        this.ssrCode = value;
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

}
