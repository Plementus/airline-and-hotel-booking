/**
 * Created by Ibrahim Olanrewaju on 4/26/2016.
 */

package core.gdsbookingengine.booking;

import core.gdsbookingengine.PassengerType;

public class PriceQuote {
  private String RPH;
  private Double baseFare;
  private Double totalTax;
  private Double totalFare;
  private PassengerType passengerType;

  public String getRPH() {
    return RPH;
  }

  public void setRPH(String RPH) {
    this.RPH = RPH;
  }

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

  public PassengerType getPassengerType() {
    return passengerType;
  }

  public void setPassengerType(PassengerType passengerType) {
    this.passengerType = passengerType;
  }

  @Override
  public String toString() {
    return "PriceQuote{" +
        "RPH='" + RPH + '\'' +
        ", baseFare=" + baseFare +
        ", totalTax=" + totalTax +
        ", totalFare=" + totalFare +
        ", passengerType=" + passengerType +
        '}';
  }
}
