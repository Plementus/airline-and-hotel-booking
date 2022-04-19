
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormOfPaymentRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormOfPaymentRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentCard" type="{http://traveltalk.com/wsTravelBuild}PaymentCardRS" minOccurs="0"/>
 *         &lt;element name="BankAcct" type="{http://traveltalk.com/wsTravelBuild}BankAcct" minOccurs="0"/>
 *         &lt;element name="DirectBill" type="{http://traveltalk.com/wsTravelBuild}DirectBillRS" minOccurs="0"/>
 *         &lt;element name="Voucher" type="{http://traveltalk.com/wsTravelBuild}VoucherRS" minOccurs="0"/>
 *         &lt;element name="LoyaltyRedemption" type="{http://traveltalk.com/wsTravelBuild}LoyaltyRedemptionRS" minOccurs="0"/>
 *         &lt;element name="MiscChargeOrder" type="{http://traveltalk.com/wsTravelBuild}MiscChargeOrderRS" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://traveltalk.com/wsTravelBuild}TPA_ExtensionsRS" minOccurs="0"/>
 *         &lt;element name="PaymentAmount" type="{http://traveltalk.com/wsTravelBuild}PaymentAmountRS" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ShareSynchInd" type="{http://traveltalk.com/wsTravelBuild}FormOfPaymentShareSynchInd" />
 *       &lt;attribute name="ShareMarketInd" type="{http://traveltalk.com/wsTravelBuild}FormOfPaymentShareMarketInd" />
 *       &lt;attribute name="CostCenterID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormOfPaymentRS", propOrder = {
    "paymentCard",
    "bankAcct",
    "directBill",
    "voucher",
    "loyaltyRedemption",
    "miscChargeOrder",
    "tpaExtensions",
    "paymentAmount"
})
public class FormOfPaymentRS {

    @XmlElement(name = "PaymentCard")
    protected PaymentCardRS paymentCard;
    @XmlElement(name = "BankAcct")
    protected BankAcct bankAcct;
    @XmlElement(name = "DirectBill")
    protected DirectBillRS directBill;
    @XmlElement(name = "Voucher")
    protected VoucherRS voucher;
    @XmlElement(name = "LoyaltyRedemption")
    protected LoyaltyRedemptionRS loyaltyRedemption;
    @XmlElement(name = "MiscChargeOrder")
    protected MiscChargeOrderRS miscChargeOrder;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsRS tpaExtensions;
    @XmlElement(name = "PaymentAmount")
    protected PaymentAmountRS paymentAmount;
    @XmlAttribute(name = "ShareSynchInd")
    protected FormOfPaymentShareSynchInd shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected FormOfPaymentShareMarketInd shareMarketInd;
    @XmlAttribute(name = "CostCenterID")
    protected String costCenterID;
    @XmlAttribute(name = "RPH")
    protected String rph;

    /**
     * Gets the value of the paymentCard property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardRS }
     *     
     */
    public PaymentCardRS getPaymentCard() {
        return paymentCard;
    }

    /**
     * Sets the value of the paymentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardRS }
     *     
     */
    public void setPaymentCard(PaymentCardRS value) {
        this.paymentCard = value;
    }

    /**
     * Gets the value of the bankAcct property.
     * 
     * @return
     *     possible object is
     *     {@link BankAcct }
     *     
     */
    public BankAcct getBankAcct() {
        return bankAcct;
    }

    /**
     * Sets the value of the bankAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAcct }
     *     
     */
    public void setBankAcct(BankAcct value) {
        this.bankAcct = value;
    }

    /**
     * Gets the value of the directBill property.
     * 
     * @return
     *     possible object is
     *     {@link DirectBillRS }
     *     
     */
    public DirectBillRS getDirectBill() {
        return directBill;
    }

    /**
     * Sets the value of the directBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectBillRS }
     *     
     */
    public void setDirectBill(DirectBillRS value) {
        this.directBill = value;
    }

    /**
     * Gets the value of the voucher property.
     * 
     * @return
     *     possible object is
     *     {@link VoucherRS }
     *     
     */
    public VoucherRS getVoucher() {
        return voucher;
    }

    /**
     * Sets the value of the voucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoucherRS }
     *     
     */
    public void setVoucher(VoucherRS value) {
        this.voucher = value;
    }

    /**
     * Gets the value of the loyaltyRedemption property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyRedemptionRS }
     *     
     */
    public LoyaltyRedemptionRS getLoyaltyRedemption() {
        return loyaltyRedemption;
    }

    /**
     * Sets the value of the loyaltyRedemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyRedemptionRS }
     *     
     */
    public void setLoyaltyRedemption(LoyaltyRedemptionRS value) {
        this.loyaltyRedemption = value;
    }

    /**
     * Gets the value of the miscChargeOrder property.
     * 
     * @return
     *     possible object is
     *     {@link MiscChargeOrderRS }
     *     
     */
    public MiscChargeOrderRS getMiscChargeOrder() {
        return miscChargeOrder;
    }

    /**
     * Sets the value of the miscChargeOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscChargeOrderRS }
     *     
     */
    public void setMiscChargeOrder(MiscChargeOrderRS value) {
        this.miscChargeOrder = value;
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

    /**
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountRS }
     *     
     */
    public PaymentAmountRS getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountRS }
     *     
     */
    public void setPaymentAmount(PaymentAmountRS value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentShareSynchInd }
     *     
     */
    public FormOfPaymentShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentShareSynchInd }
     *     
     */
    public void setShareSynchInd(FormOfPaymentShareSynchInd value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentShareMarketInd }
     *     
     */
    public FormOfPaymentShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentShareMarketInd }
     *     
     */
    public void setShareMarketInd(FormOfPaymentShareMarketInd value) {
        this.shareMarketInd = value;
    }

    /**
     * Gets the value of the costCenterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenterID() {
        return costCenterID;
    }

    /**
     * Sets the value of the costCenterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenterID(String value) {
        this.costCenterID = value;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

}
