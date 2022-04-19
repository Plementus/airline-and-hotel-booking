/**
 * Created by Babatunde on 2/10/2016.
 */

package services.roombookpro.messages;


import services.roombookpro.dto.PayType;

import java.util.ArrayList;

public class HotelSearchRequest {
  private String currency;
  private String city;
  private String checkIn;
  private String checkOut;
  private Integer adultCount;
  private ArrayList<Integer> childAges;
  private Integer rating;
  private Boolean availableOnly;
  private String nationality;
  private PayType payType;
  private Integer agentMarkUp;

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
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

  public Integer getAdultCount() {
    return adultCount;
  }

  public void setAdultCount(Integer adultCount) {
    this.adultCount = adultCount;
  }

  public ArrayList<Integer> getChildAges() {
    if(childAges == null) {
      childAges = new ArrayList<>();
    }
    return childAges;
  }

  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }

  public Boolean getAvailableOnly() {
    return availableOnly;
  }

  public void setAvailableOnly(Boolean availableOnly) {
    this.availableOnly = availableOnly;
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public PayType getPayType() {
    return payType;
  }

  public void setPayType(PayType payType) {
    this.payType = payType;
  }

  public Integer getAgentMarkUp() {
    return agentMarkUp;
  }

  public void setAgentMarkUp(Integer agentMarkUp) {
    this.agentMarkUp = agentMarkUp;
  }
}