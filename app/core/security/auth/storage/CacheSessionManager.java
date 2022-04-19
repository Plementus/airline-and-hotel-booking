package core.security.auth.storage;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 23/12/2015 11:40 PM
 * |
 **/
public class CacheSessionManager extends StorageDriverManager {


    public CacheSessionManager(Driver storageDriver, CacheSession storageInterface) throws NoSessionDriverException {
        super(storageDriver, storageInterface);
    }


}
