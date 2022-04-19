
package services.amadeus.lowfareschedule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoluntaryChanges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoluntaryChanges">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Penalty" type="{http://traveltalk.com/wsLowFareSchedule}Penalty" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="VolChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoluntaryChanges", propOrder = {
    "penalty"
})
public class VoluntaryChanges {

    @XmlElement(name = "Penalty")
    protected Penalty penalty;
    @XmlAttribute(name = "VolChangeInd")
    protected Boolean volChangeInd;

    /**
     * Gets the value of the penalty property.
     * 
     * @return
     *     possible object is
     *     {@link Penalty }
     *     
     */
    public Penalty getPenalty() {
        return penalty;
    }

    /**
     * Sets the value of the penalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Penalty }
     *     
     */
    public void setPenalty(Penalty value) {
        this.penalty = value;
    }

    /**
     * Gets the value of the volChangeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVolChangeInd() {
        return volChangeInd;
    }

    /**
     * Sets the value of the volChangeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVolChangeInd(Boolean value) {
        this.volChangeInd = value;
    }

}
