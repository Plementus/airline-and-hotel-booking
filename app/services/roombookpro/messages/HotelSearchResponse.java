/**
 * Created by Babatunde on 2/10/2016.
 */

package services.roombookpro.messages;

import core.hotels.HotelDataPresentationInterface;
import services.roombookpro.dto.Facility;
import services.roombookpro.dto.Hotel;
import services.roombookpro.dto.Image;
import services.roombookpro.dto.Price;

import java.util.ArrayList;
import java.util.List;

public class HotelSearchResponse implements HotelDataPresentationInterface {
  private Hotel hotel;
  private Price lowestPrice;
  private Price totalPrice;
  private Price discount;
  private List<Image> images;
  private List<Facility> facilities;

  public void setHotel(Hotel hotel) {
    this.hotel = hotel;
  }

  public Price getLowestPrice() {
    return lowestPrice;
  }

  public void setLowestPrice(Price lowestPrice) {
    this.lowestPrice = lowestPrice;
  }

  public Price getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Price totalPrice) {
    this.totalPrice = totalPrice;
  }

  public Price getDiscount() {
    return discount;
  }

  public void setDiscount(Price discount) {
    this.discount = discount;
  }

  public List<Image> getImages() {
    if(images == null) {
      images = new ArrayList<>();
    }
    return images;
  }

  public void setImages(List<Image> images) {
    this.images = images;
  }

  public List<Facility> getFacilities() {
    if(facilities == null) {
      facilities = new ArrayList<>();
    }
    return facilities;
  }

  public void setFacilities(List<Facility> facilities) {
    this.facilities =facilities;
  }

  public Hotel getHotel() {
    return hotel;
  }

}