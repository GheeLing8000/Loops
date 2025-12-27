public class ConversionFromMilesToKM {
    public static void main(String[] args) {
        final double MILES_TO_KILOMETERS = 1.609;
        System.out.println("Miles     Kilometers     Kilometers      Miles");
        for (int miles = 1, kilometers = 20; miles <= 10 && kilometers <= 65; miles++, kilometers+=5)
        {
            double converted_Kilometers = MILES_TO_KILOMETERS * miles;
            double converted_Miles = 1/MILES_TO_KILOMETERS * kilometers;
            System.out.printf("%-10d%-10.3f",miles,converted_Kilometers);
            System.out.print("     ");
            System.out.printf("%-15d%-8.3f\n",kilometers,converted_Miles);

        }

    }
}