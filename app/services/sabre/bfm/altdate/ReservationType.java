
package services.sabre.bfm.altdate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}ReservationStatusType" />
 *       &lt;attribute name="RealStatus" type="{http://www.opentravel.org/OTA/2003/05}ReservationStatusType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationType")
public class ReservationType {

    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "RealStatus")
    protected String realStatus;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the realStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealStatus() {
        return realStatus;
    }

    /**
     * Sets the value of the realStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealStatus(String value) {
        this.realStatus = value;
    }

}
