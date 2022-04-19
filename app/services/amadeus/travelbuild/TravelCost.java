
package services.amadeus.travelbuild;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelCost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelCost">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FormOfPayment" type="{http://traveltalk.com/wsTravelBuild}FormOfPaymentRS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CostTotals" type="{http://traveltalk.com/wsTravelBuild}CostTotals" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://traveltalk.com/wsTravelBuild}TPA_ExtensionsRS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelCost", propOrder = {
    "formOfPayment",
    "costTotals",
    "tpaExtensions"
})
public class TravelCost {

    @XmlElement(name = "FormOfPayment")
    protected List<FormOfPaymentRS> formOfPayment;
    @XmlElement(name = "CostTotals")
    protected CostTotals costTotals;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsRS tpaExtensions;

    /**
     * Gets the value of the formOfPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formOfPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormOfPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormOfPaymentRS }
     * 
     * 
     */
    public List<FormOfPaymentRS> getFormOfPayment() {
        if (formOfPayment == null) {
            formOfPayment = new ArrayList<FormOfPaymentRS>();
        }
        return this.formOfPayment;
    }

    /**
     * Gets the value of the costTotals property.
     * 
     * @return
     *     possible object is
     *     {@link CostTotals }
     *     
     */
    public CostTotals getCostTotals() {
        return costTotals;
    }

    /**
     * Sets the value of the costTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostTotals }
     *     
     */
    public void setCostTotals(CostTotals value) {
        this.costTotals = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsRS }
     *     
     */
    public TPAExtensionsRS getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsRS }
     *     
     */
    public void setTPAExtensions(TPAExtensionsRS value) {
        this.tpaExtensions = value;
    }

}
