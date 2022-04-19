
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssociatedContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociatedContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssocItems" type="{http://traveltalk.com/wsTravelBuild}AssocItems" minOccurs="0"/>
 *         &lt;element name="Pricing" type="{http://traveltalk.com/wsTravelBuild}Pricing" minOccurs="0"/>
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
@XmlType(name = "AssociatedContent", propOrder = {
    "assocItems",
    "pricing",
    "specialRequestDetails",
    "tpaExtensions"
})
public class AssociatedContent {

    @XmlElement(name = "AssocItems")
    protected AssocItems assocItems;
    @XmlElement(name = "Pricing")
    protected Pricing pricing;
    @XmlElement(name = "SpecialRequestDetails")
    protected SpecialRequestDetails specialRequestDetails;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsRS tpaExtensions;

    /**
     * Gets the value of the assocItems property.
     * 
     * @return
     *     possible object is
     *     {@link AssocItems }
     *     
     */
    public AssocItems getAssocItems() {
        return assocItems;
    }

    /**
     * Sets the value of the assocItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssocItems }
     *     
     */
    public void setAssocItems(AssocItems value) {
        this.assocItems = value;
    }

    /**
     * Gets the value of the pricing property.
     * 
     * @return
     *     possible object is
     *     {@link Pricing }
     *     
     */
    public Pricing getPricing() {
        return pricing;
    }

    /**
     * Sets the value of the pricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pricing }
     *     
     */
    public void setPricing(Pricing value) {
        this.pricing = value;
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
