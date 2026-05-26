public class OrderService {

    public void sendNotification() {
        NotificationFactory factory = new SmsFactory();
        Notification notification = factory.createNotification();
        Template template = factory.createTemplate();
        notification.send();
        template.format();
    }
}
