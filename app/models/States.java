package models;

import com.avaje.ebean.Model;

import java.util.Date;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 10/18/15 3:53 AM
 * |
 **/

@Entity
@SoftDelete
public class States extends MyModel {
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "country_id")
    public Countries country_id;
    public String name;
    public String code;
    @Enumerated
    public YesNoEnum status;
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, States> find = new MyModel.Finder<>(Long.class, States.class);
}