package controllers.console;

import controllers.abstracts.SecuredConsoleController;
import core.security.Auth;
import models.FlightMarkUpDownRules;
import play.data.Form;
import play.libs.F;
import play.mvc.Result;
import java.util.List;
import views.html.console.mark_updown_rule.*;

/**
 * Created by
 * Ibrahim Olanrewaju. on 24/04/2016 8:30 PM.
 */
public class FlightMarkUpDownRuleController extends SecuredConsoleController {

    public static F.Promise<Result> getIndex() {
        return F.Promise.promise(() -> {
            List<FlightMarkUpDownRules> flightMarkUpDownRules = FlightMarkUpDownRules.find.order().desc("id").findList();
            return ok(index.render(flightMarkUpDownRules));
        });
    }

    public static F.Promise<Result> getCreate() {
        return F.Promise.promise(() -> {
            FlightMarkUpDownRules flightMarkUpDownRules = new FlightMarkUpDownRules();
            Form<FlightMarkUpDownRules> airlineIncentiveForm = Form.form(FlightMarkUpDownRules.class).fill(flightMarkUpDownRules);
            return ok(create.render(airlineIncentiveForm));
        });
    }

    public static F.Promise<Result> getEdit(Long id) {
        return F.Promise.promise(() -> {
            FlightMarkUpDownRules flightMarkUpDownRules = FlightMarkUpDownRules.find.byId(id);
            if (flightMarkUpDownRules.trip_types != null) {
                flightMarkUpDownRules.formTripTypes = flightMarkUpDownRules.trip_types.split("<<>>");
            }
             if (flightMarkUpDownRules.cabin_classes != null) {
                flightMarkUpDownRules.formCabinClasses = flightMarkUpDownRules.cabin_classes.split("<<>>");
            }
            if (flightMarkUpDownRules.departure_airports != null) {
                flightMarkUpDownRules.formDepartureAirports = flightMarkUpDownRules.departure_airports.split("<<>>");
            }
            if (flightMarkUpDownRules.arrival_airports != null) {
                flightMarkUpDownRules.formDepartureAirports = flightMarkUpDownRules.arrival_airports.split("<<>>");
            }
            Form<FlightMarkUpDownRules> markupForm = Form.form(FlightMarkUpDownRules.class).fill(flightMarkUpDownRules);
            return ok(edit.render(markupForm));
        });
    }

    public static F.Promise<Result> postCreate() {
        return F.Promise.promise(() -> {
            Form<FlightMarkUpDownRules> form = Form.form(FlightMarkUpDownRules.class).bindFromRequest();
            if (form.hasErrors()) {
                return badRequest(create.render(form));
            }
            FlightMarkUpDownRules flightMarkUpDownRules = form.get();
            flightMarkUpDownRules.auth_user_id = Auth.user();
            if (flightMarkUpDownRules.formTripTypes != null && flightMarkUpDownRules.formTripTypes.length != 0) {
                String tType = "";
                for (String tripType : flightMarkUpDownRules.formTripTypes) {
                    tType = tType + tripType + "<<>>";
                }
                flightMarkUpDownRules.trip_types = tType;
            }
            if (flightMarkUpDownRules.formCabinClasses != null && flightMarkUpDownRules.formCabinClasses.length != 0) {
                String cabin = "";
                for (String cabinClass : flightMarkUpDownRules.formCabinClasses) {
                    cabin = cabin + cabinClass + "<<>>";
                }
                flightMarkUpDownRules.cabin_classes = cabin;
            }
            if (flightMarkUpDownRules.formDepartureAirports != null && flightMarkUpDownRules.formDepartureAirports.length != 0) {
                String dep = "";
                for (String departure : flightMarkUpDownRules.formDepartureAirports) {
                    dep = dep + departure + "<<>>";
                }
                flightMarkUpDownRules.departure_airports = dep;
            }
            if (flightMarkUpDownRules.formArrivalAirports != null && flightMarkUpDownRules.formArrivalAirports.length != 0) {
                String arr = "";
                for (String arrival : flightMarkUpDownRules.formArrivalAirports) {
                    arr = arr + arrival + "<<>>";
                }
                flightMarkUpDownRules.arrival_airports = arr;
            }
//            if (!flightMarkUpDownRules.flight_mark_up_down_pricing_id.apply_coupon) {
//                flightMarkUpDownRules.flight_mark_up_down_pricing_id.coupon_id = null;
//            }
            flightMarkUpDownRules.auth_user_id = Auth.user();
            flightMarkUpDownRules.insert();
            flash().put("success", "Markup Rule Created Successfully.");
            return redirect(routes.FlightMarkUpDownRuleController.getIndex());
        });
    }


    public static F.Promise<Result> getDelete(Long id) {
        return F.Promise.promise(() -> {
            FlightMarkUpDownRules.find.byId(id).delete();
            flash().put("success", "Flight Rule deleted Successfully");
            return redirect(routes.FlightMarkUpDownRuleController.getIndex());
        });
    }

    public static F.Promise<Result> getViewPriceInfo(Long id) {
        return F.Promise.promise(() -> {
            FlightMarkUpDownRules flightMarkUpDownRules = FlightMarkUpDownRules.find.byId(id);
            return ok(price_info.render(flightMarkUpDownRules));
        });
    }
}