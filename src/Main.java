public class Main {
    public static void main(String[] args) {
        YoutubeSubscriber subscriber1 = new YoutubeSubscriber("Naman", 1);
        YoutubeSubscriber subscriber2 = new YoutubeSubscriber("Harshit", 2);
        YoutubeSubscriber subscriber3 = new YoutubeSubscriber("Manvi", 3);
        YoutubeSubscriber subscriber4 = new YoutubeSubscriber("Chahat", 4);

        TheCuriousCoderChannel theCuriousCoderChannel = new TheCuriousCoderChannel();
        theCuriousCoderChannel.subscribe(subscriber1);
        theCuriousCoderChannel.subscribe(subscriber2);
        theCuriousCoderChannel.subscribe(subscriber3);
        theCuriousCoderChannel.subscribe(subscriber4);

        theCuriousCoderChannel.uploadVideo("Observer pattern",
                "Observer.mp4");
    }
}