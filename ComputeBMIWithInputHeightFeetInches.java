import javax.swing.*;
import java.util.Scanner;

public class ComputeBMIWithInputHeightFeetInches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weight = input.nextDouble();

        //Prompt the user to enter height in inches and feet
        System.out.print("Enter the height in feet and inches" +
                " for example " + "\"5.7\"" + " feet and " + "\"2.04\"" + " inches");
        System.out.print("Enter the height in feet: ");
        double heightFeet = input.nextDouble();
        System.out.print("Enter the remaining height in inches: ");
        double heightInches = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_FOOT = 0.305; //Constant
        final double METERS_PER_INCH = 0.0254; //Constant

        //Compute BMI
        double bmi = weight * KILOGRAMS_PER_POUND /
                ((heightFeet * METERS_PER_FOOT + heightInches * METERS_PER_INCH) *
                        (heightFeet * METERS_PER_FOOT + heightInches * METERS_PER_INCH));

        //Display result
        System.out.println("Your BMI is " +bmi);
        if (bmi < 16)
            System.out.println("You are seriously underweight");
        else if (bmi < 18)
            System.out.println("You are underweight");
        else if (bmi < 24)
            System.out.println("You are normal weight");
        else if (bmi < 29)
            System.out.println("You are overweight");
        else if (bmi < 35)
            System.out.println("You are seriously overweight");
        else
            System.out.println("You are gravely overweight");


    }
}