
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Membership complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Membership">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BonusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AccountID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PointsEarned" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Membership")
public class Membership {

    @XmlAttribute(name = "ProgramCode")
    protected String programCode;
    @XmlAttribute(name = "BonusCode")
    protected String bonusCode;
    @XmlAttribute(name = "AccountID")
    protected String accountID;
    @XmlAttribute(name = "PointsEarned")
    protected Integer pointsEarned;

    /**
     * Gets the value of the programCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramCode() {
        return programCode;
    }

    /**
     * Sets the value of the programCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramCode(String value) {
        this.programCode = value;
    }

    /**
     * Gets the value of the bonusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBonusCode() {
        return bonusCode;
    }

    /**
     * Sets the value of the bonusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBonusCode(String value) {
        this.bonusCode = value;
    }

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountID(String value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the pointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPointsEarned() {
        return pointsEarned;
    }

    /**
     * Sets the value of the pointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPointsEarned(Integer value) {
        this.pointsEarned = value;
    }

}
