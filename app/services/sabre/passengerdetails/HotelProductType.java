
package services.sabre.passengerdetails;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HotelProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelProductType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.sabre.com/sp/pd/v3_2}HotelType">
 *       &lt;sequence>
 *         &lt;element name="RateDescription" type="{http://services.sabre.com/sp/pd/v3_2}MultilineTextType" minOccurs="0"/>
 *         &lt;element name="HotelPolicy" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DepositPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GuaranteePolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LateArrivalPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CancellationPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AdditionalPolicy" type="{http://services.sabre.com/sp/pd/v3_2}MultilineTextType" minOccurs="0"/>
 *                   &lt;element name="CheckInCheckOutPolicy" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}time" />
 *                           &lt;attribute name="CheckOut" type="{http://www.w3.org/2001/XMLSchema}time" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SupplementalInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelProductType", propOrder = {
    "rateDescription",
    "hotelPolicy",
    "supplementalInformation"
})
public class HotelProductType
    extends HotelType
{

    @XmlElement(name = "RateDescription")
    protected MultilineTextType rateDescription;
    @XmlElement(name = "HotelPolicy")
    protected HotelPolicy hotelPolicy;
    @XmlElement(name = "SupplementalInformation")
    protected String supplementalInformation;

    /**
     * Gets the value of the rateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilineTextType }
     *     
     */
    public MultilineTextType getRateDescription() {
        return rateDescription;
    }

    /**
     * Sets the value of the rateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilineTextType }
     *     
     */
    public void setRateDescription(MultilineTextType value) {
        this.rateDescription = value;
    }

    /**
     * Gets the value of the hotelPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link HotelPolicy }
     *     
     */
    public HotelPolicy getHotelPolicy() {
        return hotelPolicy;
    }

    /**
     * Sets the value of the hotelPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelPolicy }
     *     
     */
    public void setHotelPolicy(HotelPolicy value) {
        this.hotelPolicy = value;
    }

    /**
     * Gets the value of the supplementalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplementalInformation() {
        return supplementalInformation;
    }

    /**
     * Sets the value of the supplementalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplementalInformation(String value) {
        this.supplementalInformation = value;
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
     *         &lt;element name="DepositPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GuaranteePolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LateArrivalPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CancellationPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AdditionalPolicy" type="{http://services.sabre.com/sp/pd/v3_2}MultilineTextType" minOccurs="0"/>
     *         &lt;element name="CheckInCheckOutPolicy" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}time" />
     *                 &lt;attribute name="CheckOut" type="{http://www.w3.org/2001/XMLSchema}time" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
        "depositPolicy",
        "guaranteePolicy",
        "lateArrivalPolicy",
        "cancellationPolicy",
        "additionalPolicy",
        "checkInCheckOutPolicy"
    })
    public static class HotelPolicy {

        @XmlElement(name = "DepositPolicy")
        protected String depositPolicy;
        @XmlElement(name = "GuaranteePolicy")
        protected String guaranteePolicy;
        @XmlElement(name = "LateArrivalPolicy")
        protected String lateArrivalPolicy;
        @XmlElement(name = "CancellationPolicy")
        protected String cancellationPolicy;
        @XmlElement(name = "AdditionalPolicy")
        protected MultilineTextType additionalPolicy;
        @XmlElement(name = "CheckInCheckOutPolicy")
        protected CheckInCheckOutPolicy checkInCheckOutPolicy;

        /**
         * Gets the value of the depositPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepositPolicy() {
            return depositPolicy;
        }

        /**
         * Sets the value of the depositPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepositPolicy(String value) {
            this.depositPolicy = value;
        }

        /**
         * Gets the value of the guaranteePolicy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuaranteePolicy() {
            return guaranteePolicy;
        }

        /**
         * Sets the value of the guaranteePolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuaranteePolicy(String value) {
            this.guaranteePolicy = value;
        }

        /**
         * Gets the value of the lateArrivalPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLateArrivalPolicy() {
            return lateArrivalPolicy;
        }

        /**
         * Sets the value of the lateArrivalPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLateArrivalPolicy(String value) {
            this.lateArrivalPolicy = value;
        }

        /**
         * Gets the value of the cancellationPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCancellationPolicy() {
            return cancellationPolicy;
        }

        /**
         * Sets the value of the cancellationPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCancellationPolicy(String value) {
            this.cancellationPolicy = value;
        }

        /**
         * Gets the value of the additionalPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link MultilineTextType }
         *     
         */
        public MultilineTextType getAdditionalPolicy() {
            return additionalPolicy;
        }

        /**
         * Sets the value of the additionalPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link MultilineTextType }
         *     
         */
        public void setAdditionalPolicy(MultilineTextType value) {
            this.additionalPolicy = value;
        }

        /**
         * Gets the value of the checkInCheckOutPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link CheckInCheckOutPolicy }
         *     
         */
        public CheckInCheckOutPolicy getCheckInCheckOutPolicy() {
            return checkInCheckOutPolicy;
        }

        /**
         * Sets the value of the checkInCheckOutPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link CheckInCheckOutPolicy }
         *     
         */
        public void setCheckInCheckOutPolicy(CheckInCheckOutPolicy value) {
            this.checkInCheckOutPolicy = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}time" />
         *       &lt;attribute name="CheckOut" type="{http://www.w3.org/2001/XMLSchema}time" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class CheckInCheckOutPolicy {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "CheckIn")
            @XmlSchemaType(name = "time")
            protected XMLGregorianCalendar checkIn;
            @XmlAttribute(name = "CheckOut")
            @XmlSchemaType(name = "time")
            protected XMLGregorianCalendar checkOut;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the checkIn property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCheckIn() {
                return checkIn;
            }

            /**
             * Sets the value of the checkIn property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCheckIn(XMLGregorianCalendar value) {
                this.checkIn = value;
            }

            /**
             * Gets the value of the checkOut property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCheckOut() {
                return checkOut;
            }

            /**
             * Sets the value of the checkOut property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCheckOut(XMLGregorianCalendar value) {
                this.checkOut = value;
            }

        }

    }

}
