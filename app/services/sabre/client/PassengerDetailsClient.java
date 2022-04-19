/**
 * Created by Ibrahim Olanrewaju on 3/17/2016.
 */
package services.sabre.client;

import core.gdsbookingengine.booking.BookingRequest;
import core.gdsbookingengine.booking.Passenger;
import services.sabre.passengerdetails.*;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class PassengerDetailsClient extends SabreClient {

  public static PassengerDetailsRS getPassengerDetailsRS(BookingRequest request, String binarySecurityToken) {
    PassengerDetailsPortType port = getConfiguredPort();
    Security security = createSecurity(binarySecurityToken);
    MessageHeader header = createMessageHeader();

    PassengerDetailsRQ requestBody = getRequestBody(request);
    Holder<MessageHeader> messageHeaderHolder = new Holder<>(header);
    Holder<Security> securityHolder = new Holder<>(security);

    return port.passengerDetailsRQ(messageHeaderHolder, securityHolder, requestBody);
  }

  private static PassengerDetailsRQ getRequestBody(BookingRequest bookingRequest) {
    PassengerDetailsRQ request = new PassengerDetailsRQ();
    request.setHaltOnError(false);
    request.setIgnoreOnError(false);
    request.setVersion(config.getString("sabre.passengerDetails.version"));

    request.setPostProcessing(getPostProcessing());
    request.setPriceQuoteInfo(getPriceQuoteInfo());
    request.setSpecialReqDetails(getSpecialReqDetails(bookingRequest.getPassengers().get(0)));
    request.setTravelItineraryAddInfoRQ(getTravelItineraryAddInfoRQ(bookingRequest.getPassengers()));

    return request;
  }

  private static PassengerDetailsPortType getConfiguredPort() {
    PassengerDetailsService service = new PassengerDetailsService();
    PassengerDetailsPortType port = service.getPassengerDetailsPortType();

    setEndpointFromConfiguration(port);

    return port;
  }

  private static void setEndpointFromConfiguration(PassengerDetailsPortType port) {
    BindingProvider bindingProvider = (BindingProvider) port;
    bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, ENDPOINT_URL);
  }

  private static PassengerDetailsRQ.MiscSegmentSellRQ getMiscSegmentSellRQ() {

    PassengerDetailsRQ.MiscSegmentSellRQ miscSegmentSellRQ = new PassengerDetailsRQ.MiscSegmentSellRQ();
    PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment miscSegment = new PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment();
    miscSegment.setText("RETENTION SEGMENT");
    miscSegment.setType("OTH");
    miscSegment.setDepartureDateTime("04-29");
    miscSegment.setNumberInParty(new BigInteger("1"));
    miscSegment.setStatus("GK");
    PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.OriginLocation originLocation = new PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.OriginLocation();
    PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs vendorPrefs = new PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs();
    PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs.Airline airline = new PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs.Airline();

    originLocation.setLocationCode("DFW");
    airline.setCode("LH");
    vendorPrefs.setAirline(airline);

    miscSegment.setOriginLocation(originLocation);
    miscSegment.setVendorPrefs(vendorPrefs);
    miscSegmentSellRQ.setMiscSegment(miscSegment);

    return miscSegmentSellRQ;
  }

  private static PassengerDetailsRQ.PostProcessing getPostProcessing() {

    PassengerDetailsRQ.PostProcessing postProcessing = new PassengerDetailsRQ.PostProcessing();
    postProcessing.setRedisplayReservation(Boolean.TRUE);
    postProcessing.setIgnoreAfter(Boolean.FALSE);
    postProcessing.setUnmaskCreditCard(Boolean.TRUE);
    PassengerDetailsRQ.PostProcessing.EndTransactionRQ endTransactionRQ = new PassengerDetailsRQ.PostProcessing.EndTransactionRQ();
    PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction endTransaction = new PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction();
    PassengerDetailsRQ.PostProcessing.EndTransactionRQ.Source source = new PassengerDetailsRQ.PostProcessing.EndTransactionRQ.Source();

    source.setReceivedFrom(AGENCY_NAME);
    endTransaction.setInd("true");
    endTransactionRQ.setSource(source);
    endTransactionRQ.setEndTransaction(endTransaction);

    postProcessing.setEndTransactionRQ(endTransactionRQ);

    return postProcessing;
  }

  private static PassengerDetailsRQ.PriceQuoteInfo getPriceQuoteInfo() {
    PassengerDetailsRQ.PriceQuoteInfo priceQuoteInfo = new PassengerDetailsRQ.PriceQuoteInfo();
    PassengerDetailsRQ.PriceQuoteInfo.Link link = new PassengerDetailsRQ.PriceQuoteInfo.Link();

    link.setNameNumber("1.1");
    link.setRecord("1");
    priceQuoteInfo.getLink().add(link);

    return priceQuoteInfo;
  }

  private static PassengerDetailsRQ.SpecialReqDetails getSpecialReqDetails(Passenger passenger) {

    PassengerDetailsRQ.SpecialReqDetails specialReqDetails = new PassengerDetailsRQ.SpecialReqDetails();

    specialReqDetails.setAddRemarkRQ(getAddRemarkRQ());

    PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ specialServiceRQ = new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ();
    PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo specialServiceInfo = new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo();
    PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight secureFlight = new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight();

    secureFlight.setSegmentNumber("A");

    PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.PersonName personName = new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.PersonName();
    personName.setGivenName(passenger.getGivenName());
    personName.setSurname(passenger.getSurname());
    personName.setDateOfBirth(passenger.getBirthDate().toLocalDate().toString());
    personName.setGender(passenger.getGender().value());
    PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.VendorPrefs vendorPrefs1 = new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.VendorPrefs();
    PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.VendorPrefs.Airline airline1 = new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.VendorPrefs.Airline();
    airline1.setHosted(Boolean.FALSE);
    vendorPrefs1.setAirline(airline1);
    secureFlight.setPersonName(personName);
    secureFlight.setVendorPrefs(vendorPrefs1);
    specialServiceInfo.getSecureFlight().add(secureFlight);
    specialServiceRQ.setSpecialServiceInfo(specialServiceInfo);

    specialReqDetails.setSpecialServiceRQ(specialServiceRQ);

    return specialReqDetails;
  }

  private static PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ getAddRemarkRQ() {

    PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ addRemarkRQ = new PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ();

    PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo remarkInfo = new PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo();
    PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark fopRemark = new PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark();

    PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.Remark[] remarks = new PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.Remark[12];

    String[] texts = {"TEST ALPHA CODE REMARK",
        "TEST CLIENT ADDRESS REMARK", "CORP1212", "TEST GENERAL REMARK 1",
        "TEST GENERAL REMARK 2", "TEST GENERAL REMARK 3",
        "TEST DELIVERY ADDRESS REMARK", "TEST GROUP NAME REMARK",
        "TEST HIDDEN REMARK", "TEST HISTORICAL REMARK",
        "TEST ITIN REMARK", "TEST INVOICE REMARK",};

    String[] types = {"Alpha-Coded", "Client Address", "Corporate", "General", "General", "General", "Delivery Address", "Group Name", "Hidden", "Historical", "Itinerary", "Invoice"};

    for (int i = 0; i < 12; ++i) {
      remarks[i] = new PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.Remark();
      remarks[i].setText(texts[i]);
      remarks[i].setType(types[i]);
    }

    remarks[0].setCode("H");
    remarks[10].setSegmentNumber("1");
    remarks[11].setSegmentNumber("1");

    fopRemark.setType(config.getString("sabre.passengerDetails.fopRemarkType"));
    remarkInfo.getRemark().addAll(Arrays.asList(remarks));
    remarkInfo.setFOPRemark(fopRemark);
    addRemarkRQ.setRemarkInfo(remarkInfo);

    return addRemarkRQ;
  }

  private static PassengerDetailsRQ.TravelItineraryAddInfoRQ getTravelItineraryAddInfoRQ(List<Passenger> passengers) {

    PassengerDetailsRQ.TravelItineraryAddInfoRQ travelItineraryAddInfoRQ = new PassengerDetailsRQ.TravelItineraryAddInfoRQ();

    PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Ticketing ticketing = new PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Ticketing();
    ticketing.setTicketType(config.getString("sabre.passengerDetails.ticketTimeLimit"));
    ticketing.setPseudoCityCode(SABRE_PCC);

    travelItineraryAddInfoRQ.setAgencyInfo(getAgencyInfo(ticketing));
    travelItineraryAddInfoRQ.setCustomerInfo(getCustomerInfo(passengers));

    return travelItineraryAddInfoRQ;
  }

  private static PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo getAgencyInfo(PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Ticketing ticketing) {
    PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo agencyInfo = new PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo();
    agencyInfo.setTicketing(ticketing);
    PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address  address = new PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address();
    PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.StateCountyProv stateCountyProv = new PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.StateCountyProv();
    PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs vendorPrefs = new PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs();
    PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs.Airline airline = new PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs.Airline();

    airline.setHosted(Boolean.TRUE);
    vendorPrefs.setAirline(airline);
    stateCountyProv.setStateCode(config.getString("sabre.agency.stateCode"));

    address.setAddressLine(config.getString("sabre.agency.addressLine"));
    address.setCityName(config.getString("sabre.agency.city"));
    address.setCountryCode(config.getString("sabre.agency.countryCode"));
    address.setPostalCode(config.getString("sabre.agency.postalCode"));
    address.setStateCountyProv(stateCountyProv);
    address.setStreetNmbr(config.getString("sabre.agency.streetNumber"));
    address.setVendorPrefs(vendorPrefs);

    agencyInfo.setAddress(address);
    return agencyInfo;
  }

  private static PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo getCustomerInfo(List<Passenger> passengers) {
    PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo customerInfo = new PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo();

    customerInfo.setContactNumbers(getContactNumbers(passengers));

    passengers.forEach(passenger ->
      passenger.getEmails().forEach(index -> {
        PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.Email email = new PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.Email();
        email.setAddress(index);
        email.setNameNumber("1.1");

        customerInfo.getEmail().add(email);
      })
    );

    passengers.forEach(passenger -> {
      PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName personName = new PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName();
      personName.setNameNumber("1.1");
      personName.setGivenName(passenger.getGivenName());
      personName.setSurname(passenger.getSurname());
      personName.setInfant(Boolean.FALSE);

      customerInfo.getPersonName().add(personName);
    });

    return customerInfo;
  }

  private static PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers getContactNumbers(List<Passenger> passengers) {

    PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers contactNumbers = new PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers();

    passengers.forEach(passenger ->
      passenger.getTelephones().forEach(telephone -> {
        PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers.ContactNumber contactNumber = new PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers.ContactNumber();
        contactNumber.setLocationCode(telephone.getLocationCode());
        contactNumber.setNameNumber("1.1");
        contactNumber.setPhone(telephone.getPhoneNumber());
        contactNumber.setPhoneUseType(telephone.getPhoneUseType().value());

        contactNumbers.getContactNumber().add(contactNumber);
      })
    );


    return contactNumbers;
  }

  private static MessageHeader createMessageHeader() {
    MessageHeader messageHeader = new MessageHeader();
    From from = new From();
    PartyId fromPartyId = new PartyId();
    fromPartyId.setType(PARTY_ID_TYPE);
    fromPartyId.setValue(PARTY_ID_FROM);
    from.getPartyId().add(fromPartyId);
    To to = new To();
    PartyId toPartyId = new PartyId();
    toPartyId.setType(PARTY_ID_TYPE);
    toPartyId.setValue(PARTY_ID_TO);
    to.getPartyId().add(toPartyId);
    Service service = new Service();
    service.setType(SERVICE_TYPE);
    service.setValue(config.getString("sabre.passengerDetails.service"));

    MessageData messageData = new MessageData();
    messageData.setMessageId(getMessageId());
    messageData.setTimestamp(getMessageTimeStamp());

    messageHeader.setConversationId(CONVERSATION_ID);
    messageHeader.setFrom(from);
    messageHeader.setTo(to);
    messageHeader.setCPAId(SABRE_PCC);
    messageHeader.setService(service);
    messageHeader.setMessageData(messageData);
    messageHeader.setAction(config.getString("sabre.passengerDetails.action"));

    return messageHeader;
  }

  private static Security createSecurity(String binarySecurityToken) {
    Security security = new Security();
    Security.UsernameToken usernameToken = new Security.UsernameToken();
    usernameToken.setUsername(USERNAME);
    usernameToken.setPassword(PASSWORD);
    usernameToken.setOrganization(SABRE_PCC);
    usernameToken.setDomain(DOMAIN);

    security.setUsernameToken(usernameToken);
    security.setBinarySecurityToken(binarySecurityToken);
    return security;
  }
}