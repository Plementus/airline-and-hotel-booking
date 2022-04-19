package controllers.console.cms;

import controllers.abstracts.SecuredConsoleController;
import core.security.Auth;
import models.CmsPages;
import models.CmsTemplates;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 15/02/2016 9:09 PM
 * |
 **/
public class PageController extends SecuredConsoleController {

    public static Result getIndex() {
        List<CmsPages> pages = CmsPages.find.fetch("cms_template_id").findList();
        if (request().getQueryString("source") != null && request().getQueryString("source").equals("ajax")) {
            List<String[]> data = new ArrayList<>();
            for (CmsPages page : pages) {
                String urlShortnerHtml = "<div role=\"group\" aria-label=\"...\">\n" +
                        "<div class=\"btn-group\" role=\"group\">\n" +
                        "<button type=\"button\" class=\"btn btn-default dropdown-toggle btn-xs loading-url-shortner\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n" +
                        "URL Shortening <span class=\"caret\"></span>\n" +
                        "</button>\n" +
                        "<ul class=\"dropdown-menu\">\n";
                String[] split = page.host.split("<<>>");
                if (split.length != 0) {
                    for (String s : split) {
                        urlShortnerHtml = urlShortnerHtml +"<li><a style=\"cursor : pointer\" data-url=\"" + page.slug_url+ "\" data-host=\"" + s + "\" class=\"gen_short_url\">" + s + "</a></li>\n";
                    }
                }
                urlShortnerHtml = urlShortnerHtml + "</ul>\n" +
                    "</div>\n" +
                "</div>";

                String[] record = new String[11];
                record[0] = page.id.toString();
                record[1] = page.name;
                record[2] = page.slug_url;
                record[3] = page.version_control.name();
                record[4] = page.auth_user_id.first_name + " " + page.auth_user_id.last_name;
                record[5] = page.is_publish.name();
                record[6] = "<a target=\"_blank\" href=" + getUrlPath(page.slug_url) + " class=\"btn btn-xs btn-default\">Open Page</a>";
                record[7] = urlShortnerHtml;
                record[8] = page.created_at.toGMTString();
                record[9] = "<a href=" + controllers.console.cms.routes.PageController.getCreatePage(page.id) + " class=\"btn btn-xs btn-primary\">Edit</a> <a href=" + controllers.console.cms.routes.PageController.getDeletePage(page.id) + " class=\"btn btn-danger btn-xs\">Delete</a>";
                record[10] = "<a href=" + controllers.console.cms.routes.TemplateController.getEdit(page.cms_template_id.id) + " class=\"btn btn-xs btn-primary\">Edit Template</a>";
                data.add(record);
            }
            responseJson.put("data", Json.toJson(data));
            return ok(responseJson);
        }
        String[] fields = {"#", "Title", "URL", "SVN", "Author", "Is Published?", "Review Page", "Domains", "Date Created", "Action","Edit Templates"};
        return ok(views.html.helpers._data_table.render("Pages", fields));
    }


    public static Result getCreatePage(Long id) {
        CmsPages page = new CmsPages();
        if (id != 0) {
            page = CmsPages.find.byId(id);
        }
        Form<CmsPages> form = Form.form(CmsPages.class).fill(page);
        return ok(views.html.console.cms.page.create_page.render(form));
    }

    public static Result getDeletePage(Long id) {
        CmsPages pages = CmsPages.find.byId(id);
        pages.slug_url = pages.slug_url + "<<>>" + String.valueOf(Calendar.getInstance().getTimeInMillis());
        pages.update();
        pages.delete();
        flash("success", "Page Deleted Successfully");
        return redirect(controllers.console.cms.routes.PageController.getIndex());
    }

    public static Result postCreatePage() {
        Form<CmsPages> form = Form.form(CmsPages.class).bindFromRequest();
        if (form.hasErrors() || form.hasGlobalErrors()) {
            return badRequest(views.html.console.cms.page.create_page.render(form));
        }
        List<String> hosts = form.get().host_domain;
        String hostsString = "";
        for (String s : hosts) {
            hostsString = hostsString + s + "<<>>";
        }
//        hostsString = hostsString + "travelfix.dev:8080";
        CmsPages page = form.get();
        page.host = hostsString;
        page.auth_user_id = Auth.user();
//        page.host = hostsString;
        if (form.get().id == null) {
            page.insert();
        } else {
            page.update();
        }
        flash().put("success", "page saved successfully");
        String btnAction = DynamicForm.form().bindFromRequest().get("action");
        if (btnAction.equals("save")) {
            return redirect(controllers.console.cms.routes.PageController.getIndex());
        }
        return ok(views.html.console.cms.page.create_page.render(form));
    }

    private static String getUrlPath(String slugUrl) {
       String http ="http://";
        String host = request().host();
        if (host.toLowerCase().contains("console.")) {
            host = host.split("console.")[1];
        }
       return http + host + slugUrl;
    }

}