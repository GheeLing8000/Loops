import java.util.Scanner;
public class CheckerBoardPattern {
    public static void main(String[] args) {
        // Declare variables
        final int SIZE;    // size of the pattern to be input

        // Prompt user for the size and read input as "int"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        SIZE = in.nextInt();
        in.close();

        // Use nested-loop to print a 2D pattern
        // Outer loop to print ALL the rows
        for (int row = 1; row <= SIZE; row++) {
            if ((row % 2) == 0) {   // print a leading space for even-numbered rows
                System.out.print(" ");
            }
            // Inner loop to print ALL the columns of EACH row
            for (int col = 1; col <= SIZE; col++) {

                System.out.print("* ");
            }
            // Print a newline after all the columns
            System.out.println();
        }
    }
}
