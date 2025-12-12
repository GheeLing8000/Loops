import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PayrollUsingConsole {
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //Receive the name
        System.out.print("Enter employee's name: ");
        String name = input.next();
        //Receive working hours
        System.out.print("Enter number of hours worked in a week: ");
        double numberOfHours = input.nextDouble();
        //Receive hourly rate
        System.out.print("Enter hourly pay rate: ");
        double hourlyRatePay = input.nextDouble();
        //Receive federal tax rate
        System.out.print("Enter federal tax withholding rate: ");
        double federalTaxRate = input.nextDouble();
        //Receive state tax rate
        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();
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
        String output = "Employee's Name: " + name + "\n" +
                        "Hours Worked: " + numberOfHours + "\n" +
                        "Pay Rate:    $" +  hourlyRatePay + "\n" +
                        "Gross Pay:    $" + grossPay + "\n" +
                        "Deductions: \n" +
                        "\t Federal Withholding (20.0%):    $" + resultFedTaxRateDeduct2dp  + "\n" +
                        "\t State Withholding (9.0%):    $" + resultStateTaxRateDeduct2dp  + "\n" +
                        "\t Total Deduction:    $" + resultTotalTaxRateDeduct2dp + "\n" +
                        "Net Pay:    $" + resultNetPay2dp;
        System.out.println(output);
    }
}
