package models;

import com.avaje.ebean.Model;

import java.util.Date;
import javax.persistence.*;


/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 21/12/2015 8:34 PM
 * |
 **/
@Entity
@SoftDelete
public class UserPrivileges extends MyModel {
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, UserPrivileges> find = new MyModel.Finder<>(Long.class, UserPrivileges.class);
}
