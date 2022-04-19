
package services.amadeus.lowfareplus;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RuleInfo" type="{http://traveltalk.com/wsLowFarePlus}RuleInfo" minOccurs="0"/>
 *         &lt;element name="FilingAirline" type="{http://traveltalk.com/wsLowFarePlus}FilingAirline" minOccurs="0"/>
 *         &lt;element name="MarketingAirline" type="{http://traveltalk.com/wsLowFarePlus}MarketingAirline" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DepartureAirport" type="{http://traveltalk.com/wsLowFarePlus}DepartureAirport" minOccurs="0"/>
 *         &lt;element name="ArrivalAirport" type="{http://traveltalk.com/wsLowFarePlus}ArrivalAirport" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="NegotiatedFare" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="NegotiatedFareCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BreakPoint" use="required" type="{http://traveltalk.com/wsLowFarePlus}BreakPointEnum" />
 *       &lt;attribute name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareInfo", propOrder = {
    "departureDate",
    "fareReference",
    "ruleInfo",
    "filingAirline",
    "marketingAirline",
    "departureAirport",
    "arrivalAirport"
})
public class FareInfo {

    @XmlElement(name = "DepartureDate")
    protected String departureDate;
    @XmlElement(name = "FareReference")
    protected String fareReference;
    @XmlElement(name = "RuleInfo")
    protected RuleInfo ruleInfo;
    @XmlElement(name = "FilingAirline")
    protected FilingAirline filingAirline;
    @XmlElement(name = "MarketingAirline")
    protected List<MarketingAirline> marketingAirline;
    @XmlElement(name = "DepartureAirport")
    protected DepartureAirport departureAirport;
    @XmlElement(name = "ArrivalAirport")
    protected ArrivalAirport arrivalAirport;
    @XmlAttribute(name = "NegotiatedFare")
    protected Boolean negotiatedFare;
    @XmlAttribute(name = "NegotiatedFareCode")
    protected String negotiatedFareCode;
    @XmlAttribute(name = "BreakPoint", required = true)
    protected BreakPointEnum breakPoint;
    @XmlAttribute(name = "PassengerType")
    protected String passengerType;

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
     *     {@link RuleInfo }
     *     
     */
    public RuleInfo getRuleInfo() {
        return ruleInfo;
    }

    /**
     * Sets the value of the ruleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleInfo }
     *     
     */
    public void setRuleInfo(RuleInfo value) {
        this.ruleInfo = value;
    }

    /**
     * Gets the value of the filingAirline property.
     * 
     * @return
     *     possible object is
     *     {@link FilingAirline }
     *     
     */
    public FilingAirline getFilingAirline() {
        return filingAirline;
    }

    /**
     * Sets the value of the filingAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilingAirline }
     *     
     */
    public void setFilingAirline(FilingAirline value) {
        this.filingAirline = value;
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
     * {@link MarketingAirline }
     * 
     * 
     */
    public List<MarketingAirline> getMarketingAirline() {
        if (marketingAirline == null) {
            marketingAirline = new ArrayList<MarketingAirline>();
        }
        return this.marketingAirline;
    }

    /**
     * Gets the value of the departureAirport property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureAirport }
     *     
     */
    public DepartureAirport getDepartureAirport() {
        return departureAirport;
    }

    /**
     * Sets the value of the departureAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureAirport }
     *     
     */
    public void setDepartureAirport(DepartureAirport value) {
        this.departureAirport = value;
    }

    /**
     * Gets the value of the arrivalAirport property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalAirport }
     *     
     */
    public ArrivalAirport getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * Sets the value of the arrivalAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalAirport }
     *     
     */
    public void setArrivalAirport(ArrivalAirport value) {
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

    /**
     * Gets the value of the breakPoint property.
     * 
     * @return
     *     possible object is
     *     {@link BreakPointEnum }
     *     
     */
    public BreakPointEnum getBreakPoint() {
        return breakPoint;
    }

    /**
     * Sets the value of the breakPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link BreakPointEnum }
     *     
     */
    public void setBreakPoint(BreakPointEnum value) {
        this.breakPoint = value;
    }

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
    }

}
