
package services.sabre.bfm;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				These parameters control how IntellSell should select itineraries
 * 				based not necessarily on cheapest price,
 * 				but also on other criteria that guarantee a diverse response.
 * 			
 * 
 * <p>Java class for DiversityControlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiversityControlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LowFareBucket">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Options" type="{http://www.opentravel.org/OTA/2003/05}CountOrPercentage" />
 *                 &lt;attribute name="FareCutOff" type="{http://www.opentravel.org/OTA/2003/05}IntPercentage" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Dimensions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TravelTime" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Weight" use="required" type="{http://www.opentravel.org/OTA/2003/05}SumWeight" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Carrier" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Default" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Options" use="required" type="{http://www.opentravel.org/OTA/2003/05}CountOrPercentage" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Override" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}CarrierCode" />
 *                                     &lt;attribute name="Options" use="required" type="{http://www.opentravel.org/OTA/2003/05}CountOrPercentage" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Weight" use="required" type="{http://www.opentravel.org/OTA/2003/05}SumWeight" />
 *                           &lt;attribute name="OnlineIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OperatingDuplicate" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PreferredCarrier" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}CarrierCode" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Weight" use="required" type="{http://www.opentravel.org/OTA/2003/05}SumWeight" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="InboundOutboundPairing" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Weight" use="required" type="{http://www.opentravel.org/OTA/2003/05}SumWeight" />
 *                           &lt;attribute name="Duplicates" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="1" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TimeOfDay" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Distribution" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Range" maxOccurs="4" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Begin" use="required" type="{http://www.opentravel.org/OTA/2003/05}HH_MM" />
 *                                               &lt;attribute name="End" use="required" type="{http://www.opentravel.org/OTA/2003/05}HH_MM" />
 *                                               &lt;attribute name="Options" type="{http://www.opentravel.org/OTA/2003/05}CountOrPercentage" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Direction" type="{http://www.opentravel.org/OTA/2003/05}OutboundOrInbound" />
 *                                     &lt;attribute name="Leg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                     &lt;attribute name="Endpoint" type="{http://www.opentravel.org/OTA/2003/05}DepartureOrArrival" default="Departure" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Weight" use="required" type="{http://www.opentravel.org/OTA/2003/05}SumWeight" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="StopsNumber" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Weight" use="required" type="{http://www.opentravel.org/OTA/2003/05}SumWeight" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="PriceWeight" type="{http://www.opentravel.org/OTA/2003/05}Numeric0To10Type" default="10" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiversityControlType", propOrder = {
    "lowFareBucket",
    "dimensions"
})
public class DiversityControlType {

    @XmlElement(name = "LowFareBucket", required = true)
    protected LowFareBucket lowFareBucket;
    @XmlElement(name = "Dimensions", required = true)
    protected Dimensions dimensions;

    /**
     * Gets the value of the lowFareBucket property.
     * 
     * @return
     *     possible object is
     *     {@link LowFareBucket }
     *     
     */
    public LowFareBucket getLowFareBucket() {
        return lowFareBucket;
    }

    /**
     * Sets the value of the lowFareBucket property.
     * 
     * @param value
     *     allowed object is
     *     {@link LowFareBucket }
     *     
     */
    public void setLowFareBucket(LowFareBucket value) {
        this.lowFareBucket = value;
    }

    /**
     * Gets the value of the dimensions property.
     * 
     * @return
     *     possible object is
     *     {@link Dimensions }
     *     
     */
    public Dimensions getDimensions() {
        return dimensions;
    }

    /**
     * Sets the value of the dimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dimensions }
     *     
     */
    public void setDimensions(Dimensions value) {
        this.dimensions = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="TravelTime" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Weight" use="required" type="{http://www.opentravel.org/OTA/2003/05}SumWeight" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Carrier" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Default" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Options" use="required" type="{http://www.opentravel.org/OTA/2003/05}CountOrPercentage" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Override" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}CarrierCode" />
     *                           &lt;attribute name="Options" use="required" type="{http://www.opentravel.org/OTA/2003/05}CountOrPercentage" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Weight" use="required" type="{http://www.opentravel.org/OTA/2003/05}SumWeight" />
     *                 &lt;attribute name="OnlineIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OperatingDuplicate" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PreferredCarrier" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}CarrierCode" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Weight" use="required" type="{http://www.opentravel.org/OTA/2003/05}SumWeight" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="InboundOutboundPairing" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Weight" use="required" type="{http://www.opentravel.org/OTA/2003/05}SumWeight" />
     *                 &lt;attribute name="Duplicates" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="1" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TimeOfDay" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Distribution" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Range" maxOccurs="4" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Begin" use="required" type="{http://www.opentravel.org/OTA/2003/05}HH_MM" />
     *                                     &lt;attribute name="End" use="required" type="{http://www.opentravel.org/OTA/2003/05}HH_MM" />
     *                                     &lt;attribute name="Options" type="{http://www.opentravel.org/OTA/2003/05}CountOrPercentage" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Direction" type="{http://www.opentravel.org/OTA/2003/05}OutboundOrInbound" />
     *                           &lt;attribute name="Leg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                           &lt;attribute name="Endpoint" type="{http://www.opentravel.org/OTA/2003/05}DepartureOrArrival" default="Departure" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Weight" use="required" type="{http://www.opentravel.org/OTA/2003/05}SumWeight" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="StopsNumber" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Weight" use="required" type="{http://www.opentravel.org/OTA/2003/05}SumWeight" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="PriceWeight" type="{http://www.opentravel.org/OTA/2003/05}Numeric0To10Type" default="10" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "travelTime",
        "carrier",
        "operatingDuplicate",
        "inboundOutboundPairing",
        "timeOfDay",
        "stopsNumber"
    })
    public static class Dimensions {

        @XmlElement(name = "TravelTime")
        protected TravelTime travelTime;
        @XmlElement(name = "Carrier")
        protected Carrier carrier;
        @XmlElement(name = "OperatingDuplicate")
        protected OperatingDuplicate operatingDuplicate;
        @XmlElement(name = "InboundOutboundPairing")
        protected InboundOutboundPairing inboundOutboundPairing;
        @XmlElement(name = "TimeOfDay")
        protected TimeOfDay timeOfDay;
        @XmlElement(name = "StopsNumber")
        protected StopsNumber stopsNumber;
        @XmlAttribute(name = "PriceWeight")
        protected Integer priceWeight;

        /**
         * Gets the value of the travelTime property.
         * 
         * @return
         *     possible object is
         *     {@link TravelTime }
         *     
         */
        public TravelTime getTravelTime() {
            return travelTime;
        }

        /**
         * Sets the value of the travelTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelTime }
         *     
         */
        public void setTravelTime(TravelTime value) {
            this.travelTime = value;
        }

        /**
         * Gets the value of the carrier property.
         * 
         * @return
         *     possible object is
         *     {@link Carrier }
         *     
         */
        public Carrier getCarrier() {
            return carrier;
        }

        /**
         * Sets the value of the carrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link Carrier }
         *     
         */
        public void setCarrier(Carrier value) {
            this.carrier = value;
        }

        /**
         * Gets the value of the operatingDuplicate property.
         * 
         * @return
         *     possible object is
         *     {@link OperatingDuplicate }
         *     
         */
        public OperatingDuplicate getOperatingDuplicate() {
            return operatingDuplicate;
        }

        /**
         * Sets the value of the operatingDuplicate property.
         * 
         * @param value
         *     allowed object is
         *     {@link OperatingDuplicate }
         *     
         */
        public void setOperatingDuplicate(OperatingDuplicate value) {
            this.operatingDuplicate = value;
        }

        /**
         * Gets the value of the inboundOutboundPairing property.
         * 
         * @return
         *     possible object is
         *     {@link InboundOutboundPairing }
         *     
         */
        public InboundOutboundPairing getInboundOutboundPairing() {
            return inboundOutboundPairing;
        }

        /**
         * Sets the value of the inboundOutboundPairing property.
         * 
         * @param value
         *     allowed object is
         *     {@link InboundOutboundPairing }
         *     
         */
        public void setInboundOutboundPairing(InboundOutboundPairing value) {
            this.inboundOutboundPairing = value;
        }

        /**
         * Gets the value of the timeOfDay property.
         * 
         * @return
         *     possible object is
         *     {@link TimeOfDay }
         *     
         */
        public TimeOfDay getTimeOfDay() {
            return timeOfDay;
        }

        /**
         * Sets the value of the timeOfDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeOfDay }
         *     
         */
        public void setTimeOfDay(TimeOfDay value) {
            this.timeOfDay = value;
        }

        /**
         * Gets the value of the stopsNumber property.
         * 
         * @return
         *     possible object is
         *     {@link StopsNumber }
         *     
         */
        public StopsNumber getStopsNumber() {
            return stopsNumber;
        }

        /**
         * Sets the value of the stopsNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link StopsNumber }
         *     
         */
        public void setStopsNumber(StopsNumber value) {
            this.stopsNumber = value;
        }

        /**
         * Gets the value of the priceWeight property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getPriceWeight() {
            if (priceWeight == null) {
                return  10;
            } else {
                return priceWeight;
            }
        }

        /**
         * Sets the value of the priceWeight property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPriceWeight(Integer value) {
            this.priceWeight = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Default" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Options" use="required" type="{http://www.opentravel.org/OTA/2003/05}CountOrPercentage" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Override" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}CarrierCode" />
         *                 &lt;attribute name="Options" use="required" type="{http://www.opentravel.org/OTA/2003/05}CountOrPercentage" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Weight" use="required" type="{http://www.opentravel.org/OTA/2003/05}SumWeight" />
         *       &lt;attribute name="OnlineIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "_default",
            "override"
        })
        public static class Carrier {

            @XmlElement(name = "Default")
            protected Default _default;
            @XmlElement(name = "Override")
            protected List<Override> override;
            @XmlAttribute(name = "Weight", required = true)
            protected int weight;
            @XmlAttribute(name = "OnlineIndicator")
            protected Boolean onlineIndicator;

            /**
             * Gets the value of the default property.
             * 
             * @return
             *     possible object is
             *     {@link Default }
             *     
             */
            public Default getDefault() {
                return _default;
            }

            /**
             * Sets the value of the default property.
             * 
             * @param value
             *     allowed object is
             *     {@link Default }
             *     
             */
            public void setDefault(Default value) {
                this._default = value;
            }

            /**
             * Gets the value of the override property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the override property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOverride().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Override }
             * 
             * 
             */
            public List<Override> getOverride() {
                if (override == null) {
                    override = new ArrayList<Override>();
                }
                return this.override;
            }

            /**
             * Gets the value of the weight property.
             * 
             */
            public int getWeight() {
                return weight;
            }

            /**
             * Sets the value of the weight property.
             * 
             */
            public void setWeight(int value) {
                this.weight = value;
            }

            /**
             * Gets the value of the onlineIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isOnlineIndicator() {
                if (onlineIndicator == null) {
                    return false;
                } else {
                    return onlineIndicator;
                }
            }

            /**
             * Sets the value of the onlineIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setOnlineIndicator(Boolean value) {
                this.onlineIndicator = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Options" use="required" type="{http://www.opentravel.org/OTA/2003/05}CountOrPercentage" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Default {

                @XmlAttribute(name = "Options", required = true)
                protected String options;

                /**
                 * Gets the value of the options property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOptions() {
                    return options;
                }

                /**
                 * Sets the value of the options property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOptions(String value) {
                    this.options = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}CarrierCode" />
             *       &lt;attribute name="Options" use="required" type="{http://www.opentravel.org/OTA/2003/05}CountOrPercentage" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Override {

                @XmlAttribute(name = "Code", required = true)
                protected String code;
                @XmlAttribute(name = "Options", required = true)
                protected String options;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the options property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOptions() {
                    return options;
                }

                /**
                 * Sets the value of the options property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOptions(String value) {
                    this.options = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Weight" use="required" type="{http://www.opentravel.org/OTA/2003/05}SumWeight" />
         *       &lt;attribute name="Duplicates" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="1" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class InboundOutboundPairing {

            @XmlAttribute(name = "Weight", required = true)
            protected int weight;
            @XmlAttribute(name = "Duplicates")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger duplicates;

            /**
             * Gets the value of the weight property.
             * 
             */
            public int getWeight() {
                return weight;
            }

            /**
             * Sets the value of the weight property.
             * 
             */
            public void setWeight(int value) {
                this.weight = value;
            }

            /**
             * Gets the value of the duplicates property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDuplicates() {
                if (duplicates == null) {
                    return new BigInteger("1");
                } else {
                    return duplicates;
                }
            }

            /**
             * Sets the value of the duplicates property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDuplicates(BigInteger value) {
                this.duplicates = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="PreferredCarrier" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}CarrierCode" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Weight" use="required" type="{http://www.opentravel.org/OTA/2003/05}SumWeight" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "preferredCarrier"
        })
        public static class OperatingDuplicate {

            @XmlElement(name = "PreferredCarrier")
            protected List<PreferredCarrier> preferredCarrier;
            @XmlAttribute(name = "Weight", required = true)
            protected int weight;

            /**
             * Gets the value of the preferredCarrier property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the preferredCarrier property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPreferredCarrier().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PreferredCarrier }
             * 
             * 
             */
            public List<PreferredCarrier> getPreferredCarrier() {
                if (preferredCarrier == null) {
                    preferredCarrier = new ArrayList<PreferredCarrier>();
                }
                return this.preferredCarrier;
            }

            /**
             * Gets the value of the weight property.
             * 
             */
            public int getWeight() {
                return weight;
            }

            /**
             * Sets the value of the weight property.
             * 
             */
            public void setWeight(int value) {
                this.weight = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}CarrierCode" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PreferredCarrier {

                @XmlAttribute(name = "Code", required = true)
                protected String code;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Weight" use="required" type="{http://www.opentravel.org/OTA/2003/05}SumWeight" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class StopsNumber {

            @XmlAttribute(name = "Weight", required = true)
            protected int weight;

            /**
             * Gets the value of the weight property.
             * 
             */
            public int getWeight() {
                return weight;
            }

            /**
             * Sets the value of the weight property.
             * 
             */
            public void setWeight(int value) {
                this.weight = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Distribution" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Range" maxOccurs="4" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Begin" use="required" type="{http://www.opentravel.org/OTA/2003/05}HH_MM" />
         *                           &lt;attribute name="End" use="required" type="{http://www.opentravel.org/OTA/2003/05}HH_MM" />
         *                           &lt;attribute name="Options" type="{http://www.opentravel.org/OTA/2003/05}CountOrPercentage" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Direction" type="{http://www.opentravel.org/OTA/2003/05}OutboundOrInbound" />
         *                 &lt;attribute name="Leg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                 &lt;attribute name="Endpoint" type="{http://www.opentravel.org/OTA/2003/05}DepartureOrArrival" default="Departure" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Weight" use="required" type="{http://www.opentravel.org/OTA/2003/05}SumWeight" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "distribution"
        })
        public static class TimeOfDay {

            @XmlElement(name = "Distribution")
            protected List<Distribution> distribution;
            @XmlAttribute(name = "Weight", required = true)
            protected int weight;

            /**
             * Gets the value of the distribution property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the distribution property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDistribution().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Distribution }
             * 
             * 
             */
            public List<Distribution> getDistribution() {
                if (distribution == null) {
                    distribution = new ArrayList<Distribution>();
                }
                return this.distribution;
            }

            /**
             * Gets the value of the weight property.
             * 
             */
            public int getWeight() {
                return weight;
            }

            /**
             * Sets the value of the weight property.
             * 
             */
            public void setWeight(int value) {
                this.weight = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Range" maxOccurs="4" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Begin" use="required" type="{http://www.opentravel.org/OTA/2003/05}HH_MM" />
             *                 &lt;attribute name="End" use="required" type="{http://www.opentravel.org/OTA/2003/05}HH_MM" />
             *                 &lt;attribute name="Options" type="{http://www.opentravel.org/OTA/2003/05}CountOrPercentage" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="Direction" type="{http://www.opentravel.org/OTA/2003/05}OutboundOrInbound" />
             *       &lt;attribute name="Leg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *       &lt;attribute name="Endpoint" type="{http://www.opentravel.org/OTA/2003/05}DepartureOrArrival" default="Departure" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "range"
            })
            public static class Distribution {

                @XmlElement(name = "Range")
                protected List<Range> range;
                @XmlAttribute(name = "Direction")
                protected OutboundOrInbound direction;
                @XmlAttribute(name = "Leg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger leg;
                @XmlAttribute(name = "Endpoint")
                protected DepartureOrArrival endpoint;

                /**
                 * Gets the value of the range property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the range property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRange().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Range }
                 * 
                 * 
                 */
                public List<Range> getRange() {
                    if (range == null) {
                        range = new ArrayList<Range>();
                    }
                    return this.range;
                }

                /**
                 * Gets the value of the direction property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OutboundOrInbound }
                 *     
                 */
                public OutboundOrInbound getDirection() {
                    return direction;
                }

                /**
                 * Sets the value of the direction property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OutboundOrInbound }
                 *     
                 */
                public void setDirection(OutboundOrInbound value) {
                    this.direction = value;
                }

                /**
                 * Gets the value of the leg property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getLeg() {
                    return leg;
                }

                /**
                 * Sets the value of the leg property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setLeg(BigInteger value) {
                    this.leg = value;
                }

                /**
                 * Gets the value of the endpoint property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DepartureOrArrival }
                 *     
                 */
                public DepartureOrArrival getEndpoint() {
                    if (endpoint == null) {
                        return DepartureOrArrival.DEPARTURE;
                    } else {
                        return endpoint;
                    }
                }

                /**
                 * Sets the value of the endpoint property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DepartureOrArrival }
                 *     
                 */
                public void setEndpoint(DepartureOrArrival value) {
                    this.endpoint = value;
                }


                /**
                 * 
                 * 																Either all Range elements shall contain attribute Options or none.
                 * 																Ranges shall not overlap.
                 * 															
                 * 
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="Begin" use="required" type="{http://www.opentravel.org/OTA/2003/05}HH_MM" />
                 *       &lt;attribute name="End" use="required" type="{http://www.opentravel.org/OTA/2003/05}HH_MM" />
                 *       &lt;attribute name="Options" type="{http://www.opentravel.org/OTA/2003/05}CountOrPercentage" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Range {

                    @XmlAttribute(name = "Begin", required = true)
                    protected String begin;
                    @XmlAttribute(name = "End", required = true)
                    protected String end;
                    @XmlAttribute(name = "Options")
                    protected String options;

                    /**
                     * Gets the value of the begin property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBegin() {
                        return begin;
                    }

                    /**
                     * Sets the value of the begin property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBegin(String value) {
                        this.begin = value;
                    }

                    /**
                     * Gets the value of the end property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEnd() {
                        return end;
                    }

                    /**
                     * Sets the value of the end property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEnd(String value) {
                        this.end = value;
                    }

                    /**
                     * Gets the value of the options property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOptions() {
                        return options;
                    }

                    /**
                     * Sets the value of the options property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOptions(String value) {
                        this.options = value;
                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Weight" use="required" type="{http://www.opentravel.org/OTA/2003/05}SumWeight" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TravelTime {

            @XmlAttribute(name = "Weight", required = true)
            protected int weight;

            /**
             * Gets the value of the weight property.
             * 
             */
            public int getWeight() {
                return weight;
            }

            /**
             * Sets the value of the weight property.
             * 
             */
            public void setWeight(int value) {
                this.weight = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="Options" type="{http://www.opentravel.org/OTA/2003/05}CountOrPercentage" />
     *       &lt;attribute name="FareCutOff" type="{http://www.opentravel.org/OTA/2003/05}IntPercentage" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LowFareBucket {

        @XmlAttribute(name = "Options")
        protected String options;
        @XmlAttribute(name = "FareCutOff")
        protected String fareCutOff;

        /**
         * Gets the value of the options property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOptions() {
            return options;
        }

        /**
         * Sets the value of the options property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOptions(String value) {
            this.options = value;
        }

        /**
         * Gets the value of the fareCutOff property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareCutOff() {
            return fareCutOff;
        }

        /**
         * Sets the value of the fareCutOff property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareCutOff(String value) {
            this.fareCutOff = value;
        }

    }

}
