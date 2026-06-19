import java.util.ArrayList;
import java.util.List;

public class TheCuriousCoderChannel {
    private String videoTitle;
    private String videoFileName;

    public String getVideoTitle() {
        return videoTitle;
    }

    public String getVideoFileName() {
        return videoFileName;
    }

    List<Subscriber> subscriberList = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    public void notifySubscribers() {
        for(Subscriber subscriber: subscriberList) {
            subscriber.update(this);
        }
    }

    public void uploadVideo(String videoTitle, String videoFileName) {
        this.videoTitle = videoTitle;
        this.videoFileName = videoFileName;

        System.out.println("Video has been uploaded");
        notifySubscribers();
    }
}
