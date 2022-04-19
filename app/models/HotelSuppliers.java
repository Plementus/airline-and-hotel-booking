package models;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 13/03/2016 12:06 AM
 * |
 **/
@Entity
@SoftDelete
public class HotelSuppliers extends MyModel {
    public String supplier_name;
    @Column(columnDefinition = "LONGTEXT DEFAULT NULL")
    public String supplier_desc;
    public String uniq_code;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "auth_user_id")
    public Users auth_user_id;
    public boolean is_active;
    public static final MyModel.Finder<Long, HotelSuppliers> find = new MyModel.Finder<>(Long.class, HotelSuppliers.class);

}