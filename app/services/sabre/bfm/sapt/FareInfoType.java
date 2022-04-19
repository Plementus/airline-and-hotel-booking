
package services.sabre.bfm.sapt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Rules for this priced option. 
 * 
 * <p>Java class for FareInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareReference" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8"/>
 *         &lt;element name="RuleInfo" type="{http://www.opentravel.org/OTA/2003/05}RuleInfoType"/>
 *         &lt;element name="MarketingAirline" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DepartureAirport" type="{http://www.opentravel.org/OTA/2003/05}ResponseLocationType"/>
 *         &lt;element name="ArrivalAirport" type="{http://www.opentravel.org/OTA/2003/05}ResponseLocationType"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}NegotiatedFareAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareInfoType", propOrder = {
    "departureDate",
    "fareReference",
    "ruleInfo",
    "marketingAirline",
    "departureAirport",
    "arrivalAirport"
})
public class FareInfoType {

    @XmlElement(name = "DepartureDate")
    protected String departureDate;
    @XmlElement(name = "FareReference", required = true)
    protected String fareReference;
    @XmlElement(name = "RuleInfo", required = true)
    protected RuleInfoType ruleInfo;
    @XmlElement(name = "MarketingAirline")
    protected List<CompanyNameType> marketingAirline;
    @XmlElement(name = "DepartureAirport", required = true)
    protected ResponseLocationType departureAirport;
    @XmlElement(name = "ArrivalAirport", required = true)
    protected ResponseLocationType arrivalAirport;
    @XmlAttribute(name = "NegotiatedFare")
    protected Boolean negotiatedFare;
    @XmlAttribute(name = "NegotiatedFareCode")
    protected String negotiatedFareCode;

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDate(String value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the fareReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareReference() {
        return fareReference;
    }

    /**
     * Sets the value of the fareReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareReference(String value) {
        this.fareReference = value;
    }

    /**
     * Gets the value of the ruleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RuleInfoType }
     *     
     */
    public RuleInfoType getRuleInfo() {
        return ruleInfo;
    }

    /**
     * Sets the value of the ruleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleInfoType }
     *     
     */
    public void setRuleInfo(RuleInfoType value) {
        this.ruleInfo = value;
    }

    /**
     * Gets the value of the marketingAirline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketingAirline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketingAirline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyNameType }
     * 
     * 
     */
    public List<CompanyNameType> getMarketingAirline() {
        if (marketingAirline == null) {
            marketingAirline = new ArrayList<CompanyNameType>();
        }
        return this.marketingAirline;
    }

    /**
     * Gets the value of the departureAirport property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseLocationType }
     *     
     */
    public ResponseLocationType getDepartureAirport() {
        return departureAirport;
    }

    /**
     * Sets the value of the departureAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseLocationType }
     *     
     */
    public void setDepartureAirport(ResponseLocationType value) {
        this.departureAirport = value;
    }

    /**
     * Gets the value of the arrivalAirport property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseLocationType }
     *     
     */
    public ResponseLocationType getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * Sets the value of the arrivalAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseLocationType }
     *     
     */
    public void setArrivalAirport(ResponseLocationType value) {
        this.arrivalAirport = value;
    }

    /**
     * Gets the value of the negotiatedFare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNegotiatedFare() {
        if (negotiatedFare == null) {
            return false;
        } else {
            return negotiatedFare;
        }
    }

    /**
     * Sets the value of the negotiatedFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegotiatedFare(Boolean value) {
        this.negotiatedFare = value;
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
