public class Sms extends Notification {

    public Sms(EncryptionStrategy encryptionStrategy, CompressionStrategy compressionStrategy) {
        super(encryptionStrategy, compressionStrategy);
    }

    @Override
    public void send() {
        System.out.println("Sending SMS");
    }
}
