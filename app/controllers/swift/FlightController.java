package controllers.swift;

import controllers.abstracts.SecuredSwiftController;
import core.Cookies;
import core.PaymentCategories;
import core.gdsbookingengine.FlightSearchResponse;
import core.gdsbookingengine.PricedItineraryWSResponse;
import core.gdsbookingengine.clients.FlightCacheClient;
import core.security.Auth;
import models.*;
import org.apache.commons.lang3.text.WordUtils;
import play.cache.Cache;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.F;
import play.libs.Json;
import play.mvc.Result;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 05/01/2016 8:31 AM
 * |
 **/
public class FlightController extends SecuredSwiftController {

    public static Result getFlight() {
        return ok(views.html.swift.flight.render());
    }

    public static F.Promise<Result> getSearchFlight() {
//        F.Promise<Object> asyncPromise = AmadeusBookingEngine.queryAmadeusAPI(request());
//        return asyncPromise.map((Object result) -> (Result) ok(Json.toJson(result)));
        return F.Promise.promise(() -> ok());
    }

    public static Result getDisplayFlight() {
        FlightCacheClient amadeusServices = new FlightCacheClient(request());
        List<PricedItineraryWSResponse> listIntenary = amadeusServices.getCachedItem();
        if (listIntenary == null || listIntenary instanceof NullPointerException) {
            return internalServerError(views.html.errors.affiliate_flight_error.render("Something went wrong. Please try again."));
        }
        Set<String> availableAirlines = new HashSet<>();
        Set<Integer> availableStops = new HashSet<>();
        listIntenary.forEach(pricedItineraryWSResponse -> {
            availableAirlines.add(pricedItineraryWSResponse.getAirItineraryWSResponse().getOriginDestinationWSResponses().get(0).getMarketingAirlineCode());
            pricedItineraryWSResponse.getAirItineraryWSResponse().getOriginDestinationWSResponses().forEach(originDestinationWSResponse -> {
                availableStops.add(originDestinationWSResponse.getNumberOfStops());
            });
        });
//        return ok(Json.toJson(listIntenary));
        return ok(views.html.swift.display_flight.render(listIntenary, availableAirlines, availableStops));
    }

    public static Result postBookFlight() {
        Map<String, Object> postData = (Map<String, Object>) DynamicForm.form().bindFromRequest().get().getData();
        List<FlightSearchResponse> responseItineraries = (List<FlightSearchResponse>) Cache.get(request().cookie(Cookies.COOKIE_NAME).value().concat("FlightSearch"));
        FlightSearchResponse pricedItinerary = null;
        try {
            pricedItinerary = responseItineraries.get(Integer.parseInt(postData.get("flight_itinerary").toString()));
        } catch (NullPointerException e) {
            e.printStackTrace();
            return internalServerError(views.html.errors.affiliate_flight_error.render("Session time out."));
        }
        DynamicForm form = DynamicForm.form();
        List<Countries> countries = (List<Countries>) Cache.get("countries");
        return ok();
//        return ok(views.html.swift.book_flight.render(postData, pricedItinerary, form.bindFromRequest(), Integer.parseInt(postData.get("flight_itinerary").toString()), countries));
    }

    public static Result postProcessBooking() {
        Map postData = DynamicForm.form().bindFromRequest().get().getData();
        List<FlightSearchResponse> responseItineraries = (List<FlightSearchResponse>) Cache.get(request().cookie(Cookies.COOKIE_NAME).value().concat("FlightSearch"));
        FlightSearchResponse pricedItinerary = responseItineraries.get(Integer.parseInt(postData.get("flight_itinerary").toString()));
        List<Countries> countries = (List<Countries>) Cache.get("countries");
        int number_of_adult = Integer.valueOf(postData.get("num_of_adult").toString());
        int number_of_children = Integer.valueOf(postData.get("num_of_children").toString());
        int number_of_infant = Integer.valueOf(postData.get("num_of_infant").toString());
//        postData.forEach((key, value) -> {
//            Logger.info(key + " : " + value.toString());
//        });

        /**
         * Perform validation for form input
         */
        Boolean validationStatus = false;
        if (number_of_adult >= 1) {
            for (int i = 1; i <= number_of_adult; i++) {
                if (postData.get("adult_first_name_" + i) == null || postData.get("adult_last_name_" + i) == null || postData.get("adult_dob_" + i) == null || postData.get("adult_gender_" + i) == null) {
                    validationStatus = false;
                } else {
                    validationStatus = true;
                }
            }
        }
        if (number_of_children >= 1) {
            for (int i = 1; i <= number_of_children; i++) {
                if (postData.get("child_first_name_" + i) == null || postData.get("child_last_name_" + i) == null || postData.get("child_dob_" + i) == null || postData.get("child_gender_" + i) == null) {
                    validationStatus = false;
                } else {
                    validationStatus = true;
                }
            }
        }
        if (number_of_infant >= 1) {
            for (int i = 1; i <= number_of_infant; i++) {
                if (postData.get("infant_first_name_" + i) == null || postData.get("infant_last_name_" + i) == null || postData.get("infant_dob_" + i) == null || postData.get("infant_gender_" + i) == null) {
                    validationStatus = false;
                } else {
                    validationStatus = true;
                }
            }
        }
        if (!validationStatus) {
            flash().put("error", "Invalid field \nGender, First Name, Last Name and Date of Birth are Required.");
//            return badRequest(views.html.swift.book_flight.render(postData, pricedItinerary, DynamicForm.form().bindFromRequest(), Integer.parseInt(postData.get("flight_itinerary").toString()), countries));
            return badRequest();
        } else {
            return ok(views.html.swift.swift_flight_checkout.render(DynamicForm.form().bindFromRequest(), PaymentMethods.find.all(), pricedItinerary));
        }
    }

