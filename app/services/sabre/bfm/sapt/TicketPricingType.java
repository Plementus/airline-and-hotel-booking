
package services.sabre.bfm.sapt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Pricing Information for Single Ticket
 * 
 * <p>Java class for TicketPricingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketPricingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginDestinationOptions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OriginDestinationOption" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FlightSegment" maxOccurs="4">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DepartureAirport" type="{http://www.opentravel.org/OTA/2003/05}ResponseLocationType"/>
 *                                       &lt;element name="ArrivalAirport" type="{http://www.opentravel.org/OTA/2003/05}ResponseLocationType"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="DepartureDateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AirItineraryPricingInfo" type="{http://www.opentravel.org/OTA/2003/05}AirItineraryPricingInfoType"/>
 *         &lt;element name="Notes" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="TicketingInfo" type="{http://www.opentravel.org/OTA/2003/05}TicketingInfoRS_Type" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ValidatingCarrier" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketPricingType", propOrder = {
    "originDestinationOptions",
    "airItineraryPricingInfo",
    "notes",
    "ticketingInfo",
    "tpaExtensions"
})
public class TicketPricingType {

    @XmlElement(name = "OriginDestinationOptions", required = true)
    protected OriginDestinationOptions originDestinationOptions;
    @XmlElement(name = "AirItineraryPricingInfo", required = true)
    protected AirItineraryPricingInfoType airItineraryPricingInfo;
    @XmlElement(name = "Notes")
    protected List<FreeTextType> notes;
    @XmlElement(name = "TicketingInfo")
    protected TicketingInfoRSType ticketingInfo;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensions tpaExtensions;
    @XmlAttribute(name = "Number", required = true)
    protected int number;

    /**
     * Gets the value of the originDestinationOptions property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestinationOptions }
     *     
     */
    public OriginDestinationOptions getOriginDestinationOptions() {
        return originDestinationOptions;
    }

    /**
     * Sets the value of the originDestinationOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestinationOptions }
     *     
     */
    public void setOriginDestinationOptions(OriginDestinationOptions value) {
        this.originDestinationOptions = value;
    }

    /**
     * Gets the value of the airItineraryPricingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryPricingInfoType }
     *     
     */
    public AirItineraryPricingInfoType getAirItineraryPricingInfo() {
        return airItineraryPricingInfo;
    }

    /**
     * Sets the value of the airItineraryPricingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryPricingInfoType }
     *     
     */
    public void setAirItineraryPricingInfo(AirItineraryPricingInfoType value) {
        this.airItineraryPricingInfo = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeTextType }
     * 
     * 
     */
    public List<FreeTextType> getNotes() {
        if (notes == null) {
            notes = new ArrayList<FreeTextType>();
        }
        return this.notes;
    }

    /**
     * Gets the value of the ticketingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TicketingInfoRSType }
     *     
     */
    public TicketingInfoRSType getTicketingInfo() {
        return ticketingInfo;
    }

