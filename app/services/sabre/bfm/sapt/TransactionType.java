
package services.sabre.bfm.sapt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * IntelliSell Type
 * 
 * <p>Java class for TransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>IntelliSellRequestType">
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ServiceTag" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>ServiceTagType">
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PurchaseType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SabreAth" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="BinarySecToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ConversationID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TranID" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ClientSessionID" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Branch" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Main" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CompressResponse" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareOverrides" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FareOverride" maxOccurs="4">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="VendorPref" type="{http://www.opentravel.org/OTA/2003/05}CompanyNamePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="TPA_Extensions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="FareType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="CorporateID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Callable" type="{http://www.w3.org/2001/XMLSchema}string" default="true" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SubagentData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ResponseSorting" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="EnableChronologicalSorting" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "TransactionType", propOrder = {
    "requestType",
    "serviceTag",
    "purchaseType",
    "sabreAth",
    "tranID",
    "clientSessionID",
    "branch",
    "compressResponse",
    "fareOverrides",
    "subagentData",
    "responseSorting"
})
public class TransactionType {

    @XmlElement(name = "RequestType")
    protected RequestType requestType;
    @XmlElement(name = "ServiceTag")
    protected ServiceTag serviceTag;
    @XmlElement(name = "PurchaseType")
    protected PurchaseType purchaseType;
    @XmlElement(name = "SabreAth")
    protected SabreAth sabreAth;
    @XmlElement(name = "TranID")
    protected TranID tranID;
    @XmlElement(name = "ClientSessionID")
    protected ClientSessionID clientSessionID;
    @XmlElement(name = "Branch")
    protected Branch branch;
    @XmlElement(name = "CompressResponse")
    protected CompressResponse compressResponse;
    @XmlElement(name = "FareOverrides")
    protected FareOverrides fareOverrides;
    @XmlElement(name = "SubagentData")
    protected SubagentData subagentData;
    @XmlElement(name = "ResponseSorting")
    protected ResponseSorting responseSorting;

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequestType(RequestType value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the serviceTag property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceTag }
     *     
     */
    public ServiceTag getServiceTag() {
        return serviceTag;
    }

    /**
     * Sets the value of the serviceTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceTag }
     *     
     */
    public void setServiceTag(ServiceTag value) {
        this.serviceTag = value;
    }

    /**
     * Gets the value of the purchaseType property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseType }
     *     
     */
    public PurchaseType getPurchaseType() {
        return purchaseType;
    }

    /**
     * Sets the value of the purchaseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseType }
     *     
     */
    public void setPurchaseType(PurchaseType value) {
        this.purchaseType = value;
    }

    /**
     * Gets the value of the sabreAth property.
     * 
     * @return
     *     possible object is
     *     {@link SabreAth }
     *     
     */
    public SabreAth getSabreAth() {
        return sabreAth;
    }

    /**
     * Sets the value of the sabreAth property.
     * 
     * @param value
     *     allowed object is
     *     {@link SabreAth }
     *     
     */
    public void setSabreAth(SabreAth value) {
        this.sabreAth = value;
    }

    /**
     * Gets the value of the tranID property.
     * 
     * @return
     *     possible object is
     *     {@link TranID }
     *     
     */
    public TranID getTranID() {
        return tranID;
    }

    /**
     * Sets the value of the tranID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranID }
     *     
     */
    public void setTranID(TranID value) {
        this.tranID = value;
    }

    /**
     * Gets the value of the clientSessionID property.
     * 
     * @return
     *     possible object is
     *     {@link ClientSessionID }
     *     
     */
    public ClientSessionID getClientSessionID() {
        return clientSessionID;
    }

