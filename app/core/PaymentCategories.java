package core;

import com.avaje.ebean.annotation.EnumValue;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 18/12/2015 5:47 PM
 * |
 **/
public enum PaymentCategories {
    @EnumValue("Debit_Card")
    Debit_Card,
    @EnumValue("Pay_By_Cash")
    Pay_By_Cash
//    @EnumValue("Electronic_Fund_Transfer")
//    Electronic_Fund_Transfer
}