    /**
     * Sets the value of the ticketingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingInfoRSType }
     *     
     */
    public void setTicketingInfo(TicketingInfoRSType value) {
        this.ticketingInfo = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensions }
     *     
     */
    public TPAExtensions getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensions }
     *     
     */
    public void setTPAExtensions(TPAExtensions value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }


    /**
     * Indicates which flights are covered by this ticket
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OriginDestinationOption" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FlightSegment" maxOccurs="4">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DepartureAirport" type="{http://www.opentravel.org/OTA/2003/05}ResponseLocationType"/>
     *                             &lt;element name="ArrivalAirport" type="{http://www.opentravel.org/OTA/2003/05}ResponseLocationType"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="DepartureDateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
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
    @XmlType(name = "", propOrder = {
        "originDestinationOption"
    })
    public static class OriginDestinationOptions {

        @XmlElement(name = "OriginDestinationOption", required = true)
        protected List<OriginDestinationOption> originDestinationOption;

        /**
         * Gets the value of the originDestinationOption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the originDestinationOption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOriginDestinationOption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OriginDestinationOption }
         * 
         * 
         */
        public List<OriginDestinationOption> getOriginDestinationOption() {
            if (originDestinationOption == null) {
                originDestinationOption = new ArrayList<OriginDestinationOption>();
            }
            return this.originDestinationOption;
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
         *         &lt;element name="FlightSegment" maxOccurs="4">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DepartureAirport" type="{http://www.opentravel.org/OTA/2003/05}ResponseLocationType"/>
         *                   &lt;element name="ArrivalAirport" type="{http://www.opentravel.org/OTA/2003/05}ResponseLocationType"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="DepartureDateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        @XmlType(name = "", propOrder = {
            "flightSegment"
        })
        public static class OriginDestinationOption {

            @XmlElement(name = "FlightSegment", required = true)
            protected List<FlightSegment> flightSegment;

            /**
             * Gets the value of the flightSegment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flightSegment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFlightSegment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FlightSegment }
             * 
             * 
             */
            public List<FlightSegment> getFlightSegment() {
                if (flightSegment == null) {
                    flightSegment = new ArrayList<FlightSegment>();
                }
                return this.flightSegment;
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
             *         &lt;element name="DepartureAirport" type="{http://www.opentravel.org/OTA/2003/05}ResponseLocationType"/>
             *         &lt;element name="ArrivalAirport" type="{http://www.opentravel.org/OTA/2003/05}ResponseLocationType"/>
             *       &lt;/sequence>
             *       &lt;attribute name="DepartureDateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "departureAirport",
                "arrivalAirport"
            })
            public static class FlightSegment {

                @XmlElement(name = "DepartureAirport", required = true)
                protected ResponseLocationType departureAirport;
                @XmlElement(name = "ArrivalAirport", required = true)
                protected ResponseLocationType arrivalAirport;
                @XmlAttribute(name = "DepartureDateTime", required = true)
                protected String departureDateTime;

                /**
                 * Gets the value of the departureAirport property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ResponseLocationType }
                 *     
                 */
                public ResponseLocationType getDepartureAirport() {
                    return departureAirport;
                }

                /**
                 * Sets the value of the departureAirport property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ResponseLocationType }
                 *     
                 */
                public void setDepartureAirport(ResponseLocationType value) {
                    this.departureAirport = value;
                }

                /**
                 * Gets the value of the arrivalAirport property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ResponseLocationType }
                 *     
                 */
                public ResponseLocationType getArrivalAirport() {
                    return arrivalAirport;
                }

                /**
                 * Sets the value of the arrivalAirport property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ResponseLocationType }
                 *     
                 */
                public void setArrivalAirport(ResponseLocationType value) {
                    this.arrivalAirport = value;
                }

                /**
                 * Gets the value of the departureDateTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDepartureDateTime() {
                    return departureDateTime;
                }

                /**
                 * Sets the value of the departureDateTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDepartureDateTime(String value) {
                    this.departureDateTime = value;
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
     *       &lt;sequence>
     *         &lt;element name="ValidatingCarrier" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
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
    @XmlType(name = "", propOrder = {
        "validatingCarrier"
    })
    public static class TPAExtensions {

        @XmlElement(name = "ValidatingCarrier")
        protected ValidatingCarrier validatingCarrier;

        /**
         * Gets the value of the validatingCarrier property.
         * 
         * @return
         *     possible object is
         *     {@link ValidatingCarrier }
         *     
         */
        public ValidatingCarrier getValidatingCarrier() {
            return validatingCarrier;
        }

        /**
         * Sets the value of the validatingCarrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link ValidatingCarrier }
         *     
         */
        public void setValidatingCarrier(ValidatingCarrier value) {
            this.validatingCarrier = value;
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
         *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ValidatingCarrier {

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

}
