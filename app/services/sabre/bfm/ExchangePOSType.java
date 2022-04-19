
package services.sabre.bfm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangePOSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangePOSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Source" type="{http://www.opentravel.org/OTA/2003/05}ExchangeSourceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangePOSType", propOrder = {
    "source"
})
public class ExchangePOSType {

    @XmlElement(name = "Source", required = true)
    protected ExchangeSourceType source;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeSourceType }
     *     
     */
    public ExchangeSourceType getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeSourceType }
     *     
     */
    public void setSource(ExchangeSourceType value) {
        this.source = value;
    }

}
