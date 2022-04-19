
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirFareInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirFareInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItinTotalFare" type="{http://traveltalk.com/wsTravelBuild}ItinTotalFareRS" minOccurs="0"/>
 *         &lt;element name="PTC_FareBreakdowns" type="{http://traveltalk.com/wsTravelBuild}ArrayOfPTC_FareBreakdownRS" minOccurs="0"/>
 *         &lt;element name="FareInfos" type="{http://traveltalk.com/wsTravelBuild}ArrayOfFareInfoRS" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PricingSource" type="{http://traveltalk.com/wsTravelBuild}AirFareInfoPricingSource" />
 *       &lt;attribute name="RepriceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirFareInfo", propOrder = {
    "itinTotalFare",
    "ptcFareBreakdowns",
    "fareInfos"
})
public class AirFareInfo {

    @XmlElement(name = "ItinTotalFare")
    protected ItinTotalFareRS itinTotalFare;
    @XmlElement(name = "PTC_FareBreakdowns")
    protected ArrayOfPTCFareBreakdownRS ptcFareBreakdowns;
    @XmlElement(name = "FareInfos")
    protected ArrayOfFareInfoRS fareInfos;
    @XmlAttribute(name = "PricingSource")
    protected AirFareInfoPricingSource pricingSource;
    @XmlAttribute(name = "RepriceRequired")
    protected Boolean repriceRequired;

    /**
     * Gets the value of the itinTotalFare property.
     * 
     * @return
     *     possible object is
     *     {@link ItinTotalFareRS }
     *     
     */
    public ItinTotalFareRS getItinTotalFare() {
        return itinTotalFare;
    }

    /**
     * Sets the value of the itinTotalFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinTotalFareRS }
     *     
     */
    public void setItinTotalFare(ItinTotalFareRS value) {
        this.itinTotalFare = value;
    }

    /**
     * Gets the value of the ptcFareBreakdowns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPTCFareBreakdownRS }
     *     
     */
    public ArrayOfPTCFareBreakdownRS getPTCFareBreakdowns() {
        return ptcFareBreakdowns;
    }

    /**
     * Sets the value of the ptcFareBreakdowns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPTCFareBreakdownRS }
     *     
     */
    public void setPTCFareBreakdowns(ArrayOfPTCFareBreakdownRS value) {
        this.ptcFareBreakdowns = value;
    }

    /**
     * Gets the value of the fareInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFareInfoRS }
     *     
     */
    public ArrayOfFareInfoRS getFareInfos() {
        return fareInfos;
    }

    /**
     * Sets the value of the fareInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFareInfoRS }
     *     
     */
    public void setFareInfos(ArrayOfFareInfoRS value) {
        this.fareInfos = value;
    }

    /**
     * Gets the value of the pricingSource property.
     * 
     * @return
     *     possible object is
     *     {@link AirFareInfoPricingSource }
     *     
     */
    public AirFareInfoPricingSource getPricingSource() {
        return pricingSource;
    }

    /**
     * Sets the value of the pricingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirFareInfoPricingSource }
     *     
     */
    public void setPricingSource(AirFareInfoPricingSource value) {
        this.pricingSource = value;
    }

    /**
     * Gets the value of the repriceRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRepriceRequired() {
        if (repriceRequired == null) {
            return false;
        } else {
            return repriceRequired;
        }
    }

    /**
     * Sets the value of the repriceRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepriceRequired(Boolean value) {
        this.repriceRequired = value;
    }

}
