public class MeetingMinutes implements MinutesTool {
    int count = 0;
    public void addMinutes(String min) {
        count++;
        System.out.println("Minutes added: \"" + min + "\"");
    }
    public int getMinuteCount() {
        return count;
    }
}
