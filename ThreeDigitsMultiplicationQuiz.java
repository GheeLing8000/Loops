import java.util.Scanner;

public class ThreeDigitsMultiplicationQuiz {
    public static void main(String[] args) {
     int number1 = (int)(System.currentTimeMillis() % 1000);
     int number2 = (int)(System.currentTimeMillis() * 7 % 1000);
     int number3 = (int)(System.currentTimeMillis() * 3 % 1000);

     //Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " * " + number2 +  " * " + number3 + "? ");
        int answer = input.nextInt();
        System.out.println(number1 + " * " + number2 + " * " + number3 + " = "
        + answer + " is " + (number1 * number2 * number3 == answer));



    }

}