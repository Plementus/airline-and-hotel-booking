package controllers;

import akka.util.Crypt;
import core.*;
import core.security.Auth;
import core.security.AuthServices;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import controllers.abstracts.BaseController;
import core.security.Hash;
import models.*;
import org.joda.time.Days;
import play.Configuration;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.filters.csrf.RequireCSRFCheck;
import play.libs.F;
import play.libs.Json;
import play.libs.openid.OpenID;
import play.libs.openid.UserInfo;
import play.mvc.Result;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static core.security.Hash.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 10/18/15 12:17 PM
 * |
 **/

public class AuthenticationController extends BaseController {

    public static Result getLogin() {
        if (session().get("user") != null && session().get("role").equals(core.security.AuthServices.ROLE_CUSTOMER)) {
            return redirect("/");
        }
        Form<Forms.Login> formAuth = Form.form(Forms.Login.class);
        return ok(views.html.auth.login.render("Login", formAuth));
    }

    public static Result getConsoleLogin() {
        if (session().get("user") != null) {
            return redirect("/");
        }
        Form<Forms.Login> formAuth = Form.form(Forms.Login.class);
        return ok(views.html.auth.console_login.render("Login", formAuth));
    }

    public static Result getSwiftLogin() {
        if (session().get("user") != null) {
            return redirect("/");
        }
        Form<Forms.Login> formAuth = Form.form(Forms.Login.class);
        return ok(views.html.auth.login_swift.render("Swift Login", formAuth));
    }


    public static Result getRegister() {
        if (session().get("user") != null && session().get("role").equals(core.security.AuthServices.ROLE_CUSTOMER)) {
            return redirect("/");
        }
        Form<Users> formAuth = Form.form(Users.class);
        return ok(views.html.auth.register.render("Create Account", formAuth));
    }

    @RequireCSRFCheck
    public static Result postLogin() {
        Form<Forms.Login> form = Form.form(Forms.Login.class).bindFromRequest();
        String redirectUrl = form.get().redirectUrl;
        String returnUrl = null;
        DynamicForm dynamicForm = DynamicForm.form().bindFromRequest();
        ObjectNode response = Json.newObject();
        if (form.hasErrors()) {
            response.put("status", "0");
            response.put("desc", "invalid input field");
        }
        Users users = null;
        try {
            users = AuthServices.authenticateUser(form.get().email, form.get().password);
            if (users.status.equals(models.Status.Inactive)) {
                getLogout();
                response.put("status", 0);
                response.put("desc", "Your account has been deactivated. Please contact support@travelfix.co for help.");
            } else {
                if (dynamicForm.get("u_cat") != null) {
                    if (!Objects.equals(users.role_code.level, Auth.ROLE_LEVEL_CUSTOMER)) {
                        response.put("status", 0);
                        response.put("desc", "Invalid account details. Access restricted.");
                        return ok(response);
                    }
                }
                new UtilCache().clearCache();
                session().put("email", users.email);
                session().put("user", users.id.toString());
                session().put("role", users.role_code.role_code);
                session().put("role_level", users.role_code.level.toString());

                //allow the session to persist, and hey!!! system should relax...lol
                Thread.sleep(100);

                response.put("status", 1);
                response.put("desc", "Login successful, please wait while page reload");

                if (users.role_code.level == 1) {
                    returnUrl = controllers.console.routes.ApplicationController.index().toString();
                } else if (users.role_code.level == 2) {
                    returnUrl = "/b2b/flight";
                } else if (users.role_code.level == 3) {
                    returnUrl = "/";
                } else {
                    returnUrl = "/";
                }

                if (users.is_verify.equals(YesNoEnum.No)) {
//                    returnUrl = controllers.routes.UserController.getCompleteProfile().toString();
                }

                if (redirectUrl != null) {
                    returnUrl = redirectUrl;
                }

                Audits.saveAuditTrail(users.id, "Login", users.first_name + " " + users.last_name + " of role " + users.role_code.role_title + " login on " + new Date().toLocaleString(), AuditTrailCategory.Login, AuditActionType.User);
                response.put("url", returnUrl);
            }
        } catch (NullPointerException | InterruptedException e) {
            session().remove("email");
            session().remove("user");
            session().remove("role");
            session().remove("role_level");
            response.put("status", 0);
            if (e instanceof NullPointerException) {
                response.put("desc", "Incorrect email address and password");
            } else {
                response.put("desc", "Your request could not be processed. Please try again.");
            }
        }
        return ok(response);
    }

