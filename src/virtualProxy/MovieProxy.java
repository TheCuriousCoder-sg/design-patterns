package virtualProxy;

public class MovieProxy implements Video{
    private String fileName;
    private Video video;

    public MovieProxy(String fileName) {
        System.out.println("Proxy Object Created");
        this.fileName = fileName;
    }

    @Override
    public void play() throws InterruptedException {
        if(video == null) {
            video = new Movies(fileName);
        }
        video.play();
    }
}
