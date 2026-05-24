public class DeliveryService {

    public void sendNotification() {
        Notification notification = NotificationFactory.sendNotification("EMAIL");
        notification.send();
    }
}
