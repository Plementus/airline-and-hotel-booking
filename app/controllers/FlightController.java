package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import controllers.*;
import controllers.abstracts.BaseController;
import core.*;
import core.gdsbookingengine.*;
import core.gdsbookingengine.booking.BookingRequest;
import core.gdsbookingengine.booking.Passenger;
import core.gdsbookingengine.clients.FlightServiceClient;
import core.gdsbookingengine.clients.FlightCacheClient;
import core.security.Auth;
import core.security.AuthServices;
import models.*;
import org.apache.commons.lang3.text.WordUtils;
import play.Logger;
import play.data.DynamicForm;
import play.libs.F;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import core.gdsbookingengine.NoCombinableFaresException;
import services.sabre.client.FlightAvailabilityRequest;

import java.util.*;
import java.util.stream.Collectors;

import static models.AppFeatureLibraries.b2c_flight_booking_form;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/25/15 8:45 AM
 * |
 **/

public class FlightController extends BaseController {

    public static Result getPassengerItinerary() {
        FlightCacheClient flightCacheClient = new FlightCacheClient(request());
        List<PricedItineraryWSResponse> responseItineraries = flightCacheClient.getCachedItem(); //(List<PricedItineraryWSResponseInterface>) Cache.get(request().cookie(Cookies.COOKIE_NAME).value().concat("FlightSearch"));
        if (responseItineraries == null || responseItineraries.size() <= 0) {
            return ok(views.html.errors._flight_error.render("Session timeout. Please try again."));
        }
        String index = request().getQueryString("flight_itinerary");
        PricedItineraryWSResponse wsResponseInterface = flightCacheClient.getCachedItem(Integer.parseInt(index));//responseItineraries.get(Integer.parseInt(index));
        List<ProductServices> productServicesList = ProductServices.find.where().eq("service", Services.FLIGHT.getCode()).findList();
        Map postData = DynamicForm.form().bindFromRequest().get().getData();
        ShoppingCart.getInstance(request()).saveFlightToCart(wsResponseInterface, index, postData, request());
        List<AppFormField> formFieldList = AppFormField.getFeatureFormFields(b2c_flight_booking_form);
        List<PaymentMethods> paymentMethods = PaymentMethods.find.where().eq("payment_category", PaymentCategories.Debit_Card).where().raw("name != 'GTPay'").findList();
        if(request().cookie("gtpay") != null && request().cookie("gtpay").value().equalsIgnoreCase("true")) {
            paymentMethods = PaymentMethods.find.where().eq("payment_category", PaymentCategories.Debit_Card).findList();
        }
        return ok(views.html.flights.book_flight.render(postData, wsResponseInterface, DynamicForm.form(), formFieldList, productServicesList, paymentMethods));
    }

    public static F.Promise<Result> getSearch(String locale) {
        FlightServiceClient flightServiceClient = new FlightServiceClient(request());
        FlightSearchRequest searchRequest = flightServiceClient.setFlightSearchRequest(locale);
        flightServiceClient.flightCacheClient().cacheSearchRequest(searchRequest); //cache the flight search request.

        F.Promise<FlightSearchResponse> flightSearchResponsePromise = flightServiceClient.lowFareSearch(searchRequest);
        if (searchRequest.isFlexibleDate()) {
            flightSearchResponsePromise = flightServiceClient.lowFareMatrixSearch(searchRequest);
        }
        return flightSearchResponsePromise.map(response -> {
            List<PricedItineraryWSResponse> pricedItineraryWSResponses = response.getPricedItineraryWSResponses();
            Gson json = new GsonBuilder().create();
            flightServiceClient.flightCacheClient().cacheFlightResult(pricedItineraryWSResponses);
            if (request().getQueryString("action") != null && request().getQueryString("action").equals("reload")) {
                String returnUrl = request().uri().split("/?/")[2];
                return redirect(controllers.routes.FlightController.getFlightResult(null).toString() + returnUrl.substring("search".length(), returnUrl.length()));
            }
            ObjectNode responseJson = Json.newObject().removeAll();
            responseJson.put(RESPONSE_CODE, SUCCESS);
            return ok(Json.toJson(responseJson));
        });
    }

