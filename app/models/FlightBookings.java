package models;

import java.util.List;
import javax.persistence.*;


/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 20/12/2015 8:52 AM
 * |
 **/
@Entity
@SoftDelete
public class FlightBookings extends MyModel {
    public String pnr_ref;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "payment_history_id")
    public PaymentHistories payment_history_id;
    @Column(unique = true)
    public String tfx_ticket_ref;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "trans_ref_id")
    public TransRefs trans_ref_id;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "airline_id")
    public Airlines airline_id;
    public String airline_name;
    public String airline_code;
    @Enumerated
    public TripType trip_type;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "airline_commission_rule_id")
    public FlightMarkUpDownRules airline_commission_rule_id;
    public String gds_name;
    @Enumerated
    public CabinPreference cabin_class;
    public Integer gds_decimal_places;
    @Column(columnDefinition = "DECIMAL(8,2)")
    public Double gds_base_fair;
    @Column(columnDefinition = "DECIMAL(8,2)")
    public Double gds_tax_fair;
    @Column(columnDefinition = "DECIMAL(8,2)")
    public Double gds_total_fair;
    @Column(columnDefinition = "DECIMAL(8,2)")
    public Double commission_base_fair;
    @Column(columnDefinition = "DECIMAL(8,2)")
    public Double commission_tax_fair;
    @Column(columnDefinition = "DECIMAL(8,2)")
    public Double commission_total_fair;
    @Column(columnDefinition = "DECIMAL(8,2)")
    @Enumerated
    public TicketLocale destination_locale;
    public Double display_amount;
    public String currency;
    public String contact_firstname;
    public String contact_surname;
    public String contact_email;
    public String contact_phone;
    @Column(columnDefinition = "LONGTEXT")
    public String priced_itinerary_encode;
    @Column(columnDefinition = "LONGTEXT")
    public String pnr_file_info;
    @Column(columnDefinition = "LONGTEXT")
    public String travel_itinerary_encode;
    public String invoice_to;
    @Enumerated
    public FlightBookingStatus status;
    @OneToMany(mappedBy = "flight_booking_id")
    public List<FlightBookingDestinations> originDestinationsList;
    @OneToMany(mappedBy = "flight_booking_id")
    public List<FlightBookingPassengers> flightBookingPassengersList;
    public static final MyModel.Finder<Long, FlightBookings> find = new MyModel.Finder<>(Long.class, FlightBookings.class);
}
