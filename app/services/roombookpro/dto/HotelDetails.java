/**
 * Created by Ibrahim Olanrewaju on 2/15/2016.
 */

package services.roombookpro.dto;

import java.util.ArrayList;
import java.util.List;

public class HotelDetails {
  private Hotel hotel;
  private List<Image> images;
  private List<Facility> facilities;
  private RoomDetails room1;
  private RoomDetails room2;
  private RoomDetails room3;
  private RoomDetails room4;

  public Hotel getHotel() {
    return hotel;
  }

  public void setHotel(Hotel hotel) {
    this.hotel = hotel;
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

  public RoomDetails getRoom1() {
    return room1;
  }

  public void setRoom1(RoomDetails room) {
    this.room1 = room;
  }

  public RoomDetails getRoom2() {
    return room2;
  }

  public void setRoom2(RoomDetails room2) {
    this.room2 = room2;
  }

  public RoomDetails getRoom3() {
    return room3;
  }

  public void setRoom3(RoomDetails room3) {
    this.room3 = room3;
  }

  public RoomDetails getRoom4() {
    return room4;
  }

  public void setRoom4(RoomDetails room4) {
    this.room4 = room4;
  }
}