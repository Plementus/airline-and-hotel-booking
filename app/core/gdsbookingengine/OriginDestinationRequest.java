/**
 * Created by Ibrahim Olanrewaju on 3/24/2016.
 */

package core.gdsbookingengine;

public class OriginDestinationRequest {
  private String origin;
  private String destination;
  private String departureDateTime;
  private String RPH;

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public String getDepartureDateTime() {
    return departureDateTime;
  }

  public void setDepartureDateTime(String departureDateTime) {
    this.departureDateTime = departureDateTime;
  }

  public String getRPH() {
    return RPH;
  }

  public void setRPH(String RPH) {
    this.RPH = RPH;
  }
}
