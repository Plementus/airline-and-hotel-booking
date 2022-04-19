package controllers.console;

import controllers.abstracts.SecuredConsoleController;
import core.*;
import core.ControlPanel;
import models.*;
import org.apache.commons.lang3.text.WordUtils;
import play.Logger;
import play.cache.Cache;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.Http;
import play.mvc.Result;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 10/10/15 2:04 PM
 * |
 **/

public class SystemController extends SecuredConsoleController {

    public static Result getIndex() {
        List<Users> users = Users.find.order().desc("id").findList();
        return ok(views.html.console.user.index.render(users));
    }

    public static Result getCreateAirport(Long id) {

        return ok();
    }

    public static Result getAirports() {
        List<Airports> airports = (List<Airports>) Cache.get("airports"); //just load the data form cache
        if (request().getQueryString("source") != null && request().getQueryString("source").equals("ajax")) {
            List<String[]> data = new ArrayList<>();
            for (Airports airport : airports) {
                String[] record = new String[7];
                record[0] = airport.air_code;
                record[1] = airport.airport_name;
                record[2] = airport.city;
                record[3] = airport.country_name;
                record[4] = airport.country_code;
                record[5] = airport.area_code;
                record[6] = "<a href=\"#\" class=\"btn btn-xs btn-primary\">Edit</a>";
                data.add(record);
            }
            responseJson.put("data", Json.toJson(data));
            return ok(responseJson);
        }
        return ok(views.html.console.system.airports.render(airports));
    }

    public static Result getCountriesState() {
        List<States> states;
        Object objectCache = Cache.get("states");
        if (objectCache == null) {
            states = States.find.findList();
            Cache.set("states", states);
        } else {
            states = (List<States>) objectCache; //just load the data form cache
        }
        if (request().getQueryString("source") != null && request().getQueryString("source").equals("ajax")) {
            List<String[]> data = new ArrayList<>();
            for (States state : states) {
                String[] record = new String[7];
                record[0] = state.id.toString();
                record[1] = state.name;
                record[2] = state.code;
                record[3] = state.country_id.name;
                record[4] = state.status.name();
                record[5] = "<a href=\"#\" class=\"btn btn-xs btn-primary\">Edit</a>";
                data.add(record);
            }
            responseJson.put("data", Json.toJson(data));
            return ok(responseJson);
        }
        String[] fields = {"ID", "Name", "Code", "Country", "Is Active", "Action"};
        return ok(views.html.helpers._data_table.render("Manage States and City", fields));
    }

    public static Result getStatesCities() {
        List<States> states;
        Object objectCache = Cache.get("states");
        if (objectCache == null) {
            states = States.find.findList();
            Cache.set("states", states);
        } else {
            states = (List<States>) objectCache; //just load the data form cache
        }
        if (request().getQueryString("source") != null && request().getQueryString("source").equals("ajax")) {
            List<String[]> data = new ArrayList<>();
            for (States state : states) {
                String[] record = new String[7];
                record[0] = state.id.toString();
                record[1] = state.name;
                record[2] = state.code;
                record[3] = state.country_id.name;
                record[4] = state.status.name();
                record[5] = "<a href=\"#\" class=\"btn btn-xs btn-primary\">Edit</a>";
                data.add(record);
            }
            responseJson.put("data", Json.toJson(data));
            return ok(responseJson);
        }
        String[] fields = {"ID", "Name", "Code", "Country", "Is Active", "Action"};
        return ok(views.html.helpers._data_table.render("Manage States and City", fields));
    }

    public static Result getAirline() {
        List<Airlines> airports = Airlines.find.all(); //(List < Airports >) Cache.get("airports"); //just load the data form cache
        if (request().getQueryString("source") != null && request().getQueryString("source").equals("ajax")) {
            List<String[]> data = new ArrayList<>();
            for (Airlines airport : airports) {
                String[] record = new String[5];
                record[0] = "<img src=\"airport.logo_data_bank_id.file_name\">";
                record[1] = airport.id.toString();
                record[2] = airport.name;
                record[3] = airport.airline_code;
                record[4] = "<a href=\"#\" class=\"btn btn-xs btn-primary\">Edit</a>" + "<a href=\"\" class=\"btn btn-xs btn-danger\">Delete</a>";
                data.add(record);
            }
            responseJson.put("data", Json.toJson(data));
            return ok(responseJson);
        }
        return ok(views.html.console.system.airlines.render(airports));
    }

    public static Result getCreateAirline(Long id) {
        Airlines airline = new Airlines();
        if (id != 0) {
            airline = Airlines.find.byId(id);
        }
        Form<Airlines> form = Form.form(Airlines.class).fill(airline);
        return ok(views.html.console.system.create_airline.render(form));
    }

