package Test;

import java.util.Random;

public class AddItionQuestion implements QuizQuestion {

    private int firstNumber;
    private int secondNumber;

    public void AdditionQuestions() {
        firstNumber = new Random().nextInt(50) + 1;
        secondNumber = new Random().nextInt(50);
    }

    @Override
    public String getQuestion() {
        return "What is " + firstNumber + " + " + secondNumber + "?";
    }

    @Override
    public int getCorrectAnswer() {
        return firstNumber + secondNumber;
    }
}
