
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Veh complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Veh">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehType" type="{http://traveltalk.com/wsTravelBuild}VehTypeRS" minOccurs="0"/>
 *         &lt;element name="VehClass" type="{http://traveltalk.com/wsTravelBuild}VehClassRS" minOccurs="0"/>
 *         &lt;element name="VehMakeModel" type="{http://traveltalk.com/wsTravelBuild}VehMakeModel" minOccurs="0"/>
 *         &lt;element name="PictureURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AirConditionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TransmissionType" type="{http://traveltalk.com/wsTravelBuild}VehTransmissionType" />
 *       &lt;attribute name="PassengerQuantity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="BaggageQuantity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Veh", propOrder = {
    "vehType",
    "vehClass",
    "vehMakeModel",
    "pictureURL"
})
public class Veh {

    @XmlElement(name = "VehType")
    protected VehTypeRS vehType;
    @XmlElement(name = "VehClass")
    protected VehClassRS vehClass;
    @XmlElement(name = "VehMakeModel")
    protected VehMakeModel vehMakeModel;
    @XmlElement(name = "PictureURL")
    @XmlSchemaType(name = "anyURI")
    protected String pictureURL;
    @XmlAttribute(name = "AirConditionInd")
    protected Boolean airConditionInd;
    @XmlAttribute(name = "TransmissionType")
    protected VehTransmissionType transmissionType;
    @XmlAttribute(name = "PassengerQuantity")
    protected Integer passengerQuantity;
    @XmlAttribute(name = "BaggageQuantity")
    protected Integer baggageQuantity;

    /**
     * Gets the value of the vehType property.
     * 
     * @return
     *     possible object is
     *     {@link VehTypeRS }
     *     
     */
    public VehTypeRS getVehType() {
        return vehType;
    }

    /**
     * Sets the value of the vehType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehTypeRS }
     *     
     */
    public void setVehType(VehTypeRS value) {
        this.vehType = value;
    }

    /**
     * Gets the value of the vehClass property.
     * 
     * @return
     *     possible object is
     *     {@link VehClassRS }
     *     
     */
    public VehClassRS getVehClass() {
        return vehClass;
    }

    /**
     * Sets the value of the vehClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehClassRS }
     *     
     */
    public void setVehClass(VehClassRS value) {
        this.vehClass = value;
    }

    /**
     * Gets the value of the vehMakeModel property.
     * 
     * @return
     *     possible object is
     *     {@link VehMakeModel }
     *     
     */
    public VehMakeModel getVehMakeModel() {
        return vehMakeModel;
    }

    /**
     * Sets the value of the vehMakeModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehMakeModel }
     *     
     */
    public void setVehMakeModel(VehMakeModel value) {
        this.vehMakeModel = value;
    }

    /**
     * Gets the value of the pictureURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictureURL() {
        return pictureURL;
    }

    /**
     * Sets the value of the pictureURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictureURL(String value) {
        this.pictureURL = value;
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
     *     {@link VehTransmissionType }
     *     
     */
    public VehTransmissionType getTransmissionType() {
        return transmissionType;
    }

    /**
     * Sets the value of the transmissionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehTransmissionType }
     *     
     */
    public void setTransmissionType(VehTransmissionType value) {
        this.transmissionType = value;
    }

    /**
     * Gets the value of the passengerQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPassengerQuantity() {
        return passengerQuantity;
    }

    /**
     * Sets the value of the passengerQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPassengerQuantity(Integer value) {
        this.passengerQuantity = value;
    }

    /**
     * Gets the value of the baggageQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBaggageQuantity() {
        return baggageQuantity;
    }

    /**
     * Sets the value of the baggageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBaggageQuantity(Integer value) {
        this.baggageQuantity = value;
    }

}
