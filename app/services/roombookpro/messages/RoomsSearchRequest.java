/**
 * Created by Babatunde on 2/11/2016.
 */

package services.roombookpro.messages;

import core.hotels.HotelAvailableRoomsRequestInterface;

public class RoomsSearchRequest implements HotelAvailableRoomsRequestInterface {
  private Integer searchID;
  private Integer hotelID;

  public RoomsSearchRequest(){}

  public RoomsSearchRequest(Integer searchID, Integer hotelID) {
    this.searchID = searchID;
    this.hotelID = hotelID;
  }

  public Integer getHotelID() {
    return hotelID;
  }

  public void setHotelID(Integer hotelID) {
    this.hotelID = hotelID;
  }

  public Integer getSearchID() {
    return searchID;
  }

  public void setSearchID(Integer searchID) {
    this.searchID = searchID;
  }
}
