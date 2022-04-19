/**
 * 2/3/2016.
 */

package services.sabre.client;

import play.Configuration;
import play.Play;

import java.time.LocalDateTime;
import java.util.UUID;

public class SabreClient {
  protected static Configuration config = Play.application().configuration();
  protected static String ENDPOINT_URL = config.getString("sabre.endpoint");
  protected static String SERVICE_TYPE = config.getString("sabre.serviceType");
  protected static String DOMAIN = config.getString("sabre.domain");
  protected static String SABRE_PCC = config.getString("sabre.pcc");
  protected static String USERNAME = config.getString("sabre.username");
  protected static String PASSWORD = config.getString("sabre.password");
  protected static String CONVERSATION_ID = config.getString("sabre.conversationId");
  protected static String PARTY_ID_TYPE = config.getString("sabre.partyIdType");
  protected static String PARTY_ID_TO = config.getString("sabre.partyIdTo");
  protected static String PARTY_ID_FROM = config.getString("partyIdFrom");
  protected static String CURRENCY = config.getString("sabre.currency");
  protected static String AGENCY_NAME = config.getString("sabre.agency.name");

  protected static String getMessageId() {
    return UUID.randomUUID().toString() + "@travelfix.co";
  }

  protected static String getMessageTimeStamp() {
    return LocalDateTime.now().toString() + "Z";
  }
}
