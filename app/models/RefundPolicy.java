package models;

import com.avaje.ebean.annotation.EnumValue;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 02/01/2016 11:59 PM
 * |
 **/
public enum RefundPolicy {
    @EnumValue("Refundable")
    Refundable,
    @EnumValue("Non_Refundable")
    Non_Refundable
}
