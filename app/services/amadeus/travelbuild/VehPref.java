
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehPref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehPref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehType" type="{http://traveltalk.com/wsTravelBuild}VehType" minOccurs="0"/>
 *         &lt;element name="VehClass" type="{http://traveltalk.com/wsTravelBuild}VehClass" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AirConditionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TransmissionType" type="{http://traveltalk.com/wsTravelBuild}VehPrefTransmissionType" />
 *       &lt;attribute name="TypePref" type="{http://traveltalk.com/wsTravelBuild}VehPrefTypePref" />
 *       &lt;attribute name="ClassPref" type="{http://traveltalk.com/wsTravelBuild}VehPrefClassPref" />
 *       &lt;attribute name="AirConditionPref" type="{http://traveltalk.com/wsTravelBuild}VehPrefAirConditionPref" />
 *       &lt;attribute name="TransmissionPref" type="{http://traveltalk.com/wsTravelBuild}VehPrefTransmissionPref" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehPref", propOrder = {
    "vehType",
    "vehClass"
})
public class VehPref {

    @XmlElement(name = "VehType")
    protected VehType vehType;
    @XmlElement(name = "VehClass")
    protected VehClass vehClass;
    @XmlAttribute(name = "AirConditionInd")
    protected Boolean airConditionInd;
    @XmlAttribute(name = "TransmissionType")
    protected VehPrefTransmissionType transmissionType;
    @XmlAttribute(name = "TypePref")
    protected VehPrefTypePref typePref;
    @XmlAttribute(name = "ClassPref")
    protected VehPrefClassPref classPref;
    @XmlAttribute(name = "AirConditionPref")
    protected VehPrefAirConditionPref airConditionPref;
    @XmlAttribute(name = "TransmissionPref")
    protected VehPrefTransmissionPref transmissionPref;

    /**
     * Gets the value of the vehType property.
     * 
     * @return
     *     possible object is
     *     {@link VehType }
     *     
     */
    public VehType getVehType() {
        return vehType;
    }

    /**
     * Sets the value of the vehType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehType }
     *     
     */
    public void setVehType(VehType value) {
        this.vehType = value;
    }

    /**
     * Gets the value of the vehClass property.
     * 
     * @return
     *     possible object is
     *     {@link VehClass }
     *     
     */
    public VehClass getVehClass() {
        return vehClass;
    }

    /**
     * Sets the value of the vehClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehClass }
     *     
     */
    public void setVehClass(VehClass value) {
        this.vehClass = value;
    }

    /**
     * Gets the value of the airConditionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAirConditionInd() {
        return airConditionInd;
    }

    /**
     * Sets the value of the airConditionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAirConditionInd(Boolean value) {
        this.airConditionInd = value;
    }

    /**
     * Gets the value of the transmissionType property.
     * 
     * @return
     *     possible object is
     *     {@link VehPrefTransmissionType }
     *     
     */
    public VehPrefTransmissionType getTransmissionType() {
        return transmissionType;
    }

    /**
     * Sets the value of the transmissionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehPrefTransmissionType }
     *     
     */
    public void setTransmissionType(VehPrefTransmissionType value) {
        this.transmissionType = value;
    }

    /**
     * Gets the value of the typePref property.
     * 
     * @return
     *     possible object is
     *     {@link VehPrefTypePref }
     *     
     */
    public VehPrefTypePref getTypePref() {
        return typePref;
    }

    /**
     * Sets the value of the typePref property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehPrefTypePref }
     *     
     */
    public void setTypePref(VehPrefTypePref value) {
        this.typePref = value;
    }

    /**
     * Gets the value of the classPref property.
     * 
     * @return
     *     possible object is
     *     {@link VehPrefClassPref }
     *     
     */
    public VehPrefClassPref getClassPref() {
        return classPref;
    }

    /**
     * Sets the value of the classPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehPrefClassPref }
     *     
     */
    public void setClassPref(VehPrefClassPref value) {
        this.classPref = value;
    }

    /**
     * Gets the value of the airConditionPref property.
     * 
     * @return
     *     possible object is
     *     {@link VehPrefAirConditionPref }
     *     
     */
    public VehPrefAirConditionPref getAirConditionPref() {
        return airConditionPref;
    }

    /**
     * Sets the value of the airConditionPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehPrefAirConditionPref }
     *     
     */
    public void setAirConditionPref(VehPrefAirConditionPref value) {
        this.airConditionPref = value;
    }

    /**
     * Gets the value of the transmissionPref property.
     * 
     * @return
     *     possible object is
     *     {@link VehPrefTransmissionPref }
     *     
     */
    public VehPrefTransmissionPref getTransmissionPref() {
        return transmissionPref;
    }

    /**
     * Sets the value of the transmissionPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehPrefTransmissionPref }
     *     
     */
    public void setTransmissionPref(VehPrefTransmissionPref value) {
        this.transmissionPref = value;
    }

}
