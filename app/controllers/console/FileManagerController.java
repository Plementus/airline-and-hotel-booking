package controllers.console;

import com.dropbox.core.DbxException;
import com.dropbox.core.v1.DbxEntry;
import com.dropbox.core.v2.DbxFiles;
import com.dropbox.core.v2.DbxSharing;
import controllers.abstracts.SecuredConsoleController;
import core.DropBox;
import core.DropBoxDirectory;
import core.Pagination;
import models.CmsAnnouncements;
import models.DataBank;
import play.api.mvc.MultipartFormData;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.Http;
import play.mvc.Result;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * |
 * | Created by Ibrahim  Olanrewaju S.
 * | On 11/22/15 12:15 PM
 * |
 **/

public class FileManagerController extends SecuredConsoleController {

    public static Result getIndex() {

        List<DbxFiles.Metadata> files = files = new ArrayList<>();
        TreeMap<String, DbxFiles.Metadata> directories = DropBox.getInstance().getFilesDirectories("");
        if (directories != null) {
            for (DbxFiles.Metadata metadata : directories.values()) {
                if (metadata != null) {
                    files.add(metadata);
                }
            }
        }
        Pagination<DbxFiles.Metadata> paginatedData = new Pagination<>();
        paginatedData.setRawData(files);
        paginatedData.setRecordPerPage(10);
        return ok(views.html.console.file_manager.media_home.render(paginatedData));

    }

    private static String getExtension(String contentType) {
        CharSequence charSequence = contentType.subSequence(1, 3);
        if (contentType.matches("/jpeg/") || contentType.matches("/jpg/")) {
            return "jpg";
        } else if (contentType.matches("/png/")) {
            return "png";
        } else if (contentType.matches("/gif/")) {
            return "gif";
        } else {
            return contentType.split("/")[1];
        }
    }

    public static Result getDeleteFile(String filePath) {
        try {
            DropBox.getInstance().client.files.delete(filePath);
            DataBank dataBank = DataBank.find.where().eq("file_url", filePath).findUnique();
            if (dataBank != null) {
                dataBank.delete();
            }
            flash().put("success", "File deleted successfully");
            return REDIRECT_BACK();
        } catch (DbxException e) {
            e.printStackTrace();
        }
        flash().put("error", "Request could not be processed. Please try again.");
        return REDIRECT_BACK();
    }

    public static Result postAjaxUpload() {
        //* Http.MultipartFormData.FilePart filePart = request().body().asMultipartFormData().getFile("file");

        /*if (filePart != null) {
            String fileName = filePart.getFilename();
            System.out.println(fileName);
            try {
                DropBox fileUploader = DropBox.getInstance().uploadFile(filePart.getFile(), fileName);
            } catch (DbxException | IOException e) {
                e.printStackTrace();
            }
        }*/
        return ok();
    }

    public static Result newUpload(){
        Form<DataBank> postForm  = Form.form(DataBank.class).bindFromRequest();
        return ok(views.html.console.file_manager.create.render(postForm));
    }

    public static Result postUpload() {
        Form<DataBank> postForm  = Form.form(DataBank.class).bindFromRequest();
        if (postForm.hasErrors()) {
            flash().put("error", "Invalid form input");
            return badRequest(views.html.console.file_manager.create.render(postForm));
        } else {
            DataBank dataBank = postForm.get();
            Http.MultipartFormData body = request().body().asMultipartFormData();
            Http.MultipartFormData.FilePart resourceFile = body.getFile("file");
            String file_name = resourceFile.getFilename();
            try {
                DropBox fileUploader = DropBox.getInstance().uploadFiles(resourceFile.getFile(),file_name,dataBank);
            } catch (DbxException | IOException e) {
                e.printStackTrace();
            }
        }
        flash().put("success", "File saved successfully");
        return redirect(controllers.console.routes.FileManagerController.getIndex());
    }


