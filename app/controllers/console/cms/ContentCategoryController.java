package controllers.console.cms;

import controllers.abstracts.SecuredConsoleController;
import core.security.Auth;
import models.CmsContentCategories;
import models.CmsTemplates;
import models.YesNoEnum;
import play.Logger;
import play.data.Form;
import play.libs.Json;
import play.mvc.Result;

import java.util.Calendar;
import java.util.List;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/02/2016 1:42 PM
 * |
 **/
public class ContentCategoryController extends SecuredConsoleController {

    public static Result getIndex() {
        List<CmsContentCategories> categoriesList = CmsContentCategories.find.orderBy("id desc").findList();
        return ok(views.html.console.cms.c_category.index.render(categoriesList));
    }

    public static Result getCreate(Long id) {
        CmsContentCategories fragments = new CmsContentCategories();
        if (id != 0) {
            fragments = CmsContentCategories.find.byId(id);
        }
        Form<CmsContentCategories> form = Form.form(CmsContentCategories.class).fill(fragments);
        return ok(views.html.console.cms.c_category.create.render(form));
    }

    public static Result getDelete(Long id) {
        CmsContentCategories cmsContentCategories = CmsContentCategories.find.byId(id);
        cmsContentCategories.name = cmsContentCategories.name + "<<>>" + String.valueOf(Calendar.getInstance().getTimeInMillis());
        cmsContentCategories.update();
        cmsContentCategories.delete();
        flash().put("success", "Category deleted successfully");
        return redirect(controllers.console.cms.routes.ContentCategoryController.getIndex());
    }

    public static Result postCreate() {
        Form<CmsContentCategories> form = Form.form(CmsContentCategories.class).bindFromRequest();
        String breadcrumb_str;
        String parentBr;
        if (form.hasErrors()) {
            flash().put("error", "Invalid input field");
            return badRequest(views.html.console.cms.c_category.create.render(form));
        }
        CmsContentCategories cmsContentCategories = form.get();
        if (CmsContentCategories.find.where().eq("name", cmsContentCategories.name).findUnique() != null && cmsContentCategories.id == null) {
            flash().put("error", "'" + cmsContentCategories.name + "' already exist");
            return badRequest(views.html.console.cms.c_category.create.render(form));
        }
        if (cmsContentCategories.parent_id.id != null) {
            parentBr = CmsContentCategories.find.byId(cmsContentCategories.parent_id.id).breadcrumb_str + " / " + cmsContentCategories.name;
        } else {
            parentBr = " / " + cmsContentCategories.name;
        }
        breadcrumb_str = parentBr;
        cmsContentCategories.breadcrumb_str = breadcrumb_str;
        cmsContentCategories.auth_user_id = Auth.user();
        if (form.get().is_url != null && form.get().is_url.equals(YesNoEnum.Yes)) {
            cmsContentCategories.is_url = YesNoEnum.Yes;
        } else {
            cmsContentCategories.is_url = YesNoEnum.No;
        }
        if (cmsContentCategories.id != null) {
            flash().put("success", "Category updated successfully");
            cmsContentCategories.update();
        } else {
            flash().put("success", "Category created successfully");
            cmsContentCategories.insert();
        }
        return ok(views.html.console.cms.c_category.index.render(CmsContentCategories.find.all()));
    }
}