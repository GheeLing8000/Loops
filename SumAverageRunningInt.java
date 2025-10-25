public class SumAverageRunningInt {
    public static void main (String[] args) {

        // Define variables
        //int sum = 0;// The accumulated sum, init to 0
        int counter = 0;
        double average =0;       // average in double
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        /*
        // Use a for-loop to sum from lowerbound to upperbound
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
            sum += number;// same as "sum = sum + number"
            ++counter;

        }
        // Compute average in double. Beware that int / int produces int!
        average = (double)sum/counter;
        // Print sum and average
        System.out.println("Sum is " +sum);
        System.out.println("Average is "+average);*/

        /*
        //do-while loop
        int sum = 0;
        int counter =0;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int number = LOWERBOUND;         // declare and init loop index variable
        do {
            sum += number;                 //sum = sum + number
            ++number;                       // update
            ++counter;
        } while (number <= UPPERBOUND);  // test

        average = (double)sum/counter;
        // Print sum and average
        System.out.println("Sum is " +sum);
        System.out.println("Average is "+average);
         */
        int sum = 0;
        int number = LOWERBOUND;        // declare and init loop index variable
        while (number <= UPPERBOUND) {  // test
            sum += number;
            ++number;                   // update
            ++counter;                  //increment the counter on each number increment
            average = (double)sum/counter;
        }
        // Print sum and average
        System.out.println("Sum is " +sum);
        System.out.println("Average is "+average);


    }
}

