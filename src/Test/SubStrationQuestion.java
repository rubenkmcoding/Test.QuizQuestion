package Test;

import java.util.Random;

public class SubStrationQuestion implements QuizQuestion {

   private int firstNumber;
   private int secondNumber;

   public void SubtractionQuestions() {
      firstNumber = new Random().nextInt(50) + 1;
      secondNumber = new Random().nextInt(50);
      swap();
   }

   private void swap(){
      if (secondNumber > firstNumber) {
         int temp = firstNumber;
         firstNumber = secondNumber;
         secondNumber = temp;
      }
   }

   @Override
   public String getQuestion() {
      return "What is " + firstNumber + " - " + secondNumber + "?";
   }

   @Override
   public int getCorrectAnswer() {
      return firstNumber - secondNumber;
   }
}

      // 2de manier
//      if(firstNumber < secondNumber){
//         int temp = firstNumber; // hier zorgen we dat de user niet de negative cijfer in geef
//         firstNumber = secondNumber;
//         secondNumber = temp;




