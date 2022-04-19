package models;

import com.avaje.ebean.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Id;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/7/15 2:28 AM
 * |
 **/

@Entity
@SoftDelete
public class SupportCategories extends MyModel {
    public String name;
    public Integer severe_level;
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, SupportCategories> find = new MyModel.Finder<>(Long.class, SupportCategories.class);
}
