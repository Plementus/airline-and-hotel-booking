/********************************************/
//	7/23/15 1:44 AM - Ibrahim Olanrewaju.
/********************************************/

package core;

import play.libs.Akka;
import play.libs.ws.WS;
import play.mvc.Http;
import scala.concurrent.duration.Duration;
import scala.concurrent.duration.FiniteDuration;
import java.util.concurrent.TimeUnit;

public class SmsSender {

    private static final int DELAY = 5;

    public static void sendSms(SmsEnvelope envelope) {
        final FiniteDuration duration = Duration.apply(DELAY, TimeUnit.SECONDS);
        SmsEnvelopeJob job = new SmsEnvelopeJob(envelope);
        Akka.system().scheduler().scheduleOnce(duration, job, Akka.system().dispatcher());
    }

    public static class SmsEnvelope {

        private String phone;

        private String text;

        private String sender = Constants.SMS_GATEWAY.SENDER;

        public SmsEnvelope(String phone, String text) {
            this.phone = phone;
            this.text = text;
        }

        public SmsEnvelope(String phone, String text, String sender) {
            this(phone, text);
            this.sender = sender;
        }

    }


    private static class SmsEnvelopeJob implements Runnable {

        private SmsEnvelope envelope;

        public SmsEnvelopeJob(SmsEnvelope env) {
            envelope = env;
        }

        @Override
        public void run() {
            WS.url(Constants.SMS_GATEWAY.URL).setQueryParameter("username", Constants.SMS_GATEWAY.USERNAME)
                    .setQueryParameter("password", Constants.SMS_GATEWAY.PASSWORD)
                    .setQueryParameter("sender", envelope.sender)
                    .setQueryParameter("message", envelope.text)
                    .setQueryParameter("recipient", envelope.phone)
                    .setHeader("Users-Agent", Http.HeaderNames.USER_AGENT).execute();
        }

    }
}
