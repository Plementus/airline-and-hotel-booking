package models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 13/03/2016 9:19 AM
 * |
 **/
@Entity
@SoftDelete
public class HotelBookings extends MyModel {
    public Integer hotel_ws_id;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "hotel_id")
    public Hotels hotel_id;
    public String ws_booking_ref;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "trans_ref_id")
    public TransRefs trans_ref_id;
    public static final MyModel.Finder<Long, HotelBookings> find = new MyModel.Finder<>(Long.class, HotelBookings.class);

}