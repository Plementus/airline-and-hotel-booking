package core.gdsbookingengine;

import models.CabinPreference;
import models.Airports;
import models.TripType;

import java.util.List;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 12/7/15 10:21 PM
 * |
 **/

public interface FlightRequestEnvelopeInterface extends Comparable<FlightRequestEnvelopeInterface> {

    List<Airports> getDepartureAirports();

    void setDepartureAirports(List<Airports> departureAirports);

    List<Airports> getArrivalAirports();

    void setArrivalAirports(List<Airports> arrivalAirports);

    List<String> getDepartureDates();

    void setDepartureDates(List<String> departureDates);

    List<String> getArrivalDates();

    void setArrivalDates(List<String> arrivalDates);

    int getNumberOfAdults();

    void setNumberOfAdults(int numberOfAdults);

    int getNumberOfChildren();

    void setNumberOfChildren(int numberOfChildren);

    int getNumberOfInfant();

    void setNumberOfInfant(int numberOfInfant);

    TripType getTripType();

    void setTripType(TripType tripType);

    CabinPreference getPreferredCabin();

    void setPreferredCabin(CabinPreference preferredCabin);

    String getPreferredAirline();

    void setPreferredAirline(String preferredAirline);

    String getRequestUrl();

    void setRequestUrl(String requestUrl);

    void setDirectFlight(Boolean value);

    Boolean isDirectFlight();
}