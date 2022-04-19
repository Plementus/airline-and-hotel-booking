package services.amadeus.lowfarematrix;


import core.gdsbookingengine.clients.amadeus.BasePOSBuilder;

public class POSBuilder extends BasePOSBuilder {
  public static POS createInstance() {
    POS pos = new POS();
    pos.setSource(createSource(PCC, createRequestorID(USERNAME, REQUESTOR_TYPE)));
    pos.setTPAExtensions( createTPAExtensions(createProvider(createName(NAME, PCC), SYSTEM, USERNAME, PASSWORD)));

    return pos;
  }

  private static Name createName(String value, String pseudoCityCode) {
    Name name = new Name();
    name.setValue(value);
    name.setPseudoCityCode(pseudoCityCode);
    return name;
  }
  private static Provider createProvider(Name name, String system, String userId, String password) {
    Provider provider = new Provider();
    provider.getName().add(name);
    provider.setSystem(system);
    provider.setUserid(userId);
    provider.setPassword(password);
    return provider;
  }

  private static TPAExtensions createTPAExtensions(Provider provider) {
    TPAExtensions tpaExtensions = new TPAExtensions();
    tpaExtensions.setProvider(provider);
    return tpaExtensions;
  }

  private static RequestorID createRequestorID(String id, String type) {
    RequestorID requestorID = new RequestorID();
    requestorID.setID(id);
    requestorID.setType(type);
    return requestorID;
  }

  private static Source createSource(String pseudoCityCode, RequestorID requestorID) {
    Source source = new Source();
    source.setPseudoCityCode(pseudoCityCode);
    source.setRequestorID(requestorID);
    source.setISOCountry("NGN");
    return source;
  }
}
