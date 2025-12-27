import java.util.Scanner;

public class FinancialApplicationsComputingFutureTuitionFor10YrLoop {
    public static void main(String[] args) {
        double currentTuitionFees = 40000;
        double percentageIncreaseTuitionFees = 3;
        double futureTuitionFees = 0;
        //use a for loop to calculate tuition fees after 10 years
        for (int years = 0; years <= 10; years ++) {
            futureTuitionFees = currentTuitionFees * Math.pow((1 + percentageIncreaseTuitionFees / 100), years);
            //Make the futureTuitionFees to 2 dp
            futureTuitionFees = (int) (futureTuitionFees * 100) / 100.0;
            //System.out.println("Tuition fees in " + years + " years' time is $" + futureTuitionFees);
        }
        System.out.println("Tuition fees in 10 years' time is $" +futureTuitionFees);
    }
}