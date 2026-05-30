public class Main {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        GameBotCharacters gbc1 = new GameBotCharacters("Bot1", 100,
                30);
        GameBotCharacters gbc2 = new GameBotCharacters("Bot2", 100,
                30);
        GameBotCharacters gbc3 = new GameBotCharacters("Bot3", 100,
                30);
        GameBotCharacters gbc4 = new GameBotCharacters("Bot4", 100,
                30);
        GameBotCharacters gbc5 = new GameBotCharacters("Bot5", 100,
                20);

        long endTime = System.currentTimeMillis();

        System.out.println(endTime-startTime);
    }
}