
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Package complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Package">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TPA_Extensions" type="{http://traveltalk.com/wsTravelBuild}TPA_ExtensionsRS" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ItemRPH_List" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AssocItemRPH_List" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Package", propOrder = {
    "tpaExtensions"
})
public class Package {

    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsRS tpaExtensions;
    @XmlAttribute(name = "ItemRPH_List")
    protected String itemRPHList;
    @XmlAttribute(name = "AssocItemRPH_List")
    protected String assocItemRPHList;

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
     * Gets the value of the assocItemRPHList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssocItemRPHList() {
        return assocItemRPHList;
    }

    /**
     * Sets the value of the assocItemRPHList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssocItemRPHList(String value) {
        this.assocItemRPHList = value;
    }

}
