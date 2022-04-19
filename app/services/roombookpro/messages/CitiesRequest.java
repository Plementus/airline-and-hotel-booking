/**
 * Created by Babatunde on 3/22/2016.
 */

package services.roombookpro.messages;

public class CitiesRequest {
  private String country;

  public CitiesRequest(String country) {
    setCountry(country);
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }
}