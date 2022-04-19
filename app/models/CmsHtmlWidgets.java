package models;

import play.data.validation.Constraints;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 25/02/2016 11:12 AM
 * |
 **/
@Entity
@SoftDelete
public class CmsHtmlWidgets extends MyModel {
    @Constraints.Required
    public String name;
    @Constraints.Required
    @Column(columnDefinition = "LONGTEXT DEFAULT NULL")
    public String html;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "auth_user_id")
    public Users auth_user_id;
    public static final MyModel.Finder<Long, CmsHtmlWidgets> find = new MyModel.Finder<>(Long.class, CmsHtmlWidgets.class);
}
