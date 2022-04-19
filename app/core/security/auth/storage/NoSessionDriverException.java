package core.security.auth.storage;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 24/12/2015 12:02 AM
 * |
 **/
public class NoSessionDriverException extends Exception {

    public NoSessionDriverException()  {
        super("No Session Was Specified In This Project. Please Check Your Application.conf to Enable a Session Driver.");
        new Exception().printStackTrace();
    }
}
