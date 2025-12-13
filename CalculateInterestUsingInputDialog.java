
import javax.swing.*;

public class CalculateInterestUsingInputDialog {
    public static void main(String[] args) {

        //Enter balance
        String balanceString = JOptionPane.showInputDialog("Enter balance: ");
        //Convert string to double
        double balance = Double.parseDouble(balanceString);

        //Enter annual interest rate
        String annualInterestRateString = JOptionPane.showInputDialog("Enter annual interest rate: ");
        //Convert string to double
        double annualInterestRate = Double.parseDouble(annualInterestRateString);
        //Calculate interest
        double nextMonthInterest = balance * (annualInterestRate/1200);
        //Calculate next month interest in 2 decimal places
         nextMonthInterest = (int)(nextMonthInterest * 100)/100.0;
        //Display the results
        String output = "The interest is " + nextMonthInterest; JOptionPane.showMessageDialog(null,output);
    }
}
