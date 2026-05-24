import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderService {

    public void sendNotification() {
        Notification notification = NotificationFactory.sendNotification("SMS");
        notification.send();
    }
}
