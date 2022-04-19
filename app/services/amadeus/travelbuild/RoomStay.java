
package services.amadeus.travelbuild;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoomStay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomStay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomTypes" type="{http://traveltalk.com/wsTravelBuild}ArrayOfRoomType" minOccurs="0"/>
 *         &lt;element name="RoomRates" type="{http://traveltalk.com/wsTravelBuild}ArrayOfRoomRate" minOccurs="0"/>
 *         &lt;element name="GuestCounts" type="{http://traveltalk.com/wsTravelBuild}GuestCounts" minOccurs="0"/>
 *         &lt;element name="TimeSpan" type="{http://traveltalk.com/wsTravelBuild}TimeSpanRQ" minOccurs="0"/>
 *         &lt;element name="Guarantee" type="{http://traveltalk.com/wsTravelBuild}Guarantee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DepositPayments" type="{http://traveltalk.com/wsTravelBuild}ArrayOfRequiredPayment" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://traveltalk.com/wsTravelBuild}Total" minOccurs="0"/>
 *         &lt;element name="BasicPropertyInfo" type="{http://traveltalk.com/wsTravelBuild}BasicPropertyInfo" minOccurs="0"/>
 *         &lt;element name="ResGuestRPHs" type="{http://traveltalk.com/wsTravelBuild}ArrayOfResGuestRPH" minOccurs="0"/>
 *         &lt;element name="Memberships" type="{http://traveltalk.com/wsTravelBuild}ArrayOfMembership" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://traveltalk.com/wsTravelBuild}ArrayOfComment" minOccurs="0"/>
 *         &lt;element name="SpecialRequests" type="{http://traveltalk.com/wsTravelBuild}ArrayOfSpecialRequest" minOccurs="0"/>
 *         &lt;element name="ServiceRPHs" type="{http://traveltalk.com/wsTravelBuild}ArrayOfServiceRPH" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://traveltalk.com/wsTravelBuild}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MarketCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SourceOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DiscountCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomStay", propOrder = {
    "roomTypes",
    "roomRates",
    "guestCounts",
    "timeSpan",
    "guarantee",
    "depositPayments",
    "total",
    "basicPropertyInfo",
    "resGuestRPHs",
    "memberships",
    "comments",
    "specialRequests",
    "serviceRPHs",
    "tpaExtensions"
})
public class RoomStay {

    @XmlElement(name = "RoomTypes")
    protected ArrayOfRoomType roomTypes;
    @XmlElement(name = "RoomRates")
    protected ArrayOfRoomRate roomRates;
    @XmlElement(name = "GuestCounts")
    protected GuestCounts guestCounts;
    @XmlElement(name = "TimeSpan")
    protected TimeSpanRQ timeSpan;
    @XmlElement(name = "Guarantee")
    protected List<Guarantee> guarantee;
    @XmlElement(name = "DepositPayments")
    protected ArrayOfRequiredPayment depositPayments;
    @XmlElement(name = "Total")
    protected Total total;
    @XmlElement(name = "BasicPropertyInfo")
    protected BasicPropertyInfo basicPropertyInfo;
    @XmlElement(name = "ResGuestRPHs")
    protected ArrayOfResGuestRPH resGuestRPHs;
    @XmlElement(name = "Memberships")
    protected ArrayOfMembership memberships;
    @XmlElement(name = "Comments")
    protected ArrayOfComment comments;
    @XmlElement(name = "SpecialRequests")
    protected ArrayOfSpecialRequest specialRequests;
    @XmlElement(name = "ServiceRPHs")
    protected ArrayOfServiceRPH serviceRPHs;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensions tpaExtensions;
    @XmlAttribute(name = "MarketCode")
    protected String marketCode;
    @XmlAttribute(name = "SourceOfBusiness")
    protected String sourceOfBusiness;
    @XmlAttribute(name = "DiscountCode")
    protected String discountCode;
    @XmlAttribute(name = "PromotionCode")
    protected String promotionCode;

    /**
     * Gets the value of the roomTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomType }
     *     
     */
    public ArrayOfRoomType getRoomTypes() {
        return roomTypes;
    }

    /**
     * Sets the value of the roomTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomType }
     *     
     */
    public void setRoomTypes(ArrayOfRoomType value) {
        this.roomTypes = value;
    }

    /**
     * Gets the value of the roomRates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomRate }
     *     
     */
    public ArrayOfRoomRate getRoomRates() {
        return roomRates;
    }

