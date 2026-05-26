public class SmsFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }

    @Override
    public Template createTemplate() {
        return new SmsTemplate();
    }
}
