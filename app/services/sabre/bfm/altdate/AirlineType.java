
package services.sabre.bfm.altdate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirlineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Operating" use="required" type="{http://www.opentravel.org/OTA/2003/05}CarrierCode" />
 *       &lt;attribute name="Marketing" use="required" type="{http://www.opentravel.org/OTA/2003/05}CarrierCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineType")
public class AirlineType {

    @XmlAttribute(name = "Operating", required = true)
    protected String operating;
    @XmlAttribute(name = "Marketing", required = true)
    protected String marketing;

    /**
     * Gets the value of the operating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperating() {
        return operating;
    }

    /**
     * Sets the value of the operating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperating(String value) {
        this.operating = value;
    }

    /**
     * Gets the value of the marketing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketing() {
        return marketing;
    }

    /**
     * Sets the value of the marketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketing(String value) {
        this.marketing = value;
    }

}
