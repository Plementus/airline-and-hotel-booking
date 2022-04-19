package models;

import com.avaje.ebean.Model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 12/8/15 9:57 PM
 * |
 **/

@Entity
@SoftDelete
public class Coupons extends MyModel {
    public String code;
    @Enumerated
    public Status status;
    public static final MyModel.Finder<Long, Coupons> find = new MyModel.Finder<>(Long.class, Coupons.class);

    public static Map<String, String> options() {
        Map<String, String> opt = new HashMap<>();
        for (Coupons types : Coupons.find.all()) {
            opt.put(types.id.toString(), types.code);
        }
        return opt;
    }
}
