/**
 * Created by Ibrahim Olanrewaju on 2/11/2016.
 */

package services.roombookpro.dto;

public enum PaymentType {
  HOLD("hold"), CASH("cash"), CREDIT("credit");

  private String value;
  PaymentType(String value) {
    this.value = value;
  }

  public String value() {
    return value;
  }
}
