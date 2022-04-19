package models;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.EnumValue;
import play.data.validation.Constraints;

import java.util.Date;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/20/15 11:41 AM
 * |
 **/

@Entity
@SoftDelete
public class CmsLinks extends MyModel {
    @Constraints.Required
    public String title;
    @Enumerated
    public YesNoEnum is_sub_menu;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "category_id")
    public CmsContentCategories category_id;
    public String link_type;
    @Enumerated
    public YesNoEnum is_published;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "cms_page_id")
    public CmsPages cms_page_id;
    public String protocol;
    public String link_value;
    @Column(columnDefinition = "LONGTEXT DEFAULT NULL")
    public String code_value;
    public String target;
    @Enumerated
    public YesNoEnum show_in_menu;
    public YesNoEnum show_in_booking_engine;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "cms_system_feature_id")
    public CmsSystemFeatures cms_system_feature_id;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "auth_user_id")
    public Users auth_user_id;
    @Enumerated
    public Status status;
    public static final MyModel.Finder<Long, CmsLinks> find = new MyModel.Finder<>(Long.class, CmsLinks.class);
}