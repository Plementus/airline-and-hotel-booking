
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassengerFareRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerFareRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseFare" type="{http://traveltalk.com/wsTravelBuild}BaseFareRS" minOccurs="0"/>
 *         &lt;element name="EquivFare" type="{http://traveltalk.com/wsTravelBuild}EquivFareRS" minOccurs="0"/>
 *         &lt;element name="Taxes" type="{http://traveltalk.com/wsTravelBuild}TaxesRS" minOccurs="0"/>
 *         &lt;element name="Fees" type="{http://traveltalk.com/wsTravelBuild}ArrayOfFeeRS1" minOccurs="0"/>
 *         &lt;element name="TotalFare" type="{http://traveltalk.com/wsTravelBuild}TotalFareRS" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="NegotiatedFare" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="NegotiatedFareCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerFareRS", propOrder = {
    "baseFare",
    "equivFare",
    "taxes",
    "fees",
    "totalFare"
})
public class PassengerFareRS {

    @XmlElement(name = "BaseFare")
    protected BaseFareRS baseFare;
    @XmlElement(name = "EquivFare")
    protected EquivFareRS equivFare;
    @XmlElement(name = "Taxes")
    protected TaxesRS taxes;
    @XmlElement(name = "Fees")
    protected ArrayOfFeeRS1 fees;
    @XmlElement(name = "TotalFare")
    protected TotalFareRS totalFare;
    @XmlAttribute(name = "NegotiatedFare")
    protected Boolean negotiatedFare;
    @XmlAttribute(name = "NegotiatedFareCode")
    protected String negotiatedFareCode;

    /**
     * Gets the value of the baseFare property.
     * 
     * @return
     *     possible object is
     *     {@link BaseFareRS }
     *     
     */
    public BaseFareRS getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseFareRS }
     *     
     */
    public void setBaseFare(BaseFareRS value) {
        this.baseFare = value;
    }

    /**
     * Gets the value of the equivFare property.
     * 
     * @return
     *     possible object is
     *     {@link EquivFareRS }
     *     
     */
    public EquivFareRS getEquivFare() {
        return equivFare;
    }

    /**
     * Sets the value of the equivFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquivFareRS }
     *     
     */
    public void setEquivFare(EquivFareRS value) {
        this.equivFare = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link TaxesRS }
     *     
     */
    public TaxesRS getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxesRS }
     *     
     */
    public void setTaxes(TaxesRS value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFeeRS1 }
     *     
     */
    public ArrayOfFeeRS1 getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFeeRS1 }
     *     
     */
    public void setFees(ArrayOfFeeRS1 value) {
        this.fees = value;
    }

    /**
     * Gets the value of the totalFare property.
     * 
     * @return
     *     possible object is
     *     {@link TotalFareRS }
     *     
     */
    public TotalFareRS getTotalFare() {
        return totalFare;
    }

    /**
     * Sets the value of the totalFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalFareRS }
     *     
     */
    public void setTotalFare(TotalFareRS value) {
        this.totalFare = value;
    }

    /**
     * Gets the value of the negotiatedFare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNegotiatedFare() {
        if (negotiatedFare == null) {
            return false;
        } else {
            return negotiatedFare;
        }
    }

    /**
     * Sets the value of the negotiatedFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegotiatedFare(Boolean value) {
        this.negotiatedFare = value;
    }

    /**
     * Gets the value of the negotiatedFareCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegotiatedFareCode() {
        return negotiatedFareCode;
    }

    /**
     * Sets the value of the negotiatedFareCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegotiatedFareCode(String value) {
        this.negotiatedFareCode = value;
    }

}
