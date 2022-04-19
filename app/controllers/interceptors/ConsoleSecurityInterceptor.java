package controllers.interceptors;

import akka.util.Crypt;
import core.Mailer;
import core.security.AuthServices;
import models.AdminUserTokens;
import models.Users;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

/**
 * Created by Igbalajobi  Jamiu O on 09/12/2015.
 */

public class ConsoleSecurityInterceptor extends Security.Authenticator {

    @Override
    public String getUsername(Http.Context ctx) {
        String role = ctx.session().get("role");
        String user = ctx.session().get("user");
        Http.Cookie token = ctx.request().cookies().get("u_token");
        if (user == null || role.equals(AuthServices.ROLE_CUSTOMER)) { // || token == null
            return null;
        }
        return user;
    }

    @Override
    public Result onUnauthorized(Http.Context ctx) {
        return this.loginAuth(ctx);
    }

    private final Result loginAuth(Http.Context ctx) {
//        if (ctx.request().cookie("u_token") == null) {
//            if (ctx.session().get("role") == null || ctx.session().get("role").equals(AuthServices.ROLE_CUSTOMER)) {
//                ctx.flash().put("error", "Access Restricted! Please contact us for more information");
//                System.err.println("Session Role: " + ctx.session().get("role"));
//                return redirect(controllers.routes.AuthenticationController.getConsoleLogin());
//            }
//            Users user = Users.find.byId(Long.parseLong(ctx.session().get("user")));
//            AdminUserTokens token = new AdminUserTokens();
//            token.token_code = Long.toString(Math.abs(Crypt.random().nextLong())).substring(1, 6);
//            token.admin_user_id = user;
//            token.status = models.Status.Inactive;
//            token.save();
//
//            Mailer.Envelop envelop = new Mailer.Envelop(play.Configuration.root().getString("project.name") + " Console Token", views.html.emails.console_token.render(user.first_name + " " + user.last_name, token.token_code).body(), user.email);
//            Mailer.sendMail(envelop);
//
//            //redirect to input token page
//            ctx.flash().put("info", "Please enter your OTP token received via email to continue.");
//            return redirect(controllers.routes.AuthenticationController.generateToken());
//        }
        ctx.flash().put("error", "Unauthorized access, please login to continue");
        return redirect("/tfx/login");
    }

}
