package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import controllers.abstracts.BaseController;
import core.Mailer;
import core.ShoppingCart;
import models.FlightBookings;
import models.PaymentHistories;
import models.PaymentStatus;
import org.apache.commons.codec.digest.DigestUtils;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import play.Logger;
import play.data.DynamicForm;
import play.libs.F;
import play.libs.Json;
import play.libs.ws.WS;
import play.libs.ws.WSResponse;
import play.mvc.Result;
import services.globalpay.ServiceSoap;
import views.html.flights.payment_confirmation;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Objects;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 06/01/2016 5:56 PM
 * |
 **/
public class PaymentControllers extends BaseController {

    private static F.Promise<WSResponse> reQueryGTPay(String transRef, String amt) {
        String merchantId = playConfig.getString("gtpay.merchantId");
        return WS.url("https://ibank.gtbank.com/GTPayService/gettransactionstatus.json")
                .setQueryParameter("mertid", merchantId)
                .setQueryParameter("amount", Objects.toString(Double.valueOf(amt) * 100))
                .setQueryParameter("tranxid", transRef)
                .setQueryParameter("hash", DigestUtils.sha512Hex(merchantId + transRef + playConfig.getString("gtpay.hashKey")))
                .setRequestTimeout(50000)
                .get();
    }

    @play.filters.csrf.AddCSRFToken
    public static F.Promise<Result> getTransactionResponse(String gatewayName) {
        response().setHeader("Csrf-Token", "nocheck");
        DynamicForm resp = DynamicForm.form().bindFromRequest();
        if (gatewayName.equalsIgnoreCase("gtpay")) {
            String txnref = resp.get("gtpay_tranx_id");
            return reQueryGTPay(txnref, resp.get("gtpay_tranx_amt")).map(new F.Function<WSResponse, Result>() {
                @Override
                public Result apply(WSResponse wsResponse) throws Throwable {
                    final JsonNode gtJson = wsResponse.asJson();
                    PaymentStatus paymentStatus = PaymentStatus.Failed;
                    String gtResponseCode = gtJson.get("ResponseCode").asText();
                    String gtResponseDesc = gtJson.get("ResponseDescription").asText();
                    String gtTransCurrency = gtJson.get("TransactionCurrency").asText();
                    String gtAmount = gtJson.get("Amount").asText();
                    PaymentHistories paymentHistories = PaymentHistories.find.where().eq("trans_ref", txnref).findUnique();
                    if (paymentHistories != null) {
                        if (gtResponseCode.equals(playConfig.getString("gtpay.response.success")) || gtResponseCode.equalsIgnoreCase("10") || gtResponseCode.equalsIgnoreCase("11")) {
                            paymentHistories.status = PaymentStatus.Success;
                            paymentStatus = PaymentStatus.Success;
                            paymentHistories.amount_paid = Double.valueOf(gtAmount) / 100;
                        } else {
                            paymentHistories.status = PaymentStatus.Failed;
                            paymentStatus = PaymentStatus.Failed;
                        }
                        paymentHistories.gateway_response_amt = resp.get("gtpay_tranx_amt");
                        paymentHistories.gateway_response_desc = resp.get("gtpay_tranx_status_msg");
                        paymentHistories.gateway_response_code = resp.get("gtpay_tranx_status_code");
                        paymentHistories.eft_api_response = "" + Json.toJson(resp.data());
                        paymentHistories.update();
                    }
                    return ok(payment_confirmation.render(paymentStatus, paymentHistories, gtResponseDesc));
                }
            });
        } else {
            return F.Promise.promise(() -> {
                String transRef = request().getQueryString("txnref");
                String transDesc = "";
                PaymentStatus paymentStatus = PaymentStatus.Pending;
                PaymentHistories paymentHistories = PaymentHistories.find.where().eq("trans_ref", transRef).findUnique();
                if (paymentHistories != null) {
                    ServiceSoap serviceSoap = new services.globalpay.Service().getServiceSoap();
                    String channel = "";
                    String merchtId = playConfig.getInt("globalPay.merchantId").toString();
                    String startDate = "";
                    String endDate = "";
                    String uid = "tc_ws_user";
                    String pwd = "tc_ws_password";
                    String paystatus = "";
                    String transactionStatus = serviceSoap.getTransactions(transRef, channel, merchtId, startDate, endDate, uid, pwd, paystatus);
                    paymentHistories.eft_api_response = transactionStatus;
                    String pStatus = ""; //payment status from the payment gateway
                    try {
                        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                        DocumentBuilder db = dbf.newDocumentBuilder();
                        InputSource is = new InputSource();
                        is.setCharacterStream(new StringReader(transactionStatus));

                        Document doc = db.parse(is);
                        Element element = (Element) doc.getElementsByTagName("payment_status").item(0);
                        pStatus = getCharacterDataFromElement(element);
                        transDesc = getCharacterDataFromElement((Element) doc.getElementsByTagName("payment_status_description").item(0));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (pStatus.equalsIgnoreCase("successful")) {
                        paymentHistories.status = PaymentStatus.Success;
                        paymentStatus = PaymentStatus.Success;
                        FlightBookings bookings = FlightBookings.find.where().eq("tfx_ticket_ref", transRef).findUnique();
                        if (bookings != null) {
                            Mailer.sendMail(new Mailer.Envelop(bookings.contact_email, views.html.emails.payment_confirmation.render(bookings, paymentHistories).body(), bookings.contact_email));
                        }
                    } else if (pStatus.equalsIgnoreCase("pending")) {
                        paymentHistories.status = PaymentStatus.Pending;
                        paymentStatus = PaymentStatus.Pending;
                    } else {
                        paymentHistories.status = PaymentStatus.Failed;
                        paymentStatus = PaymentStatus.Failed;
                    }
                    paymentHistories.update();
                }
                ShoppingCart.getInstance(request()).clearUserCart();
                return ok(payment_confirmation.render(paymentStatus, paymentHistories, transDesc));
            });
        }
    }

    public static String getCharacterDataFromElement(Element e) {
        Node child = e.getFirstChild();
        if (child instanceof CharacterData) {
            CharacterData cd = (CharacterData) child;
            return cd.getData();
        }
        return "";
    }
}
