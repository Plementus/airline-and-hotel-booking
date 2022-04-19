
package services.sabre.bfm.altdate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Extends TicketingInfoType to provide an eTicketNumber.
 * 
 * <p>Java class for TicketingInfoRS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketingInfoRS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TicketAdvisory" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="eTicketNumber" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
 *       &lt;attribute name="TicketType" use="required" type="{http://www.opentravel.org/OTA/2003/05}TicketType" />
 *       &lt;attribute name="ValidInterline" type="{http://www.opentravel.org/OTA/2003/05}ValidInterlineType" default="Unknown" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketingInfoRS_Type", propOrder = {
    "ticketAdvisory",
    "tpaExtensions"
})
public class TicketingInfoRSType {

    @XmlElement(name = "TicketAdvisory")
    protected List<FreeTextType> ticketAdvisory;
    @XmlElement(name = "TPA_Extensions")
    protected String tpaExtensions;
    @XmlAttribute(name = "eTicketNumber")
    protected String eTicketNumber;
    @XmlAttribute(name = "TicketType", required = true)
    protected TicketType ticketType;
    @XmlAttribute(name = "ValidInterline")
    protected ValidInterlineType validInterline;

    /**
     * Gets the value of the ticketAdvisory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketAdvisory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketAdvisory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeTextType }
     * 
     * 
     */
    public List<FreeTextType> getTicketAdvisory() {
        if (ticketAdvisory == null) {
            ticketAdvisory = new ArrayList<FreeTextType>();
        }
        return this.ticketAdvisory;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPAExtensions(String value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the eTicketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETicketNumber() {
        return eTicketNumber;
    }

    /**
     * Sets the value of the eTicketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETicketNumber(String value) {
        this.eTicketNumber = value;
    }

    /**
     * Gets the value of the ticketType property.
     * 
     * @return
     *     possible object is
     *     {@link TicketType }
     *     
     */
    public TicketType getTicketType() {
        return ticketType;
    }

    /**
     * Sets the value of the ticketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketType }
     *     
     */
    public void setTicketType(TicketType value) {
        this.ticketType = value;
    }

    /**
     * Gets the value of the validInterline property.
     * 
     * @return
     *     possible object is
     *     {@link ValidInterlineType }
     *     
     */
    public ValidInterlineType getValidInterline() {
        if (validInterline == null) {
            return ValidInterlineType.UNKNOWN;
        } else {
            return validInterline;
        }
    }

    /**
     * Sets the value of the validInterline property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidInterlineType }
     *     
     */
    public void setValidInterline(ValidInterlineType value) {
        this.validInterline = value;
    }

}
