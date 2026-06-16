public enum Singleton {
    INSTANCE;

    public void show() {
        System.out.println("Singleton Method Called");
    }
}

/*
INTERNALLY INSTANCE LOOKS LIKE THIS

final class Singleton extends Enum<Singleton> {

    public static final Singleton INSTANCE =
            new Singleton();

    private Singleton() {
    }
}
 */
