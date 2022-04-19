
package services.amadeus.lowfarematrix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassengerFare complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerFare">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseFare" type="{http://traveltalk.com/wsLowFareMatrix}BaseFare" minOccurs="0"/>
 *         &lt;element name="EquivFare" type="{http://traveltalk.com/wsLowFareMatrix}EquivFare" minOccurs="0"/>
 *         &lt;element name="Taxes" type="{http://traveltalk.com/wsLowFareMatrix}ArrayOfTax" minOccurs="0"/>
 *         &lt;element name="Fees" type="{http://traveltalk.com/wsLowFareMatrix}ArrayOfFee" minOccurs="0"/>
 *         &lt;element name="TotalFare" type="{http://traveltalk.com/wsLowFareMatrix}TotalFare" minOccurs="0"/>
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
@XmlType(name = "PassengerFare", propOrder = {
    "baseFare",
    "equivFare",
    "taxes",
    "fees",
    "totalFare"
})
public class PassengerFare {

    @XmlElement(name = "BaseFare")
    protected BaseFare baseFare;
    @XmlElement(name = "EquivFare")
    protected EquivFare equivFare;
    @XmlElement(name = "Taxes")
    protected ArrayOfTax taxes;
    @XmlElement(name = "Fees")
    protected ArrayOfFee fees;
    @XmlElement(name = "TotalFare")
    protected TotalFare totalFare;
    @XmlAttribute(name = "NegotiatedFare")
    protected Boolean negotiatedFare;
    @XmlAttribute(name = "NegotiatedFareCode")
    protected String negotiatedFareCode;

    /**
     * Gets the value of the baseFare property.
     * 
     * @return
     *     possible object is
     *     {@link BaseFare }
     *     
     */
    public BaseFare getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseFare }
     *     
     */
    public void setBaseFare(BaseFare value) {
        this.baseFare = value;
    }

    /**
     * Gets the value of the equivFare property.
     * 
     * @return
     *     possible object is
     *     {@link EquivFare }
     *     
     */
    public EquivFare getEquivFare() {
        return equivFare;
    }

    /**
     * Sets the value of the equivFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquivFare }
     *     
     */
    public void setEquivFare(EquivFare value) {
        this.equivFare = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTax }
     *     
     */
    public ArrayOfTax getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTax }
     *     
     */
    public void setTaxes(ArrayOfTax value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFee }
     *     
     */
    public ArrayOfFee getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFee }
     *     
     */
    public void setFees(ArrayOfFee value) {
        this.fees = value;
    }

    /**
     * Gets the value of the totalFare property.
     * 
     * @return
     *     possible object is
     *     {@link TotalFare }
     *     
     */
    public TotalFare getTotalFare() {
        return totalFare;
    }

    /**
     * Sets the value of the totalFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalFare }
     *     
     */
    public void setTotalFare(TotalFare value) {
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
