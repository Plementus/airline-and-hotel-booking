/**
 * Created by Ibrahim Olanrewaju on 4/4/2016.
 */

package core.gdsbookingengine.clients.sabre;

import core.gdsbookingengine.*;
import core.gdsbookingengine.booking.BookingRequest;
import core.gdsbookingengine.booking.BookingResponse;
import core.gdsbookingengine.clients.FlightBookingEngineService;
import models.GdsNames;
import play.Logger;
import play.libs.F;
import play.libs.Json;
import services.sabre.client.*;
//import services.sabre.enhancedairbook.EnhancedAirBookRS;
//import services.sabre.passengerdetails.PassengerDetailsRS;
import core.gdsbookingengine.NoCombinableFaresException;
import services.sabre.utils.UCSegStatusNotAllowedException;


public class SabreBookingEngine implements FlightBookingEngineService {

    @Override
    public GdsNames getGdsName() {
        return GdsNames.SABRE;
    }

    @Override
    public F.Promise<FlightSearchResponse> lowFareSearch(FlightSearchRequest flightRequest) {
        return F.Promise.pure(SabreSoapService.flight(flightRequest));
    }

    @Override
    public F.Promise<FlightSearchResponse> alternativeDateLowFareSearch(FlightSearchRequest flightRequest) {
        return F.Promise.pure(SabreSoapService.flight(flightRequest));
    }

    @Override
    public F.Promise<BookingResponse> checkAvailability(FlightAvailabilityRequest flightAvailabilityRequest) throws NoCombinableFaresException, UCSegStatusNotAllowedException {
        String binarySecurityToken = SessionClient.getSessionToken();
        return F.Promise.pure(SabreSoapService.enhancedAirBook(binarySecurityToken, flightAvailabilityRequest));
    }

    @Override
    public F.Promise<PNRDetails> generatePNRForItinerary(PricedItineraryWSResponse pricedItineraryWSResponseInterface, BookingRequest request) throws NoCombinableFaresException, UCSegStatusNotAllowedException {
        String binarySecurityToken =  SessionClient.getSessionToken();
        BookingResponse bookingResponse =  SabreSoapService.enhancedAirBook(binarySecurityToken, request.getFlightAvailabilityRequest());
        return F.Promise.pure(SabreSoapService.passengerDetails(binarySecurityToken, request, bookingResponse.getPriceQuotes()));
    }

//    private PNRDetails genPNR(PricedItineraryWSResponse pricedItineraryWSResponseInterface, BookingRequest request) {
//        //do the booking.
//        String binarySecurityToken = SessionClient.getSessionToken();
//        EnhancedAirBookRS enhancedAirBookRS = EnhancedAirBookClient.getEnhancedAirBookRS(request, binarySecurityToken);
//        //generate PNR
//        if (enhancedAirBookRS.getOTAAirPriceRS() == null) {
//            throw new NoCombinableFaresException();
//        } //
//        return PassengerDetailsClient.getPassengerDetailsRS(request, binarySecurityToken);
//    }

}