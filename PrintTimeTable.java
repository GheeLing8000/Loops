import java.util.Scanner;

public class PrintTimeTable {
    /**
     * Prompt user for the size and print the multiplication table.
     */

    public static void main(String[] args) {
        //Declare variables
        final int SIZE;
        //Prompt for size and read input as "int"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        SIZE = in.nextInt();
        in.close();

        //Print the header row
        System.out.print(" * |");
        for (int col = 1; col <= SIZE; ++col) {
            System.out.printf("%4d", col);
        }
        System.out.println();
        System.out.print("----");

        for (int col = 1; col <= SIZE; ++col) { //Outer loop
            System.out.printf("%4s", "----");
        }
        System.out.println();
        for (int row = 1; row <= SIZE; ++row) { //outer loop
            System.out.printf("%2d |", row); //print row header first
            for (int col = 1; col <=SIZE; ++col){ //inner loop
                System.out.printf("%4d", row*col);
            }
            System.out.println(); //print newline after all columns
        }
    }

}