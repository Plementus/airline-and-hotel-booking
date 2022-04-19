
package services.amadeus.travelbuild;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgencyData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgencyData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Commission" type="{http://traveltalk.com/wsTravelBuild}AgencyDataCommission" minOccurs="0"/>
 *         &lt;element name="ServiceFee" type="{http://traveltalk.com/wsTravelBuild}AgencyDataServiceFee" minOccurs="0"/>
 *         &lt;element name="EndRules" type="{http://traveltalk.com/wsTravelBuild}EndRules" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgencyData", propOrder = {
    "commission",
    "serviceFee",
    "endRules"
})
public class AgencyData {

    @XmlElement(name = "Commission")
    protected AgencyDataCommission commission;
    @XmlElement(name = "ServiceFee")
    protected AgencyDataServiceFee serviceFee;
    @XmlElement(name = "EndRules")
    protected List<EndRules> endRules;

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyDataCommission }
     *     
     */
    public AgencyDataCommission getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyDataCommission }
     *     
     */
    public void setCommission(AgencyDataCommission value) {
        this.commission = value;
    }

    /**
     * Gets the value of the serviceFee property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyDataServiceFee }
     *     
     */
    public AgencyDataServiceFee getServiceFee() {
        return serviceFee;
    }

    /**
     * Sets the value of the serviceFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyDataServiceFee }
     *     
     */
    public void setServiceFee(AgencyDataServiceFee value) {
        this.serviceFee = value;
    }

    /**
     * Gets the value of the endRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndRules }
     * 
     * 
     */
    public List<EndRules> getEndRules() {
        if (endRules == null) {
            endRules = new ArrayList<EndRules>();
        }
        return this.endRules;
    }

}
