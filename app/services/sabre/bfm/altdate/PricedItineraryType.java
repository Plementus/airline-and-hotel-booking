
package services.sabre.bfm.altdate;

import core.gdsbookingengine.PricedItineraryWrapper;

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
 * Itinerary with pricing information.
 * 
 * <p>Java class for PricedItineraryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricedItineraryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirItinerary" type="{http://www.opentravel.org/OTA/2003/05}AirItineraryType" minOccurs="0"/>
 *         &lt;element name="AirItineraryPricingInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirItineraryPricingInfoType">
 *                 &lt;sequence>
 *                   &lt;element name="Tickets" type="{http://www.opentravel.org/OTA/2003/05}TicketsPricingType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Notes" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="TicketingInfo" type="{http://www.opentravel.org/OTA/2003/05}TicketingInfoRS_Type" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdditionalFares" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AirItineraryPricingInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirItineraryPricingInfoType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Tickets" type="{http://www.opentravel.org/OTA/2003/05}TicketsPricingType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Notes" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="5" minOccurs="0"/>
 *                             &lt;element name="TicketingInfo" type="{http://www.opentravel.org/OTA/2003/05}TicketingInfoRS_Type" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="MultipleTickets" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Ops" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FareTypes" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="FareType" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}FareTypeNameType" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ActionCode" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ItinSource" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Source" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ValidatingCarrier" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ValueBucket" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="PriceTimeValueRank" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="ValueBucketNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
 *       &lt;attribute name="isFromCustomPath" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SequenceNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="OriginDestinationRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="CampaignID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AlternateAirport" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MultipleTickets" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricedItineraryType", propOrder = {
    "airItinerary",
    "airItineraryPricingInfo",
    "notes",
    "ticketingInfo",
    "tpaExtensions"
})
public class PricedItineraryType implements PricedItineraryWrapper {

    @XmlElement(name = "AirItinerary")
    protected AirItineraryType airItinerary;
    @XmlElement(name = "AirItineraryPricingInfo")
    protected List<AirItineraryPricingInfo> airItineraryPricingInfo;
    @XmlElement(name = "Notes")
    protected List<FreeTextType> notes;
    @XmlElement(name = "TicketingInfo")
    protected TicketingInfoRSType ticketingInfo;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensions tpaExtensions;
    @XmlAttribute(name = "isFromCustomPath")
    protected Boolean isFromCustomPath;
    @XmlAttribute(name = "SequenceNumber", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequenceNumber;
    @XmlAttribute(name = "OriginDestinationRPH")
    protected String originDestinationRPH;
    @XmlAttribute(name = "CampaignID")
    protected String campaignID;
    @XmlAttribute(name = "AlternateAirport")
    protected Boolean alternateAirport;
    @XmlAttribute(name = "MultipleTickets")
    protected Boolean multipleTickets;

    /**
     * Gets the value of the airItinerary property.
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryType }
     *     
     */
    public AirItineraryType getAirItinerary() {
        return airItinerary;
    }

    /**
     * Sets the value of the airItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryType }
     *     
     */
    public void setAirItinerary(AirItineraryType value) {
        this.airItinerary = value;
    }

    /**
     * Gets the value of the airItineraryPricingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airItineraryPricingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirItineraryPricingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirItineraryPricingInfo }
     * 
     * 
     */
    public List<AirItineraryPricingInfo> getAirItineraryPricingInfo() {
        if (airItineraryPricingInfo == null) {
            airItineraryPricingInfo = new ArrayList<AirItineraryPricingInfo>();
        }
        return this.airItineraryPricingInfo;
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
     * Gets the value of the isFromCustomPath property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFromCustomPath() {
        return isFromCustomPath;
    }

    /**
     * Sets the value of the isFromCustomPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFromCustomPath(Boolean value) {
        this.isFromCustomPath = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the originDestinationRPH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginDestinationRPH() {
        return originDestinationRPH;
    }

    /**
     * Sets the value of the originDestinationRPH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginDestinationRPH(String value) {
        this.originDestinationRPH = value;
    }

    /**
     * Gets the value of the campaignID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignID() {
        return campaignID;
    }

    /**
     * Sets the value of the campaignID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignID(String value) {
        this.campaignID = value;
    }

    /**
     * Gets the value of the alternateAirport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlternateAirport() {
        return alternateAirport;
    }

    /**
     * Sets the value of the alternateAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlternateAirport(Boolean value) {
        this.alternateAirport = value;
    }

    /**
     * Gets the value of the multipleTickets property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultipleTickets() {
        return multipleTickets;
    }

    /**
     * Sets the value of the multipleTickets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipleTickets(Boolean value) {
        this.multipleTickets = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirItineraryPricingInfoType">
     *       &lt;sequence>
     *         &lt;element name="Tickets" type="{http://www.opentravel.org/OTA/2003/05}TicketsPricingType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tickets"
    })
    public static class AirItineraryPricingInfo
        extends AirItineraryPricingInfoType
    {

        @XmlElement(name = "Tickets")
        protected TicketsPricingType tickets;

        /**
         * Gets the value of the tickets property.
         * 
         * @return
         *     possible object is
         *     {@link TicketsPricingType }
         *     
         */
        public TicketsPricingType getTickets() {
            return tickets;
        }

        /**
         * Sets the value of the tickets property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketsPricingType }
         *     
         */
        public void setTickets(TicketsPricingType value) {
            this.tickets = value;
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
     *         &lt;element name="AdditionalFares" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AirItineraryPricingInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirItineraryPricingInfoType">
     *                           &lt;sequence>
     *                             &lt;element name="Tickets" type="{http://www.opentravel.org/OTA/2003/05}TicketsPricingType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Notes" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="5" minOccurs="0"/>
     *                   &lt;element name="TicketingInfo" type="{http://www.opentravel.org/OTA/2003/05}TicketingInfoRS_Type" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="MultipleTickets" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Ops" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FareTypes" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="FareType" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}FareTypeNameType" />
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
     *                 &lt;attribute name="ActionCode" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ItinSource" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Source" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ValidatingCarrier" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ValueBucket" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="PriceTimeValueRank" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                 &lt;attribute name="ValueBucketNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
        "additionalFares",
        "ops",
        "itinSource",
        "validatingCarrier",
        "valueBucket"
    })
    public static class TPAExtensions {

