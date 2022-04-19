
package services.sabre.bfm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fare" type="{http://www.opentravel.org/OTA/2003/05}ExchangeFareType"/>
 *         &lt;element name="POS" type="{http://www.opentravel.org/OTA/2003/05}ExchangePOSType"/>
 *         &lt;group ref="{http://www.opentravel.org/OTA/2003/05}ExchangeOriginDestinationOrArunkGroup"/>
 *         &lt;element name="TravelPreferences" type="{http://www.opentravel.org/OTA/2003/05}ExchangeAirSearchPrefsType" minOccurs="0"/>
 *         &lt;element name="TravelerInfoSummary" type="{http://www.opentravel.org/OTA/2003/05}TravelerInfoSummaryType"/>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}ExchangeTPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeType", propOrder = {
    "fare",
    "pos",
    "originDestinationInformation",
    "arunkAndOriginDestinationInformation",
    "travelPreferences",
    "travelerInfoSummary",
    "tpaExtensions"
})
public class ExchangeType {

    @XmlElement(name = "Fare", required = true)
    protected ExchangeFareType fare;
    @XmlElement(name = "POS", required = true)
    protected ExchangePOSType pos;
    @XmlElement(name = "OriginDestinationInformation", required = true)
    protected ExchangeOriginDestinationInformationType originDestinationInformation;
    @XmlElements({
        @XmlElement(name = "Arunk", type = ArunkType.class),
        @XmlElement(name = "OriginDestinationInformation", type = ExchangeOriginDestinationInformationType.class)
    })
    protected List<Object> arunkAndOriginDestinationInformation;
    @XmlElement(name = "TravelPreferences")
    protected ExchangeAirSearchPrefsType travelPreferences;
    @XmlElement(name = "TravelerInfoSummary", required = true)
    protected TravelerInfoSummaryType travelerInfoSummary;
    @XmlElement(name = "TPA_Extensions")
    protected ExchangeTPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "OriginalTktIssueDateTime", required = true)
    protected String originalTktIssueDateTime;
    @XmlAttribute(name = "ExchangedTktIssueDateTime")
    protected String exchangedTktIssueDateTime;
    @XmlAttribute(name = "PreviousExchangeDateTime")
    protected String previousExchangeDateTime;
    @XmlAttribute(name = "NumberOfTaxBoxes")
    protected Short numberOfTaxBoxes;
    @XmlAttribute(name = "BypassAdvancePurchaseOption")
    protected String bypassAdvancePurchaseOption;

    /**
     * Gets the value of the fare property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeFareType }
     *     
     */
    public ExchangeFareType getFare() {
        return fare;
    }

    /**
     * Sets the value of the fare property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeFareType }
     *     
     */
    public void setFare(ExchangeFareType value) {
        this.fare = value;
    }

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangePOSType }
     *     
     */
    public ExchangePOSType getPOS() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangePOSType }
     *     
     */
    public void setPOS(ExchangePOSType value) {
        this.pos = value;
    }

    /**
     * Gets the value of the originDestinationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeOriginDestinationInformationType }
     *     
     */
    public ExchangeOriginDestinationInformationType getOriginDestinationInformation() {
        return originDestinationInformation;
    }

    /**
     * Sets the value of the originDestinationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeOriginDestinationInformationType }
     *     
     */
    public void setOriginDestinationInformation(ExchangeOriginDestinationInformationType value) {
        this.originDestinationInformation = value;
    }

    /**
     * Gets the value of the arunkAndOriginDestinationInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arunkAndOriginDestinationInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArunkAndOriginDestinationInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArunkType }
     * {@link ExchangeOriginDestinationInformationType }
     * 
     * 
     */
    public List<Object> getArunkAndOriginDestinationInformation() {
        if (arunkAndOriginDestinationInformation == null) {
            arunkAndOriginDestinationInformation = new ArrayList<Object>();
        }
        return this.arunkAndOriginDestinationInformation;
    }

    /**
     * Gets the value of the travelPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeAirSearchPrefsType }
     *     
     */
    public ExchangeAirSearchPrefsType getTravelPreferences() {
        return travelPreferences;
    }

    /**
     * Sets the value of the travelPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeAirSearchPrefsType }
     *     
     */
    public void setTravelPreferences(ExchangeAirSearchPrefsType value) {
        this.travelPreferences = value;
    }

    /**
     * Gets the value of the travelerInfoSummary property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerInfoSummaryType }
     *     
     */
    public TravelerInfoSummaryType getTravelerInfoSummary() {
        return travelerInfoSummary;
    }

    /**
     * Sets the value of the travelerInfoSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerInfoSummaryType }
     *     
     */
    public void setTravelerInfoSummary(TravelerInfoSummaryType value) {
        this.travelerInfoSummary = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeTPAExtensionsType }
     *     
     */
    public ExchangeTPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeTPAExtensionsType }
     *     
     */
    public void setTPAExtensions(ExchangeTPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the originalTktIssueDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTktIssueDateTime() {
        return originalTktIssueDateTime;
    }

    /**
     * Sets the value of the originalTktIssueDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTktIssueDateTime(String value) {
        this.originalTktIssueDateTime = value;
    }

    /**
     * Gets the value of the exchangedTktIssueDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangedTktIssueDateTime() {
        return exchangedTktIssueDateTime;
    }

    /**
     * Sets the value of the exchangedTktIssueDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangedTktIssueDateTime(String value) {
        this.exchangedTktIssueDateTime = value;
    }

    /**
     * Gets the value of the previousExchangeDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousExchangeDateTime() {
        return previousExchangeDateTime;
    }

    /**
     * Sets the value of the previousExchangeDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousExchangeDateTime(String value) {
        this.previousExchangeDateTime = value;
    }

    /**
     * Gets the value of the numberOfTaxBoxes property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumberOfTaxBoxes() {
        return numberOfTaxBoxes;
    }

    /**
     * Sets the value of the numberOfTaxBoxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumberOfTaxBoxes(Short value) {
        this.numberOfTaxBoxes = value;
    }

    /**
     * Gets the value of the bypassAdvancePurchaseOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBypassAdvancePurchaseOption() {
        return bypassAdvancePurchaseOption;
    }

    /**
     * Sets the value of the bypassAdvancePurchaseOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBypassAdvancePurchaseOption(String value) {
        this.bypassAdvancePurchaseOption = value;
    }

}
