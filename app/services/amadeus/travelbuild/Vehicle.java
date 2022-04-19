
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConfID" type="{http://traveltalk.com/wsTravelBuild}ConfID" minOccurs="0"/>
 *         &lt;element name="Vendor" type="{http://traveltalk.com/wsTravelBuild}Vendor" minOccurs="0"/>
 *         &lt;element name="VehRentalCore" type="{http://traveltalk.com/wsTravelBuild}VehRentalCore" minOccurs="0"/>
 *         &lt;element name="Veh" type="{http://traveltalk.com/wsTravelBuild}Veh" minOccurs="0"/>
 *         &lt;element name="RentalRate" type="{http://traveltalk.com/wsTravelBuild}RentalRate" minOccurs="0"/>
 *         &lt;element name="PricedEquips" type="{http://traveltalk.com/wsTravelBuild}ArrayOfPricedEquip" minOccurs="0"/>
 *         &lt;element name="Fees" type="{http://traveltalk.com/wsTravelBuild}ArrayOfFeeRS" minOccurs="0"/>
 *         &lt;element name="TotalCharge" type="{http://traveltalk.com/wsTravelBuild}TotalCharge" minOccurs="0"/>
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
@XmlType(name = "Vehicle", propOrder = {
    "confID",
    "vendor",
    "vehRentalCore",
    "veh",
    "rentalRate",
    "pricedEquips",
    "fees",
    "totalCharge",
    "tpaExtensions"
})
public class Vehicle {

    @XmlElement(name = "ConfID")
    protected ConfID confID;
    @XmlElement(name = "Vendor")
    protected Vendor vendor;
    @XmlElement(name = "VehRentalCore")
    protected VehRentalCore vehRentalCore;
    @XmlElement(name = "Veh")
    protected Veh veh;
    @XmlElement(name = "RentalRate")
    protected RentalRate rentalRate;
    @XmlElement(name = "PricedEquips")
    protected ArrayOfPricedEquip pricedEquips;
    @XmlElement(name = "Fees")
    protected ArrayOfFeeRS fees;
    @XmlElement(name = "TotalCharge")
    protected TotalCharge totalCharge;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsRS tpaExtensions;

    /**
     * Gets the value of the confID property.
     * 
     * @return
     *     possible object is
     *     {@link ConfID }
     *     
     */
    public ConfID getConfID() {
        return confID;
    }

    /**
     * Sets the value of the confID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfID }
     *     
     */
    public void setConfID(ConfID value) {
        this.confID = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link Vendor }
     *     
     */
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vendor }
     *     
     */
    public void setVendor(Vendor value) {
        this.vendor = value;
    }

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
     * Gets the value of the veh property.
     * 
     * @return
     *     possible object is
     *     {@link Veh }
     *     
     */
    public Veh getVeh() {
        return veh;
    }

    /**
     * Sets the value of the veh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Veh }
     *     
     */
    public void setVeh(Veh value) {
        this.veh = value;
    }

    /**
     * Gets the value of the rentalRate property.
     * 
     * @return
     *     possible object is
     *     {@link RentalRate }
     *     
     */
    public RentalRate getRentalRate() {
        return rentalRate;
    }

    /**
     * Sets the value of the rentalRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RentalRate }
     *     
     */
    public void setRentalRate(RentalRate value) {
        this.rentalRate = value;
    }

    /**
     * Gets the value of the pricedEquips property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPricedEquip }
     *     
     */
    public ArrayOfPricedEquip getPricedEquips() {
        return pricedEquips;
    }

    /**
     * Sets the value of the pricedEquips property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPricedEquip }
     *     
     */
    public void setPricedEquips(ArrayOfPricedEquip value) {
        this.pricedEquips = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFeeRS }
     *     
     */
    public ArrayOfFeeRS getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFeeRS }
     *     
     */
    public void setFees(ArrayOfFeeRS value) {
        this.fees = value;
    }

    /**
     * Gets the value of the totalCharge property.
     * 
     * @return
     *     possible object is
     *     {@link TotalCharge }
     *     
     */
    public TotalCharge getTotalCharge() {
        return totalCharge;
    }

    /**
     * Sets the value of the totalCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalCharge }
     *     
     */
    public void setTotalCharge(TotalCharge value) {
        this.totalCharge = value;
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
