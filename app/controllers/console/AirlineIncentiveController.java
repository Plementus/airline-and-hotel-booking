package controllers.console;

import controllers.abstracts.SecuredConsoleController;
import core.security.Auth;
import models.AirlineIncentiveProp;
import models.AirlineIncentives;
import models.Status;
import play.data.Form;
import play.libs.F;
import play.mvc.Result;

import java.util.List;

import views.html.console.airline_incentives.*;

/**
 * Created by Ibrahim Olanrewaju. on 1/23/16 6:41 PM.
 */
public class AirlineIncentiveController extends SecuredConsoleController {

    public static F.Promise<Result> getIndex() {
        return F.Promise.promise(() -> {
            List<AirlineIncentives> airlineIncentives = AirlineIncentives.find.order().desc("id").findList();
            return ok(index.render(airlineIncentives));
        });
    }

    public static F.Promise<Result> getCreate(Long id) {
        return F.Promise.promise(() -> {
            AirlineIncentives airlineIncentives = AirlineIncentives.find.byId(id);
            if (airlineIncentives == null) {
                airlineIncentives = new AirlineIncentives();
            }
            Form<AirlineIncentives> airlineIncentiveForm = Form.form(AirlineIncentives.class).fill(airlineIncentives);
            return ok(create.render(airlineIncentiveForm));
        });
    }

    public static F.Promise<Result> postCreate() {
        return F.Promise.promise(() -> {
            Form<AirlineIncentives> airlineIncentives = Form.form(AirlineIncentives.class).bindFromRequest();
            if (airlineIncentives.hasErrors()) {
                flash().put("error", "Form Input Error. Please Check Your Input.");
                return badRequest(create.render(airlineIncentives));
            }
            AirlineIncentives incentives = airlineIncentives.get();
            AirlineIncentiveProp incentiveProp = incentives.airline_incentive_prop;
            if (incentives.id == null) {
                flash().put("success", "Airline Incentive Created Successfully.");
                incentiveProp.insert();
            } else {
                incentiveProp.update();
                //loop through all the previous incentive and update as inactive.
                List<AirlineIncentives> prevInc = AirlineIncentives.find.where().eq("airline_incentive_prop", incentiveProp).findList();
                if (prevInc != null && prevInc.size() != 0) {
                    prevInc.forEach(o -> {
                        o.status = models.Status.Inactive;
                        o.delete();
                    });
                }
                flash().put("success", "Airline Incentive Updated Successfully.");
            }
            incentives.airline_incentive_prop = incentiveProp;
            incentives.status = models.Status.Active;
            incentives.auth_user_id = Auth.user();
            incentives.insert();
            return redirect(controllers.console.routes.AirlineIncentiveController.getIndex());
        });
    }

    public static F.Promise<Result> getDelete(Long id) {
        return F.Promise.promise(() -> {
            AirlineIncentives.find.byId(id).delete();
            flash().put("success", "Airline Incentive Deleted Successfully");
            return redirect(controllers.console.routes.AirlineIncentiveController.getIndex());
        });
    }

}