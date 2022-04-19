package controllers.interceptors;

import core.security.Auth;
import core.security.acl.AclService;
import play.libs.F;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

/**
 * |
 * | Created by Igbalajobi  Jamiu O.
 * | On 09/12/2015 11:13 AM
 * |
 **/
public class BaseControllerInterceptor extends Action<Result> {
    @Override
    public F.Promise<Result> call(Http.Context context) throws Throwable {
        /**
         * Perform Access Control and Privileges.
         */
//        Http.Response response = context.response();
//        response.setHeader("Access-Control-Allow-Origin", "*");
//        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE");
//        response.setHeader("Access-Control-Max-Age", "3600");
//        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, Authorization, X-Auth-Token");
//        response.setHeader("Access-Control-Allow-Credentials", "true");

        Boolean isPermitted = AclService.hasPermission();
        if (!isPermitted) {
            return delegate.call(context).map(result ->  unauthorized("403 - Access is denied"));
        }
        if(new Auth().getSessionLevel() == Integer.parseInt(Auth.ROLE_LEVEL_AGENT) && context.request().uri().equals("/")) {
            return delegate.call(context).map(result -> redirect(controllers.swift.routes.ApplicationController.getDashboard()));
        }
        return delegate.call(context);
    }
}