package models;

import com.avaje.ebean.Model;

import java.util.Date;
import javax.persistence.*;


/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/01/2016 11:20 AM
 * |
 **/
@Entity
@SoftDelete
public class CmsBannerSlideshows extends MyModel {
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, CmsBannerSlideshows> find = new MyModel.Finder<>(Long.class, CmsBannerSlideshows.class);
}
