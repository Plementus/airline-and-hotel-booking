package models;

import com.avaje.ebean.Model;
import play.cache.Cache;
import play.data.validation.Constraints;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/19/15 10:20 PM
 * |
 **/

@Entity
@SoftDelete
public class Airlines extends MyModel {
    @Constraints.Required
    public String name;
    @Constraints.Required
    @Column(unique = true)
    public String airline_code;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "logo_data_bank_id")
    public DataBank logo_data_bank_id;
    public static final MyModel.Finder<Long, Airlines> find = new MyModel.Finder<>(Long.class, Airlines.class);

    public static Map<String, String> options() {
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (Airlines c : getAirLines()) {
            options.put(c.id.toString(), c.name);
        }
        return options;
    }

    public static List<Airlines> getAirLines() {
        if (Cache.get("airlines") == null)
            return find.where().findList();
        else
            return (List<Airlines>) Cache.get("airlines");
    }


    public static Airlines getAirLines(String airlineCode) {
        for (Airlines airlines : getAirLines()) {
            if (airlines.airline_code.equalsIgnoreCase(airlineCode)) {
                return airlines;
            }
        }
        return null;
    }
}
