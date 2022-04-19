package models;

import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 12/3/15 11:20 AM
 * |
 **/

@Entity
@SoftDelete
public class AirlineIncentives extends MyModel {
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "airline_incentive_prop")
    @Constraints.Required
    public AirlineIncentiveProp airline_incentive_prop;
    @Constraints.Required
    @Column(name = "`value`")
    public Double value;
    @Enumerated
    public ValueTypes value_type;
    @Enumerated
    public Status status;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "auth_user_id")
    public Users auth_user_id;
    public static final MyModel.Finder<Long, AirlineIncentives> find = new MyModel.Finder<>(Long.class, AirlineIncentives.class);

    public static Map<String, String> options() {
        LinkedHashMap<String, String> options = new LinkedHashMap<>();
        for (AirlineIncentives c : AirlineIncentives.find.all()) {
            options.put(c.id.toString(), c.airline_incentive_prop.airline_id.airline_code + " / " + c.airline_incentive_prop.title + " / " + c.value + " " + c.value_type.name().toLowerCase());
        }
        return options;
    }
}