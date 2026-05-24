public class NotificationFactory {

    public static Notification sendNotification(String type) {
        if(type.equals("EMAIL")) {
            return new EmailNotification();
        } else if(type.equals("SMS")) {
            return new SmsNotification();
        }

        throw new IllegalArgumentException("Invalid Type");
    }
}
