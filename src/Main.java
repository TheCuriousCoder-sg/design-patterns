import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        GameBotCharacters gbc1 = new GameBotCharacters("Bot1", 100,
                0, new ArrayList<>(Arrays.asList("Rifle")));
        GameBotCharacters gbc2 = gbc1.customizedClone();
        gbc2.setName("Bot2");
        GameBotCharacters gbc3 = gbc1.customizedClone();
        gbc3.setName("Bot3");
        GameBotCharacters gbc4 = gbc1.customizedClone();
        gbc4.setName("Bot4");
        GameBotCharacters gbc5 = gbc1.customizedClone();
        gbc5.setName("Bot5");
        List<String> weapons = gbc5.getWeapons();
        weapons.add("Sniper");

        System.out.println(gbc1);
        System.out.println(gbc2);
        System.out.println(gbc3);
        System.out.println(gbc4);
        System.out.println(gbc5);

        long endTime = System.currentTimeMillis();

        System.out.println("Total Time Taken" + (endTime-startTime));
    }
}