    public static Result postCompleteBooking() {
        List<FlightSearchResponse> responseItineraries = (List<FlightSearchResponse>) Cache.get(request().cookie(Cookies.COOKIE_NAME).value().concat("FlightSearch"));
        DynamicForm postData = Form.form().bindFromRequest();
        final FlightSearchResponse pricedItinerary = responseItineraries.get(Integer.parseInt(postData.get("flight_itinerary")));
//        return new AmadeusPnrClient().pnrBookFlight(postData, Auth.user(), pricedItinerary, playConfig, request());
        return ok();
    }

    public static Result getMarkupPrice() {
        String tripType = request().getQueryString("trip_type");
        int numOfAdult = request().getQueryString("num_of_adult") == null ? 0 : Integer.valueOf(request().getQueryString("num_of_adult"));
        int numOfChild = (request().getQueryString("num_of_children") == "0" || request().getQueryString("num_of_children") == null) ? 0 : Integer.valueOf(request().getQueryString("num_of_children"));
        int numOfInfant = (request().getQueryString("num_of_infant") == "0" || request().getQueryString("num_of_infant") == null) ? 0 : Integer.valueOf(request().getQueryString("num_of_infant"));
        //query the table
        B2bMarkups markups = B2bMarkups.find.setMaxRows(1).where().eq("user_id", Auth.user()).findUnique();
        double amt = 0;
        if (markups != null) {
//            if (tripType.equals(TripType.ONE_WAY.name())) {
//                amt += markups.b2b_adult_oneway * numOfAdult; // this does not need a logic, an adult will always persist on all request.
//                if (markups.b2b_child_oneway != null && numOfChild != 0) {
//                    amt += markups.b2b_child_oneway * numOfChild;
//                } else if (markups.b2b_infant_oneway != null && numOfInfant != 0) {
//                    amt += markups.b2b_infant_oneway * numOfInfant;
//                }
//            } else if (tripType.equals(TripType.ROUND_TRIP.name())) {
//                amt += markups.b2b_adult_round * numOfAdult; // this does not need a logic, an adult will always persist on all request.
//                if (markups.b2b_child_round != null && numOfChild != 0) {
//                    amt += markups.b2b_child_round * numOfChild;
//                } else if (markups.b2b_infant_round != null && numOfInfant != 0) {
//                    amt += markups.b2b_infant_round * numOfInfant;
//                }
//            } else if (tripType.equals(TripType.ROUND_TRIP.name())) {
//                amt += markups.b2b_adult_multi * numOfAdult; // this does not need a logic, an adult will always persist on all request.
//                if (markups.b2b_child_multi != null && numOfChild != 0) {
//                    amt += markups.b2b_child_multi * numOfChild;
//                } else if (markups.b2b_infant_multi != null && numOfInfant != 0) {
//                    amt += markups.b2b_infant_multi * numOfInfant;
//                }
//            }
        }
        responseJson.put("amt", amt);
        return ok(Json.toJson(responseJson));
    }

    public static Result getBookingResult(String flightBooking, String status) {
        /**
         * Get if the user selected a payment gateway
         */
        String decryptFlightId = flightBooking;
        if (decryptFlightId != null && !decryptFlightId.isEmpty()) {
            if (status.equalsIgnoreCase("success")) {
                FlightBookings amadeusBookFlightLogResponse = FlightBookings.find.byId(Long.parseLong(decryptFlightId));
                if (amadeusBookFlightLogResponse.payment_history_id.payment_method_id.payment_category.equals(PaymentCategories.Debit_Card)) {
                    String methodName = WordUtils.capitalize(amadeusBookFlightLogResponse.payment_history_id.payment_method_id.name).replaceAll(" ", "");
                    if (methodName.equalsIgnoreCase("gtpay")) {
                        return ok(views.html._payment_methods.GTPay.render(amadeusBookFlightLogResponse.payment_history_id, amadeusBookFlightLogResponse, amadeusBookFlightLogResponse.contact_firstname, amadeusBookFlightLogResponse.contact_surname, amadeusBookFlightLogResponse.contact_email, playConfig, 566));
                    } else if (methodName.equalsIgnoreCase("globalpay")) {
                        return ok(views.html._payment_methods.GlobalPay.render(amadeusBookFlightLogResponse.payment_history_id, amadeusBookFlightLogResponse.contact_firstname, amadeusBookFlightLogResponse.contact_surname, amadeusBookFlightLogResponse.contact_email, amadeusBookFlightLogResponse.contact_phone, playConfig));
                    }
                } else if (amadeusBookFlightLogResponse.payment_history_id.payment_method_id.payment_category.equals(PaymentCategories.Pay_By_Cash)) {
                    //Display book on hold successful message to the user.
                    return ok(views.html.swift.booking_success.render(amadeusBookFlightLogResponse));
                }
            } else {
                //booking failed
                return ok(views.html.swift.booking_failed.render());
            }
        }
        flash().put("error", "Error occurred. Please rebook the flight.");
        return ok(views.html.swift.booking_failed.render());
    }

    public static Result getReport() {
        return ok(views.html.swift.report.render());
    }

}
