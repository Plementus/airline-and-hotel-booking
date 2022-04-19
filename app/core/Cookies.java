package core;


import com.fasterxml.jackson.databind.JsonNode;
import models.WebTraffic;
import models.YesNoEnum;
import play.libs.Akka;
import play.libs.ws.WS;
import play.mvc.Http;
import scala.concurrent.duration.FiniteDuration;

import java.util.concurrent.TimeUnit;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/17/15 9:10 PM
 * |
 **/

public class Cookies {


    protected Http.Request request;

    protected Http.Response response;

    public static final String COOKIE_NAME = "uniq_u";

    public static final int COOKIE_DURATION = (int) FiniteDuration.create(24 * 2, TimeUnit.HOURS).toSeconds();

    public Cookies(Http.Request request) {
        this.request = request;
    }

    public Boolean isUniqueCookieExists() {
        return request.cookie(COOKIE_NAME) != null ? true : false;
    }

    public static Http.Cookie getUniqUserCookieId() {
        return Http.Context.current().request().cookie(COOKIE_NAME);
    }

    public void setUniqueUserCookie(Http.Response response, String cookieId) {
        Http.Cookie cookie = request.cookie(COOKIE_NAME);
        response.setCookie(COOKIE_NAME, cookieId, 60 * 60 * 24 * 1); //cookie should expire in 24hrs.
        new Thread(() -> {
            Akka.system().scheduler().scheduleOnce(FiniteDuration.apply(0, TimeUnit.SECONDS), () -> {
                String httpUserAgent = request.getHeader(Http.HeaderNames.USER_AGENT);
                String refferingUrl = request.getHeader(Http.HeaderNames.REFERER);
                WebTraffic webTraffics = new WebTraffic();
                webTraffics.cookie_id = cookieId;
                webTraffics.machine_name = "Machine Name";
                if (httpUserAgent != null)
                    webTraffics.is_mobile = Utilities.isMobile(httpUserAgent) ? YesNoEnum.Yes : YesNoEnum.No;
                webTraffics.http_user_agent = httpUserAgent;
                webTraffics.ip_address = request.remoteAddress();
                webTraffics.referring_url = refferingUrl;
                WS.url(Constants.GEO.URL).get().map(respon -> {
                    JsonNode json = respon.asJson();
                    webTraffics.ip_country = json.get("country").asText();
                    webTraffics.ip_country_code = json.get("countryCode").asText();
                    webTraffics.time_zone = json.get("timezone").asText();
                    webTraffics.save();
                    return json;
                });
            }, Akka.system().dispatcher());
        }).start();
    }

    public static String getUserLocaleCountry() {
        Http.Cookie tfxLocale = Http.Context.current().request().cookie("tfx_locale");
        return tfxLocale == null ? "NG" : tfxLocale.value();
    }

    public String getUserCurrency() {
        Http.Cookie userCurrency = this.request.cookie("user_currency");
        return userCurrency == null ? "NGN" : userCurrency.value();
    }

    public static Http.Cookie getCookie(String key) {
        return Http.Context.current().request().cookie(key);
    }
}
