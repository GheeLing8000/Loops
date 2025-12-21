import java.util.Scanner;

public class AdditionQuiz5Q {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5;// Number of questions
        int correctCount = 0;//Count the number of correct answers
        int count = 0;//Count the number of questions
        long startTime = System.currentTimeMillis();
        int answer = 0;
        String output = "";//Output is initially empty
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS){
            //1.Generate 3 random numbers between 20 and 90
            int number1 =  20 + (int)(Math.random() * ((90 - 20) + 1));
            int number2 =  20 + (int)(Math.random() * ((90 - 20) + 1));
            int number3 =  20 + (int)(Math.random() * ((90 - 20) + 1));

            //2.If numbers are between 20 and 90
            if (number1 >= 20 && number1 <= 90 && number2 >=20 && number2 <= 90 && number3 >= 20 && number3 <= 90)
            {
                //3.Prompt the student to answer "what is number1 + number2 + number3?"
                System.out.print("What is " + number1 + " + " + number2 + " + "
                        + number3 + "? ");
                answer = input.nextInt();
                //4.Grade the answer and display the result
                if (number1 + number2 + number3 == answer){
                    System.out.println("You are correct!");
                    correctCount++;
                }
                else
                    System.out.println("Your answer is wrong.\n" +number1
                    + " + " + number2 + " + " + number3 + " = " + (number1 + number2 + number3));
            }
            //Increase the count
            count++;
            output += "\n" + number1 + "+" + number2 + "+" + number3 + "=" + answer
                    + ((number1 + number2 + number3 == answer) ? " correct" : " wrong");

        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctCount +
                "\nTest time is " + testTime / 1000 + " seconds\n" + output);


    }


}



























































































































