package services.amadeus.airfliforq;

import play.Configuration;

/**
 * |
 * | Created by Igbalajobi Jamiu O..
 * | On 28/02/2016 8:12 AM
 * |
 **/
public class POSBuilder {

    private static final Configuration amaduesConf = Configuration.root();
    private static final String pseudoCityCode = amaduesConf.getString("amadeus.api.pseudoCityCode");
    private static final String systemMode = amaduesConf.getString("amadeus.api.system.mode");
    private static final String apiUserId = amaduesConf.getString("amadeus.api.provider.userID");
    private static final String apiPassword = amaduesConf.getString("amadeus.api.provider.password");
    private static final String requestorId = amaduesConf.getString("amadeus.api.requestor.id");
    private static final String requestorType = amaduesConf.getString("amadeus.api.requestor.type");

    public static POS createInstance() {
        POS pos = new POS();

        Provider provider = createProvider("Amadeus", systemMode, apiUserId, apiPassword);
        TPAExtensions tpaExtensions = createTPAExtensions(provider);

        RequestorID requestorID = createRequestorID(requestorId, requestorType);
        Source source = createSource(pseudoCityCode,requestorID);

        pos.setSource(source);
        pos.setTPAExtensions(tpaExtensions);

        return pos;
    }

    private static Source createSource(String pseudoCityCode, RequestorID requestorID) {
        Source source = new Source();
        source.setPseudoCityCode(pseudoCityCode);
        source.setRequestorID(requestorID);
        return source;
    }

    private static TPAExtensions createTPAExtensions(Provider provider) {
        TPAExtensions tpaExtensions = new TPAExtensions();
        tpaExtensions.setProvider(provider);
        return tpaExtensions;
    }

    private static RequestorID createRequestorID(String requestorId, String requestorType) {
        RequestorID requestorID = new RequestorID();
        requestorID.setID(requestorId);
        requestorID.setType(requestorType);
        return requestorID;
    }

    private static Provider createProvider(String name, String system, String userId, String password) {
        Provider provider = new Provider();
        provider.setName(name);
        provider.setSystem(system);
        provider.setUserid(userId);
        provider.setPassword(password);
        return provider;
    }

}