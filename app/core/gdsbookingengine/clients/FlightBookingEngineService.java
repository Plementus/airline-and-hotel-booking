package core.gdsbookingengine.clients;

import core.gdsbookingengine.*;
import core.gdsbookingengine.booking.BookingRequest;
import core.gdsbookingengine.booking.BookingResponse;
import models.*;
import play.libs.F;
import services.sabre.client.FlightAvailabilityRequest;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 12/7/15 10:04 PM
 * |
 **/

public interface FlightBookingEngineService {

    GdsNames getGdsName();

    F.Promise<FlightSearchResponse> lowFareSearch(FlightSearchRequest flightSearchRequest);

    F.Promise<FlightSearchResponse> alternativeDateLowFareSearch(FlightSearchRequest flightSearchRequest);

    F.Promise<PNRDetails> generatePNRForItinerary(PricedItineraryWSResponse pricedItineraryWSResponseInterface, BookingRequest bookingRequest);

    F.Promise<BookingResponse> checkAvailability(FlightAvailabilityRequest flightAvailabilityRequest);
}