/********************************************/
//	6/7/15 1:55 AM - Ibrahim Olanrewaju.
/********************************************/
package controllers.abstracts;

import com.fasterxml.jackson.databind.node.ObjectNode;
import controllers.interceptors.BaseControllerInterceptor;
import play.libs.*;

import java.util.Map;

import play.mvc.*;

@With(BaseControllerInterceptor.class)
public abstract class BaseController extends Controller {

    private static final String SESSION_KEY = "authUser";

    public static Boolean auth = false;

    public static Map<String, Object> project = play.Configuration.root().asMap();

    public static ObjectNode responseJson = Json.newObject().removeAll();

    public static final String RESPONSE_CODE = "responseCode";

    public static final String RESPONSE_DESC = "responseDescription";

    public static final String RESPONSE_RECORD = "Records";

    public static final int SUCCESS = 200;

    public static final int FAILED = 503;

    public static final String userAgent = request().getHeader(Http.HeaderNames.USER_AGENT);

    public static final String ipAddress = request().getHeader("X-Real-IP");

    public static final String callingUrl = request().getHeader(Http.HeaderNames.REFERER);

    public static final play.Configuration playConfig = play.Configuration.root();

    public static Result GO_HOME() {
        return redirect("/");
    }

    public static Result PAGE_404() {
        return ok(views.html.errors.page404.render("Page Not Found"));
    }

    protected static final String userId = session().get("user");

    public static Result REDIRECT_BACK() {
        if (callingUrl == null) {
            return redirect("/");
        }
        return redirect(callingUrl);
    }
}
