import java.util.Scanner;

public class FinancialApplicationsComputingFutureTuition10Yr {
    public static void main(String[] args) {
        double currentTuitionFees = 40000;
        double percentageIncreaseTuitionFees = 3;
        //Create a new scanner
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter the number of years
        System.out.print("Enter the number of years to tuition: ");
        int years = input.nextInt();
        double futureTuitionFees = currentTuitionFees * Math.pow(( 1 + percentageIncreaseTuitionFees/100 ),years);
        //Make the futureTuitionFees to 2 dp
        futureTuitionFees = (int)(futureTuitionFees * 100)/100.0;
        System.out.println("Tuition fees in " + years + " time is $" + futureTuitionFees);
    }
}