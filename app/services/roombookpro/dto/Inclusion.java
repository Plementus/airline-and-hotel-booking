/**
 * Created by Ibrahim Olanrewaju on 2/11/2016.
 */

package services.roombookpro.dto;

public class Inclusion {
  private String name;
  private Boolean mandatory;
  private Boolean payAtProperty;
  private String priceType;
  private Price price;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean isMandatory() {
    return mandatory;
  }

  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }

  public Boolean isPayAtProperty() {
    return payAtProperty;
  }

  public void setPayAtProperty(Boolean payAtProperty) {
    this.payAtProperty = payAtProperty;
  }

  public String getPriceType() {
    return priceType;
  }

  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }

  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }
}
