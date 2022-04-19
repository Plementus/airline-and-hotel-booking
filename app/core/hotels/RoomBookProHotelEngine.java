package core.hotels;

import core.PaymentCategories;
import core.TfxReference;
import models.HotelBookings;
import models.Services;
import models.TransRefs;
import play.libs.F;
import services.roombookpro.client.RoomBookProClient;
import services.roombookpro.dto.Guest;
import services.roombookpro.dto.PaymentType;
import services.roombookpro.dto.RoomBookingInfo;
import services.roombookpro.messages.*;

import java.util.ArrayList;
import java.util.List;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 02/03/2016 10:44 AM
 * |
 **/
public class RoomBookProHotelEngine extends HotelEngineEngineServices {

    @Override
    public HotelApiProviders bookingEngine() {
        return HotelApiProviders.ROOM_BOOK_PRO;
    }

    @Override
    public F.Promise<HotelRoomBookingResponse> bookHotelRoom(HotelRoomBookingRequest bookingRequest) {
        HotelBookings hotelBookings = new HotelBookings();
        hotelBookings.hotel_ws_id = bookingRequest.getHotelWsId();
        hotelBookings.trans_ref_id = bookingRequest.getTfxBookingReference();

        Guest guest = new Guest();
        guest.setTitle(bookingRequest.getTitle());
        guest.setFirstName(bookingRequest.getFirstName());
        guest.setLastName(bookingRequest.getLastName());
        guest.setDob(bookingRequest.getDateOfBirth());
        guest.setEmail(bookingRequest.getEmail());
        guest.setPhone(bookingRequest.getPhone());
        guest.setAddress(bookingRequest.getAddress());
        guest.setZipCode(bookingRequest.getZipCode());
        guest.setCity(bookingRequest.getCity());

        RoomBookingInfo bookingInfo = new RoomBookingInfo(bookingRequest.getRoomId(), guest);
        List<RoomBookingInfo> bookingInfos = new ArrayList<>();
        bookingInfos.add(bookingInfo);
        PaymentType paymentType = PaymentType.HOLD;
        if (bookingRequest.getPaymentMethod().payment_category.equals(PaymentCategories.Debit_Card)) {
            paymentType = PaymentType.CREDIT;
        }
        BookingRequest request = new BookingRequest(bookingRequest.getSearchId(), bookingRequest.getHotelWsId(), bookingInfos, paymentType);
        F.Promise<HotelRoomBookingResponse> promise = RoomBookProClient.roomBookBooking(request);
        return promise.map(hotelRoomBookingResponse -> {

            return null;
        });
    }

    @Override
    public F.Promise<HotelAvailableRoomsResponseInterface> getHotelRooms(int searchId, int hotelId) {
        HotelAvailableRoomsRequestInterface request = new RoomsSearchRequest(searchId, hotelId);
        F.Promise<HotelAvailableRoomsResponseInterface> promise = RoomBookProClient.roomBookRoomsSearch(request);
        return promise;
    }


}