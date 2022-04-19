
package services.amadeus.lowfareschedule;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="CabinType" type="{http://traveltalk.com/wsLowFareSchedule}CabinType" minOccurs="0"/>
 *         &lt;element name="JourneyTotalDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JourneyDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalBaseFare" type="{http://traveltalk.com/wsLowFareSchedule}TotalFare" minOccurs="0"/>
 *         &lt;element name="TotalTax" type="{http://traveltalk.com/wsLowFareSchedule}TotalFare" minOccurs="0"/>
 *         &lt;element name="TotalFare" type="{http://traveltalk.com/wsLowFareSchedule}TotalFare" minOccurs="0"/>
 *         &lt;element name="FromTotalBaseFare" type="{http://traveltalk.com/wsLowFareSchedule}TotalFare" minOccurs="0"/>
 *         &lt;element name="FromTotalTax" type="{http://traveltalk.com/wsLowFareSchedule}TotalFare" minOccurs="0"/>
 *         &lt;element name="FromTotalFare" type="{http://traveltalk.com/wsLowFareSchedule}TotalFare" minOccurs="0"/>
 *         &lt;element name="OriginClass" type="{http://traveltalk.com/wsLowFareSchedule}OriginClass" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FareBasisCodes" type="{http://traveltalk.com/wsLowFareSchedule}FareBasisCodes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PricingSource" type="{http://traveltalk.com/wsLowFareSchedule}AirItineraryPricingInfoPricingSource" />
 *       &lt;attribute name="ValidatingAirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NegotiatedFareCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "flightContext",
    "totalBaseFare",
    "totalTax",
    "totalFare",
    "fromTotalBaseFare",
    "fromTotalTax",
    "fromTotalFare",
    "originClass",
    "fareBasisCodes"
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
    @XmlElement(name = "TotalBaseFare")
    protected TotalFare totalBaseFare;
    @XmlElement(name = "TotalTax")
    protected TotalFare totalTax;
    @XmlElement(name = "TotalFare")
    protected TotalFare totalFare;
    @XmlElement(name = "FromTotalBaseFare")
    protected TotalFare fromTotalBaseFare;
    @XmlElement(name = "FromTotalTax")
    protected TotalFare fromTotalTax;
    @XmlElement(name = "FromTotalFare")
    protected TotalFare fromTotalFare;
    @XmlElement(name = "OriginClass")
    protected List<OriginClass> originClass;
    @XmlElement(name = "FareBasisCodes")
    protected List<FareBasisCodes> fareBasisCodes;
    @XmlAttribute(name = "PricingSource")
    protected AirItineraryPricingInfoPricingSource pricingSource;
    @XmlAttribute(name = "ValidatingAirlineCode")
    protected String validatingAirlineCode;
    @XmlAttribute(name = "NegotiatedFareCode")
    protected String negotiatedFareCode;

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

    /**
     * Gets the value of the totalBaseFare property.
     * 
     * @return
     *     possible object is
     *     {@link TotalFare }
     *     
     */
    public TotalFare getTotalBaseFare() {
        return totalBaseFare;
    }

    /**
     * Sets the value of the totalBaseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalFare }
     *     
     */
    public void setTotalBaseFare(TotalFare value) {
        this.totalBaseFare = value;
    }

    /**
     * Gets the value of the totalTax property.
     * 
     * @return
     *     possible object is
     *     {@link TotalFare }
     *     
     */
    public TotalFare getTotalTax() {
        return totalTax;
    }

    /**
     * Sets the value of the totalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalFare }
     *     
     */
    public void setTotalTax(TotalFare value) {
        this.totalTax = value;
    }

    /**
     * Gets the value of the totalFare property.
     * 
     * @return
     *     possible object is
     *     {@link TotalFare }
     *     
     */
    public TotalFare getTotalFare() {
        return totalFare;
    }

    /**
     * Sets the value of the totalFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalFare }
     *     
     */
    public void setTotalFare(TotalFare value) {
        this.totalFare = value;
    }

    /**
     * Gets the value of the fromTotalBaseFare property.
     * 
     * @return
     *     possible object is
     *     {@link TotalFare }
     *     
     */
    public TotalFare getFromTotalBaseFare() {
        return fromTotalBaseFare;
    }

    /**
     * Sets the value of the fromTotalBaseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalFare }
     *     
     */
    public void setFromTotalBaseFare(TotalFare value) {
        this.fromTotalBaseFare = value;
    }

    /**
     * Gets the value of the fromTotalTax property.
     * 
     * @return
     *     possible object is
     *     {@link TotalFare }
     *     
     */
    public TotalFare getFromTotalTax() {
        return fromTotalTax;
    }

    /**
     * Sets the value of the fromTotalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalFare }
     *     
     */
    public void setFromTotalTax(TotalFare value) {
        this.fromTotalTax = value;
    }

    /**
     * Gets the value of the fromTotalFare property.
     * 
     * @return
     *     possible object is
     *     {@link TotalFare }
     *     
     */
    public TotalFare getFromTotalFare() {
        return fromTotalFare;
    }

    /**
     * Sets the value of the fromTotalFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalFare }
     *     
     */
    public void setFromTotalFare(TotalFare value) {
        this.fromTotalFare = value;
    }

    /**
     * Gets the value of the originClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginClass }
     * 
     * 
     */
    public List<OriginClass> getOriginClass() {
        if (originClass == null) {
            originClass = new ArrayList<OriginClass>();
        }
        return this.originClass;
    }

    /**
     * Gets the value of the fareBasisCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareBasisCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareBasisCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareBasisCodes }
     * 
     * 
     */
    public List<FareBasisCodes> getFareBasisCodes() {
        if (fareBasisCodes == null) {
            fareBasisCodes = new ArrayList<FareBasisCodes>();
        }
        return this.fareBasisCodes;
    }

    /**
     * Gets the value of the pricingSource property.
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryPricingInfoPricingSource }
     *     
     */
    public AirItineraryPricingInfoPricingSource getPricingSource() {
        return pricingSource;
    }

    /**
     * Sets the value of the pricingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryPricingInfoPricingSource }
     *     
     */
    public void setPricingSource(AirItineraryPricingInfoPricingSource value) {
        this.pricingSource = value;
    }

    /**
     * Gets the value of the validatingAirlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingAirlineCode() {
        return validatingAirlineCode;
    }

    /**
     * Sets the value of the validatingAirlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatingAirlineCode(String value) {
        this.validatingAirlineCode = value;
    }

    /**
     * Gets the value of the negotiatedFareCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegotiatedFareCode() {
        return negotiatedFareCode;
    }

    /**
     * Sets the value of the negotiatedFareCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegotiatedFareCode(String value) {
        this.negotiatedFareCode = value;
    }

}
