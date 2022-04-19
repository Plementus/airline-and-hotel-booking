
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketingInfoWSResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketingInfoWSResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ExchangeInd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OriginalInvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TarriffBasis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketingInfo")
public class TicketingInfo {

    @XmlAttribute(name = "ExchangeInd")
    protected String exchangeInd;
    @XmlAttribute(name = "OriginalInvoiceNumber")
    protected String originalInvoiceNumber;
    @XmlAttribute(name = "TarriffBasis")
    protected String tarriffBasis;

    /**
     * Gets the value of the exchangeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeInd() {
        return exchangeInd;
    }

    /**
     * Sets the value of the exchangeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeInd(String value) {
        this.exchangeInd = value;
    }

    /**
     * Gets the value of the originalInvoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalInvoiceNumber() {
        return originalInvoiceNumber;
    }

    /**
     * Sets the value of the originalInvoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalInvoiceNumber(String value) {
        this.originalInvoiceNumber = value;
    }

    /**
     * Gets the value of the tarriffBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarriffBasis() {
        return tarriffBasis;
    }

    /**
     * Sets the value of the tarriffBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarriffBasis(String value) {
        this.tarriffBasis = value;
    }

}
