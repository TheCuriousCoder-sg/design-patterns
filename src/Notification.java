public abstract class Notification {
    EncryptionStrategy encryptionStrategy;
    CompressionStrategy compressionStrategy;

    public Notification(EncryptionStrategy encryptionStrategy, CompressionStrategy compressionStrategy) {
        this.encryptionStrategy = encryptionStrategy;
        this.compressionStrategy = compressionStrategy;
    }

    abstract void send();

    void encrypt() {
        encryptionStrategy.encrypt();
    }

    void compress() {
        compressionStrategy.compress();
    }
}
