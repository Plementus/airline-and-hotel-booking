//package core;
//
//import core.security.Hash;
//import models.Services;
//import models.TransRefs;
//
///**
// * Created by Ibrahim Olanrewaju. on 2/6/16 7:08 PM.
// */
//public class TfxReference {
//
//    public static TfxReference instance = null;
//
//    private static final String PREFIX = "TFX_";
//
//    private TfxReference() {
//
//    }
//
//    public static TfxReference getInstance() {
//        if (instance == null) {
//            instance = new TfxReference();
//        }
//        return instance;
//    }
//
//    public TransRefs genFlightReference() {
//        String tfxReference = getTfxReference(Services.FLIGHT).ref_code;
//        if (TransRefs.find.where().eq("ref_code", tfxReference).findUnique() != null) {
//            return genFlightReference();
//        }
//        TransRefs refs = new TransRefs();
//        refs.ref_code = tfxReference;
//        refs.service = Services.FLIGHT;
//        refs.insert();
//        return refs;
//    }
//
//    public TransRefs getTfxReference(Services services) {
//        String tfxReference = getTfxReference(services).ref_code;
//        if (TransRefs.find.where().eq("ref_code", tfxReference).findUnique() != null) {
//            return getTfxReference(services);
//        }
//        TransRefs refs = new TransRefs();
//        refs.ref_code = tfxReference;
//        refs.service = Services.FLIGHT;
//        refs.insert();
//        return refs;
//    }
//
//    private String getTfxReference() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(Hash.generateSalt().substring(0, 10));
//        return stringBuilder.toString();
//    }
//
//
//}


package core;

import core.security.Hash;
import models.Services;
import models.TransRefs;

/**
 * Created by Igbalajobi Jamiu O. on 2/6/16 7:08 PM.
 */
public class TfxReference {

    public static TfxReference instance = null;

    private static final String PREFIX = "TFX_";

    private TfxReference() {

    }

    public static TfxReference getInstance() {
        if (instance == null) {
            instance = new TfxReference();
        }
        return instance;
    }

    public TransRefs genFlightReference() {
        String tfxReference = getTfxReference(Services.FLIGHT);
        if (TransRefs.find.where().eq("ref_code", tfxReference).findUnique() != null) {
            return genFlightReference();
        }
        TransRefs refs = new TransRefs();
        refs.ref_code = tfxReference;
        refs.service = Services.FLIGHT;
        refs.insert();
        return refs;
    }

    public TransRefs getServiceReference(Services service) {
        String tfxReference = getTfxReference(service);
        if (TransRefs.find.where().eq("ref_code", tfxReference).findUnique() != null) {
            return genFlightReference();
        }
        TransRefs refs = new TransRefs();
        refs.ref_code = tfxReference;
        refs.service = Services.FLIGHT;
        refs.insert();
        return refs;
    }


    private String getTfxReference(Services services) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(PREFIX);
        stringBuilder.append(Cookies.getUserLocaleCountry() + "_");
        stringBuilder.append(services.getCode());
        stringBuilder.append(Hash.generateSalt().substring(0, 10));
        return stringBuilder.toString();
    }


}
