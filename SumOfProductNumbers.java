public class SumOfProductNumbers {

    public static void main(String[] args) {
                // Define variables
                int sum = 0;          // The accumulated sum, init to 0
                double average;       // average in double
                final int LOWERBOUND = 1;
                final int UPPERBOUND = 4;
                int product = 1;
                // Use a for-loop to sum from lowerbound to upperbound
                for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
                    // The loop index variable number = 1, 2, 3, ..., 99, 100
                    sum += number*number;     // same as "sum = sum + number"


                }
                // Compute average in double. Beware that int / int produces int!
                average = (double)sum/(UPPERBOUND - LOWERBOUND + 1 );
                // Print sum and average
                 System.out.println("The sum is of 1*1 t 2*2 ...to  n*n is " + sum);
                 System.out.println("The average is " +average);
            }
        }
