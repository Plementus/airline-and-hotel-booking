package core.security.auth;

import models.Users;

import java.util.Date;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 23/12/2015 3:45 PM
 * |
 **/
public abstract class Guard {

    public Users user;

    public Date lastAttempted;


}