        @XmlElement(name = "AdditionalFares")
        protected List<AdditionalFares> additionalFares;
        @XmlElement(name = "Ops")
        protected Ops ops;
        @XmlElement(name = "ItinSource")
        protected ItinSource itinSource;
        @XmlElement(name = "ValidatingCarrier")
        protected ValidatingCarrier validatingCarrier;
        @XmlElement(name = "ValueBucket")
        protected ValueBucket valueBucket;

        /**
         * Gets the value of the additionalFares property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalFares property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalFares().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AdditionalFares }
         * 
         * 
         */
        public List<AdditionalFares> getAdditionalFares() {
            if (additionalFares == null) {
                additionalFares = new ArrayList<AdditionalFares>();
            }
            return this.additionalFares;
        }

        /**
         * Gets the value of the ops property.
         * 
         * @return
         *     possible object is
         *     {@link Ops }
         *     
         */
        public Ops getOps() {
            return ops;
        }

        /**
         * Sets the value of the ops property.
         * 
         * @param value
         *     allowed object is
         *     {@link Ops }
         *     
         */
        public void setOps(Ops value) {
            this.ops = value;
        }

        /**
         * Gets the value of the itinSource property.
         * 
         * @return
         *     possible object is
         *     {@link ItinSource }
         *     
         */
        public ItinSource getItinSource() {
            return itinSource;
        }

        /**
         * Sets the value of the itinSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItinSource }
         *     
         */
        public void setItinSource(ItinSource value) {
            this.itinSource = value;
        }

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
         * Gets the value of the valueBucket property.
         * 
         * @return
         *     possible object is
         *     {@link ValueBucket }
         *     
         */
        public ValueBucket getValueBucket() {
            return valueBucket;
        }

        /**
         * Sets the value of the valueBucket property.
         * 
         * @param value
         *     allowed object is
         *     {@link ValueBucket }
         *     
         */
        public void setValueBucket(ValueBucket value) {
            this.valueBucket = value;
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
         *         &lt;element name="AirItineraryPricingInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirItineraryPricingInfoType">
         *                 &lt;sequence>
         *                   &lt;element name="Tickets" type="{http://www.opentravel.org/OTA/2003/05}TicketsPricingType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Notes" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="5" minOccurs="0"/>
         *         &lt;element name="TicketingInfo" type="{http://www.opentravel.org/OTA/2003/05}TicketingInfoRS_Type" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="MultipleTickets" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "airItineraryPricingInfo",
            "notes",
            "ticketingInfo"
        })
        public static class AdditionalFares {

