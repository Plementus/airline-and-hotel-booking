/**
 * *********************************************************************************
 */
//	8/5/15 11:12 AM - Ibrahim Olanrewaju.
/********************************************/

package models;

import core.Sql;
import core.interfaces.EbeanPaginator;
import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@SoftDelete
public class PaymentHistories extends MyModel {
    @Column(columnDefinition = "DECIMAL(8,2)")
    public double amount;
    @Column(columnDefinition = "DECIMAL(8,2)")
    public double amount_paid;
    public String trans_ref;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    public Users user_id;
    @Enumerated
    public PaymentStatus status;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "payment_method_id")
    public PaymentMethods payment_method_id;
    public String gateway_response_code;
    public String gateway_response_desc;
    public String gateway_response_amt;
    public Services service_category;
    @Column(columnDefinition = "LONGTEXT DEFAULT NULL")
    public String eft_api_response;
    public String currency;
    public static MyModel.Finder<Integer, PaymentHistories> find = new MyModel.Finder<>(Integer.class, PaymentHistories.class);
    @OneToMany
    public List<FlightBookings> flightBookingsList;
}
