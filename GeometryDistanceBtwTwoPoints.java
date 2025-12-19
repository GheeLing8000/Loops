import java.util.Scanner;

public class GeometryDistanceBtwTwoPoints {
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter two double numbers representing x and y coordinates
        System.out.print("Enter the x- and y- coordinates for point1: ");
        String point1String = input.nextLine();
        String[] arrayOfString1 = point1String.split("\\s+");
        double valueXCoordinatePoint1 = Double.parseDouble(arrayOfString1[0]);
        double valueYCoordinatePoint1 = Double.parseDouble(arrayOfString1[1]);
        System.out.print("Enter the x- and y- coordinates or point1: ");
        String point2String = input.nextLine();
        String[] arrayOfString2 = point2String.split("\\s+");
        double valueXCoordinatePoint2 = Double.parseDouble(arrayOfString2[0]);
        double valueYCoordinatePoint2 = Double.parseDouble(arrayOfString2[1]);
        double squareOfDistanceBtwTwoPoints = Math.pow((valueXCoordinatePoint2 - valueXCoordinatePoint1),2)
                + Math.pow((valueYCoordinatePoint2 - valueYCoordinatePoint1),2);
        double distanceBtwTwoPoints = Math.sqrt(squareOfDistanceBtwTwoPoints);
        System.out.println("The distance between the two points is " +distanceBtwTwoPoints);

    }
}


























































































































