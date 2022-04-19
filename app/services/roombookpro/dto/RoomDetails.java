/**
 * Created by Ibrahim Olanrewaju on 2/15/2016.
 */

package services.roombookpro.dto;

import java.util.ArrayList;
import java.util.List;

public class RoomDetails {
  private Room room;
  private String supplierRef;
  private String hotelConfirmationRef;
  List<Guest> guests;
  List<CancellationPolicy> cancellationPolicies;

  public RoomDetails() {
  }

  public RoomDetails(Room room, String supplierRef, String hotelConfirmationRef, List<Guest> guests, List<CancellationPolicy> cancellationPolicies) {
    this.room = room;
    this.supplierRef = supplierRef;
    this.hotelConfirmationRef = hotelConfirmationRef;
    this.guests = guests;
    this.cancellationPolicies = cancellationPolicies;
  }

  public Room getRoom() {
    return room;
  }

  public void setRoom(Room room) {
    this.room = room;
  }

  public String getSupplierRef() {
    return supplierRef;
  }

  public void setSupplierRef(String supplierRef) {
    this.supplierRef = supplierRef;
  }

  public String getHotelConfirmationRef() {
    return hotelConfirmationRef;
  }

  public void setHotelConfirmationRef(String hotelConfirmationRef) {
    this.hotelConfirmationRef = hotelConfirmationRef;
  }

  public List<Guest> getGuests() {
    if(guests == null) {
      guests = new ArrayList<>();
    }
    return guests;
  }

  public void setGuests(List<Guest> guests) {
    this.guests = guests;
  }

  public List<CancellationPolicy> getCancellationPolicies() {
    if(cancellationPolicies == null) {
      cancellationPolicies = new ArrayList<>();
    }
    return cancellationPolicies;
  }

  public void setCancellationPolicies(List<CancellationPolicy> cancellationPolicies) {
    this.cancellationPolicies = cancellationPolicies;
  }
}