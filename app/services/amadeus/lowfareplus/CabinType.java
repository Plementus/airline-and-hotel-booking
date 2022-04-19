
package services.amadeus.lowfareplus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CabinType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Cabin" use="required" type="{http://traveltalk.com/wsLowFarePlus}CabinTypeCabin" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinType")
public class CabinType {

    @XmlAttribute(name = "Cabin", required = true)
    protected CabinTypeCabin cabin;

    /**
     * Gets the value of the cabin property.
     * 
     * @return
     *     possible object is
     *     {@link CabinTypeCabin }
     *     
     */
    public CabinTypeCabin getCabin() {
        return cabin;
    }

    /**
     * Sets the value of the cabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinTypeCabin }
     *     
     */
    public void setCabin(CabinTypeCabin value) {
        this.cabin = value;
    }

}
