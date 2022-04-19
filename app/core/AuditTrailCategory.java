package core;

import com.avaje.ebean.annotation.EnumValue;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 10/30/15 2:05 AM
 * |
 **/
public enum AuditTrailCategory {
    @EnumValue("Register")
    Register,
    @EnumValue("Login")
    Login,
    @EnumValue("Commission_Profit")
    Commission_Profit,
    @EnumValue("Commission_Rules")
    Commission_Rules
}
