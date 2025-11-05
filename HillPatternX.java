import java.util.Scanner;

public class HillPatternX {
    /**
     * Prompt user for the size and print the multiplication table.
     */
    public static void main(String[] args) {
        //Declare the variables
        final int numRows; //size of pattern to be input
        int numCol;
        //Prompt for size and read input as "int"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        numRows = in.nextInt();
        in.close();
            /*Pattern (a)
            for (int row = 1; row <= numRows; row++) {
                // numCol = 2*numRows - 1
                for (int col = 1; col <= 2*numRows - 1 ; col++){
                    if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
               System.out.print(" #");
                    } else {
               System.out.print("  ");
                    }
                }
                System.out.println();
            }*/
        /*Pattern (b)
        for (int row = numRows; row >= 1; row-- ) {
             numCol = 2*numRows - 1;
            for (int col = numCol; col >= 1; col--) {
                if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
                    System.out.print(" #");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }*/
        //Pattern (c)
        for (int row = 1; row <= numRows; row++) {
            // numCol = 2*numRows - 1
            for (int col = 1; col <= 2 * numRows - 1; col++) {
                if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
                    System.out.print(" #");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int row = numRows - 1; row >= 1; row--) {
            numCol = 2 * numRows - 1;
            for (int col = numCol; col >= 1; col--) {
                if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
                    System.out.print(" #");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //Pattern (d)




    }
}