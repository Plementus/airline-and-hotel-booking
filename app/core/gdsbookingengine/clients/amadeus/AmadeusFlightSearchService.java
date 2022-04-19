package core.gdsbookingengine.clients.amadeus;

import core.gdsbookingengine.FlightSearchRequest;
import core.gdsbookingengine.FlightSearchResponse;
import play.libs.F;
import services.amadeus.lowfarematrix.OTAAirLowFareSearchMatrixRS;
import services.amadeus.lowfareplus.OTAAirLowFareSearchPlusRS;

/**
 * Created by Ibrahim Olanrewaju on 12/2/2015.
 */
final class AmadeusFlightSearchService {

    static F.Promise<OTAAirLowFareSearchPlusRS> getLowFareRQ(final FlightSearchRequest request) {
        return F.Promise.pure(AmadeusLowFareClient.getOTAAirLowFareSearchPlusRS(request));
    }

    static F.Promise<OTAAirLowFareSearchMatrixRS> getLowFareMatrixRQ(final FlightSearchRequest request) {
        return F.Promise.pure(AmadeusLowFareMatrixClient.getOTAAirLowFareSearchMatrixRS(request));
    }
}