    /**
     * Sets the value of the clientSessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientSessionID }
     *     
     */
    public void setClientSessionID(ClientSessionID value) {
        this.clientSessionID = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link Branch }
     *     
     */
    public Branch getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Branch }
     *     
     */
    public void setBranch(Branch value) {
        this.branch = value;
    }

    /**
     * Gets the value of the compressResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CompressResponse }
     *     
     */
    public CompressResponse getCompressResponse() {
        return compressResponse;
    }

    /**
     * Sets the value of the compressResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompressResponse }
     *     
     */
    public void setCompressResponse(CompressResponse value) {
        this.compressResponse = value;
    }

    /**
     * Gets the value of the fareOverrides property.
     * 
     * @return
     *     possible object is
     *     {@link FareOverrides }
     *     
     */
    public FareOverrides getFareOverrides() {
        return fareOverrides;
    }

    /**
     * Sets the value of the fareOverrides property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareOverrides }
     *     
     */
    public void setFareOverrides(FareOverrides value) {
        this.fareOverrides = value;
    }

    /**
     * Gets the value of the subagentData property.
     * 
     * @return
     *     possible object is
     *     {@link SubagentData }
     *     
     */
    public SubagentData getSubagentData() {
        return subagentData;
    }

    /**
     * Sets the value of the subagentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubagentData }
     *     
     */
    public void setSubagentData(SubagentData value) {
        this.subagentData = value;
    }

    /**
     * Gets the value of the responseSorting property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseSorting }
     *     
     */
    public ResponseSorting getResponseSorting() {
        return responseSorting;
    }

    /**
     * Sets the value of the responseSorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseSorting }
     *     
     */
    public void setResponseSorting(ResponseSorting value) {
        this.responseSorting = value;
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
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Main" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Branch {

        @XmlAttribute(name = "Name")
        protected String name;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            if (name == null) {
                return "Main";
            } else {
                return name;
            }
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
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
     *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ClientSessionID {

        @XmlAttribute(name = "Value")
        protected String value;

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
     *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CompressResponse {

        @XmlAttribute(name = "Value")
        protected Boolean value;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isValue() {
            if (value == null) {
                return false;
            } else {
                return value;
            }
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setValue(Boolean value) {
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
     *       &lt;sequence>
     *         &lt;element name="FareOverride" maxOccurs="4">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="VendorPref" type="{http://www.opentravel.org/OTA/2003/05}CompanyNamePrefType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="TPA_Extensions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="FareType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="CorporateID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Callable" type="{http://www.w3.org/2001/XMLSchema}string" default="true" />
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
        "fareOverride"
    })
    public static class FareOverrides {

        @XmlElement(name = "FareOverride", required = true)
        protected List<FareOverride> fareOverride;

        /**
         * Gets the value of the fareOverride property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareOverride property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareOverride().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareOverride }
         * 
         * 
         */
        public List<FareOverride> getFareOverride() {
            if (fareOverride == null) {
                fareOverride = new ArrayList<FareOverride>();
            }
            return this.fareOverride;
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
         *         &lt;element name="VendorPref" type="{http://www.opentravel.org/OTA/2003/05}CompanyNamePrefType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="TPA_Extensions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="FareType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="CorporateID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Callable" type="{http://www.w3.org/2001/XMLSchema}string" default="true" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "vendorPref",
            "tpaExtensions"
        })
        public static class FareOverride {

            @XmlElement(name = "VendorPref")
            protected List<CompanyNamePrefType> vendorPref;
            @XmlElement(name = "TPA_Extensions")
            protected String tpaExtensions;
            @XmlAttribute(name = "FareType", required = true)
            protected String fareType;
            @XmlAttribute(name = "PseudoCityCode")
            protected String pseudoCityCode;
            @XmlAttribute(name = "CorporateID")
            protected String corporateID;
            @XmlAttribute(name = "Callable")
            protected String callable;

            /**
             * Gets the value of the vendorPref property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the vendorPref property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVendorPref().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CompanyNamePrefType }
             * 
             * 
             */
            public List<CompanyNamePrefType> getVendorPref() {
                if (vendorPref == null) {
                    vendorPref = new ArrayList<CompanyNamePrefType>();
                }
                return this.vendorPref;
            }

            /**
             * Gets the value of the tpaExtensions property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTPAExtensions() {
                return tpaExtensions;
            }

            /**
             * Sets the value of the tpaExtensions property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTPAExtensions(String value) {
                this.tpaExtensions = value;
            }

            /**
             * Gets the value of the fareType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFareType() {
                return fareType;
            }

            /**
             * Sets the value of the fareType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFareType(String value) {
                this.fareType = value;
            }

            /**
             * Gets the value of the pseudoCityCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPseudoCityCode() {
                return pseudoCityCode;
            }

            /**
             * Sets the value of the pseudoCityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPseudoCityCode(String value) {
                this.pseudoCityCode = value;
            }

            /**
             * Gets the value of the corporateID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCorporateID() {
                return corporateID;
            }

            /**
             * Sets the value of the corporateID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCorporateID(String value) {
                this.corporateID = value;
            }

            /**
             * Gets the value of the callable property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCallable() {
                if (callable == null) {
                    return "true";
                } else {
                    return callable;
                }
            }

            /**
             * Sets the value of the callable property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCallable(String value) {
                this.callable = value;
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
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PurchaseType {

        @XmlAttribute(name = "Name")
        protected String name;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
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
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>IntelliSellRequestType">
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class RequestType {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Name")
        protected String name;

        /**
         * IntelliSell Type
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
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
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
     *       &lt;attribute name="EnableChronologicalSorting" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ResponseSorting {

        @XmlAttribute(name = "EnableChronologicalSorting")
        protected Boolean enableChronologicalSorting;

        /**
         * Gets the value of the enableChronologicalSorting property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isEnableChronologicalSorting() {
            return enableChronologicalSorting;
        }

        /**
         * Sets the value of the enableChronologicalSorting property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setEnableChronologicalSorting(Boolean value) {
            this.enableChronologicalSorting = value;
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
     *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="BinarySecToken" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ConversationID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SabreAth {

        @XmlAttribute(name = "Value")
        protected String value;
        @XmlAttribute(name = "BinarySecToken")
        protected String binarySecToken;
        @XmlAttribute(name = "ConversationID")
        protected String conversationID;

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
         * Gets the value of the binarySecToken property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBinarySecToken() {
            return binarySecToken;
        }

        /**
         * Sets the value of the binarySecToken property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBinarySecToken(String value) {
            this.binarySecToken = value;
        }

        /**
         * Gets the value of the conversationID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConversationID() {
            return conversationID;
        }

        /**
         * Sets the value of the conversationID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConversationID(String value) {
            this.conversationID = value;
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
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>ServiceTagType">
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class ServiceTag {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Name")
        protected String name;

        /**
         * IntelliSell Type
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
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
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
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SubagentData {

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
     *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TranID {

        @XmlAttribute(name = "Value")
        protected String value;

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

    }

}
