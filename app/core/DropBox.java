package core;

/**
 * Created by Ibrahim Olanrewaju on 10/02/2016.
 */

import com.dropbox.core.*;
import com.dropbox.core.v1.DbxEntry;
import com.dropbox.core.v1.DbxWriteMode;
import com.dropbox.core.v2.*;
import core.security.Hash;
import models.DataBank;
import play.Logger;
import play.libs.Json;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class DropBox {

    /**
     * The preferred director for dropbox
     */

    private static final String ACCESS_TOKEN = "h6kyy4QYhPAAAAAAAAAAYhAGxKmbJIlgK0cAVHHsRpPMtm_mqj761s2-tJct2sQ8";

    public static DropBox instance = null;

    public DbxUsers dropBoxUserAccount = null;

    public DbxClientV2 client = null;

    public DbxFiles.FileMetadata fileMetadata;

    public DbxSharing.PathLinkMetadata fileInfo;

    public String alternate_name;

    private DropBox() throws DbxException {
        this.oAuthAuthenticate();
    }


    public static DropBox getInstance() {
        if (instance == null) {
            try {
                instance = new DropBox();
            } catch (DbxException e) {
                e.printStackTrace();
            }
        }
        return instance;
    }

    private void oAuthAuthenticate() throws DbxException {
        DbxRequestConfig config = new DbxRequestConfig("tfx-web", "en_US");
        client = new DbxClientV2(config, ACCESS_TOKEN);
        dropBoxUserAccount = client.users;
    }

    public String imagesExtension(String image_name){
        String splits ="";
        String[] image_type ={".png",".jpg",".jpeg",".gif"};
        if(image_name.toLowerCase().contains(Arrays.toString(image_type))){
            splits = image_name.split(Arrays.toString(image_type))[0];
        }
        return splits;
    }


    public DropBox uploadFile(File file, String fileName) throws DbxException, IOException {
        InputStream in = new FileInputStream(file);
        fileName = DropBoxDirectory.PARENT_DIR.getDir() + fileName;
        System.out.println("Show me file name: "+fileName);
       // fileMetadata = client.files.uploadBuilder(fileName).run(in);
       // fileInfo = getSharedLinkInfo(fileName);
        DataBank dataBank = new DataBank();
        dataBank.file_name = imagesExtension(fileName);
        System.out.println("Show me pure name: "+dataBank.file_name);
        dataBank.file_size = Long.toString(fileMetadata.size);
        dataBank.file_url = downloadUrl(getSharedLinkInfo(fileMetadata.pathLower).url);
        dataBank.file_path = fileMetadata.pathLower;
        dataBank.insert();
        return instance;
    }

    public DropBox uploadFiles(File file, String fileName, DataBank dataBanks) throws DbxException, IOException {
        InputStream in = new FileInputStream(file);
        fileName = DropBoxDirectory.PARENT_DIR.getDir() + fileName;
        fileMetadata = client.files.uploadBuilder(fileName).run(in);
        fileInfo = getSharedLinkInfo(fileName);
        DataBank dataBank = new DataBank();
        dataBank.file_name = dataBanks.file_name;
        dataBank.file_size = Long.toString(fileMetadata.size);
        dataBank.file_url = downloadUrl(getSharedLinkInfo(fileMetadata.pathLower).url);
        dataBank.file_path = fileMetadata.pathLower;
        dataBank.insert();
        return instance;
    }
   /* public DropBox overite(){}*/
    public DropBox deleteFile(Long id){
       /* File inputFile = new File("working-draft.txt");
        FileInputStream inputStream = new FileInputStream(inputFile);
        try {
            DbxEntry.File uploadedFile = client.uploadFile("/magnum-opus.txt",
                    DbxWriteMode.add(), inputFile.length(), inputStream);
            System.out.println("Uploaded: " + uploadedFile.toString());
        } finally {
            inputStream.close();
        }*/
        return null;
    }

    public DbxSharing.PathLinkMetadata getSharedLinkInfo(String filePath) {
        try {
         //   Logger.info("" + Json.toJson(client.sharing.));
            return client.sharing.createSharedLink(filePath);
        } catch (DbxException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<DbxFiles.Metadata> getFiles() throws DbxException {
        return client.files.listFolder("").entries;
    }

    public List<DbxFiles.Metadata> getFiles(DropBoxDirectory directory) throws DbxException {
        return client.files.listFolder(directory.getDir()).entries;
    }

    public TreeMap<String, DbxFiles.Metadata> getFilesDirectories(String path) {
        // Get the folder listing from Dropbox.
        TreeMap<String, DbxFiles.Metadata> children = new TreeMap<String, DbxFiles.Metadata>();
        DbxFiles.ListFolderResult result;
        try {
            try {
                result = client.files.listFolder(path);
            } catch (DbxFiles.ListFolderException ex) {
                if (ex.errorValue.isPath()) {
                    return null;
                }
                throw ex;
            }

            while (true) {
                for (DbxFiles.Metadata md : result.entries) {
                    if (md instanceof DbxFiles.DeletedMetadata) {
                        children.remove(md.pathLower);
                    } else {
                        children.put(md.pathLower, md);
                    }
                }

                if (!result.hasMore) break;

                try {
                    result = client.files.listFolderContinue(result.cursor);
                } catch (DbxFiles.ListFolderContinueException ex) {
                    if (ex.errorValue.isPath()) {
                        return null;
                    }
                    throw ex;
                }
            }
        } catch (DbxException ex) {
            return null;
        }
        return children;
    }

    public static String downloadUrl(String url) {
        return url.replaceAll("dl=0", "dl=1");
    }

    public DbxFiles.Metadata getMetaData(String path) {
        try {
            return client.files.getMetadata(path);
        } catch (DbxException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getDownloadUrl(String urlRephrase){
        String rephrase = null;
        if(urlRephrase != null && urlRephrase.length() >1){
            rephrase = urlRephrase.substring(0,urlRephrase.length()-1)+"1";
        }else{
            rephrase ="Can Not Found The URL";
        }
        return rephrase;
    }
}
