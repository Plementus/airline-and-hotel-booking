package models;

import com.avaje.ebean.Model;

import java.util.Date;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/16/15 11:16 PM
 * |
 **/

@Entity
@SoftDelete
public class CorporateAccounts extends MyModel {
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    public Users user_id;
    public String corporate_name;
    public String corporate_website;
    public String corporate_phone;
    public String corporate_phone_alternate;
    public String corporate_email;
    public String corporate_email_alternate;
    @ManyToOne
    @JoinColumn(name = "state_id", referencedColumnName = "id")
    public Countries state_id;
    public String city;
    public String sales_tax_no;
    public String vat_no;
    @Column(columnDefinition = "LONGTEXT DEFAULT NULL")
    public String address;
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, CorporateAccounts> find = new MyModel.Finder<>(Long.class, CorporateAccounts.class);
}