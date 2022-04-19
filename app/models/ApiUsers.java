package models;

import com.avaje.ebean.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Id;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 10/18/15 2:20 PM
 * |
 **/

@Entity
@SoftDelete
public class ApiUsers extends MyModel {
    @Column(unique = true)
    public String api_key;
    public String api_secret;
    public String api_user;
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, ApiUsers> find = new MyModel.Finder<>(Long.class, ApiUsers.class);
}
