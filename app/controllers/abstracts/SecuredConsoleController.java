package controllers.abstracts;

import controllers.interceptors.ConsoleSecurityInterceptor;
import play.mvc.Security;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 09/12/2015 11:20 AM
 * |
 **/
@Security.Authenticated(ConsoleSecurityInterceptor.class)
public abstract class SecuredConsoleController extends BaseController {

    //the controller will manage access control and privilidges
}
