package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Ibrahim Olanrewaju. on 2/2/16 5:33 PM.
 */

@Entity
@SoftDelete
public class AdBannerPages extends MyModel {
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "ad_banner_id")
    public AdBanners ad_banner_id;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "ad_databank_id")
    public DataBank ad_databank_id;
    public String ad_height;
    public String ad_width;
    public Integer no_of_views;
    public Integer no_of_click;
//    @Column(columnDefinition = "TIMESTAMP")
//    public Date expire_on;
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, AdBannerPages> find = new MyModel.Finder<>(Long.class, AdBannerPages.class);
}
