package models;

import core.Notification;
import com.avaje.ebean.Model;

import java.util.Date;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/9/15 4:48 PM
 * |
 **/

@Entity
@SoftDelete
public class Notifications extends MyModel {
    @JoinColumn(name = "actor_user_id", referencedColumnName = "id")
    @ManyToOne
    public Users actor_user_id;
    public String notification_message;
    @Enumerated
    public NotificationAction notification_action;
    public String action_route;
    public String action_params;
    public String action_url_string;
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, Notifications> find = new MyModel.Finder<>(Long.class, Notifications.class);
}
