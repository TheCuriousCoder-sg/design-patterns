import javax.naming.LimitExceededException;

public class Client {

    public void processTransaction(Payment payment, Double amount) {
        payment.pay(amount);
    }

    // Contract is already clear with LimitedPayment, hence exception handling done
    public void processTransaction(LimitedPayment payment, Double amount) throws LimitExceededException {
        payment.payWithLimit(amount);
    }
}
