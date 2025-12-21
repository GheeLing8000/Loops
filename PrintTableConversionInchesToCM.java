import java.util.Scanner;

public class PrintTableConversionInchesToCM {
    public static void main(String[] args) {
        final double INCHES_TO_CENTIMETERS = 2.54;
       //Print the heading
        System.out.println("inches" + "          " + "centimeters");

        //Generate number of rows in the table
        int row = 1;
        while (row < 200 ){
            double cm = row * INCHES_TO_CENTIMETERS;
            if ( row % 2 != 0) {
                System.out.printf("%-3d%17s%-6.1f\n", row, "                 ", cm);
                row++;
            }
            else
                row++;
        }


    }
}