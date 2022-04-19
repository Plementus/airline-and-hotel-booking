
package services.amadeus.lowfarematrix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CabinPref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinPref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsLowFareMatrix}CabinPrefPreferLevel" default="Preferred" />
 *       &lt;attribute name="Cabin" type="{http://traveltalk.com/wsLowFareMatrix}CabinPrefCabin" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinPref")
public class CabinPref {

    @XmlAttribute(name = "PreferLevel")
    protected CabinPrefPreferLevel preferLevel;
    @XmlAttribute(name = "Cabin")
    protected CabinPrefCabin cabin;

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CabinPrefPreferLevel }
     *     
     */
    public CabinPrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return CabinPrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinPrefPreferLevel }
     *     
     */
    public void setPreferLevel(CabinPrefPreferLevel value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the cabin property.
     * 
     * @return
     *     possible object is
     *     {@link CabinPrefCabin }
     *     
     */
    public CabinPrefCabin getCabin() {
        return cabin;
    }

    /**
     * Sets the value of the cabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinPrefCabin }
     *     
     */
    public void setCabin(CabinPrefCabin value) {
        this.cabin = value;
    }

}
