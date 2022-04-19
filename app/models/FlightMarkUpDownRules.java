package models;

import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/24/15 1:42 AM
 * |
 **/

@Entity
@SoftDelete
public class FlightMarkUpDownRules extends MyModel {
    @Constraints.Required
    @Column(unique = true)
    public String title;
    @Constraints.Required
    @Enumerated
    public TicketPolicy ticket_policy;
    @Constraints.Required
    @Enumerated
    public SalesCategory sales_category;
    public String u_auth_type;
    @Constraints.Required
    @Enumerated
    public TicketLocale ticket_locale;
    @Constraints.Required
    public Boolean hotel_incl = false; //apply markup rule if only user select hotel combo.
    public String cabin_classes;
    public String trip_types;
    @Constraints.Required
    public boolean incl_connecting_airline; //include multi airline
    public String departure_airports;
    public String arrival_airports;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "auth_user_id")
    public Users auth_user_id;
    public static final MyModel.Finder<Long, FlightMarkUpDownRules> find = new MyModel.Finder<>(Long.class, FlightMarkUpDownRules.class);
    @Transient
    @Constraints.Required
    public String formTripTypes[];
    @Transient
    @Constraints.Required
    public String formCabinClasses[];
    @Transient
    public String formDepartureAirports[];
    @Transient
    public String formArrivalAirports[];

    public static Map<String, String> options() {
        LinkedHashMap<String, String> options = new LinkedHashMap<>();
        for (FlightMarkUpDownRules c : FlightMarkUpDownRules.find.all()) {
            options.put(c.id.toString(), c.title);
        }
        return options;
    }
}
