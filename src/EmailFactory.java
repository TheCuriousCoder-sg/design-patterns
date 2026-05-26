public class EmailFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }

    @Override
    public Template createTemplate() {
        return new EmailTemplate();
    }
}
