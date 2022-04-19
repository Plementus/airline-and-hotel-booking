package models;

import com.avaje.ebean.annotation.EnumValue;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by
 * Ibrahim Olanrewaju. on 24/04/2016 5:10 PM.
 */
public enum TicketPolicy {
    @EnumValue("SITI")
    SITI("SITI"),
    @EnumValue("SOTO")
    SOTO("SOTO"),
    @EnumValue("SOTI")
    SOTI("SOTI");

    String value;

    TicketPolicy(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static Map<String, String> options() {
        Map<String, String> opt = new HashMap<>();
        for (TicketPolicy types : TicketPolicy.values()) {
            opt.put(types.name(), types.name());
        }
        return opt;
    }
}
