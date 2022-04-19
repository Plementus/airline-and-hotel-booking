package models;

import com.avaje.ebean.Model;
import play.cache.Cache;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/15/15 10:05 PM
 * |
 **/

@Entity
@SoftDelete
public class Countries extends MyModel {
    public String name;
    public String capital;
    public String iso_code_2;
    public String iso_code_3;
    public String area;
    public String calling_code;
    public String currency;
    public String region;
    public String sub_region;
    @Enumerated
    public YesNoEnum is_operating;
    @OneToOne
    @JoinColumn
    public DataBank ico_image;
    public String country_color_code;
    @Enumerated
    public Status status;
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, Countries> find = new MyModel.Finder<>(Long.class, Countries.class);

    public static List<Countries> getCountries () {
        List<Countries> countriesList = null;
        if (Cache.get("countries") == null || Cache.get("countries") instanceof NullPointerException) {
            countriesList = Countries.find.all();
        } else {
            countriesList = (List<Countries>) Cache.get("countries");
        }
        return countriesList;
    }
}
