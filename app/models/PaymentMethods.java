package models;

import core.PaymentCategories;
import com.avaje.ebean.Model;
import play.cache.Cache;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 10/17/15 11:44 PM
 * |
 **/

@Entity
@SoftDelete
public class PaymentMethods extends MyModel {
    @Enumerated
    public PaymentCategories payment_category;
    public String name;
    public String bank_account_no;
    public String bank_account_name;
    public String bank_account_type;
    public String gateway_conf_file;
    @Enumerated
    public YesNoEnum is_default;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "gateway_logo_id")
    public DataBank gateway_logo_id;
    public String gateway_display_name;
    @Enumerated
    public Status status;
    @OneToMany(mappedBy = "payment_method_id")
    public List<PaymentHistories> paymentHistoriesList;
    public static MyModel.Finder<Long, PaymentMethods> find = new MyModel.Finder<>(Long.class, PaymentMethods.class);
    public static List<PaymentMethods> getPaymentMethods () {
        List<PaymentMethods> paymentMethodList = null;
        if (Cache.get("paymentMethods") == null || Cache.get("paymentMethods") instanceof NullPointerException) {
            paymentMethodList = PaymentMethods.find.all();
        } else {
            paymentMethodList = (List<PaymentMethods>) Cache.get("paymentMethods");
        }
        return paymentMethodList;
    }
}
