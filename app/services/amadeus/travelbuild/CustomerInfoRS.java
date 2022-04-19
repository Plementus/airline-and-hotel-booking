
package services.amadeus.travelbuild;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerInfoRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerInfoRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Customer" type="{http://traveltalk.com/wsTravelBuild}CustomerRS" minOccurs="0"/>
 *         &lt;element name="ProfileRef" type="{http://traveltalk.com/wsTravelBuild}ProfileRefRS" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{http://traveltalk.com/wsTravelBuild}RemarksRS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AgencyAcctNumber" type="{http://traveltalk.com/wsTravelBuild}AgencyAcctNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerInfoRS", propOrder = {
    "customer",
    "profileRef",
    "remarks",
    "agencyAcctNumber"
})
public class CustomerInfoRS {

    @XmlElement(name = "Customer")
    protected CustomerRS customer;
    @XmlElement(name = "ProfileRef")
    protected ProfileRefRS profileRef;
    @XmlElement(name = "Remarks")
    protected List<RemarksRS> remarks;
    @XmlElement(name = "AgencyAcctNumber")
    protected AgencyAcctNumber agencyAcctNumber;
    @XmlAttribute(name = "RPH")
    protected String rph;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRS }
     *     
     */
    public CustomerRS getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRS }
     *     
     */
    public void setCustomer(CustomerRS value) {
        this.customer = value;
    }

    /**
     * Gets the value of the profileRef property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileRefRS }
     *     
     */
    public ProfileRefRS getProfileRef() {
        return profileRef;
    }

    /**
     * Sets the value of the profileRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileRefRS }
     *     
     */
    public void setProfileRef(ProfileRefRS value) {
        this.profileRef = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemarksRS }
     * 
     * 
     */
    public List<RemarksRS> getRemarks() {
        if (remarks == null) {
            remarks = new ArrayList<RemarksRS>();
        }
        return this.remarks;
    }

    /**
     * Gets the value of the agencyAcctNumber property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyAcctNumber }
     *     
     */
    public AgencyAcctNumber getAgencyAcctNumber() {
        return agencyAcctNumber;
    }

    /**
     * Sets the value of the agencyAcctNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyAcctNumber }
     *     
     */
    public void setAgencyAcctNumber(AgencyAcctNumber value) {
        this.agencyAcctNumber = value;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

}