    public static Result getLogout() {
        String redirect = "/";
        if (request().getQueryString("redirect") != null) {
            redirect = request().getQueryString("redirect");
        }
        session().remove("email");
        session().remove("user");
        session().remove("user_role");
        session().clear();
        response().discardCookie("u_token");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        flash().put("success", "you have logged out successfully");
        return redirect(redirect);
    }

    @RequireCSRFCheck
    public static Result postRegister() {
        String actionType = DynamicForm.form().bindFromRequest().get("action_type");
        Form<Users> form = Form.form(Users.class).bindFromRequest();
        String redirectUrl = controllers.routes.AuthenticationController.getLogin().toString();
        ObjectNode response = Json.newObject();
        Users users = null;
        if (actionType != null && actionType.equals("swift")) { //swift registration
            Form<B2bUsers> affiliateUsersForm = Form.form(B2bUsers.class).bindFromRequest();
            if (!DynamicForm.form().bindFromRequest().get("password").equals(DynamicForm.form().bindFromRequest().get("retype_password"))) {
                flash().put("error", "Password did not match.");
                return badRequest(views.html.auth.swift_register.render(form, affiliateUsersForm));
            } else if (form.hasErrors() || affiliateUsersForm.hasErrors()) {
                return badRequest(views.html.auth.swift_register.render(form, affiliateUsersForm));
            } else {
                users = AuthServices.createUserAccount(form.get(), affiliateUsersForm.bindFromRequest().get());
                if (users == null) {
                    return badRequest(views.html.auth.swift_register.render(form, affiliateUsersForm));
                }
                redirectUrl = controllers.routes.AuthenticationController.getSwiftLogin().toString();
                flash().put("success", "Affiliate Created Successfully. Please Check your email to Verify Account");
                return redirect(redirectUrl);
            }
        } else if (actionType != null && actionType.equals("customer")) {
            if (form.hasErrors()) {
                response.put("status", "0");
                response.put("desc", "invalid input field");
            }
            users = AuthServices.createUserAccount(form.get());
            if (users == null) {
                response.put("status", 0);
                response.put("desc", "Your request could not be processed. Please try again.");
                return ok(response);
            }
            response.put("url", redirectUrl);
            response.put("status", 1);
            response.put("desc", "Registration successful, please wait while page reload");
            return ok(response);
        }
        return ok("Invalid Form");
    }

    public static Result getCheckEmailAjax(String email) {
        Users u = Users.find.where().eq("email", email).findUnique();
        if (u == null) {
            responseJson.put("status", true); // email is avaiable
        } else {
            responseJson.put("status", false); //email has been taken by another customer
        }
        return ok(responseJson);
    }

    public static Result getNewPassword(String token) {
        Users user = Users.find.where().eq("pwd_reset_code", token).findUnique();
        if (user == null) {
            flash().put("error", "Invalid reset code. Please try again.");
            return redirect(controllers.routes.AuthenticationController.getForgetPassword());
        }
        return ok(views.html.auth.new_password.render(user));
    }

    public static Result postNewPassword() {
        DynamicForm formInput = DynamicForm.form().bindFromRequest();
        String email = formInput.get("u_email");
        try {
            AuthServices.saveResetPassword(email, formInput.get("password"));
            flash().put("success", "Password Reset Successfully");
            return redirect(controllers.routes.AuthenticationController.getLogin());
        } catch (Exception e) {
            flash().put("error", "Password Reset failed");
            return redirect(controllers.routes.AuthenticationController.getForgetPassword());
        }
    }

    public static Result getAccountActivation(String token) {
        Users user = Users.find.where().eq("activation_token", token).findUnique();
        if (user == null) {
            flash("error", "Invalid user account specified for activation. Please contact console for more information");
            return redirect(controllers.routes.AuthenticationController.getLogin());
        } else {
            user.activation_token = null;
            user.status = models.Status.Active;
            user.first_time_login = YesNoEnum.No;
            user.is_verify = YesNoEnum.Yes;
            user.update();
            flash("success", "You account has been activated successfully. Please login to continue");
            return redirect(controllers.routes.AuthenticationController.getLogin());
        }
    }

    public static Result generateToken() {
        Form<Forms.GenerateAdminToken> formToken = Form.form(Forms.GenerateAdminToken.class);
        AdminUserTokens adminUserTokens = new AdminUserTokens();
        adminUserTokens.token_code = Long.toString(Crypt.random().nextLong());
        adminUserTokens.admin_user_id = Users.find.byId(Long.parseLong(session("user")));
        adminUserTokens.status = models.Status.Active;
        adminUserTokens.save();
        return ok(views.html.console.token.render(formToken));
    }

