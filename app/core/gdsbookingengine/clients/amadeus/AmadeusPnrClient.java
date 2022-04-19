package core.gdsbookingengine.clients.amadeus;

import com.avaje.ebean.annotation.Transactional;
import core.TfxReference;
import core.gdsbookingengine.*;
import core.gdsbookingengine.booking.*;
import core.security.Auth;
import models.*;
import org.apache.commons.lang3.text.WordUtils;
import play.Configuration;
import play.data.DynamicForm;
import play.libs.F;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import services.amadeus.travelbuild.*;
import services.amadeus.travelbuild.Telephone;

import javax.annotation.Nullable;
import javax.xml.bind.*;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.transform.stream.StreamSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by
 * Ibrahim Olanrewaju. on 14/04/2016 3:15 AM.
 */
public class AmadeusPnrClient {

    public static F.Promise<BookingResponse> issuePNR(PricedItineraryWSResponse pricedItineraryWSResponseInterface, BookingRequest bookingRequest) {
        WsTravelBuildV03 wsTravelBuildV03 = new WsTravelBuildV03();
        WsTravelBuildV03Soap wsTravelBuildV03Soap = wsTravelBuildV03.getWsTravelBuildV03Soap();
        OTATravelItineraryRQ otaTravelItineraryRQ = new OTATravelItineraryRQ();
        POS pos = POSBuilder.createInstance();
        OTAAirBookRQ otaAirBookRQ = new OTAAirBookRQ();
        AirItinerary airItinerary = new AirItinerary();

        ArrayOfArrayOfFlightSegment arrayOfArrayOfFlightSegment = new ArrayOfArrayOfFlightSegment();

        AirItineraryWSResponse airItineraryRS = pricedItineraryWSResponseInterface.getAirItineraryWSResponse();

        List<OriginDestinationWSResponse> originDestinationRS = airItineraryRS.getOriginDestinationWSResponses();
        List<FlightSegmentWSResponse> flightSegmentRS = new ArrayList<>();

        for (OriginDestinationWSResponse origin : originDestinationRS) {
            List<FlightSegmentWSResponse> flights = origin.getFlightSegmentWSResponses();
            for (FlightSegmentWSResponse flight : flights) {
                flightSegmentRS.add(flight);
            }
        }

        ArrayOfFlightSegment arrayOfFlightSegment = createArrayOfFlightSegment(flightSegmentRS);

        arrayOfArrayOfFlightSegment.getOriginDestinationOption().add(arrayOfFlightSegment);

        String directionIndicator = pricedItineraryWSResponseInterface.getAirItineraryWSResponse().getDirectionIndicator();

        airItinerary.setDirectionInd(AirItineraryDirectionInd.fromValue(directionIndicator));

        airItinerary.setOriginDestinationOptions(arrayOfArrayOfFlightSegment);

        otaAirBookRQ.setAirItinerary(airItinerary);

        List<Traveler> travelers = bookingRequest.getPassengers().stream().map(AmadeusPnrClient::createTraveler).collect(Collectors.toList());

        List<Telephone> telephones = bookingRequest.getPassengers().stream()
                .map(AmadeusPnrClient::createTelephone)
                .collect(Collectors.toList());

        Ticketing ticketing = createTicketing(pricedItineraryWSResponseInterface.getTicketingInfoWSResponse());

        PNRData pnrData = createPNRData(travelers, telephones, ticketing);

        String price = WordUtils.capitalize(pricedItineraryWSResponseInterface.getPricingInfoWSResponse().getPricingSource());
        PriceData priceData = createPriceData(price);

        PublishedFares publishedFares = new PublishedFares();
        FareRestrictPref fareRestrict = new FareRestrictPref();
        AdvResTicketing advResTicketing = new AdvResTicketing();
        MinimumStay minimumStay = new MinimumStay();
        MaximumStay maximumStay = new MaximumStay();
        VoluntaryChanges voluntaryChanges = new VoluntaryChanges();

        advResTicketing.setAdvReservation(new AdvReservation());
        voluntaryChanges.setPenalty(new Penalty());

        fareRestrict.setAdvResTicketing(advResTicketing);
        fareRestrict.setVoluntaryChanges(voluntaryChanges);
        fareRestrict.setMinimumStay(minimumStay);
        fareRestrict.setMaximumStay(maximumStay);

        publishedFares.setFareRestrictPref(fareRestrict);

        priceData.setPublishedFares(publishedFares);

        TPAExtensions tpaExtensions = createTPAExtensions(pnrData, priceData);

        otaTravelItineraryRQ.setPOS(pos);
        otaTravelItineraryRQ.setOTAAirBookRQ(otaAirBookRQ);
        otaTravelItineraryRQ.setTPAExtensions(tpaExtensions);

        OTATravelItineraryRS otaTravelItineraryRS;
        try {
            Unmarshaller unMarshaller = JAXBContext.newInstance(OTATravelItineraryRS.class).createUnmarshaller();
            StringReader reader = new StringReader(soapRequest(otaTravelItineraryRQ));

            JAXBElement<OTATravelItineraryRS> root = unMarshaller.unmarshal(new StreamSource(reader), OTATravelItineraryRS.class);
            otaTravelItineraryRS = root.getValue();
        } catch (JAXBException jaxbEx) {
            throw new RuntimeException(jaxbEx);
        }
        return null;
//        return otaTravelItineraryRS;
    }

