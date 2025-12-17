import java.util.Scanner;

public class ComputeAreaOfCirclePositiveNumber {
    public static void main(String[] args) {
        //Declare a constant
        final double PI = 3.14159;
        //Prompt user to enter a radius
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double radius = input.nextDouble();

        if (radius >= 0) {
            double area = PI * 1 * Math.pow(radius, 2);
            System.out.println("The area is " + area);
        }

        else

        System.out.println("Incorrect input");


    }

}