package models;

import play.data.validation.Constraints;

import javax.persistence.*;

/**
 * Created by
 * Ibrahim Olanrewaju. on 27/04/2016 3:00 AM.
 */
@Entity
@SoftDelete
public class AirlineFlightMarkUpDown extends MyModel {
    @Constraints.Required
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "airline_incentive_id")
    public AirlineIncentives airline_incentive_id;
    @Constraints.Required
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "flight_markup_down_rule_id")
    public FlightMarkUpDownRules flight_markup_down_rule_id;
    @Constraints.Required
    public Boolean is_fare_type_markup;
    public Boolean apply_coupon = false;
    @Enumerated
    public ValueTypes ft_value_type;
    @Enumerated
    public FlightMarkupPriceDirection ft_direction;
    public double ft_value;
    @Enumerated
    public GdsFareOptions ft_fare_option;
    @Enumerated
    public ValueTypes adt_value_type;
    @Enumerated
    public FlightMarkupPriceDirection adt_direction;
    @Enumerated
    public GdsFareOptions adt_fare_option;
    public double adt_value;
    @Enumerated
    public ValueTypes chd_value_type;
    @Enumerated
    public FlightMarkupPriceDirection chd_direction;
    @Enumerated
    public GdsFareOptions chd_fare_option;
    public double chd_value;
    @Enumerated
    public ValueTypes inf_value_type;
    @Enumerated
    public FlightMarkupPriceDirection inf_direction;
    @Enumerated
    public GdsFareOptions inf_fare_option;
    public double inf_value;
    public String currencies;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "coupon_id")
    public Coupons coupon_id;
    @Constraints.Required
    public Boolean display_gds_fare = true;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "auth_user_id")
    public Users auth_user_id;
    @Transient
    @Constraints.Required
    public String formCurrency[];
    public static final MyModel.Finder<Long, AirlineFlightMarkUpDown> find = new MyModel.Finder<>(Long.class, AirlineFlightMarkUpDown.class);
}
