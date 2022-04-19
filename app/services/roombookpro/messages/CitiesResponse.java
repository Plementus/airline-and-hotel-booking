/**
 * Created by Babatunde on 3/22/2016.
 */

package services.roombookpro.messages;

import services.roombookpro.dto.City;

import java.util.List;

public class CitiesResponse {
  private List<City> cities;

  public CitiesResponse() {}

  public CitiesResponse(List<City> cities) {
    this.cities = cities;
  }

  public List<City> getCities() {
    return cities;
  }

  public void setCities(List<City> cities) {
    this.cities = cities;
  }
}
