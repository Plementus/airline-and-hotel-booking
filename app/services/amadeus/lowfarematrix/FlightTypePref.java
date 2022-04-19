
package services.amadeus.lowfarematrix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightTypePref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightTypePref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsLowFareMatrix}FlightTypePrefPreferLevel" default="Preferred" />
 *       &lt;attribute name="FlightType" type="{http://traveltalk.com/wsLowFareMatrix}FlightTypePrefFlightType" />
 *       &lt;attribute name="MaxConnections" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightTypePref")
public class FlightTypePref {

    @XmlAttribute(name = "PreferLevel")
    protected FlightTypePrefPreferLevel preferLevel;
    @XmlAttribute(name = "FlightType")
    protected FlightTypePrefFlightType flightType;
    @XmlAttribute(name = "MaxConnections")
    protected Integer maxConnections;

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link FlightTypePrefPreferLevel }
     *     
     */
    public FlightTypePrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return FlightTypePrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightTypePrefPreferLevel }
     *     
     */
    public void setPreferLevel(FlightTypePrefPreferLevel value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the flightType property.
     * 
     * @return
     *     possible object is
     *     {@link FlightTypePrefFlightType }
     *     
     */
    public FlightTypePrefFlightType getFlightType() {
        return flightType;
    }

    /**
     * Sets the value of the flightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightTypePrefFlightType }
     *     
     */
    public void setFlightType(FlightTypePrefFlightType value) {
        this.flightType = value;
    }

    /**
     * Gets the value of the maxConnections property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxConnections() {
        return maxConnections;
    }

    /**
     * Sets the value of the maxConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxConnections(Integer value) {
        this.maxConnections = value;
    }

}
