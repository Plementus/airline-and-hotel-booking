/**
 * Created by Ibrahim Olanrewaju on 2/11/2016.
 */
package services.roombookpro.dto;

public class RoomBookingInfo {
  private Integer roomID;
  private Guest guest;

  public RoomBookingInfo(Integer roomID, Guest guest) {
    this.roomID = roomID;
    this.guest = guest;
  }

  public RoomBookingInfo() {}

  public Integer getRoomID() {
    return roomID;
  }

  public void setRoomID(Integer roomID) {
    this.roomID = roomID;
  }

  public Guest getGuest() {
    return guest;
  }

  public void setGuest(Guest guest) {
    this.guest = guest;
  }
}
