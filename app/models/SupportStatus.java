package models;

import com.avaje.ebean.annotation.EnumValue;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/7/15 2:33 AM
 * |
 **/
public enum SupportStatus {
    @EnumValue("Open")
    Open,
    @EnumValue("Closed")
    Closed,
    @EnumValue("Resolved")
    Resolved
}
