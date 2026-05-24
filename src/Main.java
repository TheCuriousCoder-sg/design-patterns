public class Main {
    public static void main(String[] args) {
        OrderService orderServiceClient = new OrderService();
        orderServiceClient.sendNotification();

        DeliveryService deliveryServiceClient = new DeliveryService();
        deliveryServiceClient.sendNotification();
    }
}