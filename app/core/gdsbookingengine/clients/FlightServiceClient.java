package core.gdsbookingengine.clients;

import core.Mailer;
import core.SmsSender;
import core.TfxReference;
import core.gdsbookingengine.*;
import core.gdsbookingengine.booking.BookingRequest;
import core.gdsbookingengine.booking.BookingResponse;
import core.gdsbookingengine.booking.Passenger;
import core.gdsbookingengine.booking.Telephone;
import core.gdsbookingengine.clients.amadeus.AmadeusBookingEngine;
import core.gdsbookingengine.clients.sabre.SabreBookingEngine;
import core.security.Auth;
import models.*;
import org.apache.commons.lang3.StringUtils;
import play.Logger;
import play.data.DynamicForm;
import play.db.ebean.Transactional;
import play.libs.F;
import play.libs.Json;
import play.mvc.Http;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static controllers.abstracts.BaseController.playConfig;

import services.sabre.passengerdetails.PassengerDetailsRS;

/**
 * Created by
 * Ibrahim Olanrewaju. on 14/04/2016 4:41 PM.
 */
public class FlightServiceClient {


    private GdsNames activeGds;

    public Http.Request request = Http.Context.current().request();

    public DynamicForm dynamicForm = DynamicForm.form().bindFromRequest();

    private FlightBookingEngineService flightBookingEngineService;

    private FlightCacheClient flightCacheClient;

    //Static Initializer for the application. Make the correct implementation for FlightBookingEngineService class.
    public FlightServiceClient() {
        // set the active GDs
        this.activeGds = GdsNames.valueOf(play.Configuration.root().getString("active.gds").toUpperCase()); //default to amadeus
        //logic to check active GDS

        if (activeGds.equals(GdsNames.AMADEUS)) {
            flightBookingEngineService = new AmadeusBookingEngine();
        } else if (activeGds.equals(GdsNames.SABRE)) {
            flightBookingEngineService = new SabreBookingEngine();//not implemented yet.
        } else {
            //no gds selected.
        }
        flightCacheClient = new FlightCacheClient();
    }

    public FlightServiceClient(Http.Request request) {
        this();
        this.request = request;
    }

    public F.Promise<FlightSearchResponse> lowFareSearch(FlightSearchRequest flightSearchRequest) {
        return flightBookingEngineService.lowFareSearch(flightSearchRequest);
    }

    public F.Promise<FlightSearchResponse> lowFareMatrixSearch(FlightSearchRequest flightSearchRequest) {
        return flightBookingEngineService.alternativeDateLowFareSearch(flightSearchRequest);
    }

    public FlightSearchRequest setFlightSearchRequest(Http.Request request, String locale) {
        this.request = request;
        return setFlightSearchRequest(locale);
    }

