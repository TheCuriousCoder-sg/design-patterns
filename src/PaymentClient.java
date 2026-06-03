public class PaymentClient {
    PaymentService payment;

    public PaymentClient(PaymentService payment) {
        this.payment = payment;
    }

    public void makePayment() {
        String result = payment.pay(100, 123);

        if(result.equals("SUCCESS")) {
            System.out.println("Payment done successfully");
        } else {
            System.out.println("Payment Failed");
        }
    }
}
