package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import java.util.Date;
import javax.persistence.*;


/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 24/12/2015 2:19 PM
 * |
 **/
@Entity
@SoftDelete
public class CmsAnnouncements extends MyModel {
    @Column(columnDefinition = "LONGTEXT")
    @Constraints.Required
    public String title;
    @Column(columnDefinition = "LONGTEXT")
    @Constraints.Required
    public String message_html;
    @Constraints.Required
    @Enumerated
    public YesNoEnum is_published;
    public String role_groups;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "auth_user_id")
    public Users auth_user_id;
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, CmsAnnouncements> find = new MyModel.Finder<>(Long.class, CmsAnnouncements.class);
}