    public static F.Promise<Result> postFlightResultJson() {
        return F.Promise.promise(() -> {
            FlightCacheClient flightCacheClient = new FlightCacheClient();
            List<PricedItineraryWSResponse> listIntenary = flightCacheClient.getCachedItem();
            if (listIntenary == null || listIntenary instanceof NullPointerException) {
                responseJson.put("status", 400);
                return ok(Json.toJson(responseJson));
            }
            FlightDataGroup flightRecord = new FlightDataGroup(listIntenary);
            Map<String, Object> responseObj = new HashMap<>();
            responseObj.put("all", flightRecord.get());
            responseObj.put("groupByAirlines", flightRecord.groupByAirlines());
            responseObj.put("groupByDepartureDates", flightRecord.groupByDepArrDateTime());
            return ok(Json.toJson(responseObj));
        });
    }

    public static F.Promise<Result> getFlightResult(String locale) {
        F.Promise<Result> resultPromise = F.Promise.promise(() -> {
            FlightCacheClient flightCacheClient = new FlightCacheClient();
            List<PricedItineraryWSResponse> listIntenary = flightCacheClient.getCachedItem();
            if (listIntenary instanceof Exception) {
                return badRequest(views.html.flights.flight_result_error.render());
            }
            FlightDataGroup flightRecord = new FlightDataGroup();
            flightRecord.add(listIntenary);
            return ok(views.html.flights.flight_result.render(flightRecord));
        });
        return resultPromise;
    }

    public static Result notFlightResult() {
        return badRequest(views.html.flights.flight_result_error.render());
    }

    public static F.Promise<Result> postProcessBooking() {
        Map postData = DynamicForm.form().bindFromRequest().get().getData();
        PricedItineraryWSResponse pricedItinerary = null;
        int itineraryIndex;
        try {
            itineraryIndex = Integer.parseInt(postData.get("flight_itinerary").toString());
        } catch (NumberFormatException e) {
            return F.Promise.promise(() -> internalServerError(views.html.errors._flight_error.render("URL Manipulated. Request Error!")));
        }
        pricedItinerary = new FlightCacheClient().getCachedItem(itineraryIndex);
        if (pricedItinerary == null) {
            //remove the item from cart and inform the user the session has expired.
            ShoppingCart.getInstance(request()).clearUserCart();
            return F.Promise.promise(() -> internalServerError(views.html.errors._flight_error.render("Session Timed Out. Please Try Again.")));
        }
        List<AppFormField> formFieldList = AppFormField.getFeatureFormFields(b2c_flight_booking_form);

        /*
         * Perform validation for form input
         */
        Boolean validationStatus;
        if (postData.get("contact_title") == null || postData.get("contact_first_name") == null || postData.get("contact_surname") == null || postData.get("contact_email") == null || postData.get("contact_phone") == null) {
            validationStatus = false;
        } else {
            validationStatus = true;
        }
        if (!validationStatus) {
            flash().put("error", "Invalid form input, please check form input and fill all required field.");
            List<ProductServices> productServicesList = ProductServices.find.where().eq("service", Services.FLIGHT.getCode()).findList();
            PricedItineraryWSResponse finalPricedItinerary = pricedItinerary;
            Object[] paymentMethods = {null};
            paymentMethods[0] = PaymentMethods.find.where().eq("payment_category", PaymentCategories.Debit_Card).where().raw("name != 'GTPay'").findList();
            if(request().cookie("gtpay") != null && request().cookie("gtpay").value().equalsIgnoreCase("true")) {
               paymentMethods[0] = PaymentMethods.find.where().eq("payment_category", PaymentCategories.Debit_Card).findList();
            }
            return F.Promise.promise(() -> badRequest(views.html.flights.book_flight.render(postData, finalPricedItinerary, DynamicForm.form(), formFieldList, productServicesList, (List<PaymentMethods>)paymentMethods[0])));
        } else {
            Users user = null;
            if (postData.get("u_session") != null && postData.get("u_session").equals("create_account")) {
                user.email = request().getQueryString("contact_email");
                user.phone = request().getQueryString("contact_email");
                user.prefix = Titles.valueOf(request().getQueryString("contact_title"));
                user.first_name = request().getQueryString("contact_first_name");
                user.last_name = request().getQueryString("contact_surname");
                user.gender = Users.Genders.valueOf(request().getQueryString("contact_title"));
                user.password = "password";
                AuthServices.createUserAccount(user);
            }

            FlightAvailabilityRequest flightAvailabilityRequest = new FlightAvailabilityRequest();
            pricedItinerary.getAirItineraryWSResponse().getOriginDestinationWSResponses().forEach(originDestinationWSResponse ->
                    flightAvailabilityRequest.getFlightSegmentWSResponses().addAll(originDestinationWSResponse.getFlightSegmentWSResponses()));
            getPassengerTypes(pricedItinerary.getSearchRequest()).forEach(passengerType -> flightAvailabilityRequest.getPassengerTypes().add(passengerType));
            flightAvailabilityRequest.setTotalFare(pricedItinerary.getPricingInfoWSResponse().getTotalFare());
            FlightServiceClient flightBookingEngineService = new FlightServiceClient();
            List<Passenger> passengers = flightBookingEngineService.setFlightBookingPassengers(DynamicForm.form().bindFromRequest(), request());
            BookingRequest bookingRequest = new BookingRequest();
            bookingRequest.getPassengers().addAll(passengers);
            bookingRequest.setFlightAvailabilityRequest(flightAvailabilityRequest);
            F.Promise<PNRDetails> bookingResponsePromise = flightBookingEngineService.generatePNRForItinerary(pricedItinerary, bookingRequest);
            return bookingResponsePromise.map(flightBookings -> {
                try {
                    String roleLevel = session().get("role_level");
                    if (flightBookings != null) {
                        if (roleLevel != null && roleLevel.equals(Auth.ROLE_LEVEL_AGENT)) {
                            return Controller.movedPermanently(controllers.swift.routes.FlightController.getBookingResult(flightBookings.getFlightBookings().id.toString(), "success"));
                        } else {
                            return Controller.movedPermanently(controllers.routes.FlightController.getCompleteBooking(flightBookings.getFlightBookings().id, "success"));
                        }
                    } else {
                        if (roleLevel != null && roleLevel.equals(Auth.ROLE_LEVEL_AGENT)) {
                            return Controller.movedPermanently(controllers.swift.routes.FlightController.getBookingResult("", "failed"));
                        } else {
                            return Controller.movedPermanently(controllers.routes.FlightController.getCompleteBooking(0, "failed"));
                        }
                    }
                } catch (NoCombinableFaresException e) {
                    Controller.flash("error", "No seat available for booking. Please select a different flight and try again.");
                    return Controller.redirect(controllers.routes.FlightController.getSearch(postData.get("destination_locale").toString()));
                }
            });
        }
    }

