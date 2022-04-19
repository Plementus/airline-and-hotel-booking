package core.gdsbookingengine.clients;

import core.Cookies;
import core.gdsbookingengine.FlightSearchRequest;
import core.gdsbookingengine.PricedItineraryWSResponse;
import play.Logger;
import play.cache.Cache;
import play.libs.Json;
import play.mvc.Http;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by
 * Ibrahim Olanrewaju. on 14/04/2016 9:19 AM.
 */
public class FlightCacheClient {

    String userCookieKey = Cookies.COOKIE_NAME;

    public Http.Request request = Http.Context.current().request();
    private String flightCacheKey;
    private String searchCacheKey;
    private static final int cacheFlightResultTime = 60 * 60;

    public FlightCacheClient() {
        this.request = Http.Context.current().request();
        this.userCookieKey = this.request.cookie(Cookies.COOKIE_NAME).value();
        flightCacheKey = this.userCookieKey + "FlightSearch";
        searchCacheKey = this.userCookieKey + "FlightSearchEnvelope";
    }

    public FlightCacheClient(Http.Request request) {
        this();
        this.request = request;
    }

    public void cacheSearchRequest(FlightSearchRequest request) {
        Cache.set(searchCacheKey, request, cacheFlightResultTime);
    }

    public List<PricedItineraryWSResponse> cacheFlightResult(List<PricedItineraryWSResponse> items) {
        Cache.remove(searchCacheKey);
        Cache.remove(flightCacheKey);
        List<PricedItineraryWSResponse> itemWithIndex = new ArrayList<>();
        int index = 0;
        for (PricedItineraryWSResponse wsResponse : items) {
            wsResponse.setCacheIndex(index);
            itemWithIndex.add(wsResponse);
            index += 1;
        }
        Cache.set(flightCacheKey, itemWithIndex, cacheFlightResultTime);
        return items;
    }

    public FlightSearchRequest getFlightRequest() {
        return (FlightSearchRequest) Cache.get(searchCacheKey);
    }

    public List<PricedItineraryWSResponse> getCachedItem() {
        return (List<PricedItineraryWSResponse>) Cache.get(flightCacheKey);
    }

    public PricedItineraryWSResponse getCachedItem(int cacheIndex) {
        PricedItineraryWSResponse priceItinerary = null;
        for (PricedItineraryWSResponse item : getCachedItem()) {
            if (item.getCacheIndex() == cacheIndex) {
                priceItinerary = item;
            }
        }
        return priceItinerary;
    }
}
