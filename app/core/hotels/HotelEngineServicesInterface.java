package core.hotels;

import play.libs.F;
import services.roombookpro.messages.HotelSearchRequest;

import java.util.List;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 02/03/2016 10:03 AM
 * |
 **/
interface HotelEngineServicesInterface <T> {

    HotelApiProviders bookingEngine();

    List<HotelDataPresentationInterface> cacheResult(List<T> data);

    List<T> get();

    T get(int searchId, int hotelId);

    F.Promise<HotelRoomBookingResponse> bookHotelRoom(HotelRoomBookingRequest bookingRequest);

    HotelEngineEngineServices searchHotels(HotelSearchRequest request);

    public F.Promise<HotelAvailableRoomsResponseInterface> getHotelRooms(int searchId, int hotelId);
}