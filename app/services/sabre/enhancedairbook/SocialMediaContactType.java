
package services.sabre.enhancedairbook;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SocialMediaContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocialMediaContactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FacebookID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TwitterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocialMediaContactType", propOrder = {
    "facebookID",
    "twitterID"
})
public class SocialMediaContactType {

    @XmlElement(name = "FacebookID")
    protected String facebookID;
    @XmlElement(name = "TwitterID")
    protected String twitterID;

    /**
     * Gets the value of the facebookID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacebookID() {
        return facebookID;
    }

    /**
     * Sets the value of the facebookID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacebookID(String value) {
        this.facebookID = value;
    }

    /**
     * Gets the value of the twitterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwitterID() {
        return twitterID;
    }

    /**
     * Sets the value of the twitterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwitterID(String value) {
        this.twitterID = value;
    }

}
