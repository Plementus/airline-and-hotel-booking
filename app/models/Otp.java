package models;

import com.avaje.ebean.Model;

import java.util.Date;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 10/28/15 12:38 AM
 * |
 **/

@Entity
@SoftDelete
public class Otp extends MyModel {
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne
    public Users user_id;
    @Column(columnDefinition = "TIMESTAMP NULL")
    public Date issue_date;
    @Column(columnDefinition = "TIMESTAMP NULL")
    public Date expire_on;
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, Otp> find = new MyModel.Finder<>(Long.class, Otp.class);
}
