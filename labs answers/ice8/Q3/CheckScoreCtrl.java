
public class CheckScoreCtrl {
    private QuizDAO quizDAO;

    public CheckScoreCtrl() {
        quizDAO = new QuizDAO();
    }

    public double calculateDifferenceFromAverage(String studentName, String quizName) {
        Quiz quiz = quizDAO.retrieve(quizName);
        if (quiz == null) throw new IllegalArgumentException("No such quiz.");
        double avgScore = quiz.getAverageScore();
        Student std = quiz.getStudent(studentName);
        if (std == null) throw new IllegalArgumentException("No such student.");
        double score = std.getScore();
        return score - avgScore;
    }
}
