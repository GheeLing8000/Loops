
import javax.swing.*;
import java.util.Scanner;

public class CalculateFutureInvestmentValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Receive the investment amount
        System.out.print("Enter the investment amount in double for example 1000.00: ");
        double investmentAmount = input.nextDouble();
        //Receive the annualInterestRate
        System.out.print("Enter the annual interest rate in double for example 3.25: ");
        double annualInterestRate = input.nextDouble();
        //Receive the number of years
        System.out.print("Enter the number of years in integer for example 1: ");
        int numberOfYears = input.nextInt();

        double futureInvestmentValue = investmentAmount * Math.pow(1 + annualInterestRate / 1200, numberOfYears * 12);

        //Calculate next month interest in 2 decimal places
        futureInvestmentValue = (int) (futureInvestmentValue * 100) / 100.0;
        //Display the results
        System.out.println("The future investment value is " + futureInvestmentValue);
    }
}