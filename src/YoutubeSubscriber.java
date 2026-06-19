public class YoutubeSubscriber implements Subscriber{
    private String name;
    private int id;

    public YoutubeSubscriber(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void update(TheCuriousCoderChannel channel) {
        System.out.println("Upload Video" + " Title: " + channel.getVideoTitle() +
                " fileName: " + channel.getVideoFileName() + "Received notification by " + name + " Id: " + id);
    }
}
