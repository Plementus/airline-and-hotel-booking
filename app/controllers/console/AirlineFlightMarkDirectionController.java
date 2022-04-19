package controllers.console;

import controllers.abstracts.SecuredConsoleController;
import core.security.Auth;
import models.AirlineFlightMarkUpDown;
import models.AirlineIncentives;
import models.FlightMarkUpDownRules;
import play.data.Form;
import play.libs.F;
import play.mvc.Result;
import views.html.console.airline_flight_mark_updown.*;

import java.util.List;

/**
 * Created by
 * Ibrahim Olanrewaju. on 27/04/2016 1:56 AM.
 */
public class AirlineFlightMarkDirectionController extends SecuredConsoleController {

    public static F.Promise<Result> getIndex(Long ruleId) {
        return F.Promise.promise(() -> {
            List<AirlineFlightMarkUpDown> airlineFlightMarkUpDownList = AirlineFlightMarkUpDown.find.all();
            return ok(index.render(airlineFlightMarkUpDownList));
        });
    }

    public static F.Promise<Result> getCreate(Long id, Long ruleId) {
        return F.Promise.promise(() -> {
            AirlineFlightMarkUpDown airlineFlightMarkUpDown = new AirlineFlightMarkUpDown();
            if (ruleId != 0) {
                airlineFlightMarkUpDown.flight_markup_down_rule_id = FlightMarkUpDownRules.find.byId(ruleId);
            }
            Form<AirlineFlightMarkUpDown> airlineFlightMarkUpDownForm = Form.form(AirlineFlightMarkUpDown.class).fill(airlineFlightMarkUpDown);
            return ok(create.render(airlineFlightMarkUpDownForm));
        });
    }

    public static F.Promise<Result> postCreate() {
        return F.Promise.promise(() -> {
            Form<AirlineFlightMarkUpDown> airlineFlightMarkUpDownForm = Form.form(AirlineFlightMarkUpDown.class).bindFromRequest();
            if (airlineFlightMarkUpDownForm.hasErrors()) {
                return badRequest(create.render(airlineFlightMarkUpDownForm));
            }
            AirlineFlightMarkUpDown airlineFlightMarkUpDown = airlineFlightMarkUpDownForm.get();
            if(AirlineFlightMarkUpDown.find.where().eq("airline_incentive_id", airlineFlightMarkUpDown.airline_incentive_id).where().eq("flight_markup_down_rule_id", airlineFlightMarkUpDown.flight_markup_down_rule_id).findUnique() != null) {
                flash().put("error", "Select markup rule has already been defined for selected airline incentive.");
                return badRequest(create.render(airlineFlightMarkUpDownForm));
            }
            if (airlineFlightMarkUpDown.formCurrency != null && airlineFlightMarkUpDown.formCurrency.length != 0) {
                String c = "";
                for (String currency : airlineFlightMarkUpDown.formCurrency) {
                    c = c + currency + "<<>>";
                }
                airlineFlightMarkUpDown.currencies = c;
            }
            FlightMarkUpDownRules ruleId = airlineFlightMarkUpDown.flight_markup_down_rule_id;
            AirlineIncentives incentiveId = airlineFlightMarkUpDown.airline_incentive_id;
            airlineFlightMarkUpDown.airline_incentive_id = incentiveId;
            airlineFlightMarkUpDown.flight_markup_down_rule_id = ruleId;
            airlineFlightMarkUpDown.auth_user_id = Auth.user();
            airlineFlightMarkUpDown.insert();
            flash().put("success", "Airline Commission Created Successfully. This will be effected on flight search result.");
            return redirect(routes.AirlineFlightMarkDirectionController.getIndex(0));
        });
    }

    public static F.Promise<Result> getDelete(Long id) {
        return F.Promise.promise(() -> {

            return ok();
        });
    }
}