package core;

import models.*;
import models.ControlPanel;
import play.mvc.Http;
import scala.concurrent.duration.FiniteDuration;

import java.util.concurrent.TimeUnit;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/16/15 1:44 AM
 * |
 **/

/**
 * This is the cache for the system utilities data.
 * Note: This has not interface of relation for the WebService/GDS Caching System.
 */
public class UtilCache {

    private Http.Context context;
    public static final int CACHE_DURATION = (int) FiniteDuration.create(24, TimeUnit.HOURS).toSeconds(); //TimeUnit.HOURS;

    public String[] cacheKeys = {"user", "role", "page.home"};

    public UtilCache() {
        this.context = Http.Context.current();
    }
    public UtilCache(Http.Context controller) {
        this.context = controller;
    }

    public void clearCache() {
        for (String cacheKey : cacheKeys) {
            play.cache.Cache.remove(cacheKey);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        context.response().setHeader("Cache-control", "no-cache, no-store, must-revalidate");
        context.response().setHeader("Pragma", "no-cache");
        context.response().setHeader("Expires", "0");
    }

    /*
      |
     */
    public static void cacheSQLData() {
        //clear cache record if available
        play.cache.Cache.remove("airports");
        play.cache.Cache.remove("airlines");
        play.cache.Cache.remove("countries");
        play.cache.Cache.remove("states");
        play.cache.Cache.remove("banks");
        play.cache.Cache.remove("services");
        play.cache.Cache.remove("currencies");
        play.cache.Cache.remove("control_panel");

        //set the cache
        play.cache.Cache.set("airports", Airports.find.all());
        play.cache.Cache.set("airlines", Airlines.find.all());
        play.cache.Cache.set("countries", Countries.find.all());
        play.cache.Cache.set("states", States.find.all());
        play.cache.Cache.set("banks", Banks.find.all());
        play.cache.Cache.set("services", Services.values());
        play.cache.Cache.set("currencies", Currencies.find.all());
        play.cache.Cache.set("control_panel", ControlPanel.find.all());
    }

}
