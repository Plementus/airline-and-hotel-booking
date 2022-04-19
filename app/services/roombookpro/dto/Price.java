/**
 * Created by Ibrahim Olanrewaju on 2/10/2016.
 */
package services.roombookpro.dto;

public class Price {
  private Double value;
  private String currency;

  public Price(Double value, String currency) {
    this.value = value;
    this.currency = currency;
  }

  public Price() {}

  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }
}
