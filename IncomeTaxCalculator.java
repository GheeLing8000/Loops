import java.util.Scanner;
public class IncomeTaxCalculator {
    public static void main (String[] args) {
        // Declare variables
         // Declare constants first (variables may use these constants)
      // The keyword "final" marked these as constant (i.e., cannot be changed).
      // Use uppercase words joined with underscore to name constants
      final double TAX_RATE_ABOVE_20K = 0.1;
      final double TAX_RATE_ABOVE_40K = 0.2;
      final double TAX_RATE_ABOVE_60K = 0.3;

      // Declare variables
      double taxableIncome;
      double taxPayable;
      Scanner in = new Scanner(System.in);  // Scan the keyboard for input
      // Prompt and read inputs as "double"
      System.out.print("Enter the income: $");
      taxableIncome = in.nextDouble();  // read input as double
       in.close();  // Close Scanner
      // Compute tax payable in "double" using a nested-if to handle 4 cases
      // Alternatively, you could use the following nested-if conditions
      // but the above follows the table data
      if (taxableIncome > 60000) {          // [60001, ]
           taxPayable = (taxableIncome - 60000) * 0.3 + (60000-40000) * 0.2 + (40000 - 20000) * 0.1;
      } else if (taxableIncome > 40000) {   // [40001, 60000]
           taxPayable = (taxableIncome - 40000) * 0.2 + (40000 - 20000) * 0.1;
      } else if (taxableIncome > 20000) {   // [20001, 40000]
           taxPayable = (taxableIncome - 20000) * 0.1;
      } else {                              // [0, 20000]
           taxPayable = 0.0;
      }

      // Print results rounded to 2 decimal places
      System.out.printf("The income tax payable is: $%.2f%n", taxPayable);
    }
}
