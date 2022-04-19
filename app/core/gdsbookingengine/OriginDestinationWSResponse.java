package core.gdsbookingengine;

import java.util.ArrayList;
import java.util.List;

public class OriginDestinationWSResponse {
    List<FlightSegmentWSResponse> flightSegmentWSResponses;
    private String originAirport;
    private String destinationAirport;
    private String originAirportCode;
    private String destinationAirportCode;
    private String arrivalDateTime;
    private String departureDateTime;
    private String duration;
    private String marketingAirline;
    private String marketingAirlineCode;
    private String operatingAirline;
    private String operatingAirlineCode;
    private String cabin;
    private boolean isMultiAirline;
    private Integer numberOfStops;

    public String getDepartureDateTime() {
        return getFlightSegmentWSResponses().stream().findFirst().map(FlightSegmentWSResponse::getDepartureDateTime).orElseGet(() -> "");
    }

    public String getArrivalDateTime() {
        return getFlightSegmentWSResponses().get(getFlightSegmentWSResponses().size() - 1)
                .getArrivalDateTime();
    }

    public String getOriginAirport() {
        return getFlightSegmentWSResponses().stream()
                .findFirst().map(FlightSegmentWSResponse
                        ::getDepartureAirport).orElseGet(() -> "");
    }

    public String getOriginAirportCode() {
        return getFlightSegmentWSResponses().stream().findFirst().map(FlightSegmentWSResponse::getDepartureAirportCode).orElseGet(() -> "");
    }

    public String getDestinationAirport() {
        return getFlightSegmentWSResponses().get(
                getFlightSegmentWSResponses().size() - 1)
                .getArrivalAirport();
    }

    public String getDestinationAirportCode() {
        return getFlightSegmentWSResponses().get(
                getFlightSegmentWSResponses().size() - 1)
                .getArrivalAirportCode();
    }

    public String getCabin() {
        cabin = flightSegmentWSResponses.get(0).getCabin();
        return cabin;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<FlightSegmentWSResponse> getFlightSegmentWSResponses() {
        if (flightSegmentWSResponses == null) {
            flightSegmentWSResponses = new ArrayList<>();
        }
        return flightSegmentWSResponses;
    }

    public int getNumberOfStops() {
        return getFlightSegmentWSResponses().size() - 1;
    }

    public String getMarketingAirline() {
        return getFlightSegmentWSResponses().stream()
                .findFirst().map(FlightSegmentWSResponse
                        ::getMarketingAirline).orElseGet(() -> "");
    }

    public String getMarketingAirlineCode() {
        return getFlightSegmentWSResponses().stream()
                .findFirst().map(FlightSegmentWSResponse
                        ::getMarketingAirlineCode).orElseGet(() -> "");
    }

    public String getOperatingAirline() {
        return operatingAirline;
    }

    public void setOperatingAirline(String operatingAirline) {
        this.operatingAirline = operatingAirline;
    }

    public String getOperatingAirlineCode() {
        return operatingAirlineCode;
    }

    public void setOperatingAirlineCode(String operatingAirlineCode) {
        this.operatingAirlineCode = operatingAirlineCode;
    }

    public boolean isMultiAirline() {
        return isMultiAirline;
    }

    public void setMultiAirline(boolean multiAirline) {
        isMultiAirline = multiAirline;
    }
}
