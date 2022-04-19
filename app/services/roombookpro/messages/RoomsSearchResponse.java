/**
 * Created by Babatunde on 2/11/2016.
 */

package services.roombookpro.messages;

import core.hotels.HotelAvailableRoomsResponseInterface;
import services.roombookpro.dto.Facility;
import services.roombookpro.dto.Hotel;
import services.roombookpro.dto.Image;
import services.roombookpro.dto.RoomsGrouping;

import java.util.ArrayList;
import java.util.List;

public class RoomsSearchResponse implements HotelAvailableRoomsResponseInterface {
  private Hotel hotel;
  private List<RoomsGrouping> roomGroupings;
  private List<Image> images;
  private List<Facility> facilities;

  public Hotel getHotel() {
    return hotel;
  }

  public void setHotel(Hotel hotel) {
    this.hotel = hotel;
  }

  public List<RoomsGrouping> getRoomGroupings() {
    if(roomGroupings == null) {
      roomGroupings = new ArrayList<>();
    }
    return roomGroupings;
  }

  public void setRoomGroupings(List<RoomsGrouping> roomGroupings) {
    this.roomGroupings = roomGroupings;
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
    this.facilities = facilities;
  }
}