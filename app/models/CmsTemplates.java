package models;

import com.avaje.ebean.Model;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 13/02/2016 7:36 PM
 * |
 **/
@Entity
@SoftDelete
public class CmsTemplates extends MyModel {
    public String name;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "auth_use_id")
    public Users auth_user_id;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "category_id")
    public CmsContentCategories category_id;
    @Enumerated
    public YesNoEnum is_published;
    @OneToMany(mappedBy = "cms_template_id")
    public List<CmsTemplateAttr> cmsTemplateAttrList;
    public static final MyModel.Finder<Long, CmsTemplates> find = new MyModel.Finder<>(Long.class, CmsTemplates.class);
    public static Map<String, String> options() {
        Map<String, String> res = new LinkedHashMap<>();
        CmsTemplates.find.all().forEach(cmsTemplates -> res.put(cmsTemplates.id.toString(), cmsTemplates.name));
        return res;
    }


    public String getAttrValue(String attr) {
        String val = null;
        for (CmsTemplateAttr cmsA : cmsTemplateAttrList) {
            if (attr.equalsIgnoreCase(cmsA.attr)) {
                val = cmsA.value;
            }
        }
        return val;
    }
}
