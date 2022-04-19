/*******************************************/
//	6/17/15 1:04 AM - Ibrahim Olanrewaju.
/********************************************/
package core;

import akka.actor.Cancellable;
import play.libs.Akka;
import scala.concurrent.duration.FiniteDuration;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class Tasks {

    public static Cancellable resetActivities(int unit, TimeUnit timeUnit) {
        return Akka.system().scheduler().schedule(
                FiniteDuration.apply(0, TimeUnit.MILLISECONDS),
                FiniteDuration.apply(unit, timeUnit),
                () -> {
                    //Reset all audit activities on the system
                    Audits audit = new Audits();
                    audit.reloadCurrencyConversionRate(); //reload the currency conversion rate
                },
                Akka.system().dispatcher()
        );
    }

    public static Cancellable scheduleDbBackUp() {
        return Akka.system().scheduler().schedule(
                FiniteDuration.apply(0, TimeUnit.MILLISECONDS),
                FiniteDuration.apply(24, TimeUnit.HOURS),
                () -> {
                    // Run database backup
                    try {
                        new Audits().backUpDb();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                },
                Akka.system().dispatcher()
        );
    }

    /*
      | SQL Table to Cache for specified tables that not often change.
      | E.g of table are countries, states
     */
    public static Cancellable cacheSQLDatas() {
        return Akka.system().scheduler().schedule(
                FiniteDuration.apply(0, TimeUnit.MILLISECONDS),
                FiniteDuration.apply(7, TimeUnit.DAYS),
                () -> {
                    UtilCache.cacheSQLData();
                },
                Akka.system().dispatcher()
        );
    }

}
