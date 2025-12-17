import javax.swing.*;
import java.util.Scanner;

public class LeapYearUsingInputDialog {
    public static void main(String[] args) {
      //Enter a year
        String yearString = JOptionPane.showInputDialog("Enter a year: ");
        //Convert the string to an integer
        int year = Integer.parseInt(yearString);
        //Check if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        //Display the result
        String output =  year + " is a leap year? " + isLeapYear; JOptionPane
                .showMessageDialog(null,output);
    }

}