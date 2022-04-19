/*
 *
 *  * [BRAKET] CONFIDENTIAL
 *  * __________________
 *  *
 *  *  4/2/16 2:25 AM  [BRAKKET] Solutions
 *  *  All Rights Reserved.
 *  *
 *  * NOTICE:  All information contained herein is, and remains
 *  * the property of Brakket Solutions and its suppliers,
 *  * if any.  The intellectual and technical concepts contained
 *  * herein are proprietary to Brakket Solutions
 *  * and its suppliers and may be covered by Nigeria. and Foreign Patents,
 *  * patents in process, and are protected by trade secret or copyright law.
 *  * Dissemination of this information or reproduction of this material
 *  * is strictly forbidden unless prior written permission is obtained
 *  * from Brakket Solutions.
 *
 */

package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import controllers.abstracts.BaseController;
import controllers.interceptors.CustomerSecurityInterceptor;
import core.Cookies;
import core.cms.TemplatesManager;
import core.gdsbookingengine.booking.Passenger;
import core.security.Auth;
import models.*;
import play.Logger;
import play.data.Form;
import play.libs.F;
import play.libs.Json;
import play.libs.ws.WS;
import play.mvc.Result;
import play.mvc.Security;

import java.util.*;

import static models.AppFeatureLibraries.b2c_flight_booking_form;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/7/15 1:57 AM
 * |
 **/

public class ApplicationController extends BaseController {

    public static Result index() {
        if(request().getQueryString("gtpay") != null && request().getQueryString("gtpay").equalsIgnoreCase("true")) {
            response().setCookie("gtpay", "true");
        }
        return getPage("/");
    }

    public static Result getTestPage() {
        List<AppFormField> formFieldList = AppFormField.getFeatureFormFields(b2c_flight_booking_form);
        return ok(views.html.test_plain.render(formFieldList));
    }

    public static Result postTestForm() {
        List<Passenger> passengerList = new ArrayList<>();
        int numOfPassengers = 3;
        for (int i = 0; i < numOfPassengers; i++) {
            Passenger passenger = new Passenger();
            final int finalI = i;
            final String finalAmadeusPhoneFormat = "Amadeus Phone Number";
        }
        return ok(Json.toJson(passengerList));
    }

    public static Result getPayGTPay() {
        return ok();
    }

    /*
      | Method populate record for the dashboard, such as query DB and WS.
     */
    public static Map<String, Object> populateDashboardRecords() {
        Map<String, Object> objectMap = new HashMap<>();
        objectMap.put("user", Auth.user());
        return objectMap;
    }

    @Security.Authenticated(CustomerSecurityInterceptor.class)
    public static F.Promise<Result> getDashboard() {
        return F.Promise.promise(ApplicationController::populateDashboardRecords)
                .map(popDashboard -> ok(views.html.user.dashboard.render(popDashboard)));
    }

    public static String splitHost(String hosts){
        String host="";
       List <CmsPages> page = CmsPages.find.where().ilike("host",hosts+"%").findList();
        for(CmsPages pages : page  ){
            if(pages.host.contains(host)){
                String[] hostSplit = pages.host.split("<<>>");
                if (hostSplit.length != 0) {
                    for (String s : hostSplit) {
                        if (host.equalsIgnoreCase(s)) {
                            host = s;
                        }
                    }
                }
            }
        }
        return  host;
    }
    // Original copy
   /* public static Result getPagex(String slugUrl) {
        TemplatesManager templatesManager = new TemplatesManager();
        String uriPath = request().path();
        String host = request().host();
        CmsPages page = CmsPages.find.where().eq("slug_url", uriPath).findUnique();
        //CmsPages page = CmsPages.find.select(uriPath).where().eq("host",host).findUnique();
       // CmsPages page = CmsPages.find.select(uriPath).where().contains("host",host).findUnique();
       // CmsPages page = CmsPages.find.select(uriPath).where().eq("host",splitHost(host)).findUnique();
        // select host where the urlpath is equal to provide
        if (host.toLowerCase().contains("www.")) {
            host = host.split("www.")[1];
        }
        if (page == null)
        boolean isHostAllowed = false;
        String[] hostSplit = page.host.split("<<>>");
        if (hostSplit.length != 0){
            for (String s : hostSplit) {
                if (host.equalsIgnoreCase(s)) {
                    isHostAllowed = true;
                }
            }
        }
        templatesManager = templatesManager.parsePage(page);
        if (isHostAllowed) {
            return ok(views.html.guests.page.render(page, templatesManager));
        } else {
            return PAGE_404();
        }
    }

    public static Result getPagexx(String slugUrl) {
        CmsPages pages = null;
        TemplatesManager templatesManager = new TemplatesManager();
        String uriPath = request().path();
        String host = request().host();
        // CmsPages page = CmsPages.find.where().eq("slug_url", uriPath).findUnique();
        //List<CmsPages> page = CmsPages.find.where().eq("host",host).eq("slug_url",uriPath).findList();
        // select pages where urlpath and host
        if (host.toLowerCase().contains("www.")) {
            host = host.split("www.")[1];
        }
        List<CmsPages> page = CmsPages.find.select(slugUrl).where().eq("host",host).findList();
        if (page == null || page.size() == 0) {
            return PAGE_404();
        }
        for (CmsPages p : page){
            pages = p;
        }
        boolean isHostAllowed = false;
        String[] hostSplit = pages.host.split("<<>>");
        if (hostSplit.length != 0) {
            for (String s : hostSplit) {
                if (host.equalsIgnoreCase(s)) {
                    isHostAllowed = true;
                }
            }
        }
        templatesManager = templatesManager.parsePage(pages);
        if (isHostAllowed) {
            return ok(views.html.guests.page.render(pages, templatesManager));
        } else {
            return PAGE_404();
        }
    }*/

