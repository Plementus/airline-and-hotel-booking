/**
 * Created by Babatunde on 2/11/2016.
 */

package services.roombookpro.messages;

import services.roombookpro.dto.PaymentType;
import services.roombookpro.dto.RoomBookingInfo;

import java.util.List;

public class BookingRequest {
  private Integer searchID;
  private Integer hotelID;
  private List<RoomBookingInfo> rooms;
  private PaymentType paymentType;
  private String agentName;
  private String agentRef;

  public BookingRequest(Integer searchID, Integer hotelID, List<RoomBookingInfo> rooms, PaymentType paymentType) {
    this.searchID = searchID;
    this.hotelID = hotelID;
    this.rooms = rooms;
    this.paymentType = paymentType;
  }

  public BookingRequest() {}

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

  public List<RoomBookingInfo> getRooms() {
    return rooms;
  }

  public void setRooms(List<RoomBookingInfo> rooms) {
    this.rooms = rooms;
  }

  public PaymentType getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(PaymentType paymentType) {
    this.paymentType = paymentType;
  }

  public String getAgentName() {
    return agentName;
  }

  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }

  public String getAgentRef() {
    return agentRef;
  }

  public void setAgentRef(String agentRef) {
    this.agentRef = agentRef;
  }
}
