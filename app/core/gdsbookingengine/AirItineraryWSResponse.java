package core.gdsbookingengine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AirItineraryWSResponse {
    private List<OriginDestinationWSResponse> originDestinationWSResponses;
    private String directionIndicator;

    public List<OriginDestinationWSResponse> getOriginDestinationWSResponses() {
        if (originDestinationWSResponses == null) {
            originDestinationWSResponses = new ArrayList<>();
        }
        return originDestinationWSResponses;
    }

    public String getDirectionIndicator() {
        return directionIndicator;
    }

    public void setDirectionIndicator(String directionIndicator) {
        this.directionIndicator = directionIndicator;
    }
}