package models;

import com.avaje.ebean.annotation.EnumValue;

import java.util.HashMap;
import java.util.Map;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/20/15 1:27 AM
 * |
 **/

public enum TripType {
    @EnumValue("ONE_WAY")
    ONE_WAY("OneWay"),
    @EnumValue("ROUND_TRIP")
    RETURN("Return"),
    @EnumValue("MULTI_CITY")
    MULTI_CITY("Circle");
//    OPEN_JAW("OpenJaw"),
//    OTHER("Other");

    private final String value;

    TripType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TripType fromValue(String v) {
        for (TripType trip : TripType.values()) {
            if (trip.value.equals(v)) {
                return trip;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static Map<String, String> options() {
        Map<String, String> opt = new HashMap<>();
        for (TripType types : TripType.values()) {
            opt.put(types.name(), types.name());
        }
        return opt;
    }
}
