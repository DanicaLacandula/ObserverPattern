public class EmailSubscriber implements Subscriber {
    private final String name;
    private final String email;
    
    public EmailSubscriber(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    @Override
    public void update(News news) {
        System.out.println("--- EMAIL NOTIFICATION ---");
        System.out.println("To: " + email);
        System.out.println("Subject: " + (news.isBreakingNews() ? "[BREAKING] " : "") + news.getTitle());
        System.out.println("Content: " + news.getContent());
        System.out.println("Category: " + news.getCategory());
        System.out.println("Published: " + news.getFormattedTime());
        System.out.println("---------------------------\n");
    }
    
    @Override
    public String getName() { return name; }
    
    @Override
    public String getContactInfo() { return email; }
    
    @Override
    public String getType() { return "EMAIL"; }
}