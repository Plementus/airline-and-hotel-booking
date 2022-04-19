
package services.sabre.bfm.sapt;

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
 * <p>Java class for ExchangeOriginDestinationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeOriginDestinationInformationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OriginDestinationInformationType">
 *       &lt;sequence>
 *         &lt;element name="Flight" type="{http://www.opentravel.org/OTA/2003/05}ExchangeOriginDestinationFlightType" maxOccurs="unbounded"/>
 *         &lt;group ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationInformationTPA_ExtensionsGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeOriginDestinationInformationType", propOrder = {
    "flight",
    "dateFlexibility",
    "sisterDestinationLocation",
    "sisterDestinationMileage",
    "sisterOriginLocation",
    "sisterOriginMileage",
    "segmentType",
    "alternateTime",
    "maxOneWayOptions",
    "numOneWayOptions",
    "cabinPref",
    "connectionTime",
    "totalTravelTime"
})
public class ExchangeOriginDestinationInformationType
    extends OriginDestinationInformationType
{

    @XmlElement(name = "Flight", required = true)
    protected List<ExchangeOriginDestinationFlightType> flight;
    @XmlElement(name = "DateFlexibility")
    protected List<DateFlexibility> dateFlexibility;
    @XmlElement(name = "SisterDestinationLocation")
    protected List<RequestLocationType> sisterDestinationLocation;
    @XmlElement(name = "SisterDestinationMileage")
    protected SisterDestinationMileage sisterDestinationMileage;
    @XmlElement(name = "SisterOriginLocation")
    protected List<RequestLocationType> sisterOriginLocation;
    @XmlElement(name = "SisterOriginMileage")
    protected SisterOriginMileage sisterOriginMileage;
    @XmlElement(name = "SegmentType")
    protected SegmentType segmentType;
    @XmlElement(name = "AlternateTime")
    protected AlternateTime alternateTime;
    @XmlElement(name = "MaxOneWayOptions")
    protected MaxOneWayOptions maxOneWayOptions;
    @XmlElement(name = "NumOneWayOptions")
    protected NumOneWayOptions numOneWayOptions;
    @XmlElement(name = "CabinPref")
    protected CabinPrefType cabinPref;
    @XmlElement(name = "ConnectionTime")
    protected ConnectionTime connectionTime;
    @XmlElement(name = "TotalTravelTime")
    protected TotalTravelTime totalTravelTime;

    /**
     * Gets the value of the flight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeOriginDestinationFlightType }
     * 
     * 
     */
    public List<ExchangeOriginDestinationFlightType> getFlight() {
        if (flight == null) {
            flight = new ArrayList<ExchangeOriginDestinationFlightType>();
        }
        return this.flight;
    }

    /**
     * Gets the value of the dateFlexibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateFlexibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateFlexibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateFlexibility }
     * 
     * 
     */
    public List<DateFlexibility> getDateFlexibility() {
        if (dateFlexibility == null) {
            dateFlexibility = new ArrayList<DateFlexibility>();
        }
        return this.dateFlexibility;
    }

    /**
     * Gets the value of the sisterDestinationLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sisterDestinationLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSisterDestinationLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestLocationType }
     * 
     * 
     */
    public List<RequestLocationType> getSisterDestinationLocation() {
        if (sisterDestinationLocation == null) {
            sisterDestinationLocation = new ArrayList<RequestLocationType>();
        }
        return this.sisterDestinationLocation;
    }

    /**
     * Gets the value of the sisterDestinationMileage property.
     * 
     * @return
     *     possible object is
     *     {@link SisterDestinationMileage }
     *     
     */
    public SisterDestinationMileage getSisterDestinationMileage() {
        return sisterDestinationMileage;
    }

    /**
     * Sets the value of the sisterDestinationMileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SisterDestinationMileage }
     *     
     */
    public void setSisterDestinationMileage(SisterDestinationMileage value) {
        this.sisterDestinationMileage = value;
    }

    /**
     * Gets the value of the sisterOriginLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sisterOriginLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSisterOriginLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestLocationType }
     * 
     * 
     */
    public List<RequestLocationType> getSisterOriginLocation() {
        if (sisterOriginLocation == null) {
            sisterOriginLocation = new ArrayList<RequestLocationType>();
        }
        return this.sisterOriginLocation;
    }

    /**
     * Gets the value of the sisterOriginMileage property.
     * 
     * @return
     *     possible object is
     *     {@link SisterOriginMileage }
     *     
     */
    public SisterOriginMileage getSisterOriginMileage() {
        return sisterOriginMileage;
    }

    /**
     * Sets the value of the sisterOriginMileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SisterOriginMileage }
     *     
     */
    public void setSisterOriginMileage(SisterOriginMileage value) {
        this.sisterOriginMileage = value;
    }

    /**
     * Gets the value of the segmentType property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentType }
     *     
     */
    public SegmentType getSegmentType() {
        return segmentType;
    }

    /**
     * Sets the value of the segmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentType }
     *     
     */
    public void setSegmentType(SegmentType value) {
        this.segmentType = value;
    }

    /**
     * Gets the value of the alternateTime property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateTime }
     *     
     */
    public AlternateTime getAlternateTime() {
        return alternateTime;
    }

    /**
     * Sets the value of the alternateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateTime }
     *     
     */
    public void setAlternateTime(AlternateTime value) {
        this.alternateTime = value;
    }

    /**
     * Gets the value of the maxOneWayOptions property.
     * 
     * @return
     *     possible object is
     *     {@link MaxOneWayOptions }
     *     
     */
    public MaxOneWayOptions getMaxOneWayOptions() {
        return maxOneWayOptions;
    }

    /**
     * Sets the value of the maxOneWayOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxOneWayOptions }
     *     
     */
    public void setMaxOneWayOptions(MaxOneWayOptions value) {
        this.maxOneWayOptions = value;
    }

    /**
     * Gets the value of the numOneWayOptions property.
     * 
     * @return
     *     possible object is
     *     {@link NumOneWayOptions }
     *     
     */
    public NumOneWayOptions getNumOneWayOptions() {
        return numOneWayOptions;
    }

    /**
     * Sets the value of the numOneWayOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumOneWayOptions }
     *     
     */
    public void setNumOneWayOptions(NumOneWayOptions value) {
        this.numOneWayOptions = value;
    }

    /**
     * Gets the value of the cabinPref property.
     * 
     * @return
     *     possible object is
     *     {@link CabinPrefType }
     *     
     */
    public CabinPrefType getCabinPref() {
        return cabinPref;
    }

    /**
     * Sets the value of the cabinPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinPrefType }
     *     
     */
    public void setCabinPref(CabinPrefType value) {
        this.cabinPref = value;
    }

    /**
     * Gets the value of the connectionTime property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionTime }
     *     
     */
    public ConnectionTime getConnectionTime() {
        return connectionTime;
    }

    /**
     * Sets the value of the connectionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionTime }
     *     
     */
    public void setConnectionTime(ConnectionTime value) {
        this.connectionTime = value;
    }

    /**
     * Gets the value of the totalTravelTime property.
     * 
     * @return
     *     possible object is
     *     {@link TotalTravelTime }
     *     
     */
    public TotalTravelTime getTotalTravelTime() {
        return totalTravelTime;
    }

    /**
     * Sets the value of the totalTravelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalTravelTime }
     *     
     */
    public void setTotalTravelTime(TotalTravelTime value) {
        this.totalTravelTime = value;
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
     *       &lt;attribute name="PlusMinus" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to9" />
     *       &lt;attribute name="Minus" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to72" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AlternateTime {

        @XmlAttribute(name = "PlusMinus")
        protected Integer plusMinus;
        @XmlAttribute(name = "Minus")
        protected Integer minus;

        /**
         * Gets the value of the plusMinus property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPlusMinus() {
            return plusMinus;
        }

        /**
         * Sets the value of the plusMinus property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPlusMinus(Integer value) {
            this.plusMinus = value;
        }

        /**
         * Gets the value of the minus property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMinus() {
            return minus;
        }

        /**
         * Sets the value of the minus property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMinus(Integer value) {
            this.minus = value;
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
     *       &lt;attribute name="Min" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="Max" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="ExcludedConnectionBegin" type="{http://www.opentravel.org/OTA/2003/05}TimeWindowBoundaryType" />
     *       &lt;attribute name="ExcludedConnectionEnd" type="{http://www.opentravel.org/OTA/2003/05}TimeWindowBoundaryType" />
     *       &lt;attribute name="EnableExcludedConnection" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ConnectionTime {

        @XmlAttribute(name = "Min")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger min;
        @XmlAttribute(name = "Max")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger max;
        @XmlAttribute(name = "ExcludedConnectionBegin")
        protected String excludedConnectionBegin;
        @XmlAttribute(name = "ExcludedConnectionEnd")
        protected String excludedConnectionEnd;
        @XmlAttribute(name = "EnableExcludedConnection")
        protected Boolean enableExcludedConnection;

        /**
         * Gets the value of the min property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMin() {
            return min;
        }

        /**
         * Sets the value of the min property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMin(BigInteger value) {
            this.min = value;
        }

        /**
         * Gets the value of the max property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMax() {
            return max;
        }

        /**
         * Sets the value of the max property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMax(BigInteger value) {
            this.max = value;
        }

        /**
         * Gets the value of the excludedConnectionBegin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExcludedConnectionBegin() {
            return excludedConnectionBegin;
        }

        /**
         * Sets the value of the excludedConnectionBegin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExcludedConnectionBegin(String value) {
            this.excludedConnectionBegin = value;
        }

        /**
         * Gets the value of the excludedConnectionEnd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExcludedConnectionEnd() {
            return excludedConnectionEnd;
        }

        /**
         * Sets the value of the excludedConnectionEnd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExcludedConnectionEnd(String value) {
            this.excludedConnectionEnd = value;
        }

        /**
         * Gets the value of the enableExcludedConnection property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isEnableExcludedConnection() {
            return enableExcludedConnection;
        }

        /**
         * Sets the value of the enableExcludedConnection property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setEnableExcludedConnection(Boolean value) {
            this.enableExcludedConnection = value;
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
     *       &lt;attribute name="NbrOfDays" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="Plus" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="Minus" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="Validate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DateFlexibility {

        @XmlAttribute(name = "NbrOfDays")
        protected Integer nbrOfDays;
        @XmlAttribute(name = "Plus")
        protected Integer plus;
        @XmlAttribute(name = "Minus")
        protected Integer minus;
        @XmlAttribute(name = "Validate")
        protected Boolean validate;

        /**
         * Gets the value of the nbrOfDays property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getNbrOfDays() {
            return nbrOfDays;
        }

        /**
         * Sets the value of the nbrOfDays property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setNbrOfDays(Integer value) {
            this.nbrOfDays = value;
        }

        /**
         * Gets the value of the plus property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPlus() {
            return plus;
        }

        /**
         * Sets the value of the plus property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPlus(Integer value) {
            this.plus = value;
        }

        /**
         * Gets the value of the minus property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMinus() {
            return minus;
        }

        /**
         * Sets the value of the minus property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMinus(Integer value) {
            this.minus = value;
        }

        /**
         * Gets the value of the validate property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isValidate() {
            return validate;
        }

        /**
         * Sets the value of the validate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setValidate(Boolean value) {
            this.validate = value;
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
     *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MaxOneWayOptions {

        @XmlAttribute(name = "Value", required = true)
        @XmlSchemaType(name = "unsignedShort")
        protected int value;

        /**
         * Gets the value of the value property.
         * 
         */
        public int getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(int value) {
            this.value = value;
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
     *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NumOneWayOptions {

        @XmlAttribute(name = "Number", required = true)
        @XmlSchemaType(name = "unsignedShort")
        protected int number;

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
     *       &lt;attribute name="Code">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="ARUNK"/>
     *             &lt;enumeration value="O"/>
     *             &lt;enumeration value="X"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SegmentType {

        @XmlAttribute(name = "Code")
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
     *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SisterDestinationMileage {

        @XmlAttribute(name = "Number", required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger number;

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumber(BigInteger value) {
            this.number = value;
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
     *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SisterOriginMileage {

        @XmlAttribute(name = "Number", required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger number;

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumber(BigInteger value) {
            this.number = value;
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
     *       &lt;attribute name="Min" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *       &lt;attribute name="Max" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TotalTravelTime {

        @XmlAttribute(name = "Min")
        @XmlSchemaType(name = "unsignedInt")
        protected Long min;
        @XmlAttribute(name = "Max")
        @XmlSchemaType(name = "unsignedInt")
        protected Long max;

        /**
         * Gets the value of the min property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getMin() {
            return min;
        }

        /**
         * Sets the value of the min property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setMin(Long value) {
            this.min = value;
        }

        /**
         * Gets the value of the max property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getMax() {
            return max;
        }

        /**
         * Sets the value of the max property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setMax(Long value) {
            this.max = value;
        }

    }

}
