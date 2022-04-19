package core;

import play.libs.Crypto;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;


/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 21/12/2015 6:30 PM
 * |
 **/
public class Encrypt {

    @Inject
    public Crypto crypto;

    public String encrypt(String string) {
        return crypto.encryptAES(string);
    }

    public String decrypt(String encrypted) {
        return crypto.decryptAES(encrypted);
    }

}
