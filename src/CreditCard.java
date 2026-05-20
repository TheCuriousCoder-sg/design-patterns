import javax.naming.LimitExceededException;

public class CreditCard implements LimitedPayment {

    @Override
    public void payWithLimit(Double amount) throws LimitExceededException {
        if(amount<getMaximumLimit()) {
            System.out.println("Credit Card Payment Done for amount: " + amount);
        } else {
            throw new LimitExceededException("Amount cannot exceed" + getMaximumLimit());
        }
    }

    @Override
    public Double getMaximumLimit() {
        return 100000.0;
    }

}
