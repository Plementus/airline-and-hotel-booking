package controllers;

import controllers.abstracts.BaseController;
import controllers.abstracts.SecuredCustomerController;
import models.SupportTickets;
import play.data.Form;
import play.mvc.Result;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/8/15 4:17 AM
 * |
 **/

public class SupportController extends SecuredCustomerController {

    public static Result getIndex() {
        java.util.ArrayList list;
        return ok();
    }

    public static Result getCreateTicket(Long id) {
        SupportTickets supportTickets = new SupportTickets();
        if (id != null) {
            supportTickets = SupportTickets.find.byId(id);
        }
        Form<SupportTickets> supportTicketsForm = Form.form(SupportTickets.class).fill(supportTickets);
        return ok();
    }

    public static Result postCreateTicket() {
        return ok();
    }


}