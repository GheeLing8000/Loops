import java.util.Scanner;
public class SumOfDigitsInt {
    public static void main (String[] args) {

         // Declare variables
      int inNumber;   // to be input
      int inDigit;    // each digit
        int digitsTotal = 0;
        // Put up prompting messages and read inputs as "int"
        Scanner in = new Scanner(System.in);  // Scan the keyboard for input
        System.out.print("Enter a positive integer: ");  // No newline for prompting message
        inNumber = in.nextInt();                     // Read next input as "int"
        in.close();  // Close Scanner

      // Extract and drop the "last" digit repeatably using a while-loop with modulus/divide operations
      while (inNumber > 0) {
         inDigit = inNumber % 10; // extract the "last" digit
         // Print this digit (which is extracted in reverse order)
         //System.out.print(inDigit);
         digitsTotal +=inDigit;

         inNumber /= 10;          // drop "last" digit and repeat
      }
        System.out.print("The sum of all digits is: " + digitsTotal);
        }

    }

