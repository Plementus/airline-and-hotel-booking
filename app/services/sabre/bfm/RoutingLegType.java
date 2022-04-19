
package services.sabre.bfm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Definition of individual routing legs, at least one leg must be present.
 * 
 * <p>Java class for RoutingLegType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutingLegType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InboundCarrier" type="{http://www.opentravel.org/OTA/2003/05}RoutingAirlineCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConnectPoint" type="{http://www.opentravel.org/OTA/2003/05}RoutingAirportCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingLegType", propOrder = {
    "inboundCarrier",
    "connectPoint"
})
public class RoutingLegType {

    @XmlElement(name = "InboundCarrier")
    protected List<String> inboundCarrier;
    @XmlElement(name = "ConnectPoint")
    protected List<String> connectPoint;

    /**
     * Gets the value of the inboundCarrier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inboundCarrier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInboundCarrier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInboundCarrier() {
        if (inboundCarrier == null) {
            inboundCarrier = new ArrayList<String>();
        }
        return this.inboundCarrier;
    }

    /**
     * Gets the value of the connectPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getConnectPoint() {
        if (connectPoint == null) {
            connectPoint = new ArrayList<String>();
        }
        return this.connectPoint;
    }

}
