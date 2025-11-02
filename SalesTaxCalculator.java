import java.util.Scanner;
public class SalesTaxCalculator {
    public static void main (String[] args) {

        // Declare constants
        final double SALES_TAX_RATE = 0.07;
        final int SENTINEL = -1;

        // Declare variables
        double price, actualPrice, salesTax;  // inputs and results
        double totalPrice = 0.0, totalActualPrice = 0.0, totalSalesTax = 0.0;  // to accumulate
        Scanner in = new Scanner(System.in);//Scan keyboard for input
        // Read the first input to "seed" the while loop
        System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
        price =  in.nextDouble();

        while (price != SENTINEL) {
            // Compute the tax
         actualPrice = 1.0/(1.0+SALES_TAX_RATE) * price;
         salesTax = SALES_TAX_RATE*actualPrice;
            // Accumulate into the totals
         totalSalesTax +=salesTax;
         totalActualPrice += actualPrice;
         totalPrice += price;
            // Print results
           System.out.printf("Actual Price is: $%.2f", actualPrice);
           System.out.printf(", Sales Tax is: $%.2f%n", salesTax);
            // Read the next input and repeat
            System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
            price =  in.nextDouble();
        }
        // print totals
        System.out.printf("Total Price is: $%.2f%n", totalPrice);
        System.out.printf("Total actual Price is: $%.2f%n", totalActualPrice);
        System.out.printf("Total sales Tax is: $%.2f%n", totalSalesTax);
        }

    }

