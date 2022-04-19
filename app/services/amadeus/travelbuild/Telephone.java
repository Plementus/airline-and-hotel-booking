
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Telephone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Telephone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ShareSynchInd" type="{http://traveltalk.com/wsTravelBuild}TelephoneShareSynchInd" />
 *       &lt;attribute name="ShareMarketInd" type="{http://traveltalk.com/wsTravelBuild}TelephoneShareMarketInd" />
 *       &lt;attribute name="PhoneLocationType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PhoneTechType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CountryAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AreaCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FormattedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Telephone")
public class Telephone {

    @XmlAttribute(name = "ShareSynchInd")
    protected TelephoneShareSynchInd shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected TelephoneShareMarketInd shareMarketInd;
    @XmlAttribute(name = "PhoneLocationType")
    protected String phoneLocationType;
    @XmlAttribute(name = "PhoneTechType")
    protected String phoneTechType;
    @XmlAttribute(name = "CountryAccessCode")
    protected String countryAccessCode;
    @XmlAttribute(name = "AreaCityCode")
    protected String areaCityCode;
    @XmlAttribute(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlAttribute(name = "Extension")
    protected String extension;
    @XmlAttribute(name = "PIN")
    protected String pin;
    @XmlAttribute(name = "FormattedInd")
    protected Boolean formattedInd;

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneShareSynchInd }
     *     
     */
    public TelephoneShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneShareSynchInd }
     *     
     */
    public void setShareSynchInd(TelephoneShareSynchInd value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneShareMarketInd }
     *     
     */
    public TelephoneShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneShareMarketInd }
     *     
     */
    public void setShareMarketInd(TelephoneShareMarketInd value) {
        this.shareMarketInd = value;
    }

    /**
     * Gets the value of the phoneLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneLocationType() {
        return phoneLocationType;
    }

    /**
     * Sets the value of the phoneLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneLocationType(String value) {
        this.phoneLocationType = value;
    }

    /**
     * Gets the value of the phoneTechType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneTechType() {
        return phoneTechType;
    }

    /**
     * Sets the value of the phoneTechType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneTechType(String value) {
        this.phoneTechType = value;
    }

    /**
     * Gets the value of the countryAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryAccessCode() {
        return countryAccessCode;
    }

    /**
     * Sets the value of the countryAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryAccessCode(String value) {
        this.countryAccessCode = value;
    }

    /**
     * Gets the value of the areaCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCityCode() {
        return areaCityCode;
    }

    /**
     * Sets the value of the areaCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCityCode(String value) {
        this.areaCityCode = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIN(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the formattedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFormattedInd() {
        if (formattedInd == null) {
            return false;
        } else {
            return formattedInd;
        }
    }

    /**
     * Sets the value of the formattedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFormattedInd(Boolean value) {
        this.formattedInd = value;
    }

}
