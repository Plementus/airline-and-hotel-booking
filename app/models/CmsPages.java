package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/20/15 11:31 AM
 * |
 **/

@Entity
@SoftDelete
public class CmsPages extends MyModel {
    @Constraints.Required
    public String name;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "cms_template_id")
    @Constraints.Required
    public CmsTemplates cms_template_id;
    @Column(columnDefinition = "LONGTEXT DEFAULT NULL")
    public String meta_keywords;
    @Column(columnDefinition = "LONGTEXT DEFAULT NULL")
    public String meta_description;
    @Constraints.Required
    @Enumerated
    public YesNoEnum is_publish;
    public String type;
    @Column(columnDefinition = "LONGTEXT")
    public String host;
    @Constraints.Required
    public List<String> host_domain;
    @Constraints.Required
    public String slug_url;
    public String inline_css;
    public String inline_js;
    @Enumerated
    public YesNoEnum version_control;
    @Enumerated
    public YesNoEnum services_page;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "auth_user_id")
    public Users auth_user_id;
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, CmsPages> find = new MyModel.Finder<>(Long.class, CmsPages.class);

}
