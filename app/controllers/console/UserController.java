package controllers.console;

import core.security.AuthServices;
import core.Utilities;
import controllers.abstracts.SecuredConsoleController;
import models.Roles;
import models.Users;
import play.data.Form;
import play.libs.Json;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.List;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 10/10/15 2:04 PM
 * |
 **/

public class UserController extends SecuredConsoleController {

    public static Result getIndex(String userCategory) {
        List<Users> users = Users.find.order().desc("id").findList();
        if (userCategory != null && userCategory.equalsIgnoreCase("role_customer")) {
            users = Users.find.where().eq("role_code", Roles.find.byId(AuthServices.ROLE_CUSTOMER)).order().desc("id").findList();
        } else if (userCategory != null && userCategory.equalsIgnoreCase("console")) {
            users = Users.find.where().in("role_code", Roles.find.where().eq("level", 1).findList()).order().desc("id").findList();
        }
        return ok(views.html.console.user.index.render(users));
    }

    public static Result getCreate(Long id) {
        System.err.print("Generate: " + Utilities.generateAlphaNumeric() + " \n");
        Users user = new Users();
        if (id != 0) {
//            user = new Model.Finder<Long, Forms.CreateUser>(Long.class, Forms.CreateUser.class).byId(id);
        }
        Form<Users> usersForm = Form.form(Users.class).fill(user);
        return ok(views.html.console.user.create.render(usersForm));
    }

    public static Result getUserGroup() {
        List<Roles> rolesList;
        rolesList = Roles.find.findList();
        if (request().getQueryString("source") != null && request().getQueryString("source").equals("ajax")) {
            List<String[]> data = new ArrayList<>();
            for (Roles role : rolesList) {
                String[] record = new String[5];
                record[0] = role.role_code;
                record[1] = role.role_title;
                record[2] = role.level.toString();
                record[3] = "N/A";//String.valueOf(role.users.size());
                if (role.level != 1) {
                    record[4] = "<a href=\"" + controllers.console.routes.UserController.getCreateGroup(role.role_code) + "\" class=\"btn btn-xs btn-primary\">Edit Role</a>";
                } else {
                    record[4] = "<a class=\"btn btn-xs btn-primary disabled\" disabled=\"disabled\">Edit Role</a>";
                }
                data.add(record);
            }
            responseJson.put("data", Json.toJson(data));
            return ok(responseJson);
        }
        String[] fields = {"Role Code", "Role Title", "Level",  "Number of Users", ""};
        return ok(views.html.helpers._data_table.render("User Groups", fields));
    }

    public static Result getCreateGroup(String roleCode) {
        Roles roles = new Roles();
        if (roleCode != null) {
            roles = Roles.find.byId(roleCode);
        }
        Form<Roles> roleForm = Form.form(Roles.class).fill(roles);
        return ok(views.html.console.user.create_role.render(roleForm));
    }

    public static Result postCreateGroup() {
        Form<Roles> usersForm = Form.form(Roles.class).bindFromRequest();
        if (usersForm.hasErrors()) {
            return badRequest(views.html.console.user.create_role.render(usersForm));
        }
        Roles role = usersForm.get();
        role.role_code = role.role_title.replaceAll(" ", "_").toUpperCase().toString();
        role.insert();
        if (role != null) {
            flash("success", "Group/Role Saved Successfully");
            return redirect(controllers.console.routes.UserController.getUserGroup());
        } else {
            flash("error", "Request could not be processed, please try again.");
            return badRequest(views.html.console.user.create_role.render(usersForm));
        }
    }

    public static Result postCreate() {
        Form<Users> usersForm = Form.form(Users.class).bindFromRequest();
        if (usersForm.hasErrors()) {
            return badRequest(views.html.console.user.create.render(usersForm));
        }
        if (AuthServices.createUserAccount(usersForm.get()) != null) {
            flash("success", usersForm.get().first_name.concat(" ").concat(usersForm.get().last_name).concat(" account has been created successfully. A verification email has been sent to the user to account activation"));
            return redirect(controllers.console.routes.UserController.getIndex(null));
        } else {
            flash("error", "Request could not be processed, please try again.");
            return badRequest(views.html.console.user.create.render(usersForm));
        }
    }

    public static Result getAuditTrails() {

        return ok(views.html.console.user.audit_trails.render());
    }
}
