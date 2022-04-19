
package services.sabre.passengerdetails;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Base type for request messages.
 * 
 * <p>Java class for STL_Request_Payload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STL_Request_Payload">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.sabre.com/STL_Payload/v02_01}STL_Payload">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STL_Request_Payload", namespace = "http://services.sabre.com/STL_Payload/v02_01")
@XmlSeeAlso({
    PassengerDetailsRQ.class
})
public class STLRequestPayload
    extends STLPayload
{


}
