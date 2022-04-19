package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 03/05/15 11:55 PM
 * |
 **/

@Entity
@SoftDelete
public class HotelBookingGuestDetails extends MyModel {
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "app_form_field_id")
    public AppFormField app_form_field_id;
    @Column(columnDefinition = "LONGTEXT DEFAULT NULL")
    public String entry_value;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "hotel_booking_id")
    public HotelBookings hotel_booking_id;
    public static final Finder<Long, HotelBookingGuestDetails> find = new Finder<>(Long.class, HotelBookingGuestDetails.class);
}