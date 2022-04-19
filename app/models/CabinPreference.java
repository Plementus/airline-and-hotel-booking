package models;

import com.avaje.ebean.annotation.EnumValue;

import java.util.HashMap;
import java.util.Map;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 12/1/15 12:17 AM
 * |
 **/
public enum CabinPreference {
    @EnumValue("ECONOMY")
    ECONOMY("Economy"),
    @EnumValue("PREMIUM")
    PREMIUM("Premium"),
    @EnumValue("BUSINESS")
    BUSINESS("Business"),
    @EnumValue("FIRST")
    FIRST("First"),
    Y("Y"),
    S("S"),
    C("C"),
    J("J"),
    F("F"),
    P("P");

//    MAIN("Main");

    private final String value;

    CabinPreference(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CabinPreference fromValue(String v) {
        for (CabinPreference c : CabinPreference.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static Map<String, String> options() {
        Map<String, String> opt = new HashMap<>();
        opt.put(CabinPreference.ECONOMY.name(), CabinPreference.ECONOMY.name());
        opt.put(CabinPreference.PREMIUM.name(), CabinPreference.PREMIUM.name());
        opt.put(CabinPreference.BUSINESS.name(), CabinPreference.BUSINESS.name());
        opt.put(CabinPreference.FIRST.name(), CabinPreference.FIRST.name());
        return opt;
    }
}

