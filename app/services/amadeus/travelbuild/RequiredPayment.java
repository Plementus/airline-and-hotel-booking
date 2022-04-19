
package services.amadeus.travelbuild;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequiredPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequiredPayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcceptedPayments" type="{http://traveltalk.com/wsTravelBuild}ArrayOfAcceptedPayment" minOccurs="0"/>
 *         &lt;element name="PaymentDescription" type="{http://traveltalk.com/wsTravelBuild}PaymentDescription" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RetributionType" type="{http://traveltalk.com/wsTravelBuild}RequiredPaymentRetributionType" />
 *       &lt;attribute name="PaymentCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequiredPayment", propOrder = {
    "acceptedPayments",
    "paymentDescription"
})
public class RequiredPayment {

    @XmlElement(name = "AcceptedPayments")
    protected ArrayOfAcceptedPayment acceptedPayments;
    @XmlElement(name = "PaymentDescription")
    protected List<PaymentDescription> paymentDescription;
    @XmlAttribute(name = "RetributionType")
    protected RequiredPaymentRetributionType retributionType;
    @XmlAttribute(name = "PaymentCode")
    protected String paymentCode;

    /**
     * Gets the value of the acceptedPayments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAcceptedPayment }
     *     
     */
    public ArrayOfAcceptedPayment getAcceptedPayments() {
        return acceptedPayments;
    }

    /**
     * Sets the value of the acceptedPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAcceptedPayment }
     *     
     */
    public void setAcceptedPayments(ArrayOfAcceptedPayment value) {
        this.acceptedPayments = value;
    }

    /**
     * Gets the value of the paymentDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDescription }
     * 
     * 
     */
    public List<PaymentDescription> getPaymentDescription() {
        if (paymentDescription == null) {
            paymentDescription = new ArrayList<PaymentDescription>();
        }
        return this.paymentDescription;
    }

    /**
     * Gets the value of the retributionType property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredPaymentRetributionType }
     *     
     */
    public RequiredPaymentRetributionType getRetributionType() {
        return retributionType;
    }

    /**
     * Sets the value of the retributionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredPaymentRetributionType }
     *     
     */
    public void setRetributionType(RequiredPaymentRetributionType value) {
        this.retributionType = value;
    }

    /**
     * Gets the value of the paymentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCode() {
        return paymentCode;
    }

    /**
     * Sets the value of the paymentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCode(String value) {
        this.paymentCode = value;
    }

}
