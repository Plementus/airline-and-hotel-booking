package controllers.swift;

import controllers.abstracts.SecuredSwiftController;
import play.mvc.Result;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 12/2/15 3:12 PM
 * |
 **/

public class ApplicationController extends SecuredSwiftController {

    public static Result getIndex() {
        return ok(views.html.swift.become_an_affiliate_agent.render());
    }

    public static Result getDashboard() {
        return ok(views.html.swift.dashboard.render());
    }

    public static Result getAccountSettings() {
        return ok(views.html.swift.account_settings.render());
    }

    public static Result postUpdateProfile() {
        return ok();
    }

}
