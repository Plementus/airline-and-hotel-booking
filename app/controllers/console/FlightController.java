package controllers.console;

import com.avaje.ebean.Expr;
import controllers.abstracts.SecuredConsoleController;
import models.FlightBookingStatus;
import models.FlightBookings;
import play.libs.Json;
import play.mvc.Result;

import java.util.List;

/**
 * Created by Ibrahim Olanrewaju. on 1/23/16 6:41 PM.
 */
public class FlightController extends SecuredConsoleController {


    public static Result getQueues() {
        List<FlightBookings> flightBookings = FlightBookings.find.order().desc("id").where().findList();
        if (request().getQueryString("source") != null && request().getQueryString("source").equals("dTable")) {
            return ok(views.html.console.flight._queueTable.render(flightBookings))
                    .as("application/json");
//            return ok(views.html.console.flight._queueTable.render(flightBookings));
        }
        return ok(views.html.console.flight.queues.render(flightBookings));
    }

    public static Result getViewItinerary(Long id, String source) {
        return ok(views.html.console.flight.view_itinerary.render(FlightBookings.find.byId(id), source));
    }
}
