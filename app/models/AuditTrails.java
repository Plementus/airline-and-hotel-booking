package models;

import core.AuditActionType;
import core.AuditTrailCategory;
import com.avaje.ebean.Model;

import java.util.Date;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 10/17/15 11:56 PM
 * |
 **/

@Entity
@SoftDelete
public class AuditTrails extends MyModel {
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne
    public Users user_id;
    public String activity_title;
    public String message;
    public String ipAddress;
    public String http_user_agent;
    @Enumerated
    public AuditActionType action_type;
    @Enumerated
    public AuditTrailCategory audit_category;
    public Integer level;
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, AuditTrails> find = new MyModel.Finder<>(Long.class, AuditTrails.class);
}
