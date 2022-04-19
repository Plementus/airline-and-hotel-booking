package core;

import com.avaje.ebean.annotation.EnumValue;
import models.NotificationAction;
import models.Users;

import java.util.List;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/9/15 11:22 PM
 * |
 **/

public class Notification {

    public Users actor;

    public List<Users> recipient_users;

    private String makeUrl() {
        return null;
    }

    /*
      | Run the notification from the Observer Pattern.
     */
    public void run(NotificationEnvelope notify) {

    }

    private String makeMessage(NotificationAction action) {
        String returnStr = null;
        switch (action) {
            case NEW_ACCOUNT:
                returnStr = "%s New account has been created for use";
                break;
            case ACCOUNT_ACTIVATED:
                returnStr = "%s account has been activated.";
                break;
            case  NEW_SUPPORT_TICKET:
                returnStr = "%s has created a new support ticket";
                break;
            case  NEW_SUPPORT_MESSAGE:
                returnStr = "%s has reply to a support ticket";
                break;
        }
        return returnStr;
    }

    public static class NotificationEnvelope {

        public Users actor;

        public String notificationMessage;

        public NotificationAction notificationAction;

        public String actionRoute;

        public String actionParam;

        public String actionUrlString;

        public List<Users> recipients;

        public Users recipient;

        public NotificationEnvelope(Users actor, NotificationAction action, Users recipient, String actionRoute, String actionParam, String actionUrlString) {
            this.actor = actor;
            this.notificationAction = action;
            this.recipient = recipient;
            this.actionRoute = actionRoute;
            this.actionParam = actionParam;
            this.actionUrlString = actionUrlString;
        }

        public NotificationEnvelope(Users actor, NotificationAction action, List<Users> recipients, String actionRoute, String actionParam, String actionUrlString) {
            new NotificationEnvelope(actor, action, recipients.get(0), actionRoute, actionParam, actionUrlString);
            this.actor = actor;
            this.notificationAction = action;
            this.recipients = recipients;
            this.actionRoute = actionRoute;
            this.actionParam = actionParam;
            this.actionUrlString = actionUrlString;
        }
    }
}
