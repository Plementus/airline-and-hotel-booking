package models;

import com.avaje.ebean.Model;

import java.util.Date;
import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 14/02/2016 9:57 PM
 * |
 **/
@Entity
public class CmsTemplateAttr extends MyModel {
    public String attr;
    public String value;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "cms_template_id")
    public CmsTemplates cms_template_id;
    public static final MyModel.Finder<Long, CmsTemplateAttr> find = new MyModel.Finder<>(Long.class, CmsTemplateAttr.class);
}
