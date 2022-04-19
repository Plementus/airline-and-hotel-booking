package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import java.util.Date;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/7/15 2:25 AM
 * |
 **/

@Entity
@SoftDelete
public class SupportTickets extends MyModel {
    @ManyToOne
    @JoinColumn(name = "actor_user_id", referencedColumnName = "id")
    public Users actor_user_id;
    @ManyToOne
    @JoinColumn(name = "admin_user_id", referencedColumnName = "id")
    public Users admin_user_id;
    @Constraints.Required
    public String ticket_title;
    @ManyToOne
    @JoinColumn(name = "support_category_id", referencedColumnName = "id")
    public SupportCategories support_category_id;
    @Constraints.Required
    @Enumerated
    public SupportStatus status;
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, SupportTickets> find = new MyModel.Finder<>(Long.class, SupportTickets.class);
}
