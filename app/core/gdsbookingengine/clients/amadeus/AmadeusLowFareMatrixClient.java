package core.gdsbookingengine.clients.amadeus;

import core.gdsbookingengine.FlightSearchRequest;
import core.gdsbookingengine.FlightSearchResponse;
import services.amadeus.lowfarematrix.OTAAirLowFareSearchMatrixRS;
import services.amadeus.lowfarematrix.WmLowFareMatrixXmlResponse;
import services.amadeus.lowfarematrix.WsLowFareMatrix;
import services.utils.soap.LowFareMatrixSoapUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;


public class AmadeusLowFareMatrixClient {

    public static OTAAirLowFareSearchMatrixRS getOTAAirLowFareSearchMatrixRS(FlightSearchRequest flightRequest) {
        WmLowFareMatrixXmlResponse wmLowFareMatrixXmlResponse = new WmLowFareMatrixXmlResponse();
        String wmLowFareMatrix = createWsLowFareMatrix().getWsLowFareMatrixSoap()
                .wmLowFareMatrixXml(LowFareMatrixSoapUtils.lowFareMatrixSoapMessage(flightRequest).toString());
        wmLowFareMatrixXmlResponse.setWmLowFareMatrixXmlResult(wmLowFareMatrix);
        OTAAirLowFareSearchMatrixRS oTAAirLowFareSearchMatrixRS;
        try {
            Unmarshaller unMarshaller = JAXBContext.newInstance(OTAAirLowFareSearchMatrixRS.class).createUnmarshaller();
            StringReader reader = new StringReader(wmLowFareMatrixXmlResponse.getWmLowFareMatrixXmlResult());
            JAXBElement<OTAAirLowFareSearchMatrixRS> root = unMarshaller.unmarshal(new StreamSource(reader), OTAAirLowFareSearchMatrixRS.class);

            oTAAirLowFareSearchMatrixRS = root.getValue();
        } catch (Exception jaxbEx) {
            throw new RuntimeException(jaxbEx);
        }
        return oTAAirLowFareSearchMatrixRS;
    }

    private static WsLowFareMatrix createWsLowFareMatrix() {
        return new WsLowFareMatrix();
    }
}