
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FareReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RuleInfo" type="{http://traveltalk.com/wsTravelBuild}RuleInfo" minOccurs="0"/>
 *         &lt;element name="FilingAirline" type="{http://traveltalk.com/wsTravelBuild}FilingAirline" minOccurs="0"/>
 *         &lt;element name="MarketingAirline" type="{http://traveltalk.com/wsTravelBuild}MarketingAirline" minOccurs="0"/>
 *         &lt;element name="DepartureAirport" type="{http://traveltalk.com/wsTravelBuild}DepartureAirport" minOccurs="0"/>
 *         &lt;element name="ArrivalAirport" type="{http://traveltalk.com/wsTravelBuild}ArrivalAirport" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="NegotiatedFare" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="NegotiatedFareCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "FareReference")
    protected String fareReference;
    @XmlElement(name = "RuleInfo")
    protected RuleInfo ruleInfo;
    @XmlElement(name = "FilingAirline")
    protected FilingAirline filingAirline;
    @XmlElement(name = "MarketingAirline")
    protected MarketingAirline marketingAirline;
    @XmlElement(name = "DepartureAirport")
    protected DepartureAirport departureAirport;
    @XmlElement(name = "ArrivalAirport")
    protected ArrivalAirport arrivalAirport;
    @XmlAttribute(name = "NegotiatedFare")
    protected Boolean negotiatedFare;
    @XmlAttribute(name = "NegotiatedFareCode")
    protected String negotiatedFareCode;

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
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
     * @return
     *     possible object is
     *     {@link MarketingAirline }
     *     
     */
    public MarketingAirline getMarketingAirline() {
        return marketingAirline;
    }

    /**
     * Sets the value of the marketingAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingAirline }
     *     
     */
    public void setMarketingAirline(MarketingAirline value) {
        this.marketingAirline = value;
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

}