    private static TPAExtensions createTPAExtensions(PNRData pnrData, PriceData priceData) {
        TPAExtensions extensions = new TPAExtensions();
        extensions.setPNRData(pnrData);
        extensions.setPriceData(priceData);
        return extensions;
    }

    private static PNRData createPNRData(List<Traveler> travelers, List<Telephone> telephones, Ticketing ticketing) {
        PNRData pnrData = new PNRData();
        pnrData.setTicketing(ticketing);
        travelers.forEach(traveler -> pnrData.getTraveler().add(traveler));
        telephones.forEach(telephone -> pnrData.getTelephone().add(telephone));
        return pnrData;
    }

    private static PriceData createPriceData(String priceDataPriceType) {
        PriceData priceData = new PriceData();
        priceData.setPriceType(PriceDataPriceType
                .fromValue(priceDataPriceType));
        return priceData;
    }

    private static Traveler createTraveler(Passenger passenger) {
        Traveler traveler = new Traveler();
        PersonName personName = new PersonName();

        personName.setGivenName(passenger.getGivenName());
        personName.setSurname(passenger.getSurname());

        traveler.setPersonName(personName);
        traveler.setPassengerTypeCode(passenger.getCode().value());
        traveler.setBirthDate(
                toXMLGregorianCalendar(passenger.getBirthDate()));
        TravelerRefNumber travelerRefNumber = new TravelerRefNumber();
        travelerRefNumber.setRPH(passenger.getRPH());
        traveler.setTravelerRefNumber(travelerRefNumber);

        return traveler;
    }

    private static Telephone createTelephone(Passenger passenger) {
        Telephone telephone = new Telephone();
        new services.amadeus.travelbuild.Telephone().setPhoneLocationType(passenger.getPhoneLocationType());
//        telephone.setPhoneNumber(passenger.getPhoneNumber());
        telephone.setCountryAccessCode(passenger.getCountryAccessCode());
        return telephone;
    }

    private static Ticketing createTicketing(TicketingInfoWSResponse ticketingInfo) {
        Ticketing ticketing = new Ticketing();
        ticketing.setTicketTimeLimit(toXMLGregorianCalendar(ticketingInfo.getTicketTimeLimit()));
//        ticketing.setTicketType(ticketingInfo.getTicketType());
        return ticketing;
    }

    private static ArrayOfFlightSegment createArrayOfFlightSegment(List<FlightSegmentWSResponse> flightSegmentWSResponses) {
        ArrayOfFlightSegment arrayOfFlightSegment = new ArrayOfFlightSegment();

        flightSegmentWSResponses.forEach(flightSegmentWSResponse ->
                arrayOfFlightSegment.getFlightSegment()
                        .add(createFlightSegment(
                                flightSegmentWSResponse)));
        return arrayOfFlightSegment;
    }

