package core.security.auth.storage;

import core.Utilities;
import core.security.Hash;
import play.Configuration;

import java.io.File;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 23/12/2015 8:30 PM
 * |
 **/
abstract class StorageDriverManager {

    public Driver driver;

    public StorageInterface storageInterface;

    public Configuration playConfiguration;
    /**
     * @apiNote Session Driver in application.conf
     * The driver manager that was selected in the application.conf of the application
     * Available session driver are session and cache.
     */
    public String configDriver;

    public StorageDriverManager(Driver storageDriver, StorageInterface storageInterface) throws NoSessionDriverException {
        playConfiguration = Configuration.root();
        configDriver = playConfiguration.getString("auth.driver");
        if (configDriver == null) {
            throw new NoSessionDriverException();
        }
        this.driver = storageDriver;
        this.storageInterface = storageInterface;
    }

    /**
     * Get a user a unique key for each user.
     *
     * @return
     */
    public String getClientSessionId() {
        String uKey = Hash.generateSalt() + Utilities.generateAlphaNumeric();
        File file = new File(playConfiguration.getString("auth.driver.sesssion.filePath") + "/" + uKey);
        if (file.exists()) {
            return getClientSessionId();
        }
        return uKey;
    }

    public void persistKeyToSession(String sessionValue) {

    }


}