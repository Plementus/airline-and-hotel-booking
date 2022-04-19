package core.security.acl;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 18/12/2015 3:02 AM
 * |
 **/
public final class AC {

    public static final boolean GRANT = true;
    public static final boolean DENY = false;

    public Boolean hasAccess(AclActionEnums action) {
        boolean status = DENY;


        return status;
    }

}
