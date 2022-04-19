package models;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | 7/12/15 1:12 PM
 * |
 **/
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@SoftDelete
public class DataBank extends MyModel {
    public String file_url;
    public String file_path;
    @Constraints.Required
    public String file_name;
    public String content_type;
    public String file_extension;
    public String file_size;
    public String app_path;
//    @SoftDelete
//    public boolean deleted;
    public static MyModel.Finder<Long, DataBank> find = new MyModel.Finder<>(Long.class, DataBank.class);
}