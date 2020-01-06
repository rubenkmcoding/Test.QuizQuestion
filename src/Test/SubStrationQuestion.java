package Test;

import java.util.Random;

public class SubStrationQuestion implements QuizQuestion {

   private int firstNumber;
   private int secondNumber;

   public SubStrationQuestion(){
      this.firstNumber = new Random().nextInt(5) +1;
      this.secondNumber = new Random().nextInt(10);

      do {
         this.firstNumber = new Random().nextInt(5) +1;
         this.secondNumber = new Random().nextInt(10);
      }while (secondNumber > firstNumber);

      // 2de manier
//      if(firstNumber < secondNumber){
//         int temp = firstNumber; // hier zorgen we dat de user niet de negative cijfer in geef
//         firstNumber = secondNumber;
//         secondNumber = temp;

      }


   @Override
   public String getQuestion() {

      return "wat is the sum of" + firstNumber + " + " + secondNummer;
   }

   @Override
   public int getCorrectAnswer() {
      return  firstNumber - secondNumber;

   }
}
