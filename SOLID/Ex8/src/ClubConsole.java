public class ClubConsole {
    FinanceTool ft;
    MinutesTool mt;
    EventsTool et;
    
    public ClubConsole(FinanceTool f, MinutesTool m, EventsTool e) {
        this.ft = f;
        this.mt = m;
        this.et = e;
    }
    
    public void showSummary() {
        System.out.println("Summary: ledgerBalance=" + ft.getBalance() + 
            ", minutes=" + mt.getMinuteCount() + 
            ", events=" + et.getEventCount());
    }
}
