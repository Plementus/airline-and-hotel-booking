
package services.sabre.passengerdetails;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenReservationElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenReservationElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="SocialMediaContact" type="{http://services.sabre.com/sp/pd/v3_2}SocialMediaContactType"/>
 *           &lt;element name="AgencyFees" type="{http://services.sabre.com/sp/pd/v3_2}AgencyFeesType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenReservationElementType", propOrder = {
    "socialMediaContact",
    "agencyFees"
})
public class OpenReservationElementType {

    @XmlElement(name = "SocialMediaContact")
    protected SocialMediaContactType socialMediaContact;
    @XmlElement(name = "AgencyFees")
    protected AgencyFeesType agencyFees;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "type")
    protected String type;

    /**
     * Gets the value of the socialMediaContact property.
     * 
     * @return
     *     possible object is
     *     {@link SocialMediaContactType }
     *     
     */
    public SocialMediaContactType getSocialMediaContact() {
        return socialMediaContact;
    }

    /**
     * Sets the value of the socialMediaContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialMediaContactType }
     *     
     */
    public void setSocialMediaContact(SocialMediaContactType value) {
        this.socialMediaContact = value;
    }

    /**
     * Gets the value of the agencyFees property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyFeesType }
     *     
     */
    public AgencyFeesType getAgencyFees() {
        return agencyFees;
    }

    /**
     * Sets the value of the agencyFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyFeesType }
     *     
     */
    public void setAgencyFees(AgencyFeesType value) {
        this.agencyFees = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
