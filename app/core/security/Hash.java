package core.security;

import akka.util.Crypt;

import java.util.Date;
import java.util.Map;
import java.util.HashMap;


public class Hash {

    public static Map<String, String> createPassword(String clearString) {
        String salt = Crypt.md5(Long.toString(new Date().getTime()));
        String password = Crypt.md5(clearString + salt);
        Map <String, String> returnMap = new HashMap<>();
        returnMap.put("password", password);
        returnMap.put("salt", salt);
        return returnMap;
    }

    public static boolean checkPassword(String password, String salt, String tblPassword) {
        if (password == null || salt == null) {
            return false;
        }
        //check the password
        String reversePassword = Crypt.md5(password + salt);
        if(reversePassword.equalsIgnoreCase(tblPassword)) {
            return true;
        } else {
            return false;
        }
    }

    public static String generateSalt() {
        return Crypt.md5(Long.toString(new Date().getTime()));
    }
}