    private static List<PassengerType> getPassengerTypes(FlightSearchRequest searchRequest) {
//        PassengerType passengerType = new PassengerType();
//        PassengerType child = new PassengerType();
//        PassengerType infant = new PassengerType();
//
//        passengerType.setCode(PassengerCode.ADULT);
//        passengerType.setQuantity(1);
//        for (PassengerType type : searchRequest.getPassengerTypes()) {
//            if (type.getCode().equals(PassengerCode.ADULT)){
//
//            }
//        }
////        child.setCode(PassengerCode.SABRE_CHILD);
////        child.setQuantity(1);
////
////        infant.setCode(PassengerCode.INFANT);
////        infant.setQuantity(1);
//
        return searchRequest.getPassengerTypes();
//        return Arrays.asList(passengerType, child);
    }

    public static Result getCheckSeatAvailability() {
        return ok();
    }

    public static Result getCompleteBooking(Long flightBookingId, String status) {
        if (status.equalsIgnoreCase("success") && flightBookingId != 0) {
            FlightBookings flightBookings = FlightBookings.find.byId(flightBookingId);
            if (flightBookings.payment_history_id.payment_method_id.payment_category.equals(PaymentCategories.Debit_Card)) {
                String methodName = WordUtils.capitalize(flightBookings.payment_history_id.payment_method_id.name).replaceAll(" ", "");
                if (methodName.equalsIgnoreCase("gtpay")) {
                    /**
                     * GTPay Transaction Hash using the sha512 Algorithm.
                     */
                    int currency = playConfig.getInt("gtpay.currency.naira");
                    if (request().cookie("user_currency") != null && !request().cookie("user_currency").value().equalsIgnoreCase("ngn")) {
                        currency = playConfig.getInt("gtpay.currency.usd");
                    }
                    return ok(views.html._payment_methods.GTPay.render(flightBookings.payment_history_id, flightBookings, flightBookings.contact_firstname, flightBookings.contact_surname, flightBookings.contact_email, playConfig, currency));
                } else if (methodName.equalsIgnoreCase("globalpay")) {
                    return ok(views.html._payment_methods.GlobalPay.render(flightBookings.payment_history_id, flightBookings.contact_firstname, flightBookings.contact_surname, flightBookings.contact_email, flightBookings.contact_phone, playConfig));
                }
            } else if (flightBookings.payment_history_id.payment_method_id.payment_category.equals(PaymentCategories.Pay_By_Cash)) {
                //Display book on hold successful message to the user.
                return ok(views.html.flights.complete_booking.render(flightBookings, status));
            }
        }
        return ok(views.html.flights.complete_booking.render(null, "failed"));
    }

}