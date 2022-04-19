package models;

import com.avaje.ebean.Model;

import java.util.Date;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/24/15 1:57 AM
 * |
 **/

@Entity
@SoftDelete
public class ApiServiceProviders extends MyModel {
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "service_id")
    public Services service_id;
    public String service_providers_name;
    @Enumerated
    public Status service_status;
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, ApiServiceProviders> find = new MyModel.Finder<>(Long.class, ApiServiceProviders.class);
}
