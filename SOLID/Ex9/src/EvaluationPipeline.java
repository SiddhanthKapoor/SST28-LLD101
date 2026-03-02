public class EvaluationPipeline {
    PlagiarismChecker pc;
    Grader g;
    ReportWriter rw;

    public EvaluationPipeline(PlagiarismChecker pc, Grader g, ReportWriter rw) {
        this.pc = pc;
        this.g = g;
        this.rw = rw;
    }

    public void evaluate(Submission s) {
        int pScore = pc.check(s);
        int cScore = g.grade(s);
        rw.write(s, pScore + cScore);
    }
}