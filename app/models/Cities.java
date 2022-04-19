package models;

import com.avaje.ebean.Model;

import java.util.Date;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/19/15 10:30 PM
 * |
 **/

@Entity
@SoftDelete
public class Cities extends MyModel {
    public String name;
    public String city_code1;
    public String city_code2;
    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    public Countries country_id;
    public static final MyModel.Finder<Long, Cities> find = new MyModel.Finder<>(Long.class, Cities.class);
}
