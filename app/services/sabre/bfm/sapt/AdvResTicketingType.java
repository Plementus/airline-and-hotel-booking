
package services.sabre.bfm.sapt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Container used to hold information regarding advance reservation and/or advance ticketing.
 * 
 * <p>Java class for AdvResTicketingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvResTicketingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="AdvReservation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="LatestTimeOfDay" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                 &lt;attribute name="LatestPeriod" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
 *                 &lt;attribute name="LatestUnit" type="{http://www.opentravel.org/OTA/2003/05}StayUnitType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdvTicketing" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="FromResTimeOfDay" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                 &lt;attribute name="FromResPeriod" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
 *                 &lt;attribute name="FromResUnit" type="{http://www.opentravel.org/OTA/2003/05}StayUnitType" />
 *                 &lt;attribute name="FromDepartTimeOfDay" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                 &lt;attribute name="FromDepartPeriod" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
 *                 &lt;attribute name="FromDepartUnit" type="{http://www.opentravel.org/OTA/2003/05}StayUnitType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="AdvResInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AdvTicketingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvResTicketingType", propOrder = {
    "advReservation",
    "advTicketing"
})
public class AdvResTicketingType {

    @XmlElement(name = "AdvReservation")
    protected AdvReservation advReservation;
    @XmlElement(name = "AdvTicketing")
    protected AdvTicketing advTicketing;
    @XmlAttribute(name = "AdvResInd")
    protected Boolean advResInd;
    @XmlAttribute(name = "AdvTicketingInd")
    protected Boolean advTicketingInd;

    /**
     * Gets the value of the advReservation property.
     * 
     * @return
     *     possible object is
     *     {@link AdvReservation }
     *     
     */
    public AdvReservation getAdvReservation() {
        return advReservation;
    }

    /**
     * Sets the value of the advReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvReservation }
     *     
     */
    public void setAdvReservation(AdvReservation value) {
        this.advReservation = value;
    }

    /**
     * Gets the value of the advTicketing property.
     * 
     * @return
     *     possible object is
     *     {@link AdvTicketing }
     *     
     */
    public AdvTicketing getAdvTicketing() {
        return advTicketing;
    }

    /**
     * Sets the value of the advTicketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvTicketing }
     *     
     */
    public void setAdvTicketing(AdvTicketing value) {
        this.advTicketing = value;
    }

    /**
     * Gets the value of the advResInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvResInd() {
        return advResInd;
    }

    /**
     * Sets the value of the advResInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvResInd(Boolean value) {
        this.advResInd = value;
    }

    /**
     * Gets the value of the advTicketingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTicketingInd() {
        return advTicketingInd;
    }

    /**
     * Sets the value of the advTicketingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvTicketingInd(Boolean value) {
        this.advTicketingInd = value;
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
     *       &lt;attribute name="LatestTimeOfDay" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *       &lt;attribute name="LatestPeriod" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
     *       &lt;attribute name="LatestUnit" type="{http://www.opentravel.org/OTA/2003/05}StayUnitType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AdvReservation {

        @XmlAttribute(name = "LatestTimeOfDay")
        protected String latestTimeOfDay;
        @XmlAttribute(name = "LatestPeriod")
        protected String latestPeriod;
        @XmlAttribute(name = "LatestUnit")
        protected StayUnitType latestUnit;

        /**
         * Gets the value of the latestTimeOfDay property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatestTimeOfDay() {
            return latestTimeOfDay;
        }

        /**
         * Sets the value of the latestTimeOfDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatestTimeOfDay(String value) {
            this.latestTimeOfDay = value;
        }

        /**
         * Gets the value of the latestPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatestPeriod() {
            return latestPeriod;
        }

        /**
         * Sets the value of the latestPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatestPeriod(String value) {
            this.latestPeriod = value;
        }

        /**
         * Gets the value of the latestUnit property.
         * 
         * @return
         *     possible object is
         *     {@link StayUnitType }
         *     
         */
        public StayUnitType getLatestUnit() {
            return latestUnit;
        }

        /**
         * Sets the value of the latestUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link StayUnitType }
         *     
         */
        public void setLatestUnit(StayUnitType value) {
            this.latestUnit = value;
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
     *       &lt;attribute name="FromResTimeOfDay" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *       &lt;attribute name="FromResPeriod" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
     *       &lt;attribute name="FromResUnit" type="{http://www.opentravel.org/OTA/2003/05}StayUnitType" />
     *       &lt;attribute name="FromDepartTimeOfDay" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *       &lt;attribute name="FromDepartPeriod" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
     *       &lt;attribute name="FromDepartUnit" type="{http://www.opentravel.org/OTA/2003/05}StayUnitType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AdvTicketing {

        @XmlAttribute(name = "FromResTimeOfDay")
        protected String fromResTimeOfDay;
        @XmlAttribute(name = "FromResPeriod")
        protected String fromResPeriod;
        @XmlAttribute(name = "FromResUnit")
        protected StayUnitType fromResUnit;
        @XmlAttribute(name = "FromDepartTimeOfDay")
        protected String fromDepartTimeOfDay;
        @XmlAttribute(name = "FromDepartPeriod")
        protected String fromDepartPeriod;
        @XmlAttribute(name = "FromDepartUnit")
        protected StayUnitType fromDepartUnit;

        /**
         * Gets the value of the fromResTimeOfDay property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFromResTimeOfDay() {
            return fromResTimeOfDay;
        }

        /**
         * Sets the value of the fromResTimeOfDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFromResTimeOfDay(String value) {
            this.fromResTimeOfDay = value;
        }

        /**
         * Gets the value of the fromResPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFromResPeriod() {
            return fromResPeriod;
        }

        /**
         * Sets the value of the fromResPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFromResPeriod(String value) {
            this.fromResPeriod = value;
        }

        /**
         * Gets the value of the fromResUnit property.
         * 
         * @return
         *     possible object is
         *     {@link StayUnitType }
         *     
         */
        public StayUnitType getFromResUnit() {
            return fromResUnit;
        }

        /**
         * Sets the value of the fromResUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link StayUnitType }
         *     
         */
        public void setFromResUnit(StayUnitType value) {
            this.fromResUnit = value;
        }

        /**
         * Gets the value of the fromDepartTimeOfDay property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFromDepartTimeOfDay() {
            return fromDepartTimeOfDay;
        }

        /**
         * Sets the value of the fromDepartTimeOfDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFromDepartTimeOfDay(String value) {
            this.fromDepartTimeOfDay = value;
        }

        /**
         * Gets the value of the fromDepartPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFromDepartPeriod() {
            return fromDepartPeriod;
        }

        /**
         * Sets the value of the fromDepartPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFromDepartPeriod(String value) {
            this.fromDepartPeriod = value;
        }

        /**
         * Gets the value of the fromDepartUnit property.
         * 
         * @return
         *     possible object is
         *     {@link StayUnitType }
         *     
         */
        public StayUnitType getFromDepartUnit() {
            return fromDepartUnit;
        }

        /**
         * Sets the value of the fromDepartUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link StayUnitType }
         *     
         */
        public void setFromDepartUnit(StayUnitType value) {
            this.fromDepartUnit = value;
        }

    }

}
