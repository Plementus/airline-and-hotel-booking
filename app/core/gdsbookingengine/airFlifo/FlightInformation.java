package core.gdsbookingengine.airFlifo;

import services.amadeus.airfliforq.Comment;
import services.amadeus.airfliforq.FlightLegInfo;

import java.util.List;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 28/02/2016 8:31 AM
 * |
 **/
public class FlightInformation {


    private List<Comment> comment;
    private List<FlightLegInfo> flightLegInfo;
    private String messageStatus;
    private String totalTripTime;
    private String totalFlightTime;
    private String totalGroundTime;
    private Integer totalMiles;

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void setFlightLegInfo(List<FlightLegInfo> flightLegInfo) {
        this.flightLegInfo = flightLegInfo;
    }

    public List<FlightLegInfo> getFlightLegInfo() {
        return flightLegInfo;
    }

    public void setMessageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
    }

    public String getMessageStatus() {
        return messageStatus;
    }

    public void setTotalFlightTime(String totalFlightTime) {
        this.totalFlightTime = totalFlightTime;
    }

    public String getTotalFlightTime() {
        return totalFlightTime;
    }

    public void setTotalGroundTime(String totalGroundTime) {
        this.totalGroundTime = totalGroundTime;
    }

    public String getTotalGroundTime() {
        return totalGroundTime;
    }

    public void setTotalMiles(Integer totalMiles) {
        this.totalMiles = totalMiles;
    }

    public void setTotalTripTime(String totalTripTime) {
        this.totalTripTime = totalTripTime;
    }

    public String getTotalTripTime() {
        return totalTripTime;
    }
}