
package services.amadeus.travelbuild;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPTC_FareBreakdown complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPTC_FareBreakdown">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PTC_FareBreakdown" type="{http://traveltalk.com/wsTravelBuild}PTC_FareBreakdown" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPTC_FareBreakdown", propOrder = {
    "ptcFareBreakdown"
})
public class ArrayOfPTCFareBreakdown {

    @XmlElement(name = "PTC_FareBreakdown")
    protected List<PTCFareBreakdown> ptcFareBreakdown;

    /**
     * Gets the value of the ptcFareBreakdown property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptcFareBreakdown property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPTCFareBreakdown().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTCFareBreakdown }
     * 
     * 
     */
    public List<PTCFareBreakdown> getPTCFareBreakdown() {
        if (ptcFareBreakdown == null) {
            ptcFareBreakdown = new ArrayList<PTCFareBreakdown>();
        }
        return this.ptcFareBreakdown;
    }

}
