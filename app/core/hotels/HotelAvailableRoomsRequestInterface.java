package core.hotels;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 03/03/2016 1:45 PM
 * |
 **/
public interface HotelAvailableRoomsRequestInterface {
    Integer getHotelID();

    void setHotelID(Integer hotelID);

    Integer getSearchID();

    void setSearchID(Integer searchID);
}