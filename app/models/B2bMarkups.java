package models;

import com.avaje.ebean.Model;

import java.util.Date;
import javax.persistence.*;


/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 18/12/2015 7:24 AM
 * |
 **/
@Entity
@SoftDelete
public class B2bMarkups extends MyModel {
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "user_id")
    public Users user_id;
    @Enumerated
    public YesNoEnum is_percent;
    public Double b2b_adult_oneway;
    public Double b2b_adult_round;
    public Double b2b_adult_multi;
    public Double b2b_child_oneway;
    public Double b2b_child_round;
    public Double b2b_child_multi;
    public Double b2b_infant_oneway;
    public Double b2b_infant_round;
    public Double b2b_infant_multi;
    public static final MyModel.Finder<Long, B2bMarkups> find = new MyModel.Finder<>(Long.class, B2bMarkups.class);
}
