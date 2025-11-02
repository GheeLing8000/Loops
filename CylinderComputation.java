import java.util.Scanner;
public class CylinderComputation {
    public static void main (String[] args) {
        // Declare variables
        double radius, baseArea, surfaceArea,volume,height;  // inputs and results - all in double
        Scanner in = new Scanner(System.in);  // Scan the keyboard
        // Prompt and read inputs as "double"
        System.out.print("Enter the radius in floating point format: ");
        radius = in.nextDouble();  // read input as double
        System.out.print("Enter the height in floating point format: ");
        height = in.nextDouble();  // read input as double
        in.close();

        // Compute in "double"
        baseArea = Math.PI * radius * radius;
        surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
        volume = baseArea * height;


        // Print results using printf() with the following format specifiers:
        //   %.2f for a double with 2 decimal digits
        //   %n for a newline
        System.out.printf("Base area of cylinder is: %.2f%n", baseArea);
        System.out.printf("Surface area of cylinder is: %.2f%n", surfaceArea);
        System.out.printf("Volume of cylinder is: %.2f%n", volume);
    }
}
