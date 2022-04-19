package controllers.console;

import core.Constants;
import core.Utilities;
import com.avaje.ebean.Ebean;
import com.avaje.ebean.ExpressionList;
import controllers.abstracts.SecuredConsoleController;
import models.*;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.Http;
import play.mvc.Result;

import java.io.File;
import java.util.List;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/9/15 3:05 PM
 * |
 **/

public class SupportController extends SecuredConsoleController {

    public static Result getIndex() {
        ExpressionList<SupportTickets> support = SupportTickets.find.where();
        List<Users> customers = Users.find.findList(); //Users.find.where().eq("role_code", Roles.find.byId(User.ROLE_ADMIN)).findList();
        return ok(views.html.console.support.index.render(support, customers));
    }

    public static Result getTickets(String status) {
        List<SupportTickets> tickets = SupportTickets.find.all();
        if (status != null) {
            tickets = SupportTickets.find.where().eq("status", SupportStatus.valueOf(status)).findList();
        }
        return ok(views.html.console.support.admin_tickets.render(tickets));
    }

    public static Result getCreateTicket(Long id) {
        Form<SupportTickets> supportTicketsForm = Form.form(SupportTickets.class);
        List<Users> users = Users.find.findList(); //Users.find.where().eq("role_code", Roles.find.byId(User.ROLE_ADMIN)).findList();
        return ok(views.html.console.support.admin_create_ticket.render(supportTicketsForm, users));
    }

    public static Result postCreateTicket() {
        Form<SupportTickets> supportTicketsForm = Form.form(SupportTickets.class);
        if (supportTicketsForm.hasErrors() || supportTicketsForm.hasGlobalErrors()) {
            responseJson.put("status", 0);
            responseJson.put("desc", "Invalid form input field");
            return ok(Json.toJson(responseJson));
        }
        SupportTickets ticketsInput = supportTicketsForm.bindFromRequest().get();
        Ebean.beginTransaction();
        try {
            //Firstly, handle the file upload process.
            Http.MultipartFormData formData = request().body().asMultipartFormData();
            DataBank dataBank = null;
            if (formData.getFile("attachment") != null) {
                Http.MultipartFormData.FilePart filePart = formData.getFile("attachment");
                File fileUpload = filePart.getFile();
                String newFileName = Utilities.generateAlphaNumeric()+fileUpload.getName();
                System.err.println("System: " + Constants.PUBLIC_PATH + "data_bank/" + newFileName);
                fileUpload.renameTo(new File(Constants.PUBLIC_PATH + "data_bank/" + newFileName)); //move the file to a permanent location.
            }

            //Secondly create the support ticket
            ticketsInput.save();

            String message = DynamicForm.form().bindFromRequest().get("message");
            SupportMessages supportMessage = new SupportMessages();
            supportMessage.support_ticket_id = ticketsInput;
            supportMessage.message = message;
            supportMessage.sender_user_id = ticketsInput.actor_user_id;
            supportMessage.save();

            Ebean.commitTransaction();
        } catch (Exception e) {
            Ebean.rollbackTransaction();
            responseJson.put("status", 0);
            responseJson.put("desc", "Unexpected error occured, please try again.");
            return ok(Json.toJson(responseJson));
        }
        return ok("Everything os ok");
    }

    public static Result getViewTicket(Long ticketId) {
        return ok();
    }
}