    private static FlightSegment createFlightSegment(FlightSegmentWSResponse flightSegmentWSResponse) {
        FlightSegment flightSegment = new FlightSegment();
        DepartureAirport departureAirport = new DepartureAirport();
        ArrivalAirport arrivalAirport = new ArrivalAirport();
        MarketingAirline marketingAirline = new MarketingAirline();

        departureAirport.setValue(
                flightSegmentWSResponse.getDepartureAirport());
        departureAirport.setLocationCode(
                flightSegmentWSResponse.getDepartureAirportCode());
        arrivalAirport.setValue(
                flightSegmentWSResponse.getArrivalAirport());
        arrivalAirport.setLocationCode(
                flightSegmentWSResponse.getArrivalAirportCode());
        marketingAirline.setCode(
                flightSegmentWSResponse.getMarketingAirlineCode());
        flightSegment.setDepartureDateTime(
                flightSegmentWSResponse.getDepartureDateTime());
        flightSegment.setArrivalDateTime(
                flightSegmentWSResponse.getArrivalDateTime());
        flightSegment.setRPH(
                flightSegmentWSResponse.getRPH());
        flightSegment.setFlightNumber(
                flightSegmentWSResponse.getFlightNumber());
        flightSegment.setResBookDesigCode(
                flightSegmentWSResponse.getResBookDesigCode());
        flightSegment.setNumberInParty(
                flightSegmentWSResponse.getNumberInParty());
        flightSegment.setArrivalAirport(arrivalAirport);
        flightSegment.setDepartureAirport(departureAirport);
        flightSegment.setMarketingAirline(marketingAirline);

        return flightSegment;
    }

