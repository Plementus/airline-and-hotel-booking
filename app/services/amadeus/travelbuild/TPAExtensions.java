
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPA_Extensions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPA_Extensions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Provider" type="{http://traveltalk.com/wsTravelBuild}Provider" minOccurs="0"/>
 *         &lt;element name="PNRData" type="{http://traveltalk.com/wsTravelBuild}PNRData" minOccurs="0"/>
 *         &lt;element name="CarData" type="{http://traveltalk.com/wsTravelBuild}CarData" minOccurs="0"/>
 *         &lt;element name="HotelData" type="{http://traveltalk.com/wsTravelBuild}HotelData" minOccurs="0"/>
 *         &lt;element name="PriceData" type="{http://traveltalk.com/wsTravelBuild}PriceData" minOccurs="0"/>
 *         &lt;element name="AgencyData" type="{http://traveltalk.com/wsTravelBuild}AgencyData" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FlightType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DateChange" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FlownIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="FOPType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPA_Extensions", propOrder = {
    "provider",
    "pnrData",
    "carData",
    "hotelData",
    "priceData",
    "agencyData"
})
public class TPAExtensions {

    @XmlElement(name = "Provider")
    protected Provider provider;
    @XmlElement(name = "PNRData")
    protected PNRData pnrData;
    @XmlElement(name = "CarData")
    protected CarData carData;
    @XmlElement(name = "HotelData")
    protected HotelData hotelData;
    @XmlElement(name = "PriceData")
    protected PriceData priceData;
    @XmlElement(name = "AgencyData")
    protected AgencyData agencyData;
    @XmlAttribute(name = "FlightType")
    protected String flightType;
    @XmlAttribute(name = "DateChange")
    protected String dateChange;
    @XmlAttribute(name = "FlownIndicator")
    protected Boolean flownIndicator;
    @XmlAttribute(name = "FOPType")
    protected String fopType;
    @XmlAttribute(name = "ConfirmationNumber")
    protected String confirmationNumber;

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link Provider }
     *     
     */
    public Provider getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider }
     *     
     */
    public void setProvider(Provider value) {
        this.provider = value;
    }

    /**
     * Gets the value of the pnrData property.
     * 
     * @return
     *     possible object is
     *     {@link PNRData }
     *     
     */
    public PNRData getPNRData() {
        return pnrData;
    }

    /**
     * Sets the value of the pnrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRData }
     *     
     */
    public void setPNRData(PNRData value) {
        this.pnrData = value;
    }

    /**
     * Gets the value of the carData property.
     * 
     * @return
     *     possible object is
     *     {@link CarData }
     *     
     */
    public CarData getCarData() {
        return carData;
    }

    /**
     * Sets the value of the carData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarData }
     *     
     */
    public void setCarData(CarData value) {
        this.carData = value;
    }

    /**
     * Gets the value of the hotelData property.
     * 
     * @return
     *     possible object is
     *     {@link HotelData }
     *     
     */
    public HotelData getHotelData() {
        return hotelData;
    }

    /**
     * Sets the value of the hotelData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelData }
     *     
     */
    public void setHotelData(HotelData value) {
        this.hotelData = value;
    }

    /**
     * Gets the value of the priceData property.
     * 
     * @return
     *     possible object is
     *     {@link PriceData }
     *     
     */
    public PriceData getPriceData() {
        return priceData;
    }

    /**
     * Sets the value of the priceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceData }
     *     
     */
    public void setPriceData(PriceData value) {
        this.priceData = value;
    }

    /**
     * Gets the value of the agencyData property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyData }
     *     
     */
    public AgencyData getAgencyData() {
        return agencyData;
    }

    /**
     * Sets the value of the agencyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyData }
     *     
     */
    public void setAgencyData(AgencyData value) {
        this.agencyData = value;
    }

    /**
     * Gets the value of the flightType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightType() {
        return flightType;
    }

    /**
     * Sets the value of the flightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightType(String value) {
        this.flightType = value;
    }

    /**
     * Gets the value of the dateChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateChange() {
        return dateChange;
    }

    /**
     * Sets the value of the dateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateChange(String value) {
        this.dateChange = value;
    }

    /**
     * Gets the value of the flownIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlownIndicator() {
        return flownIndicator;
    }

    /**
     * Sets the value of the flownIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlownIndicator(Boolean value) {
        this.flownIndicator = value;
    }

    /**
     * Gets the value of the fopType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOPType() {
        return fopType;
    }

    /**
     * Sets the value of the fopType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOPType(String value) {
        this.fopType = value;
    }

    /**
     * Gets the value of the confirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Sets the value of the confirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationNumber(String value) {
        this.confirmationNumber = value;
    }

}
