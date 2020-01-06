package Test;

import java.util.Random;

public class AddItionQuestion implements QuizQuestion {

    // varabele

    private int firstNumber;
    private int secondNummer;
    Random random = new Random();

    public AddItionQuestion(int firstNumber, int secondNummer) {
        this.firstNumber = random.nextInt(50);
        this.secondNummer = random.nextInt(50);
    }

    @Override
    public String getQuestion() {
        return "wat is the sum of" + firstNumber + " + " +secondNummer;
    }

    @Override
    public int getCorrectAnswer() {
        return firstNumber + secondNummer;
    }
}
