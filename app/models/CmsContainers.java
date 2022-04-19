package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import java.util.Date;
import javax.persistence.*;


/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 13/01/2016 11:49 AM
 * |
 **/
@Entity
@SoftDelete
public class CmsContainers extends MyModel {
    @Constraints.Required
    public String name;
    public String head_title;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "category_id")
    @Constraints.Required
    public CmsContentCategories category_id;
    @Column(columnDefinition = "LONGTEXT")
    @Constraints.Required
    public String html_code;
    @Enumerated
    public YesNoEnum is_publish;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "auth_user_id")
    public Users auth_user_id;
    @Constraints.Required
    public String description;

//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, CmsContainers> find = new MyModel.Finder<>(Long.class, CmsContainers.class);
}
