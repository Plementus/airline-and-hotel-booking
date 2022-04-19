package core;
/*******************************************/
//	6/7/15 4:27 PM - Ibrahim Olanrewaju.
/********************************************/

import core.security.Hash;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import play.Logger;
import play.Play;
import play.api.mvc.Session;
import play.db.DB;
import play.mvc.Http;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.sql.Connection;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilities {

    public Session session;

    public Connection connection;

    public Http.Context context;

    public Utilities instance = null;

    public Utilities getInstance() {
        if (instance == null) {
            instance = new Utilities();
        }
        return instance;
    }

    public Utilities() {
        context = Http.Context.current();
        this.connection = DB.getConnection();
    }

    /*
    This class the user currency for the system, currency data is cache in a session
     */
    public void toogleCurrency() {

    }

    public static String readTextFile(File file) {
        String fileContent;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            fileContent = bufferedReader.readLine();
        } catch (IOException e) {
            fileContent = "";
            Logger.error("Error in reading from file: " + e.getMessage());
        }
        return fileContent;
    }

    public static void writeTextFile(File file, String data) {
        byte[] buffer = data.getBytes();
        try(OutputStream outputStream = new FileOutputStream(file)) {
            outputStream.write(buffer);
            outputStream.close();
        } catch (IOException e) { Logger.error("Error in writing to file: " + e.getMessage()); }
    }

    public static String sqlDateFormat(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(date);
    }

    public static String sqlDateFormat() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(new Date());
    }

    public static Date sqlDateFormat(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String flightDurationFormatter(String date) {
        try {
            String d = date.split("T")[0];
            String t = date.split("T")[1];
            date = d + " " + t;
            Date dt = sqlDateFormat(date);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(dt.getTime());
            SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM d h:mm a");
            return dateFormat.format(calendar.getTime());
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static String getUnixTime() {
        Long currentTimeStamp = new Date().getTime();
        return currentTimeStamp.toString();
    }

    /**
     * Chech if user agent is mobile
     *
     * @return Boolean
     */
    public static Boolean isMobile(String userAgent) {
        Boolean mobile = false;
        final String[] mobileAgents = {"iphone", "ipad", "android", "msie", "mobile", "bb10", "BB10; Touch", "bbtouch", "htc", "windows", "window", "Windows Phone 8.0", "IEMobile"};
        userAgent = userAgent.toLowerCase();
        for (String s : mobileAgents) {
            Pattern pattern = Pattern.compile(s);
            if (userAgent.matches(s)) {
                mobile = true;
            }
        }
        return mobile;
    }

    public static String timeToAgo(int unix) {
        int elapseTime = Integer.parseInt(getUnixTime()) - unix;
        if (elapseTime < 1) {
            return "0 Second";
        }
        Map<String, Integer> times = new HashMap<>();
        times.put("year", 60 * 60 * 24 * 30 * 12);
        times.put("month", 60 * 60 * 24 * 30);
        times.put("days", 60 * 60 * 24);
        times.put("hour", 60 * 60);
        times.put("minute", 60);
        times.put("second", 1);

        return "";
    }

    public static Document xmlParser(String xmlFileName) {
        try {
            File xml = Play.application().getFile(xmlFileName);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            if (!xml.exists()) {
                throw new FileNotFoundException(xml.getName() + " could not be found. please check the file if it exists in the directory");
            }
            Document document = builder.parse(xml);
            document.getDocumentElement().normalize();
            return document;
        } catch (SAXException | ParserConfigurationException | IOException ex) {
            return null;
        }
    }

    public static Boolean isEmail(String string) {
        return string.matches("@");
    }

    public static double calculatePercentage(double value, double percentage) {
        return value / 100.0f * percentage;
    }

    public static String generateAlphaNumeric() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("_");
//        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
//        Random rand = new Random();
//        for (int i = 1; i <= 26; i++) {
//            int rand_int = rand.nextInt(i);
//            stringBuilder.append(rand_int).append(chars[rand_int]);
//        }
//        String str = stringBuilder.toString();
//        if (str.length() > 25) {
//            str = str.substring(0, 26);
//        }
        stringBuilder.append(Hash.generateSalt().substring(0, 10));
        return stringBuilder.toString();
    }

    public static String generateAlphaNumeric(String prefix) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(prefix);
//        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
//        Random rand = new Random();
//        for (int i = 1; i <= 26; i++) {
//            int rand_int = rand.nextInt(i);
//            stringBuilder.append(rand_int).append(chars[rand_int]);
//        }
//        String str = stringBuilder.toString();
//        if (str.length() > 25) {
//            str = str.substring(0, 26);
//        }
        stringBuilder.append(Hash.generateSalt().substring(0, 10));
        return stringBuilder.toString();
    }

    public static String getFlightDuration(String fromDate, String toDate) {
        fromDate = fromDate.split("T")[0] + " " + fromDate.split("T")[1];
        toDate = toDate.split("T")[0] + " " + toDate.split("T")[1];
        SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        Date d1 = null;
        Date d2 = null;
        try {
            d1 = format.parse(fromDate);
            d2 = format.parse(toDate);
            long diff = d2.getTime() - d1.getTime();
            long diffSeconds = diff / 1000;
            long diffMinutes = diff / (60 * 1000) % 60;
            long diffHours = diff / (60 * 60 * 1000);
            if (diffHours >= 24) {

            }
            String duration = diffHours + "h:" + diffMinutes + "m";
            return duration;
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getCalendarMonth(int month) {
        String str = "Jan<<>>Feb<<>>Mar<<>>Apr<<>>May<<>>Jun<<>>Jul<<>>Aug<<>>Sep<<>>Oct<<>>Nov<<>>Dec";
        String[] split = str.split("<<>>");
        return split[month];
    }

    public static Calendar parseDate(String date) {
        String dt = date.split("T")[0] + " " + date.split("T")[1];
        SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        Date d = null;
        try {
            d = format.parse(dt);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        return calendar;
    }

    public static Date timeParser(String time) {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date d = null;
        try {
            d = format.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return d;
    }

    public static Calendar parseDateOnly(String date) {
        SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
        Date d = null;
        try {
            d = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        return calendar;
    }

    public static String moneyFormat(String currency, String money) {
        StringBuilder stringBuilder = new StringBuilder();
        String currencyCode = "NGN"; //ZAR is the default
        if (currency == null || currency.equalsIgnoreCase("ngn")) { //if the currency is Naira
            currencyCode = "&#x20a6;"; //naira
        } else if (currency.equalsIgnoreCase("usd")) {
            currencyCode = "&#x0024;";
        }
        stringBuilder.append(currencyCode);
        stringBuilder.append(" ");
        stringBuilder.append(NumberFormat.getNumberInstance().format(Double.parseDouble(money))); //Integer.parseInt(money)
        return stringBuilder.toString();
    }

    public static String getCurrency(String currency) {
        StringBuilder stringBuilder = new StringBuilder();
        String currencyCode = "NGN";
        if (currency == null || currency.equalsIgnoreCase("ngn")) { //if the currency is Naira
            currencyCode = "&#x20a6;"; //naira
        } else if (currency.equalsIgnoreCase("usd")) {
            currencyCode = "&#x0024;";
        }
        return currencyCode;
    }

    public static String moneyFormat(String money) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" ");
        stringBuilder.append(NumberFormat.getNumberInstance().format(Double.parseDouble(money))); //Integer.parseInt(money)
        return stringBuilder.toString();
    }

    public static String moneyFormat(double money) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" ");
        stringBuilder.append(NumberFormat.getNumberInstance().format(Double.parseDouble(Double.toString(money)))); //Integer.parseInt(money)
        return stringBuilder.toString();
    }

    public double priceRender(double amount) {
        return 0;
    }

}
