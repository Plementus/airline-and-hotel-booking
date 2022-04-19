package controllers.swift;

import core.security.Auth;
import core.security.AuthServices;
import controllers.abstracts.SecuredSwiftController;
import models.B2bMarkups;
import models.B2bSubUsers;
import models.B2bUsers;
import models.Users;
import play.data.Form;
import play.filters.csrf.AddCSRFToken;
import play.filters.csrf.RequireCSRFCheck;
import play.mvc.Result;

import java.util.List;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 14/12/2015 5:50 PM
 * |
 **/
public class UserController extends SecuredSwiftController {

    public static Result getIndex() {
//        List<B2bSubUsers> usersList = B2bSubUsers.find.where().eq("b2b_user_id", B2bUsers.find.where().eq("user_id", new AUTH().user()).findUnique()).findList();
        List<B2bSubUsers> usersList = B2bUsers.find.where().eq("user_id", Auth.user()).findUnique().b2bSubUsers;
        return ok(views.html.swift.user_list.render(usersList));
    }

    @AddCSRFToken
    public static Result getCreateUser(Long id) {
        B2bSubUsers subUsers = new B2bSubUsers();
        B2bMarkups b2bMarkups = new B2bMarkups();
        if (id != 0) {
            subUsers = B2bSubUsers.find.byId(id);
            b2bMarkups = B2bMarkups.find.where().eq("user_id", subUsers.user_id).findUnique();
        }
        Form<B2bSubUsers> form = Form.form(B2bSubUsers.class).fill(subUsers);
        Form<B2bMarkups> b2bMarkupsForm = Form.form(B2bMarkups.class).fill(b2bMarkups);
        return ok(views.html.swift.create_user.render(form, b2bMarkupsForm));
    }

    @RequireCSRFCheck
    public static Result postCreateUser() {
        Form<B2bSubUsers> form = Form.form(B2bSubUsers.class).bindFromRequest();
        Form<B2bMarkups> b2bMarkupsForm = Form.form(B2bMarkups.class).bindFromRequest();
        if (form.hasErrors() || b2bMarkupsForm.hasErrors()) {
            return badRequest(views.html.swift.create_user.render(form, b2bMarkupsForm));
        }
        Users users = AuthServices.createUserAccount(form.get().user_id, form.get(), b2bMarkupsForm.get());
        if (users != null) {
            flash().put("success", "Affiliate Agent Account Created Successfully");
        } else {
            flash().put("error", "Request failed, please try again.");
        }
        return redirect(controllers.swift.routes.UserController.getIndex());

    }
}
