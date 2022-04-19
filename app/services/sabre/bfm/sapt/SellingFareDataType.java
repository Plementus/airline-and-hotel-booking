
package services.sabre.bfm.sapt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellingFareDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingFareDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HandlingMarkupSummary" type="{http://www.opentravel.org/OTA/2003/05}HandlingMarkupSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LayerTypeName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellingFareDataType", propOrder = {
    "handlingMarkupSummary"
})
public class SellingFareDataType {

    @XmlElement(name = "HandlingMarkupSummary")
    protected List<HandlingMarkupSummaryType> handlingMarkupSummary;
    @XmlAttribute(name = "LayerTypeName", required = true)
    protected String layerTypeName;

    /**
     * Gets the value of the handlingMarkupSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlingMarkupSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingMarkupSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HandlingMarkupSummaryType }
     * 
     * 
     */
    public List<HandlingMarkupSummaryType> getHandlingMarkupSummary() {
        if (handlingMarkupSummary == null) {
            handlingMarkupSummary = new ArrayList<HandlingMarkupSummaryType>();
        }
        return this.handlingMarkupSummary;
    }

    /**
     * Gets the value of the layerTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayerTypeName() {
        return layerTypeName;
    }

    /**
     * Sets the value of the layerTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayerTypeName(String value) {
        this.layerTypeName = value;
    }

}
