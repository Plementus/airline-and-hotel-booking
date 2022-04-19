package models;

import com.avaje.ebean.Model;

import java.util.Date;

import javax.persistence.*;

/**
 * Created by Ibrahim Olanrewaju. on 2/7/16 12:00 AM.
 */

@Entity
@SoftDelete
public class TfxLocale extends MyModel {
    public String domain_name;
    public String country_code;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "country_id")
    public Countries country_id;
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, TfxLocale> find = new MyModel.Finder<>(Long.class, TfxLocale.class);
}
