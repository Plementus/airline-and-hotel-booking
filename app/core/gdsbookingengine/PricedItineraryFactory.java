/**
 * Created by Ibrahim Olanrewaju on 4/7/2016.
 */

package core.gdsbookingengine;

public interface PricedItineraryFactory {
    PricedItineraryWSResponse createPricedItineraryWSResponse(PricedItineraryWrapper pricedItinerary);
}