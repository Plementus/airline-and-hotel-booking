package models;

import com.avaje.ebean.annotation.EnumValue;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 12/2/15 7:42 PM
 * |
 **/
public enum AirportCategory {
    @EnumValue("Local")
    Local,
    @EnumValue("International")
    International,
    @EnumValue("Both")
    Both,
}