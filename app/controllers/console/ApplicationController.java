/********************************************/
//	6/12/15 5:28 PM - Ibrahim Olanrewaju.
/********************************************/
package controllers.console;

import com.avaje.ebean.Ebean;
import controllers.abstracts.SecuredConsoleController;
import core.Notification;
import core.Utilities;
import models.Notifications;
import models.PaymentMethods;
import models.Users;
import org.springframework.format.datetime.joda.LocalDateParser;
import play.Logger;
import play.mvc.Result;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


public class ApplicationController extends SecuredConsoleController {

    public static Result index() {
        List<PaymentMethods> paymentMethodsList;
        List<Notifications> notificationsList = Notifications.find.all();
        if (request().getQueryString("from") != null && request().getQueryString("to") != null) {
            Date departureDate = Utilities.parseDateOnly(request().getQueryString("from")).getTime();
            Date arrivalDate = Utilities.parseDateOnly(request().getQueryString("to")).getTime();
            paymentMethodsList = PaymentMethods.find.fetch("paymentHistoriesList").where().between("created_at", departureDate, arrivalDate).findList();
        } else {
            paymentMethodsList = PaymentMethods.find.fetch("paymentHistoriesList").findList();
           // paymentMethodsList = PaymentMethods.find.findList();
        }
        return ok(views.html.console.index.render(paymentMethodsList, notificationsList));
    }

}