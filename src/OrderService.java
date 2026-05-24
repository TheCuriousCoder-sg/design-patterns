import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderService {

    public void sendNotification() {
        List<Notification> notifications = NotificationFactory.sendNotification(new ArrayList<>(Arrays.asList("EMAIL", "SMS")));
        for(Notification notification: notifications) {
            notification.send();
        }
    }
}
