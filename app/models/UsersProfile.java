package models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by
 * Ibrahim Olanrewaju. on 30/03/2016 12:20 AM.
 */
@SoftDelete
@Entity
public class UsersProfile extends MyModel {
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "user_id")
    public Users user_id;
    public String passport_fname;
    public String passport_mname;
    public String passport_lname;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "passport_country_id")
    public Countries passport_country_id;
    public String passport_no;
    public String passport_expiring_date;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "visa_issue_country_id")
    public String visa_issue_country_id;
    public String visa_document_no;
    public String visa_expiring_date;
    public static MyModel.Finder<Long, UsersProfile> find = new MyModel.Finder<>(Long.class, UsersProfile.class);
}
