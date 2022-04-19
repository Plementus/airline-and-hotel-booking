
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="AdvResTicketing" type="{http://traveltalk.com/wsTravelBuild}AdvResTicketing" minOccurs="0"/>
 *         &lt;element name="MinimumStay" type="{http://traveltalk.com/wsTravelBuild}MinimumStay" minOccurs="0"/>
 *         &lt;element name="MaximumStay" type="{http://traveltalk.com/wsTravelBuild}MaximumStay" minOccurs="0"/>
 *         &lt;element name="VoluntaryChanges" type="{http://traveltalk.com/wsTravelBuild}VoluntaryChanges" minOccurs="0"/>
 *       &lt;/sequence>
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
    "minimumStay",
    "maximumStay",
    "voluntaryChanges"
})
public class FareRestrictPref {

    @XmlElement(name = "AdvResTicketing")
    protected AdvResTicketing advResTicketing;
    @XmlElement(name = "MinimumStay")
    protected MinimumStay minimumStay;
    @XmlElement(name = "MaximumStay")
    protected MaximumStay maximumStay;
    @XmlElement(name = "VoluntaryChanges")
    protected VoluntaryChanges voluntaryChanges;

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

}
