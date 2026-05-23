public class OrderService {
    EmailNotification emailNotification = new EmailNotification();
    SmsNotification smsNotification = new SmsNotification();

    public void sendNotificationEmail() {
        emailNotification.send();
    }

    public void sendNotificationSms() {
        smsNotification.send();
    }
}
