
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateEnergyToHeatWater {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Receive the mass of water in kilograms
        System.out.print("Enter the mass if water in kilograms (kg): ");
        double massOfWater = input.nextDouble();
        //Receive initial temperature in degree Celsius
        System.out.print("Enter the initial water temperature in degree Celsius (oC): ");
        double initialWaterTemperature = input.nextDouble();
        //Receive the final temperature in Kelvins
        System.out.print("Enter the final water temperature in degree Celsius (oC): ");
        double finalWaterTemperature = input.nextDouble();

        double amountOfEnergy = massOfWater * (finalWaterTemperature - initialWaterTemperature) * 4184;
        //amountOfEnergy = (int)(amountOfEnergy * 100) / 100.0;
        //Display the result

        System.out.println("The amount of energy to heat " + massOfWater + " kilograms of water from " + initialWaterTemperature+
                " degree Celsius to " + finalWaterTemperature + " degree Celsius is "
                 + amountOfEnergy + "J (Joules).");
        ;
    }
}