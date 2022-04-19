package controllers.abstracts;

import controllers.interceptors.CustomerSecurityInterceptor;
import play.mvc.Security;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 09/12/2015 11:27 AM
 * |
 **/
@Security.Authenticated(CustomerSecurityInterceptor.class)
public abstract class SecuredCustomerController extends BaseController {

}

