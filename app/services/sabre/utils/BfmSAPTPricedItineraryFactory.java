/**
 * Created by Ibrahim Olanrewaju on 4/8/2016.
 */

package services.sabre.utils;

import core.gdsbookingengine.*;
import core.gdsbookingengine.TicketType;
import models.Airlines;
import models.GdsNames;
import services.sabre.bfm.sapt.*;
//import utils.PricedItineraryFactory;

import java.time.Duration;
import java.time.LocalDateTime;

public class BfmSAPTPricedItineraryFactory implements PricedItineraryFactory {

    @Override
    public PricedItineraryWSResponse createPricedItineraryWSResponse(PricedItineraryWrapper pricedItinerary) {
        PricedItineraryType pricedItineraryType = (PricedItineraryType) pricedItinerary;
        PricedItineraryWSResponse pricedItineraryWSResponseInterface = new PricedItineraryWSResponse();

        pricedItineraryWSResponseInterface.setAirItineraryWSResponse(createAirItineraryWSResponse(pricedItineraryType.getAirItinerary()));
        pricedItineraryWSResponseInterface.setPricingInfoWSResponse(createPricingInfoWSResponse(pricedItineraryType.getAirItineraryPricingInfo().get(0)));
        pricedItineraryWSResponseInterface.setTicketingInfoWSResponse(createTicketingInfoWSResponse(pricedItineraryType.getAirItinerary()
                .getOriginDestinationOptions().getOriginDestinationOption().get(0).getFlightSegment().get(0)));

        String airlineCode = pricedItineraryWSResponseInterface.getAirItineraryWSResponse().getOriginDestinationWSResponses().get(0).getMarketingAirlineCode();
        String airline = pricedItineraryWSResponseInterface.getAirItineraryWSResponse().getOriginDestinationWSResponses().get(0).getMarketingAirline();
        pricedItineraryWSResponseInterface.setAirlineCode(airlineCode);
        pricedItineraryWSResponseInterface.setAirline(airline);
        pricedItineraryWSResponseInterface.setGDS(GdsNames.SABRE);
        return pricedItineraryWSResponseInterface;
    }


    private PricingInfoWSResponse createPricingInfoWSResponse(AirItineraryPricingInfoType airItineraryPricingInfo) {
        PricingInfoWSResponse pricingInfoWSResponse = new PricingInfoWSResponse();

        pricingInfoWSResponse.setPricingSource(airItineraryPricingInfo.getPricingSource());
        pricingInfoWSResponse.setBaseFare(airItineraryPricingInfo.getItinTotalFare().getEquivFare().getAmount().doubleValue());
        pricingInfoWSResponse.setTotalTax(airItineraryPricingInfo.getItinTotalFare().getTaxes().getTax().stream()
                .mapToDouble(tax -> tax.getAmount().doubleValue()).sum());
        pricingInfoWSResponse.setTotalFare(airItineraryPricingInfo.getItinTotalFare().getTotalFare().getAmount().doubleValue());
        pricingInfoWSResponse.setCurrencyCode(airItineraryPricingInfo.getItinTotalFare().getTotalFare().getCurrencyCode());

        return pricingInfoWSResponse;
    }

    private TicketingInfoWSResponse createTicketingInfoWSResponse(BookFlightSegmentType flightSegment) {
        TicketingInfoWSResponse ticketingInfoWSResponse = new TicketingInfoWSResponse();
        if (flightSegment.getTPAExtensions().getETicket().isInd()) {
            ticketingInfoWSResponse.setTicketType(TicketType.E_TICKET);
        }
        String flightDateTime = flightSegment.getDepartureDateTime();
        LocalDateTime dateTime = LocalDateTime.parse(flightDateTime);
        ticketingInfoWSResponse.setTicketTimeLimit(dateTime.minusDays(1));
        return ticketingInfoWSResponse;
    }

    private AirItineraryWSResponse createAirItineraryWSResponse(AirItineraryType airItinerary) {
        AirItineraryWSResponse airItineraryWSResponse = new AirItineraryWSResponse();
        airItineraryWSResponse.setDirectionIndicator(airItinerary.getDirectionInd().value());
        airItinerary.getOriginDestinationOptions().getOriginDestinationOption().stream()
                .map(this::createOriginDestinationWSResponse)
                .forEach(airItineraryWSResponse.getOriginDestinationWSResponses()::add);
        return airItineraryWSResponse;
    }

    private OriginDestinationWSResponse createOriginDestinationWSResponse(OriginDestinationOptionType originDestinationOption) {
        OriginDestinationWSResponse originDestinationWSResponse = new OriginDestinationWSResponse();

        originDestinationOption.getFlightSegment().stream().map(this::createFlightSegmentWSResponse)
                .forEach(originDestinationWSResponse.getFlightSegmentWSResponses()::add);

        return originDestinationWSResponse;
    }

    private FlightSegmentWSResponse createFlightSegmentWSResponse(BookFlightSegmentType flightSegment) {
        FlightSegmentWSResponse flightSegmentWSResponse = new FlightSegmentWSResponse();
        flightSegmentWSResponse.setFlightNumber(flightSegment.getFlightNumber());
        flightSegmentWSResponse.setDepartureAirport(flightSegment.getDepartureAirport().getValue());
        flightSegmentWSResponse.setArrivalAirport(flightSegment.getArrivalAirport().getValue());
        flightSegmentWSResponse.setDepartureAirportCode(flightSegment.getDepartureAirport().getLocationCode());
        flightSegmentWSResponse.setArrivalAirportCode(flightSegment.getArrivalAirport().getLocationCode());
        flightSegmentWSResponse.setDepartureDateTime(flightSegment.getDepartureDateTime());
        flightSegmentWSResponse.setArrivalDateTime(flightSegment.getArrivalDateTime());
        flightSegmentWSResponse.setDepartureTimeZone(flightSegment.getDepartureTimeZone().getGMTOffset().toString());
        flightSegmentWSResponse.setArrivalTimeZone(flightSegment.getArrivalTimeZone().getGMTOffset().toString());
        flightSegmentWSResponse.setDuration(Duration.ofMinutes(flightSegment.getElapsedTime()).toString());
        flightSegmentWSResponse.setMarketingAirline(flightSegment.getMarketingAirline().getValue());
        flightSegmentWSResponse.setMarketingAirlineCode(flightSegment.getMarketingAirline().getCode());

        // flightSegmentWSResponse.setCabin(flightSegment.getTPAExtensions().getContent().get(0).toString());

        flightSegmentWSResponse.setRPH(flightSegment.getRPH());
        flightSegmentWSResponse.setResBookDesigCode(flightSegment.getResBookDesigCode());

        if (flightSegment.getNumberInParty() != null) {
            flightSegmentWSResponse.setNumberInParty(flightSegment.getNumberInParty().intValue());
        }

        flightSegmentWSResponse.setETicketEligible(flightSegment.getTPAExtensions().getETicket().isInd());
        flightSegmentWSResponse.setStopQuantity(flightSegment.getStopQuantity().intValue());

        return flightSegmentWSResponse;
    }
}
