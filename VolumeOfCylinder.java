import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args){
        //Create a scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a double value for radius in meters: ");
        double doubleValueRadius = input.nextDouble();
        System.out.println("You entered the double value for circle radius " +doubleValueRadius + " meters");
        System.out.print("Enter a double value for length in meters: ");
        double doubleValuelength = input.nextDouble();
        System.out.println("You entered the double value for circle radius " +doubleValuelength + " square meters");
        double area = doubleValueRadius*doubleValueRadius*Math.PI;
        double volume = area * doubleValuelength;
        System.out.println("Area of cylinder is " +area+ " square meters");
        System.out.println("Volume of cylinder is " +volume+ " cubic meters");
    }
}
