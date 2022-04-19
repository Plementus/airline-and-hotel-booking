
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialReqDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialReqDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeatRequests" type="{http://traveltalk.com/wsTravelBuild}ArrayOfSeatRequest" minOccurs="0"/>
 *         &lt;element name="SpecialServiceRequests" type="{http://traveltalk.com/wsTravelBuild}ArrayOfSpecialServiceRequest" minOccurs="0"/>
 *         &lt;element name="OtherServiceInformations" type="{http://traveltalk.com/wsTravelBuild}ArrayOfOtherServiceInformation" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{http://traveltalk.com/wsTravelBuild}ArrayOfString2" minOccurs="0"/>
 *         &lt;element name="CategorizedRemarks" type="{http://traveltalk.com/wsTravelBuild}ArrayOfCategorizedRemark" minOccurs="0"/>
 *         &lt;element name="UniqueRemarks" type="{http://traveltalk.com/wsTravelBuild}ArrayOfUniqueRemark" minOccurs="0"/>
 *         &lt;element name="SpecialRemarks" type="{http://traveltalk.com/wsTravelBuild}ArrayOfSpecialRemark" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialReqDetails", propOrder = {
    "seatRequests",
    "specialServiceRequests",
    "otherServiceInformations",
    "remarks",
    "categorizedRemarks",
    "uniqueRemarks",
    "specialRemarks"
})
public class SpecialReqDetails {

    @XmlElement(name = "SeatRequests")
    protected ArrayOfSeatRequest seatRequests;
    @XmlElement(name = "SpecialServiceRequests")
    protected ArrayOfSpecialServiceRequest specialServiceRequests;
    @XmlElement(name = "OtherServiceInformations")
    protected ArrayOfOtherServiceInformation otherServiceInformations;
    @XmlElement(name = "Remarks")
    protected ArrayOfString2 remarks;
    @XmlElement(name = "CategorizedRemarks")
    protected ArrayOfCategorizedRemark categorizedRemarks;
    @XmlElement(name = "UniqueRemarks")
    protected ArrayOfUniqueRemark uniqueRemarks;
    @XmlElement(name = "SpecialRemarks")
    protected ArrayOfSpecialRemark specialRemarks;

    /**
     * Gets the value of the seatRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSeatRequest }
     *     
     */
    public ArrayOfSeatRequest getSeatRequests() {
        return seatRequests;
    }

    /**
     * Sets the value of the seatRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSeatRequest }
     *     
     */
    public void setSeatRequests(ArrayOfSeatRequest value) {
        this.seatRequests = value;
    }

    /**
     * Gets the value of the specialServiceRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialServiceRequest }
     *     
     */
    public ArrayOfSpecialServiceRequest getSpecialServiceRequests() {
        return specialServiceRequests;
    }

    /**
     * Sets the value of the specialServiceRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialServiceRequest }
     *     
     */
    public void setSpecialServiceRequests(ArrayOfSpecialServiceRequest value) {
        this.specialServiceRequests = value;
    }

    /**
     * Gets the value of the otherServiceInformations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOtherServiceInformation }
     *     
     */
    public ArrayOfOtherServiceInformation getOtherServiceInformations() {
        return otherServiceInformations;
    }

    /**
     * Sets the value of the otherServiceInformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOtherServiceInformation }
     *     
     */
    public void setOtherServiceInformations(ArrayOfOtherServiceInformation value) {
        this.otherServiceInformations = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString2 }
     *     
     */
    public ArrayOfString2 getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString2 }
     *     
     */
    public void setRemarks(ArrayOfString2 value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the categorizedRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCategorizedRemark }
     *     
     */
    public ArrayOfCategorizedRemark getCategorizedRemarks() {
        return categorizedRemarks;
    }

    /**
     * Sets the value of the categorizedRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCategorizedRemark }
     *     
     */
    public void setCategorizedRemarks(ArrayOfCategorizedRemark value) {
        this.categorizedRemarks = value;
    }

    /**
     * Gets the value of the uniqueRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUniqueRemark }
     *     
     */
    public ArrayOfUniqueRemark getUniqueRemarks() {
        return uniqueRemarks;
    }

    /**
     * Sets the value of the uniqueRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUniqueRemark }
     *     
     */
    public void setUniqueRemarks(ArrayOfUniqueRemark value) {
        this.uniqueRemarks = value;
    }

    /**
     * Gets the value of the specialRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialRemark }
     *     
     */
    public ArrayOfSpecialRemark getSpecialRemarks() {
        return specialRemarks;
    }

    /**
     * Sets the value of the specialRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialRemark }
     *     
     */
    public void setSpecialRemarks(ArrayOfSpecialRemark value) {
        this.specialRemarks = value;
    }

}
