/********************************************/
//	6/7/15 2:20 AM - Ibrahim Olanrewaju.
/********************************************/

package core;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.base.Strings;
import models.AuditTrails;
import models.Users;
import play.Configuration;
import play.Logger;
import play.db.DB;

import java.io.*;
import java.sql.*;
import java.util.*;

import play.libs.F;
import play.libs.ws.WS;
import play.libs.ws.WSResponse;
import play.mvc.Http;

import java.sql.Statement;
import java.util.Date;

public class Audits {

    private File file;

    public Boolean isNewDay;

    public Audits() {
        this.newDay();
    }

//    @Inject
//    public WSClient ws;

    private void newDay() {
        File cacheUnixFile = new File(Constants.UNIX_CACHE_FILE_PATH);
        Long currentUnixTimestamp = Long.parseLong(Utilities.getUnixTime());
        if (!cacheUnixFile.exists()) {
            writeCurrentUnixTimestampToFile(cacheUnixFile, currentUnixTimestamp);
        }
        String cacheUnixString = Utilities.readTextFile(cacheUnixFile);
        if (!Strings.isNullOrEmpty(cacheUnixString)) {
            Long cachedUnixTimestamp = Long.parseLong(cacheUnixString);

            if (currentUnixTimestamp >= cachedUnixTimestamp) {
                writeCurrentUnixTimestampToFile(cacheUnixFile, currentUnixTimestamp);
                this.isNewDay = true;
            } else { this.isNewDay = false;}
        }
    }

    private void writeCurrentUnixTimestampToFile(File file, Long unixTimestamp) {
        Utilities.writeTextFile(file, unixTimestamp.toString());
    }

    public void audit() {

    }

    public void reloadGeoLocation(final Http.Context context) {
        //1. clear cache
        new UtilCache(context).clearCache();

        //2. confirm user currency
        String ipAddress = context.request().remoteAddress();
        WS.url(Constants.GEO.URL).get().map(new F.Function<WSResponse, JsonNode>() {
            @Override
            public JsonNode apply(WSResponse response) throws Throwable {
                //Cache the session here
                JsonNode resp = response.asJson();
                String countryCode = resp.findPath("countryCode").asText().toLowerCase();
                if (countryCode != null) {
                    context.session().put("user_country", countryCode);
                    if (countryCode == "ng")
                        context.session().put("user_currency", "naira");
                    else
                        context.session().put("user_currency", "dollar");
                }
                return resp;
            }
        });
    }

    public void reloadGeoLocation() {
        //1. clear cache
        play.cache.Cache.remove("user_country");
        play.cache.Cache.remove("user_currency");
        WS.url(Constants.GEO.URL).get().map(new F.Function<WSResponse, JsonNode>() {
            @Override
            public JsonNode apply(WSResponse response) throws Throwable {
                //Cache the session here
                JsonNode resp = response.asJson();
                String countryCode = resp.findPath("countryCode").asText().toLowerCase();
                if (countryCode != null) {
                    play.cache.Cache.set("user_country", countryCode);
                    if (countryCode == "ng")
                        play.cache.Cache.set("user_currency", "naira");
                    else
                        play.cache.Cache.set("user_currency", "dollar");
                }
                return resp;
            }
        });
    }

    public void reloadCurrencyConversionRate(final Http.Context context) {
        //3. check conversion rate conversion rate
//        WS.url("http://jsonrates.com/get").setQueryParameter("from", "USD").setQueryParameter("to", "NGN").setQueryParameter("apiKey", "jr-5a1b3607c04a5ff32191c8145b14cbf1").get().map(new F.Function<WSResponse, JsonNode>() {
//            @Override
//            public JsonNode apply(WSResponse response) throws Throwable {
//                //Cache the session here
//                JsonNode resp = response.asJson();
//                //Insert into the audit trail table of the currency conversion detail
////                Statement statement = DB.getConnection().createStatement();
////                String message = "currency conversion on the system on " + new Date().toLocaleString() + "\n\n";
////                message += "Date: " + new Date().toLocaleString() + "\n";
////                statement.executeUpdate("INSERT INTO auditTrail (message, createdAt, auditType) VALUE ('" + message + "', '" + core.Utilities.getUnixTime() + "', '" + Constants.AUDIT_TYPES.TYPE_SYS + "')");
//                context.session().put("conversion_rate", resp.get("rate").asText());
//                return resp;
//            }
//        });
    }

