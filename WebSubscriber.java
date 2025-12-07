public class WebSubscriber implements Subscriber {
    private final String name;
    private final String sessionId;
    
    public WebSubscriber(String name, String sessionId) {
        this.name = name;
        this.sessionId = sessionId;
    }
    
    @Override
    public void update(News news) {
        System.out.println("🌐 WEB SOCKET NOTIFICATION 🌐");
        System.out.println("User: " + name);
        System.out.println("Session: " + sessionId.substring(0, Math.min(8, sessionId.length())) + "...");
        System.out.println("News Update: " + news.getTitle());
        System.out.println("Full article available at /news");
        System.out.println("🌐🌐🌐🌐🌐🌐🌐🌐🌐🌐🌐🌐\n");
    }
    
    @Override
    public String getName() { return name; }
    
    @Override
    public String getContactInfo() { return sessionId; }
    
    @Override
    public String getType() { return "WEB"; }
}