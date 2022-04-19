
package services.amadeus.lowfarematrix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StayRestrictions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StayRestrictions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MinimumStay" type="{http://traveltalk.com/wsLowFareMatrix}MinimumStay" minOccurs="0"/>
 *         &lt;element name="MaximumStay" type="{http://traveltalk.com/wsLowFareMatrix}MaximumStay" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="StayRestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StayRestrictions", propOrder = {
    "minimumStay",
    "maximumStay"
})
public class StayRestrictions {

    @XmlElement(name = "MinimumStay")
    protected MinimumStay minimumStay;
    @XmlElement(name = "MaximumStay")
    protected MaximumStay maximumStay;
    @XmlAttribute(name = "StayRestrictionInd")
    protected Boolean stayRestrictionInd;

    /**
     * Gets the value of the minimumStay property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumStay }
     *     
     */
    public MinimumStay getMinimumStay() {
        return minimumStay;
    }

    /**
     * Sets the value of the minimumStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumStay }
     *     
     */
    public void setMinimumStay(MinimumStay value) {
        this.minimumStay = value;
    }

    /**
     * Gets the value of the maximumStay property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumStay }
     *     
     */
    public MaximumStay getMaximumStay() {
        return maximumStay;
    }

    /**
     * Sets the value of the maximumStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumStay }
     *     
     */
    public void setMaximumStay(MaximumStay value) {
        this.maximumStay = value;
    }

    /**
     * Gets the value of the stayRestrictionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStayRestrictionInd() {
        return stayRestrictionInd;
    }

    /**
     * Sets the value of the stayRestrictionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStayRestrictionInd(Boolean value) {
        this.stayRestrictionInd = value;
    }

}
