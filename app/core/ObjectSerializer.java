package core;

import play.libs.Akka;
import play.libs.Crypto;

import javax.inject.Inject;
import java.io.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 02/01/2016 1:31 PM
 * |
 **/
public class ObjectSerializer <T extends Serializable> {

    public T serializeObject;

    public Encrypt encrypt;

    public File serializedFile;

    public String serializeFullFilePath;

    public String fileName;

    public ObjectSerializer(File file) throws Exception {
        if (!file.getName().matches(".ser")) {
//            throw new Exception("Invalid file extension. '.ser' file is expected.");
        }
        serializeFullFilePath = file.getPath();
        serializedFile = file;
        encrypt = new Encrypt();
    }

    public ObjectSerializer(T serializeObject, String fileName) throws Exception {
        String serDirectory = play.Configuration.root().getString("data.serializePath");
        this.fileName = fileName + ".ser";
        serializeFullFilePath = serDirectory + fileName;
        serializedFile = new File(serializeFullFilePath);
        if (!serializedFile.getName().matches(".ser")) {
//            throw new Exception("Invalid file extension. '.ser' file is expected.");
        }
        encrypt = new Encrypt();
        this.serializeObject = serializeObject;
    }

    public String serialize() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(serializeFullFilePath);
            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
            oos.writeObject(serializeObject);
            oos.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileName;
    }


    public String serialize(T object) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(serializeFullFilePath + ".ser");
            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
            oos.writeObject(object);
            oos.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return serializeFullFilePath;
    }

    public static Object deserialize(String fullFilePath) {
        try {
            FileInputStream fileInputStream = new FileInputStream(fullFilePath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String encrypt() {
        return encrypt.encrypt(serializeFullFilePath);
    }

    public String decrypt() {
        return encrypt.decrypt(serializeFullFilePath);
    }
}
