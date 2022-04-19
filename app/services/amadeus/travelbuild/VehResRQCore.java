
package services.amadeus.travelbuild;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehResRQCore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehResRQCore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehRentalCore" type="{http://traveltalk.com/wsTravelBuild}VehRentalCore" minOccurs="0"/>
 *         &lt;element name="Customer" type="{http://traveltalk.com/wsTravelBuild}Customer" minOccurs="0"/>
 *         &lt;element name="VendorPref" type="{http://traveltalk.com/wsTravelBuild}VendorPref" minOccurs="0"/>
 *         &lt;element name="VehPref" type="{http://traveltalk.com/wsTravelBuild}VehPref" minOccurs="0"/>
 *         &lt;element name="DriverType" type="{http://traveltalk.com/wsTravelBuild}DriverType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RateQualifier" type="{http://traveltalk.com/wsTravelBuild}RateQualifier" minOccurs="0"/>
 *         &lt;element name="SpecialEquipPrefs" type="{http://traveltalk.com/wsTravelBuild}ArrayOfSpecialEquipPref" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://traveltalk.com/wsTravelBuild}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Status" use="required" type="{http://traveltalk.com/wsTravelBuild}VehResRQCoreStatus" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehResRQCore", propOrder = {
    "vehRentalCore",
    "customer",
    "vendorPref",
    "vehPref",
    "driverType",
    "rateQualifier",
    "specialEquipPrefs",
    "tpaExtensions"
})
public class VehResRQCore {

    @XmlElement(name = "VehRentalCore")
    protected VehRentalCore vehRentalCore;
    @XmlElement(name = "Customer")
    protected Customer customer;
    @XmlElement(name = "VendorPref")
    protected VendorPref vendorPref;
    @XmlElement(name = "VehPref")
    protected VehPref vehPref;
    @XmlElement(name = "DriverType")
    protected List<DriverType> driverType;
    @XmlElement(name = "RateQualifier")
    protected RateQualifier rateQualifier;
    @XmlElement(name = "SpecialEquipPrefs")
    protected ArrayOfSpecialEquipPref specialEquipPrefs;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensions tpaExtensions;
    @XmlAttribute(name = "Status", required = true)
    protected VehResRQCoreStatus status;

    /**
     * Gets the value of the vehRentalCore property.
     * 
     * @return
     *     possible object is
     *     {@link VehRentalCore }
     *     
     */
    public VehRentalCore getVehRentalCore() {
        return vehRentalCore;
    }

    /**
     * Sets the value of the vehRentalCore property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehRentalCore }
     *     
     */
    public void setVehRentalCore(VehRentalCore value) {
        this.vehRentalCore = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the vendorPref property.
     * 
     * @return
     *     possible object is
     *     {@link VendorPref }
     *     
     */
    public VendorPref getVendorPref() {
        return vendorPref;
    }

    /**
     * Sets the value of the vendorPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorPref }
     *     
     */
    public void setVendorPref(VendorPref value) {
        this.vendorPref = value;
    }

    /**
     * Gets the value of the vehPref property.
     * 
     * @return
     *     possible object is
     *     {@link VehPref }
     *     
     */
    public VehPref getVehPref() {
        return vehPref;
    }

    /**
     * Sets the value of the vehPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehPref }
     *     
     */
    public void setVehPref(VehPref value) {
        this.vehPref = value;
    }

    /**
     * Gets the value of the driverType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the driverType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDriverType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DriverType }
     * 
     * 
     */
    public List<DriverType> getDriverType() {
        if (driverType == null) {
            driverType = new ArrayList<DriverType>();
        }
        return this.driverType;
    }

    /**
     * Gets the value of the rateQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link RateQualifier }
     *     
     */
    public RateQualifier getRateQualifier() {
        return rateQualifier;
    }

    /**
     * Sets the value of the rateQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateQualifier }
     *     
     */
    public void setRateQualifier(RateQualifier value) {
        this.rateQualifier = value;
    }

    /**
     * Gets the value of the specialEquipPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialEquipPref }
     *     
     */
    public ArrayOfSpecialEquipPref getSpecialEquipPrefs() {
        return specialEquipPrefs;
    }

    /**
     * Sets the value of the specialEquipPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialEquipPref }
     *     
     */
    public void setSpecialEquipPrefs(ArrayOfSpecialEquipPref value) {
        this.specialEquipPrefs = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link VehResRQCoreStatus }
     *     
     */
    public VehResRQCoreStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehResRQCoreStatus }
     *     
     */
    public void setStatus(VehResRQCoreStatus value) {
        this.status = value;
    }

}
