public interface Subscriber {
    void update(News news);
    String getName();
    String getContactInfo();
    String getType();
}