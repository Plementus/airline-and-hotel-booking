/**
 * Created by Ibrahim Olanrewaju on 3/22/2016.
 */

package services.roombookpro.dto;

public class City {
  private int id;
  private String code;
  private String name;
  private String state;
  private String country;

  public City() {}

  public City(int id, String code, String name, String state, String country) {
    setId(id);
    setCode(code);
    setName(name);
    setState(state);
    setCountry(country);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
}
