package models;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.EnumValue;
import org.springframework.format.annotation.NumberFormat;
import play.data.validation.Constraints;

import java.util.Date;

import javax.persistence.*;

/**
 * Created by Ibrahim Olanrewaju. on 2/6/16 7:05 PM.
 */

@Entity
@SoftDelete
public class TransRefs extends MyModel {
    @Column(unique = true)
    public String ref_code;

    @Enumerated
    public Services service;
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, TransRefs> find = new MyModel.Finder<>(Long.class, TransRefs.class);
}
