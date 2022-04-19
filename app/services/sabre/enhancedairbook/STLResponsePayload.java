
package services.sabre.enhancedairbook;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Base type for response messages.
 * 
 * <p>Java class for STL_Response_Payload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STL_Response_Payload">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.sabre.com/STL_Payload/v02_01}STL_Payload">
 *       &lt;sequence>
 *         &lt;element ref="{http://services.sabre.com/STL_Payload/v02_01}ApplicationResults" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STL_Response_Payload", namespace = "http://services.sabre.com/STL_Payload/v02_01", propOrder = {
    "applicationResults"
})
@XmlSeeAlso({
    EnhancedAirBookRS.class
})
public class STLResponsePayload
    extends STLPayload
{

    @XmlElement(name = "ApplicationResults")
    protected ApplicationResults applicationResults;

    /**
     * Gets the value of the applicationResults property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationResults }
     *     
     */
    public ApplicationResults getApplicationResults() {
        return applicationResults;
    }

    /**
     * Sets the value of the applicationResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationResults }
     *     
     */
    public void setApplicationResults(ApplicationResults value) {
        this.applicationResults = value;
    }

}
