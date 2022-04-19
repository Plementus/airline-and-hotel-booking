package models;

import com.avaje.ebean.annotation.EnumValue;
import org.apache.commons.lang3.StringUtils;
import play.twirl.api.Html;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by
 * Ibrahim Olanrewaju. on 25/04/2016 8:14 PM.
 */
public enum FlightMarkupPriceDirection {
    @EnumValue("MARK_UP")
    MARK_UP,
    @EnumValue("MARK_DOWN")
    MARK_DOWN;

    public static Map<String, String> options() {
        Map<String, String> opt = new HashMap<>();
        for (FlightMarkupPriceDirection types : FlightMarkupPriceDirection.values()) {
            opt.put(types.name(), types.name().replaceAll("_" , " ").toLowerCase());
        }
        return opt;
    }
}
