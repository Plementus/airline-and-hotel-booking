/********************************************/
//	6/16/15 2:45 PM - Ibrahim Olanrewaju.
/********************************************/

package core;


import akka.actor.Cancellable;
import akka.util.Crypt;
import models.TfxLocale;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.libs.F;
import play.libs.F.Promise;
import play.mvc.Action;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Http.Context;
import play.mvc.Http.Request;
import play.mvc.Http.RequestHeader;
import play.mvc.Result;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bootstraps extends GlobalSettings {

    private Cancellable[] taskSchedule = new Cancellable[3];

    @Override
    public void onStart(Application var1) {
        taskSchedule[0] = Tasks.scheduleDbBackUp();
        taskSchedule[1] = Tasks.resetActivities(24, TimeUnit.HOURS);
        taskSchedule[2] = Tasks.cacheSQLDatas();
    }

    private boolean isProduction() {
        String sysMode = play.Configuration.root().getString("play.application.mode");
        if (sysMode != null && sysMode.equalsIgnoreCase("prod")) {
            return true;
        } else {
            return false;
        }
    }

    public Promise<Result> onError(RequestHeader var1, Throwable var2) {
//        System should send me an email that the application is down.
        String sysMode = play.Configuration.root().getString("play.application.mode");
        if (isProduction()) {
//            Mailer.sendMail(new Mailer.Envelop("olanrewaju.ibrahim@travelfix.co", views.html.emails.system_exception.render(var1.uri(), var2).body(), "jamiu.igbalajobi@travelfix.co"));
            return Promise.<Result>pure(errorPage());
        }
        return super.onError(var1, var2);
    }

    @Override
    public void onStop(Application var1) {
        super.onStop(var1);
        for (int i = 0; i < taskSchedule.length; i++) {
            if (taskSchedule[i] != null) {
                taskSchedule[i].cancel();
            }
        }
    }

    private Action.Simple getDomainForIpAddress(Request request) {
        Http.Cookie tfxCookieLocale = request.cookie("tfx_locale");
        if (tfxCookieLocale == null && request.method().equalsIgnoreCase("GET")) {
            //IP address detection and redirect user
            TfxLocale tfxLocale;
            try {
                tfxLocale = ControlPanel.getInstance().getUserLocale(request).get(TimeUnit.SECONDS.toMillis(10));
            } catch (F.PromiseTimeoutException ignored) {
                tfxLocale = null;
            }
            String localDomainUrl;
            if (tfxLocale == null) {
                localDomainUrl = play.Configuration.root().getString("project.default.url");//redirect to a default domain path;
            } else {
                localDomainUrl = tfxLocale.domain_name;
            }
            final TfxLocale finalTfxLocale = tfxLocale;
            return new Action.Simple() {
                @Override
                public Promise<Result> call(Context context) throws Throwable {
                    if (!localDomainUrl.equalsIgnoreCase("http://" + request.getHeader(Http.HeaderNames.HOST))) {
                        return Promise.pure(movedPermanently(localDomainUrl));
                    } else {
                        context.response().setCookie("tfx_locale", finalTfxLocale == null ? "NG" : finalTfxLocale.country_code, Long.bitCount(TimeUnit.DAYS.toSeconds(1)));
                        return delegate.call(context);
                    }
                }
            };
        }
        return null;
    }

    public Action onRequest(Request request, Method actionMethod) {
        String host = request.getHeader(Http.HeaderNames.HOST);
        if (host.toLowerCase().contains("www.")) {
            host = host.split("www.")[1];
        }
        Pattern pattern = Pattern.compile("^([a-z0-9]+)\\.([a-zA-Z0-9_%*:.]+)");
        Matcher matcher = pattern.matcher(host);
        if (matcher.matches()) {
            String domain = matcher.group(0);
            String subDomain = matcher.group(1);
            String[] prefix = request.uri().split("/");
            String[] domainSplit = domain.split("\\.");
            String domainExt = domainSplit.length > 2 ? domainSplit[2] : domainSplit[1];

            // if the URL is not a '.com' extension, redirect all request to '.com' extension.
            if (isProduction()) {
                if (!domainExt.equalsIgnoreCase("com")) {
                    return new Action.Simple() {
                        @Override
                        public Promise<Result> call(Context ctx) throws Throwable {
                            String ext = "";
                            if (request.uri().split(domainExt).length >= 1) {
                                ext = request.uri().split(request.getHeader(Http.HeaderNames.HOST))[0];
                            }
                            String redirectUrl = play.Configuration.root().getString("project.default.url") + ext;
                            return Promise.pure(movedPermanently(redirectUrl));
                        }
                    };
                }
            }

            //Set a unique browser cookie for the user.
            String cookieId = request.getQueryString("cookie_id");
            if (request.cookie(Cookies.COOKIE_NAME) == null) {
                String cookieUID = Crypt.md5(Utilities.getUnixTime()).toLowerCase();
                if (cookieId == null || cookieId.isEmpty()) {
                    return new Action.Simple() {
                        @Override
                        public Promise<Result> call(Context context) throws Throwable {
                            return Promise.pure(redirect("/home".concat("?cookie_id=" + cookieUID).concat("&redirect_to=" + request.uri())));
                        }
                    };
                }
            }

            //manage sub-domain for swift and console sub-domain paths.
            if (subDomain.equalsIgnoreCase("swift") || subDomain.equalsIgnoreCase("console")) {
                String suffixConcat = subDomain.equalsIgnoreCase("swift") ? "b2b" : "tfx";
                String url;
                if (prefix.length != 0) {
                    if (!prefix[0].equalsIgnoreCase(suffixConcat)) {
                        url = request.path();
                    } else {
                        prefix = request.path().split("/" + suffixConcat);
                        String appendPath = "";
                        if (prefix.length > 1) {
                            appendPath = prefix[1];
                        }
                        url = suffixConcat + appendPath;
                    }
                } else {
                    url = suffixConcat;
                }
                if (!url.equalsIgnoreCase(request.path())) {
                    return new Action.Simple() {
                        @Override
                        public Promise<Result> call(Context context) throws Throwable {
                            return Promise.pure(movedPermanently(url));
                        }
                    };
                }
            } else if (prefix.length != 0) {
                for (String pre : prefix) {
                    String preConcat = pre.equalsIgnoreCase("swift") ? "b2b" : "tfx";
                    if (pre.equals(preConcat)) {
                        return new Action.Simple() {
                            @Override
                            public Promise<Result> call(Context context) throws Throwable {
                                String redirectUrl = request.secure() ? "https://" : "http://" + subDomain + "." + request.host() + request.path();
                                //check if the method has a flash.
                                if (!Controller.flash().isEmpty()) {
                                    Controller.flash().forEach(Controller::flash);
                                }
                                return Promise.pure(movedPermanently(redirectUrl));
                            }
                        };
                    }
                }
            }
        }
        return super.onRequest(request, actionMethod);
    }

    public Result notFound(String message) {
        Result result = Controller.ok(views.html.errors.page404.render(message));
        return result;
    }

    public Result errorPage() {
        return Controller.ok(views.html.errors.page503.render(""));
    }

//    @Override
//    public Handler onRouteRequest(RequestHeader requestHeader) {
//        String host = requestHeader.getHeader(Http.HeaderNames.HOST);
//        Pattern pattern = Pattern.compile("^([a-z0-9]+)\\.([a-zA-Z0-9_%*:.]+)");
//        Matcher matcher = pattern.matcher(host);
//        if (matcher.matches()) {
//            String subDomain = matcher.group(1);
////            Properties hostProperty = new Properties();
////            hostProperty.setProperty("sub-domain", subDomain);
////            System.setProperties(hostProperty);
//            if (subDomain.equals("swift") && !requestHeader.method().equalsIgnoreCase("POST")) {
//
//            }
//        }
//        return super.onRouteRequest(requestHeader);
//    }

//    @Override
//    public <T extends EssentialFilter> Class<T>[] filters() {
//        return new Class[]{CSRFFilter.class};
//    }


    @Override
    public Promise<Result> onHandlerNotFound(RequestHeader request) {
        return Promise.pure(notFound(request.uri()));
    }

}
