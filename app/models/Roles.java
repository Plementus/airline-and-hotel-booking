package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 10/17/15 10:00 PM
 * |
 **/

@Entity
public class Roles extends Model {
    @Id
    public String role_code;
    public String role_title;
    public Integer level;
    @OneToMany(targetEntity = Users.class, fetch = FetchType.LAZY)
    public List<Users> users;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    public Date updated_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    public Date created_at;
    @Column(columnDefinition = "TIMESTAMP NULL")
    public Date deleted_at;
    public static Model.Finder<String, Roles> find = new Model.Finder<>(String.class, Roles.class);
}