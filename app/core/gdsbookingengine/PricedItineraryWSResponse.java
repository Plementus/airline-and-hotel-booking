/**
 * Created by Ibrahim Olanrewaju on 4/2/2016.
 */

package core.gdsbookingengine;

import core.ObjectSerializer;
import core.security.Hash;
import models.GdsNames;
import models.SalesCategory;
import models.TicketLocale;
import models.TicketPolicy;
import services.amadeus.lowfareplus.TicketingInfo;

import java.util.Comparator;
import java.util.Objects;


public class PricedItineraryWSResponse implements Comparable<PricedItineraryWSResponse> {

    private AirItineraryWSResponse airItineraryWSResponse;
    private PricingInfoWSResponse pricingInfoWSResponse;
    private TicketingInfoWSResponse ticketingInfoWSResponse;
    private TicketingInfo ticketingInfo;
    private String airline;
    private String airlineCode;
    private GdsNames gds;
    private String cabin;
    private ObjectSerializer objectSerializer;
    private Integer cacheIndex;
    private TicketPolicy ticketPolicy; //not implemented
    private SalesCategory salesCategory; //not implemented
    private TicketLocale ticketLocale; //not implemented
    private boolean hotelCombo = false; //not implemented
    private FlightSearchRequest searchRequest;


    public PricedItineraryWSResponse() {}

    public PricedItineraryWSResponse(AirItineraryWSResponse airItineraryWSResponse, PricingInfoWSResponse pricingInfoWSResponse, TicketingInfoWSResponse ticketingInfoWSResponse, FlightSearchRequest flightSearchRequest) {
        this.airItineraryWSResponse = airItineraryWSResponse;
        this.pricingInfoWSResponse = pricingInfoWSResponse;
        this.ticketingInfoWSResponse = ticketingInfoWSResponse;
        this.setAirlineCode(airItineraryWSResponse.getOriginDestinationWSResponses().get(0).getMarketingAirlineCode());
        this.setAirline(airItineraryWSResponse.getOriginDestinationWSResponses().get(0).getMarketingAirline());
        this.setGDS(GdsNames.SABRE);
        this.setSearchRequest(flightSearchRequest);
    }


    public AirItineraryWSResponse getAirItineraryWSResponse() {
        return this.airItineraryWSResponse;
    }

    public void setAirItineraryWSResponse(AirItineraryWSResponse airItineraryWSResponse) {
        this.airItineraryWSResponse = airItineraryWSResponse;
    }

    public PricingInfoWSResponse getPricingInfoWSResponse() {
        return this.pricingInfoWSResponse;
    }

    public void setPricingInfoWSResponse(PricingInfoWSResponse pricingInfoWSResponse) {
        this.pricingInfoWSResponse = pricingInfoWSResponse;
    }

    public TicketingInfoWSResponse getTicketingInfoWSResponse() {
        return this.ticketingInfoWSResponse;
    }

    public void setTicketingInfoWSResponse(TicketingInfoWSResponse ticketingInfoWSResponse) {
        this.ticketingInfoWSResponse = ticketingInfoWSResponse;
    }

    public String getAirline() {
        return this.airline;
    }

    public String getAirlineCode() {
        return this.airlineCode;
    }

    public void setTicketingInfo(TicketingInfo ticketingInfo) {
        this.ticketingInfo = ticketingInfo;
    }

    public TicketingInfo getTicketingInfo() {
        return this.ticketingInfo;
    }

    public String getCabin() {
        return this.cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public GdsNames getGDS() {
        return this.gds;
    }

    public void setGDS(GdsNames gds) {
        this.gds = gds;
    }

    public ObjectSerializer objectSerializer() {
        return this.objectSerializer;
    }

    public Integer getCacheIndex() {
        return this.cacheIndex;
    }

    public void setCacheIndex(Integer index) {
        this.cacheIndex = index;
    }

    public static Comparator<PricedItineraryWSResponse> priceComparator = (o1, o2) -> {
        int comparablePrice = (int) Math.abs(o1.getPricingInfoWSResponse().getTotalFare());
        int p = (int) Math.abs(o2.getPricingInfoWSResponse().getTotalFare());
        return comparablePrice - p;
    };

    public int compareTo(PricedItineraryWSResponse o) {
        int comparablePrice = (int) Math.abs(o.getPricingInfoWSResponse().getTotalFare());
        int p = (int) Math.abs(this.getPricingInfoWSResponse().getTotalFare());
        return comparablePrice - p;
    }

    public static Comparator<PricedItineraryWSResponse> durationComparator = (o1, o2) -> {
        int comparablePrice = (int) Math.abs(o1.getPricingInfoWSResponse().getTotalFare());
        int p = (int) Math.abs(o2.getPricingInfoWSResponse().getTotalFare());
        return p - comparablePrice;
    };

    public static Comparator<PricedItineraryWSResponse> sortCheapestPriceComparator = (o1, o2) -> {
        if (o1.getPricingInfoWSResponse().getTotalFare().compareTo(o2.getPricingInfoWSResponse().getTotalFare()) == -1) {
            return 1;
        } else {
            return -1;
        }
    };

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public FlightSearchRequest getSearchRequest() {
        return searchRequest;
    }

    public void setSearchRequest(FlightSearchRequest searchRequest) {
        this.searchRequest = searchRequest;
    }

    @Override
    public String toString() {
        return "PricedItineraryWSResponse{" +
                "airItineraryWSResponse=" + airItineraryWSResponse +
                ", pricingInfoWSResponse=" + pricingInfoWSResponse +
                ", ticketingInfoWSResponse=" + ticketingInfoWSResponse +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PricedItineraryWSResponse that = (PricedItineraryWSResponse) o;
        return Objects.equals(airItineraryWSResponse, that.airItineraryWSResponse) &&
                Objects.equals(pricingInfoWSResponse, that.pricingInfoWSResponse) &&
                Objects.equals(ticketingInfoWSResponse, that.ticketingInfoWSResponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airItineraryWSResponse, pricingInfoWSResponse, ticketingInfoWSResponse);
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
