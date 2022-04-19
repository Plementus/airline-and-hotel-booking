package models;

import com.avaje.ebean.Model;

import java.util.Date;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/17/15 9:25 AM
 * |
 **/

@Entity
@SoftDelete
public class NewsletterUsers extends MyModel {
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    public Users user_id;
    public String first_name;
    public String last_name;
    public String email;
    @Enumerated
    public Status status;
//    public boolean deleted;
    public static final MyModel.Finder<Long, NewsletterUsers> find = new MyModel.Finder<>(Long.class, NewsletterUsers.class);
}
