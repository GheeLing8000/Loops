public class ComputingFutureTuitionFeesTotal4Yrs {
    public static void main(String[] args) {
        double currentTuitionFees = 40000;
        double percentageIncreaseTuitionFees = 3;
        double futureTuitionFees = 0;
        int sumOfFutureTuitionFees = 0;
        //use a for loop to calculate tuition fees after 10 years
        for (int years = 10; years <= 13; years++) {
            futureTuitionFees = currentTuitionFees * Math.pow((1 + percentageIncreaseTuitionFees / 100), years);
            //Make the futureTuitionFees to 2 dp
            futureTuitionFees = (int) (futureTuitionFees * 100) / 100.0;
            sumOfFutureTuitionFees += futureTuitionFees;
            System.out.println("The total fees in " + years + " years is $" + sumOfFutureTuitionFees);

        }
        System.out.println("The sum of total tuition fees" +
                " 4 years starting ten years from now is $" + sumOfFutureTuitionFees);
    }
}