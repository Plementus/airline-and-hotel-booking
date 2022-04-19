
package services.amadeus.airfliforq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightInfoDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightInfoDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightLegInfo" type="{http://traveltalk.com/wsAirFlifo}FlightLegInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://traveltalk.com/wsAirFlifo}Comment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MessageStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TotalFlightTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TotalGroundTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TotalTripTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TotalMiles" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightInfoDetails", propOrder = {
    "flightLegInfo",
    "comment"
})
public class FlightInfoDetails {

    @XmlElement(name = "FlightLegInfo")
    protected List<FlightLegInfo> flightLegInfo;
    @XmlElement(name = "Comment")
    protected List<Comment> comment;
    @XmlAttribute(name = "MessageStatus")
    protected String messageStatus;
    @XmlAttribute(name = "TotalFlightTime")
    protected String totalFlightTime;
    @XmlAttribute(name = "TotalGroundTime")
    protected String totalGroundTime;
    @XmlAttribute(name = "TotalTripTime")
    protected String totalTripTime;
    @XmlAttribute(name = "TotalMiles")
    protected Integer totalMiles;

    /**
     * Gets the value of the flightLegInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightLegInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightLegInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightLegInfo }
     * 
     * 
     */
    public List<FlightLegInfo> getFlightLegInfo() {
        if (flightLegInfo == null) {
            flightLegInfo = new ArrayList<FlightLegInfo>();
        }
        return this.flightLegInfo;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getComment() {
        if (comment == null) {
            comment = new ArrayList<Comment>();
        }
        return this.comment;
    }

    /**
     * Gets the value of the messageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageStatus() {
        return messageStatus;
    }

    /**
     * Sets the value of the messageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageStatus(String value) {
        this.messageStatus = value;
    }

    /**
     * Gets the value of the totalFlightTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalFlightTime() {
        return totalFlightTime;
    }

    /**
     * Sets the value of the totalFlightTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFlightTime(String value) {
        this.totalFlightTime = value;
    }

    /**
     * Gets the value of the totalGroundTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalGroundTime() {
        return totalGroundTime;
    }

    /**
     * Sets the value of the totalGroundTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalGroundTime(String value) {
        this.totalGroundTime = value;
    }

    /**
     * Gets the value of the totalTripTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTripTime() {
        return totalTripTime;
    }

    /**
     * Sets the value of the totalTripTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTripTime(String value) {
        this.totalTripTime = value;
    }

    /**
     * Gets the value of the totalMiles property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalMiles() {
        return totalMiles;
    }

    /**
     * Sets the value of the totalMiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalMiles(Integer value) {
        this.totalMiles = value;
    }

}
