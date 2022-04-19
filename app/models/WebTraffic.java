package models;

import com.avaje.ebean.Model;

import java.util.Date;

import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/19/15 10:27 AM
 * |
 **/

@Entity
@SoftDelete
public class WebTraffic extends MyModel {
    public String referring_url;
    public String ip_address;
    public String ip_country;
    public String ip_country_code;
    public String time_zone;
    public String ip_city;
    public String cookie_id;
    public String http_user_agent;
    @Enumerated
    public YesNoEnum is_mobile;
    public String machine_name;
//    @SoftDelete
//    public boolean deleted;
    public static final MyModel.Finder<Long, WebTraffic> find = new MyModel.Finder<>(Long.class, WebTraffic.class);
}
