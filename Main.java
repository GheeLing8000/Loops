public class Main {
    public static void main(String[] args)
    {

        //public class SumAverageRunningInt {   // Save as "SumAverageRunningInt.java"
            //public static void main (String[] args) {
                // Define variables
            double average;       // average in double
            final int LOWERBOUND = 1;
            final int UPPERBOUND = 100;
            int sum = 0;
            int count = 0;// Count the number within the range, init to 0
        for ( int number = LOWERBOUND; number <=UPPERBOUND; number++ ) {
            sum = number*(number+1)*(2*number+1)/6;
    }



                // Compute average in double. Beware that int / int produces int!
                 average = (double)sum/count;
                // Print sum and average
                System.out.println("The sum of 1 to 100 is "+sum);
                //System.out.println("The average is "+average);
           /* }*/
        }
}