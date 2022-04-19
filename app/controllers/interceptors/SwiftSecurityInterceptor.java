package controllers.interceptors;

import models.Roles;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

/**
 * Created by Igbalajobi  Jamiu O on 09/12/2015.
 */

public class SwiftSecurityInterceptor extends Security.Authenticator {

    @Override
    public String getUsername(Http.Context ctx) {
        String role = ctx.session().get("role");
        String user = ctx.session().get("user");
        if (user == null || role == null && Roles.find.byId(role).level != 2) {
            return null;
        }
        return user;
    }

    @Override
    public Result onUnauthorized(Http.Context ctx) {
        return this.loginAuth(ctx);
    }

    private final Result loginAuth(Http.Context ctx) {
        ctx.flash().put("error", "Please login to continue.");
        return redirect(controllers.routes.AuthenticationController.getSwiftLogin().toString().concat("?redirect_url=" + ctx.request().uri()));
    }
}
