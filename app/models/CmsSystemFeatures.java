package models;

import com.avaje.ebean.Model;

import java.util.Date;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/21/15 12:04 AM
 * |
 **/

@Entity
@SoftDelete
public class CmsSystemFeatures extends MyModel {
    public String name;
    public String route_url;
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, CmsSystemFeatures> find = new MyModel.Finder<>(Long.class, CmsSystemFeatures.class);
}
