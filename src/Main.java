public class Main {
    public static void main(String[] args) {
        NotificationClient client = new NotificationClient();
        client.sendNotificationEmail();
        client.sendNotificationSms();
    }
}