    public static Result getPage(String slugUrl) {
        TemplatesManager templatesManager = new TemplatesManager();
        String uriPath = request().path();
        String host = request().host();
        List<CmsPages> pages = CmsPages.find.where().eq("slug_url", uriPath).findList();
        if (host.toLowerCase().contains("www.")) {
            host = host.split("www.")[1];
        }
        CmsPages page = null;
        for (CmsPages cmsPages : pages) {
            List<String> hostList = Arrays.asList(cmsPages.host.split("<<>>"));
            page = hostList.contains(host) ? page = cmsPages : page;
        }
        if (page == null) {
            return PAGE_404();
        }
        boolean isHostAllowed = false;
        String[] hostSplit = page.host.split("<<>>");
        if (hostSplit.length != 0) {
            for (String s : hostSplit) {
                if (host.equalsIgnoreCase(s)) {
                    isHostAllowed = true;
                }
            }
        }
        templatesManager = templatesManager.parsePage(page);
        if (isHostAllowed) {
            return ok(views.html.guests.page.render(page, templatesManager));
        } else {
            return PAGE_404();
        }
    }

    public static Result getApiCall() {
        WS.url("https://gist.githubusercontent.com/tdreyno/4278655/raw/7b0762c09b519f40397e4c3e100b097d861f5588/airports.json").setContentType("application/json").execute().map(wsResponse -> {
            Iterator<JsonNode> jsonNode = wsResponse.asJson().iterator();
            jsonNode.forEachRemaining(node -> {
                Airports airports = Airports.find.where().eq("air_code", node.get("code").asText()).findUnique();
                if (airports != null) {
//                    States state = States.find.where().eq("name", node.get("state").textValue()).findUnique();
                    airports.latitude = node.get("lat").textValue();
                    airports.longitude = node.get("lon").textValue();
                    airports.airport_name = node.get("name").textValue();
                    airports.city = node.get("city").textValue();
                    airports.state = node.get("state").textValue();
//                    airports.state_id = state;
                    airports.time_zone = node.get("tz").textValue();
                    airports.icao_code = node.get("icao").textValue();
                    airports.direct_flights = node.get("direct_flights").textValue();
                    airports.carriers = node.get("carriers").textValue();
                    airports.runway_length = node.get("runway_length").textValue();
                    airports.type = node.get("type").textValue();
                    airports.update();
//                    Logger.info("Found: " + airports.air_code);
                }
            });
            return jsonNode;
        });
        return ok();
    }

    public static Result postNewsletterSubscribe() {
        Form<NewsletterUsers> newsletterUsersForm = Form.form(NewsletterUsers.class).bindFromRequest();
        if (NewsletterUsers.find.where().eq("email", newsletterUsersForm.get().email).findUnique() != null) {
            responseJson.put("status", 0);
        } else {
            newsletterUsersForm.get().insert();
            responseJson.put("status", 1);
        }
        return ok(Json.toJson(responseJson));
    }

    public static Result getSearchApplication(String search) {
        return ok();
    }

    public static Result getSwitchCurrency(Long countryId) {
        if (countryId == 0 || countryId == null) {

        }
        return null;
    }

    public static Result getSecureUniqueUserCookie(String cookie_id, String redirect_to) {
        new Cookies(request()).setUniqueUserCookie(response(), cookie_id);
        if (redirect_to != null)
            return redirect(redirect_to);
        else
            return redirect("/");
    }

    public static F.Promise<Result> persistCities() {
        F.Promise<Result> result = F.Promise.promise(() -> {
            WS.url("http://travelfix.dev:9000/assets/airlines.json").execute().map(wsResponse -> {
                JsonNode wsNode = wsResponse.asJson();
                wsNode.forEach(jsonNode -> {
                    Airlines dbAirline = Airlines.find.where().eq("airline_code", jsonNode.get("code")).findUnique();
                    if (dbAirline == null) {
                        //insert the airline
                        Airlines airline = new Airlines();
                        airline.airline_code = jsonNode.get("code").asText();
                        airline.name = jsonNode.get("name").asText();
                        airline.insert();
                    }
                    Logger.info("Node: " + Json.toJson(jsonNode));
                });
                return wsNode;
            });
            return ok("Here Am I");
        });
        return result;
    }
}