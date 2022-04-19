package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 12/1/15 3:56 PM
 * |
 **/

@Entity
@SoftDelete
public class B2bUsers extends MyModel {
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "user_id")
    public Users user_id;
    @Constraints.Required(message = "Company name is required")
    public String company_name;
    public String website_url;
    @Column(columnDefinition = "LONGTEXT DEFAULT NULL")
    @Constraints.Required(message = "Company address is required")
    public String physical_address;
    @Constraints.Required(message = "Corporate phone number is required")
    public String corporate_phone1;
    public String corporate_phone2;
    @ManyToOne
    @OneToOne
    public DataBank logo_data_bank_id;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "state_id")
    public States state_id;
    public String city;
    public String postal_code;
    public String tax_number;
    @OneToMany(mappedBy="b2b_user_id")
    public List<B2bSubUsers> b2bSubUsers;
    public static final MyModel.Finder<Long, B2bUsers> find = new MyModel.Finder<>(Long.class, B2bUsers.class);
}
