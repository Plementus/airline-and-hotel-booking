
package services.amadeus.travelbuild;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PNRData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PNRData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Traveler" type="{http://traveltalk.com/wsTravelBuild}Traveler" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Telephone" type="{http://traveltalk.com/wsTravelBuild}Telephone" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://traveltalk.com/wsTravelBuild}Email" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://traveltalk.com/wsTravelBuild}Address" minOccurs="0"/>
 *         &lt;element name="Ticketing" type="{http://traveltalk.com/wsTravelBuild}Ticketing" minOccurs="0"/>
 *         &lt;element name="AccountingLine" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Queue" type="{http://traveltalk.com/wsTravelBuild}Queue" minOccurs="0"/>
 *         &lt;element name="MCO" type="{http://traveltalk.com/wsTravelBuild}MCO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ProfileCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNRData", propOrder = {
    "traveler",
    "telephone",
    "email",
    "address",
    "ticketing",
    "accountingLine",
    "queue",
    "mco"
})
public class PNRData {

    @XmlElement(name = "Traveler")
    protected List<Traveler> traveler;
    @XmlElement(name = "Telephone")
    protected List<Telephone> telephone;
    @XmlElement(name = "Email")
    protected List<Email> email;
    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "Ticketing")
    protected Ticketing ticketing;
    @XmlElement(name = "AccountingLine")
    protected List<String> accountingLine;
    @XmlElement(name = "Queue")
    protected Queue queue;
    @XmlElement(name = "MCO")
    protected List<MCO> mco;
    @XmlAttribute(name = "ProfileCompanyName")
    protected String profileCompanyName;

    /**
     * Gets the value of the traveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Traveler }
     * 
     * 
     */
    public List<Traveler> getTraveler() {
        if (traveler == null) {
            traveler = new ArrayList<Traveler>();
        }
        return this.traveler;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Telephone }
     * 
     * 
     */
    public List<Telephone> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<Telephone>();
        }
        return this.telephone;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Email }
     * 
     * 
     */
    public List<Email> getEmail() {
        if (email == null) {
            email = new ArrayList<Email>();
        }
        return this.email;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the ticketing property.
     * 
     * @return
     *     possible object is
     *     {@link Ticketing }
     *     
     */
    public Ticketing getTicketing() {
        return ticketing;
    }

    /**
     * Sets the value of the ticketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ticketing }
     *     
     */
    public void setTicketing(Ticketing value) {
        this.ticketing = value;
    }

    /**
     * Gets the value of the accountingLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountingLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountingLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAccountingLine() {
        if (accountingLine == null) {
            accountingLine = new ArrayList<String>();
        }
        return this.accountingLine;
    }

    /**
     * Gets the value of the queue property.
     * 
     * @return
     *     possible object is
     *     {@link Queue }
     *     
     */
    public Queue getQueue() {
        return queue;
    }

    /**
     * Sets the value of the queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Queue }
     *     
     */
    public void setQueue(Queue value) {
        this.queue = value;
    }

    /**
     * Gets the value of the mco property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mco property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMCO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MCO }
     * 
     * 
     */
    public List<MCO> getMCO() {
        if (mco == null) {
            mco = new ArrayList<MCO>();
        }
        return this.mco;
    }

    /**
     * Gets the value of the profileCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileCompanyName() {
        return profileCompanyName;
    }

    /**
     * Sets the value of the profileCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileCompanyName(String value) {
        this.profileCompanyName = value;
    }

}
