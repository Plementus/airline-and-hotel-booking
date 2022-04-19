package models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by
 * Ibrahim Olanrewaju. on 10/04/2016 3:54 PM.
 */
@Entity
@SoftDelete
public class FlightBookingDestinationSegments extends MyModel {
    public String res_book_design_code;
    public String rph;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "marketing_airline_id")
    public Airlines airline_id;
    public String airline_code;
    public String flight_number;
    public String departure_dt;
    public String arrival_dt;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "departure_airport_id")
    public Airports departure_airport_id;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "arrival_airport_id")
    public Airports arrival_airport_id;
    public String departure_airport_code;
    public String arrival_airport_code;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "flight_booking_destination_id")
    public FlightBookingDestinations flight_booking_destination_id;
    public static final MyModel.Finder<Long, FlightBookingDestinationSegments> find = new MyModel.Finder<>(Long.class, FlightBookingDestinationSegments.class);
}