    /**
     * Sets the value of the roomRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomRate }
     *     
     */
    public void setRoomRates(ArrayOfRoomRate value) {
        this.roomRates = value;
    }

    /**
     * Gets the value of the guestCounts property.
     * 
     * @return
     *     possible object is
     *     {@link GuestCounts }
     *     
     */
    public GuestCounts getGuestCounts() {
        return guestCounts;
    }

    /**
     * Sets the value of the guestCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestCounts }
     *     
     */
    public void setGuestCounts(GuestCounts value) {
        this.guestCounts = value;
    }

    /**
     * Gets the value of the timeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpanRQ }
     *     
     */
    public TimeSpanRQ getTimeSpan() {
        return timeSpan;
    }

    /**
     * Sets the value of the timeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpanRQ }
     *     
     */
    public void setTimeSpan(TimeSpanRQ value) {
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
     * {@link Guarantee }
     * 
     * 
     */
    public List<Guarantee> getGuarantee() {
        if (guarantee == null) {
            guarantee = new ArrayList<Guarantee>();
        }
        return this.guarantee;
    }

    /**
     * Gets the value of the depositPayments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRequiredPayment }
     *     
     */
    public ArrayOfRequiredPayment getDepositPayments() {
        return depositPayments;
    }

    /**
     * Sets the value of the depositPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRequiredPayment }
     *     
     */
    public void setDepositPayments(ArrayOfRequiredPayment value) {
        this.depositPayments = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Total }
     *     
     */
    public Total getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Total }
     *     
     */
    public void setTotal(Total value) {
        this.total = value;
    }

    /**
     * Gets the value of the basicPropertyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BasicPropertyInfo }
     *     
     */
    public BasicPropertyInfo getBasicPropertyInfo() {
        return basicPropertyInfo;
    }

    /**
     * Sets the value of the basicPropertyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicPropertyInfo }
     *     
     */
    public void setBasicPropertyInfo(BasicPropertyInfo value) {
        this.basicPropertyInfo = value;
    }

    /**
     * Gets the value of the resGuestRPHs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResGuestRPH }
     *     
     */
    public ArrayOfResGuestRPH getResGuestRPHs() {
        return resGuestRPHs;
    }

    /**
     * Sets the value of the resGuestRPHs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResGuestRPH }
     *     
     */
    public void setResGuestRPHs(ArrayOfResGuestRPH value) {
        this.resGuestRPHs = value;
    }

    /**
     * Gets the value of the memberships property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMembership }
     *     
     */
    public ArrayOfMembership getMemberships() {
        return memberships;
    }

    /**
     * Sets the value of the memberships property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMembership }
     *     
     */
    public void setMemberships(ArrayOfMembership value) {
        this.memberships = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfComment }
     *     
     */
    public ArrayOfComment getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfComment }
     *     
     */
    public void setComments(ArrayOfComment value) {
        this.comments = value;
    }

    /**
     * Gets the value of the specialRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialRequest }
     *     
     */
    public ArrayOfSpecialRequest getSpecialRequests() {
        return specialRequests;
    }

    /**
     * Sets the value of the specialRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialRequest }
     *     
     */
    public void setSpecialRequests(ArrayOfSpecialRequest value) {
        this.specialRequests = value;
    }

    /**
     * Gets the value of the serviceRPHs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceRPH }
     *     
     */
    public ArrayOfServiceRPH getServiceRPHs() {
        return serviceRPHs;
    }

    /**
     * Sets the value of the serviceRPHs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceRPH }
     *     
     */
    public void setServiceRPHs(ArrayOfServiceRPH value) {
        this.serviceRPHs = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensions }
     *     
     */
    public TPAExtensions getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensions }
     *     
     */
    public void setTPAExtensions(TPAExtensions value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the marketCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketCode() {
        return marketCode;
    }

    /**
     * Sets the value of the marketCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketCode(String value) {
        this.marketCode = value;
    }

    /**
     * Gets the value of the sourceOfBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfBusiness() {
        return sourceOfBusiness;
    }

    /**
     * Sets the value of the sourceOfBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfBusiness(String value) {
        this.sourceOfBusiness = value;
    }

    /**
     * Gets the value of the discountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountCode() {
        return discountCode;
    }

    /**
     * Sets the value of the discountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountCode(String value) {
        this.discountCode = value;
    }

    /**
     * Gets the value of the promotionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * Sets the value of the promotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
    }

}
