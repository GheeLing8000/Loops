public class ComputePI {
    public static void main(String[] args) {

        double sum = 0.0;
        double total =0.0;
        double pSum = 0.0;
        double nSum = 0.0;
        final int MAX_DENOMINATOR = 1000;   // Try 1000,10000, 100000, 1000000
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
        System.out.println("Total is "+total);
    }
}