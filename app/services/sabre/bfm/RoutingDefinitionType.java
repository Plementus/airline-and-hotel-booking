
package services.sabre.bfm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Definition of a routing
 * 
 * <p>Java class for RoutingDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutingDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoutingLeg" type="{http://www.opentravel.org/OTA/2003/05}RoutingLegType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AddWildcards" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingDefinitionType", propOrder = {
    "routingLeg"
})
public class RoutingDefinitionType {

    @XmlElement(name = "RoutingLeg", required = true)
    protected List<RoutingLegType> routingLeg;
    @XmlAttribute(name = "AddWildcards")
    protected Boolean addWildcards;

    /**
     * Gets the value of the routingLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutingLegType }
     * 
     * 
     */
    public List<RoutingLegType> getRoutingLeg() {
        if (routingLeg == null) {
            routingLeg = new ArrayList<RoutingLegType>();
        }
        return this.routingLeg;
    }

    /**
     * Gets the value of the addWildcards property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddWildcards() {
        return addWildcards;
    }

    /**
     * Sets the value of the addWildcards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddWildcards(Boolean value) {
        this.addWildcards = value;
    }

}
