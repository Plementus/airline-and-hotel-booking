package models;

import com.avaje.ebean.annotation.EnumValue;

/**
 * Created by Ibrahim Olanrewaju. on 1/23/16 6:47 PM.
 */
public enum FlightBookingStatus {
    @EnumValue("PENDING")
    PENDING("PENDING"),
    @EnumValue("CANCELLED")
    CANCELLED("CANCELLED"),
    @EnumValue("TICKET_VOIDED")
    PREMIUM("TICKET_VOIDED"),
    @EnumValue("TICKET_ISSUED")
    TICKET_ISSUED("TICKET_ISSUED");
    private final String value;

    FlightBookingStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlightBookingStatus fromValue(String v) {
        for (FlightBookingStatus c : FlightBookingStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
