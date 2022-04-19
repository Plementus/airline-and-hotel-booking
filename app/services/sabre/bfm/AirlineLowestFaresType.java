
package services.sabre.bfm;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * IntelliSell Type . lowest fare for airline. Currently not used.
 * 
 * <p>Java class for AirlineLowestFaresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineLowestFaresType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Airline" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType"/>
 *         &lt;element name="NoStops" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="LowestFare" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType"/>
 *         &lt;element name="ItineraryCount" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineLowestFaresType", propOrder = {
    "airline",
    "noStops",
    "lowestFare",
    "itineraryCount"
})
public class AirlineLowestFaresType {

    @XmlElement(name = "Airline", required = true)
    protected CompanyNameType airline;
    @XmlElement(name = "NoStops", required = true)
    protected BigInteger noStops;
    @XmlElement(name = "LowestFare", required = true)
    protected CurrencyAmountType lowestFare;
    @XmlElement(name = "ItineraryCount", required = true)
    protected Object itineraryCount;

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getAirline() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setAirline(CompanyNameType value) {
        this.airline = value;
    }

    /**
     * Gets the value of the noStops property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoStops() {
        return noStops;
    }

    /**
     * Sets the value of the noStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoStops(BigInteger value) {
        this.noStops = value;
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

    /**
     * Gets the value of the itineraryCount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getItineraryCount() {
        return itineraryCount;
    }

    /**
     * Sets the value of the itineraryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setItineraryCount(Object value) {
        this.itineraryCount = value;
    }

}
