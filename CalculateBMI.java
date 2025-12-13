
import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        final double POUNDS_TO_KILOGRAM = 0.45359237;
        final double INCH_TO_METER = 0.0254;
        Scanner input = new Scanner(System.in);
        //Receive the weight in pounds
        System.out.print("Enter the weight in pounds for example 54.56: ");
        double weightInPounds = input.nextDouble();
        //Receive the height in inches
        System.out.print("Enter the height in inches for example: 20.67 ");
        double heightInInches = input.nextDouble();
        double weightInKilograms = POUNDS_TO_KILOGRAM * weightInPounds;
        double heightInMeters = INCH_TO_METER * heightInInches;
        double BMI = (int)(weightInKilograms * 100 / (heightInMeters * heightInMeters))/100.0;


        //Display the results
        System.out.println("The BMI is " + BMI);
    }
}