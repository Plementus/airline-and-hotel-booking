
package services.sabre.bfm;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				You don't need to specify all of these attributes for a given flight.
 * 				For some of them it is sufficient to be specified in the last flight of a given fare component.
 * 				For details, see notes below --- the attributes are annotated with ,,last Flight in Fare Component''.
 * 			
 * 
 * <p>Java class for FareOptionalDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareOptionalDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}VCTRAttributeGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}BrandAttributeGroup"/>
 *       &lt;attribute name="ComponentNo" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="BasisCode" type="{http://www.opentravel.org/OTA/2003/05}FareBasisCodeType" />
 *       &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareOptionalDetailsType")
public class FareOptionalDetailsType {

    @XmlAttribute(name = "ComponentNo")
    protected Short componentNo;
    @XmlAttribute(name = "BasisCode")
    protected String basisCode;
    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "Vendor")
    protected String vendor;
    @XmlAttribute(name = "SourceVendor")
    protected String sourceVendor;
    @XmlAttribute(name = "Tariff")
    protected String tariff;
    @XmlAttribute(name = "RuleNumber")
    protected String ruleNumber;
    @XmlAttribute(name = "BrandID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String brandID;
    @XmlAttribute(name = "ProgramID")
    protected Integer programID;

    /**
     * Gets the value of the componentNo property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getComponentNo() {
        return componentNo;
    }

    /**
     * Sets the value of the componentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setComponentNo(Short value) {
        this.componentNo = value;
    }

    /**
     * Gets the value of the basisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasisCode() {
        return basisCode;
    }

    /**
     * Sets the value of the basisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasisCode(String value) {
        this.basisCode = value;
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
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the sourceVendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceVendor() {
        return sourceVendor;
    }

    /**
     * Sets the value of the sourceVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceVendor(String value) {
        this.sourceVendor = value;
    }

    /**
     * Gets the value of the tariff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariff() {
        return tariff;
    }

    /**
     * Sets the value of the tariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariff(String value) {
        this.tariff = value;
    }

    /**
     * Gets the value of the ruleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleNumber() {
        return ruleNumber;
    }

    /**
     * Sets the value of the ruleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleNumber(String value) {
        this.ruleNumber = value;
    }

    /**
     * Gets the value of the brandID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandID() {
        return brandID;
    }

    /**
     * Sets the value of the brandID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandID(String value) {
        this.brandID = value;
    }

    /**
     * Gets the value of the programID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProgramID() {
        return programID;
    }

    /**
     * Sets the value of the programID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProgramID(Integer value) {
        this.programID = value;
    }

}
