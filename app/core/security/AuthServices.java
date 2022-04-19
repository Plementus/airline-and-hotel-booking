/*********************************************/
//	8/3/15 9:54 PM - Ibrahim Olanrewaju.
/********************************************/

package core.security;

import akka.util.Crypt;
import com.avaje.ebean.Ebean;
import core.*;
import models.*;
import play.data.DynamicForm;
import play.db.DB;
import play.mvc.Http;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class AuthServices {
    /*
      | Default Roles on the Application
    */
    public static final String ROLE_CUSTOMER = "ROLE_CUSTOMER";
    public static final String ROLE_AGENCY_ADMINISTRATOR = "ROLE_AGENCY_ADMINISTRATOR";
    public static final String ROLE_SU_ADMIN = "ROLE_SU_ADMIN";

    public static void saveResetPassword(String email, String newPassword) throws Exception {
        Users customer = Users.find.where().eq("email", email).findUnique();
        Map<String, String> passwordGen = Hash.createPassword(newPassword);
        customer.salt = passwordGen.get("salt");
        customer.password = passwordGen.get("password");
        customer.pwd_reset_code = null;
        customer.update();
    }

    public static String generateCustomerUniqueCode() {
        String merchantCode = Utilities.generateAlphaNumeric();
        Users epasUsers = Users.find.where().eq("unique_code", merchantCode).findUnique();
        if (epasUsers != null) {
            return generateCustomerUniqueCode(); //if the new already exists
        }
        return merchantCode;
    }

    public static Users createUserAccount(Users formInput) {
        Users status;
        DynamicForm formDynamic = DynamicForm.form().bindFromRequest();
        Map<String, String> password = Hash.createPassword(formInput.password);
        Users user = new Users();
        user.prefix = formInput.prefix;
        user.first_name = formInput.first_name;
        user.last_name = formInput.last_name;
        user.password = password.get("password");
        user.salt = password.get("salt");

        user.user_agent_reg = Http.Context.current().request().getHeader(Http.HeaderNames.USER_AGENT);
        user.ip_address = Http.Context.current().request().remoteAddress();
        user.email = formInput.email;
        user.phone = formInput.phone;
        user.gender = formInput.gender;
        user.social_media = formInput.social_media;
        user.social_media_id = formInput.social_media_id;
        user.avatar_url = formInput.avatar_url;
        user.activation_token = Crypt.md5(Utilities.getUnixTime()).concat("_") + new Date().getTime();
        user.referral_option = formDynamic.get("referral");
        if (formDynamic.get("referral") != null && formDynamic.get("referral").equals("tfx_staff")) {
            user.referral_value = formDynamic.get("tfx_staff_code");
        } else if (formDynamic.get("referral") != null && formDynamic.get("referral").equals("others")) {
            user.referral_value = formDynamic.get("other_referral");
        }
        user.status = Status.Active;
        user.is_verify = YesNoEnum.No;
        user.first_time_login = YesNoEnum.Yes;
        String role = formDynamic.get("role");
        if (role == null) {
            //make the default role a customer
            user.role_code = Roles.find.byId(AuthServices.ROLE_CUSTOMER);
        } else {
            user.role_code = Roles.find.where().eq("role_code", role).findUnique();
        }

        //save the user to the user account table.
        user.insert();

        if (formDynamic.get("newsletter_subscription") != null) {
            NewsletterUsers newsletterUsers = new NewsletterUsers();
            newsletterUsers.first_name = user.first_name;
            newsletterUsers.last_name = user.last_name;
            newsletterUsers.email = user.email;
            newsletterUsers.status = Status.Active;
            newsletterUsers.user_id = user;
            newsletterUsers.save();
        }

        //save the record to audit trail
        Audits.saveAuditTrail(user.id, "User Account Creation", user.first_name + " " + user.first_name + " " + user.role_code.role_title.concat(" Account was created"), AuditTrailCategory.Register, AuditActionType.User);
        //send an email to the user.
        Mailer.sendMail(new Mailer.Envelop(formInput.email, views.html.emails.create_account_activation.render(user, null).body(), formInput.email));
        status = user;
        return status;
    }

    public static Users createUserAccount(Users formInput, B2bUsers affiliateUser) {
        Users status;
        DynamicForm formDynamic = DynamicForm.form().bindFromRequest();
        Map<String, String> password = null;
        password = Hash.createPassword(formInput.password);
        Users user = new Users();
        user.prefix = formInput.prefix;
        user.first_name = formInput.first_name;
        user.last_name = formInput.last_name;
        user.password = password.get("password");
        user.salt = password.get("salt");
        user.gender = formInput.gender;

        user.email = formInput.email;
        user.phone = formInput.phone;
        user.activation_token = Crypt.md5(Utilities.getUnixTime()).concat("_") + new Date().getTime();
        user.status = Status.Active;
        user.is_verify = YesNoEnum.No;
        user.first_time_login = YesNoEnum.Yes;
        user.user_agent_reg = Http.Context.current().request().getHeader(Http.HeaderNames.USER_AGENT);
        user.role_code = Roles.find.byId(AuthServices.ROLE_AGENCY_ADMINISTRATOR);
        user.contact_address1 = affiliateUser.physical_address;
        try {
            user.dob = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse(formDynamic.get("dob"));
        } catch (ParseException e) {
        }
        user.referral_option = formDynamic.get("referral");
        if (formDynamic.get("referral").equals("tfx_staff")) {
            user.referral_value = formDynamic.get("tfx_staff_code");
        } else if (formDynamic.get("referral").equals("others")) {
            user.referral_value = formDynamic.get("other_referral");
        }
        //upload the image if exists
        Http.MultipartFormData.FilePart filePart = Http.Context.current().request().body().asMultipartFormData().getFile("logo");
        if (filePart != null) {
            //go ahead and upload the image.
            String dir = play.Configuration.root().getString("data.avatarPath");
            String fileName = Hash.generateSalt();
            String fullPath = dir + fileName;
            filePart.getFile().renameTo(new File(fullPath));
            user.avatar_file_name = fileName;
        }
        //save the user to the user account table.
        user.insert();

        affiliateUser.user_id = user;
        affiliateUser.state_id = States.find.byId(Long.parseLong(formDynamic.get("state")));

        affiliateUser.insert();

        if (formDynamic.get("newsletter_subscription") != null) {
            NewsletterUsers newsletterUsers = new NewsletterUsers();
            newsletterUsers.first_name = user.first_name;
            newsletterUsers.last_name = user.last_name;
            newsletterUsers.email = user.email;
            newsletterUsers.status = Status.Active;
            newsletterUsers.user_id = user;
            newsletterUsers.save();
        }

        //save the record to audit trail
        Audits.saveAuditTrail(user.id, "User Account Creation", user.first_name + " " + user.first_name + " " + user.role_code.role_title.concat(" Account was created"), AuditTrailCategory.Register, AuditActionType.User);
        //send an email to the user.
        Mailer.sendMail(new Mailer.Envelop(formInput.email, views.html.emails.create_account_activation.render(user, null).body(), formInput.email));
        status = user;
        return status;
    }

    public static Users createUserAccount(Users user, B2bSubUsers affiliateSubUser, B2bMarkups markups) {
        Users status;
        DynamicForm formDynamic = DynamicForm.form().bindFromRequest();
        String defaultPassword = "password";
        Map<String, String> password = Hash.createPassword(defaultPassword);
        user.activation_token = Crypt.md5(Utilities.getUnixTime()).concat("_") + new Date().getTime();
        user.status = Status.Active;
        user.is_verify = YesNoEnum.No;
        user.first_time_login = YesNoEnum.Yes;
        user.user_agent_reg = Http.Context.current().request().getHeader(Http.HeaderNames.USER_AGENT);
        user.role_code = Roles.find.where().eq("role_code", formDynamic.get("role")).findUnique();
        user.password = password.get("password");
        user.salt = password.get("salt");

//        Date dob = null;
//        try {
//            dob = new SimpleDateFormat("yyyy-mm-dd").parse(formDynamic.get("dob"));
//        } catch (ParseException e) {
//        }
        //save the user to the user account table.
        user.insert();
        affiliateSubUser.user_id = user;
        affiliateSubUser.b2b_user_id = B2bUsers.find.where().eq("user_id", Auth.user()).findUnique();
        affiliateSubUser.insert();

        markups.user_id = user;
        markups.insert();

        //save the record to audit trail
        Audits.saveAuditTrail(user.id, "B2B Agent Account Creation ", user.first_name + " " + user.first_name + " " + user.role_code.role_title.concat(" Account was created"), AuditTrailCategory.Register, AuditActionType.User);
        //send an email to the user.
        Mailer.sendMail(new Mailer.Envelop(user.email, views.html.emails.create_account_activation.render(user, defaultPassword).body(), user.email));
        status = user;
        return status;
    }


    public static Boolean activateAccount(Users user, String passwd) {
        Ebean.beginTransaction();
        Boolean status = false;
        Map<String, String> u = Hash.createPassword(passwd);
        user.status = Status.Inactive;
        user.activation_token = null;
        user.first_time_login = YesNoEnum.No;
        user.is_verify = YesNoEnum.Yes;
        user.password = u.get("password");
        user.salt = u.get("salt");
        Ebean.update(user);
        status = true;
        Ebean.commitTransaction();
        return status;
    }

    public static Users authenticateUserByEmail(String email, String password) throws Exception {
        Users users = Users.find.where().eq("email", email).findUnique();
        String salt = users.salt;
        if (Hash.checkPassword(password, salt, users.password)) {
            return users;
        }
        return null;
    }

    public static Boolean basicRealmAuth(String apiKey, String apiSecret) {
        try {
            ResultSet resultSet = DB.getConnection().createStatement().executeQuery(" SELECT * FROM api_users WHERE api_key = '" + apiKey + "' AND api_secret = '" + apiSecret + "' ");
            if (resultSet.next()) {
                return true;
            }
        } catch (SQLException e) {
            return false;
        }
        return false;
    }

    public static Users authenticateUser(String email, String password) {
        Users users = Users.find.where().eq("email", email).findUnique();
        String salt = users.salt;
        String passwd = users.password;
        if (Hash.checkPassword(password, salt, passwd)) {
            return users;
        } else {
            return null;
        }
    }

    public static Users authenticateUser(String email) {
        Users users = Users.find.where().eq("email", email).findUnique();
        return users;
    }
}
