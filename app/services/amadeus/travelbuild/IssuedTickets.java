
package services.amadeus.travelbuild;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssuedTickets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssuedTickets">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IssuedTicket" type="{http://traveltalk.com/wsTravelBuild}IssuedTicket" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ManualDocument" type="{http://traveltalk.com/wsTravelBuild}ManualDocument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AutomatedTicket" type="{http://traveltalk.com/wsTravelBuild}AutomatedTicket" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ElectronicTicket" type="{http://traveltalk.com/wsTravelBuild}ElectronicTicket" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ManualTicket" type="{http://traveltalk.com/wsTravelBuild}ManualTicket" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IssuedInvoice" type="{http://traveltalk.com/wsTravelBuild}IssuedInvoice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExchangeDocument" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TicketingCarrier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuedTickets", propOrder = {
    "issuedTicket",
    "manualDocument",
    "automatedTicket",
    "electronicTicket",
    "manualTicket",
    "issuedInvoice",
    "exchangeDocument",
    "ticketingCarrier"
})
public class IssuedTickets {

    @XmlElement(name = "IssuedTicket")
    protected List<IssuedTicket> issuedTicket;
    @XmlElement(name = "ManualDocument")
    protected List<ManualDocument> manualDocument;
    @XmlElement(name = "AutomatedTicket")
    protected List<AutomatedTicket> automatedTicket;
    @XmlElement(name = "ElectronicTicket")
    protected List<ElectronicTicket> electronicTicket;
    @XmlElement(name = "ManualTicket")
    protected List<ManualTicket> manualTicket;
    @XmlElement(name = "IssuedInvoice")
    protected List<IssuedInvoice> issuedInvoice;
    @XmlElement(name = "ExchangeDocument")
    protected List<String> exchangeDocument;
    @XmlElement(name = "TicketingCarrier")
    protected List<String> ticketingCarrier;

    /**
     * Gets the value of the issuedTicket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issuedTicket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssuedTicket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssuedTicket }
     * 
     * 
     */
    public List<IssuedTicket> getIssuedTicket() {
        if (issuedTicket == null) {
            issuedTicket = new ArrayList<IssuedTicket>();
        }
        return this.issuedTicket;
    }

    /**
     * Gets the value of the manualDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manualDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManualDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManualDocument }
     * 
     * 
     */
    public List<ManualDocument> getManualDocument() {
        if (manualDocument == null) {
            manualDocument = new ArrayList<ManualDocument>();
        }
        return this.manualDocument;
    }

    /**
     * Gets the value of the automatedTicket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the automatedTicket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutomatedTicket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutomatedTicket }
     * 
     * 
     */
    public List<AutomatedTicket> getAutomatedTicket() {
        if (automatedTicket == null) {
            automatedTicket = new ArrayList<AutomatedTicket>();
        }
        return this.automatedTicket;
    }

    /**
     * Gets the value of the electronicTicket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicTicket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectronicTicket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectronicTicket }
     * 
     * 
     */
    public List<ElectronicTicket> getElectronicTicket() {
        if (electronicTicket == null) {
            electronicTicket = new ArrayList<ElectronicTicket>();
        }
        return this.electronicTicket;
    }

    /**
     * Gets the value of the manualTicket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manualTicket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManualTicket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManualTicket }
     * 
     * 
     */
    public List<ManualTicket> getManualTicket() {
        if (manualTicket == null) {
            manualTicket = new ArrayList<ManualTicket>();
        }
        return this.manualTicket;
    }

    /**
     * Gets the value of the issuedInvoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issuedInvoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssuedInvoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssuedInvoice }
     * 
     * 
     */
    public List<IssuedInvoice> getIssuedInvoice() {
        if (issuedInvoice == null) {
            issuedInvoice = new ArrayList<IssuedInvoice>();
        }
        return this.issuedInvoice;
    }

    /**
     * Gets the value of the exchangeDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchangeDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExchangeDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExchangeDocument() {
        if (exchangeDocument == null) {
            exchangeDocument = new ArrayList<String>();
        }
        return this.exchangeDocument;
    }

    /**
     * Gets the value of the ticketingCarrier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketingCarrier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketingCarrier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTicketingCarrier() {
        if (ticketingCarrier == null) {
            ticketingCarrier = new ArrayList<String>();
        }
        return this.ticketingCarrier;
    }

}
