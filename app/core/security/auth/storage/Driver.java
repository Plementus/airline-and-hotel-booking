package core.security.auth.storage;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 23/12/2015 8:31 PM
 * |
 **/
public enum Driver {

    CACHE("cache"), SESSION("session");

    String driverCode;

    Driver(String code) {
        this.driverCode = code;
    }

    public String getDriverCode() {
        return this.driverCode;
    }
}