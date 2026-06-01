import java.util.ArrayList;
import java.util.List;

public class GameBotCharacters implements Cloneable<GameBotCharacters>{
    private String name;
    private int health;
    private int attackPower;
    private List<String> weapons;

    public GameBotCharacters(String name, int health, int attackPower, List<String> weapons) {

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
        this.weapons = weapons;
    }

    private GameBotCharacters(GameBotCharacters gbc) {
        this.name = gbc.name;
        this.health = gbc.health;
        this.attackPower = gbc.attackPower;
        this.weapons = new ArrayList<>(gbc.weapons);
    }

    @Override
    public GameBotCharacters customizedClone() {
        return new GameBotCharacters(this);
    }

    @Override
    public String toString() {
        return "GameBotCharacters{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attackPower=" + attackPower +
                ", weapons=" + weapons +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public List<String> getWeapons() {
        return weapons;
    }
}
