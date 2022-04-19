package models;

import com.avaje.ebean.Model;

import java.util.Date;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/7/15 2:31 AM
 * |
 **/

@Entity
public class SupportMessages extends MyModel {
    @ManyToOne
    @JoinColumn(name = "support_ticket_id", referencedColumnName = "id")
    public SupportTickets support_ticket_id;
    @ManyToOne
    @JoinColumn(name = "sender_user_id", referencedColumnName = "id")
    public Users sender_user_id;
    @ManyToOne
    @JoinColumn(name = "recipient_user_id", referencedColumnName = "id")
    public Users recipient_user_id;
    @Column(columnDefinition = " LONGTEXT DEFAULT NULL")
    public String message;
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, SupportMessages> find = new MyModel.Finder<>(Long.class, SupportMessages.class);
}
