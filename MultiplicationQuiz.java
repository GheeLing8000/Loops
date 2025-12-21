import java.util.Scanner;

public class MultiplicationQuiz {
    public static void main(String[] args) {
        int correctCount = 0; // Count the number of correct answers
        int count = 0; //Count the number of questions
        long startTime = System.currentTimeMillis();
        String output = ""; //output of string is initially empty
        //Create a scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of questions to be answered: ");
        int numberOfQuestions = input.nextInt();

        while (count < numberOfQuestions) {
            //1. Generate two single digits number between 2 to 9 inclusive
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10); //number less than or equal to 9

            if (number1 >= 2 && number1 <= 9 && number2 >= 2 && number2 <= 9 ) {
                //3.Prompt the student to answer "what is number1 * number2?"
                System.out.print("What is " + number1 + " * " + number2 + "? ");
                int answer = input.nextInt();

                if (number1 * number2 == answer) {
                    System.out.println("You are correct!");
                    correctCount++;
                } else
                    System.out.println("Your answer is wrong.\n" + number1
                            + " * " + number2 + " = " + (number1 * number2));
                //Increase the count
                count++;
            }
            else
                System.out.println("The numbers generated this round are " +
                        "not between 2 and 9, need to re-generate again.");
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctCount +
                "\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }


}



























































































































