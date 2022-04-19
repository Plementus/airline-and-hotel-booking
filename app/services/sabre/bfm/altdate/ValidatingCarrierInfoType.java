
package services.sabre.bfm.altdate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidatingCarrierInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidatingCarrierInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Default" type="{http://www.opentravel.org/OTA/2003/05}CarrierCode" minOccurs="0"/>
 *         &lt;element name="Alternate" type="{http://www.opentravel.org/OTA/2003/05}CarrierCode" maxOccurs="24" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SettlementMethod" type="{http://www.opentravel.org/OTA/2003/05}StringLength3" />
 *       &lt;attribute name="NewVcxProcess" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidatingCarrierInfoType", propOrder = {
    "_default",
    "alternate"
})
public class ValidatingCarrierInfoType {

    @XmlElement(name = "Default")
    protected String _default;
    @XmlElement(name = "Alternate")
    protected List<String> alternate;
    @XmlAttribute(name = "SettlementMethod")
    protected String settlementMethod;
    @XmlAttribute(name = "NewVcxProcess")
    protected Boolean newVcxProcess;

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefault(String value) {
        this._default = value;
    }

    /**
     * Gets the value of the alternate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlternate() {
        if (alternate == null) {
            alternate = new ArrayList<String>();
        }
        return this.alternate;
    }

    /**
     * Gets the value of the settlementMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementMethod() {
        return settlementMethod;
    }

    /**
     * Sets the value of the settlementMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementMethod(String value) {
        this.settlementMethod = value;
    }

    /**
     * Gets the value of the newVcxProcess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewVcxProcess() {
        return newVcxProcess;
    }

    /**
     * Sets the value of the newVcxProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewVcxProcess(Boolean value) {
        this.newVcxProcess = value;
    }

}
