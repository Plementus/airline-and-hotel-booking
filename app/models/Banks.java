package models;

import com.avaje.ebean.Model;

import java.util.Date;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 10/28/15 12:18 AM
 * |
 **/

@Entity
@SoftDelete
public class Banks extends MyModel {
    public String name;
    public String institution_code;
    public String api_bank_code;
    public String bank_code;
    @Enumerated
    public Status status;
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, Banks> find = new MyModel.Finder<>(Long.class, Banks.class);
}
