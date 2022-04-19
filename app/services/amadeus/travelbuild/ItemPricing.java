
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemPricing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemPricing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cost" type="{http://traveltalk.com/wsTravelBuild}Cost" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://traveltalk.com/wsTravelBuild}TPA_ExtensionsRS" minOccurs="0"/>
 *         &lt;element name="AirFareInfo" type="{http://traveltalk.com/wsTravelBuild}AirFareInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ItemRPH_List" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AssociatedItemRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemPricing", propOrder = {
    "cost",
    "tpaExtensions",
    "airFareInfo"
})
public class ItemPricing {

    @XmlElement(name = "Cost")
    protected Cost cost;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsRS tpaExtensions;
    @XmlElement(name = "AirFareInfo")
    protected AirFareInfo airFareInfo;
    @XmlAttribute(name = "ItemRPH_List")
    protected String itemRPHList;
    @XmlAttribute(name = "AssociatedItemRPH")
    protected String associatedItemRPH;
    @XmlAttribute(name = "RPH")
    protected String rph;

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link Cost }
     *     
     */
    public Cost getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cost }
     *     
     */
    public void setCost(Cost value) {
        this.cost = value;
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

    /**
     * Gets the value of the airFareInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AirFareInfo }
     *     
     */
    public AirFareInfo getAirFareInfo() {
        return airFareInfo;
    }

    /**
     * Sets the value of the airFareInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirFareInfo }
     *     
     */
    public void setAirFareInfo(AirFareInfo value) {
        this.airFareInfo = value;
    }

    /**
     * Gets the value of the itemRPHList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemRPHList() {
        return itemRPHList;
    }

    /**
     * Sets the value of the itemRPHList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemRPHList(String value) {
        this.itemRPHList = value;
    }

    /**
     * Gets the value of the associatedItemRPH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedItemRPH() {
        return associatedItemRPH;
    }

    /**
     * Sets the value of the associatedItemRPH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedItemRPH(String value) {
        this.associatedItemRPH = value;
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
