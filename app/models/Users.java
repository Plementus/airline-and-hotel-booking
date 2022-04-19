package models;

import java.util.Date;

import com.avaje.ebean.annotation.EnumValue;
import play.data.format.Formats;
import play.data.validation.Constraints;
import com.avaje.ebean.Model;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 6/7/15 2: PM
 * |
 **/

@Entity
@SoftDelete
public class Users extends MyModel {
    public enum Genders {
        @EnumValue("MALE")
        MALE,
        @EnumValue("FEMALE")
        FEMALE,
    }
    @Constraints.Required
    public String phone;
    @Column(unique = true)
    @Constraints.Required
    @Constraints.Email
    public String email;
    @Constraints.Required
    public String password;
    public String salt;
    @Enumerated
    public Titles prefix;
    public String first_name;
    public String last_name;
    @Column(columnDefinition = "LONGTEXT DEFAULT NULL")
    public String contact_address1;
    @Column(columnDefinition = "LONGTEXT DEFAULT NULL")
    public String contact_address2;
    @Enumerated
    public Genders gender;
    @Column(columnDefinition = "TIMESTAMP NULL")
    public Date dob;
    public String user_agent_reg;
    public String ip_address;
    @ManyToOne
    @JoinColumn(name = "role_code", referencedColumnName = "role_code")
    public Roles role_code;
    @Enumerated
    public Status status;
    public Integer setup_percent;
    public String activation_token;
    public String referral_option;
    public String referral_value;
    public String social_media;
    public String social_media_id;
    public String avatar_file_name;
    public String pwd_reset_code;
    @Enumerated
    public YesNoEnum first_time_login;
    public YesNoEnum is_verify;
    public String remember_token;
    @Column(columnDefinition = "LONGTEXT DEFAULT NULL")
    public String avatar_url;
    public static MyModel.Finder<Long, Users> find = new MyModel.Finder<>(Long.class, Users.class);
}
