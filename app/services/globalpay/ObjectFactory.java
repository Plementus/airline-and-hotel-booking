
package services.globalpay;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_eazypaynigeria_com.globalpay package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.www_eazypaynigeria_com.globalpay
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PostTransactionGlobalPay }
     * 
     */
    public PostTransactionGlobalPay createPostTransactionGlobalPay() {
        return new PostTransactionGlobalPay();
    }

    /**
     * Create an instance of {@link PostTransactionGlobalPayResponse }
     * 
     */
    public PostTransactionGlobalPayResponse createPostTransactionGlobalPayResponse() {
        return new PostTransactionGlobalPayResponse();
    }

    /**
     * Create an instance of {@link GetTransactions }
     * 
     */
    public GetTransactions createGetTransactions() {
        return new GetTransactions();
    }

    /**
     * Create an instance of {@link GetTransactionsResponse }
     * 
     */
    public GetTransactionsResponse createGetTransactionsResponse() {
        return new GetTransactionsResponse();
    }

}
