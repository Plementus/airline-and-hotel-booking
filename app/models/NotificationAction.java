package models;

import com.avaje.ebean.annotation.EnumValue;

/**
 * Created by
 * Ibrahim Olanrewaju. on 12/05/2016 9:19 PM.
 */

public enum NotificationAction {
    @EnumValue("NEW_ACCOUNT")
    NEW_ACCOUNT,
    @EnumValue("ACCOUNT_ACTIVATED")
    ACCOUNT_ACTIVATED,
    @EnumValue("NEW_SUPPORT_TICKET")
    NEW_SUPPORT_TICKET,
    @EnumValue("NEW_SUPPORT_MESSAGE")
    NEW_SUPPORT_MESSAGE,
}