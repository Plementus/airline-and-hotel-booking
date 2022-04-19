
package services.amadeus.travelbuild;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehResRQInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehResRQInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecialReqPref" type="{http://traveltalk.com/wsTravelBuild}SpecialReqPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CoveragePrefs" type="{http://traveltalk.com/wsTravelBuild}ArrayOfCoveragePref" minOccurs="0"/>
 *         &lt;element name="OffLocService" type="{http://traveltalk.com/wsTravelBuild}OffLocService" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ArrivalDetails" type="{http://traveltalk.com/wsTravelBuild}ArrivalDetails" minOccurs="0"/>
 *         &lt;element name="RentalPaymentPref" type="{http://traveltalk.com/wsTravelBuild}RentalPaymentPref" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://traveltalk.com/wsTravelBuild}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LuggageQty" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="PassengerQty" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="GasPrePay" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehResRQInfo", propOrder = {
    "specialReqPref",
    "coveragePrefs",
    "offLocService",
    "arrivalDetails",
    "rentalPaymentPref",
    "tpaExtensions"
})
public class VehResRQInfo {

    @XmlElement(name = "SpecialReqPref")
    protected List<SpecialReqPref> specialReqPref;
    @XmlElement(name = "CoveragePrefs")
    protected ArrayOfCoveragePref coveragePrefs;
    @XmlElement(name = "OffLocService")
    protected List<OffLocService> offLocService;
    @XmlElement(name = "ArrivalDetails")
    protected ArrivalDetails arrivalDetails;
    @XmlElement(name = "RentalPaymentPref")
    protected RentalPaymentPref rentalPaymentPref;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensions tpaExtensions;
    @XmlAttribute(name = "LuggageQty")
    protected Integer luggageQty;
    @XmlAttribute(name = "PassengerQty")
    protected Integer passengerQty;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;
    @XmlAttribute(name = "GasPrePay")
    protected Boolean gasPrePay;

    /**
     * Gets the value of the specialReqPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialReqPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialReqPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialReqPref }
     * 
     * 
     */
    public List<SpecialReqPref> getSpecialReqPref() {
        if (specialReqPref == null) {
            specialReqPref = new ArrayList<SpecialReqPref>();
        }
        return this.specialReqPref;
    }

    /**
     * Gets the value of the coveragePrefs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCoveragePref }
     *     
     */
    public ArrayOfCoveragePref getCoveragePrefs() {
        return coveragePrefs;
    }

    /**
     * Sets the value of the coveragePrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCoveragePref }
     *     
     */
    public void setCoveragePrefs(ArrayOfCoveragePref value) {
        this.coveragePrefs = value;
    }

    /**
     * Gets the value of the offLocService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offLocService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffLocService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OffLocService }
     * 
     * 
     */
    public List<OffLocService> getOffLocService() {
        if (offLocService == null) {
            offLocService = new ArrayList<OffLocService>();
        }
        return this.offLocService;
    }

    /**
     * Gets the value of the arrivalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalDetails }
     *     
     */
    public ArrivalDetails getArrivalDetails() {
        return arrivalDetails;
    }

    /**
     * Sets the value of the arrivalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalDetails }
     *     
     */
    public void setArrivalDetails(ArrivalDetails value) {
        this.arrivalDetails = value;
    }

    /**
     * Gets the value of the rentalPaymentPref property.
     * 
     * @return
     *     possible object is
     *     {@link RentalPaymentPref }
     *     
     */
    public RentalPaymentPref getRentalPaymentPref() {
        return rentalPaymentPref;
    }

    /**
     * Sets the value of the rentalPaymentPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link RentalPaymentPref }
     *     
     */
    public void setRentalPaymentPref(RentalPaymentPref value) {
        this.rentalPaymentPref = value;
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
     * Gets the value of the luggageQty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLuggageQty() {
        return luggageQty;
    }

    /**
     * Sets the value of the luggageQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLuggageQty(Integer value) {
        this.luggageQty = value;
    }

    /**
     * Gets the value of the passengerQty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPassengerQty() {
        return passengerQty;
    }

    /**
     * Sets the value of the passengerQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPassengerQty(Integer value) {
        this.passengerQty = value;
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
     * Gets the value of the gasPrePay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isGasPrePay() {
        if (gasPrePay == null) {
            return false;
        } else {
            return gasPrePay;
        }
    }

    /**
     * Sets the value of the gasPrePay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGasPrePay(Boolean value) {
        this.gasPrePay = value;
    }

}
