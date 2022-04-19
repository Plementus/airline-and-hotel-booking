
package services.sabre.bfm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlexibleFaresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlexibleFaresType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareParameters" maxOccurs="10">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ExcludeRestricted" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ResTicketing" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MinMaxStay" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RefundPenalty" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PublicFare" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PrivateFare" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Cabin" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PassengerType" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" use="required">
 *                             &lt;simpleType>
 *                               &lt;union memberTypes=" {http://www.opentravel.org/OTA/2003/05}StringLength1to8 {http://www.opentravel.org/OTA/2003/05}OTA_CodeType">
 *                               &lt;/union>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;choice maxOccurs="unbounded">
 *                     &lt;element name="CorporateID" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}CorporateIDType" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="AccountCode" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to20" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
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
@XmlType(name = "FlexibleFaresType", propOrder = {
    "fareParameters"
})
public class FlexibleFaresType {

    @XmlElement(name = "FareParameters", required = true)
    protected List<FareParameters> fareParameters;

    /**
     * Gets the value of the fareParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareParameters }
     * 
     * 
     */
    public List<FareParameters> getFareParameters() {
        if (fareParameters == null) {
            fareParameters = new ArrayList<FareParameters>();
        }
        return this.fareParameters;
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
     *         &lt;element name="ExcludeRestricted" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ResTicketing" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MinMaxStay" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RefundPenalty" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PublicFare" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PrivateFare" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Cabin" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PassengerType" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" use="required">
     *                   &lt;simpleType>
     *                     &lt;union memberTypes=" {http://www.opentravel.org/OTA/2003/05}StringLength1to8 {http://www.opentravel.org/OTA/2003/05}OTA_CodeType">
     *                     &lt;/union>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;choice maxOccurs="unbounded">
     *           &lt;element name="CorporateID" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}CorporateIDType" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="AccountCode" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to20" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
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
        "excludeRestricted",
        "resTicketing",
        "minMaxStay",
        "refundPenalty",
        "publicFare",
        "privateFare",
        "cabin",
        "passengerType",
        "corporateIDOrAccountCode"
    })
    public static class FareParameters {

        @XmlElement(name = "ExcludeRestricted")
        protected ExcludeRestricted excludeRestricted;
        @XmlElement(name = "ResTicketing")
        protected ResTicketing resTicketing;
        @XmlElement(name = "MinMaxStay")
        protected MinMaxStay minMaxStay;
        @XmlElement(name = "RefundPenalty")
        protected RefundPenalty refundPenalty;
        @XmlElement(name = "PublicFare")
        protected PublicFare publicFare;
        @XmlElement(name = "PrivateFare")
        protected PrivateFare privateFare;
        @XmlElement(name = "Cabin")
        protected Cabin cabin;
        @XmlElement(name = "PassengerType")
        protected PassengerType passengerType;
        @XmlElements({
            @XmlElement(name = "CorporateID", type = CorporateID.class),
            @XmlElement(name = "AccountCode", type = AccountCode.class)
        })
        protected List<Object> corporateIDOrAccountCode;

        /**
         * Gets the value of the excludeRestricted property.
         * 
         * @return
         *     possible object is
         *     {@link ExcludeRestricted }
         *     
         */
        public ExcludeRestricted getExcludeRestricted() {
            return excludeRestricted;
        }

        /**
         * Sets the value of the excludeRestricted property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExcludeRestricted }
         *     
         */
        public void setExcludeRestricted(ExcludeRestricted value) {
            this.excludeRestricted = value;
        }

        /**
         * Gets the value of the resTicketing property.
         * 
         * @return
         *     possible object is
         *     {@link ResTicketing }
         *     
         */
        public ResTicketing getResTicketing() {
            return resTicketing;
        }

        /**
         * Sets the value of the resTicketing property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResTicketing }
         *     
         */
        public void setResTicketing(ResTicketing value) {
            this.resTicketing = value;
        }

        /**
         * Gets the value of the minMaxStay property.
         * 
         * @return
         *     possible object is
         *     {@link MinMaxStay }
         *     
         */
        public MinMaxStay getMinMaxStay() {
            return minMaxStay;
        }

        /**
         * Sets the value of the minMaxStay property.
         * 
         * @param value
         *     allowed object is
         *     {@link MinMaxStay }
         *     
         */
        public void setMinMaxStay(MinMaxStay value) {
            this.minMaxStay = value;
        }

        /**
         * Gets the value of the refundPenalty property.
         * 
         * @return
         *     possible object is
         *     {@link RefundPenalty }
         *     
         */
        public RefundPenalty getRefundPenalty() {
            return refundPenalty;
        }

        /**
         * Sets the value of the refundPenalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link RefundPenalty }
         *     
         */
        public void setRefundPenalty(RefundPenalty value) {
            this.refundPenalty = value;
        }

        /**
         * Gets the value of the publicFare property.
         * 
         * @return
         *     possible object is
         *     {@link PublicFare }
         *     
         */
        public PublicFare getPublicFare() {
            return publicFare;
        }

        /**
         * Sets the value of the publicFare property.
         * 
         * @param value
         *     allowed object is
         *     {@link PublicFare }
         *     
         */
        public void setPublicFare(PublicFare value) {
            this.publicFare = value;
        }

        /**
         * Gets the value of the privateFare property.
         * 
         * @return
         *     possible object is
         *     {@link PrivateFare }
         *     
         */
        public PrivateFare getPrivateFare() {
            return privateFare;
        }

        /**
         * Sets the value of the privateFare property.
         * 
         * @param value
         *     allowed object is
         *     {@link PrivateFare }
         *     
         */
        public void setPrivateFare(PrivateFare value) {
            this.privateFare = value;
        }

        /**
         * Gets the value of the cabin property.
         * 
         * @return
         *     possible object is
         *     {@link Cabin }
         *     
         */
        public Cabin getCabin() {
            return cabin;
        }

        /**
         * Sets the value of the cabin property.
         * 
         * @param value
         *     allowed object is
         *     {@link Cabin }
         *     
         */
        public void setCabin(Cabin value) {
            this.cabin = value;
        }

        /**
         * Gets the value of the passengerType property.
         * 
         * @return
         *     possible object is
         *     {@link PassengerType }
         *     
         */
        public PassengerType getPassengerType() {
            return passengerType;
        }

        /**
         * Sets the value of the passengerType property.
         * 
         * @param value
         *     allowed object is
         *     {@link PassengerType }
         *     
         */
        public void setPassengerType(PassengerType value) {
            this.passengerType = value;
        }

        /**
         * Gets the value of the corporateIDOrAccountCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the corporateIDOrAccountCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCorporateIDOrAccountCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CorporateID }
         * {@link AccountCode }
         * 
         * 
         */
        public List<Object> getCorporateIDOrAccountCode() {
            if (corporateIDOrAccountCode == null) {
                corporateIDOrAccountCode = new ArrayList<Object>();
            }
            return this.corporateIDOrAccountCode;
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
         *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to20" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AccountCode {

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
         *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Cabin {

            @XmlAttribute(name = "Type", required = true)
            protected CabinType type;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link CabinType }
             *     
             */
            public CabinType getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link CabinType }
             *     
             */
            public void setType(CabinType value) {
                this.type = value;
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
         *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}CorporateIDType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CorporateID {

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
         *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ExcludeRestricted {

            @XmlAttribute(name = "Ind", required = true)
            protected boolean ind;

            /**
             * Gets the value of the ind property.
             * 
             */
            public boolean isInd() {
                return ind;
            }

            /**
             * Sets the value of the ind property.
             * 
             */
            public void setInd(boolean value) {
                this.ind = value;
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
         *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MinMaxStay {

            @XmlAttribute(name = "Ind", required = true)
            protected boolean ind;

            /**
             * Gets the value of the ind property.
             * 
             */
            public boolean isInd() {
                return ind;
            }

            /**
             * Sets the value of the ind property.
             * 
             */
            public void setInd(boolean value) {
                this.ind = value;
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
         *       &lt;attribute name="Code" use="required">
         *         &lt;simpleType>
         *           &lt;union memberTypes=" {http://www.opentravel.org/OTA/2003/05}StringLength1to8 {http://www.opentravel.org/OTA/2003/05}OTA_CodeType">
         *           &lt;/union>
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
        public static class PassengerType {

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
         *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PrivateFare {

            @XmlAttribute(name = "Ind", required = true)
            protected boolean ind;

            /**
             * Gets the value of the ind property.
             * 
             */
            public boolean isInd() {
                return ind;
            }

            /**
             * Sets the value of the ind property.
             * 
             */
            public void setInd(boolean value) {
                this.ind = value;
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
         *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PublicFare {

            @XmlAttribute(name = "Ind", required = true)
            protected boolean ind;

            /**
             * Gets the value of the ind property.
             * 
             */
            public boolean isInd() {
                return ind;
            }

            /**
             * Sets the value of the ind property.
             * 
             */
            public void setInd(boolean value) {
                this.ind = value;
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
         *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RefundPenalty {

            @XmlAttribute(name = "Ind", required = true)
            protected boolean ind;

            /**
             * Gets the value of the ind property.
             * 
             */
            public boolean isInd() {
                return ind;
            }

            /**
             * Sets the value of the ind property.
             * 
             */
            public void setInd(boolean value) {
                this.ind = value;
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
         *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ResTicketing {

            @XmlAttribute(name = "Ind", required = true)
            protected boolean ind;

            /**
             * Gets the value of the ind property.
             * 
             */
            public boolean isInd() {
                return ind;
            }

            /**
             * Sets the value of the ind property.
             * 
             */
            public void setInd(boolean value) {
                this.ind = value;
            }

        }

    }

}
