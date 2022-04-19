package models;

import com.avaje.ebean.Model;

import java.util.Date;
import javax.persistence.*;


/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 20/12/2015 8:54 AM
 * |
 **/
@Entity
@SoftDelete
public class FlightBookingPassengers extends MyModel {
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "flight_booking_id")
    public FlightBookings flight_booking_id;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "app_form_field_id")
    public AppFormField app_form_field_id;
    @Column(columnDefinition = "LONGTEXT DEFAULT NULL")
    public String input_value;
    public String title;
    public String first_name;
    public String last_name;
    public String date_of_birth;
    public String passenger_age_category;
    public String nationality_country_id;
    public String passport_number;
    public String passport_expiring_date;
    public String passport_issued_country;
    public static final MyModel.Finder<Long, FlightBookingPassengers> find = new MyModel.Finder<>(Long.class, FlightBookingPassengers.class);
}
