public class MobileSubscriber implements Subscriber {
    private final String name;
    private final String deviceId;
    
    public MobileSubscriber(String name, String deviceId) {
        this.name = name;
        this.deviceId = deviceId;
    }
    
    @Override
    public void update(News news) {
        System.out.println("📱 PUSH NOTIFICATION 📱");
        System.out.println("User: " + name);
        System.out.println("Device: " + deviceId);
        System.out.println("Title: " + news.getTitle());
        System.out.println("Priority: " + news.getPriority());
        System.out.println("📱📱📱📱📱📱📱📱📱📱📱\n");
    }
    
    @Override
    public String getName() { return name; }
    
    @Override
    public String getContactInfo() { return deviceId; }
    
    @Override
    public String getType() { return "MOBILE"; }
}