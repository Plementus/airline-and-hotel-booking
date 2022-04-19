
package services.sabre.bfm.sapt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeSourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="BookingChannel" type="{http://www.opentravel.org/OTA/2003/05}SourceBookingChannelType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SourceAttributeGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeSourceAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeSourceType", propOrder = {
    "bookingChannel"
})
public class ExchangeSourceType {

    @XmlElement(name = "BookingChannel")
    protected SourceBookingChannelType bookingChannel;
    @XmlAttribute(name = "AgentSine")
    protected String agentSine;
    @XmlAttribute(name = "PseudoCityCode")
    protected String pseudoCityCode;
    @XmlAttribute(name = "ISOCountry")
    protected String isoCountry;
    @XmlAttribute(name = "ISOCurrency")
    protected String isoCurrency;
    @XmlAttribute(name = "AgentDutyCode")
    protected String agentDutyCode;
    @XmlAttribute(name = "AirlineVendorID")
    protected String airlineVendorID;
    @XmlAttribute(name = "AirportCode")
    protected String airportCode;
    @XmlAttribute(name = "FirstDepartPoint")
    protected String firstDepartPoint;
    @XmlAttribute(name = "ERSP_UserID")
    protected String erspUserID;
    @XmlAttribute(name = "PersonalCityCode")
    protected String personalCityCode;
    @XmlAttribute(name = "AccountingCode")
    protected String accountingCode;
    @XmlAttribute(name = "OfficeCode")
    protected String officeCode;
    @XmlAttribute(name = "DefaultTicketingCarrier")
    protected String defaultTicketingCarrier;
    @XmlAttribute(name = "AgentCity", required = true)
    protected String agentCity;
    @XmlAttribute(name = "MainTravelAgencyPCC", required = true)
    protected String mainTravelAgencyPCC;
    @XmlAttribute(name = "Carrier", required = true)
    protected String carrier;
    @XmlAttribute(name = "HostCarrier")
    protected String hostCarrier;
    @XmlAttribute(name = "ETicketCapable")
    protected Boolean eTicketCapable;
    @XmlAttribute(name = "CoHostID")
    protected Short coHostID;

    /**
     * Gets the value of the bookingChannel property.
     * 
     * @return
     *     possible object is
     *     {@link SourceBookingChannelType }
     *     
     */
    public SourceBookingChannelType getBookingChannel() {
        return bookingChannel;
    }

    /**
     * Sets the value of the bookingChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceBookingChannelType }
     *     
     */
    public void setBookingChannel(SourceBookingChannelType value) {
        this.bookingChannel = value;
    }

    /**
     * Gets the value of the agentSine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentSine() {
        return agentSine;
    }

    /**
     * Sets the value of the agentSine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentSine(String value) {
        this.agentSine = value;
    }

    /**
     * Gets the value of the pseudoCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    /**
     * Sets the value of the pseudoCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudoCityCode(String value) {
        this.pseudoCityCode = value;
    }

    /**
     * Gets the value of the isoCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCountry() {
        return isoCountry;
    }

    /**
     * Sets the value of the isoCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOCountry(String value) {
        this.isoCountry = value;
    }

    /**
     * Gets the value of the isoCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCurrency() {
        return isoCurrency;
    }

    /**
     * Sets the value of the isoCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOCurrency(String value) {
        this.isoCurrency = value;
    }

    /**
     * Gets the value of the agentDutyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentDutyCode() {
        return agentDutyCode;
    }

    /**
     * Sets the value of the agentDutyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentDutyCode(String value) {
        this.agentDutyCode = value;
    }

    /**
     * Gets the value of the airlineVendorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineVendorID() {
        return airlineVendorID;
    }

    /**
     * Sets the value of the airlineVendorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineVendorID(String value) {
        this.airlineVendorID = value;
    }

    /**
     * Gets the value of the airportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportCode() {
        return airportCode;
    }

    /**
     * Sets the value of the airportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportCode(String value) {
        this.airportCode = value;
    }

    /**
     * Gets the value of the firstDepartPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstDepartPoint() {
        return firstDepartPoint;
    }

    /**
     * Sets the value of the firstDepartPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstDepartPoint(String value) {
        this.firstDepartPoint = value;
    }

    /**
     * Gets the value of the erspUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERSPUserID() {
        return erspUserID;
    }

    /**
     * Sets the value of the erspUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERSPUserID(String value) {
        this.erspUserID = value;
    }

    /**
     * Gets the value of the personalCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalCityCode() {
        return personalCityCode;
    }

    /**
     * Sets the value of the personalCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalCityCode(String value) {
        this.personalCityCode = value;
    }

    /**
     * Gets the value of the accountingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingCode() {
        return accountingCode;
    }

    /**
     * Sets the value of the accountingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingCode(String value) {
        this.accountingCode = value;
    }

    /**
     * Gets the value of the officeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeCode() {
        return officeCode;
    }

    /**
     * Sets the value of the officeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeCode(String value) {
        this.officeCode = value;
    }

    /**
     * Gets the value of the defaultTicketingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultTicketingCarrier() {
        return defaultTicketingCarrier;
    }

    /**
     * Sets the value of the defaultTicketingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultTicketingCarrier(String value) {
        this.defaultTicketingCarrier = value;
    }

    /**
     * Gets the value of the agentCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentCity() {
        return agentCity;
    }

    /**
     * Sets the value of the agentCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentCity(String value) {
        this.agentCity = value;
    }

    /**
     * Gets the value of the mainTravelAgencyPCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainTravelAgencyPCC() {
        return mainTravelAgencyPCC;
    }

    /**
     * Sets the value of the mainTravelAgencyPCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainTravelAgencyPCC(String value) {
        this.mainTravelAgencyPCC = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the hostCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostCarrier() {
        return hostCarrier;
    }

    /**
     * Sets the value of the hostCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostCarrier(String value) {
        this.hostCarrier = value;
    }

    /**
     * Gets the value of the eTicketCapable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isETicketCapable() {
        if (eTicketCapable == null) {
            return false;
        } else {
            return eTicketCapable;
        }
    }

    /**
     * Sets the value of the eTicketCapable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setETicketCapable(Boolean value) {
        this.eTicketCapable = value;
    }

    /**
     * Gets the value of the coHostID property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCoHostID() {
        return coHostID;
    }

    /**
     * Sets the value of the coHostID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCoHostID(Short value) {
        this.coHostID = value;
    }

}
