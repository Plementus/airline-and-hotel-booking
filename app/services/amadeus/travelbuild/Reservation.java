
package services.amadeus.travelbuild;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomTypes" type="{http://traveltalk.com/wsTravelBuild}RoomTypesRS" minOccurs="0"/>
 *         &lt;element name="RatePlans" type="{http://traveltalk.com/wsTravelBuild}ArrayOfRatePlan" minOccurs="0"/>
 *         &lt;element name="RoomRates" type="{http://traveltalk.com/wsTravelBuild}RoomRatesRS" minOccurs="0"/>
 *         &lt;element name="GuestCounts" type="{http://traveltalk.com/wsTravelBuild}GuestCountsRS" minOccurs="0"/>
 *         &lt;element name="TimeSpan" type="{http://traveltalk.com/wsTravelBuild}TimeSpanRS" minOccurs="0"/>
 *         &lt;element name="Guarantee" type="{http://traveltalk.com/wsTravelBuild}GuaranteeRS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DepositPayment" type="{http://traveltalk.com/wsTravelBuild}DepositPaymentRS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BasicPropertyInfo" type="{http://traveltalk.com/wsTravelBuild}BasicPropertyInfoRS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reservation", propOrder = {
    "roomTypes",
    "ratePlans",
    "roomRates",
    "guestCounts",
    "timeSpan",
    "guarantee",
    "depositPayment",
    "basicPropertyInfo"
})
public class Reservation {

    @XmlElement(name = "RoomTypes")
    protected RoomTypesRS roomTypes;
    @XmlElement(name = "RatePlans")
    protected ArrayOfRatePlan ratePlans;
    @XmlElement(name = "RoomRates")
    protected RoomRatesRS roomRates;
    @XmlElement(name = "GuestCounts")
    protected GuestCountsRS guestCounts;
    @XmlElement(name = "TimeSpan")
    protected TimeSpanRS timeSpan;
    @XmlElement(name = "Guarantee")
    protected List<GuaranteeRS> guarantee;
    @XmlElement(name = "DepositPayment")
    protected List<DepositPaymentRS> depositPayment;
    @XmlElement(name = "BasicPropertyInfo")
    protected BasicPropertyInfoRS basicPropertyInfo;

    /**
     * Gets the value of the roomTypes property.
     * 
     * @return
     *     possible object is
     *     {@link RoomTypesRS }
     *     
     */
    public RoomTypesRS getRoomTypes() {
        return roomTypes;
    }

    /**
     * Sets the value of the roomTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomTypesRS }
     *     
     */
    public void setRoomTypes(RoomTypesRS value) {
        this.roomTypes = value;
    }

    /**
     * Gets the value of the ratePlans property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRatePlan }
     *     
     */
    public ArrayOfRatePlan getRatePlans() {
        return ratePlans;
    }

    /**
     * Sets the value of the ratePlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRatePlan }
     *     
     */
    public void setRatePlans(ArrayOfRatePlan value) {
        this.ratePlans = value;
    }

    /**
     * Gets the value of the roomRates property.
     * 
     * @return
     *     possible object is
     *     {@link RoomRatesRS }
     *     
     */
    public RoomRatesRS getRoomRates() {
        return roomRates;
    }

    /**
     * Sets the value of the roomRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomRatesRS }
     *     
     */
    public void setRoomRates(RoomRatesRS value) {
        this.roomRates = value;
    }

    /**
     * Gets the value of the guestCounts property.
     * 
     * @return
     *     possible object is
     *     {@link GuestCountsRS }
     *     
     */
    public GuestCountsRS getGuestCounts() {
        return guestCounts;
    }

    /**
     * Sets the value of the guestCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestCountsRS }
     *     
     */
    public void setGuestCounts(GuestCountsRS value) {
        this.guestCounts = value;
    }

    /**
     * Gets the value of the timeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpanRS }
     *     
     */
    public TimeSpanRS getTimeSpan() {
        return timeSpan;
    }

    /**
     * Sets the value of the timeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpanRS }
     *     
     */
    public void setTimeSpan(TimeSpanRS value) {
        this.timeSpan = value;
    }

    /**
     * Gets the value of the guarantee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guarantee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuarantee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuaranteeRS }
     * 
     * 
     */
    public List<GuaranteeRS> getGuarantee() {
        if (guarantee == null) {
            guarantee = new ArrayList<GuaranteeRS>();
        }
        return this.guarantee;
    }

    /**
     * Gets the value of the depositPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depositPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepositPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepositPaymentRS }
     * 
     * 
     */
    public List<DepositPaymentRS> getDepositPayment() {
        if (depositPayment == null) {
            depositPayment = new ArrayList<DepositPaymentRS>();
        }
        return this.depositPayment;
    }

    /**
     * Gets the value of the basicPropertyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BasicPropertyInfoRS }
     *     
     */
    public BasicPropertyInfoRS getBasicPropertyInfo() {
        return basicPropertyInfo;
    }

    /**
     * Sets the value of the basicPropertyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicPropertyInfoRS }
     *     
     */
    public void setBasicPropertyInfo(BasicPropertyInfoRS value) {
        this.basicPropertyInfo = value;
    }

}
