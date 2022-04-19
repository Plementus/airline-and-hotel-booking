
package services.sabre.bfm;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the data fields available for the reissue info type
 * 
 * <p>Java class for ReissueInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReissueInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangeFees" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ChangeFee">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                           &lt;attribute name="HighestChangeFee" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="ChangeFeeWaived" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="ChangeFeeNotApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
 *       &lt;attribute name="ResidualIdicator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TypeOfServiceFee" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TypeOfReissueTransaction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReissueResultFromTag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="FormOfRefund" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReissueRequiresElectronicTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ReissueDoesNotAllowElectronicTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TaxRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReissueInfoType", propOrder = {
    "changeFees"
})
public class ReissueInfoType {

    @XmlElement(name = "ChangeFees")
    protected ChangeFees changeFees;
    @XmlAttribute(name = "ResidualIdicator")
    protected String residualIdicator;
    @XmlAttribute(name = "TypeOfServiceFee")
    protected String typeOfServiceFee;
    @XmlAttribute(name = "TypeOfReissueTransaction")
    protected String typeOfReissueTransaction;
    @XmlAttribute(name = "ReissueResultFromTag")
    protected Boolean reissueResultFromTag;
    @XmlAttribute(name = "FormOfRefund")
    protected String formOfRefund;
    @XmlAttribute(name = "ReissueRequiresElectronicTicket")
    protected Boolean reissueRequiresElectronicTicket;
    @XmlAttribute(name = "ReissueDoesNotAllowElectronicTicket")
    protected Boolean reissueDoesNotAllowElectronicTicket;
    @XmlAttribute(name = "TaxRefundable")
    protected Boolean taxRefundable;

    /**
     * Gets the value of the changeFees property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeFees }
     *     
     */
    public ChangeFees getChangeFees() {
        return changeFees;
    }

    /**
     * Sets the value of the changeFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeFees }
     *     
     */
    public void setChangeFees(ChangeFees value) {
        this.changeFees = value;
    }

    /**
     * Gets the value of the residualIdicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidualIdicator() {
        return residualIdicator;
    }

    /**
     * Sets the value of the residualIdicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidualIdicator(String value) {
        this.residualIdicator = value;
    }

    /**
     * Gets the value of the typeOfServiceFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfServiceFee() {
        return typeOfServiceFee;
    }

    /**
     * Sets the value of the typeOfServiceFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfServiceFee(String value) {
        this.typeOfServiceFee = value;
    }

    /**
     * Gets the value of the typeOfReissueTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfReissueTransaction() {
        return typeOfReissueTransaction;
    }

    /**
     * Sets the value of the typeOfReissueTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfReissueTransaction(String value) {
        this.typeOfReissueTransaction = value;
    }

    /**
     * Gets the value of the reissueResultFromTag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReissueResultFromTag() {
        return reissueResultFromTag;
    }

    /**
     * Sets the value of the reissueResultFromTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReissueResultFromTag(Boolean value) {
        this.reissueResultFromTag = value;
    }

    /**
     * Gets the value of the formOfRefund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOfRefund() {
        return formOfRefund;
    }

    /**
     * Sets the value of the formOfRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOfRefund(String value) {
        this.formOfRefund = value;
    }

    /**
     * Gets the value of the reissueRequiresElectronicTicket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReissueRequiresElectronicTicket() {
        return reissueRequiresElectronicTicket;
    }

    /**
     * Sets the value of the reissueRequiresElectronicTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReissueRequiresElectronicTicket(Boolean value) {
        this.reissueRequiresElectronicTicket = value;
    }

    /**
     * Gets the value of the reissueDoesNotAllowElectronicTicket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReissueDoesNotAllowElectronicTicket() {
        return reissueDoesNotAllowElectronicTicket;
    }

    /**
     * Sets the value of the reissueDoesNotAllowElectronicTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReissueDoesNotAllowElectronicTicket(Boolean value) {
        this.reissueDoesNotAllowElectronicTicket = value;
    }

    /**
     * Gets the value of the taxRefundable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxRefundable() {
        return taxRefundable;
    }

    /**
     * Sets the value of the taxRefundable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxRefundable(Boolean value) {
        this.taxRefundable = value;
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
     *         &lt;element name="ChangeFee">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                 &lt;attribute name="HighestChangeFee" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="ChangeFeeWaived" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="ChangeFeeNotApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        "changeFee"
    })
    public static class ChangeFees {

        @XmlElement(name = "ChangeFee", required = true)
        protected ChangeFee changeFee;

        /**
         * Gets the value of the changeFee property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeFee }
         *     
         */
        public ChangeFee getChangeFee() {
            return changeFee;
        }

        /**
         * Sets the value of the changeFee property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeFee }
         *     
         */
        public void setChangeFee(ChangeFee value) {
            this.changeFee = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *       &lt;attribute name="HighestChangeFee" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="ChangeFeeWaived" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="ChangeFeeNotApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ChangeFee {

            @XmlAttribute(name = "HighestChangeFee")
            protected Boolean highestChangeFee;
            @XmlAttribute(name = "ChangeFeeWaived")
            protected Boolean changeFeeWaived;
            @XmlAttribute(name = "ChangeFeeNotApplicable")
            protected Boolean changeFeeNotApplicable;
            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;

            /**
             * Gets the value of the highestChangeFee property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isHighestChangeFee() {
                return highestChangeFee;
            }

            /**
             * Sets the value of the highestChangeFee property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setHighestChangeFee(Boolean value) {
                this.highestChangeFee = value;
            }

            /**
             * Gets the value of the changeFeeWaived property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isChangeFeeWaived() {
                return changeFeeWaived;
            }

            /**
             * Sets the value of the changeFeeWaived property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setChangeFeeWaived(Boolean value) {
                this.changeFeeWaived = value;
            }

            /**
             * Gets the value of the changeFeeNotApplicable property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isChangeFeeNotApplicable() {
                return changeFeeNotApplicable;
            }

            /**
             * Sets the value of the changeFeeNotApplicable property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setChangeFeeNotApplicable(Boolean value) {
                this.changeFeeNotApplicable = value;
            }

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAmount(BigDecimal value) {
                this.amount = value;
            }

            /**
             * Gets the value of the currencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * Sets the value of the currencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

            /**
             * Gets the value of the decimalPlaces property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDecimalPlaces() {
                return decimalPlaces;
            }

            /**
             * Sets the value of the decimalPlaces property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDecimalPlaces(BigInteger value) {
                this.decimalPlaces = value;
            }

        }

    }

}
