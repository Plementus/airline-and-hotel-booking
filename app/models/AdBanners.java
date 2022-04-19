package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Ibrahim Olanrewaju. on 2/2/16 5:32 PM.
 */

@Entity
@SoftDelete
public class AdBanners extends MyModel {
    public String ad_name;
    public String ad_desc;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "auth_user_id")
    public Users auth_user_id;
    public String display_type;
    public String priority_ranking;
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, AdBanners> find = new MyModel.Finder<>(Long.class, AdBanners.class);
}
