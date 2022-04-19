
package services.sabre.bfm.sapt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Origin and Destination location, and time information for the request. Also includes the ability to specify a connection location for the search.
 * 
 * <p>Java class for OriginDestinationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginDestinationInformationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TravelDateTimeType">
 *       &lt;sequence>
 *         &lt;element name="OriginLocation">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>RequestLocationType">
 *                 &lt;attribute name="AllAirports" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DestinationLocation">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>RequestLocationType">
 *                 &lt;attribute name="AllAirports" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ConnectionLocations" type="{http://www.opentravel.org/OTA/2003/05}ConnectionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestinationInformationType", propOrder = {
    "originLocation",
    "destinationLocation",
    "connectionLocations"
})
@XmlSeeAlso({
    OTAAirLowFareSearchRQ.OriginDestinationInformation.class,
    ExchangeOriginDestinationInformationType.class
})
public class OriginDestinationInformationType
    extends TravelDateTimeType
{

    @XmlElement(name = "OriginLocation", required = true)
    protected OriginLocation originLocation;
    @XmlElement(name = "DestinationLocation", required = true)
    protected DestinationLocation destinationLocation;
    @XmlElement(name = "ConnectionLocations")
    protected ConnectionType connectionLocations;

    /**
     * Gets the value of the originLocation property.
     * 
     * @return
     *     possible object is
     *     {@link OriginLocation }
     *     
     */
    public OriginLocation getOriginLocation() {
        return originLocation;
    }

    /**
     * Sets the value of the originLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginLocation }
     *     
     */
    public void setOriginLocation(OriginLocation value) {
        this.originLocation = value;
    }

    /**
     * Gets the value of the destinationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationLocation }
     *     
     */
    public DestinationLocation getDestinationLocation() {
        return destinationLocation;
    }

    /**
     * Sets the value of the destinationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationLocation }
     *     
     */
    public void setDestinationLocation(DestinationLocation value) {
        this.destinationLocation = value;
    }

    /**
     * Gets the value of the connectionLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionType }
     *     
     */
    public ConnectionType getConnectionLocations() {
        return connectionLocations;
    }

    /**
     * Sets the value of the connectionLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionType }
     *     
     */
    public void setConnectionLocations(ConnectionType value) {
        this.connectionLocations = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>RequestLocationType">
     *       &lt;attribute name="AllAirports" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DestinationLocation
        extends RequestLocationType
    {

        @XmlAttribute(name = "AllAirports")
        protected Boolean allAirports;

        /**
         * Gets the value of the allAirports property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllAirports() {
            return allAirports;
        }

        /**
         * Sets the value of the allAirports property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllAirports(Boolean value) {
            this.allAirports = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>RequestLocationType">
     *       &lt;attribute name="AllAirports" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OriginLocation
        extends RequestLocationType
    {

        @XmlAttribute(name = "AllAirports")
        protected Boolean allAirports;

        /**
         * Gets the value of the allAirports property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllAirports() {
            return allAirports;
        }

        /**
         * Sets the value of the allAirports property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllAirports(Boolean value) {
            this.allAirports = value;
        }

    }

}
