package core.security.acl;

import core.security.Auth;
import play.mvc.Http;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 18/12/2015 3:01 AM
 * |
 **/
public final class AclService {


    public static Boolean hasPermission() {
        if (Auth.isAuthenticated()) {
            Boolean status = AC.DENY;
            String uri = Http.Context.current().request().uri();
            String[] uriSplit = uri.split("/");
//            String module = uriSplit[0];
//            String controller = uriSplit[1];
//            String action = uriSplit[2];
//            if (module.equals("swift")) {
//
//                status = AC.GRANT;
//            } else if (module.equals("console")) {
//
//                status = AC.GRANT;
//            }
            return AC.GRANT;
//            return status;
        } else {
            return AC.GRANT;
        }
    }
}