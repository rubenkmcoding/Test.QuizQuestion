package Test;

public class Main {

    public static void main(String[] args) {

    QuizService quizService = new QuizService();

        System.out.println("Welcome to the quiz\n");
        System.out.println("There are 10 addition/subtraction questions, " +
                "the answer to every question is an integer\n");

        quizService.createQuiz();
        quizService.administerQuiz();
        quizService.gradeQuiz();
    }
}