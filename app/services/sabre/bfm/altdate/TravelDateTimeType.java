
package services.sabre.bfm.altdate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Date and time of trip, that allows specifying a time window before and after the given date.
 * 
 * <p>Java class for TravelDateTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelDateTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="DepartureDateTime" type="{http://www.opentravel.org/OTA/2003/05}IntDateTime"/>
 *           &lt;element name="ArrivalDateTime" type="{http://www.opentravel.org/OTA/2003/05}IntDateTime"/>
 *           &lt;element name="DepartureDates">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice maxOccurs="unbounded">
 *                     &lt;group ref="{http://www.opentravel.org/OTA/2003/05}MultipleDatesGroup"/>
 *                     &lt;choice maxOccurs="unbounded">
 *                       &lt;element name="LengthOfStay">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;attribute name="Days" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="LengthOfStayRange">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;attribute name="MinDays" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                               &lt;attribute name="MaxDays" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/choice>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="DepartureWindow" type="{http://www.opentravel.org/OTA/2003/05}TimeWindowType" minOccurs="0"/>
 *         &lt;element name="ArrivalWindow" type="{http://www.opentravel.org/OTA/2003/05}TimeWindowType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelDateTimeType", propOrder = {
    "departureDateTime",
    "arrivalDateTime",
    "departureDates",
    "departureWindow",
    "arrivalWindow"
})
@XmlSeeAlso({
    OriginDestinationInformationType.class
})
public class TravelDateTimeType {

    @XmlElement(name = "DepartureDateTime")
    protected String departureDateTime;
    @XmlElement(name = "ArrivalDateTime")
    protected String arrivalDateTime;
    @XmlElement(name = "DepartureDates")
    protected DepartureDates departureDates;
    @XmlElement(name = "DepartureWindow")
    protected String departureWindow;
    @XmlElement(name = "ArrivalWindow")
    protected String arrivalWindow;

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

    /**
     * Gets the value of the arrivalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * Sets the value of the arrivalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalDateTime(String value) {
        this.arrivalDateTime = value;
    }

    /**
     * Gets the value of the departureDates property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureDates }
     *     
     */
    public DepartureDates getDepartureDates() {
        return departureDates;
    }

    /**
     * Sets the value of the departureDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureDates }
     *     
     */
    public void setDepartureDates(DepartureDates value) {
        this.departureDates = value;
    }

    /**
     * Gets the value of the departureWindow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureWindow() {
        return departureWindow;
    }

    /**
     * Sets the value of the departureWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureWindow(String value) {
        this.departureWindow = value;
    }

    /**
     * Gets the value of the arrivalWindow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalWindow() {
        return arrivalWindow;
    }

    /**
     * Sets the value of the arrivalWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalWindow(String value) {
        this.arrivalWindow = value;
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
     *       &lt;choice maxOccurs="unbounded">
     *         &lt;group ref="{http://www.opentravel.org/OTA/2003/05}MultipleDatesGroup"/>
     *         &lt;choice maxOccurs="unbounded">
     *           &lt;element name="LengthOfStay">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="Days" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="LengthOfStayRange">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="MinDays" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                   &lt;attribute name="MaxDays" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dayOrDaysRangeOrLengthOfStay"
    })
    public static class DepartureDates {

        @XmlElements({
            @XmlElement(name = "Day", type = Day.class),
            @XmlElement(name = "DaysRange", type = DaysRange.class),
            @XmlElement(name = "LengthOfStay", type = LengthOfStay.class),
            @XmlElement(name = "LengthOfStayRange", type = LengthOfStayRange.class)
        })
        protected List<Object> dayOrDaysRangeOrLengthOfStay;

        /**
         * Gets the value of the dayOrDaysRangeOrLengthOfStay property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dayOrDaysRangeOrLengthOfStay property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDayOrDaysRangeOrLengthOfStay().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Day }
         * {@link DaysRange }
         * {@link LengthOfStay }
         * {@link LengthOfStayRange }
         * 
         * 
         */
        public List<Object> getDayOrDaysRangeOrLengthOfStay() {
            if (dayOrDaysRangeOrLengthOfStay == null) {
                dayOrDaysRangeOrLengthOfStay = new ArrayList<Object>();
            }
            return this.dayOrDaysRangeOrLengthOfStay;
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
         *       &lt;attribute name="Date" use="required" type="{http://www.opentravel.org/OTA/2003/05}ISellDateType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Day {

            @XmlAttribute(name = "Date", required = true)
            protected String date;

            /**
             * Gets the value of the date property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDate() {
                return date;
            }

            /**
             * Sets the value of the date property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDate(String value) {
                this.date = value;
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
         *       &lt;attribute name="FromDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}ISellDateType" />
         *       &lt;attribute name="ToDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}ISellDateType" />
         *       &lt;attribute name="WeekDays" type="{http://www.opentravel.org/OTA/2003/05}ISellWeekDaysType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DaysRange {

            @XmlAttribute(name = "FromDate", required = true)
            protected String fromDate;
            @XmlAttribute(name = "ToDate", required = true)
            protected String toDate;
            @XmlAttribute(name = "WeekDays")
            protected String weekDays;

            /**
             * Gets the value of the fromDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFromDate() {
                return fromDate;
            }

            /**
             * Sets the value of the fromDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFromDate(String value) {
                this.fromDate = value;
            }

            /**
             * Gets the value of the toDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getToDate() {
                return toDate;
            }

            /**
             * Sets the value of the toDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setToDate(String value) {
                this.toDate = value;
            }

            /**
             * Gets the value of the weekDays property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWeekDays() {
                return weekDays;
            }

            /**
             * Sets the value of the weekDays property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWeekDays(String value) {
                this.weekDays = value;
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
         *       &lt;attribute name="Days" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LengthOfStay {

            @XmlAttribute(name = "Days", required = true)
            @XmlSchemaType(name = "unsignedShort")
            protected int days;

            /**
             * Gets the value of the days property.
             * 
             */
            public int getDays() {
                return days;
            }

            /**
             * Sets the value of the days property.
             * 
             */
            public void setDays(int value) {
                this.days = value;
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
         *       &lt;attribute name="MinDays" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *       &lt;attribute name="MaxDays" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LengthOfStayRange {

            @XmlAttribute(name = "MinDays", required = true)
            @XmlSchemaType(name = "unsignedShort")
            protected int minDays;
            @XmlAttribute(name = "MaxDays", required = true)
            @XmlSchemaType(name = "unsignedShort")
            protected int maxDays;

            /**
             * Gets the value of the minDays property.
             * 
             */
            public int getMinDays() {
                return minDays;
            }

            /**
             * Sets the value of the minDays property.
             * 
             */
            public void setMinDays(int value) {
                this.minDays = value;
            }

            /**
             * Gets the value of the maxDays property.
             * 
             */
            public int getMaxDays() {
                return maxDays;
            }

            /**
             * Sets the value of the maxDays property.
             * 
             */
            public void setMaxDays(int value) {
                this.maxDays = value;
            }

        }

    }

}
