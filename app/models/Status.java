package models;

import com.avaje.ebean.annotation.EnumValue;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 10/17/15 10:28 PM
 * |
 **/

public enum Status {
    @EnumValue("Active")
    Active,
    @EnumValue("Inactive")
    Inactive,
}
