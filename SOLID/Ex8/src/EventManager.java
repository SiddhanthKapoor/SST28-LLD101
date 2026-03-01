public class EventManager implements EventsTool {
    int count = 0;
    public void createEvent(String eventName, int budget) {
        count++;
        System.out.println("Event created: " + eventName + " (budget=" + budget + ")");
    }
    public int getEventCount() {
        return count;
    }
}
