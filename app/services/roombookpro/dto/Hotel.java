/**
 * Created by Ibrahim Olanrewaju on 2/11/2016.
 */
package services.roombookpro.dto;

public class Hotel {
  private Integer searchID;
  private Integer id;
  private String code;
  private String name;
  private String rating;
  private String checkInTime;
  private String checkOutTime;
  private Boolean allLeadInfo;
  private Double latitude;
  private Double longitude;
  private String location;
  private String description;
  private String address1;
  private String address2;
  private String zipCode;
  private String city;

  public Integer getSearchID() {
    return searchID;
  }

  public void setSearchID(Integer searchID) {
    this.searchID = searchID;
  }

  public Integer getID() {
    return id;
  }

  public void setID(Integer ID) {
    this.id = ID;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String hotelCode) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setHotelName(String name) {
    this.name = name;
  }

  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public String getCheckInTime() {
    return checkInTime;
  }

  public void setCheckInTime(String checkInTime) {
    this.checkInTime = checkInTime;
  }

  public String getCheckOutTime() {
    return checkOutTime;
  }

  public void setCheckOutTime(String checkOutTime) {
    this.checkOutTime = checkOutTime;
  }

  public Boolean isAllLeadInfo() {
    return allLeadInfo;
  }

  public void setAllLeadInfo(Boolean allLeadInfo) {
    this.allLeadInfo = allLeadInfo;
  }

  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longtitude) {
    this.longitude = longtitude;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }
}
