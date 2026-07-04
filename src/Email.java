public class Email extends Notification{
    public Email(EncryptionStrategy encryptionStrategy, CompressionStrategy compressionStrategy) {
        super(encryptionStrategy, compressionStrategy);
    }

    @Override
    public void send() {
        System.out.println("Sending Email");
    }
}
