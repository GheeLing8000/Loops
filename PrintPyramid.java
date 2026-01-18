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
        //Print lines using println() with an empty space in each line with
        // for (int row = 1; row <= numberOfLines; row++)
        for (int row = 1; row <= numberOfLines; row++) {
            //Print NUMBER_OF_LINES - row leading space, print out number of columns
            // in every line from row1  to row11 i.e. numberOfLines - row, column(s) = 11 - 1 = 10,
            //column(s) = 11 - 2 = 9,..column = 11 - 10 = 1. Column 1 aligned nearest to right.
            //e.g. Column 4   xxxxxxxxxxxxy
            //e.g. Column 3   xxxxxxxxxy
            //e.g. Column 2   xxxxy

            //Start with row = 1; row(1) <= 1; row (1+1), column = 1, column1 <= 1 - 1 =(0); column(breaks);
            //There is no "XXXX" as column1 <= 0  is false
            //Print  "y"
            //Start with row = 2; row(2) <= 2; row(2+1), column = 1, column1 <= 2 - 1 = (1), column (1+1);
            //Print "XXXX" , Print "y"
            //Start with row = 2; row(2) <= 2; row(2+1), column = 2, column2 <= 2 - 1 = (2), column (2+1);
            //Print nothing
            //Start with row = 3; row(3) <= 3; row (3+1); column 1, column1 <= 3 - 1 = (2), column (1 + 1) = 2;
            //Print "XXXX", Print "y"
            //Start with row = 3; row(3) <= 3; row (3+1); column 2, column2 <= 3 - 1 = (2), column ( 2+1) = 3;
            //Print "XXXXXXXXy"
            //Start with row = 3; row(3) <=3; row (3+1); column 3, column3 <= 3 - 2 = (1), column  (breaks);
            //Print nothing
            // Start with row = 4; row(4) <= 4; row (4+1); column1; column1 < = 4 - 1 (3), column (1+1);
            //Print "XXXX", Print "y"
            //Start with row = 4; row(4) <= 4; row (4+1); column2; column2 < = 4 -1 (3), column (2+1)';
            //Print "XXXX" connected with "XXXXy"
            //Start with row = 4; row(4) <= 4; row(4+1); column3; column3 <= 4 - 1 (3), column (3+1);
            //Print "XXXX" connected with "XXXXXXXXy"
            //Start with row = 4; row(4) <= 4; row(4+1); column4 ; column4 < = 4 - 1 (3). column (breaks);

            for (int column = 1; column <= numberOfLines - row; column++)
                System.out.print("    ");
            //Print the leading numbers row, row -1,...., 1 for every line. Start from
            for (int num = row; num >= 1; num--)
                System.out.print((num >= 10) ? "  " + num : "   " + num);
                //Print ending numbers 2,3, ..., row -1, row, print the other side of pyramid
                for (int num = 2; num <= row; num++)
                    System.out.print((num >= 10) ? "  " + num : "   " + num);
                //Start a new line at outermost loop  for (int row = 1; row <= numberOfLines; row++)
                System.out.println("");


        }

    }
}
