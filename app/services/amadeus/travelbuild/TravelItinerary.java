
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelItinerary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelItinerary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItineraryRef" type="{http://traveltalk.com/wsTravelBuild}ItineraryRef" minOccurs="0"/>
 *         &lt;element name="CustomerInfos" type="{http://traveltalk.com/wsTravelBuild}CustomerInfosRS" minOccurs="0"/>
 *         &lt;element name="ItineraryInfo" type="{http://traveltalk.com/wsTravelBuild}ItineraryInfo" minOccurs="0"/>
 *         &lt;element name="AssociatedContent" type="{http://traveltalk.com/wsTravelBuild}AssociatedContent" minOccurs="0"/>
 *         &lt;element name="TravelCost" type="{http://traveltalk.com/wsTravelBuild}TravelCost" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{http://traveltalk.com/wsTravelBuild}RemarksRS" minOccurs="0"/>
 *         &lt;element name="UpdatedBy" type="{http://traveltalk.com/wsTravelBuild}UpdatedBy" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://traveltalk.com/wsTravelBuild}TPA_ExtensionsRS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelItinerary", propOrder = {
    "itineraryRef",
    "customerInfos",
    "itineraryInfo",
    "associatedContent",
    "travelCost",
    "remarks",
    "updatedBy",
    "tpaExtensions"
})
public class TravelItinerary {

    @XmlElement(name = "ItineraryRef")
    protected ItineraryRef itineraryRef;
    @XmlElement(name = "CustomerInfos")
    protected CustomerInfosRS customerInfos;
    @XmlElement(name = "ItineraryInfo")
    protected ItineraryInfo itineraryInfo;
    @XmlElement(name = "AssociatedContent")
    protected AssociatedContent associatedContent;
    @XmlElement(name = "TravelCost")
    protected TravelCost travelCost;
    @XmlElement(name = "Remarks")
    protected RemarksRS remarks;
    @XmlElement(name = "UpdatedBy")
    protected UpdatedBy updatedBy;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsRS tpaExtensions;

    /**
     * Gets the value of the itineraryRef property.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryRef }
     *     
     */
    public ItineraryRef getItineraryRef() {
        return itineraryRef;
    }

    /**
     * Sets the value of the itineraryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryRef }
     *     
     */
    public void setItineraryRef(ItineraryRef value) {
        this.itineraryRef = value;
    }

    /**
     * Gets the value of the customerInfos property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfosRS }
     *     
     */
    public CustomerInfosRS getCustomerInfos() {
        return customerInfos;
    }

    /**
     * Sets the value of the customerInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfosRS }
     *     
     */
    public void setCustomerInfos(CustomerInfosRS value) {
        this.customerInfos = value;
    }

    /**
     * Gets the value of the itineraryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryInfo }
     *     
     */
    public ItineraryInfo getItineraryInfo() {
        return itineraryInfo;
    }

    /**
     * Sets the value of the itineraryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryInfo }
     *     
     */
    public void setItineraryInfo(ItineraryInfo value) {
        this.itineraryInfo = value;
    }

    /**
     * Gets the value of the associatedContent property.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedContent }
     *     
     */
    public AssociatedContent getAssociatedContent() {
        return associatedContent;
    }

    /**
     * Sets the value of the associatedContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedContent }
     *     
     */
    public void setAssociatedContent(AssociatedContent value) {
        this.associatedContent = value;
    }

    /**
     * Gets the value of the travelCost property.
     * 
     * @return
     *     possible object is
     *     {@link TravelCost }
     *     
     */
    public TravelCost getTravelCost() {
        return travelCost;
    }

    /**
     * Sets the value of the travelCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelCost }
     *     
     */
    public void setTravelCost(TravelCost value) {
        this.travelCost = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link RemarksRS }
     *     
     */
    public RemarksRS getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarksRS }
     *     
     */
    public void setRemarks(RemarksRS value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the updatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedBy }
     *     
     */
    public UpdatedBy getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedBy }
     *     
     */
    public void setUpdatedBy(UpdatedBy value) {
        this.updatedBy = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsRS }
     *     
     */
    public TPAExtensionsRS getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsRS }
     *     
     */
    public void setTPAExtensions(TPAExtensionsRS value) {
        this.tpaExtensions = value;
    }

}
