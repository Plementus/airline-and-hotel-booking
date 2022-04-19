package core.gdsbookingengine.clients.amadeus;

import core.gdsbookingengine.*;
import core.gdsbookingengine.clients.FlightBookingEngineService;
import models.*;
import play.libs.F;

import core.gdsbookingengine.booking.*;
import services.sabre.client.FlightAvailabilityRequest;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/24/15 1:33 AM
 * |
 **/

public class AmadeusBookingEngine implements FlightBookingEngineService {

    public GdsNames getGdsName() {
        return GdsNames.AMADEUS;
    }

    @Override
    public F.Promise<FlightSearchResponse> lowFareSearch(FlightSearchRequest flightSearchRequest) {
//        return AmadeusFlightSearchService.getLowFareRQ(flightSearchRequest);
        return null;
    }

    @Override
    public F.Promise<FlightSearchResponse> alternativeDateLowFareSearch(FlightSearchRequest flightSearchRequest) {
//        return AmadeusFlightSearchService.getLowFareMatrixRQ(flightSearchRequest);
        return null;
    }

    @Override
    public F.Promise<PNRDetails> generatePNRForItinerary(PricedItineraryWSResponse pricedItineraryWSResponseInterface, BookingRequest bookingRequest) {
//        return AmadeusPnrClient.issuePNR(pricedItineraryWSResponseInterface, bookingRequest);
        return null;
    }

    @Override
    public F.Promise<BookingResponse> checkAvailability(FlightAvailabilityRequest flightAvailabilityRequest) {
        return null;
    }

}
