public class OrderService {

    public void sendNotification() {
        Notification notification = NotificationFactory.sendNotification("SMS");
        notification.send();
    }
}
