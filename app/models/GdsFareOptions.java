package models;

import com.avaje.ebean.annotation.EnumValue;

import java.util.HashMap;
import java.util.Map;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 12/8/15 10:01 PM
 * |
 **/
public enum GdsFareOptions {
    @EnumValue("BASE_FAIR")
    BASE_FAIR,
    @EnumValue("TAXES")
    TAXES,
    @EnumValue("TOTAL_FAIR")
    TOTAL_FAIR;

    public static Map<String, String> options() {
        Map<String, String> opt = new HashMap<>();
        for (GdsFareOptions types : GdsFareOptions.values()) {
            opt.put(types.name(), types.name().toLowerCase().replace("_", " "));
        }
        return opt;
    }
}