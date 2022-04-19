/**
 * Created by Ibrahim Olanrewaju on 3/11/2016.
 */

package services.sabre.client;

import core.gdsbookingengine.*;
import core.gdsbookingengine.PassengerType;
import core.gdsbookingengine.booking.BookingRequest;
import services.sabre.enhancedairbook.*;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public  class EnhancedAirBookClient extends SabreClient {

//  public static EnhancedAirBookRS getEnhancedAirBookRS(BookingRequest request, String binarySecurityToken) {
//
//    Security security = createSecurity(binarySecurityToken);
//    MessageHeader header = createMessageHeader();
//    EnhancedAirBookRQ requestBody = getRequestBody(request.getFlightSegmentWSResponses(), request.getPassengerTypes(), request.getPassengers().size());
//
//    EnhancedAirBookPortType port = getConfiguredPort();
//
//    return port.enhancedAirBookRQ( new Holder<>(header), new Holder<>(security), requestBody );
//  }
//
//  public static EnhancedAirBookRS getEnhancedAirBookRS(FlightAvailabilityRequest request, String binarySecurityToken) {
//
//    Security security = createSecurity(binarySecurityToken);
//    MessageHeader header = createMessageHeader();
//    EnhancedAirBookRQ requestBody = getRequestBody(request.getFlightSegmentWSResponses(), request.getPassengerTypes(), request.getNumberInParty());
//
//    EnhancedAirBookPortType port = getConfiguredPort();
//
//    return port.enhancedAirBookRQ( new Holder<>(header), new Holder<>(security), requestBody );
//  }
//
//  private static EnhancedAirBookPortType getConfiguredPort() {
//
//    EnhancedAirBookService service = new EnhancedAirBookService();
//    EnhancedAirBookPortType port = service.getEnhancedAirBookPortType();
//    setEndpointFromConfiguration(port);
//    return port;
//  }
//
//  private static EnhancedAirBookRQ getRequestBody(List<FlightSegmentWSResponse> flightSegmentWSResponses, List<PassengerType> passengerTypes, Integer numberInParty) {
//
//    EnhancedAirBookRQ requestBody = new EnhancedAirBookRQ();
//    requestBody.setHaltOnError(true);
//    requestBody.setVersion(config.getString("sabre.enhancedAirBook.version"));
//
//    requestBody.setOTAAirBookRQ(getOTAAirBookRQ(flightSegmentWSResponses, numberInParty));
//    requestBody.setOTAAirPriceRQ(getOTAAirPriceRQ(passengerTypes));
//    requestBody.setPostProcessing(getPostProcessing());
//    requestBody.setPreProcessing(getPreProcessing());
//
//    return requestBody;
//  }
//
//  private static EnhancedAirBookRQ.OTAAirBookRQ getOTAAirBookRQ(List<FlightSegmentWSResponse> flightSegmentWSResponses, Integer numberInParty) {
//
//    EnhancedAirBookRQ.OTAAirBookRQ airBookRQ = new EnhancedAirBookRQ.OTAAirBookRQ();
//    EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation originDestinationInformation = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation();
//    flightSegmentWSResponses.stream().forEach(flightSegmentWSResponse -> originDestinationInformation.getFlightSegment().add(getFlightSegment(flightSegmentWSResponse, numberInParty)));
//
//    airBookRQ.setOriginDestinationInformation(originDestinationInformation);
//
//    return airBookRQ;
//  }
//
//  private static EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment getFlightSegment(FlightSegmentWSResponse flight, Integer numberInParty) {
//
//    EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment flightSegment = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment();
//
//    EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.DestinationLocation destinationLocation = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.DestinationLocation();
//    EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.Equipment equipment = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.Equipment();
//    EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.MarketingAirline marketingAirline = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.MarketingAirline();
//    EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.OperatingAirline operatingAirline = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.OperatingAirline();
//    EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.OriginLocation originLocation = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.OriginLocation();
//    EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.MarriageGrp marriageGrp = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.MarriageGrp();
//
//    String flightNumber = flight.getFlightNumber();
//    destinationLocation.setLocationCode(flight.getArrivalAirportCode());
//    marketingAirline.setCode(flight.getMarketingAirlineCode());
//    marketingAirline.setFlightNumber(flightNumber);
//    operatingAirline.setCode(flight.getMarketingAirlineCode());
//    originLocation.setLocationCode(flight.getDepartureAirportCode());
//    equipment.setAirEquipType(flight.getAirEquipType());
//    marriageGrp.setInd(getMarriageGrpInd(flight.getMarriageGrp()));
//
//    flightSegment.setDestinationLocation(destinationLocation);
//    flightSegment.setEquipment(equipment);
//    flightSegment.setOperatingAirline(operatingAirline);
//    flightSegment.setMarketingAirline(marketingAirline);
//    flightSegment.setOriginLocation(originLocation);
//
//    flightSegment.setFlightNumber(flightNumber);
//    flightSegment.setDepartureDateTime(flight.getDepartureDateTime());
//    flightSegment.setArrivalDateTime(flight.getArrivalDateTime());
//    flightSegment.setNumberInParty(numberInParty.toString());
//    flightSegment.setStatus("NN");
//    flightSegment.setResBookDesigCode(flight.getResBookDesigCode());
//    flightSegment.setMarriageGrp(marriageGrp);
//
//    return flightSegment;
//  }
//
//  private static Boolean getMarriageGrpInd(String marriageGrp) {
//    if(marriageGrp.equals("I")) {
//      return true;
//    }
//    return false;
//  }
//
//  private static EnhancedAirBookRQ.OTAAirPriceRQ getOTAAirPriceRQ(List<core.gdsbookingengine.PassengerType> passengerTypes) {
//
//    EnhancedAirBookRQ.OTAAirPriceRQ airPriceRQ = new EnhancedAirBookRQ.OTAAirPriceRQ();
//
//    EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation priceRequestInformation = new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation();
//    priceRequestInformation.setRetain(true);
//
//    EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers optionalQualifiers = new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers();
//    EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers pricingQualifiers = new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers();
//    EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.BargainFinder bargainFinder = new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.BargainFinder();
//
//    passengerTypes.forEach(passenger -> {
//      EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType passengerType =
//              new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType();
//
//      passengerType.setCode(passenger.getCode().value());
//      passengerType.setQuantity(passenger.getQuantity().toString());
//
//      pricingQualifiers.getPassengerType().add(passengerType);
//    });
//
//    bargainFinder.setRebook(Boolean.TRUE);
//
//    pricingQualifiers.setCurrencyCode(CURRENCY);
//    pricingQualifiers.setAlternateCurrencyCode("USD");
//    pricingQualifiers.setBargainFinder(bargainFinder);
//
//    optionalQualifiers.setPricingQualifiers(pricingQualifiers);
//    priceRequestInformation.setOptionalQualifiers(optionalQualifiers);
//    airPriceRQ.setPriceRequestInformation(priceRequestInformation);
//
//    return airPriceRQ;
//  }
//
//  private static EnhancedAirBookRQ.PostProcessing getPostProcessing() {
//    EnhancedAirBookRQ.PostProcessing postProcessing = new EnhancedAirBookRQ.PostProcessing();
//    EnhancedAirBookRQ.PostProcessing.RedisplayReservation redisplayReservation = new EnhancedAirBookRQ.PostProcessing.RedisplayReservation();
//
//    postProcessing.setRedisplayReservation(redisplayReservation);
//    postProcessing.setIgnoreAfter(Boolean.FALSE);
//    return postProcessing;
//  }
//
//  private static EnhancedAirBookRQ.PreProcessing getPreProcessing() {
//    EnhancedAirBookRQ.PreProcessing preProcessing = new EnhancedAirBookRQ.PreProcessing();
//    preProcessing.setIgnoreBefore(Boolean.FALSE);
//    return preProcessing;
//  }
//
//
//  private static void setEndpointFromConfiguration( EnhancedAirBookPortType port ) {
//    ((BindingProvider) port).getRequestContext()
//            .put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, ENDPOINT_URL);
//  }
//
//  private static MessageHeader createMessageHeader() {
//    MessageHeader messageHeader = new MessageHeader();
//    From from = new From();
//    PartyId fromPartyId = new PartyId();
//    fromPartyId.setType(PARTY_ID_TYPE);
//    fromPartyId.setValue(PARTY_ID_FROM);
//    from.getPartyId().add(fromPartyId);
//    To to = new To();
//    PartyId toPartyId = new PartyId();
//    toPartyId.setType(PARTY_ID_TYPE);
//    toPartyId.setValue(PARTY_ID_TO);
//    to.getPartyId().add(toPartyId);
//    Service service = new Service();
//    service.setType(SERVICE_TYPE);
//    service.setValue(config.getString("sabre.enhancedAirBook.service"));
//
//    MessageData messageData = new MessageData();
//    messageData.setMessageId(UUID.randomUUID().toString() + "@travelfix.co");
//    messageData.setTimestamp(LocalDateTime.now().toString() + "Z");
//
//    messageHeader.setConversationId(CONVERSATION_ID);
//    messageHeader.setFrom(from);
//    messageHeader.setTo(to);
//    messageHeader.setCPAId(SABRE_PCC);
//    messageHeader.setService(service);
//    messageHeader.setMessageData(messageData);
//    messageHeader.setAction(config.getString("sabre.enhancedAirBook.action"));
//
//    return  messageHeader;
//  }
//
//  private static Security createSecurity(String binarySecurityToken) {
//    Security security = new Security();
//    Security.UsernameToken usernameToken = new Security.UsernameToken();
//    usernameToken.setUsername(USERNAME);
//    usernameToken.setPassword(PASSWORD);
//    usernameToken.setOrganization(SABRE_PCC);
//    usernameToken.setDomain(DOMAIN);
//
//    security.setUsernameToken(usernameToken);
//    security.setBinarySecurityToken(binarySecurityToken);
//    return security;
//  }

}