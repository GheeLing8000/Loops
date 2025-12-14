
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateTuitionFees {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Receive tuition fees this year
        System.out.print("Enter the university tuition fees this year: $");
        double universityTuitionFeesNow = input.nextDouble();
        //Receive the annual interest rate
        System.out.print("Enter the annual interest rate in % ");
        double annualInterestRate = input.nextDouble();
        double universityTuitionFees1Yr = universityTuitionFeesNow * Math.pow((1 + annualInterestRate / 100.0),1);
        universityTuitionFees1Yr = (int)(universityTuitionFees1Yr * 100)/100.0;
        DecimalFormat universityTuitionFees1Yr2dp=new DecimalFormat("0.00");
        String decimalFormattedUniversityFees1Yr2dp = universityTuitionFees1Yr2dp.format(universityTuitionFees1Yr);


        double universityTuitionFees2Yr = universityTuitionFeesNow * Math.pow((1 + annualInterestRate/100.0),2);
        universityTuitionFees2Yr = (int)(universityTuitionFees2Yr * 100) / 100.0;
        double universityTuitionFees3Yr = universityTuitionFeesNow * Math.pow((1 + annualInterestRate/100.0),3);
        universityTuitionFees3Yr = (int)(universityTuitionFees3Yr * 100) / 100.0;
        double universityTuitionFees4Yr = universityTuitionFeesNow * Math.pow((1 + annualInterestRate / 100.0),4);
        universityTuitionFees4Yr = (int)(universityTuitionFees4Yr * 100) / 100.0;
        //Display the result

        System.out.println("The first year tuition fees is $" + decimalFormattedUniversityFees1Yr2dp);
        System.out.println("The second year university tuition fees is $" + universityTuitionFees2Yr);
        System.out.println("The third year university tuition fees is $" +universityTuitionFees3Yr);
        System.out.println("The fourth year university tuition fees is $" +universityTuitionFees4Yr);
    }
}