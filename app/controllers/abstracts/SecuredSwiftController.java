package controllers.abstracts;

import controllers.interceptors.SwiftSecurityInterceptor;
import play.mvc.Security;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 09/12/2015 11:29 AM
 * |
 **/
@Security.Authenticated(SwiftSecurityInterceptor.class)
public abstract class SecuredSwiftController extends BaseController {
}
