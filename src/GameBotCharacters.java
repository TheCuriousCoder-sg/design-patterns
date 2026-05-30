public class GameBotCharacters {
    private String name;
    private int health;
    private int attackPower;

    public GameBotCharacters(String name, int health, int attackPower) {

        // Expensive Operations
        System.out.println("Loading character animations from DB...");
        System.out.println("Loading sound effects from DB...");
        System.out.println("Preparing AI battle Settings File...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error in thread");
        }

        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    @Override
    public String toString() {
        return "GameBotCharacters{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attackPower=" + attackPower +
                '}';
    }
}
