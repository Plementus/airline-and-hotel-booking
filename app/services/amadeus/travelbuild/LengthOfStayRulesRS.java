
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LengthOfStayRulesRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LengthOfStayRulesRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MinimumStay" type="{http://traveltalk.com/wsTravelBuild}MinimumStayRS" minOccurs="0"/>
 *         &lt;element name="MaximumStay" type="{http://traveltalk.com/wsTravelBuild}MaximumStayRS" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="StayRestrictionsInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LengthOfStayRulesRS", propOrder = {
    "minimumStay",
    "maximumStay"
})
public class LengthOfStayRulesRS {

    @XmlElement(name = "MinimumStay")
    protected MinimumStayRS minimumStay;
    @XmlElement(name = "MaximumStay")
    protected MaximumStayRS maximumStay;
    @XmlAttribute(name = "StayRestrictionsInd")
    protected Boolean stayRestrictionsInd;

    /**
     * Gets the value of the minimumStay property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumStayRS }
     *     
     */
    public MinimumStayRS getMinimumStay() {
        return minimumStay;
    }

    /**
     * Sets the value of the minimumStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumStayRS }
     *     
     */
    public void setMinimumStay(MinimumStayRS value) {
        this.minimumStay = value;
    }

    /**
     * Gets the value of the maximumStay property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumStayRS }
     *     
     */
    public MaximumStayRS getMaximumStay() {
        return maximumStay;
    }

    /**
     * Sets the value of the maximumStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumStayRS }
     *     
     */
    public void setMaximumStay(MaximumStayRS value) {
        this.maximumStay = value;
    }

    /**
     * Gets the value of the stayRestrictionsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStayRestrictionsInd() {
        return stayRestrictionsInd;
    }

    /**
     * Sets the value of the stayRestrictionsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStayRestrictionsInd(Boolean value) {
        this.stayRestrictionsInd = value;
    }

}
