public class ComputePI {
    public static void main(String[] args) {

        //double sum = 0.0;
        double total =0.0;
        double pSum = 0.0;
        double nSum = 0.0;
        /*final int MAX_DENOMINATOR = 1000;   // Try 1000,10000, 100000, 1000000
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
            // denominator = 1, 3, 5, 7, ..., MAX_DENOMINATOR
            if (denominator % 4 == 1) {
                pSum += (double)1/denominator;
                //System.out.println("positive sum = " +pSum);
            } else if (denominator % 4 == 3) {
                nSum -= (double)1/denominator;
                //System.out.println("negative sum = " +nSum);
            } else // remainder of 0 or 2
            {
                System.out.println("Impossible!!!");
            }

            total = 4*(pSum+nSum);
        }
        System.out.println("Total is "+total);*/

        final int MAX_TERM = 1000;  // number of terms used in computation
        double sum = 0.0;
        for (int term = 1; term <= MAX_TERM; term++) {  // term = 1, 2, 3, ..., MAX_TERM
            // term = 1, 2, 3, 4, ..., MAX_TERM
            if (term % 2 == 1) {  // odd term number: add
                pSum += 1.0/(term * 2 - 1);
                System.out.println("positive terms  sum to "+pSum);
            } else {              // even term number: subtract
                nSum -= 1.0/(term * 2 - 1);
                System.out.println("negative terms  sum to "+nSum);
            }
            total = 4*(pSum+nSum);
            System.out.println("Total "+total);
        }

    }
}