package models;

import com.avaje.ebean.annotation.EnumValue;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 14/03/2016 4:53 PM
 * |
 **/
public enum AppFeatureLibraries {
    @EnumValue("b2c_hotel_booking_form")
    b2c_hotel_booking_form,
    @EnumValue("b2b_hotel_booking_form")
    b2b_hotel_booking_form,
    @EnumValue("b2c_flight_booking_form")
    b2c_flight_booking_form,
    @EnumValue("b2b_flight_booking_form")
    b2b_flight_booking_form
}