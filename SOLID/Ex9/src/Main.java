public class Main {
    public static void main(String[] args) {
        System.out.println("=== Evaluation Pipeline ===");
        EvaluationPipeline pipeline = new EvaluationPipeline(
            new StandardPlagiarismChecker(),
            new StandardGrader(),
            new FileReportWriter()
        );
        pipeline.evaluate(new Submission("23BCS1007"));
    }
}