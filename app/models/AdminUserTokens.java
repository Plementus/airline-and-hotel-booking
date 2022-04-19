package models;

import com.avaje.ebean.Model;


import javax.persistence.*;
import java.util.Date;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 10/17/15 11:57 PM
 * |
 **/

@Entity
@SoftDelete
public class AdminUserTokens extends MyModel {
    public String token_code;
    @ManyToOne
    @JoinColumn(name = "admin_user_id", referencedColumnName = "id")
    public Users admin_user_id;
    @Enumerated
    public Status status;
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, AdminUserTokens> find = new MyModel.Finder<>(Long.class, AdminUserTokens.class);
}