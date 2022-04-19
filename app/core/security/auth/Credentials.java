package core.security.auth;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 23/12/2015 11:43 PM
 * |
 **/
public class Credentials {

    public String email;

    public String password;

    public boolean isRemember;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRemember() {
        return isRemember;
    }

    public void setIsRemember(boolean isRemember) {
        this.isRemember = isRemember;
    }
}
