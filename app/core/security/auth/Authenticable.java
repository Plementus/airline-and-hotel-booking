package core.security.auth;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 23/12/2015 11:42 PM
 * |
 **/

public interface Authenticable {

    public boolean attempt(Credentials credentials);

    public boolean isValid(Credentials credentials);

}
