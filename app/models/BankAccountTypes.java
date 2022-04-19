package models;

import com.avaje.ebean.annotation.EnumValue;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 10/28/15 12:26 AM
 * |
 **/
public enum BankAccountTypes {
    @EnumValue("Savings")
    Savings,
    @EnumValue("Corporate")
    Corporates
}
