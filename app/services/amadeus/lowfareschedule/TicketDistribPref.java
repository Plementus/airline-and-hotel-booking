
package services.amadeus.lowfareschedule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for TicketDistribPref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketDistribPref">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsLowFareSchedule}TicketDistribPrefPreferLevel" default="Preferred" />
 *       &lt;attribute name="DistribType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TicketTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketDistribPref", propOrder = {
    "value"
})
public class TicketDistribPref {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "PreferLevel")
    protected TicketDistribPrefPreferLevel preferLevel;
    @XmlAttribute(name = "DistribType")
    protected String distribType;
    @XmlAttribute(name = "TicketTime")
    protected String ticketTime;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link TicketDistribPrefPreferLevel }
     *     
     */
    public TicketDistribPrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return TicketDistribPrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketDistribPrefPreferLevel }
     *     
     */
    public void setPreferLevel(TicketDistribPrefPreferLevel value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the distribType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribType() {
        return distribType;
    }

    /**
     * Sets the value of the distribType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribType(String value) {
        this.distribType = value;
    }

    /**
     * Gets the value of the ticketTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketTime() {
        return ticketTime;
    }

    /**
     * Sets the value of the ticketTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketTime(String value) {
        this.ticketTime = value;
    }

}
