package models;

import java.util.Date;

/**
 * Created by Ibrahim Olanrewaju. on 1/29/16 10:00 PM.
 */
public class CartAttr {
    public enum Attr {
        itinerary,
        item_index,
        post_data
    }
    public Long id;
    public String attribute;
    public String value;
    public Date created_at;
}
