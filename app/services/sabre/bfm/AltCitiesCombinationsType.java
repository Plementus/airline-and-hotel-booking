
package services.sabre.bfm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Which (if any) alt cities locations should be handled in a special way (i.e. Validate instead of precomputed path).
 * 
 * <p>Java class for AltCitiesCombinationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AltCitiesCombinationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Origins" type="{http://www.opentravel.org/OTA/2003/05}AltCitiesCombinationsLocationsType" default="Main" />
 *       &lt;attribute name="Destinations" type="{http://www.opentravel.org/OTA/2003/05}AltCitiesCombinationsLocationsType" default="Main" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltCitiesCombinationsType")
public class AltCitiesCombinationsType {

    @XmlAttribute(name = "Origins")
    protected AltCitiesCombinationsLocationsType origins;
    @XmlAttribute(name = "Destinations")
    protected AltCitiesCombinationsLocationsType destinations;

    /**
     * Gets the value of the origins property.
     * 
     * @return
     *     possible object is
     *     {@link AltCitiesCombinationsLocationsType }
     *     
     */
    public AltCitiesCombinationsLocationsType getOrigins() {
        if (origins == null) {
            return AltCitiesCombinationsLocationsType.MAIN;
        } else {
            return origins;
        }
    }

    /**
     * Sets the value of the origins property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltCitiesCombinationsLocationsType }
     *     
     */
    public void setOrigins(AltCitiesCombinationsLocationsType value) {
        this.origins = value;
    }

    /**
     * Gets the value of the destinations property.
     * 
     * @return
     *     possible object is
     *     {@link AltCitiesCombinationsLocationsType }
     *     
     */
    public AltCitiesCombinationsLocationsType getDestinations() {
        if (destinations == null) {
            return AltCitiesCombinationsLocationsType.MAIN;
        } else {
            return destinations;
        }
    }

    /**
     * Sets the value of the destinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltCitiesCombinationsLocationsType }
     *     
     */
    public void setDestinations(AltCitiesCombinationsLocationsType value) {
        this.destinations = value;
    }

}
