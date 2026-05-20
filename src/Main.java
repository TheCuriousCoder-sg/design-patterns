import javax.naming.LimitExceededException;

public class Main {
    public static void main(String[] args) throws LimitExceededException {
        Client c = new Client();
        c.processTransaction(new Upi(), 100.0);
        c.processTransaction(new CreditCard(), 100.0);
    }
}