package core.security;

import models.Users;
import play.mvc.Http;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 18/12/2015 3:15 AM
 * |
 **/
public class Auth {

    public static final String SESSION_NAME = "user";
    public static final String SESSION_ROLE = "role";
    public static final String SESSION_LEVEL = "role_level";

    public static final String ROLE_LEVEL_AGENT = "2";
    public static final String ROLE_LEVEL_CUSTOMER = "3";

    /**
     * Returns true if the user is not anonymous
     *
     * @return
     */
    public static boolean isAuthenticated() {
        if (Http.Context.current().session().get(SESSION_NAME) != null) {
            return true;
        }
        return false;
    }

    /**
     * Returns true if the user is not an anonymous or a remember-me user
     *
     * @return
     */
    public static boolean isFullyAuthenticated() {
        if (Http.Context.current().session().get(SESSION_NAME) != null) {
            return true;
        }
        return false;
    }

    /**
     * Returns true if the current principal is a remember-me user isAuthenticated()
     *
     * @return
     */
    public static boolean isRememberMe() {
        return false;
    }

    /**
     * Returns true if the current principal is an anonymous user
     *
     * @return
     */
    public static boolean isAnonymous() {
        if (Http.Context.current().session().get(SESSION_NAME) == null) {
            return true;
        }
        return false;
    }

    public static String role() {
        return Http.Context.current().session().get(SESSION_ROLE);
    }

    public static Long userId() {
        return Long.parseLong(Http.Context.current().session().get(SESSION_NAME));
    }

    public static Users user() {
        if (isAuthenticated()) {
            return Users.find.byId(userId());
        }
        return null;
    }

    public static int getSessionLevel() {
        if (Http.Context.current().session().get(SESSION_LEVEL) != null)
            return Integer.parseInt(Http.Context.current().session().get(SESSION_LEVEL));
        return 0; //invalid session level.
    }
}