   // public static Result getIndexs() {
      /*  List<DataBank> dataBanks = new ArrayList<>();
        List<String[]> data = new ArrayList<>();
        String[] fileInfo = new String[2];
        TreeMap<String, DbxFiles.Metadata> filesDirectories = DropBox.getInstance().getFilesDirectories("");
        if( filesDirectories != null && filesDirectories.size() != 0){
            assert filesDirectories != null;
            for(DbxFiles.Metadata metadata : filesDirectories.values() ){
                DbxSharing.PathLinkMetadata sharedLinkInfo = core.DropBox.getInstance().getSharedLinkInfo(metadata.pathLower);
                for(DataBank dataBank: dataBanks){
                  //  dataBank = DataBank

                    fileInfo[0] = sharedLinkInfo.url;
                    fileInfo[1] = sharedLinkInfo.path;
                    data.add(fileInfo);
                }
            }

        }*/
      /* List<DbxFiles.Metadata> files = null;
       DataBank dataBank = null;
        List<String[]> data = new ArrayList<>();
        try { files= DropBox.getInstance().getFiles(); } catch (DbxException e) { e.printStackTrace(); }
        if (request().getQueryString("source") != null && request().getQueryString("source").equals("ajax")) {

            TreeMap<String,DbxFiles.Metadata>  listing = DropBox.getInstance().getFilesDirectories("");
            System.out.println("Files in the root path:");
            for (DbxFiles child : listing.) {
                System.out.println("	" + child.name + ": " + child.toString());
            }
        }*/
        /*
        List<DbxFiles.Metadata> files = null;
        DataBank dataBanks = null;
        List<String[]> data = new ArrayList<>();
        try { files= DropBox.getInstance().getFiles(); } catch (DbxException e) { e.printStackTrace(); }
        if (request().getQueryString("source") != null && request().getQueryString("source").equals("ajax")) {
            TreeMap<String, DbxFiles.Metadata> filesDirectories = DropBox.getInstance().getFilesDirectories("");
            if (filesDirectories != null) {
                assert filesDirectories != null;
                int index = 1;
                for (DbxFiles.Metadata metadata : filesDirectories.values()) {
                    DbxSharing.PathLinkMetadata sharedLinkInfo = core.DropBox.getInstance().getSharedLinkInfo(metadata.pathLower);
                    String[] record = new String[7];
                    record[0] = String.valueOf(index);
                   *//* record[1] = "<img height=\"45px\" style=\"height: 45px;\" src=\""+core.DropBox.downloadUrl(sharedLinkInfo.url)+"\" class=\"img img-thumbnail\" />";*//*
                    record[2] = "<a href=\""+core.DropBox.getInstance().getSharedLinkInfo(metadata.pathLower).url+" target=\"_blank\">"+metadata.name+"</a>";
                    record[3] = "File";
                    record[4] = "...";
                    record[5] = metadata.pathLower;
                    record[6] = "<div class=\"btn-group\" role=\"group\" aria-label=\"...\">\n" +
                    "<div class=\"btn-group\" role=\"group\">\n" +
                    "<button type=\"button\" class=\"btn btn-default dropdown-toggle btn-xs btn-primary\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n" +
                    "<span class=\"caret\"></span>\n" +
                    "</button>\n" +
                    "<ul class=\"dropdown-menu\">\n" +
                    "<li><a style=\"cursor : pointer\" data-value=\""+core.DropBox.downloadUrl(sharedLinkInfo.url)+"\" class=\"copy_to_clip\">Copy URL</a></li>\n" +
                    "<li><a target=\"_blank\" href=\""+core.DropBox.downloadUrl(sharedLinkInfo.url)+"\">Download</a></li>\n" +
                    "<li><a target=\"_blank\" href=\""+sharedLinkInfo.url+"\">Preview</a></li>\n" +
                    "</ul>\n" +
                    "</div>\n" +
                    "</div>";
                    data.add(record);
                    index+=1;
                }
            }
            responseJson.put("data", Json.toJson(data));
            return ok(responseJson);
        }*/
       //**//* for (DbxFiles.Metadata metadata : files ){
         //   System.out.println(metadata.toString());
       // return ok(responseJson);
        //return ok(views.html.console.file_manager.media_home.render(data));
     /* return  ok();
    }*/

    /*public static Result getIndexss(){

        List<DataBank> fileRecords = DataBank.find.findList();
        if (fileRecords != null && fileRecords.size() != 0){
            for (DataBank dataBank : fileRecords){
                SimpleDateFormat dt1 = new SimpleDateFormat("yyyyy-mm-dd");
                System.out.println(dt1.format(date));
                dataBank.created_at = dataBank.created_at;
                fileRecords.add(dataBank);
            }
        }
        return ok(views.html.console.file_manager.list_all_files.render(fileRecords));
    }*/

}
