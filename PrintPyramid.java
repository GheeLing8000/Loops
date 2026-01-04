import java.util.Scanner;

public class PrintPyramid {
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();

        if (numberOfLines < 1 || numberOfLines > 15) {
        System.out.println("You must enter a number from 1 to 15");
        System.exit(0);
        }
        //Print lines
        for (int row = 1; row <= numberOfLines; row++) {
            //Print NUMBER_OF_LINES - row leading space, print out number of columns
            // in every line from row1  to row11 i.e. numberOfLines - row, column(s) = 11 - 1 = 10,
            //column(s) = 11 - 2 = 9,..column = 11 - 10 = 1. Column 1 aligned nearest to right.
            //e.g. Column 4   xxxxxxxxxxxxy
            //e.g. Column 3   xxxxxxxxxy
            //e.g. Column 2   xxxxy
            //e.g. Column 1   y
            for (int column = 1; column <= numberOfLines - row; column++)
                System.out.print("    ");
            //Print the leading numbers row, row -1,...., 1 for every line. Start from
            for (int num = row; num >= 1; num--)
                System.out.print((num >= 10) ? "  " + num : "   " + num);
                //Print ending numbers 2,3, ..., row -1, row, print the other side of pyramid
                for (int num = 2; num <= row; num++)
                    System.out.print((num >= 10) ? "  " + num : "   " + num);
                //Start a new line
                System.out.println();


        }

    }
}
