package controllers.interceptors;

import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

/**
 * |
 * | Created by Igbalajobi  Jamiu O.
 * | On 09/12/2015 11:12 AM
 * |
 **/
public class CustomerSecurityInterceptor extends Security.Authenticator {
    @Override
    public String getUsername(Http.Context ctx) {
        String user = ctx.session().get("user");
        if (user == null) {
            return null;
        }
        return user;
    }

    @Override
    public Result onUnauthorized(Http.Context ctx) {
        return this.login(ctx);
    }

    private final Result login(Http.Context ctx) {
        ctx.flash().put("error", "Please login to your dealer account.");
        return redirect("/login?redirect_url=" + ctx.request().uri());
    }
}

