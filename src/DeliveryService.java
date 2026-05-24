public class DeliveryService {

    public void sendNotification() {
        Notification notification = NotificationFactory.sendNotification("SMS");
        notification.send();
    }
}
