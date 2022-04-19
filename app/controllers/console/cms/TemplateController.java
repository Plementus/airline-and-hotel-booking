package controllers.console.cms;

import com.avaje.ebean.SqlQuery;
import controllers.abstracts.SecuredConsoleController;
import core.security.Auth;
import models.*;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.Result;

import java.util.List;
import java.util.Map;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 13/02/2016 7:27 PM
 * |
 **/
public class TemplateController extends SecuredConsoleController {

    public static Result getIndex() {
        List<CmsTemplates> containers = request().getQueryString("cat_id") != null ? CmsTemplates.find.where().eq("category_id", CmsContentCategories.find.byId(Long.parseLong(request().getQueryString("cat_id")))).findList() : CmsTemplates.find.all();
        return ok(views.html.console.cms.template.index.render(containers));
    }

    public static Result getItem(Long id) {
        String sql = "select * from cms_templates join cms_content_categories where cms_templates.id = "+ id +" AND cms_content_categories.is_url = 'Yes' LIMIT 1";
        SqlQuery sqlQuery = MyModel.db().createSqlQuery(sql);
        if (sqlQuery.findUnique() != null) {
            return ok(Json.toJson(sqlQuery.findUnique()));
        } else {
            return ok(Json.toJson(null));
        }
    }

    public static Result getCreate() {
        CmsTemplates containers = new CmsTemplates();
        Form<CmsTemplates> form = Form.form(CmsTemplates.class).fill(containers);
        return ok(views.html.console.cms.template.create.render(form));
    }

    public static Result getEdit(Long id) {
        CmsTemplates containers = CmsTemplates.find.byId(id);
        Form<CmsTemplates> form = Form.form(CmsTemplates.class).fill(containers);
        return ok(views.html.console.cms.template.edit.render(form));
    }

    public static Result getPreviewTemplate(Long id) {
        CmsTemplates containers = CmsTemplates.find.byId(id);
        return ok(views.html.console.cms.template.preview.render(containers));
    }

    public static Result postCreate() {
        Form<CmsTemplates> postForm = Form.form(CmsTemplates.class).bindFromRequest();
        if (postForm.hasErrors()) {
            flash().put("error", "Invalid form input");
            return badRequest(views.html.console.cms.template.create.render(postForm));
        }
        CmsTemplates containers = postForm.get();
        containers.auth_user_id = Auth.user();
        if (DynamicForm.form().bindFromRequest().get("action") != null && DynamicForm.form().bindFromRequest().get("action").equals("save_publish")) {
            containers.is_published = YesNoEnum.Yes;
        } else {
            containers.is_published = YesNoEnum.No;
        }
        if (containers.id == null) {
            containers.insert();
        } else {
            containers.update();
        }
        CmsTemplateAttr.find.where().eq("cms_template_id", containers).findList().forEach(cmsTemplateAttr -> {
            if (cmsTemplateAttr != null) {
                cmsTemplateAttr.delete();
            }
        });
        Map attrMap = DynamicForm.form().bindFromRequest().get().getData();
        attrMap.forEach((attr, val) -> {
            if (!attr.toString().equals("csrfToken")) {
                CmsTemplateAttr cmsTempateAttr = new CmsTemplateAttr();
                cmsTempateAttr.attr = attr.toString();
                cmsTempateAttr.value = val.toString();
                cmsTempateAttr.cms_template_id = containers;
                cmsTempateAttr.insert();
            }
        });
        flash().put("success", "Template saved successfully");
        return redirect(controllers.console.cms.routes.TemplateController.getIndex());
    }

    public static Result getDelete(Long id) {
        CmsTemplates.find.byId(id).delete();
        flash().put("success", "Template deleted successfully");
        return redirect(controllers.console.cms.routes.TemplateController.getIndex());
    }
}