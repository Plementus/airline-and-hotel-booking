
package services.amadeus.lowfareplus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for ConnectionLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionLocation">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" default="IATA" />
 *       &lt;attribute name="Inclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsLowFarePlus}ConnectionLocationPreferLevel" default="Preferred" />
 *       &lt;attribute name="MinChangeTime" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ConnectionInfo" type="{http://traveltalk.com/wsLowFarePlus}ConnectionLocationConnectionInfo" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionLocation", propOrder = {
    "value"
})
public class ConnectionLocation {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "LocationCode")
    protected String locationCode;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;
    @XmlAttribute(name = "Inclusive")
    protected Boolean inclusive;
    @XmlAttribute(name = "PreferLevel")
    protected ConnectionLocationPreferLevel preferLevel;
    @XmlAttribute(name = "MinChangeTime")
    protected Integer minChangeTime;
    @XmlAttribute(name = "ConnectionInfo")
    protected ConnectionLocationConnectionInfo connectionInfo;

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
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the codeContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeContext() {
        if (codeContext == null) {
            return "IATA";
        } else {
            return codeContext;
        }
    }

    /**
     * Sets the value of the codeContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeContext(String value) {
        this.codeContext = value;
    }

    /**
     * Gets the value of the inclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInclusive() {
        if (inclusive == null) {
            return true;
        } else {
            return inclusive;
        }
    }

    /**
     * Sets the value of the inclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInclusive(Boolean value) {
        this.inclusive = value;
    }

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionLocationPreferLevel }
     *     
     */
    public ConnectionLocationPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return ConnectionLocationPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionLocationPreferLevel }
     *     
     */
    public void setPreferLevel(ConnectionLocationPreferLevel value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the minChangeTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinChangeTime() {
        return minChangeTime;
    }

    /**
     * Sets the value of the minChangeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinChangeTime(Integer value) {
        this.minChangeTime = value;
    }

    /**
     * Gets the value of the connectionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionLocationConnectionInfo }
     *     
     */
    public ConnectionLocationConnectionInfo getConnectionInfo() {
        return connectionInfo;
    }

    /**
     * Sets the value of the connectionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionLocationConnectionInfo }
     *     
     */
    public void setConnectionInfo(ConnectionLocationConnectionInfo value) {
        this.connectionInfo = value;
    }

}
