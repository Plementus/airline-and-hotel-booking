
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepositPaymentRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepositPaymentRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcceptedPayments" type="{http://traveltalk.com/wsTravelBuild}ArrayOfAcceptedPaymentRS" minOccurs="0"/>
 *         &lt;element name="AmountPercent" type="{http://traveltalk.com/wsTravelBuild}AmountPercent" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RetributionType" type="{http://traveltalk.com/wsTravelBuild}DepositPaymentRetributionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepositPaymentRS", propOrder = {
    "acceptedPayments",
    "amountPercent"
})
public class DepositPaymentRS {

    @XmlElement(name = "AcceptedPayments")
    protected ArrayOfAcceptedPaymentRS acceptedPayments;
    @XmlElement(name = "AmountPercent")
    protected AmountPercent amountPercent;
    @XmlAttribute(name = "RetributionType")
    protected DepositPaymentRetributionType retributionType;

    /**
     * Gets the value of the acceptedPayments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAcceptedPaymentRS }
     *     
     */
    public ArrayOfAcceptedPaymentRS getAcceptedPayments() {
        return acceptedPayments;
    }

    /**
     * Sets the value of the acceptedPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAcceptedPaymentRS }
     *     
     */
    public void setAcceptedPayments(ArrayOfAcceptedPaymentRS value) {
        this.acceptedPayments = value;
    }

    /**
     * Gets the value of the amountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPercent }
     *     
     */
    public AmountPercent getAmountPercent() {
        return amountPercent;
    }

    /**
     * Sets the value of the amountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPercent }
     *     
     */
    public void setAmountPercent(AmountPercent value) {
        this.amountPercent = value;
    }

    /**
     * Gets the value of the retributionType property.
     * 
     * @return
     *     possible object is
     *     {@link DepositPaymentRetributionType }
     *     
     */
    public DepositPaymentRetributionType getRetributionType() {
        return retributionType;
    }

    /**
     * Sets the value of the retributionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositPaymentRetributionType }
     *     
     */
    public void setRetributionType(DepositPaymentRetributionType value) {
        this.retributionType = value;
    }

}
