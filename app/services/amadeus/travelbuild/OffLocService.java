
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OffLocService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffLocService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://traveltalk.com/wsTravelBuild}Address" minOccurs="0"/>
 *         &lt;element name="PersonName" type="{http://traveltalk.com/wsTravelBuild}PersonName" minOccurs="0"/>
 *         &lt;element name="Telephone" type="{http://traveltalk.com/wsTravelBuild}Telephone" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" use="required" type="{http://traveltalk.com/wsTravelBuild}OffLocServiceType" />
 *       &lt;attribute name="SpecInstructions" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffLocService", propOrder = {
    "address",
    "personName",
    "telephone"
})
public class OffLocService {

    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "PersonName")
    protected PersonName personName;
    @XmlElement(name = "Telephone")
    protected Telephone telephone;
    @XmlAttribute(name = "Type", required = true)
    protected OffLocServiceType type;
    @XmlAttribute(name = "SpecInstructions")
    protected String specInstructions;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setPersonName(PersonName value) {
        this.personName = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link Telephone }
     *     
     */
    public Telephone getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Telephone }
     *     
     */
    public void setTelephone(Telephone value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link OffLocServiceType }
     *     
     */
    public OffLocServiceType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffLocServiceType }
     *     
     */
    public void setType(OffLocServiceType value) {
        this.type = value;
    }

    /**
     * Gets the value of the specInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecInstructions() {
        return specInstructions;
    }

    /**
     * Sets the value of the specInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecInstructions(String value) {
        this.specInstructions = value;
    }

}