            @XmlElement(name = "AirItineraryPricingInfo")
            protected AirItineraryPricingInfo airItineraryPricingInfo;
            @XmlElement(name = "Notes")
            protected List<FreeTextType> notes;
            @XmlElement(name = "TicketingInfo")
            protected TicketingInfoRSType ticketingInfo;
            @XmlAttribute(name = "MultipleTickets")
            protected Boolean multipleTickets;

            /**
             * Gets the value of the airItineraryPricingInfo property.
             * 
             * @return
             *     possible object is
             *     {@link AirItineraryPricingInfo }
             *     
             */
            public AirItineraryPricingInfo getAirItineraryPricingInfo() {
                return airItineraryPricingInfo;
            }

            /**
             * Sets the value of the airItineraryPricingInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link AirItineraryPricingInfo }
             *     
             */
            public void setAirItineraryPricingInfo(AirItineraryPricingInfo value) {
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
             * Gets the value of the multipleTickets property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isMultipleTickets() {
                return multipleTickets;
            }

            /**
             * Sets the value of the multipleTickets property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setMultipleTickets(Boolean value) {
                this.multipleTickets = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirItineraryPricingInfoType">
             *       &lt;sequence>
             *         &lt;element name="Tickets" type="{http://www.opentravel.org/OTA/2003/05}TicketsPricingType" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "tickets"
            })
            public static class AirItineraryPricingInfo
                extends AirItineraryPricingInfoType
            {

                @XmlElement(name = "Tickets")
                protected TicketsPricingType tickets;

                /**
                 * Gets the value of the tickets property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TicketsPricingType }
                 *     
                 */
                public TicketsPricingType getTickets() {
                    return tickets;
                }

                /**
                 * Sets the value of the tickets property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TicketsPricingType }
                 *     
                 */
                public void setTickets(TicketsPricingType value) {
                    this.tickets = value;
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
         *       &lt;attribute name="Source" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ItinSource {

            @XmlAttribute(name = "Source", required = true)
            protected String source;

            /**
             * Gets the value of the source property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSource() {
                return source;
            }

            /**
             * Sets the value of the source property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSource(String value) {
                this.source = value;
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
         *         &lt;element name="FareTypes" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="FareType" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}FareTypeNameType" />
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
         *       &lt;attribute name="ActionCode" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "fareTypes"
        })
        public static class Ops {

            @XmlElement(name = "FareTypes")
            protected FareTypes fareTypes;
            @XmlAttribute(name = "ActionCode", required = true)
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger actionCode;

            /**
             * Gets the value of the fareTypes property.
             * 
             * @return
             *     possible object is
             *     {@link FareTypes }
             *     
             */
            public FareTypes getFareTypes() {
                return fareTypes;
            }

            /**
             * Sets the value of the fareTypes property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareTypes }
             *     
             */
            public void setFareTypes(FareTypes value) {
                this.fareTypes = value;
            }

            /**
             * Gets the value of the actionCode property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getActionCode() {
                return actionCode;
            }

            /**
             * Sets the value of the actionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setActionCode(BigInteger value) {
                this.actionCode = value;
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
             *         &lt;element name="FareType" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}FareTypeNameType" />
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
                "fareType"
            })
            public static class FareTypes {

                @XmlElement(name = "FareType", required = true)
                protected List<FareType> fareType;

                /**
                 * Gets the value of the fareType property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the fareType property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFareType().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FareType }
                 * 
                 * 
                 */
                public List<FareType> getFareType() {
                    if (fareType == null) {
                        fareType = new ArrayList<FareType>();
                    }
                    return this.fareType;
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
                 *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}FareTypeNameType" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class FareType {

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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="PriceTimeValueRank" type="{http://www.w3.org/2001/XMLSchema}double" />
         *       &lt;attribute name="ValueBucketNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ValueBucket {

            @XmlAttribute(name = "PriceTimeValueRank")
            protected Double priceTimeValueRank;
            @XmlAttribute(name = "ValueBucketNumber")
            protected BigInteger valueBucketNumber;

            /**
             * Gets the value of the priceTimeValueRank property.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getPriceTimeValueRank() {
                return priceTimeValueRank;
            }

            /**
             * Sets the value of the priceTimeValueRank property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setPriceTimeValueRank(Double value) {
                this.priceTimeValueRank = value;
            }

            /**
             * Gets the value of the valueBucketNumber property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getValueBucketNumber() {
                return valueBucketNumber;
            }

            /**
             * Sets the value of the valueBucketNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setValueBucketNumber(BigInteger value) {
                this.valueBucketNumber = value;
            }

        }

    }

}
