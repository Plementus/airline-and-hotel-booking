/**
 * Created by Ibrahim Olanrewaju on 2/12/2016.
 */
package services.roombookpro.dto;

public class CancellationPolicy {
  private String description;
  private Price price;

  public CancellationPolicy(String description, Price price) {
    this.description = description;
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }
}
