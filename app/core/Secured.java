/********************************************
 * *********************************************************************************
 * <p>
 * //	9/3/15 12:09 PM - Ibrahim Olanrewaju.
 * /
 ********************************************/

package core;

import akka.util.Crypt;
import models.AdminUserTokens;
import models.Status;
import models.Users;
import play.mvc.Http;
import play.mvc.Http.Context;

public class Secured {

    public static final int COOKIE_DURATION = 60 * 60 * 24;

    public static Boolean adminTokenAuth(String otp_token, String userId) {
        Boolean status = false;
        Http.Context ctx = Context.current();
        AdminUserTokens adminUserTokens = AdminUserTokens.find.where().eq("token_code", otp_token).where().eq("admin_user_id", Users.find.byId(Long.parseLong(userId))).findUnique();
        if (adminUserTokens == null) {
            ctx.flash().put("error", "Invalid OTP token, a new one has been generated and sent to your email");
            return status;
        }
        adminUserTokens.status = Status.Inactive;
        adminUserTokens.update();
        ctx.response().setCookie("u_token", Crypt.sha1(Crypt.md5(Utilities.getUnixTime())), COOKIE_DURATION);
        status = true;
        return status;
    }
}
