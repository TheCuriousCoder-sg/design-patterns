import java.util.ArrayList;
import java.util.List;

public class NotificationFactory {

    public static Notification sendNotification(String type) {
        if(type.equals("EMAIL")) {
            return new EmailNotification();
        } else if(type.equals("SMS")) {
            return new SmsNotification();
        }

        throw new IllegalArgumentException("Invalid Type");
    }

    public static List<Notification> sendNotification(List<String> types) {
        List<Notification> notifications = new ArrayList<>();

        for(String type: types) {
            if(type.equals("EMAIL")) {
                notifications.add(new EmailNotification());
            } else if(type.equals("SMS")) {
                notifications.add(new SmsNotification());
            } else {
                throw new IllegalArgumentException("Invalid Type");
            }
        }

        return notifications;
    }
}
