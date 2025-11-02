import java.util.Scanner;
public class IncomeTaxCalculatorWithSentinel {
    public static void main (String[] args) {
        // Declare variables
         // Declare constants first (variables may use these constants)
      // The keyword "final" marked these as constant (i.e., cannot be changed).
      // Use uppercase words joined with underscore to name constants
      final double TAX_RATE_ABOVE_20K = 0.1;
      final double TAX_RATE_ABOVE_40K = 0.2;
      final double TAX_RATE_ABOVE_60K = 0.3;

        // Declare constants first
        final int SENTINEL = -1;    // Terminating value for input
        //......
        // Declare variables
        int taxableIncome;
        double taxPayable;
        Scanner in = new Scanner(System.in);  // Scan the keyboard for input
        // Read the first input to "seed" the while loop
        System.out.print("Enter the taxable income (or -1 to end): $");
        taxableIncome = in.nextInt();
        //in.close();  // Close Scanner
        while (taxableIncome != SENTINEL) {
            // Compute tax payable
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
            // Print result
         System.out.printf("The income tax payable is: $%.2f%n", taxPayable);

            // Repeat the loop body, only if the input is not the SENTINEL value.
            // Take note that you need to repeat these two statements inside/outside the loop.
            System.out.print("Enter the taxable income (or -1 to end): $");
         taxableIncome = in.nextInt();
        }
        //System.out.print("Enter the taxable income (or -1 to end): $");
        //taxableIncome = in.nextInt();

        System.out.println("bye!");
    }
}
