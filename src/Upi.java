public class Upi implements Payment {
    @Override
    public void pay(Double amount) {
        System.out.println("UPI Payment Done: " + amount);
    }
}

