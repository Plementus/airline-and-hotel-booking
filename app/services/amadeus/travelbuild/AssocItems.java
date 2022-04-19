
package services.amadeus.travelbuild;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssocItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssocItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssocItem" type="{http://traveltalk.com/wsTravelBuild}AssocItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Pricing" type="{http://traveltalk.com/wsTravelBuild}Pricing" minOccurs="0"/>
 *         &lt;element name="SpecialRequestDetails" type="{http://traveltalk.com/wsTravelBuild}SpecialRequestDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssocItems", propOrder = {
    "assocItem",
    "pricing",
    "specialRequestDetails"
})
public class AssocItems {

    @XmlElement(name = "AssocItem")
    protected List<AssocItem> assocItem;
    @XmlElement(name = "Pricing")
    protected Pricing pricing;
    @XmlElement(name = "SpecialRequestDetails")
    protected SpecialRequestDetails specialRequestDetails;

    /**
     * Gets the value of the assocItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assocItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssocItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssocItem }
     * 
     * 
     */
    public List<AssocItem> getAssocItem() {
        if (assocItem == null) {
            assocItem = new ArrayList<AssocItem>();
        }
        return this.assocItem;
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

}
