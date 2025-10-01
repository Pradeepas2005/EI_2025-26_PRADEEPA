public class Main {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel("TechWorld");

        Observer s1 = new Subscriber("Axe");
        Observer s2 = new Subscriber("Bav");
        Observer s3 = new Subscriber("Charlie");

        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);

        channel.uploadVideo("Observer Pattern in Java");
        channel.uploadVideo("Strategy Pattern Explained");

        channel.unsubscribe(s2);

        channel.uploadVideo("Command Pattern Tutorial");
    }
}
