import java.util.Scanner;

public class AdditionQuizUsingSwap {
    public static void main(String[] args) {
       //1.Generate three integers less than 50
        int number1 = (int)(Math.random() * 50);
        int number2 = (int)(Math.random() * 50);
        int number3 = (int)(Math.random() * 50);

        //If number1 < number2 and number1 < number3 and number2 <number3
        if (number1 < number3 && number2 < number3) {
            if ( number1 < number2)   {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.print("What is " + number3 + " + " + number1 + " + " + number2 + "? ");
        }
        //If number1 < number2 and number1 < number3 and number3 <number2
        else if (number1 < number2 && number3 < number2) {
            if (number1 < number3){
                int temp = number1;
                number1 = number3;
                number3 = temp;
            }
            System.out.print("What is " + number2 + " + " + number1 + " + " + number3 + "? ");

        }
         //If number2 < number1 and number2 < number3 and number3 <number1
        else if (number2 < number1 && number3 < number1){
                 if (number2 < number3){
                     int temp = number2;
                     number2 = number3;
                     number3 = temp;
                 }
        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
        }
        //3. Prompt the student to answer the question
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        //4.Grade the answer and display the result
        if (number1 + number2 +number3 == answer)
            System.out.println("You are correct!");
        else
            System.out.println("Your answer is wrong\n" +
                    "The correct answer should be " + (number1 + number2 + number3));
    }                                                                                 
    }

