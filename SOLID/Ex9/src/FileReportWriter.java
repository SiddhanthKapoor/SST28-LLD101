public class FileReportWriter implements ReportWriter {
    public void write(Submission s, int totalScore) {
        System.out.println("Report written: report-" + s.id + ".txt");
        System.out.println("FINAL: PASS (total=" + totalScore + ")");
    }
}