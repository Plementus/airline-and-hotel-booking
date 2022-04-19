/**
 * Created by Ibrahim Olanrewaju on 4/20/2016.
 */

package services.sabre.client;

import core.gdsbookingengine.FlightSegmentWSResponse;
import core.gdsbookingengine.PassengerType;

import java.util.ArrayList;
import java.util.List;


public class FlightAvailabilityRequest {
  private List<FlightSegmentWSResponse> flightSegmentWSResponses = new ArrayList<>();
  private List<PassengerType> passengerTypes = new ArrayList<>();
  private Double totalFare;
  private int numberInParty;

  public List<FlightSegmentWSResponse> getFlightSegmentWSResponses() {
    return flightSegmentWSResponses;
  }


  public List<PassengerType> getPassengerTypes() {
    return passengerTypes;
  }

  public Double getTotalFare() {
    return totalFare;
  }

  public void setTotalFare(Double totalFare) {
    this.totalFare = totalFare;
  }

  public int getNumberInParty() {
    return getPassengerTypes().stream().mapToInt(PassengerType::getQuantity).sum();
  }

}
