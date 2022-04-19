package controllers.console;

import controllers.abstracts.SecuredConsoleController;
import models.FlightBookings;
import play.libs.F;
import play.mvc.Result;

import java.util.List;

/**
 * Created by Ibrahim Olanrewaju. on 1/23/16 6:41 PM.
 */
public class TransactionController extends SecuredConsoleController {

    public static F.Promise<Result> getTransRefDetails(String transRef) {
        return F.Promise.promise(() -> {

            return ok();
        });
    }
}
