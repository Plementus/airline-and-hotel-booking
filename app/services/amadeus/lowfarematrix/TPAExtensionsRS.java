
package services.amadeus.lowfarematrix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPA_ExtensionsRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPA_ExtensionsRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CabinType" type="{http://traveltalk.com/wsLowFareMatrix}CabinType" minOccurs="0"/>
 *         &lt;element name="JourneyTotalDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JourneyDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPA_ExtensionsRS", propOrder = {
    "cabinType",
    "journeyTotalDuration",
    "journeyDuration",
    "pricedCode",
    "text",
    "flightContext"
})
public class TPAExtensionsRS {

    @XmlElement(name = "CabinType")
    protected CabinType cabinType;
    @XmlElement(name = "JourneyTotalDuration")
    protected String journeyTotalDuration;
    @XmlElement(name = "JourneyDuration")
    protected String journeyDuration;
    @XmlElement(name = "PricedCode")
    protected String pricedCode;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "FlightContext")
    protected String flightContext;

    /**
     * Gets the value of the cabinType property.
     * 
     * @return
     *     possible object is
     *     {@link CabinType }
     *     
     */
    public CabinType getCabinType() {
        return cabinType;
    }

    /**
     * Sets the value of the cabinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinType }
     *     
     */
    public void setCabinType(CabinType value) {
        this.cabinType = value;
    }

    /**
     * Gets the value of the journeyTotalDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyTotalDuration() {
        return journeyTotalDuration;
    }

    /**
     * Sets the value of the journeyTotalDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyTotalDuration(String value) {
        this.journeyTotalDuration = value;
    }

    /**
     * Gets the value of the journeyDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyDuration() {
        return journeyDuration;
    }

    /**
     * Sets the value of the journeyDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyDuration(String value) {
        this.journeyDuration = value;
    }

    /**
     * Gets the value of the pricedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricedCode() {
        return pricedCode;
    }

    /**
     * Sets the value of the pricedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricedCode(String value) {
        this.pricedCode = value;
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
     * Gets the value of the flightContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightContext() {
        return flightContext;
    }

    /**
     * Sets the value of the flightContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightContext(String value) {
        this.flightContext = value;
    }

}
