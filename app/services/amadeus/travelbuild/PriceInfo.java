
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItinTotalFare" type="{http://traveltalk.com/wsTravelBuild}ItinTotalFare" minOccurs="0"/>
 *         &lt;element name="PTC_FareBreakdowns" type="{http://traveltalk.com/wsTravelBuild}ArrayOfPTC_FareBreakdown" minOccurs="0"/>
 *         &lt;element name="FareInfos" type="{http://traveltalk.com/wsTravelBuild}ArrayOfFareInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PricingSource" type="{http://traveltalk.com/wsTravelBuild}PriceInfoPricingSource" />
 *       &lt;attribute name="RepriceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceInfo", propOrder = {
    "itinTotalFare",
    "ptcFareBreakdowns",
    "fareInfos"
})
public class PriceInfo {

    @XmlElement(name = "ItinTotalFare")
    protected ItinTotalFare itinTotalFare;
    @XmlElement(name = "PTC_FareBreakdowns")
    protected ArrayOfPTCFareBreakdown ptcFareBreakdowns;
    @XmlElement(name = "FareInfos")
    protected ArrayOfFareInfo fareInfos;
    @XmlAttribute(name = "PricingSource")
    protected PriceInfoPricingSource pricingSource;
    @XmlAttribute(name = "RepriceRequired")
    protected Boolean repriceRequired;

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
     *     {@link PriceInfoPricingSource }
     *     
     */
    public PriceInfoPricingSource getPricingSource() {
        return pricingSource;
    }

    /**
     * Sets the value of the pricingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceInfoPricingSource }
     *     
     */
    public void setPricingSource(PriceInfoPricingSource value) {
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
