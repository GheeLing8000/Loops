import java.awt.*;
import java.util.Scanner;

public class SumDigitsInInteger {
    public static void main(String[] args){
        //Create a scanner
        Scanner input = new Scanner(System.in);
        //Receive the integer
        System.out.print("Enter an integer between 0 and 1000: ");
        int number = input.nextInt();
        //find the number after extracting the 1st digit
        int ones_digit = number % 10;
        int remaining_number = number / 10;
        int tens_digit = remaining_number % 10;
        remaining_number = remaining_number / 10;
        int hundreds_digit = remaining_number % 10;
        //System.out.println(hundreds_digit);
        System.out.println("The sum of the digits is " +(ones_digit + tens_digit + hundreds_digit));












    }
}
