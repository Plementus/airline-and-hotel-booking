package models;

import com.avaje.ebean.annotation.EnumValue;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 10/17/15 11:22 PM
 * |
 **/
public enum PaymentStatus {
    @EnumValue("Pending")
    Pending,
    @EnumValue("Failed")
    Failed,
    @EnumValue("Success")
    Success,
}
