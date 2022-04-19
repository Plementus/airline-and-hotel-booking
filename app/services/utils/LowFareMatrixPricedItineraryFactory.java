/**
 * Created by Ibrahim Olanrewaju on 4/7/2016.
 */

package services.utils;


import core.gdsbookingengine.*;
import services.amadeus.lowfarematrix.*;

import java.time.LocalDateTime;

public class LowFareMatrixPricedItineraryFactory implements PricedItineraryFactory {

    @Override
    public PricedItineraryWSResponse createPricedItineraryWSResponse(PricedItineraryWrapper pricedItin) {
        PricedItinerary pricedItinerary = (PricedItinerary) pricedItin;
        PricedItineraryWSResponse pricedItineraryWSResponse = new PricedItineraryWSResponse();

        pricedItineraryWSResponse.setAirItineraryWSResponse(createAirItineraryWSResponse(pricedItinerary.getAirItinerary()));
        pricedItineraryWSResponse.setPricingInfoWSResponse(createPricingInfoWSResponse(pricedItinerary.getAirItineraryPricingInfo()));
        pricedItineraryWSResponse.setTicketingInfoWSResponse(createTicketingInfoWSResponse(pricedItinerary.getAirItinerary()
                .getOriginDestinationOptions().getOriginDestinationOption().get(0).getFlightSegment().get(0)));

        return pricedItineraryWSResponse;
    }

    private AirItineraryWSResponse createAirItineraryWSResponse(AirItinerary airItinerary) {
        AirItineraryWSResponse airItineraryWSResponse = new AirItineraryWSResponse();

        airItineraryWSResponse.setDirectionIndicator(airItinerary.getDirectionInd().value());
        airItinerary.getOriginDestinationOptions().getOriginDestinationOption().stream()
                .map(this::createOriginDestinationWSResponse)
                .forEach(airItineraryWSResponse.getOriginDestinationWSResponses()::add);

        return airItineraryWSResponse;
    }

    private PricingInfoWSResponse createPricingInfoWSResponse(AirItineraryPricingInfo airItineraryPricingInfo) {
        PricingInfoWSResponse pricingInfoWSResponse = new PricingInfoWSResponse();

        pricingInfoWSResponse.setPricingSource(airItineraryPricingInfo.getPricingSource().value());
        pricingInfoWSResponse.setBaseFare(airItineraryPricingInfo.getItinTotalFare().getBaseFare().getAmount());
        pricingInfoWSResponse.setTotalTax(airItineraryPricingInfo.getItinTotalFare().getTaxes().getTax().stream()
                .mapToDouble(Tax::getAmount).sum());
        pricingInfoWSResponse.setTotalFare(airItineraryPricingInfo.getItinTotalFare().getTotalFare().getAmount());
        pricingInfoWSResponse.setCurrencyCode(airItineraryPricingInfo.getItinTotalFare().getTotalFare().getCurrencyCode());

        return pricingInfoWSResponse;
    }

    private TicketingInfoWSResponse createTicketingInfoWSResponse(FlightSegment flightSegment) {
        TicketingInfoWSResponse ticketingInfoWSResponse = new TicketingInfoWSResponse();
        String eTicketEligible = flightSegment.getETicketEligibility().value();

        if (eTicketEligible.equals("Eligible")) {
            ticketingInfoWSResponse.setTicketType(TicketType.E_TICKET);
        }

        String flightDateTime = flightSegment.getDepartureDateTime();
        LocalDateTime dateTime = LocalDateTime.parse(flightDateTime);
        ticketingInfoWSResponse.setTicketTimeLimit(dateTime.minusDays(1));

        return ticketingInfoWSResponse;
    }

    private OriginDestinationWSResponse createOriginDestinationWSResponse(OriginDestinationOption originDestinationOption) {
        OriginDestinationWSResponse originDestinationWSResponse = new OriginDestinationWSResponse();

        originDestinationOption.getFlightSegment().stream().map(this::createFlightSegmentWSResponse)
                .forEach(originDestinationWSResponse.getFlightSegmentWSResponses()::add);

        return originDestinationWSResponse;
    }

    private FlightSegmentWSResponse createFlightSegmentWSResponse(FlightSegment flightSegment) {
        FlightSegmentWSResponse flightSegmentWSResponse = new FlightSegmentWSResponse();

        flightSegmentWSResponse.setFlightNumber(flightSegment.getFlightNumber());
        flightSegmentWSResponse.setDepartureAirport(flightSegment.getDepartureAirport().getValue());
        flightSegmentWSResponse.setArrivalAirport(flightSegment.getArrivalAirport().getValue());
        flightSegmentWSResponse.setDepartureAirportCode(flightSegment.getDepartureAirport().getLocationCode());
        flightSegmentWSResponse.setArrivalAirportCode(flightSegment.getArrivalAirport().getLocationCode());
        flightSegmentWSResponse.setDepartureDateTime(flightSegment.getDepartureDateTime());
        flightSegmentWSResponse.setArrivalDateTime(flightSegment.getArrivalDateTime());
        flightSegmentWSResponse.setCabin(flightSegment.getTPAExtensions().getCabinType().getCabin().value());
        flightSegmentWSResponse.setDuration(flightSegment.getTPAExtensions().getJourneyTotalDuration());
        flightSegmentWSResponse.setMarketingAirline(flightSegment.getMarketingAirline().getValue());
        flightSegmentWSResponse.setMarketingAirlineCode(flightSegment.getMarketingAirline().getCode());
        flightSegmentWSResponse.setRPH(flightSegment.getRPH());
        flightSegmentWSResponse.setResBookDesigCode(flightSegment.getResBookDesigCode());
        flightSegmentWSResponse.setMarriageGrp(flightSegment.getMarriageGrp());
        flightSegmentWSResponse.setAirEquipType(flightSegment.getEquipment().get(0).getAirEquipType());
        flightSegmentWSResponse.setNumberInParty(flightSegment.getNumberInParty());

        if (flightSegment.getETicketEligibility().value().equals("Eligible")) {
            flightSegmentWSResponse.setETicketEligible(Boolean.TRUE);
        }

        flightSegmentWSResponse.setStopQuantity(flightSegment.getStopQuantity());

        return flightSegmentWSResponse;
    }

}
