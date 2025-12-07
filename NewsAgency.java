import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private final String name;
    private final List<Subscriber> subscribers;
    
    public NewsAgency(String name) {
        this.name = name;
        this.subscribers = new ArrayList<>();
    }
    
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber.getName() + " subscribed via " + subscriber.getType());
    }
    
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println(subscriber.getName() + " unsubscribed");
    }
    
    public void publishNews(String title, String content, String category, String priority) {
        News news = new News(title, content, category, priority);
        
        System.out.println("\n=== " + name.toUpperCase() + " PUBLISHING NEWS ===");
        System.out.println("Breaking News: " + news.getTitle());
        System.out.println("Priority: " + priority);
        System.out.println("====================================\n");
        
        // Notify all subscribers
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }
    
    public int getSubscriberCount() {
        return subscribers.size();
    }
}