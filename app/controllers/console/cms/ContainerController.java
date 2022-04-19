package controllers.console.cms;


import controllers.abstracts.SecuredConsoleController;
import core.security.Auth;
import models.CmsContentCategories;
import models.CmsContainers;
import models.CmsLinks;
import org.apache.commons.lang3.StringEscapeUtils;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.Result;
import play.twirl.api.Html;
import java.util.List;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/02/2016 1:34 PM
 * |
 **/
public class ContainerController extends SecuredConsoleController {

    public static Result getIndex() {
        List<CmsContainers> containers = request().getQueryString("cat_id") != null ? CmsContainers.find.where()
                .eq("category_id", CmsContentCategories.find.byId(Long.parseLong(request().getQueryString("cat_id")))).findList()
                : CmsContainers.find.all();
        return ok(views.html.console.cms.container.index.render(containers));
    }

    public static Result getCreate(Long id) {
        CmsContainers containers = new CmsContainers();
        if (id != 0) {
            containers = CmsContainers.find.byId(id);
        }
        Form<CmsContainers> form = Form.form(CmsContainers.class).fill(containers);
        return ok(views.html.console.cms.container.create.render(form));
    }

    public static Result postCreate() {
        Form<CmsContainers> postForm = Form.form(CmsContainers.class).bindFromRequest();
        if (postForm.hasErrors()) {
            System.out.println("Found Error...");
            flash("error", "Invalid form input");
            return badRequest(views.html.console.cms.container.create.render(postForm));
        }
        CmsContainers containers = postForm.get();
        containers.auth_user_id = Auth.user();
      /* containers.html_code = StringEscapeUtils.escapeHtml4(containers.html_code);
        System.out.println(StringEscapeUtils.escapeHtml4(containers.html_code));*/
        if (containers.id == null) {
           containers.insert();
        } else {
           containers.update();
        }

      String btnAction = DynamicForm.form().bindFromRequest().get("action");
        flash().put("success", "container saved successfully");
        if(btnAction.equals("save")) {
            flash().put("success", "container saved successfully");
            return redirect(controllers.console.cms.routes.ContainerController.getIndex());
        }
        flash().put("success", "container saved successfully");
        return ok(views.html.console.cms.container.create.render(postForm));
    }

    public static Result getDelete(Long id) {
        CmsContainers container = CmsContainers.find.byId(id);
        container.delete();
        flash().put("success", "Container deleted successfully");
        return redirect(controllers.console.cms.routes.ContainerController.getIndex());
    }

    public static Result getContainerJson(Long id) {
        if (id != 0) {
            return ok(Json.toJson(CmsContainers.find.byId(id)));
        }
        return ok();
    }

}