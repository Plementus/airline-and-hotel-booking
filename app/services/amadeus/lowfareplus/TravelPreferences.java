
package services.amadeus.lowfareplus;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelPreferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelPreferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VendorPref" type="{http://traveltalk.com/wsLowFarePlus}VendorPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FlightTypePref" type="{http://traveltalk.com/wsLowFarePlus}FlightTypePref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FareRestrictPref" type="{http://traveltalk.com/wsLowFarePlus}FareRestrictPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipPref" type="{http://traveltalk.com/wsLowFarePlus}EquipPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CabinPref" type="{http://traveltalk.com/wsLowFarePlus}CabinPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TicketDistribPref" type="{http://traveltalk.com/wsLowFarePlus}TicketDistribPref" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="OnTimeRate" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="ETicketDesired" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="MaxStopsQuantity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelPreferences", propOrder = {
    "vendorPref",
    "flightTypePref",
    "fareRestrictPref",
    "equipPref",
    "cabinPref",
    "ticketDistribPref"
})
public class TravelPreferences {

    @XmlElement(name = "VendorPref")
    protected List<VendorPref> vendorPref;
    @XmlElement(name = "FlightTypePref")
    protected List<FlightTypePref> flightTypePref;
    @XmlElement(name = "FareRestrictPref")
    protected List<FareRestrictPref> fareRestrictPref;
    @XmlElement(name = "EquipPref")
    protected List<EquipPref> equipPref;
    @XmlElement(name = "CabinPref")
    protected List<CabinPref> cabinPref;
    @XmlElement(name = "TicketDistribPref")
    protected List<TicketDistribPref> ticketDistribPref;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;
    @XmlAttribute(name = "OnTimeRate")
    protected Double onTimeRate;
    @XmlAttribute(name = "ETicketDesired")
    protected Boolean eTicketDesired;
    @XmlAttribute(name = "MaxStopsQuantity")
    protected Integer maxStopsQuantity;

    /**
     * Gets the value of the vendorPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VendorPref }
     * 
     * 
     */
    public List<VendorPref> getVendorPref() {
        if (vendorPref == null) {
            vendorPref = new ArrayList<VendorPref>();
        }
        return this.vendorPref;
    }

    /**
     * Gets the value of the flightTypePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightTypePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightTypePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightTypePref }
     * 
     * 
     */
    public List<FlightTypePref> getFlightTypePref() {
        if (flightTypePref == null) {
            flightTypePref = new ArrayList<FlightTypePref>();
        }
        return this.flightTypePref;
    }

    /**
     * Gets the value of the fareRestrictPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRestrictPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRestrictPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRestrictPref }
     * 
     * 
     */
    public List<FareRestrictPref> getFareRestrictPref() {
        if (fareRestrictPref == null) {
            fareRestrictPref = new ArrayList<FareRestrictPref>();
        }
        return this.fareRestrictPref;
    }

    /**
     * Gets the value of the equipPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipPref }
     * 
     * 
     */
    public List<EquipPref> getEquipPref() {
        if (equipPref == null) {
            equipPref = new ArrayList<EquipPref>();
        }
        return this.equipPref;
    }

    /**
     * Gets the value of the cabinPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinPref }
     * 
     * 
     */
    public List<CabinPref> getCabinPref() {
        if (cabinPref == null) {
            cabinPref = new ArrayList<CabinPref>();
        }
        return this.cabinPref;
    }

    /**
     * Gets the value of the ticketDistribPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketDistribPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketDistribPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketDistribPref }
     * 
     * 
     */
    public List<TicketDistribPref> getTicketDistribPref() {
        if (ticketDistribPref == null) {
            ticketDistribPref = new ArrayList<TicketDistribPref>();
        }
        return this.ticketDistribPref;
    }

    /**
     * Gets the value of the smokingAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSmokingAllowed() {
        if (smokingAllowed == null) {
            return false;
        } else {
            return smokingAllowed;
        }
    }

    /**
     * Sets the value of the smokingAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokingAllowed(Boolean value) {
        this.smokingAllowed = value;
    }

    /**
     * Gets the value of the onTimeRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOnTimeRate() {
        return onTimeRate;
    }

    /**
     * Sets the value of the onTimeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOnTimeRate(Double value) {
        this.onTimeRate = value;
    }

    /**
     * Gets the value of the eTicketDesired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isETicketDesired() {
        if (eTicketDesired == null) {
            return false;
        } else {
            return eTicketDesired;
        }
    }

    /**
     * Sets the value of the eTicketDesired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setETicketDesired(Boolean value) {
        this.eTicketDesired = value;
    }

    /**
     * Gets the value of the maxStopsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxStopsQuantity() {
        return maxStopsQuantity;
    }

    /**
     * Sets the value of the maxStopsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxStopsQuantity(Integer value) {
        this.maxStopsQuantity = value;
    }

}
