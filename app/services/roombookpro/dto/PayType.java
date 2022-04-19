/**
 * Created by Ibrahim Olanrewaju on 2/15/2016.
 */

package services.roombookpro.dto;

public enum PayType {
  ALL("all"), PREPAY("prepay"), POST_PAY("postpay");

  private String value;
  PayType(String value) {
    this.value = value;
  }

  public String value() {
    return value;
  }
}
