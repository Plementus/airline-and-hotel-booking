package core.security.auth.restful;
/********************************************/
//	6/10/15 8:27 PM - Ibrahim Olanrewaju.
/********************************************/
import play.mvc.With;


import java.lang.annotation.*;

@With(BasicAuth.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE,  ElementType.METHOD })
public @interface RestfulAPI { }