    public static Result postCreateAirline() {
        Form<Airlines> form = Form.form(Airlines.class).bindFromRequest();
        if (form.hasErrors()) {
            return badRequest(views.html.console.system.create_airline.render(form));
        } else {
            try {
                DataBank dataBank = null;
                Http.MultipartFormData.FilePart fileUpload = request().body().asMultipartFormData().getFile("logo");
                if (fileUpload != null) {
                    String fileName = Utilities.generateAlphaNumeric() + fileUpload.getFilename();
                    String fileType = fileUpload.getContentType();
                    String destinationDir = playConfig.getString("file.upload_dir");
                    if (!new File(destinationDir).isDirectory()) {
                        new File(destinationDir).mkdir(); //create the directory if not exists
                    }
                    fileUpload.getFile().renameTo(new File(destinationDir.concat(fileName))); //upload the file
                    dataBank = new DataBank();
                    dataBank.file_name = fileName;
                    dataBank.file_size = Long.toString(fileUpload.getFile().getTotalSpace());
                    dataBank.file_url = destinationDir;
                    dataBank.file_extension = fileType;
                    dataBank.file_path = destinationDir.concat(fileName);
                    dataBank.insert();
                }

                Airlines _airline = form.get();
                _airline.logo_data_bank_id = dataBank;
                _airline.insert();
                flash("success", "Airline saved successfully");
                return redirect(controllers.console.routes.SystemController.getAirline());
            } catch (Exception e) {
                Logger.info("Error exist while creating project: " + e.getMessage());
                return badRequest(views.html.console.system.create_airline.render(form));
            }
        }
    }

    public static Result getPaymentMethod(String pCategory) {
        PaymentCategories paymentCategory = PaymentCategories.valueOf(pCategory);
        if (paymentCategory == null) {
            return internalServerError("Unknown payment category");
        }
        List<PaymentMethods> paymentMethods = PaymentMethods.find.where().eq("payment_category", paymentCategory).findList(); //just load the data form cache
        if (request().getQueryString("source") != null && request().getQueryString("source").equals("ajax")) {
            List<String[]> data = new ArrayList<>();
//            if (paymentCategory.equals(PaymentCategories.Debit_Card)) {
//                for (PaymentMethods method : paymentMethods) {
//                    String[] record = new String[2];
//                    record[0] = method.name;
//                    data.add(record);
//                }
//            } else
            if (paymentCategory.equals(PaymentCategories.Debit_Card)) {
                for (PaymentMethods method : paymentMethods) {
                    String[] record = new String[4];
                    record[0] = "<img height=\"40px\" style=\"height: 45px\" src=" + controllers.routes.Assets.at("data_bank/" + method.gateway_logo_id.file_name).toString() + " height=\"50px\" class=\"img img-thumbnail\" />";
                    record[1] = method.name;
                    record[2] = method.gateway_display_name;
                    record[3] = "<a href=" + controllers.console.routes.SystemController.getCreatePaymentMethod(pCategory, method.id) + " class=\"btn btn-xs btn-primary\">Edit Payment Method</a>";
                    data.add(record);
                }
            } else if (paymentCategory.equals(PaymentCategories.Pay_By_Cash)) {
                for (PaymentMethods method : paymentMethods) {
                    String[] record = new String[5];
                    record[0] = method.name;
                    record[1] = method.bank_account_no;
                    record[2] = method.bank_account_name;
                    record[3] = method.bank_account_type;
                    record[4] = "<a href=" + controllers.console.routes.SystemController.getCreatePaymentMethod(pCategory, method.id) + " class=\"btn btn-xs btn-primary\">Edit Payment Method</a>";
                    data.add(record);
                }
            }
            responseJson.put("data", Json.toJson(data));
            return ok(responseJson);
        }

//        if (paymentCategory.equals(PaymentCategories.Debit_Card)) {
//            String[] fields = {""};
//            return ok(views.html.helpers._data_table.render("Manage Payment Methods", fields));
//        } else
        if (paymentCategory.equals(PaymentCategories.Debit_Card)) {
            String[] fields = {"Logo", "EFT name", "Display name", "Action"};
            return ok(views.html.helpers._data_table.render("Manage Payment Methods", fields));
        } else if (paymentCategory.equals(PaymentCategories.Pay_By_Cash)) {
            String[] fields = {"Bank Name", "Account Num.", "Account Name", "Account Type", "Action"};
            return ok(views.html.helpers._data_table.render("Manage Payment Methods", fields));
        }
        return null;
    }

