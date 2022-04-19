
package services.sabre.bfm;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlusUpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlusUpType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *       &lt;attribute name="OriginCity" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *       &lt;attribute name="DestinationCity" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *       &lt;attribute name="FareOriginCity" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *       &lt;attribute name="FareDestinationCity" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *       &lt;attribute name="ViaCity" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *       &lt;attribute name="Message" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CountryOfPayment" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlusUpType")
public class PlusUpType {

    @XmlAttribute(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlAttribute(name = "OriginCity", required = true)
    protected String originCity;
    @XmlAttribute(name = "DestinationCity", required = true)
    protected String destinationCity;
    @XmlAttribute(name = "FareOriginCity")
    protected String fareOriginCity;
    @XmlAttribute(name = "FareDestinationCity")
    protected String fareDestinationCity;
    @XmlAttribute(name = "ViaCity")
    protected String viaCity;
    @XmlAttribute(name = "Message")
    protected String message;
    @XmlAttribute(name = "CountryOfPayment")
    protected String countryOfPayment;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the originCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCity() {
        return originCity;
    }

    /**
     * Sets the value of the originCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCity(String value) {
        this.originCity = value;
    }

    /**
     * Gets the value of the destinationCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCity() {
        return destinationCity;
    }

    /**
     * Sets the value of the destinationCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCity(String value) {
        this.destinationCity = value;
    }

    /**
     * Gets the value of the fareOriginCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareOriginCity() {
        return fareOriginCity;
    }

    /**
     * Sets the value of the fareOriginCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareOriginCity(String value) {
        this.fareOriginCity = value;
    }

    /**
     * Gets the value of the fareDestinationCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareDestinationCity() {
        return fareDestinationCity;
    }

    /**
     * Sets the value of the fareDestinationCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareDestinationCity(String value) {
        this.fareDestinationCity = value;
    }

    /**
     * Gets the value of the viaCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaCity() {
        return viaCity;
    }

    /**
     * Sets the value of the viaCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaCity(String value) {
        this.viaCity = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the countryOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfPayment() {
        return countryOfPayment;
    }

    /**
     * Sets the value of the countryOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfPayment(String value) {
        this.countryOfPayment = value;
    }

}
