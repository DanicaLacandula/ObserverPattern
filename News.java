import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class News {
    private final String title;
    private final String content;
    private final String category;
    private final String priority;
    private final LocalDateTime publishedAt;
    
    public News(String title, String content, String category, String priority) {
        this.title = title;
        this.content = content;
        this.category = category;
        this.priority = priority;
        this.publishedAt = LocalDateTime.now();
    }
    
    public String getTitle() { return title; }
    public String getContent() { return content; }
    public String getCategory() { return category; }
    public String getPriority() { return priority; }
    public LocalDateTime getPublishedAt() { return publishedAt; }
    
    public boolean isBreakingNews() {
        return "BREAKING".equals(priority);
    }
    
    public String getFormattedTime() {
        return publishedAt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}