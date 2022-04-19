package core;
/********************************************/
//	6/11/15 2:19 AM - Ibrahim Olanrewaju.
/********************************************/

import play.data.validation.Constraints;
import models.Users;
import play.data.validation.ValidationError;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


public class Forms {


    public static class Login {
        @Constraints.Required
        @Constraints.Email
        public String email;
        @Constraints.Required
        public String password;
        public String redirectUrl;
    }

    public static class AccountActivation {
        @Constraints.Required
        public String password;
        @Constraints.Required
        public String retype_password;
        public String u_id;
        public String activation_token;
    }

    public static class CreateUser {
        public Long id;
        @Constraints.MinLength(11)
        @Constraints.Required(message = "phone number is required, phone should not be less than 11 digits")
        public String phone;
        @Column(unique = true)
        @Constraints.Required
        public String email;
        @Constraints.MinLength(1)
        public String password;
        @Constraints.Required(message = "retype password field is required")
        public String retype_password;
        @Constraints.Required
        public String first_name;
        @Constraints.Required
        public String last_name;
        public String role_code;
        public List<ValidationError> validate() {
            List<ValidationError> errors = new ArrayList<ValidationError>();
            if (Users.find.where().eq("email", email).findUnique() != null) {
                errors.add(new ValidationError("email", "This e-mail is already registered."));
            }
            if(!password.equals(retype_password)) {
                errors.add(new ValidationError("password", "Password did not match"));
            }
            return errors.isEmpty() ? null : errors;
        }
    }

    public static class CreateSupport {
        @Constraints.Required
        public String support_category_id;
        @Constraints.Required
        public String title;
        @Constraints.Required
        public String message;
    }

    public static class GenerateAdminToken {
        @Constraints.Required
        public String otp_token;
    }
}
