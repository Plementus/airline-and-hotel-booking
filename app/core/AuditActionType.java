package core;

import com.avaje.ebean.annotation.EnumValue;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 10/30/15 2:06 AM
 * |
 **/

public enum  AuditActionType {
    @EnumValue("System")
    System,
    @EnumValue("User")
    User
}
