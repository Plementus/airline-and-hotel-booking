/**
 * Created by Ibrahim Olanrewaju on 4/27/2016.
 */

package core.gdsbookingengine;

import models.FlightBookings;

public class PNRDetails {
  private FlightBookings flightBookings;

  private String itineraryRef;

  public PNRDetails() {}

  public PNRDetails(String itineraryRef) {
    this.itineraryRef = itineraryRef;
  }

  public String getItineraryRef() {
    return itineraryRef;
  }

  public void setItineraryRef(String itineraryRef) {
    this.itineraryRef = itineraryRef;
  }

  public FlightBookings getFlightBookings() {
    return flightBookings;
  }

  public void setFlightBookings(FlightBookings flightBookings) {
    this.flightBookings = flightBookings;
  }
}
