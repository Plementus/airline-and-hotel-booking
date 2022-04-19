/**
 * Created by Ibrahim Olanrewaju on 4/1/2016.
 */

package services.sabre.utils;

import core.gdsbookingengine.*;
import core.gdsbookingengine.TicketType;
import core.gdsbookingengine.clients.FlightCacheClient;
import models.Airlines;
import models.GdsNames;
import play.Logger;
import play.libs.Json;
import services.amadeus.lowfareplus.PricedItinerary;
import services.sabre.bfm.*;
//import services.utils.PricedItineraryFactory;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class BfmPricedItineraryFactory implements PricedItineraryFactory {

    private PricedItineraryType pricedItineraryType;
    private PricedItineraryWSResponse pricedItineraryWSResponse;

    @Override
    public PricedItineraryWSResponse createPricedItineraryWSResponse(PricedItineraryWrapper pricedItinerary) {
        this.pricedItineraryType = (PricedItineraryType) pricedItinerary;
        pricedItineraryWSResponse = new PricedItineraryWSResponse();

        pricedItineraryWSResponse.setAirItineraryWSResponse(createAirItineraryWSResponse(pricedItineraryType.getAirItinerary()));
        pricedItineraryWSResponse.setTicketingInfoWSResponse(createTicketingInfoWSResponse(pricedItineraryType.getAirItinerary().getOriginDestinationOptions().getOriginDestinationOption().get(0).getFlightSegment().get(0)));
        pricedItineraryWSResponse.setAirline(pricedItineraryWSResponse.getAirItineraryWSResponse().getOriginDestinationWSResponses().get(0).getMarketingAirline());
        pricedItineraryWSResponse.setAirlineCode(pricedItineraryWSResponse.getAirItineraryWSResponse().getOriginDestinationWSResponses().get(0).getMarketingAirlineCode());
        pricedItineraryWSResponse.setGDS(GdsNames.SABRE);
        pricedItineraryWSResponse.setPricingInfoWSResponse(createPricingInfoWSResponse(pricedItineraryType.getAirItineraryPricingInfo().get(0)));
        return pricedItineraryWSResponse;
    }

    private PricingInfoWSResponse createPricingInfoWSResponse(AirItineraryPricingInfoType airItineraryPricingInfo) {
        PricingInfoWSResponse pricingInfoWSResponse = new PricingInfoWSResponse();
        pricingInfoWSResponse.setPricingSource(airItineraryPricingInfo.getPricingSource());
        //set the fair for the GDS
        pricingInfoWSResponse.setGdsBaseFare(airItineraryPricingInfo.getItinTotalFare().getEquivFare().getAmount().doubleValue());
        pricingInfoWSResponse.setGdsTax(airItineraryPricingInfo.getItinTotalFare().getTaxes().getTax().stream().mapToDouble(tax -> tax.getAmount().doubleValue()).sum());
        pricingInfoWSResponse.setGdsTotalFare(airItineraryPricingInfo.getItinTotalFare().getTotalFare().getAmount().doubleValue());

        pricingInfoWSResponse.setCurrencyCode(airItineraryPricingInfo.getItinTotalFare().getTotalFare().getCurrencyCode());
        airItineraryPricingInfo.getPTCFareBreakdowns().getPTCFareBreakdown().stream().forEach(ptcFareBreakdownType -> pricingInfoWSResponse.getFareBreakDowns().add(createFareBreakDown(ptcFareBreakdownType)));
        this.pricedItineraryWSResponse.setSearchRequest(new FlightCacheClient().getFlightRequest());
        pricingInfoWSResponse.setMarkPricingDirection(this.pricedItineraryWSResponse);
//        double childBase = 0;
//        double childTax = 0;
//        double infantBase = 0;
//        double infantTax = 0;
//        double adultBase = 0;
//        double adultTax = 0;
//        //set the price break down for all.
//        for (FareBreakDown fareBreakDown : pricingInfoWSResponse.getFareBreakDowns()) {
//            //fare breakdown for adult.
//            int numberOfAdult = 1;
//            if (fareBreakDown.getPassengerType().getCode().equals(PassengerCode.ADULT)) {
//                numberOfAdult = fareBreakDown.getPassengerType().getQuantity();
//            }
//            if (fareBreakDown.getPassengerType().getCode().equals(PassengerCode.SABRE_CHILD)) {
//                childBase = fareBreakDown.getPassengerFare().getBaseFare() / numberOfAdult * play.Configuration.root().getInt("project.airline.defaultChildBaseFairPercentage") / 100 * fareBreakDown.getPassengerType().getQuantity();
//                childTax = fareBreakDown.getPassengerFare().getTotalTax() / numberOfAdult * play.Configuration.root().getInt("project.airline.defaultChildTaxFairPercentage") / 100 * fareBreakDown.getPassengerType().getQuantity();
//                pricingInfoWSResponse.setChildrenBaseFair(childBase);
//                pricingInfoWSResponse.setChildrenTaxFair(childTax);
//                pricingInfoWSResponse.setChildrenTotal(childBase + childTax);
//            }
//            if (fareBreakDown.getPassengerType().getCode().equals(PassengerCode.INFANT)) {
//                infantBase = fareBreakDown.getPassengerFare().getBaseFare() / numberOfAdult * play.Configuration.root().getInt("project.airline.defaultInfantBaseFairPercentage") / 100 * fareBreakDown.getPassengerType().getQuantity();
//                infantTax = fareBreakDown.getPassengerFare().getTotalTax() / numberOfAdult * play.Configuration.root().getInt("project.airline.defaultInfantTaxFairPercentage") / 100 * fareBreakDown.getPassengerType().getQuantity();
//                pricingInfoWSResponse.setInfantBaseFair(infantBase);
//                pricingInfoWSResponse.setInfantTaxFair(infantTax);
//                pricingInfoWSResponse.setInfantTotal(infantBase + infantTax);
//            }
//            if (fareBreakDown.getPassengerType().getCode().equals(PassengerCode.ADULT)) {
//                adultTax = fareBreakDown.getPassengerFare().getTotalTax() - (childTax + infantTax);
//                adultBase = fareBreakDown.getPassengerFare().getBaseFare() - (childBase + infantBase);
//                pricingInfoWSResponse.setAdultBaseFair(adultBase);
//                pricingInfoWSResponse.setAdultTaxFair(adultTax);
//                pricingInfoWSResponse.setAdultTotal(adultBase + adultTax);
//            }
//        }
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
        boolean[] isMultiAirline = {false};
        String[] lastAirlineCode = {""};
        originDestinationOption.getFlightSegment().stream().map(this::createFlightSegmentWSResponse).forEach(flightSegmentWSResponse -> {
            if (flightSegmentWSResponse.getMarketingAirlineCode().equalsIgnoreCase(lastAirlineCode[0])) {
                isMultiAirline[0] = true;
            } else {
                isMultiAirline[0] = false;
            }
            lastAirlineCode[0] = flightSegmentWSResponse.getMarketingAirlineCode();
            originDestinationWSResponse.getFlightSegmentWSResponses().add(flightSegmentWSResponse);
        });
        originDestinationWSResponse.setMultiAirline(isMultiAirline[0]);
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
        flightSegmentWSResponse.setMarriageGrp(flightSegment.getMarriageGrp());
        flightSegmentWSResponse.setAirEquipType(flightSegment.getEquipment().get(0).getAirEquipType());
        flightSegmentWSResponse.setDuration(Duration.ofMinutes(flightSegment.getElapsedTime()).toString().substring(2));
        flightSegmentWSResponse.setMarketingAirline(flightSegment.getMarketingAirline().getValue());
        flightSegmentWSResponse.setMarketingAirlineCode(flightSegment.getMarketingAirline().getCode());

        // flightSegmentWSResponse.setCabin(flightSegment.getTPAExtensions().getContent().get(0).toString());

        flightSegmentWSResponse.setRPH(flightSegment.getRPH());
        flightSegmentWSResponse.setResBookDesigCode(flightSegment.getResBookDesigCode());
        flightSegmentWSResponse.setAirEquipType(flightSegment.getEquipment().get(0).getAirEquipType());

        if (flightSegment.getNumberInParty() != null) {
            flightSegmentWSResponse.setNumberInParty(flightSegment.getNumberInParty().intValue());
        } else {
            flightSegmentWSResponse.setNumberInParty(0);
        }

        flightSegmentWSResponse.setETicketEligible(flightSegment.getTPAExtensions().getETicket().isInd());
        flightSegmentWSResponse.setStopQuantity(flightSegment.getStopQuantity().intValue());

        return flightSegmentWSResponse;
    }

    private FareBreakDown createFareBreakDown(PTCFareBreakdownType ptcFareBreakdownType) {
        FareBreakDown fareBreakDown = new FareBreakDown();
        PassengerCode passengerCode = PassengerCode.fromValue(ptcFareBreakdownType.getPassengerTypeQuantity().getCode());
        Integer passengerQuantity = ptcFareBreakdownType.getPassengerTypeQuantity().getQuantity();
        PassengerType passengerType = new PassengerType(passengerCode, passengerQuantity);

        fareBreakDown.setPassengerFare(createPassengerFare(ptcFareBreakdownType.getPassengerFare()));
        fareBreakDown.setPassengerType(passengerType);

        return fareBreakDown;
    }

    private PassengerFare createPassengerFare(FareType fareType) {
        PassengerFare passengerFare = new PassengerFare();
        passengerFare.setBaseFare(fareType.getEquivFare().getAmount().doubleValue());
        passengerFare.setTotalTax(fareType.getTaxes().getTotalTax().getAmount().doubleValue());
        passengerFare.setTotalFare(fareType.getTotalFare().getAmount().doubleValue());
        return passengerFare;
    }
}
