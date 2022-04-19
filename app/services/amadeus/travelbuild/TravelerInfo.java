
package services.amadeus.travelbuild;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirTraveler" type="{http://traveltalk.com/wsTravelBuild}AirTraveler" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecialReqDetails" type="{http://traveltalk.com/wsTravelBuild}SpecialReqDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelerInfo", propOrder = {
    "airTraveler",
    "specialReqDetails"
})
public class TravelerInfo {

    @XmlElement(name = "AirTraveler")
    protected List<AirTraveler> airTraveler;
    @XmlElement(name = "SpecialReqDetails")
    protected SpecialReqDetails specialReqDetails;

    /**
     * Gets the value of the airTraveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airTraveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirTraveler }
     * 
     * 
     */
    public List<AirTraveler> getAirTraveler() {
        if (airTraveler == null) {
            airTraveler = new ArrayList<AirTraveler>();
        }
        return this.airTraveler;
    }

    /**
     * Gets the value of the specialReqDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialReqDetails }
     *     
     */
    public SpecialReqDetails getSpecialReqDetails() {
        return specialReqDetails;
    }

    /**
     * Sets the value of the specialReqDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialReqDetails }
     *     
     */
    public void setSpecialReqDetails(SpecialReqDetails value) {
        this.specialReqDetails = value;
    }

}
