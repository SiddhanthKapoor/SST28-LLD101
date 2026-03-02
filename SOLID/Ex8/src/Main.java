public class Main {
    public static void main(String[] args) {
        System.out.println("=== Club Admin ===");
        
        Ledger l = new Ledger();
        MeetingMinutes m = new MeetingMinutes();
        EventManager e = new EventManager();
        
        l.addMoney(5000, "sponsor");
        m.addMinutes("Meeting at 5pm");
        e.createEvent("HackNight", 2000);
        
        ClubConsole c = new ClubConsole(l, m, e);
        c.showSummary();
    }
}
