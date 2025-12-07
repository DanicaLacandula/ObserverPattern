public class Main {
    public static void main(String[] args) {
        // Create news agency
        NewsAgency cnn = new NewsAgency("CNN Philippines");
        
        // Create subscribers with different notification methods
        Subscriber alice = new EmailSubscriber("Alice Johnson", "alice@email.com");
        Subscriber bob = new MobileSubscriber("Bob Smith", "DEVICE-12345");
        Subscriber charlie = new WebSubscriber("Charlie Brown", "SESSION-ABCDEF123456");
        Subscriber maria = new MobileSubscriber("Maria Santos", "DEVICE-PH67890");
        
        // Subscribe to news agency
        cnn.subscribe(alice);
        cnn.subscribe(bob);
        cnn.subscribe(charlie);
        cnn.subscribe(maria);
        
        System.out.println("\n=== INITIAL SUBSCRIPTIONS ===");
        System.out.println("Total subscribers: " + cnn.getSubscriberCount());
        
        // Publish typhoon news as breaking news
        cnn.publishNews(
            "TYPHOON KARDING (Noru) Makes Landfall in Aurora",
            "Typhoon Karding (International Name: Noru) has made landfall in Aurora province with sustained winds of 175 km/h and gusts up to 215 km/h. Signal No. 3 raised in multiple provinces.",
            "WEATHER",
            "BREAKING"
        );
        
        // Publish normal news
        cnn.publishNews(
            "Tech Giant Unveils Revolutionary AI Assistant",
            "A major tech company announced a breakthrough AI assistant that understands context and emotions with unprecedented accuracy.",
            "TECHNOLOGY",
            "HIGH"
        );
        
        // Dynamic subscription change
        cnn.unsubscribe(charlie);
        
        System.out.println("\n=== AFTER UNSUBSCRIBE ===");
        System.out.println("Total subscribers: " + cnn.getSubscriberCount());
        
        // Publish typhoon update
        cnn.publishNews(
            "Typhoon Karding Update: Signal No. 4 Raised in Quezon",
            "PAGASA has raised Tropical Cyclone Wind Signal No. 4 over Polillo Islands and the northern portion of Quezon. Heavy to intense rainfall expected.",
            "WEATHER",
            "BREAKING"
        );
        
        // Publish evacuation news
        cnn.publishNews(
            "Massive Evacuations Underway in Central Luzon",
            "Over 10,000 families evacuated as Typhoon Karding intensifies. Evacuation centers activated in Bulacan, Pampanga, and Tarlac.",
            "DISASTER",
            "HIGH"
        );
        
        // Add new subscriber dynamically
        Subscriber juan = new EmailSubscriber("Juan Dela Cruz", "juan.delacruz@email.com");
        cnn.subscribe(juan);
        
        // Publish relief operations news
        cnn.publishNews(
            "Government Mobilizes Relief Operations for Typhoon-Affected Areas",
            "The NDRRMC has deployed relief teams and prepositioned supplies in anticipation of Typhoon Karding's impact. DSWD ready with 50,000 food packs.",
            "GOVERNMENT",
            "NORMAL"
        );
        
        // Publish power outage news
        cnn.publishNews(
            "Power Outages Reported in Multiple Provinces",
            "MERALCO reports power interruptions in affected areas for safety. Restoration teams on standby once weather conditions improve.",
            "UTILITIES",
            "NORMAL"
        );
        
        // Publish final typhoon update
        cnn.publishNews(
            "Typhoon Karding Exits PAR, Signal Warnings Lowered",
            "Typhoon Karding has exited the Philippine Area of Responsibility (PAR). All tropical cyclone wind signals have been lowered. Cleanup operations begin.",
            "WEATHER",
            "NORMAL"
        );
        
        // Publish sports news
        cnn.publishNews(
            "Gilas Pilipinas Wins FIBA Asia Cup Qualifiers",
            "The Philippine national basketball team secured a victory in the FIBA Asia Cup qualifiers, moving closer to championship contention.",
            "SPORTS",
            "NORMAL"
        );
        
        // Final stats
        System.out.println("\n=== FINAL STATISTICS ===");
        System.out.println("Total news published: 8");
        System.out.println("Current subscribers: " + cnn.getSubscriberCount());
        System.out.println("Typhoon-related news: 4");
    }
}