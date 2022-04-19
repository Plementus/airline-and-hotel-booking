/**
 * Created by Babatunde on 2/12/2016.
 */

package services.roombookpro.messages;

public class CancellationPolicyRequest {
  private Integer searchID;
  private Integer hotelID;
  private Integer roomID;

  public CancellationPolicyRequest(Integer searchID, Integer hotelID, Integer roomID) {
    this.searchID = searchID;
    this.hotelID = hotelID;
    this.roomID = roomID;
  }

  public Integer getSearchID() {
    return searchID;
  }

  public void setSearchID(Integer searchID) {
    this.searchID = searchID;
  }

  public Integer getHotelID() {
    return hotelID;
  }

  public void setHotelID(Integer hotelID) {
    this.hotelID = hotelID;
  }

  public Integer getRoomID() {
    return roomID;
  }

  public void setRoomID(Integer roomID) {
    this.roomID = roomID;
  }
}
