package core;
/**
 * ****************************************
 */
//	6/9/15 8:30 PM - Ibrahim Olanrewaju.

/********************************************/

public class Constants {

    public static final String UNIX_CACHE_FILE_PATH = play.Configuration.root().getString("my.file.path") + "t_stamp.txt";

    public static final String PUBLIC_PATH = "public/";

    public interface GEO {
        public static final String URL = "http://ip-api.com/json";
    }

    public interface AUDIT_TYPES {
        public static final String TYPE_USER = "USER";
        public static final String TYPE_SYS = "SYSTEM";
    }

    public interface SESSION {
        public static final String KEY = "u_key";
        public static final String USER_COUNTRY = "user_country";
        public static final String USER_CURRENCY = "user_currency";
    }

    public interface GTPAY {
        public static final String HASH_KEY = "10A85C6AC6A11A9D6E7B608FC923EEC0C1B190C82B13AF90619644DC0AF0D2FC1169295D5EC1829422163283F1F1B6E1736091F6F0148EC3F730B05C506D5942";
        public static final String QUERY_PAYMENT = "https://ibank.gtbank.com/GTPayService/gettransactionstatus.json";
        public static final String MERCHANT_ID = "2622";
        public static final String CHECK_TRANS_URL = "";

        //Transaction Status
        public static final String SUCCESS = "00";
        public static final String FAILED = "Z00";
        public static final String INSUFFICIENT_FUND = "Z00";
        public static final String CANCELLED = "Z00"; //Cancelled if record in a case where the transaction reference does not exists
    }

    public interface SMS_GATEWAY {
        public static final String URL = "http://smswonder.com/components/com_spc/smsapi.php";
        public static final String USERNAME = "digital@travelfix.co";
        public static final String PASSWORD = "BoraBora123";
        public static final String SENDER = "TravelFix";
    }

}
