package core.hotels;

import services.roombookpro.dto.Facility;
import services.roombookpro.dto.Hotel;
import services.roombookpro.dto.Image;
import services.roombookpro.dto.Price;

import java.util.ArrayList;
import java.util.List;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 02/03/2016 9:43 AM
 * |
 **/
public interface HotelDataPresentationInterface {

    void setHotel(Hotel hotel);

    Price getLowestPrice();

    void setLowestPrice(Price lowestPrice);

    Price getTotalPrice();

    void setTotalPrice(Price totalPrice);

    Price getDiscount();

    void setDiscount(Price discount);

    List<Image> getImages();

    void setImages(List<Image> images);

    List<Facility> getFacilities();

    void setFacilities(List<Facility> facilities);

    Hotel getHotel();



}
