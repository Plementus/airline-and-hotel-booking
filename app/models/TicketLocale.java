package models;

import com.avaje.ebean.annotation.EnumValue;

import java.util.HashMap;
import java.util.Map;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 03/01/2016 12:21 AM
 * |
 **/
public enum TicketLocale {
    @EnumValue("International")
    International,
    @EnumValue("Local")
    Local,
    @EnumValue("Both")
    Both;

    public static Map<String, String> options() {
        Map<String, String> opt = new HashMap<>();
        for (TicketLocale types : TicketLocale.values()) {
            opt.put(types.name(), types.name());
        }
        return opt;
    }
}
