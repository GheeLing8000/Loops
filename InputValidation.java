import java.util.Scanner;
public class InputValidation {
    public static void main (String[] args) {

    /*Enter a number between 0-10 or 90-100: -1
Invalid input, try again...
Enter a number between 0-10 or 90-100: 50
Invalid input, try again...
Enter a number between 0-10 or 90-100: 101
Invalid input, try again...
Enter a number between 0-10 or 90-100: 95
You have entered: 95*/
         // Declare variables
      int numberIn;      // to be input
      boolean isValid;   // boolean flag to control the loop
      //.....

      // Use a do-while loop controlled by a boolean flag
      // to repeatably read the input until a valid input is entered
      isValid = false;   // default assuming input is not valid
      do {
         // Prompt and read input
          // Put up prompting messages and read inputs as "int"
          Scanner in = new Scanner(System.in);  // Scan the keyboard for input
          System.out.print("Enter a number between 0-10 or 90-100: ");  // No newline for prompting message
          numberIn = in.nextInt();                     // Read next input as "int"
          //in.close();  // Close Scanner

         // Validate input by setting the boolean flag accordingly
         if (numberIn>=0 && numberIn <=10 || numberIn >=90 && numberIn<=100) {
            isValid = true;   // exit the loop
         } else {
            System.out.println("Invalid input, try again...");  // Print error message and repeat

         }
      } while (!isValid);
        System.out.print("You have entered: " + numberIn);
        }

    }

