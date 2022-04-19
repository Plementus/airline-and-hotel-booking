package models;

import com.avaje.ebean.Model;
import play.cache.Cache;
import play.twirl.api.Html;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/15/15 10:13 PM
 * |
 **/

@Entity
@SoftDelete
public class Currencies extends MyModel {
    @OneToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    public Countries country_id;
    public String code;
    public String name;
    public String html_symbol;
    public Boolean is_default;
    public static final MyModel.Finder<Long, Currencies> find = new MyModel.Finder<>(Long.class, Currencies.class);

    public static List<Currencies> getCurrencies() {
        List<Currencies> currencies;
        try {
            currencies = (List<Currencies>) Cache.get("currencies");
            if (currencies == null) {
                currencies = Currencies.find.all();
            }
        } catch (Exception ex) {
            currencies = Currencies.find.all();
        }
        return currencies;
    }

    public static Currencies getCurrencies(String currencyCode) {
        List<Currencies> currencies;
        try {
            currencies = (List<Currencies>) Cache.get("currencies");
        } catch (Exception ex) {
            currencies = Currencies.find.all();
        }
        Currencies cCurrency = null;
        for (Currencies currency : currencies) {
            if (currency.code.equals(currencyCode)) {
                cCurrency = currency;
            }
        }
        return cCurrency;
    }

    public static Map<String, String> options() {
        Map<String, String> opt = new HashMap<>();
        for (Currencies types : getCurrencies()) {
            opt.put(types.id.toString(), types.name + " " + Html.apply(types.code));
        }
        return opt;
    }


}
