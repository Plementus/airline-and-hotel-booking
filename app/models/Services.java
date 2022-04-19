package models;

import com.avaje.ebean.annotation.EnumValue;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/16/15 11:10 PM
 * |
 **/

public enum Services {
    @EnumValue("FLIGHT")FLIGHT("FL"), @EnumValue("HOTEL") HOTEL("HT"), FLIGHT_HOTEL("FL_HT"), @EnumValue("TRANSFER")TRANSFER("TF"), @EnumValue("TOUR")TOUR("TO");

    private String value;

    Services(String value) {
        this.value = value;
    }

    public String getCode() {
        return value;
    }
}
