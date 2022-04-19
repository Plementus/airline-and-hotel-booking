
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargesRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargesRules">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "ChargesRules", propOrder = {
    "voluntaryChanges"
})
public class ChargesRules {

    @XmlElement(name = "VoluntaryChanges")
    protected VoluntaryChanges voluntaryChanges;

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
