package core;

import models.CartAttr;
import models.Users;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Ibrahim Olanrewaju. on 1/29/16 5:14 PM.
 */

public class Carts {
    public Integer id;
    public String user_cookie_id;
    public Users session_uid;
    public String cart_item;
    public List<CartAttr> cartAttrs = new ArrayList<>();
    public Date created_at;
    public String itemUri;
}
