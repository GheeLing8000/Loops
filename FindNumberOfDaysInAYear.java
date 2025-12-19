import java.time.Year;
import java.util.Scanner;

public class FindNumberOfDaysInAYear {
    public static void main(String[] args) {
    //Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        //Check if the year is a leap year
        if ( year % 4 == 0 && year % 100 != 0  || (year % 100 ==0) )
            System.out.println("Year " + year + " has 366 days.");
        else
            System.out.println("Year " + year + " has 365 days.");


    }
}


























































































































