/**
 * Created by Babatunde on 2/12/2016.
 */

package services.roombookpro.messages;

import services.roombookpro.dto.*;

import java.util.ArrayList;
import java.util.List;

public class DetailsResponse {
  private String bookingRef;
  private String agentRef;
  private String supplierRef;
  private String hotelConfirmationRef;
  private String agentName;
  private String agentPhone;
  private String agentRemark;
  private String status;
  private String bookingDate;
  private String checkIn;
  private String checkOut;
  private String city;
  private String state;
  private String country;
  private HotelDetails hotel;
  private List<Pricing> pricings;

  public String getBookingRef() {
    return bookingRef;
  }

  public void setBookingRef(String bookingRef) {
    this.bookingRef = bookingRef;
  }

  public String getAgentRef() {
    return agentRef;
  }

  public void setAgentRef(String agentRef) {
    this.agentRef = agentRef;
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

  public String getAgentName() {
    return agentName;
  }

  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }

  public String getAgentPhone() {
    return agentPhone;
  }

  public void setAgentPhone(String agentPhone) {
    this.agentPhone = agentPhone;
  }

  public String getAgentRemark() {
    return agentRemark;
  }

  public void setAgentRemark(String agentRemark) {
    this.agentRemark = agentRemark;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(String bookingDate) {
    this.bookingDate = bookingDate;
  }

  public String getCheckIn() {
    return checkIn;
  }

  public void setCheckIn(String checkIn) {
    this.checkIn = checkIn;
  }

  public String getCheckOut() {
    return checkOut;
  }

  public void setCheckOut(String checkOut) {
    this.checkOut = checkOut;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public HotelDetails getHotel() {
    return hotel;
  }

  public void setHotel(HotelDetails hotel) {
    this.hotel = hotel;
  }

  public List<Pricing> getPricings() {
    if(pricings == null) {
      pricings = new ArrayList<>();
    }
    return pricings;
  }

  public void setPricings(List<Pricing> pricings) {
    this.pricings = pricings;
  }
}