    public FlightSearchRequest setFlightSearchRequest(String locale) {
        FlightSearchRequest flightSearchRequest = new FlightSearchRequest();
        TripType tripType = TripType.valueOf(request.getQueryString("trip_type"));
        int numOfDestination = Integer.parseInt(request.getQueryString("num_of_destination"));
        for (int i = 1; i <= numOfDestination; i++) {
            OriginDestinationRequest departure = new OriginDestinationRequest();
            departure.setOrigin(request.getQueryString("departure_airport_code_" + i));
            departure.setDestination(request.getQueryString("arrival_airport_code_" + i));
            departure.setDepartureDateTime(request.getQueryString("departure_date_" + i) + "T00:00:00");
            flightSearchRequest.getOriginDestinationRequests().add(departure);
            if (!tripType.equals(TripType.ONE_WAY) && !tripType.equals(TripType.MULTI_CITY)) {
                //Arrival Information
                OriginDestinationRequest arrival = new OriginDestinationRequest();
                arrival.setOrigin(request.getQueryString("arrival_airport_code_" + i));
                arrival.setDestination(request.getQueryString("departure_airport_code_" + i));
                arrival.setDepartureDateTime(request.getQueryString("arrival_date_" + i) + "T00:00:00");
                flightSearchRequest.getOriginDestinationRequests().add(arrival);
            }
            int rph = 1;
            for (OriginDestinationRequest originDestination : flightSearchRequest.getOriginDestinationRequests()) {
                originDestination.setRPH(String.valueOf(rph));
                rph += 1;
            }
        }

        int numberOfAdults = Integer.parseInt(request.getQueryString("num_of_adult"));
        int numberOfChildren = Integer.parseInt(request.getQueryString("num_of_children"));
        int numberOfInfant = Integer.parseInt(request.getQueryString("num_of_infant"));

        PassengerType passengerType = new PassengerType();
        passengerType.setCode(PassengerCode.ADULT);
        passengerType.setQuantity(numberOfAdults);
        flightSearchRequest.getPassengerTypes().add(passengerType);
        if (numberOfChildren > 0) {
            PassengerType child = new PassengerType();
            if (flightBookingEngineService.getGdsName().equals(GdsNames.SABRE)) {
                child.setCode(PassengerCode.SABRE_CHILD);
            } else if (flightBookingEngineService.getGdsName().equals(GdsNames.AMADEUS)) {
                child.setCode(PassengerCode.CHILD);
            }
            child.setQuantity(numberOfChildren);
            flightSearchRequest.getPassengerTypes().add(child);
        }
        if (numberOfInfant > 0) {
            PassengerType infant = new PassengerType();
            infant.setCode(PassengerCode.INFANT);
            infant.setQuantity(numberOfInfant);
            flightSearchRequest.getPassengerTypes().add(infant);
        }
        CabinPreference cabinPreference = CabinPreference.Y;
        if (request.getQueryString("cabin_class") != null && !request.getQueryString("cabin_class").isEmpty()) {
            if (!request.getQueryString("cabin_class").equalsIgnoreCase("economy") && activeGds.equals(GdsNames.SABRE)) {
                cabinPreference = CabinPreference.valueOf(request.getQueryString("cabin_class"));
            }
        }
        flightSearchRequest.setTripType(tripType);
        flightSearchRequest.setPreferredCabin(cabinPreference);
        flightSearchRequest.setCabinPrefLevel(CabinPrefLevel.PREFERRED);
        boolean isFlexibleDate = false;
        if (request.getQueryString("flexible_date") != null && request.getQueryString("flexible_date").equalsIgnoreCase("1")) {
            isFlexibleDate = true;
        }
        flightSearchRequest.setFlexibleDate(isFlexibleDate);
        String preferredAirline = null;
        if (request.getQueryString("airline_code") != null && !request.getQueryString("airline_code").equals("Preferred Airline") && !request.getQueryString("airline_code").isEmpty()) {
            preferredAirline = request.getQueryString("airline_code");
        }
        flightSearchRequest.setPreferredAirline(preferredAirline);
        flightSearchRequest.setTicketPolicy(getTicketPolicy(flightSearchRequest.getOriginDestinationRequests()));
        flightSearchRequest.setSalesCategory(getSalesCategory());
        TicketLocale ticketLocale = TicketLocale.International;
        if (locale != null) {
            ticketLocale = TicketLocale.valueOf(StringUtils.capitalize(locale));
        }
        flightSearchRequest.setTicketLocale(ticketLocale);
        flightSearchRequest.setHotelCombo(false); //false.
        Logger.info("Request: " + Json.toJson(flightSearchRequest));
        return flightSearchRequest;
    }

    public FlightCacheClient flightCacheClient() {
        return this.flightCacheClient;
    }

    //hard-coded.
    public static SalesCategory getSalesCategory() {
        return SalesCategory.B2C;
    }

    public static TicketPolicy getTicketPolicy(List<OriginDestinationRequest> originDest) {
        TicketPolicy ticketPolicy = TicketPolicy.SITI; //sales and issued in operating country
        Airports firstDepartingAirport = Airports.find.where().eq("air_code", originDest.get(0).getOrigin()).findUnique();
        if (firstDepartingAirport != null) {
            if (!firstDepartingAirport.country_id.iso_code_3.equals(playConfig.getString("sabre.agency.countryCode"))) {
                ticketPolicy = TicketPolicy.SOTI; //sales outside operating country and issued in operating country
            } else {
                ticketPolicy = TicketPolicy.SITI; //sales and issued in operating country
            }
        }
        return ticketPolicy;
    }