    @RequireCSRFCheck
    public static Result postTokenAuth() {
        Form<Forms.GenerateAdminToken> formToken = Form.form(Forms.GenerateAdminToken.class).bindFromRequest();
        if (formToken.hasErrors()) {
            flash("error", "OTP token is required.");
            return badRequest(views.html.console.token.render(formToken));
        }
        Boolean isSuccessful = core.Secured.adminTokenAuth(formToken.get().otp_token, session("user"));
        if (isSuccessful) {
            flash("admin_success", "Login Successfully");
            return redirect(controllers.console.routes.ApplicationController.index());
        } else {
            return REDIRECT_BACK();
        }
    }

    public static Result getFbAuthenticate() {
        final String fbToken = Configuration.root().getString("app.fb.appId");
        FacebookClient fbClient = new DefaultFacebookClient();
        return ok("Facebook authenticate");
    }

    public static Result getGooglePlus() {
        return ok("Google+ authenticate");
    }

    public static Result getRegisterAffiliateAccount() {
        Form<Users> usersForm = Form.form(Users.class);
        Form<B2bUsers> agentForm = Form.form(B2bUsers.class);
        return ok(views.html.auth.swift_register.render(usersForm, agentForm));
    }

    public static Result getForgetPassword() {
        Form<Forms.Login> formReset = Form.form(Forms.Login.class);
        return ok(views.html.auth.forget_password.render(formReset));
    }

    public static Result postForgetPassword() {
        DynamicForm formReset = DynamicForm.form().bindFromRequest();
        if (formReset.get("email") == null) {
            responseJson.put("status", 0);
            responseJson.put("desc", "Email field not specified.");
        } else {
            //send a password reset to the customer.
            Users user = Users.find.where().eq("email", formReset.get("email")).findUnique();
            if (user == null) {
                responseJson.put("status", 0);
                responseJson.put("desc", "Email address does not exists");
            } else {
                user.pwd_reset_code = generateSalt();
                user.update();
                Mailer.sendMail(new Mailer.Envelop(user.email, views.html.emails.password_reset.render(user).body(), user.email));
                responseJson.put("status", 1);
                responseJson.put("desc", "Password reset sent successfully");
            }
        }
        return ok(Json.toJson(responseJson));
    }

    public static Result postSocialRegistration(String socialMedia) {
        DynamicForm postVal = DynamicForm.form().bindFromRequest();
        Users userAuth = Users.find.where().raw("social_media ='" + socialMedia + "' AND social_media_id = '" + postVal.get("social_media_id") + "' OR email = '" + postVal.get("email") + "'").findUnique();
        if (userAuth == null) {
            //register the user.
            userAuth = new Users();
            userAuth.email = postVal.get("email");
            userAuth.social_media_id = postVal.get("social_media_id");
            userAuth.social_media = socialMedia;
            userAuth.first_name = postVal.get("first_name");
            userAuth.last_name = postVal.get("last_name");
            userAuth.gender = Users.Genders.valueOf(postVal.get("gender").toUpperCase());

            //that mean the user has a display picture.
//            if (Objects.equals(postVal.get("is_silhouette"), false)) {
            userAuth.avatar_url = postVal.get("avatar_url");
//            }
            userAuth.created_at = new Date();
            AuthServices.createUserAccount(userAuth);
            userAuth = AuthServices.authenticateUser(postVal.get("email"));
            new UtilCache().clearCache();
            session().put("email", userAuth.email);
            session().put("user", userAuth.id.toString());
            session().put("role", userAuth.role_code.role_code);
            session().put("role_level", userAuth.role_code.level.toString());
        } else {
            //login
            userAuth = AuthServices.authenticateUser(postVal.get("email"));
            new UtilCache().clearCache();
            session().put("email", userAuth.email);
            session().put("user", userAuth.id.toString());
            session().put("role", userAuth.role_code.role_code);
            session().put("role_level", userAuth.role_code.level.toString());
        }
        if (userAuth != null) {
            responseJson.put("status", 1);
        } else {
            responseJson.put("status", 0);
        }
        return ok(Json.toJson(responseJson));
    }

    public static F.Promise<Result> ssoIDCallback() {
        final F.Promise<UserInfo> userInfoPromise = OpenID.verifiedId();
        final F.Promise<Result> resultPromise = userInfoPromise.map(new F.Function<UserInfo, Result>() {
            @Override
            public Result apply(UserInfo userInfo) {
                return ok(userInfo.id() + "\n" + userInfo.attributes());
            }
        }).recover(new F.Function<Throwable, Result>() {
            @Override
            public Result apply(Throwable throwable) throws Throwable {
                Form<Forms.Login> usersForm = new Form<>(Forms.Login.class);
                return badRequest(views.html.auth.login.render("Login", usersForm));
            }
        });

        return resultPromise;
    }
}
