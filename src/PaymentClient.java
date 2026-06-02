public class PaymentClient {
    Payment payment;

    public void makePayment() {
        String result = payment.pay(100.0, 123);

        if(result.equals("SUCCESS")) {
            System.out.println("Payment done successfully");
        } else {
            System.out.println("Payment Failed");
        }
    }
}
