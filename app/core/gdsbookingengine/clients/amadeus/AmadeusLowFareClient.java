/**
 * Created by Ibrahim Olanrewaju on 12/2/2015.
 */

package core.gdsbookingengine.clients.amadeus;

import com.google.common.base.Strings;
import core.gdsbookingengine.*;
import models.CabinPreference;
import models.FlightType;
import services.amadeus.POSBuilder;
import services.amadeus.lowfareplus.*;
import services.utils.LowFarePlusPricedItineraryFactory;

import java.util.List;

public class AmadeusLowFareClient {


    public static OTAAirLowFareSearchPlusRS getOTAAirLowFareSearchPlusRS(FlightSearchRequest flightRequest) {
        return createOTAAirLowFareSearchPlusRS(createWsLowFarePlus().getWsLowFarePlusSoap(), createOTAAirLowFareSearchPlusRQ(flightRequest));
    }

    private static OTAAirLowFareSearchPlusRQ createOTAAirLowFareSearchPlusRQ(FlightSearchRequest flight) {
        OTAAirLowFareSearchPlusRQ otaAirLowFareSearchPlusRQ = new OTAAirLowFareSearchPlusRQ();

        otaAirLowFareSearchPlusRQ.setPOS(POSBuilder.createInstance());
        flight.getOriginDestinationRequests().forEach(originDestinationRequest ->
                otaAirLowFareSearchPlusRQ.getOriginDestinationInformation().add(createOriginDestinationInformation(originDestinationRequest)));
        otaAirLowFareSearchPlusRQ.setSpecificFlightInfo(createSpecificFlightInfo());
        otaAirLowFareSearchPlusRQ.setTravelPreferences(createTravelPreferences(createCabinPref(flight.getPreferredCabin()), flight.getFlightType(), flight.getPreferredAirline()));
        otaAirLowFareSearchPlusRQ.setTravelerInfoSummary(createTravelerInfoSummary(createAirTravelerAvail(flight.getPassengerTypes()), flight.getSeatCount()));

        return otaAirLowFareSearchPlusRQ;
    }

    private static OriginDestinationInformation createOriginDestinationInformation(OriginDestinationRequest originDestinationRequest) {
        OriginDestinationInformation originDestinationInformation = new OriginDestinationInformation();
        originDestinationInformation.setDepartureDateTime(createDepartureDateTime(originDestinationRequest.getDepartureDateTime()));
        originDestinationInformation.setOriginLocation(createOriginLocation(originDestinationRequest.getOrigin()));
        originDestinationInformation.setDestinationLocation(createDestinationLocation(originDestinationRequest.getDestination()));
        originDestinationInformation.setConnectionLocations(createArrayOfConnection());
        return originDestinationInformation;
    }

    private static OTAAirLowFareSearchPlusRS createOTAAirLowFareSearchPlusRS(WsLowFarePlusSoap wsLowFarePlusSoap, OTAAirLowFareSearchPlusRQ otaAirLowFareSearchPlusRQ) {
        return wsLowFarePlusSoap.wmLowFarePlus(otaAirLowFareSearchPlusRQ);
    }

    private static WsLowFarePlus createWsLowFarePlus() {
        return new WsLowFarePlus();
    }

    private static DepartureDateTime createDepartureDateTime(String value) {
        DepartureDateTime departureDateTime = new DepartureDateTime();
        departureDateTime.setValue(value);
        return departureDateTime;
    }

    private static OriginLocation createOriginLocation(String locationCode) {
        OriginLocation originLocation = new OriginLocation();
        originLocation.setLocationCode(locationCode);
        return originLocation;
    }

    private static DestinationLocation createDestinationLocation(String locationCode) {
        DestinationLocation destinationLocation = new DestinationLocation();
        destinationLocation.setLocationCode(locationCode);
        return  destinationLocation;
    }

    private static ArrayOfConnectionLocation createArrayOfConnection() {
        return new ArrayOfConnectionLocation();
    }

    private static SpecificFlightInfo createSpecificFlightInfo() {
        return new SpecificFlightInfo();
    }

    private static TravelPreferences createTravelPreferences(CabinPref cabinPref, FlightType flightType, String vendorPrefCode) {
        TravelPreferences travelPreferences = new TravelPreferences();

        if(!Strings.isNullOrEmpty(vendorPrefCode)) {
            VendorPref vendorPref = new VendorPref();
            vendorPref.setCode(vendorPrefCode);
            travelPreferences.getVendorPref().add(vendorPref);
        }

        if(flightType != null) {
            FlightTypePref flightTypePref = new FlightTypePref();
            flightTypePref.setFlightType(FlightTypePrefFlightType.fromValue(flightType.value()));
            travelPreferences.getFlightTypePref().add(flightTypePref);
        }

        travelPreferences.getCabinPref().add(cabinPref);
        return travelPreferences;
    }

    private static CabinPref createCabinPref(CabinPreference cabinPreference) {
        CabinPrefCabin cabinPrefCabin = CabinPrefCabin.fromValue(cabinPreference.value());
        CabinPref cabinPref = new CabinPref();
        cabinPref.setCabin(cabinPrefCabin);
        return cabinPref;
    }

    private static TravelerInfoSummary createTravelerInfoSummary(AirTravelerAvail airTravelerAvail, int numberOfSeatRequested) {
        TravelerInfoSummary travelerInfoSummary = new TravelerInfoSummary();
        travelerInfoSummary.getAirTravelerAvail().add(airTravelerAvail);
        travelerInfoSummary.getSeatsRequested().add(numberOfSeatRequested);
        return travelerInfoSummary;
    }

    private static AirTravelerAvail createAirTravelerAvail(List<core.gdsbookingengine.PassengerType> passengerTypes) {
        AirTravelerAvail airTravelerAvail = new AirTravelerAvail();
        passengerTypes.stream().forEach(passengerType -> {
                    PassengerTypeQuantity passengerTypeQuantity = new PassengerTypeQuantity();
                    passengerTypeQuantity.setCode(passengerType.getCode().value());
                    passengerTypeQuantity.setQuantity(passengerType.getQuantity());
                    airTravelerAvail.getPassengerTypeQuantity().add(passengerTypeQuantity);
                }
        );
        return airTravelerAvail;
    }
}