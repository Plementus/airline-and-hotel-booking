
package services.amadeus.travelbuild;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Item" type="{http://traveltalk.com/wsTravelBuild}Item" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ItemPricing" type="{http://traveltalk.com/wsTravelBuild}ItemPricing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecialRequestDetails" type="{http://traveltalk.com/wsTravelBuild}SpecialRequestDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ChronoOrdered" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationItems", propOrder = {
    "item",
    "itemPricing",
    "specialRequestDetails"
})
public class ReservationItems {

    @XmlElement(name = "Item")
    protected List<Item> item;
    @XmlElement(name = "ItemPricing")
    protected List<ItemPricing> itemPricing;
    @XmlElement(name = "SpecialRequestDetails")
    protected SpecialRequestDetails specialRequestDetails;
    @XmlAttribute(name = "ChronoOrdered")
    protected Boolean chronoOrdered;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getItem() {
        if (item == null) {
            item = new ArrayList<Item>();
        }
        return this.item;
    }

    /**
     * Gets the value of the itemPricing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemPricing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemPricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemPricing }
     * 
     * 
     */
    public List<ItemPricing> getItemPricing() {
        if (itemPricing == null) {
            itemPricing = new ArrayList<ItemPricing>();
        }
        return this.itemPricing;
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
     * Gets the value of the chronoOrdered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChronoOrdered() {
        return chronoOrdered;
    }

    /**
     * Sets the value of the chronoOrdered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChronoOrdered(Boolean value) {
        this.chronoOrdered = value;
    }

}
