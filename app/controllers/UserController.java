package controllers;

import controllers.abstracts.BaseController;
import controllers.abstracts.SecuredCustomerController;
import models.Users;
import play.mvc.Result;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/17/15 9:40 AM
 * |
 **/

public class UserController extends SecuredCustomerController {

    public static Result getIndex() {
        return ok("Update profile");
    }

    public static Result getCompleteProfile() {
        Users user = Users.find.byId(Long.parseLong(userId));
        return ok(views.html.user.update_profile.render(user));
    }

    public static Result getUserDashboard() {
        Users user = Users.find.byId(Long.parseLong(userId));
        return ok(views.html.user.manage_booking.render(user));
    }

}