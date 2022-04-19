package models;

import javax.persistence.*;
import java.util.List;


/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 20/12/2015 12:26 PM
 * |
 **/
@Entity
@SoftDelete
public class FlightBookingDestinations extends MyModel {
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "flight_booking_id")
    public FlightBookings flight_booking_id;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "departure_airport_id")
    public Airports departure_airport_id;
    public String departure_airport_name;
    public String departure_airport_code;
    public String departure_date;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "arrival_airport_id")
    public Airports arrival_airport_id;
    public String arrival_airport_name;
    public String arrival_airport_code;
    public String arrival_date;
    public CabinPreference cabin_class;
    public int num_of_stops;
    public String duration;
    @OneToMany(mappedBy = "flight_booking_destination_id")
    public List<FlightBookingDestinationSegments> flightBookingDestinationSegmentsList;
    public static final MyModel.Finder<Long, FlightBookingDestinations> find = new MyModel.Finder<>(Long.class, FlightBookingDestinations.class);
}
