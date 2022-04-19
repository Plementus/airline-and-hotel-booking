
package services.amadeus.lowfareschedule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirItineraryPricingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirItineraryPricingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItinTotalFare" type="{http://traveltalk.com/wsLowFareSchedule}ItinTotalFare" minOccurs="0"/>
 *         &lt;element name="PTC_FareBreakdowns" type="{http://traveltalk.com/wsLowFareSchedule}ArrayOfPTC_FareBreakdown" minOccurs="0"/>
 *         &lt;element name="FareInfos" type="{http://traveltalk.com/wsLowFareSchedule}ArrayOfFareInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PricingSource" type="{http://traveltalk.com/wsLowFareSchedule}AirItineraryPricingInfoPricingSource" />
 *       &lt;attribute name="ValidatingAirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirItineraryPricingInfo", propOrder = {
    "itinTotalFare",
    "ptcFareBreakdowns",
    "fareInfos"
})
public class AirItineraryPricingInfo {

    @XmlElement(name = "ItinTotalFare")
    protected ItinTotalFare itinTotalFare;
    @XmlElement(name = "PTC_FareBreakdowns")
    protected ArrayOfPTCFareBreakdown ptcFareBreakdowns;
    @XmlElement(name = "FareInfos")
    protected ArrayOfFareInfo fareInfos;
    @XmlAttribute(name = "PricingSource")
    protected AirItineraryPricingInfoPricingSource pricingSource;
    @XmlAttribute(name = "ValidatingAirlineCode")
    protected String validatingAirlineCode;

    /**
     * Gets the value of the itinTotalFare property.
     * 
     * @return
     *     possible object is
     *     {@link ItinTotalFare }
     *     
     */
    public ItinTotalFare getItinTotalFare() {
        return itinTotalFare;
    }

    /**
     * Sets the value of the itinTotalFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinTotalFare }
     *     
     */
    public void setItinTotalFare(ItinTotalFare value) {
        this.itinTotalFare = value;
    }

    /**
     * Gets the value of the ptcFareBreakdowns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPTCFareBreakdown }
     *     
     */
    public ArrayOfPTCFareBreakdown getPTCFareBreakdowns() {
        return ptcFareBreakdowns;
    }

    /**
     * Sets the value of the ptcFareBreakdowns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPTCFareBreakdown }
     *     
     */
    public void setPTCFareBreakdowns(ArrayOfPTCFareBreakdown value) {
        this.ptcFareBreakdowns = value;
    }

    /**
     * Gets the value of the fareInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFareInfo }
     *     
     */
    public ArrayOfFareInfo getFareInfos() {
        return fareInfos;
    }

    /**
     * Sets the value of the fareInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFareInfo }
     *     
     */
    public void setFareInfos(ArrayOfFareInfo value) {
        this.fareInfos = value;
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

}
