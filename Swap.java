import java.util.Scanner;
public class Swap {
    public static void main (String[] args) {
        // Declare variables
        int number1, number2, temp;  // inputs and results - all in integers
        Scanner in = new Scanner(System.in);  // Scan the keyboard
        // Prompt and read inputs as "integers"
        System.out.print("Enter the first integer: ");
        number1 = in.nextInt();  // read input as double
        System.out.print("Enter the second integer: ");
        number2 = in.nextInt();  // read input as double
        in.close();

        temp = number1;
        number1 = number2;
        number2 = temp;




        // Print results using printf() with the following format specifiers:
        //   %.2f for a double with 2 decimal digits
        //   %n for a newline
        //System.out.print("The two numbers are " +number1+ " and " +number2);
        System.out.print("After the swap,first integer is: " + number1 +"," + " the second integer is " + number2);
        //System.out.printf("Volume of cylinder is: %.2f%n", volume);
    }
}
