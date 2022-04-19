package models;

import com.avaje.ebean.Model;

import java.util.Date;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/9/15 4:58 PM
 * |
 **/

@Entity
@SoftDelete
public class NotificationRecipients extends MyModel {
    @ManyToOne
    @JoinColumn(name = "notification_id", referencedColumnName = "id")
    public Notifications notification_id;
    @ManyToOne
    @JoinColumn(name = "recipient_id", referencedColumnName = "id")
    public Users recipient_id;
    @Enumerated
    public NotificationStatus status;
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, NotificationRecipients> find = new MyModel.Finder<>(Long.class, NotificationRecipients.class);
}