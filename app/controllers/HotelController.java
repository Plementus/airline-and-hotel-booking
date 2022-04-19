package controllers;

import core.TfxReference;
import core.hotels.*;
import models.*;
import play.data.DynamicForm;
import services.roombookpro.utils.MiscUtils;
import controllers.abstracts.BaseController;
import core.Cookies;
import core.Pagination;
import play.libs.F;
import play.libs.Json;
import play.mvc.Result;
import services.roombookpro.client.RoomBookProClient;
import services.roombookpro.dto.*;
import services.roombookpro.messages.*;

import java.util.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 20/02/2016 2:58 PM
 * |
 **/
public class HotelController extends BaseController {

    public static Result getSearch() {
        HotelSearchRequest request = new HotelSearchRequest();
        request.setCurrency(new Cookies(request()).getUserCurrency());
        request.setCity(request().getQueryString("iso_city_code")); //RKT
        request.setCheckIn(request().getQueryString("check_in_date"));
        request.setCheckOut(request().getQueryString("check_out_date"));
        request.setAdultCount(Integer.parseInt(request().getQueryString("num_of_adults")));
        if (request().getQueryString("num_of_children") != null && !Objects.equals(request().getQueryString("num_of_children"), "0")) {
            request.getChildAges().add(11);
        }
        if (request().getQueryString("hotel-stars") != null && !Objects.equals(request().getQueryString("hotel-stars"), "")) {
            request.setRating(Integer.parseInt(request().getQueryString("hotel-stars")));
        }
        request.setNationality("NG"); //AE
        request.setAvailableOnly(true);
        request.setPayType(PayType.ALL);
        request.setAgentMarkUp(0);
        RoomBookProHotelEngine bookProHotelEngine = new RoomBookProHotelEngine();
        HotelEngineEngineServices hotelEngineEngineServices = bookProHotelEngine.searchHotels(request);
        Map<String, Object> toXhr = new HashMap<>();
        if (hotelEngineEngineServices.get() != null && hotelEngineEngineServices.get().size() != 0) {
            toXhr.put(RESPONSE_CODE, SUCCESS);
        } else {
            toXhr.put(RESPONSE_CODE, FAILED);
        }
        return ok(Json.toJson(toXhr));
    }

    public static Result getSearchResult() {
        List<HotelDataPresentationInterface> cacheResp = new RoomBookProHotelEngine().get();
        Pagination<HotelDataPresentationInterface> paginatedData = new Pagination<>();
        paginatedData.setRawData(cacheResp);
        paginatedData.setRecordPerPage(15);
        return ok(views.html.hotel.hotel_result.render(paginatedData));
    }

    public static F.Promise<Result> getViewHotelDetail() {
        int hotelSearchId = Integer.parseInt(request().getQueryString("hotel_search_id"));
        int hotelId = Integer.parseInt(request().getQueryString("hotel_id"));
        RoomBookProHotelEngine bookProHotelEngine = new RoomBookProHotelEngine();
        final HotelDataPresentationInterface data = bookProHotelEngine.get(hotelSearchId, hotelId);
        F.Promise<HotelAvailableRoomsResponseInterface> hotelRooms = bookProHotelEngine.getHotelRooms(hotelSearchId, hotelId);
        return hotelRooms.map(hotelAvailableRoomsResponseInterface -> ok(views.html.hotel.view_hotel_detail.render(data, hotelAvailableRoomsResponseInterface)));
//        return hotelRooms.map(hotelAvailableRoomsResponseInterface -> ok(Json.toJson(hotelAvailableRoomsResponseInterface)));
    }

    public static Result getBookRoom() {
        int hotelSearchId = Integer.parseInt(request().getQueryString("hotel_search_id"));
        int hotelId = Integer.parseInt(request().getQueryString("hotel_id"));
        List<AppFormField> formFields =
                AppFormField.find.where().eq("feature_name", AppFeatureLibraries.b2c_hotel_booking_form.name()).findList();

        RoomBookProHotelEngine bookProHotelEngine = new RoomBookProHotelEngine();
        final HotelDataPresentationInterface data = bookProHotelEngine.get(hotelSearchId, hotelId);
        return ok(views.html.hotel.book_room.render(data, formFields));
    }

    public static F.Promise<Result> postBookRoom() {
        DynamicForm formInput = DynamicForm.form().bindFromRequest();
        int roomID = Integer.parseInt(formInput.get("room_id"));
        int searchID = Integer.parseInt(formInput.get("hotel_search_id"));
        int hotelID = Integer.parseInt(formInput.get("hotel_id"));
        RoomBookProHotelEngine bookProHotelEngine = new RoomBookProHotelEngine();
        HotelDataPresentationInterface hotelData = bookProHotelEngine.get(searchID, hotelID);
        PaymentMethods paymentMethod = PaymentMethods.find.byId(Long.parseLong(formInput.get("payment_method_id")));

        /**
         * Set the properties for the hotel booking.
         */
        HotelRoomBookingRequest bookingRequest = new HotelRoomBookingRequest();
        bookingRequest.setRoomId(roomID);
        bookingRequest.setHotelWsId(hotelID);
        bookingRequest.setHotelId(Hotels.find.where().eq("hotel_ws_id", hotelID).findUnique());
        bookingRequest.setHotelInfo(hotelData);
        bookingRequest.setTitle("Mr");
        bookingRequest.setFirstName("Jamiu");
        bookingRequest.setLastName("Igbalajobi");
        bookingRequest.setAddress("17, Ahmado Bello Str, Lugbe, FCT, Abuja");
        bookingRequest.setCity("LOS");
        bookingRequest.setDateOfBirth("1992-03-02");
        bookingRequest.setEmail("jamiu.igbalajobi@travelfix.co");
        bookingRequest.setPhone("08127119051");
        bookingRequest.setZipCode("23409");
        bookingRequest.setTfxBookingReference(TfxReference.getInstance().getServiceReference(Services.HOTEL));
        bookingRequest.setPaymentMethod(paymentMethod);

        RoomBookProHotelEngine bookingEngine = new RoomBookProHotelEngine();
        F.Promise<HotelRoomBookingResponse> bookingResponse = bookingEngine.bookHotelRoom(bookingRequest);
        return bookingResponse.map(promiseResponse -> ok(""));
    }

    public static F.Promise<Result> getRoomCancellationPolicy(Integer searchID, Integer hotelID, Integer roomID) {
        CancellationPolicyRequest request = new CancellationPolicyRequest(searchID, hotelID, roomID);
        F.Promise<CancellationPolicyResponse> promise = RoomBookProClient.roomBookCancellationPolicy(request);
        return promise.map(cancellationPolicy -> ok(Json.toJson(cancellationPolicy)));
    }

    public static F.Promise<Result> cityJSON() {
        F.Promise<List<City>> promise = F.Promise.pure(MiscUtils.csvToCities(MiscUtils.tmpDir()));
        return promise.map(cities -> {
            for (City city : cities) {
                Countries country = Countries.find.where().eq("iso_code_2", city.getCountry()).findUnique();
                Cities cityModel = new Cities();
                cityModel.name = city.getName();
                cityModel.city_code1 = city.getCode();
                cityModel.country_id = country;
                cityModel.save();
            }
            return ok(Json.toJson(cities));
        });
//        List<Cities> allCities = Cities.find.setMaxRows(1).findList();
//        return ok(Json.toJson(cities));
    }
}