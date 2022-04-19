/**
 * Created by Ibrahim Olanrewaju on 4/26/2016.
 */

package core.gdsbookingengine.booking;

public class PriceComparison {
  private Double amountSpecified;
  private Double amountReturned;

  public Double getAmountSpecified() {
    return amountSpecified;
  }

  public void setAmountSpecified(Double amountSpecified) {
    this.amountSpecified = amountSpecified;
  }

  public Double getAmountReturned() {
    return amountReturned;
  }

  public void setAmountReturned(Double amountReturned) {
    this.amountReturned = amountReturned;
  }

  @Override
  public String toString() {
    return "PriceComparison{" +
        "amountSpecified=" + amountSpecified +
        ", amountReturned=" + amountReturned +
        '}';
  }
}
