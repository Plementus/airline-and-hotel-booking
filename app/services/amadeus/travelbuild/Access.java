
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Access complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Access">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccessPerson" type="{http://traveltalk.com/wsTravelBuild}AccessPerson" minOccurs="0"/>
 *         &lt;element name="AccessComment" type="{http://traveltalk.com/wsTravelBuild}AccessComment" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ActionType" type="{http://traveltalk.com/wsTravelBuild}AccessActionType" />
 *       &lt;attribute name="ActionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Access", propOrder = {
    "accessPerson",
    "accessComment"
})
public class Access {

    @XmlElement(name = "AccessPerson")
    protected AccessPerson accessPerson;
    @XmlElement(name = "AccessComment")
    protected AccessComment accessComment;
    @XmlAttribute(name = "ActionType")
    protected AccessActionType actionType;
    @XmlAttribute(name = "ActionDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actionDateTime;
    @XmlAttribute(name = "ID")
    protected String id;

    /**
     * Gets the value of the accessPerson property.
     * 
     * @return
     *     possible object is
     *     {@link AccessPerson }
     *     
     */
    public AccessPerson getAccessPerson() {
        return accessPerson;
    }

    /**
     * Sets the value of the accessPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessPerson }
     *     
     */
    public void setAccessPerson(AccessPerson value) {
        this.accessPerson = value;
    }

    /**
     * Gets the value of the accessComment property.
     * 
     * @return
     *     possible object is
     *     {@link AccessComment }
     *     
     */
    public AccessComment getAccessComment() {
        return accessComment;
    }

    /**
     * Sets the value of the accessComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessComment }
     *     
     */
    public void setAccessComment(AccessComment value) {
        this.accessComment = value;
    }

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link AccessActionType }
     *     
     */
    public AccessActionType getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessActionType }
     *     
     */
    public void setActionType(AccessActionType value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the actionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActionDateTime() {
        return actionDateTime;
    }

    /**
     * Sets the value of the actionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActionDateTime(XMLGregorianCalendar value) {
        this.actionDateTime = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
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
    public void setID(String value) {
        this.id = value;
    }

}
