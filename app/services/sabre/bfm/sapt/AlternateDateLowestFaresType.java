
package services.sabre.bfm.sapt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * IntelliSell Type . lowest fare for alternate departure / return date times.
 * 
 * <p>Java class for AlternateDateLowestFaresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlternateDateLowestFaresType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReturnlDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LowestFare" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternateDateLowestFaresType", propOrder = {
    "departureDateTime",
    "returnlDateTime",
    "lowestFare"
})
public class AlternateDateLowestFaresType {

    @XmlElement(name = "DepartureDateTime", required = true)
    protected String departureDateTime;
    @XmlElement(name = "ReturnlDateTime", required = true)
    protected String returnlDateTime;
    @XmlElement(name = "LowestFare", required = true)
    protected CurrencyAmountType lowestFare;

    /**
     * Gets the value of the departureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * Sets the value of the departureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDateTime(String value) {
        this.departureDateTime = value;
    }

    /**
     * Gets the value of the returnlDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnlDateTime() {
        return returnlDateTime;
    }

    /**
     * Sets the value of the returnlDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnlDateTime(String value) {
        this.returnlDateTime = value;
    }

    /**
     * Gets the value of the lowestFare property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getLowestFare() {
        return lowestFare;
    }

    /**
     * Sets the value of the lowestFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setLowestFare(CurrencyAmountType value) {
        this.lowestFare = value;
    }

}
