
package services.amadeus.lowfarematrix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareRestrictPref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareRestrictPref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdvResTicketing" type="{http://traveltalk.com/wsLowFareMatrix}AdvResTicketing" minOccurs="0"/>
 *         &lt;element name="StayRestrictions" type="{http://traveltalk.com/wsLowFareMatrix}StayRestrictions" minOccurs="0"/>
 *         &lt;element name="VoluntaryChanges" type="{http://traveltalk.com/wsLowFareMatrix}VoluntaryChanges" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsLowFareMatrix}FareRestrictPrefPreferLevel" default="Preferred" />
 *       &lt;attribute name="FareRestriction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareRestrictPref", propOrder = {
    "advResTicketing",
    "stayRestrictions",
    "voluntaryChanges"
})
public class FareRestrictPref {

    @XmlElement(name = "AdvResTicketing")
    protected AdvResTicketing advResTicketing;
    @XmlElement(name = "StayRestrictions")
    protected StayRestrictions stayRestrictions;
    @XmlElement(name = "VoluntaryChanges")
    protected VoluntaryChanges voluntaryChanges;
    @XmlAttribute(name = "PreferLevel")
    protected FareRestrictPrefPreferLevel preferLevel;
    @XmlAttribute(name = "FareRestriction")
    protected String fareRestriction;

    /**
     * Gets the value of the advResTicketing property.
     * 
     * @return
     *     possible object is
     *     {@link AdvResTicketing }
     *     
     */
    public AdvResTicketing getAdvResTicketing() {
        return advResTicketing;
    }

    /**
     * Sets the value of the advResTicketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvResTicketing }
     *     
     */
    public void setAdvResTicketing(AdvResTicketing value) {
        this.advResTicketing = value;
    }

    /**
     * Gets the value of the stayRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link StayRestrictions }
     *     
     */
    public StayRestrictions getStayRestrictions() {
        return stayRestrictions;
    }

    /**
     * Sets the value of the stayRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link StayRestrictions }
     *     
     */
    public void setStayRestrictions(StayRestrictions value) {
        this.stayRestrictions = value;
    }

    /**
     * Gets the value of the voluntaryChanges property.
     * 
     * @return
     *     possible object is
     *     {@link VoluntaryChanges }
     *     
     */
    public VoluntaryChanges getVoluntaryChanges() {
        return voluntaryChanges;
    }

    /**
     * Sets the value of the voluntaryChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoluntaryChanges }
     *     
     */
    public void setVoluntaryChanges(VoluntaryChanges value) {
        this.voluntaryChanges = value;
    }

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link FareRestrictPrefPreferLevel }
     *     
     */
    public FareRestrictPrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return FareRestrictPrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRestrictPrefPreferLevel }
     *     
     */
    public void setPreferLevel(FareRestrictPrefPreferLevel value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the fareRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareRestriction() {
        return fareRestriction;
    }

    /**
     * Sets the value of the fareRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareRestriction(String value) {
        this.fareRestriction = value;
    }

}
