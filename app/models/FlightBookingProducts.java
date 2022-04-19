package models;

import javax.persistence.*;


/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 06/01/2016 5:35 PM
 * |
 **/
@Entity
@SoftDelete
public class FlightBookingProducts extends MyModel {
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "product_id")
    public ProductServices product_id;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "flight_booking_id")
    public FlightBookings flight_booking_id;
    @Column(columnDefinition = "DECIMAL(8,2)")
    public Double amount;
    public static final MyModel.Finder<Long, FlightBookingProducts> find = new MyModel.Finder<>(Long.class, FlightBookingProducts.class);
}
