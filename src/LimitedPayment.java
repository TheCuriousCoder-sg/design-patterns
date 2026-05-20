import javax.naming.LimitExceededException;

public interface LimitedPayment  {
    Double getMaximumLimit();
    void payWithLimit(Double amount) throws LimitExceededException;
}
