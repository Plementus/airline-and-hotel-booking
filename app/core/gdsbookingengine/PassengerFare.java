/**
 * Created by Ibrahim Olanrewaju on 4/18/2016.
 */

package core.gdsbookingengine;

public class PassengerFare {
  private Double baseFare;
  private Double totalTax;
  private Double totalFare;

  public Double getBaseFare() {
    return baseFare;
  }

  public void setBaseFare(Double baseFare) {
    this.baseFare = baseFare;
  }

  public Double getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(Double totalTax) {
    this.totalTax = totalTax;
  }

  public Double getTotalFare() {
    return totalFare;
  }

  public void setTotalFare(Double totalFare) {
    this.totalFare = totalFare;
  }
}
