/**
 * Created by Ibrahim Olanrewaju on 3/24/2016.
 */

package core.gdsbookingengine;

import models.*;
import services.amadeus.lowfareplus.PassengerTypeQuantity;

import java.util.ArrayList;
import java.util.List;

public class FlightSearchRequest {
    private List<OriginDestinationRequest> originDestinationRequests;
    private List<PassengerType> passengerTypes;
    private TripType tripType;
    private CabinPreference preferredCabin;
    private CabinPrefLevel cabinPrefLevel;
    private String preferredAirline;
    private FlightType flightType;
    private int seatCount;
    private boolean isDirectFlight = false;
    private boolean flexibleDate = false;
    private List<PassengerTypeQuantity> passengerTypeQuantities; //this is amadeus, should be removed.
    private TicketPolicy ticketPolicy;
    private SalesCategory salesCategory;
    private TicketLocale ticketLocale;
    private boolean hotelCombo = false;

    public List<OriginDestinationRequest> getOriginDestinationRequests() {
        if (originDestinationRequests == null) {
            originDestinationRequests = new ArrayList<>();
        }
        return originDestinationRequests;
    }

    public List<PassengerType> getPassengerTypes() {
        if (passengerTypes == null) {
            passengerTypes = new ArrayList<>();
        }
        return passengerTypes;
    }

    public TripType getTripType() {
        return tripType;
    }

    public void setTripType(TripType tripType) {
        this.tripType = tripType;
    }

    public CabinPreference getPreferredCabin() {
        return preferredCabin;
    }

    public void setPreferredCabin(CabinPreference preferredCabin) {
        this.preferredCabin = preferredCabin;
    }

    public CabinPrefLevel getCabinPrefLevel() {
        return cabinPrefLevel;
    }

    public void setCabinPrefLevel(CabinPrefLevel cabinPrefLevel) {
        this.cabinPrefLevel = cabinPrefLevel;
    }

    public String getPreferredAirline() {
        return preferredAirline;
    }

    public void setPreferredAirline(String preferredAirline) {
        this.preferredAirline = preferredAirline;
    }

    public FlightType getFlightType() {
        return flightType;
    }

    public void setFlightType(FlightType flightType) {
        this.flightType = flightType;
    }

    public int getSeatCount() {
        seatCount = 0;
        getPassengerTypes().forEach(passengerType -> {
                    if (!passengerType.getCode().value().equals(PassengerCode.INFANT.value())) {
                        seatCount += passengerType.getQuantity();
                    }
                }
        );
        return seatCount;
    }

    public boolean isDirectFlight() {
        return isDirectFlight;
    }

    public void setDirectFlight(boolean directFlight) {
        isDirectFlight = directFlight;
    }

    public List<PassengerTypeQuantity> getPassengerTypeQuantities() {
        if (passengerTypeQuantities == null) {
            passengerTypeQuantities = new ArrayList<>();
        }
        return passengerTypeQuantities;
    }

    public boolean isFlexibleDate() {
        return flexibleDate;
    }

    public void setFlexibleDate(boolean flexibleDate) {
        this.flexibleDate = flexibleDate;
    }


    public TicketPolicy getTicketPolicy() {
        return ticketPolicy;
    }

    public void setTicketPolicy(TicketPolicy ticketPolicy) {
        this.ticketPolicy = ticketPolicy;
    }

    public SalesCategory getSalesCategory() {
        return salesCategory;
    }

    public void setSalesCategory(SalesCategory salesCategory) {
        this.salesCategory = salesCategory;
    }

    public TicketLocale getTicketLocale() {
        return ticketLocale;
    }

    public void setTicketLocale(TicketLocale ticketLocale) {
        this.ticketLocale = ticketLocale;
    }

    public boolean isHotelCombo() {
        return hotelCombo;
    }

    public void setHotelCombo(boolean hotelCombo) {
        this.hotelCombo = hotelCombo;
    }
}
