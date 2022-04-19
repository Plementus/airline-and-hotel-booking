package core.gdsbookingengine;

import play.Logger;
import play.libs.Json;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * |
 * | Created by Kode.
 * | On 28/12/2015 10:08 AM
 * |
 **/
public class FlightDataGroup {

    protected List<PricedItineraryWSResponse> record;

    private Set<Double> priceRange;

    public Set<String> availableAirline;

    public Set<Integer> numberOfStops;

    public FlightDataGroup(List<PricedItineraryWSResponse> record) {
        this();
        this.record = record;
    }

    public FlightDataGroup() {
        record = new ArrayList<>();
        availableAirline = new LinkedHashSet<>();
        numberOfStops = new HashSet<>();
        priceRange = new HashSet<>();
    }

    public void add(List<PricedItineraryWSResponse> record) {
        if (record != null && record.size() != 0)
            record.forEach(this.record::add);
    }

    public List<PricedItineraryWSResponse> get() {
        Collections.sort(record, PricedItineraryWSResponse.priceComparator); //sort by lowest price by default.
        Logger.info(""+Json.toJson(record.get(0)));
        return record;
    }

    public PricedItineraryWSResponse get(int index) {
        return record.get(index);
    }

    public Set<Integer> getNumberOfStops() {
        record.forEach(flightItinerary -> {
            flightItinerary.getAirItineraryWSResponse().getOriginDestinationWSResponses().forEach(originDestinationWSResponse -> {
                numberOfStops.add(originDestinationWSResponse.getNumberOfStops());
            });
        });
        return numberOfStops;
    }

    public Set<Double> getPriceRange() {
        record.forEach(flightItinerary -> {
            priceRange.add(flightItinerary.getPricingInfoWSResponse().getTotalFare());
        });
        return priceRange;
    }

    public Set<String> getAvailableAirline() {
        record.forEach(pricedItineraryWSResponse -> {
            availableAirline.add(pricedItineraryWSResponse.getAirline());
        });
        return availableAirline;
    }

    public Set<String>[] departureArrivalDates() {
        Set<String> departureDates = new HashSet<>();
        Set<String> arrivalDates = new HashSet<>();
        for (PricedItineraryWSResponse wsResponse : get()) {
            departureDates.add(wsResponse.getAirItineraryWSResponse().getOriginDestinationWSResponses().get(0).getDepartureDateTime());
            arrivalDates.add(wsResponse.getAirItineraryWSResponse().getOriginDestinationWSResponses().get(0).getArrivalDateTime());
        }
        return new Set[]{departureDates, arrivalDates};
    }

    private Set<String> getAvailableAirlineCode() {
        Set<String> availableAirlineCode = new HashSet<>();
        record.forEach(pricedItineraryWSResponse -> {
            availableAirlineCode.add(pricedItineraryWSResponse.getAirlineCode());
        });
        return availableAirlineCode;
    }

    public Map<String, List<PricedItineraryWSResponse>> groupByAirlines() {
        if (get().size() <= 0) {
            return null;
        }
        Map<String, List<PricedItineraryWSResponse>> objectMap = new LinkedHashMap<>();
        List<PricedItineraryWSResponse> get = get();
        for (String airlineCode : getAvailableAirlineCode()) {
            List<PricedItineraryWSResponse> flightRecords = new ArrayList<>();
            for (PricedItineraryWSResponse pricedItineraryWSResponse : get) {
                if (pricedItineraryWSResponse.getAirlineCode().equals(airlineCode)) {
                    flightRecords.add(pricedItineraryWSResponse);
                }
            }
            objectMap.put(airlineCode, flightRecords);
        }
        return objectMap;
    }

    public Map<String, PricedItineraryWSResponse> getAirlineCheapestFares() {
        if (get().size() <= 0) {
            return null;
        }
        Map<String, PricedItineraryWSResponse> responseObj = new LinkedHashMap<>();
        List<PricedItineraryWSResponse> get = get();
        for (String airlineCode : getAvailableAirlineCode()) {
            for (PricedItineraryWSResponse pricedItineraryWSResponse : get) {
                if (pricedItineraryWSResponse.getAirlineCode().equals(airlineCode)) {
                    responseObj.put(airlineCode, pricedItineraryWSResponse);
                }
            }
        }
        return responseObj;
    }

    private static void sortDT(List<String> dt) {
        Collections.sort(dt, (o1, o2) -> {
            DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            try {
                return f.parse(o1).compareTo(f.parse(o2));
            } catch (ParseException e) {
                throw new IllegalArgumentException(e);
            }
        });
    }

    public Map<String, List<PricedItineraryWSResponse>> groupByDepArrDateTime() {
        if (get() == null || get().size() <= 0) {
            return null;
        }
        Map<String, List<PricedItineraryWSResponse>> respObj = new LinkedHashMap<>();
        Set<String> depArrDates = new LinkedHashSet<>();
        Set<String> departureDates = new LinkedHashSet<>();
        Set<String> arrivalDates = new LinkedHashSet<>();
        get().forEach(pricedItineraryWSResponse -> {
            String dep = pricedItineraryWSResponse.getAirItineraryWSResponse().getOriginDestinationWSResponses().get(0).getDepartureDateTime().split("T")[0];
            if (pricedItineraryWSResponse.getAirItineraryWSResponse().getOriginDestinationWSResponses().size() > 1) {
                String arr = pricedItineraryWSResponse.getAirItineraryWSResponse().getOriginDestinationWSResponses().get(1).getDepartureDateTime().split("T")[0];
                arrivalDates.add(arr);
            }
            departureDates.add(dep);
        });
        List<String> sortedDpDate = new ArrayList<>(departureDates);
        List<String> sortedArDate = new ArrayList<>(arrivalDates);
        sortDT(sortedDpDate);
        sortDT(sortedArDate);
        for (int i = 0; i < sortedDpDate.size(); i++) {
            if(arrivalDates.size() != 0) {
                depArrDates.add(sortedDpDate.get(i) + "<<>>" + sortedArDate.get(i));
            }
        }

        for (String dpDate : depArrDates) {
            List<PricedItineraryWSResponse> flightRecords = new ArrayList<>();
            for (PricedItineraryWSResponse pricedItineraryWSResponse : get()) {
                String compDepArrDT = pricedItineraryWSResponse.getAirItineraryWSResponse().getOriginDestinationWSResponses().get(0).getDepartureDateTime().split("T")[0];
                boolean isPriceOccurred = false;
                for (PricedItineraryWSResponse flightRecord : flightRecords) {
                    if (Objects.equals(pricedItineraryWSResponse.getPricingInfoWSResponse().getTotalFare(), flightRecord.getPricingInfoWSResponse().getTotalFare()) && pricedItineraryWSResponse.getAirlineCode().equals(flightRecord.getAirlineCode())) {
                        isPriceOccurred = true;
                    }
                }
                if (compDepArrDT.equals(dpDate.split("<<>>")[0]) && !isPriceOccurred) {
                    flightRecords.add(pricedItineraryWSResponse);
                }
            }
            respObj.put(dpDate, flightRecords);
        }
        return respObj;
    }

    public List<PricedItineraryWSResponse> sortByShortestDuration() {
        if (get().size() <= 0) {
            return null;
        }
        List<PricedItineraryWSResponse> get = get();
        //sort the price
        Collections.sort(get, PricedItineraryWSResponse.durationComparator);
        return get;
    }

    public Map<String, Object> sortByStopOver() {
        return null;
    }

}
