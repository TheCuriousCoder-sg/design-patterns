package virtualProxy;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Video video1 = new MovieProxy("Shawshank Redemption.mp4");
        Video video2 = new MovieProxy("Golmaal.mp4");
        Video video3 = new MovieProxy("Prestige.mp4");

        video1.play();
        video2.play();
        video3.play();

        video1.play();
        video2.play();
        video3.play();
    }
}