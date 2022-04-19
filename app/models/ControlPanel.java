package models;

import com.avaje.ebean.Model;

import java.util.Date;
import javax.persistence.*;


/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 07/01/2016 7:40 PM
 * |
 **/
@Entity
@SoftDelete
public class ControlPanel extends MyModel {
    public String meta_key;
    @Column(columnDefinition = "LONGTEXT DEFAULT NULL")
    public String meta_value;
    public static final MyModel.Finder<Long, ControlPanel> find = new MyModel.Finder<>(Long.class, ControlPanel.class);
}
