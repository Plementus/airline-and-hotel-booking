
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountVendor" type="{http://traveltalk.com/wsTravelBuild}AccountVendor" minOccurs="0"/>
 *         &lt;element name="Airline" type="{http://traveltalk.com/wsTravelBuild}Airline" minOccurs="0"/>
 *         &lt;element name="BaseFare" type="{http://traveltalk.com/wsTravelBuild}BaseFareRS" minOccurs="0"/>
 *         &lt;element name="DocumentInfo" type="{http://traveltalk.com/wsTravelBuild}DocumentInfo" minOccurs="0"/>
 *         &lt;element name="ChargeCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareApplication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentInfo" type="{http://traveltalk.com/wsTravelBuild}PaymentInfo" minOccurs="0"/>
 *         &lt;element name="TravelerRefNumber" type="{http://traveltalk.com/wsTravelBuild}TravelerRefNumber" minOccurs="0"/>
 *         &lt;element name="Taxes" type="{http://traveltalk.com/wsTravelBuild}TaxesRS" minOccurs="0"/>
 *         &lt;element name="TicketingInfoWSResponse" type="{http://traveltalk.com/wsTravelBuild}TicketingInfoWSResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RPH" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="LinkCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingInfo", propOrder = {
    "accountVendor",
    "airline",
    "baseFare",
    "documentInfo",
    "chargeCategory",
    "fareApplication",
    "paymentInfo",
    "travelerRefNumber",
    "taxes",
    "ticketingInfo"
})
public class AccountingInfo {

    @XmlElement(name = "AccountVendor")
    protected AccountVendor accountVendor;
    @XmlElement(name = "Airline")
    protected Airline airline;
    @XmlElement(name = "BaseFare")
    protected BaseFareRS baseFare;
    @XmlElement(name = "DocumentInfo")
    protected DocumentInfo documentInfo;
    @XmlElement(name = "ChargeCategory")
    protected String chargeCategory;
    @XmlElement(name = "FareApplication")
    protected String fareApplication;
    @XmlElement(name = "PaymentInfo")
    protected PaymentInfo paymentInfo;
    @XmlElement(name = "TravelerRefNumber")
    protected TravelerRefNumber travelerRefNumber;
    @XmlElement(name = "Taxes")
    protected TaxesRS taxes;
    @XmlElement(name = "TicketingInfoWSResponse")
    protected TicketingInfo ticketingInfo;
    @XmlAttribute(name = "RPH", required = true)
    protected int rph;
    @XmlAttribute(name = "LinkCode")
    protected String linkCode;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the accountVendor property.
     * 
     * @return
     *     possible object is
     *     {@link AccountVendor }
     *     
     */
    public AccountVendor getAccountVendor() {
        return accountVendor;
    }

    /**
     * Sets the value of the accountVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountVendor }
     *     
     */
    public void setAccountVendor(AccountVendor value) {
        this.accountVendor = value;
    }

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
     * Gets the value of the baseFare property.
     * 
     * @return
     *     possible object is
     *     {@link BaseFareRS }
     *     
     */
    public BaseFareRS getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseFareRS }
     *     
     */
    public void setBaseFare(BaseFareRS value) {
        this.baseFare = value;
    }

    /**
     * Gets the value of the documentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentInfo }
     *     
     */
    public DocumentInfo getDocumentInfo() {
        return documentInfo;
    }

    /**
     * Sets the value of the documentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentInfo }
     *     
     */
    public void setDocumentInfo(DocumentInfo value) {
        this.documentInfo = value;
    }

    /**
     * Gets the value of the chargeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeCategory() {
        return chargeCategory;
    }

    /**
     * Sets the value of the chargeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeCategory(String value) {
        this.chargeCategory = value;
    }

    /**
     * Gets the value of the fareApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareApplication() {
        return fareApplication;
    }

    /**
     * Sets the value of the fareApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareApplication(String value) {
        this.fareApplication = value;
    }

    /**
     * Gets the value of the paymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInfo }
     *     
     */
    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * Sets the value of the paymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInfo }
     *     
     */
    public void setPaymentInfo(PaymentInfo value) {
        this.paymentInfo = value;
    }

    /**
     * Gets the value of the travelerRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerRefNumber }
     *     
     */
    public TravelerRefNumber getTravelerRefNumber() {
        return travelerRefNumber;
    }

    /**
     * Sets the value of the travelerRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerRefNumber }
     *     
     */
    public void setTravelerRefNumber(TravelerRefNumber value) {
        this.travelerRefNumber = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link TaxesRS }
     *     
     */
    public TaxesRS getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxesRS }
     *     
     */
    public void setTaxes(TaxesRS value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the ticketingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TicketingInfo }
     *     
     */
    public TicketingInfo getTicketingInfo() {
        return ticketingInfo;
    }

    /**
     * Sets the value of the ticketingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingInfo }
     *     
     */
    public void setTicketingInfo(TicketingInfo value) {
        this.ticketingInfo = value;
    }

    /**
     * Gets the value of the rph property.
     * 
     */
    public int getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     */
    public void setRPH(int value) {
        this.rph = value;
    }

    /**
     * Gets the value of the linkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkCode() {
        return linkCode;
    }

    /**
     * Sets the value of the linkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkCode(String value) {
        this.linkCode = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
