package controllers.interceptors;

import controllers.abstracts.BaseController;
import play.libs.F;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

/**
 * |
 * | Created by Igbalajobi  Jamiu O.
 * | On 09/12/2015 11:15 AM
 * |
 **/

public class AuthenticateInterceptor extends Action<Result> {
    @Override
    public F.Promise<Result> call(Http.Context context) throws Throwable {
        if (context.session().get("user") == null) {
            //redirect back and notify the user that the page requires an authentication
            context.flash().put("error", "Oooops! You have to be logged in to perform that action");
            return F.Promise.promise(new F.Function0<Result>() {
                @Override
                public Result apply() throws Throwable {
                    return BaseController.REDIRECT_BACK();
                }
            });
        }
        //Otherwise user should continue with the process.
        return delegate.call(context);
    }
}
