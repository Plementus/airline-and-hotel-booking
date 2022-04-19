package core.security.auth.storage;

import play.Configuration;

import java.io.File;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 23/12/2015 11:48 PM
 * |
 **/
public class SessionManager {

    private Session session;

    private File sessionFile;

    public Boolean sessionSaveStatus;

    public String clientStorageId;

    public Configuration configuration;


    public SessionManager(Session session, StorageDriverManager storageDriverManager) {
        this.session = session;
        this.configuration = storageDriverManager.playConfiguration;
        this.clientStorageId = storageDriverManager.getClientSessionId();
        this.sessionFile = new File(configuration.getString("auth.driver.session.filePath")+"/"+this.clientStorageId);
        if (!sessionFile.exists()) {

        }
    }
}
