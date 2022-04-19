package core.gdsbookingengine.airFlifo;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 28/02/2016 9:06 AM
 * |
 **/

import play.libs.Json;
import services.amadeus.airfliforq.*;

public final class FlightInfoClient {

    public static FlightInformation getAirFlifo(AirFlifoRequest request) {
        OTAAirFlifoRQ otaAirFlifoRQ = new AirFlifoService(request).otaAirFlifoRQ();
        WsAirFlifoSoap wsAirFlifoSoap = new WsAirFlifo().getWsAirFlifoSoap();
        OTAAirFlifoRS otaAirFlifoRS = wsAirFlifoSoap.wmAirFlifo(otaAirFlifoRQ);
        return setResponse(otaAirFlifoRS);
    }

    private static FlightInformation setResponse(OTAAirFlifoRS airFlifoRS) {
        FlightInfoDetails wsInfoDetails = airFlifoRS.getFlightInfoDetails();
        Json.toJson(""+ wsInfoDetails);
        FlightInformation flightInformation = new FlightInformation();
        flightInformation.setComment(wsInfoDetails.getComment());
        flightInformation.setFlightLegInfo(wsInfoDetails.getFlightLegInfo());
        flightInformation.setMessageStatus(wsInfoDetails.getMessageStatus());
        flightInformation.setTotalFlightTime(wsInfoDetails.getTotalFlightTime());
        flightInformation.setTotalGroundTime(wsInfoDetails.getTotalGroundTime());
        flightInformation.setTotalMiles(wsInfoDetails.getTotalMiles());
        flightInformation.setTotalTripTime(wsInfoDetails.getTotalTripTime());
        return flightInformation;
    }

}