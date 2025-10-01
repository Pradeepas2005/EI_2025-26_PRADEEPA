import java.util.List;
import java.util.ArrayList;

class YouTubeChannel implements Subject {
    private List<Observer> subscribers = new ArrayList<Observer>();
    private String channelName;

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Observer o) {
        subscribers.add(o);
        System.out.println(((Subscriber) o).getName() + " subscribed to " + channelName);
    }

    @Override
    public void unsubscribe(Observer o) {
        subscribers.remove(o);
        System.out.println(((Subscriber) o).getName() + " unsubscribed from " + channelName);
    }

    @Override
    public void notifySubscribers(String message) {
        for (Observer o : subscribers) {
            o.update(channelName + " uploaded: " + message);
        }
    }

    public void uploadVideo(String videoName) {
        System.out.println("\n" + channelName + " uploaded new video: " + videoName);
        notifySubscribers(videoName);
    }
}
