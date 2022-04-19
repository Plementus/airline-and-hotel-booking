package core.hotels;

import services.roombookpro.dto.Facility;
import services.roombookpro.dto.Hotel;
import services.roombookpro.dto.Image;
import services.roombookpro.dto.RoomsGrouping;

import java.util.ArrayList;
import java.util.List;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 03/03/2016 1:39 PM
 * |
 **/
public interface HotelAvailableRoomsResponseInterface {

    Hotel getHotel();

    void setHotel(Hotel hotel);

    List<RoomsGrouping> getRoomGroupings();

    void setRoomGroupings(List<RoomsGrouping> roomGroupings);

    List<Image> getImages();

    void setImages(List<Image> images);

    List<Facility> getFacilities();

    void setFacilities(List<Facility> facilities);
}
