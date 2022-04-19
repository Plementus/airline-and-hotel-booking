package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/02/2016 1:24 PM
 * |
 **/
@Entity
@SoftDelete
public class CmsContentCategories extends MyModel {
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "parent_id")
    public CmsContentCategories parent_id;
    @Constraints.Required
    @Column(unique = true, nullable = false)
    public String name;
    @Enumerated
    public YesNoEnum is_url;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "auth_user_id")
    public Users auth_user_id;
    public String breadcrumb_str;
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, CmsContentCategories> find = new MyModel.Finder<>(Long.class, CmsContentCategories.class);
    public static Map<String,String> options(String id) {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        if (id != null && !(id.isEmpty() || Objects.equals(id, "0"))) {
            options.put(id, CmsContentCategories.find.byId(Long.parseLong(id)).breadcrumb_str);
        } else {
            options.put("", "");
            for (CmsContentCategories c : CmsContentCategories.find.orderBy("id asc").findList()) {
                options.put(c.id.toString(), c.breadcrumb_str);
            }
        }
        return options;
    }
}