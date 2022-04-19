package models;

import com.avaje.ebean.annotation.EnumValue;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by
 * Ibrahim Olanrewaju. on 24/04/2016 5:14 PM.
 */
public enum SalesCategory {
    @EnumValue("B2C")
    B2C,
    @EnumValue("B2B")
    B2B;

    public static Map<String, String> options() {
        Map<String, String> opt = new HashMap<>();
        for (SalesCategory types : SalesCategory.values()) {
            opt.put(types.name(), types.name());
        }
        return opt;
    }
}