    public List<Passenger> setFlightBookingPassengers(DynamicForm postData, Http.Request request) {
        List<Passenger> passengerList = new ArrayList<>();
        String phoneNumberFormat = "";
        String contactPhone = postData.get("contact_phone");
        if (contactPhone.contains("-")) {
            phoneNumberFormat = contactPhone.substring(1, contactPhone.length());
            contactPhone = postData.get("contact_calling_code") + contactPhone.replaceAll("-", "");
        } else {
            phoneNumberFormat = contactPhone.substring(1, contactPhone.length() - 7) + "-" + contactPhone.substring(3, contactPhone.length() - 4) + "-" + contactPhone.substring(contactPhone.length() - 4);
        }
        Integer numberOfAdults = postData.get("num_of_adult") != null ? Integer.valueOf(postData.get("num_of_adult")) : 0;
        Integer numberOfChildren = postData.get("num_of_children") != null ? Integer.valueOf(postData.get("num_of_children")) : 0;
        Integer numberOfInfant = postData.get("num_of_infant") != null ? Integer.valueOf(postData.get("num_of_infant")) : 0;
        int numOfPassengers = numberOfAdults + numberOfChildren + numberOfInfant;

        for (int i = 0; i < numOfPassengers; i++) {
            Passenger passenger = new Passenger();
            final int finalI = i;
            request.body().asFormUrlEncoded().forEach((key, values) -> {
                if (key.matches("(.*)[]]")) {
                    AppFormField appFormField = AppFormField.find.byId(Long.parseLong(key.substring(0, key.length() - 2)));
                    String name = appFormField.form_field_id.getName();
                    if (name.equalsIgnoreCase("title")) {
                        String title = values[finalI];
                        if (title.equalsIgnoreCase("mr")) {
                            passenger.setGender(Gender.M);
                        } else if (title.equalsIgnoreCase("miss") || title.equalsIgnoreCase("mrs")) {
                            passenger.setGender(Gender.F);
                        }
                        passenger.setNamePrefix(title);
                    } else if (name.equalsIgnoreCase("first_name")) {
                        passenger.setGivenName(values[finalI]);
                    } else if (name.equalsIgnoreCase("last_name")) {
                        passenger.setSurname(values[finalI]);
                    } else if (name.equalsIgnoreCase("date_of_birth")) {
                        passenger.setBirthDate(LocalDateTime.parse(values[finalI].trim().concat("T00:00:00")));
                    } else if (name.equalsIgnoreCase("passenger_age_category")) {
                        PassengerCode passengerCode = PassengerCode.ADULT;
                        if (values[finalI].equalsIgnoreCase(PassengerCode.CHILD.value()) || values[finalI].equalsIgnoreCase(PassengerCode.SABRE_CHILD.value())) {
                            if (activeGds.equals(GdsNames.SABRE)) {
                                passengerCode = PassengerCode.SABRE_CHILD;
                            } else {
                                passengerCode = PassengerCode.CHILD;
                            }
                        } else if (values[finalI].equalsIgnoreCase(PassengerCode.INFANT.value())) {
                            passengerCode = PassengerCode.INFANT;
                        }
                        passenger.setCode(passengerCode);
                    }
                    passenger.getTelephones().add(Telephone.createInstance(postData.get("contact_phone"), PhoneUseType.H, "LOS"));
                    passenger.getEmails().add(postData.get("contact_email"));
                }
                passenger.setContactNamePrefix(postData.get("contact_title"));
                passenger.setContactFirstName(postData.get("contact_first_name"));
                passenger.setContactLastName(postData.get("contact_surname"));
                passenger.setContactEmail(postData.get("contact_email"));
            });
            passenger.setContactPhone(contactPhone);
            passengerList.add(passenger);
        }
        this.request = request;
        this.dynamicForm = postData;
        return passengerList;
    }

