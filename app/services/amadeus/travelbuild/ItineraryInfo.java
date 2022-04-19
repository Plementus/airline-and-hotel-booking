
package services.amadeus.travelbuild;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItineraryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactInfo" type="{http://traveltalk.com/wsTravelBuild}ContactInfo" minOccurs="0"/>
 *         &lt;element name="ReservationItems" type="{http://traveltalk.com/wsTravelBuild}ReservationItems" minOccurs="0"/>
 *         &lt;element name="Ticketing" type="{http://traveltalk.com/wsTravelBuild}TicketingRS" minOccurs="0"/>
 *         &lt;element name="ItineraryPricing" type="{http://traveltalk.com/wsTravelBuild}ItineraryPricing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecialRequestDetails" type="{http://traveltalk.com/wsTravelBuild}SpecialRequestDetails" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://traveltalk.com/wsTravelBuild}TPA_ExtensionsRS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryInfo", propOrder = {
    "contactInfo",
    "reservationItems",
    "ticketing",
    "itineraryPricing",
    "specialRequestDetails",
    "tpaExtensions"
})
public class ItineraryInfo {

    @XmlElement(name = "ContactInfo")
    protected ContactInfo contactInfo;
    @XmlElement(name = "ReservationItems")
    protected ReservationItems reservationItems;
    @XmlElement(name = "Ticketing")
    protected TicketingRS ticketing;
    @XmlElement(name = "ItineraryPricing")
    protected List<ItineraryPricing> itineraryPricing;
    @XmlElement(name = "SpecialRequestDetails")
    protected SpecialRequestDetails specialRequestDetails;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsRS tpaExtensions;

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfo }
     *     
     */
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfo }
     *     
     */
    public void setContactInfo(ContactInfo value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the reservationItems property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationItems }
     *     
     */
    public ReservationItems getReservationItems() {
        return reservationItems;
    }

    /**
     * Sets the value of the reservationItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationItems }
     *     
     */
    public void setReservationItems(ReservationItems value) {
        this.reservationItems = value;
    }

    /**
     * Gets the value of the ticketing property.
     * 
     * @return
     *     possible object is
     *     {@link TicketingRS }
     *     
     */
    public TicketingRS getTicketing() {
        return ticketing;
    }

    /**
     * Sets the value of the ticketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingRS }
     *     
     */
    public void setTicketing(TicketingRS value) {
        this.ticketing = value;
    }

    /**
     * Gets the value of the itineraryPricing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryPricing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryPricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryPricing }
     * 
     * 
     */
    public List<ItineraryPricing> getItineraryPricing() {
        if (itineraryPricing == null) {
            itineraryPricing = new ArrayList<ItineraryPricing>();
        }
        return this.itineraryPricing;
    }

    /**
     * Gets the value of the specialRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequestDetails }
     *     
     */
    public SpecialRequestDetails getSpecialRequestDetails() {
        return specialRequestDetails;
    }

    /**
     * Sets the value of the specialRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequestDetails }
     *     
     */
    public void setSpecialRequestDetails(SpecialRequestDetails value) {
        this.specialRequestDetails = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsRS }
     *     
     */
    public TPAExtensionsRS getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsRS }
     *     
     */
    public void setTPAExtensions(TPAExtensionsRS value) {
        this.tpaExtensions = value;
    }

}
