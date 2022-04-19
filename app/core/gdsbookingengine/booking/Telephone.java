/**
 * Created by Ibrahim Olanrewaju on 4/11/2016.
 */

package core.gdsbookingengine.booking;

import core.gdsbookingengine.PhoneUseType;

public class Telephone {
  private String phoneNumber;
  private PhoneUseType phoneUseType;
  private String locationCode;
  private String countryAccessCode;

  public static Telephone createInstance(String phoneNumber, PhoneUseType phoneUseType, String locationCode) {
    Telephone telephone = new Telephone();
    telephone.setPhoneNumber(phoneNumber);
    telephone.setPhoneUseType(phoneUseType);
    telephone.setLocationCode(locationCode);

    return telephone;
  }
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public PhoneUseType getPhoneUseType() {
    return phoneUseType;
  }

  public void setPhoneUseType(PhoneUseType phoneUseType) {
    this.phoneUseType = phoneUseType;
  }

  public String getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }

  public String getCountryAccessCode() {
    return countryAccessCode;
  }

  public void setCountryAccessCode(String countryAccessCode) {
    this.countryAccessCode = countryAccessCode;
  }
}
