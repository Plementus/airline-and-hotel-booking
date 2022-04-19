package controllers.api;

import com.avaje.ebean.ExpressionList;
import controllers.abstracts.BaseController;
import core.ControlPanel;
import core.ControlPanelMeta;
import models.*;
import org.w3c.dom.Document;
import play.cache.Cache;
import play.libs.F;
import play.libs.Json;
import play.libs.ws.WS;
import play.mvc.Result;

import java.util.Currency;
import java.util.List;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/20/15 1:53 AM
 * |
 **/

public class APISystemController extends BaseController {


    public static Result getCountries() {
        List<Countries> countries = (List<Countries>) Cache.get("countries");
        return ok(Json.toJson(countries));
    }

    public static F.Promise<Result> getCurrencies(String code) {
        return F.Promise.promise(() -> {
            if (code == null) {
                return ok(Json.toJson(Currencies.getCurrencies()));
            } else {
                return ok(Json.toJson(Currencies.find.where().eq("code", code).findUnique()));
            }
        });
    }

    public static F.Promise<Result> getNearByAirports(double latitude, double longitude) {
        F.Promise<Result> resp = WS.url("https://airport.api.aero/airport/nearest/" + latitude + "/" + longitude
                + "?user_key=0401e52b21b72486b50d489aae6b02fc").execute().map(wsResponse -> {
//            Document json = wsResponse.asXml();
            return ok(wsResponse.asJson());
        });
        return resp;
    }

    public static F.Promise<Result> getAirports(final String airportCode) {
        return F.Promise.promise(() -> {
            if (airportCode != null) return ok(Json.toJson(Airports.getAirports(airportCode)));
            else {
                return ok(Json.toJson(Airports.getAirports()));
            }
        });
    }

    public static Result getStates(Long countryId) {
        if (countryId == 0) {
            return ok(Json.toJson((List<States>) Cache.get("states")));
        } else {
            return ok(Json.toJson(States.find.where().eq("country_id", Countries.find.byId(countryId)).findList()));
        }
    }

    public static Result postCurrencyConversationRate(String currencyCode) {
        responseJson.put("status", 1);
        responseJson.put("value", Double.parseDouble(ControlPanel.getInstance().getMetaValue(ControlPanelMeta.usd_conversion_rate)));
        return ok(Json.toJson(responseJson));
    }

    public static Result getCities() {
        return ok(Json.toJson(Cities.find.all()));
    }
}
