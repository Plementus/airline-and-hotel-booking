/********************************************/
//	6/19/15 1:01 AM - Ibrahim Olanrewaju.
/********************************************/

package core;

import akka.util.Crypt;
import core.interfaces.Transaction;
import play.libs.F;
import play.libs.ws.WS;
import play.mvc.Http;

public class Payments {

    public void createTransaction() {

    }

    /*
     | Query GTBank Webservice to get detail of a Transaction
     | Return JSON data Format.
     */
    public F.Promise queryGTPay(String transRef, String amount) {
        return WS.url(Constants.GTPAY.QUERY_PAYMENT)
                .setHeader("Content-Type", Http.MimeTypes.JSON)
                .setQueryParameter("mertid", Constants.GTPAY.MERCHANT_ID)
                .setQueryParameter("amount", amount)
                .setQueryParameter("tranxid", transRef)
                .setQueryParameter("hash", Constants.GTPAY.HASH_KEY)
                .get();
    }


    /*
     | Generate Transaction reference for all system activity
     | Return String Data.
     */
    public static String generateTransactionRef() {
        return Crypt.md5(Utilities.getUnixTime());
//        return Crypto.encryptAES(Utilities.getUnixTime()).substring(1, 10) + Crypt.md5(Utilities.getUnixTime()).toLowerCase();
    }

    /*
     | For Basic Log Transaction.
     | This Method Log Transaction for Normal Customer Transaction.
     | Parameters are
     | String amount, String transRef, String customerId, String phone, String networkProviderId, String serviceCatId, String paymentMethod, String transTypeId, String batchId
     */
    public static Object logTransaction(String amount, String transRef, String customerId, String phone, String networkProviderId, String serviceCatId, String paymentMethod, String transTypeId, String batchId) {
//        Ebean.beginTransaction();
//        try {
//
//            Ebean.commitTransaction();
//        } catch (Exception exception) {
//            Ebean.rollbackTransaction();
//        }
        return null;
    }



    /*
      |
      | All Payment Processing should go through this standard.
     */
    public static class PaymentEnvelope {
        public String amount;
        public String serviceAmt;
        public String transRef;
        public String customerId;
        public String phone;
        public String networkProviderId;
        public String serviceCatId;
        public String paymentMethod;
        public String transTypeId;
        public String batchId;
        public String tokenCode;
        public String couponCode;
//        public Transactions.DispenseCategory dispenseCategory;
        public Transaction objectType;

        /*
          | Envelope for logging recharge request
         */
        public PaymentEnvelope(String amount, String transRef, String customerId, String phone, String networkProviderId, String serviceCatId, String paymentMethod, String transTypeId, String batchId, String tokenCode, String couponCode, Transaction objectType) {
            this.amount = amount;
            this.transRef = transRef;
            this.customerId = customerId;
            this.phone = phone;
            this.networkProviderId = networkProviderId;
            this.serviceCatId = serviceCatId;
            this.paymentMethod = paymentMethod;
            this.transTypeId = transTypeId;
            this.batchId = batchId;
            this.tokenCode = tokenCode;
            this.couponCode = couponCode;
            this.objectType = objectType;
        }

        /*
          | Envelope for logging recharge request with extra feature
        */
        public PaymentEnvelope(String amount, String transRef, String customerId, String phone, String networkProviderId, String serviceCatId, String paymentMethod, String transTypeId, String batchId, String tokenCode, String couponCode, Transaction objectType, Transactions dispenseCat) {
            this(amount, transRef, customerId, phone, networkProviderId, serviceCatId, paymentMethod, transTypeId, batchId, tokenCode, couponCode, objectType);
//            this.dispenseCategory = dispenseCategory;
        }

        /*
          | Envelope for UserAccounts PaymentHistories
         */
        public PaymentEnvelope(String amount, String transRef, String customerId, String serviceCatId, String paymentMethod, Transaction objectType) {
            this.amount = amount;
            this.transRef = transRef;
            this.customerId = customerId;
            this.paymentMethod = paymentMethod;
            this.serviceCatId = serviceCatId;
            this.objectType = objectType;
        }

    }
}