    public FlightBookings persistBookingRecord(PricedItineraryWSResponse pricedItinerary, BookingRequest bookingRequest, PNRDetails pnrDetails, String pnrNumber, Users user, Http.Request request, DynamicForm postData) {
        /**
         * Flight booking was successful, Go ahead a insert record into the record into appropriate table
         */
        FlightMarkUpDownRules airlineCommissionRules = null;
        if (postData.get("airline_commission_id") != null && !postData.get("airline_commission_id").isEmpty()) {
            airlineCommissionRules = FlightMarkUpDownRules.find.byId(Long.parseLong(postData.get("airline_commission_id")));
        }
        /**
         * Save the PaymentHistory First
         */
        TransRefs transRefs = TfxReference.getInstance().genFlightReference();
        String TFXTicketReference = transRefs.ref_code;
        PaymentHistories paymentHistories = new PaymentHistories();
        paymentHistories.trans_ref = TFXTicketReference;
        paymentHistories.created_at = new Date();
        paymentHistories.user_id = user;
        paymentHistories.status = PaymentStatus.Pending;
        paymentHistories.service_category = Services.FLIGHT; //service is flight.
        paymentHistories.payment_method_id = PaymentMethods.find.byId(Long.parseLong(postData.get("payment_method_id")));
        paymentHistories.currency = pricedItinerary.getPricingInfoWSResponse().getCurrencyCode();
        paymentHistories.amount = pricedItinerary.getPricingInfoWSResponse().getTotalFare();
        paymentHistories.insert();

        /**
         * Save the Flight Record
         */
        FlightBookings flightBookings = new FlightBookings();
        flightBookings.pnr_ref = pnrNumber;
        flightBookings.payment_history_id = paymentHistories;
        flightBookings.tfx_ticket_ref = TFXTicketReference;
        flightBookings.trans_ref_id = transRefs;
        String tripType = postData.get("trip_type");
        flightBookings.trip_type = TripType.valueOf(tripType);
        flightBookings.airline_commission_rule_id = airlineCommissionRules; //this may be null, so its safe to keep the airline_id, otherwise you can get the airline from the airline_commission
        flightBookings.airline_id = Airlines.find.where().eq("airline_code", pricedItinerary.getAirlineCode().toUpperCase()).findUnique();
        flightBookings.gds_name = pricedItinerary.getGDS().name();
        flightBookings.gds_base_fair = pricedItinerary.getPricingInfoWSResponse().getBaseFare();
        flightBookings.gds_tax_fair = pricedItinerary.getPricingInfoWSResponse().getTotalTax();
        flightBookings.gds_total_fair = pricedItinerary.getPricingInfoWSResponse().getTotalFare();
        flightBookings.display_amount = pricedItinerary.getPricingInfoWSResponse().getTotalFare();
        flightBookings.currency = pricedItinerary.getPricingInfoWSResponse().getCurrencyCode();
        flightBookings.gds_decimal_places = pricedItinerary.getPricingInfoWSResponse().getDecimalPlaces();
        flightBookings.contact_surname = bookingRequest.getPassengers().get(0).getContactLastName();
        flightBookings.contact_firstname = bookingRequest.getPassengers().get(0).getContactNamePrefix() + " " + bookingRequest.getPassengers().get(0).getContactFirstName();
        flightBookings.cabin_class = CabinPreference.valueOf(postData.get("cabin_class"));
        flightBookings.contact_phone = bookingRequest.getPassengers().get(0).getContactPhone();
        flightBookings.contact_email = bookingRequest.getPassengers().get(0).getContactEmail();
        flightBookings.invoice_to = null;//postData.get("invoice_to");
        flightBookings.airline_code = pricedItinerary.getAirlineCode();
        flightBookings.airline_name = pricedItinerary.getAirline();
        flightBookings.created_at = new Date();
        flightBookings.updated_at = new Date();
        flightBookings.priced_itinerary_encode = "" + Json.toJson(pricedItinerary.getPricingInfoWSResponse());
        flightBookings.travel_itinerary_encode = "" + Json.toJson(pricedItinerary);
        flightBookings.pnr_file_info = "" + Json.toJson(pnrDetails);
        flightBookings.status = FlightBookingStatus.PENDING;
        flightBookings.insert();
        /**
         * Save the Flight Passengers
         */
        request.body().asFormUrlEncoded().forEach((key, values) -> {
            try {
                AppFormField appFormField = AppFormField.find.byId(Long.parseLong(key.substring(0, 1)));
                for (String value : values) {
                    if (appFormField != null) {
                        FlightBookingPassengers flightBookingPassengers = new FlightBookingPassengers();
                        flightBookingPassengers.app_form_field_id = appFormField;
                        flightBookingPassengers.input_value = value;
                        flightBookingPassengers.flight_booking_id = flightBookings;
                        flightBookingPassengers.insert();
                    }
                }
            } catch (NumberFormatException ignored) {
            }
        });

        /**
         * Save the Origin destination option
         */
        int numberOfDestinations = Integer.valueOf(postData.get("num_of_destination"));
        pricedItinerary.getAirItineraryWSResponse().getOriginDestinationWSResponses().forEach(originDestinationWSResponse -> {
            Airports departureAirport = new Airports();
            Airports arrivalAirport = new Airports();
            departureAirport = Airports.find.where().eq("air_code", originDestinationWSResponse.getOriginAirportCode()).findUnique();
            arrivalAirport = Airports.find.where().eq("air_code", originDestinationWSResponse.getDestinationAirportCode()).findUnique();
            FlightBookingDestinations flightBookingOriginDestinations = new FlightBookingDestinations();
            flightBookingOriginDestinations.departure_airport_id = departureAirport;
            flightBookingOriginDestinations.arrival_airport_id = arrivalAirport;
            flightBookingOriginDestinations.departure_date = originDestinationWSResponse.getDepartureDateTime();
            flightBookingOriginDestinations.arrival_date = originDestinationWSResponse.getArrivalDateTime();
            flightBookingOriginDestinations.flight_booking_id = flightBookings;
            flightBookingOriginDestinations.num_of_stops = originDestinationWSResponse.getNumberOfStops();
            flightBookingOriginDestinations.duration = originDestinationWSResponse.getDuration();
            flightBookingOriginDestinations.created_at = new Date();
            flightBookingOriginDestinations.departure_airport_name = departureAirport != null ? departureAirport.airport_name : "";
            flightBookingOriginDestinations.departure_airport_code = originDestinationWSResponse.getOriginAirportCode();
            flightBookingOriginDestinations.arrival_airport_name = arrivalAirport != null ? arrivalAirport.airport_name : "";
            flightBookingOriginDestinations.arrival_airport_code = originDestinationWSResponse.getDestinationAirportCode();
//            flightBookingOriginDestinations.cabin_class = CabinPreference.valueOf(request.getQueryString("cabin_class"));
            flightBookingOriginDestinations.insert();

            if (originDestinationWSResponse.getFlightSegmentWSResponses().size() != 0) {
                originDestinationWSResponse.getFlightSegmentWSResponses().forEach(flightSegmentWSResponse -> {
                    Airlines airline = new Airlines();
                    Airports dpAirport = new Airports();
                    Airports arAirport = new Airports();
                    airline = Airlines.find.where().eq("airline_code", flightSegmentWSResponse.getMarketingAirlineCode()).findUnique();
                    dpAirport = Airports.find.where().eq("air_code", flightSegmentWSResponse.getDepartureAirportCode()).findUnique();
                    arAirport = Airports.find.where().eq("air_code", flightSegmentWSResponse.getArrivalAirportCode()).findUnique();

                    FlightBookingDestinationSegments destinationSegments = new FlightBookingDestinationSegments();
                    destinationSegments.flight_booking_destination_id = flightBookingOriginDestinations;
                    destinationSegments.res_book_design_code = flightSegmentWSResponse.getResBookDesigCode();
                    destinationSegments.rph = flightSegmentWSResponse.getRPH();
                    destinationSegments.airline_id = airline;
                    destinationSegments.airline_code = flightSegmentWSResponse.getMarketingAirlineCode();
                    destinationSegments.flight_number = flightSegmentWSResponse.getFlightNumber();
                    destinationSegments.departure_dt = flightSegmentWSResponse.getDepartureDateTime();
                    destinationSegments.arrival_dt = flightSegmentWSResponse.getArrivalDateTime();
                    destinationSegments.departure_airport_id = dpAirport;
                    destinationSegments.arrival_airport_id = arAirport;
                    destinationSegments.departure_airport_code = flightSegmentWSResponse.getDepartureAirportCode();
                    destinationSegments.arrival_airport_code = flightSegmentWSResponse.getArrivalAirportCode();
                    destinationSegments.insert();
                });
            }
        });
        String smsMessage = "Hello " + flightBookings.contact_firstname + "." + " You have successfully booked your flight. Your PNR number is " + flightBookings.pnr_ref + ".\nKindly make payment at any bank branch informing teller you want to pay from TravelFix booking or use the electronic fund transfer.\nThank you.";
        SmsSender.SmsEnvelope smsEnvelope = new SmsSender.SmsEnvelope(bookingRequest.getPassengers().get(0).getContactPhone(), smsMessage, playConfig.getString("project.name"));
        SmsSender.sendSms(smsEnvelope);
        if (postData.get("contact_email") != null & !postData.get("contact_email").isEmpty()) {
            String subject = playConfig.getString("project.name") + " Flight Booking";
            String body = views.html.emails.flight_booking.render(flightBookings, paymentHistories).body();
            Mailer.Envelop mailerEnvelope = new Mailer.Envelop(subject, body, postData.get("contact_email"));
            Mailer.sendMail(mailerEnvelope);
        }
        return flightBookings;
    }

    @Transactional
    public F.Promise<PNRDetails> generatePNRForItinerary(PricedItineraryWSResponse pricedItineraryWSResponse, BookingRequest bookingRequest) {
        F.Promise<PNRDetails> pnrForItinerary = flightBookingEngineService.generatePNRForItinerary(pricedItineraryWSResponse, bookingRequest);
        return pnrForItinerary.map(pnrDetails -> {
            String pnrRef = "";
            Logger.info("PNR Details: " + Json.toJson(pnrDetails));
            if (activeGds.equals(GdsNames.SABRE)) {
                PNRDetails sabreResp = pnrDetails;
                pnrRef = sabreResp.getItineraryRef();
            } else if (activeGds.equals(GdsNames.AMADEUS)) {
                //get amadeus PNR Ref.
            }
            FlightBookings flightBookings = persistBookingRecord(pricedItineraryWSResponse, bookingRequest, pnrDetails, pnrDetails.getItineraryRef(), Auth.user(), request, this.dynamicForm);
            pnrDetails.setFlightBookings(flightBookings);
            return pnrDetails;
        });
    }

}
