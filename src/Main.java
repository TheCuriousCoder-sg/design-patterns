public class Main {
    public static void main(String[] args) {
        OrderService client = new OrderService();
        client.sendNotificationEmail();
        client.sendNotificationSms();
    }
}