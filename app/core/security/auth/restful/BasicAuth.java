/*********************************************/
//	6/24/15 2:22 PM - Ibrahim Olanrewaju.
/********************************************/

package core.security.auth.restful;

import core.security.AuthServices;
import play.Configuration;
import play.libs.F;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

import java.io.IOException;

public class BasicAuth extends Action<RestfulAPI> {

    private final String AUTHORIZATION = Http.HeaderNames.AUTHORIZATION;
    private final String WWW_AUTHENTICATION = Http.HeaderNames.WWW_AUTHENTICATE;
    private final String REALM = "Basic realm=" + Configuration.root().getString("project.name") + " requires authentication";

    private F.Promise<Result> callbackReturn = null;

    @Override
    public F.Promise<Result> call(final Http.Context ctx) throws Throwable {
        try {
            String stringHeader = ctx.request().getHeader(AUTHORIZATION);
            if (stringHeader == null) {
                ctx.response().setHeader(WWW_AUTHENTICATION, REALM);
                return delegate.call(ctx).map(new F.Function<Result, Result>() {
                    @Override
                    public Result apply(Result result) throws Throwable {
                        return unauthorized("Invalid authentication details provided");
                    }
                });
            }

            String auth = stringHeader.substring(6);
            byte[] decodedAuth = new sun.misc.BASE64Decoder().decodeBuffer(auth);
            String[] credString = new String(decodedAuth, "UTF-8").split(":");
            if (credString == null || credString.length != 2) {
                return delegate.call(ctx).map(new F.Function<Result, Result>() {
                    @Override
                    public Result apply(Result result) throws Throwable {
                        return unauthorized("Invalid authentication details provided");
                    }
                });
            }
            String username = credString[0];
            String password = credString[1];
            if (AuthServices.basicRealmAuth(username, password)) {
                callbackReturn = delegate.call(ctx);
            } else {
                return delegate.call(ctx).map(new F.Function<Result, Result>() {
                    @Override
                    public Result apply(Result result) throws Throwable {
                        return unauthorized("Invalid authentication details provided");
                    }
                });
            }
        } catch (IOException ex) {
            return delegate.call(ctx).map(new F.Function<Result, Result>() {
                @Override
                public Result apply(Result result) throws Throwable {
                    return unauthorized("Invalid authentication details provided");
                }
            });
        }
        return delegate.call(ctx);
    }

}