    public void reloadCurrencyConversionRate() {
        //3. check conversion rate conversion rate
//        WS.url("http://jsonrates.com/get").setQueryParameter("from", "USD").setQueryParameter("to", "NGN").setQueryParameter("apiKey", "jr-5a1b3607c04a5ff32191c8145b14cbf1").get().map(new F.Function<WSResponse, JsonNode>() {
//            @Override
//            public JsonNode apply(WSResponse response) throws Throwable {
//                //Cache the session here
//                JsonNode resp = response.asJson();
//                //Insert into the audit trail table of the currency conversion detail
//                Statement statement = DB.getConnection().createStatement();
//                Calendar calendar =  Calendar.getInstance();
//                String message = "currency conversion on the system on " + calendar.getTime().toLocaleString() + "\n\n";
//                message += "Date: " + new Date().toLocaleString() + "\n";
////                statement.executeUpdate("INSERT INTO auditTrail (message, createdAt, auditType) VALUE ('" + message + "', '" + core.Utilities.getUnixTime() + "', '" + Constants.AUDIT_TYPES.TYPE_SYS + "')");
//                play.cache.Cache.set("conversion_rate", resp.get("rate").asText());
//                return resp;
//            }
//        });
    }

    public void backUpDb() throws SQLException {
        Connection connection = DB.getConnection();
        try {
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            List<String> allDbTables = new ArrayList<>();
            ResultSet resultTblList = statement.executeQuery("SELECT TABLE_NAME FROM information_schema.TABLES WHERE TABLE_SCHEMA = '" + Configuration.root().getString("db.default.db") + "'");

            while (resultTblList.next()) {
                allDbTables.add(resultTblList.getString("TABLE_NAME"));
            }
            //Hence work on all the database and create the state
            Iterator tableLopp = allDbTables.iterator();
            String writeToFIle = "File Created On: " + new Date().toLocaleString() + " By System Generated Script \n\n\n";

            while (tableLopp.hasNext()) {
                //This is where all the action happens
                String tableName = (String) tableLopp.next().toString();

                //Steps for back up process

                //Step 1. Drop all the tables
                String dropDb = "DROP TABLE IF EXISTS `" + tableName + "`;\n";
                writeToFIle += dropDb;

                ResultSet prop = statement.executeQuery("DESCRIBE " + tableName);
                String createTbl = "CREATE TABLE IF NOT EXISTS `" + tableName + "` (";
                String insertTbl = "INSERT INTO `" + tableName + "`(";
                String insertValue = null;
                while (prop.next()) {
                    //Step 2. Create the database table
                    String nullable = "";
                    String key = "";
                    if (prop.getString("Null").equals("NO")) nullable = " NOT NULL";
                    else nullable = " NULL ";
                    if (prop.getString("Key").equals("PRI")) key = " PRIMARY KEY ";
                    else if (prop.getString("Key").equals("UNI")) key = " UNIQUE ";
                    else key = " ";
                    if (!prop.isLast())
                        createTbl += "\n`" + prop.getString("FIELD") + "` " + prop.getString("Type") + nullable + " " + prop.getString("Extra") + key + ",";
                    else
                        createTbl += "\n`" + prop.getString("FIELD") + "` " + prop.getString("Type") + nullable + prop.getString("Extra") + " " + key;
                    //Step 3. Select from the database and do i insert value
                    if (!prop.isLast())
                        insertTbl += "`" + prop.getString("FIELD") + "`,";
                    else {
                        insertTbl += "`" + prop.getString("FIELD") + "`) VALUES ";
                        writeToFIle += insertTbl;
                        String currentField = prop.getString("FIELD");
//                        ResultSet records = statement.executeQuery("SELECT * FROM " + tableName);
//                        while (records.next()) {
//
//                        }
                    }
                }
                insertTbl += ") VALUES ";
                //Insert the value into the database

                createTbl += ("\n) ENGINE=InnoDB DEFAULT CHARSET=latin1; \n\n");
                writeToFIle += createTbl;
            }
            connection.commit();
            connection.close();
        } catch (SQLException exception) {
            Logger.debug("DB Back Up Error: " + exception.getMessage());
            connection.rollback();
        }
    }

    public static void saveAuditTrail(Long userId, String title, String message, AuditTrailCategory auditTrailCategory, AuditActionType actionType) {
        AuditTrails auditTrails = new AuditTrails();
        auditTrails.user_id = Users.find.byId(userId);
        auditTrails.action_type = actionType;
        auditTrails.audit_category = auditTrailCategory;
        auditTrails.activity_title = title;
        auditTrails.message = message;
        auditTrails.created_at = new Date();
        auditTrails.ipAddress = Http.Context.current().request().getHeader(Http.HeaderNames.HOST);
        auditTrails.http_user_agent = Http.Context.current().request().getHeader(Http.HeaderNames.USER_AGENT);
        auditTrails.insert();
    }

}
