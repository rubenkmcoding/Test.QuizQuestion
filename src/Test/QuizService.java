package Test;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class QuizService {

    private  QuizQuestion[] questions;
    private  int[] userAnswers;
    private  Scanner scanner = new Scanner(System.in);

    public QuizService() {
    }

    public  void createQuiz() {
        questions = new QuizQuestion[10];
        for (int i = 0; i < 10; i++) {
            if (Math.random() < 0.5) {
                questions[i] = new AddItionQuestion();
            } else {
                questions[i] = new SubStrationQuestion();
            }
        }
    }

    public  int getAnInteger() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.print("That’s not an integer. Try again: ");
            }
        }
    }

    public  void administerQuiz() {
        userAnswers = new int[10];
        for (int i = 0; i < 10; i++) {
            int questionNumber = i + 1;
            System.out.printf("Question %2d: %s", questionNumber, questions[i].getQuestion());
            userAnswers[i] =  getAnInteger();
        }
    }

    public  void gradeQuiz() {
        System.out.println("\nHere are te correct answers\n");
        int numberCorrect = 0;
        int grade;
        for (int i = 0; i < 10; i++) {
            System.out.println("Question number " + (i + 1) + ": " + questions[i].getQuestion());
            if (userAnswers[i] == questions[i].getCorrectAnswer()) {
                System.out.println("You were correct!!!");
                numberCorrect++;
            } else {
                System.out.println("You said " + userAnswers[i] + ", which is incorrect.");
            }
            System.out.println("Correct answer: " + questions[i].getCorrectAnswer() + "\n");
        }
        grade = numberCorrect * 10;
        System.out.println("You got " + numberCorrect + " questions correct");
        System.out.println("You're grade on the quiz is " + grade);
    }
}


