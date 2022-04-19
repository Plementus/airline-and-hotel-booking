package models;

import javax.persistence.*;


/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 02/01/2016 11:37 PM
 * |
 **/
@Entity
@SoftDelete
public class ProductServices extends MyModel {
    public String name;
    public String short_desc;
    @Column(columnDefinition = "LONGTEXT")
    public String full_desc;
    @Enumerated
    public Services service;
    @Enumerated
    public YesNoEnum is_free;
    @Enumerated
    public YesNoEnum is_mandatory;
    @Column(columnDefinition = "DOUBLE(8,2)")
    public Double amount;
    @Enumerated
    public RefundPolicy refund_policy;
    @Enumerated
    public Status status;
    @Enumerated
    public TicketLocale destination_locale;
    @JoinColumn(referencedColumnName = "id", name = "auth_user_id")
    public Users auth_user_id;
    public static final MyModel.Finder<Long, ProductServices> find = new MyModel.Finder<>(Long.class, ProductServices.class);
}
