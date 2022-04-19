
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialRemarkRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRemarkRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TravelerRefNumber" type="{http://traveltalk.com/wsTravelBuild}TravelerRefNumber" minOccurs="0"/>
 *         &lt;element name="FlightRefNumber" type="{http://traveltalk.com/wsTravelBuild}FlightRefNumber" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vendor" type="{http://traveltalk.com/wsTravelBuild}Vendor" minOccurs="0"/>
 *         &lt;element name="RemarkDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemarkOrigin" type="{http://traveltalk.com/wsTravelBuild}RemarkOriginEnum"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RemarkType" use="required" type="{http://traveltalk.com/wsTravelBuild}SpecialRemarkRemarkTypeRS" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRemarkRS", propOrder = {
    "travelerRefNumber",
    "flightRefNumber",
    "text",
    "vendor",
    "remarkDateTime",
    "remarkOrigin"
})
public class SpecialRemarkRS {

    @XmlElement(name = "TravelerRefNumber")
    protected TravelerRefNumber travelerRefNumber;
    @XmlElement(name = "FlightRefNumber")
    protected FlightRefNumber flightRefNumber;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "Vendor")
    protected Vendor vendor;
    @XmlElement(name = "RemarkDateTime")
    protected String remarkDateTime;
    @XmlElement(name = "RemarkOrigin", required = true)
    @XmlSchemaType(name = "string")
    protected RemarkOriginEnum remarkOrigin;
    @XmlAttribute(name = "RemarkType", required = true)
    protected SpecialRemarkRemarkTypeRS remarkType;
    @XmlAttribute(name = "RPH")
    protected String rph;

    /**
     * Gets the value of the travelerRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerRefNumber }
     *     
     */
    public TravelerRefNumber getTravelerRefNumber() {
        return travelerRefNumber;
    }

    /**
     * Sets the value of the travelerRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerRefNumber }
     *     
     */
    public void setTravelerRefNumber(TravelerRefNumber value) {
        this.travelerRefNumber = value;
    }

    /**
     * Gets the value of the flightRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link FlightRefNumber }
     *     
     */
    public FlightRefNumber getFlightRefNumber() {
        return flightRefNumber;
    }

    /**
     * Sets the value of the flightRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightRefNumber }
     *     
     */
    public void setFlightRefNumber(FlightRefNumber value) {
        this.flightRefNumber = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link Vendor }
     *     
     */
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vendor }
     *     
     */
    public void setVendor(Vendor value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the remarkDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkDateTime() {
        return remarkDateTime;
    }

    /**
     * Sets the value of the remarkDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarkDateTime(String value) {
        this.remarkDateTime = value;
    }

    /**
     * Gets the value of the remarkOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link RemarkOriginEnum }
     *     
     */
    public RemarkOriginEnum getRemarkOrigin() {
        return remarkOrigin;
    }

    /**
     * Sets the value of the remarkOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarkOriginEnum }
     *     
     */
    public void setRemarkOrigin(RemarkOriginEnum value) {
        this.remarkOrigin = value;
    }

    /**
     * Gets the value of the remarkType property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRemarkRemarkTypeRS }
     *     
     */
    public SpecialRemarkRemarkTypeRS getRemarkType() {
        return remarkType;
    }

    /**
     * Sets the value of the remarkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRemarkRemarkTypeRS }
     *     
     */
    public void setRemarkType(SpecialRemarkRemarkTypeRS value) {
        this.remarkType = value;
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
