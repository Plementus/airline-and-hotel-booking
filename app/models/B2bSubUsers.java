package models;

import com.avaje.ebean.Model;

import java.util.Date;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 12/1/15 4:19 PM
 * |
 **/

@Entity
@SoftDelete
public class B2bSubUsers extends MyModel {
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "user_id")
    public Users user_id;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "b2b_user_id")
    public B2bUsers b2b_user_id;
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, B2bSubUsers> find = new MyModel.Finder<>(Long.class, B2bSubUsers.class);
}
