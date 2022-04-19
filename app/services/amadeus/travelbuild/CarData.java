
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarLocation" type="{http://traveltalk.com/wsTravelBuild}CarLocation" minOccurs="0"/>
 *         &lt;element name="CarRate" type="{http://traveltalk.com/wsTravelBuild}CarRate" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="NumCars" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarData", propOrder = {
    "carLocation",
    "carRate"
})
public class CarData {

    @XmlElement(name = "CarLocation")
    protected CarLocation carLocation;
    @XmlElement(name = "CarRate")
    protected CarRate carRate;
    @XmlAttribute(name = "NumCars")
    protected String numCars;

    /**
     * Gets the value of the carLocation property.
     * 
     * @return
     *     possible object is
     *     {@link CarLocation }
     *     
     */
    public CarLocation getCarLocation() {
        return carLocation;
    }

    /**
     * Sets the value of the carLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarLocation }
     *     
     */
    public void setCarLocation(CarLocation value) {
        this.carLocation = value;
    }

    /**
     * Gets the value of the carRate property.
     * 
     * @return
     *     possible object is
     *     {@link CarRate }
     *     
     */
    public CarRate getCarRate() {
        return carRate;
    }

    /**
     * Sets the value of the carRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarRate }
     *     
     */
    public void setCarRate(CarRate value) {
        this.carRate = value;
    }

    /**
     * Gets the value of the numCars property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCars() {
        return numCars;
    }

    /**
     * Sets the value of the numCars property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCars(String value) {
        this.numCars = value;
    }

}
