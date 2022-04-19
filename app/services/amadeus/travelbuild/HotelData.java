
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtraAdult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtraChild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Crib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RollawayAdult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RollawayChild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelData", propOrder = {
    "extraAdult",
    "extraChild",
    "crib",
    "rollawayAdult",
    "rollawayChild"
})
public class HotelData {

    @XmlElement(name = "ExtraAdult")
    protected String extraAdult;
    @XmlElement(name = "ExtraChild")
    protected String extraChild;
    @XmlElement(name = "Crib")
    protected String crib;
    @XmlElement(name = "RollawayAdult")
    protected String rollawayAdult;
    @XmlElement(name = "RollawayChild")
    protected String rollawayChild;

    /**
     * Gets the value of the extraAdult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraAdult() {
        return extraAdult;
    }

    /**
     * Sets the value of the extraAdult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraAdult(String value) {
        this.extraAdult = value;
    }

    /**
     * Gets the value of the extraChild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraChild() {
        return extraChild;
    }

    /**
     * Sets the value of the extraChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraChild(String value) {
        this.extraChild = value;
    }

    /**
     * Gets the value of the crib property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrib() {
        return crib;
    }

    /**
     * Sets the value of the crib property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrib(String value) {
        this.crib = value;
    }

    /**
     * Gets the value of the rollawayAdult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRollawayAdult() {
        return rollawayAdult;
    }

    /**
     * Sets the value of the rollawayAdult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRollawayAdult(String value) {
        this.rollawayAdult = value;
    }

    /**
     * Gets the value of the rollawayChild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRollawayChild() {
        return rollawayChild;
    }

    /**
     * Sets the value of the rollawayChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRollawayChild(String value) {
        this.rollawayChild = value;
    }

}
