/**
 * Created by Ibrahim Olanrewaju on 4/4/2016.
 */

package core.gdsbookingengine.clients.amadeus;

import play.Configuration;
import play.Play;

public class BasePOSBuilder {
  protected static final Configuration config = Play.application().configuration();
  public static final String NAME = config.getString("amadeus.api.name");
  public static final String PCC = config.getString("amadeus.api.pseudoCityCode");
  public static final String SYSTEM = config.getString("amadeus.system");
  public static final String USERNAME = config.getString("amadeus.api.provider.userID");
  public static final String PASSWORD = config.getString("amadeus.api.provider.password");
  public static final String REQUESTOR_TYPE = config.getString("amadeus.api.requestor.type");
  public static final String CURRENCY = config.getString("amadeus.api.currency.naira");
}