    public static Result getCreatePaymentMethod(String paymentCategory, Long id) {
        PaymentMethods paymentMethods = new PaymentMethods();
        if (id != 0) {
            paymentMethods = PaymentMethods.find.byId(id);
        }
        Form<PaymentMethods> form = Form.form(PaymentMethods.class).fill(paymentMethods);
        return ok(views.html.console.system.create_payment_method.render(form));
    }

    public static Result getPaymentCategories() {
        PaymentCategories[] paymentMethods = PaymentCategories.values(); //just load the data form cache
        if (request().getQueryString("source") != null && request().getQueryString("source").equals("ajax")) {
            List<String[]> data = new ArrayList<>();
            for (PaymentCategories paymentMethod : paymentMethods) {
                String[] record = new String[2];
                record[0] = paymentMethod.name();
                record[1] = "<a href=" + controllers.console.routes.SystemController.getPaymentMethod(paymentMethod.name()) + " class=\"btn btn-xs btn-primary\">Manage Payment Method</a>";
                data.add(record);
            }
            responseJson.put("data", Json.toJson(data));
            return ok(responseJson);
        }
        String[] fields = {"Name", "Manage"};
        return ok(views.html.helpers._data_table.render("Manage Payment Methods", fields));
    }

    public static Result postCreatePaymentMethod() {
        Form<PaymentMethods> form = Form.form(PaymentMethods.class).bindFromRequest();
        if (form.hasErrors()) {
            return badRequest(views.html.console.system.create_payment_method.render(form));
        }
        PaymentMethods paymentMethods = form.get();
        if (paymentMethods.payment_category.equals(PaymentCategories.Debit_Card)) {
            String gatewayConfFileName = WordUtils.capitalize(paymentMethods.name).replaceAll(" ", "");

            File confFile = new File(play.Play.application().path().getPath().concat("/conf/" + gatewayConfFileName.concat(".conf")));
            File viewFile = new File(play.Play.application().path().getPath().concat("/app/views/_payment_methods/" + gatewayConfFileName.concat(".scala.html")));

            Http.MultipartFormData.FilePart filePart = request().body().asMultipartFormData().getFile("logo");
            if (filePart.getFile() != null && filePart.getFile().isFile()) {
                String dir = play.Configuration.root().getString("data.uploadPath");
                String fileName = filePart.getFilename();
                String fullPath = dir + fileName;
                filePart.getFile().renameTo(new File(fullPath));
                DataBank dataBank = new DataBank();
                dataBank.file_name = fileName;
                dataBank.file_path = fullPath;
                dataBank.file_size = Long.toString(filePart.getFile().length());
                dataBank.insert();
                paymentMethods.gateway_logo_id = dataBank;
            }
            if (!confFile.isFile()) {
                try {
                    String fileContent = "# Auto-Generated File. \n#\n# You can edit file to add your EFT merchant keys";
                    Utilities.writeTextFile(confFile, fileContent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (!viewFile.isFile()) {
                try {
                    String viewContent = views.html._include._genEFTView.apply(new PaymentHistories()).text(); //"@* Auto-Generated File. *@\n@*You can edit file to add your EFT merchant keys*@"
                    Utilities.writeTextFile(viewFile, viewContent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (paymentMethods.id == null) {
            paymentMethods.insert();
        } else {
            paymentMethods.update();
        }
        flash("success", "Payment Method Saved Successfully");
        return redirect(controllers.console.routes.SystemController.getPaymentMethod(paymentMethods.payment_category.name()));
    }

    public static Result getCurrencyConversion() {

        return ok(views.html.console.system.currency_conversion_rates.render());
    }

    public static Result postCurrencyConversion() {
        DynamicForm form = DynamicForm.form().bindFromRequest();
        String conversion_rate = form.get("conversion_rate");
        String currency = form.get("currency");
        switch (currency) {
            case "USD":
                core.ControlPanel.getInstance().saveMetaValue(ControlPanelMeta.usd_conversion_rate.name(), conversion_rate);
                break;
        }
        flash().put("success", "Conversion Rate Saved Successfully");
        return redirect(controllers.console.routes.SystemController.getCurrencyConversion());
    }

    public static Result postSaveControlPanel() {
        DynamicForm form = DynamicForm.form().bindFromRequest();
        for (ControlPanelMeta controlPanelMeta : ControlPanelMeta.values()) {
            if (form.get(controlPanelMeta.name()) != null) {
                ControlPanel.getInstance().saveMetaValue(controlPanelMeta.name(), form.get(controlPanelMeta.name()));
            }
        }
        flash().put("success", "Saved changed successfully");
        return REDIRECT_BACK();
    }

    public static Result getGeneralSettings() {

        return ok(views.html.console.system.general_settings.render());
    }

}
