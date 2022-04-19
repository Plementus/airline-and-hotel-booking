
package services.amadeus.lowfareschedule;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "wsLowFareScheduleSoap", targetNamespace = "http://traveltalk.com/wsLowFareSchedule")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WsLowFareScheduleSoap {


    /**
     * Process Low Fare Plus Messages Request.
     * 
     * @param otaAirLowFareSearchScheduleRQ
     * @return
     *     returns soap.client.lowfareschedule.OTAAirLowFareSearchScheduleRS
     */
    @WebMethod(action = "http://traveltalk.com/wsLowFareSchedule/wmLowFareSchedule")
    @WebResult(name = "OTA_AirLowFareSearchPlusRS", targetNamespace = "http://traveltalk.com/wsLowFareSchedule")
    @RequestWrapper(localName = "wmLowFareSchedule", targetNamespace = "http://traveltalk.com/wsLowFareSchedule", className = "soap.client.lowfareschedule.WmLowFareSchedule")
    @ResponseWrapper(localName = "wmLowFareScheduleResponse", targetNamespace = "http://traveltalk.com/wsLowFareSchedule", className = "soap.client.lowfareschedule.WmLowFareScheduleResponse")
    public OTAAirLowFareSearchScheduleRS wmLowFareSchedule(
            @WebParam(name = "OTA_AirLowFareSearchScheduleRQ", targetNamespace = "http://traveltalk.com/wsLowFareSchedule")
                    OTAAirLowFareSearchScheduleRQ otaAirLowFareSearchScheduleRQ);

    /**
     * Process Low Fare Plus Xml Messages Request.
     * 
     * @param xmlRequest
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://traveltalk.com/wsLowFareSchedule/wmLowFareScheduleXml")
    @WebResult(name = "wmLowFareScheduleXmlResult", targetNamespace = "http://traveltalk.com/wsLowFareSchedule")
    @RequestWrapper(localName = "wmLowFareScheduleXml", targetNamespace = "http://traveltalk.com/wsLowFareSchedule", className = "soap.client.lowfareschedule.WmLowFareScheduleXml")
    @ResponseWrapper(localName = "wmLowFareScheduleXmlResponse", targetNamespace = "http://traveltalk.com/wsLowFareSchedule", className = "soap.client.lowfareschedule.WmLowFareScheduleXmlResponse")
    public String wmLowFareScheduleXml(
            @WebParam(name = "xmlRequest", targetNamespace = "http://traveltalk.com/wsLowFareSchedule")
                    String xmlRequest);

}