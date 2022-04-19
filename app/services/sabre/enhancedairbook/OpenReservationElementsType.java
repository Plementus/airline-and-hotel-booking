
package services.sabre.enhancedairbook;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenReservationElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenReservationElementsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OpenReservationElement" type="{http://services.sabre.com/sp/eab/v3_2}OpenReservationElementType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenReservationElementsType", propOrder = {
    "openReservationElement"
})
@XmlSeeAlso({
    EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.OpenReservationElements.class
})
public class OpenReservationElementsType {

    @XmlElement(name = "OpenReservationElement")
    protected List<OpenReservationElementType> openReservationElement;

    /**
     * Gets the value of the openReservationElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the openReservationElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpenReservationElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenReservationElementType }
     * 
     * 
     */
    public List<OpenReservationElementType> getOpenReservationElement() {
        if (openReservationElement == null) {
            openReservationElement = new ArrayList<OpenReservationElementType>();
        }
        return this.openReservationElement;
    }

}
