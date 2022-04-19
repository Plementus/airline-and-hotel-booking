/**
 * Created by Ibrahim Olanrewaju on 4/3/2016.
 */

package core.gdsbookingengine;

import java.util.List;

public interface FlightSearchResponse {
    List<PricedItineraryWSResponse> getPricedItineraryWSResponses();
}