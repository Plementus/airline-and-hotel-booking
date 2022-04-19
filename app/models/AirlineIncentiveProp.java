package models;

import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by
 * Ibrahim Olanrewaju. on 24/04/2016 2:13 AM.
 */
@Entity
@SoftDelete
public class AirlineIncentiveProp extends MyModel {
    @Constraints.Required
    public String title;
    @Constraints.Required
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "airline_id")
    public Airlines airline_id;
    @Constraints.Required
    public boolean has_incentive;
    public String airline_incentive_code;
    @Column(columnDefinition = "LONGTEXT")
    public String remarks;
    public static final MyModel.Finder<Long, AirlineIncentiveProp> find = new MyModel.Finder<>(Long.class, AirlineIncentiveProp.class);
}