    private static XMLGregorianCalendar toXMLGregorianCalendar(LocalDateTime dateTime) {
        XMLGregorianCalendar calendar;
        try {
            GregorianCalendar gregorianCalendar =
                    new GregorianCalendar(dateTime.getYear(),
                            dateTime.getMonthValue(),
                            dateTime.getDayOfMonth());

            calendar = DatatypeFactory.newInstance()
                    .newXMLGregorianCalendar(gregorianCalendar);
            return calendar;
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    private static String soapRequest(OTATravelItineraryRQ otaTravelItineraryRQ) {
        TravelBuildXML travelBuildXML = new TravelBuildXML();
        XMLRequest xmlRequest = new XMLRequest();
        xmlRequest.setOtaTravelItineraryRQ(otaTravelItineraryRQ);
        travelBuildXML.setXmlRequest(xmlRequest);
        String response = "EMPTY";
        try {
            SOAPConnectionFactory soapConnectionFactory =
                    SOAPConnectionFactory.newInstance();
            SOAPConnection connection =
                    soapConnectionFactory.createConnection();

            QName qName = new QName("http://traveltalk.com/wsTravelBuild",
                    "wmTravelBuildXml");
            StringWriter writer = new StringWriter();
            SOAPMessage request;
            WmTravelBuildXmlResponse travelBuildXMLResponse;
            try {
                JAXBContext context = JAXBContext.newInstance(TravelBuildXML.class);
                Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

                JAXBElement<TravelBuildXML> root =
                        new JAXBElement<>(qName,
                                TravelBuildXML.class, travelBuildXML);

                marshaller.marshal(root, writer);
                String soapMessage = createStringSoapMessage(removeXMLTag(writer.toString(), 3));

                InputStream is = new ByteArrayInputStream(
                        soapMessage.getBytes());

                request = MessageFactory.newInstance()
                        .createMessage(null, is);

            } catch (JAXBException jaxbEx) {
                throw new RuntimeException(jaxbEx);
            }

            java.net.URL endpoint =
                    new java.net.URL("http://amadeusws.tripxml.com/TripXML/wsTravelBuild_v03.asmx?WSDL");
            SOAPMessage soapResponse = connection.call(request, endpoint);
            connection.close();
            SOAPBody responseBody = soapResponse.getSOAPBody();

            try {
                Unmarshaller unMarshaller = JAXBContext
                        .newInstance(WmTravelBuildXmlResponse.class).createUnmarshaller();

                travelBuildXMLResponse = (WmTravelBuildXmlResponse)
                        unMarshaller.unmarshal(responseBody
                                .extractContentAsDocument());

                response = travelBuildXMLResponse
                        .getWmTravelBuildXmlResult();

            } catch (JAXBException jaxbEx) {
                throw new RuntimeException(jaxbEx);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return response;
    }

    private static String createStringSoapMessage(String message) {
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
                "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" +
                " xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"" +
                " xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"" +
                " xmlns:tf=\"http://traveltalk.com/wsTravelBuild\">\n" +
                "      <soap:Header/>\n" +
                "      <soap:Body>\n" +
                "        <tf:wmTravelBuildXml>\n" +
                "          <tf:xmlRequest>\n" +
                "          <![CDATA[\n" +
                message + "\n" +
                "          ]]>\n" +
                "          </tf:xmlRequest>\n" +
                "       </tf:wmTravelBuildXml>\n" +
                "     </soap:Body>\n" +
                "</soap:Envelope>";
    }

    private static String removeXMLTag(String xml, int offset) {
        String modifiedXML = "";
        String[] travels = xml.split("\n");
        String[] travelsCopy = Arrays
                .copyOfRange(travels, offset, travels.length - 2);

        for (String s : travelsCopy) {
            modifiedXML += s + "\n";
        }
        return modifiedXML;
    }

    @Transactional
    @Nullable
    public Result pnrBookFlight(DynamicForm postData, Users user, PricedItineraryWSResponse pricedItinerary, Configuration playConfig, Http.Request request) {
        Http.Context context = Http.Context.current();
        String contactPhone = postData.get("contact_phone");
        String amadeusPhoneFormat = "";
        if (contactPhone.contains("-")) {
            amadeusPhoneFormat = contactPhone.substring(1, contactPhone.length());
            contactPhone = postData.get("contact_calling_code") + contactPhone.replaceAll("-", "");
        } else {
            amadeusPhoneFormat = contactPhone.substring(1, contactPhone.length() - 7) + "-" + contactPhone.substring(3, contactPhone.length() - 4) + "-" + contactPhone.substring(contactPhone.length() - 4);
        }

//        List<Passenger> passengerList = new ArrayList<>();
//        Integer numberOfAdults = postData.get("num_of_adult") != null ? Integer.valueOf(postData.get("num_of_adult")) : 0;
//        Integer numberOfChildren = postData.get("num_of_children") != null ? Integer.valueOf(postData.get("num_of_children")) : 0;
//        Integer numberOfInfant = postData.get("num_of_infant") != null ? Integer.valueOf(postData.get("num_of_infant")) : 0;
//        int numOfPassengers = numberOfAdults + numberOfChildren + numberOfInfant;
//        for (int i = 0; i < numOfPassengers; i++) {
//            Passenger passenger = new Passenger();
//            final int finalI = i;
//            final String finalAmadeusPhoneFormat = amadeusPhoneFormat;
//            request.body().asFormUrlEncoded().forEach((key, values) -> {
//                if (key.matches("(.*)[]]")) {
//                    AppFormField appFormField = AppFormField.find.byId(Long.parseLong(key.substring(0, key.length() - 2)));
//                    String name = appFormField.form_field_id.getName();
//                    if (name.equalsIgnoreCase("first_name")) {
//                        passenger.setGivenName(values[finalI]);
//                    } else if (name.equalsIgnoreCase("name")) {
//                        passenger.setNamePrefix(values[finalI]);
//                    } else if (name.equalsIgnoreCase("last_name")) {
//                        passenger.setSurname(values[finalI]);
//                    } else if (name.equalsIgnoreCase("passenger_age_category")) {
//                        PassengerCode passengerCode = PassengerCode.ADULT;
//                        if (values[finalI].equalsIgnoreCase(PassengerCode.CHILD.value())) {
//                            passengerCode = PassengerCode.CHILD;
//                        } else if (values[finalI].equalsIgnoreCase(PassengerCode.INFANT.value())) {
//                            passengerCode = PassengerCode.INFANT;
//                        }
//                        passenger.setCode(passengerCode);
//                    } else if (name.equalsIgnoreCase("date_of_birth")) {
//                        passenger.setBirthDate(LocalDateTime.parse(values[finalI].trim().concat("T00:00:00")));
//                    }
//                    passenger.setCountryAccessCode(playConfig.getInt("amadeus.operationCode.ngn").toString());
//                    passenger.setPhoneNumber(finalAmadeusPhoneFormat);
//                }
//            });
//            passenger.setGivenName(passenger.getNamePrefix() + " " + passenger.getGivenName());
//            passengerList.add(passenger);
//        }
        String roleLevel = Http.Context.current().session().get("role_level");
        OTATravelItineraryRS otaTravelItinerary = null;//generatePNRForItinerary(pricedItinerary, passengerList);
        TravelItinerary travelItinerary = otaTravelItinerary.getTravelItinerary();
        if (travelItinerary != null) {
            /**
             * Flight booking was successful, Go ahead a insert record into the record into appropriate table
             */
            FlightMarkUpDownRules airlineCommissionRules = null;
            if (postData.get("airline_commission_id") != null && !postData.get("airline_commission_id").isEmpty()) {
                airlineCommissionRules = FlightMarkUpDownRules.find.byId(Long.parseLong(postData.get("airline_commission_id")));
            }
            TransRefs transRefs = TfxReference.getInstance().genFlightReference();
            String TFXTicketReference = transRefs.ref_code; //Utilities.generateAlphaNumeric("TFX_NG_").toUpperCase();
            String pnrNumber = travelItinerary.getItineraryRef().getID();
            /**
             * Save the PaymentHistory First
             */
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
            flightBookings.trip_type = TripType.valueOf(postData.get("trip_type"));
            flightBookings.airline_commission_rule_id = airlineCommissionRules; //this may be null, so its safe to keep the airline_id, otherwise you can get the airline from the airline_commission
            flightBookings.airline_id = Airlines.find.where().eq("airline_code", pricedItinerary.getAirlineCode().toUpperCase()).findUnique();
            flightBookings.gds_name = pricedItinerary.getGDS().name();
            flightBookings.gds_base_fair = pricedItinerary.getPricingInfoWSResponse().getBaseFare();
            flightBookings.gds_tax_fair = pricedItinerary.getPricingInfoWSResponse().getTotalTax();
            flightBookings.gds_total_fair = pricedItinerary.getPricingInfoWSResponse().getTotalFare();
            flightBookings.display_amount = pricedItinerary.getPricingInfoWSResponse().getTotalFare();
            flightBookings.currency = pricedItinerary.getPricingInfoWSResponse().getCurrencyCode();
            flightBookings.gds_decimal_places = pricedItinerary.getPricingInfoWSResponse().getDecimalPlaces();
            flightBookings.contact_surname = postData.get("contact_surname");
            flightBookings.contact_firstname = postData.get("contact_first_name");
//            flightBookings.cabin_class = CabinPreference.valueOf(postData.get("cabin_class"));
            flightBookings.contact_phone = contactPhone;
            flightBookings.contact_email = postData.get("contact_email");
            flightBookings.invoice_to = postData.get("invoice_to");
            flightBookings.airline_code = pricedItinerary.getAirlineCode();
            flightBookings.airline_name = pricedItinerary.getAirline();
            flightBookings.priced_itinerary_encode = "" + Json.toJson(pricedItinerary);
            flightBookings.travel_itinerary_encode = "" + Json.toJson(travelItinerary);
            flightBookings.status = FlightBookingStatus.PENDING;
            flightBookings.insert();

            /**
             * Save the Flight Passengers
             */
//            request.body().asFormUrlEncoded().forEach((key, values) -> {
//                try {
//                    AppFormField appFormField = AppFormField.find.byId(Long.parseLong(key.substring(0, 1)));
//                    for (String value : values) {
//                        if (appFormField != null) {
//                            FlightBookingPassengers flightBookingPassengers = new FlightBookingPassengers();
//                            flightBookingPassengers.app_form_field_id = appFormField;
//                            flightBookingPassengers.input_value = value;
//                            flightBookingPassengers.flight_booking_id = flightBookings;
//                            flightBookingPassengers.insert();
//                        }
//                    }
//                } catch (NumberFormatException ignored) {
//                }
//            });

            /**
             * Save the Origin destination option
             */
//            int numberOfDestinations = Integer.valueOf(postData.get("num_of_destination"));
//            pricedItinerary.getAirItineraryWSResponse().getOriginDestinationWSResponses().forEach(originDestinationWSResponse -> {
//                Airports departureAirport = new Airports();
//                Airports arrivalAirport = new Airports();
//                departureAirport = Airports.find.where().eq("air_code", originDestinationWSResponse.getOriginAirportCode()).findUnique();
//                arrivalAirport = Airports.find.where().eq("air_code", originDestinationWSResponse.getDestinationAirportCode()).findUnique();
//                FlightBookingDestinations flightBookingOriginDestinations = new FlightBookingDestinations();
//                flightBookingOriginDestinations.departure_airport_id = departureAirport;
//                flightBookingOriginDestinations.arrival_airport_id = arrivalAirport;
//                flightBookingOriginDestinations.departure_date = originDestinationWSResponse.getDepartureDateTime();
//                flightBookingOriginDestinations.arrival_date = originDestinationWSResponse.getArrivalDateTime();
//                flightBookingOriginDestinations.flight_booking_id = flightBookings;
//                flightBookingOriginDestinations.num_of_stops = originDestinationWSResponse.getNumberOfStops();
//                flightBookingOriginDestinations.duration = originDestinationWSResponse.getDuration();
//                flightBookingOriginDestinations.created_at = new Date();
//                flightBookingOriginDestinations.departure_airport_name = departureAirport.airport_name;
//                flightBookingOriginDestinations.departure_airport_code = departureAirport.air_code;
//                flightBookingOriginDestinations.arrival_airport_name = originDestinationWSResponse.getDestinationAirport();
//                flightBookingOriginDestinations.arrival_airport_code = originDestinationWSResponse.getDestinationAirportCode();
////                flightBookingOriginDestinations.cabin_class = CabinPreference.valueOf(originDestinationWSResponse.getCabin().toUpperCase());
//                flightBookingOriginDestinations.insert();
//
//                if (originDestinationWSResponse.getFlightSegmentWSResponses().size() != 0) {
//                    originDestinationWSResponse.getFlightSegmentWSResponses().forEach(flightSegmentWSResponse -> {
//                        Airlines airline = new Airlines();
//                        Airports dpAirport = new Airports();
//                        Airports arAirport = new Airports();
//                        airline = Airlines.find.where().eq("airline_code", flightSegmentWSResponse.getMarketingAirlineCode()).findUnique();
//                        dpAirport = Airports.find.where().eq("air_code", flightSegmentWSResponse.getDepartureAirportCode()).findUnique();
//                        arAirport = Airports.find.where().eq("air_code", flightSegmentWSResponse.getArrivalAirportCode()).findUnique();
//
//                        FlightBookingDestinationSegments destinationSegments = new FlightBookingDestinationSegments();
//                        destinationSegments.flight_booking_destination_id = flightBookingOriginDestinations;
//                        destinationSegments.res_book_design_code = flightSegmentWSResponse.getResBookDesigCode();
//                        destinationSegments.rph = flightSegmentWSResponse.getRPH();
//                        destinationSegments.airline_id = airline;
//                        destinationSegments.airline_code = flightSegmentWSResponse.getMarketingAirlineCode();
//                        destinationSegments.flight_number = flightSegmentWSResponse.getFlightNumber();
//                        destinationSegments.departure_dt = flightSegmentWSResponse.getDepartureDateTime();
//                        destinationSegments.arrival_dt = flightSegmentWSResponse.getArrivalDateTime();
//                        destinationSegments.departure_airport_id = dpAirport;
//                        destinationSegments.arrival_airport_id = arAirport;
//                        destinationSegments.departure_airport_code = flightSegmentWSResponse.getDepartureAirportCode();
//                        destinationSegments.arrival_airport_code = flightSegmentWSResponse.getArrivalAirportCode();
//                        destinationSegments.insert();
//                    });
//                }
//            });

//            String smsMessage = "Hello " + flightBookings.contact_firstname + "." + " You have successfully booked your flight. Your PNR number is " + flightBookings.pnr_ref + ".\nKindly make payment at any bank branch informing teller you want to pay from TravelFix booking or use the electronic fund transfer.\nThank you.";
//            SmsSender.SmsEnvelope smsEnvelope = new SmsSender.SmsEnvelope(contactPhone, smsMessage, playConfig.getString("project.name"));
//            SmsSender.sendSms(smsEnvelope);
//            if (postData.get("contact_email") != null & !postData.get("contact_email").isEmpty()) {
//                String subject = playConfig.getString("project.name") + " Flight Booking";
//                String body = views.html.emails.flight_booking.render(flightBookings, paymentHistories).body();
//                Mailer.Envelop mailerEnvelope = new Mailer.Envelop(subject, body, postData.get("contact_email"));
//                Mailer.sendMail(mailerEnvelope);
//            }
            context.flash().put("success", "Flight booked successfully.");
            if (roleLevel != null && roleLevel.equals(Auth.ROLE_LEVEL_AGENT)) {
//                move to the swift. account processing.
                return Controller.movedPermanently(controllers.swift.routes.FlightController.getBookingResult(flightBookings.id.toString(), "success"));
            } else {
                return Controller.movedPermanently(controllers.routes.FlightController.getCompleteBooking(flightBookings.id, "success"));
            }
        } else {
            if (roleLevel != null && roleLevel.equals(Auth.ROLE_LEVEL_AGENT)) {
                return Controller.movedPermanently(controllers.swift.routes.FlightController.getBookingResult("", "failed"));
            } else {
                return Controller.movedPermanently(controllers.routes.FlightController.getCompleteBooking(0, "failed"));
            }
        }
    }

}
