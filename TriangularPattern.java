import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        //Declare the variables
        final int size; //size of pattern to be input
        //Prompt for size and read input as "int"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        size = in.nextInt();
        in.close();
         /*Pattern (a)
        // Outer loop to print each of the rows
        for (int row = 1; row <= size; row++) {  // row = 1, 2, 3, ..., size
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) {  // col = 1, 2, 3, ..., size
                if ( row >= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");  // Need to print the "leading" blanks
                }
            }
            // Print a newline after printing all the columns
            System.out.println();
        }*/
        /*Pattern (b)
         // Outer loop to print each of the rows
      for (int row = 1; row <= size; row++) {  // row = 1, 2, 3, ..., size
         // Inner loop to print each of the columns of a particular row
         for (int col = 1; col <= size; col++) {  // col = 1, 2, 3, ..., size
            if ( row + col <= size + 1 ) {
                System.out.print("# ");
            } else {
                System.out.print("  ");  // Need to print the "leading" blanks
            }
         }
         // Print a newline after printing all the columns
         System.out.println();
      }*/
        /*Pattern (c)
        // Outer loop to print each of the rows
        for (int row = 1; row <= size; row++) {  // row = 1, 2, 3, ..., size
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) {  // col = 1, 2, 3, ..., size
                if (col >= row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");  // Need to print the "leading" blanks
                }
            }
            // Print a newline after printing all the columns
            System.out.println();
        }*/
        /*Pattern (d)*/
        // Outer loop to print each of the rows
        for (int row = 1; row <= size; row++) {  // row = 1, 2, 3, ..., size
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) {  // col = 1, 2, 3, ..., size
                if (row + col >= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");  // Need to print the "leading" blanks
                }
            }
            // Print a newline after printing all the columns
            System.out.println();
        }
    }
    }
