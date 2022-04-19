package services.amadeus;

import play.Configuration;
import play.Logger;
import play.mvc.Http;
import services.amadeus.lowfareplus.*;

public final class POSBuilder {
    private static final Configuration amaduesConf = Configuration.root();
    private static final String pseudoCityCode = amaduesConf.getString("amadeus.api.pseudoCityCode"); //Amadues PseudoCityCode.
    private static final String systemMode = amaduesConf.getString("amadeus.api.system.mode");
    private static final String apiUserId = amaduesConf.getString("amadeus.api.provider.userID");
    private static final String apiPassword = amaduesConf.getString("amadeus.api.provider.password");
    private static final String requestorId = amaduesConf.getString("amadeus.api.requestor.id");
    private static final String requestorType = amaduesConf.getString("amadeus.api.requestor.type");

    public static POS createInstance() {
        POS pos = new POS();
        /**
         * Create Source and RequestorID Object
         */
        RequestorID requestorID = new RequestorID();
        requestorID.setID(requestorId);
        requestorID.setType(requestorType);
        Source source = new Source();
        source.setPseudoCityCode(pseudoCityCode);
        Http.Request request = Http.Context.current().request();
        if (request.cookie("user_currency") == null || request.cookie("user_currency").value().equalsIgnoreCase("ngn")) {
            source.setISOCountry(amaduesConf.getString("amadeus.api.currency.naira"));
        } else {
            source.setISOCountry(amaduesConf.getString("amadeus.api.currency.usd"));
        }

        source.setRequestorID(requestorID);
        Name name = createName("Amadeus", pseudoCityCode);
        Provider provider = createProvider(name, systemMode, apiUserId, apiPassword);
        TPAExtensions tpaExtensions = createTPAExtensions(provider);
        pos.setTPAExtensions(tpaExtensions);
        pos.setSource(source);
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
}