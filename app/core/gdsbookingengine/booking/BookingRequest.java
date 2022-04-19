/**
 * Created by Ibrahim Olanrewaju on 4/11/2016.
 */

package core.gdsbookingengine.booking;

import core.gdsbookingengine.FlightSegmentWSResponse;
import core.gdsbookingengine.PassengerCode;
import core.gdsbookingengine.PassengerType;
import services.sabre.client.FlightAvailabilityRequest;

import java.util.*;
import java.util.stream.Collectors;

public class BookingRequest {
    private List<Passenger> passengers = new ArrayList<>();
    private FlightAvailabilityRequest flightAvailabilityRequest;

    public FlightAvailabilityRequest getFlightAvailabilityRequest() {
        return flightAvailabilityRequest;
    }

    public void setFlightAvailabilityRequest(FlightAvailabilityRequest flightAvailabilityRequest) {
        this.flightAvailabilityRequest = flightAvailabilityRequest;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public List<PassengerType> getPassengerTypes() {
        List<Passenger> passengers = getPassengers();
        Map<PassengerCode, Integer> map = Collections.emptyMap();

        if (passengers.size() != 0) {
            passengers.forEach(passenger -> {
                if (map.containsKey(passenger.getCode())) {
                    map.put(passenger.getCode(), map.get(passenger.getCode()) + 1);
                } else {
                    map.put(passenger.getCode(), 1);
                }
            });

            return map.entrySet().stream().map(entry -> new PassengerType(entry.getKey(), entry.getValue()))
                    .collect(Collectors.toList());
        } else {
            return Collections.emptyList();
        }
    }

}