public class DeliveryService {

    public void sendNotification() {
        NotificationFactory factory = new EmailFactory();
        Notification notification = factory.createNotification();
        Template template = factory.createTemplate();
        notification.send();
        template.format();
    }
}
