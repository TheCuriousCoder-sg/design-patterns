public class NotificationClient {
    EmailNotification emailNotification = new EmailNotification();
    SmsNotification smsNotification = new SmsNotification();

    public void sendNotificationEmail() {
        emailNotification.send();
    }

    public void sendNotificationSms() {
        smsNotification.send();
    }
}
