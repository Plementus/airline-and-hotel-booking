package controllers.console.cms;

import controllers.abstracts.SecuredConsoleController;
import core.security.Auth;
import models.*;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/20/15 11:24 AM
 * |
 **/

public class ApplicationController extends SecuredConsoleController {

    public static Result getLink() {
        List<CmsLinks> pages = CmsLinks.find.all(); //just load the data form cache
        return ok(views.html.console.cms.links.render(pages));
    }


    public static Result getCreateLink(Long id) {
        CmsLinks page = new CmsLinks();
        if (id != 0) {
            page = CmsLinks.find.byId(id);
        }
        Form<CmsLinks> form = Form.form(CmsLinks.class).fill(page);
        return ok(views.html.console.cms.create_link.render(form));
    }

    public static Result getDeleteLink(Long id) {
        CmsLinks cmsLink = CmsLinks.find.byId(id);
        cmsLink.delete();
        flash().put("success", "Link deleted successfully");
        return redirect(controllers.console.cms.routes.ApplicationController.getLink());
    }
    public static Result getDeleteWidget(Long id) {
        CmsHtmlWidgets cmsWidget = CmsHtmlWidgets.find.byId(id);
        cmsWidget.delete();
        flash().put("success", "HTML widget deleted successfully");
        return redirect(controllers.console.cms.routes.ApplicationController.getWidget());
    }

    public static Result postCreateLink() {
        Form<CmsLinks> form = Form.form(CmsLinks.class).bindFromRequest();
        if (form.hasErrors()) {
            return badRequest(views.html.console.cms.create_link.render(form));
        }
        CmsLinks menu = form.get();
        menu.auth_user_id = Auth.user();
        menu.status = models.Status.Active;
        if (menu.show_in_menu != null && menu.show_in_menu.equals(YesNoEnum.Yes)) {
            menu.show_in_menu = YesNoEnum.Yes;
        } else {
            menu.show_in_menu = YesNoEnum.No;
        }
        menu.is_sub_menu = YesNoEnum.No;
        if (menu.id == null) {
            menu.save();
        } else {
            menu.update();
        }
        flash("success", "Link Saved Successfully");
        return redirect(controllers.console.cms.routes.ApplicationController.getLink());
    }

    public static Result getWidget() {
        List<CmsHtmlWidgets> widgets = CmsHtmlWidgets.find.all();
        return ok(views.html.console.cms.html_widgets.render(widgets));
    }

    public static Result getCreateWidget(Long id) {
        CmsHtmlWidgets page = new CmsHtmlWidgets();
        if (id != 0) {
            page = CmsHtmlWidgets.find.byId(id);
        }
        Form<CmsHtmlWidgets> form = Form.form(CmsHtmlWidgets.class).fill(page);
        return ok(views.html.console.cms.create_html_widget.render(form));
    }

    public static Result postCreateWidget() {
        Form<CmsHtmlWidgets> form = Form.form(CmsHtmlWidgets.class).bindFromRequest();
        if (form.hasErrors()) {
            flash().put("error", "Invalid form input");
            return badRequest(views.html.console.cms.create_html_widget.render(form));
        }
        CmsHtmlWidgets input = form.get();
        input.auth_user_id = Auth.user();
        if (input.id != null) {
            input.update();
        } else {
            input.insert();
        }
        flash().put("success", "Widget Saved Successfully");
        return redirect(controllers.console.cms.routes.ApplicationController.getWidget());
    }

    public static Result getManageAnnouncement() {
        List<CmsAnnouncements> announcements = CmsAnnouncements.find.all(); //just load the data form cache
        if (request().getQueryString("source") != null && request().getQueryString("source").equals("ajax")) {
            List<String[]> data = new ArrayList<>();
            for (CmsAnnouncements announcement : announcements) {
                String[] record = new String[6];
                record[0] = announcement.id.toString();
                record[1] = announcement.title;
                record[2] = announcement.auth_user_id.first_name + " " + announcement.auth_user_id.last_name;
                record[3] = announcement.role_groups;
                record[4] = announcement.created_at.toLocaleString();
                record[5] = "<a href=" + controllers.console.cms.routes.ApplicationController.getCreateAnnouncement(announcement.id) + " class=\"btn btn-xs btn-default\">Edit</a> &nbsp;" +
                        "<a href=" + controllers.console.cms.routes.ApplicationController.getCreateAnnouncement(announcement.id) + " class=\"btn btn-xs btn-danger\">Delete</a>";
                data.add(record);
            }
            responseJson.put("data", Json.toJson(data));
            return ok(responseJson);
        }
        String[] fields = {"", "Title", "Created By", "User Roles", "Created At", "Action"};
        return ok(views.html.helpers._data_table.render("Announcement Record", fields));
    }

    public static Result getCreateAnnouncement(Long id) {
        CmsAnnouncements announcements = new CmsAnnouncements();
        if (id != 0) {
            announcements = CmsAnnouncements.find.byId(id);
        }
        Form<CmsAnnouncements> form = Form.form(CmsAnnouncements.class).fill(announcements);
        return ok(views.html.console.cms.create_announcement.render(form));
    }

    public static Result postCreateAnnouncement() {
        String roleGroups = DynamicForm.form().bindFromRequest().get("r_group");
        Form<CmsAnnouncements> form = Form.form(CmsAnnouncements.class).bindFromRequest();
        if (form.hasErrors()) {
            flash().put("error", "Invalid request, please try again.");
            return badRequest(views.html.console.cms.create_announcement.render(form));
        }
        CmsAnnouncements announcements = form.get();
        announcements.role_groups = roleGroups;
        announcements.auth_user_id = Users.find.byId(Long.parseLong(userId));
        if (form.get().id == null) {
            announcements.insert();
        } else {
            announcements.update();
        }
        flash().put("success", "Announcement saved successfully");
        return redirect(controllers.console.cms.routes.ApplicationController.getManageAnnouncement());
    }

    public static Result getApperance() {
        return ok(views.html.console.cms.appearance.render());
    }

    public static Result postApperance() {
        Map<String, String> form = DynamicForm.form().bindFromRequest().data();
        core.ControlPanel cp = core.ControlPanel.getInstance();
        form.forEach(cp::saveMetaValue);
        cp.reloadCache();
        flash().put("success", "Request successfully");
        return redirect(controllers.console.cms.routes.ApplicationController.getApperance());
    }

    public static Result getTermsAndConditions() {
        return ok(views.html.console.cms.terms_and_conditions.render());
    }

    public static Result getCreateAd() {
        return ok("Create Ads Manager is Under Development");
    }

    public static Result getManageAds() {
        return ok("Manage Ads Manager is Under Development");
    }


}
