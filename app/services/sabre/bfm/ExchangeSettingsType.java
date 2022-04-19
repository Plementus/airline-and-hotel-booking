
package services.sabre.bfm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeSettingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeSettingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="RepriceCurrentItin" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="AttachExchangeInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ReissueExchange">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="A"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="BrandedResults" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MIPTimeoutThreshold" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="RequestType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="basic"/>
 *             &lt;enumeration value="context"/>
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
@XmlType(name = "ExchangeSettingsType")
public class ExchangeSettingsType {

    @XmlAttribute(name = "RepriceCurrentItin")
    protected Boolean repriceCurrentItin;
    @XmlAttribute(name = "AttachExchangeInfo")
    protected Boolean attachExchangeInfo;
    @XmlAttribute(name = "ReissueExchange")
    protected String reissueExchange;
    @XmlAttribute(name = "BrandedResults")
    protected Boolean brandedResults;
    @XmlAttribute(name = "MIPTimeoutThreshold")
    protected Long mipTimeoutThreshold;
    @XmlAttribute(name = "RequestType")
    protected String requestType;

    /**
     * Gets the value of the repriceCurrentItin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRepriceCurrentItin() {
        if (repriceCurrentItin == null) {
            return true;
        } else {
            return repriceCurrentItin;
        }
    }

    /**
     * Sets the value of the repriceCurrentItin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepriceCurrentItin(Boolean value) {
        this.repriceCurrentItin = value;
    }

    /**
     * Gets the value of the attachExchangeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAttachExchangeInfo() {
        if (attachExchangeInfo == null) {
            return false;
        } else {
            return attachExchangeInfo;
        }
    }

    /**
     * Sets the value of the attachExchangeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttachExchangeInfo(Boolean value) {
        this.attachExchangeInfo = value;
    }

    /**
     * Gets the value of the reissueExchange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReissueExchange() {
        return reissueExchange;
    }

    /**
     * Sets the value of the reissueExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReissueExchange(String value) {
        this.reissueExchange = value;
    }

    /**
     * Gets the value of the brandedResults property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrandedResults() {
        return brandedResults;
    }

    /**
     * Sets the value of the brandedResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBrandedResults(Boolean value) {
        this.brandedResults = value;
    }

    /**
     * Gets the value of the mipTimeoutThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMIPTimeoutThreshold() {
        return mipTimeoutThreshold;
    }

    /**
     * Sets the value of the mipTimeoutThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMIPTimeoutThreshold(Long value) {
        this.mipTimeoutThreshold = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestType(String value) {
        this.requestType = value;
    }

}
