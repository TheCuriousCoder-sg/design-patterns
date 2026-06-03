public class PaypalAdapter implements PaymentService{
    PaypalGateway paypalGateway;

    public PaypalAdapter(PaypalGateway paypalGateway) {
        this.paypalGateway = paypalGateway;
    }

    @Override
    public String pay(int amount, int customerId) {
        int result = paypalGateway.doTransaction(Double.valueOf(amount), customerId);
        if(result==1) {
            return "SUCCESS";
        }
        return "FAILED";
    }
}
