import javax.swing.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class PayrollUsingInputDialog {
    public static void main(String[] args) {
        //Receive the name
        String nameString = JOptionPane.showInputDialog(
                "Enter employee's name: ");
        //Receive working hours
        String numberOfHoursString = JOptionPane.showInputDialog("Enter number of hours worked in a week: ");
        //Convert string to integer
        double numberOfHours = Double.parseDouble(numberOfHoursString);
        //Receive hourly rate
        String hourlyRatePayString = JOptionPane.showInputDialog("Enter hourly pay rate: ");
        //Convert string to double
        double hourlyRatePay = Double.parseDouble(hourlyRatePayString);
        //Receive federal tax rate
        String federalTaxRateString = JOptionPane.showInputDialog("Enter federal tax withholding rate: ");
        //Convert string to double
        double federalTaxRate = Double.parseDouble(federalTaxRateString);
        //Receive state tax rate
        String stateTaxRateString = JOptionPane.showInputDialog("Enter state tax withholding rate: ");
        //Convert string to double
        double stateTaxRate = Double.parseDouble(stateTaxRateString);
        //Calculate gross pay
        double grossPay = hourlyRatePay * numberOfHours;
        //Calculate federal withholding tax rate
        double federalTaxRateDeduction = federalTaxRate * grossPay;
        DecimalFormat fedTaxRateDeduct2dp = new DecimalFormat("#.##");

        fedTaxRateDeduct2dp.setRoundingMode(RoundingMode.FLOOR);

        double resultFedTaxRateDeduct2dp = Double.parseDouble(fedTaxRateDeduct2dp.format(federalTaxRateDeduction));
        //Calculate state withholding tax rate
        double stateTaxRateDeduction = stateTaxRate * grossPay;
        DecimalFormat stateTaxRateDeduct2dp = new DecimalFormat("#.##");

        stateTaxRateDeduct2dp.setRoundingMode(RoundingMode.FLOOR);

        double resultStateTaxRateDeduct2dp = Double.parseDouble(stateTaxRateDeduct2dp.format(stateTaxRateDeduction));
        //Calculate the total deduction
        double totalTaxDeduction =  federalTaxRateDeduction + stateTaxRateDeduction;
        DecimalFormat totalTaxDeduct2dp = new DecimalFormat("#.##");
        totalTaxDeduct2dp.setRoundingMode(RoundingMode.FLOOR);
        double resultTotalTaxRateDeduct2dp = Double.parseDouble(totalTaxDeduct2dp.format(totalTaxDeduction));

        //Calculate net pay
        double netPay = grossPay - totalTaxDeduction;
        DecimalFormat netPay2dp = new DecimalFormat("#.##");
        netPay2dp.setRoundingMode(RoundingMode.FLOOR);
        double resultNetPay2dp = Double.parseDouble(netPay2dp.format(netPay));


        //Display the results
        String output = "Employee's Name: " + nameString + "\n" +
                        "Hours Worked: " + numberOfHours + "\n" +
                        "Pay Rate:    $" +  hourlyRatePay + "\n" +
                        "Gross Pay:    $" + grossPay + "\n" +
                        "Deductions: \n" +
                        "\t Federal Withholding (20.0%):    $" + resultFedTaxRateDeduct2dp  + "\n" +
                        "\t State Withholding (9.0%):    $" + resultStateTaxRateDeduct2dp  + "\n" +
                        "\t Total Deduction:    $" + resultTotalTaxRateDeduct2dp + "\n" +
                        "Net Pay:    $" + resultNetPay2dp; JOptionPane.showMessageDialog(null,output);
    }
}
