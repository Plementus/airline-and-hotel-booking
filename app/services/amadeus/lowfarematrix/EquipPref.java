
package services.amadeus.lowfarematrix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for EquipPref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipPref">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="AirEquipType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ChangeofGauge" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsLowFareMatrix}EquipPrefPreferLevel" default="Preferred" />
 *       &lt;attribute name="WideBody" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipPref", propOrder = {
    "value"
})
public class EquipPref {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "AirEquipType")
    protected String airEquipType;
    @XmlAttribute(name = "ChangeofGauge")
    protected Boolean changeofGauge;
    @XmlAttribute(name = "PreferLevel")
    protected EquipPrefPreferLevel preferLevel;
    @XmlAttribute(name = "WideBody")
    protected Boolean wideBody;

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
     * Gets the value of the airEquipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirEquipType() {
        return airEquipType;
    }

    /**
     * Sets the value of the airEquipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirEquipType(String value) {
        this.airEquipType = value;
    }

    /**
     * Gets the value of the changeofGauge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isChangeofGauge() {
        if (changeofGauge == null) {
            return false;
        } else {
            return changeofGauge;
        }
    }

    /**
     * Sets the value of the changeofGauge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeofGauge(Boolean value) {
        this.changeofGauge = value;
    }

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link EquipPrefPreferLevel }
     *     
     */
    public EquipPrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return EquipPrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipPrefPreferLevel }
     *     
     */
    public void setPreferLevel(EquipPrefPreferLevel value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the wideBody property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWideBody() {
        return wideBody;
    }

    /**
     * Sets the value of the wideBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWideBody(Boolean value) {
        this.wideBody = value;
    }

}
