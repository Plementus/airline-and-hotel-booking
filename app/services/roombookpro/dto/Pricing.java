/**
 * Created by Ibrahim Olanrewaju on 2/15/2016.
 */

package services.roombookpro.dto;

public class Pricing {
  private Price price;
  private String component;

  public Pricing(Price price, String component) {
    this.price = price;
    this.component = component;
  }

  public Pricing() {}

  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }
}
