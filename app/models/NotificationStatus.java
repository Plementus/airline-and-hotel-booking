package models;

import com.avaje.ebean.annotation.EnumValue;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/9/15 4:57 PM
 * |
 **/
public enum NotificationStatus {
    @EnumValue("Read")
    Read,
    @EnumValue("Unread")
    Unread
}
