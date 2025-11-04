import java.util.Scanner;
public class AverageWithInputValidation {
    public static void main (String[] args) {

        /*Enter the mark (0-100) for student 1: 56
        Enter the mark (0-100) for student 2: 101
        Invalid input, try again...
        Enter the mark (0-100) for student 2: -1
        Invalid input, try again...
        Enter the mark (0-100) for student 2: 99
        Enter the mark (0-100) for student 3: 45
        The average is: 66.67*/
             // Declare constant

              // Declare constant
      final int NUM_STUDENTS = 3;

      // Declare variables
      int numberIn;
      boolean isValid;   // boolean flag to control the input validation loop
      int sum = 0;
      double average = 0;
      //.....
      int counter = 0;

      for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
          // Prompt user for mark with input validation
          //......
          isValid = false;   // reset assuming input is not valid
          do {
             //......
              Scanner in = new Scanner(System.in);
              System.out.print("Enter the mark (0-100) for student " +studentNo +": ");
              numberIn = in.nextInt();

              if (numberIn >=0 && numberIn <=100){
                  isValid = true; // exit the loop
              } else{
              System.out.println("Invalid input, try again...");
              }

          } while (!isValid);
          sum += numberIn;
          average = (double)sum/NUM_STUDENTS;
      }
      //......
        System.out.printf("The average is: %.2f%n",average);
    }

    }

