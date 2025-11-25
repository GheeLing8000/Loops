import java.util.Scanner;

public class USDHKDConverter {
    public static void main(String[] args){
        //Create a scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int intValue = input.nextInt();
        System.out.println("You entered the integer " +intValue);

        System.out.print("Enter a double: ");
        double doubleValue = input.nextDouble();
        System.out.println("You entered the double value " +doubleValue);

        System.out.print("Enter a string without space: ");
        String string = input.next();
        System.out.println("You entered the string " +string);
        //Prompt the user to enter a double
        System.out.print("Enter a double US dollar value: ");
        double doubleUSDValue = input.nextDouble();
        System.out.println("You entered a double USD value: " +doubleUSDValue);
        double HKDValue = 1*7.7807*doubleUSDValue;
        System.out.println("You have exchanged " + doubleUSDValue + " US dollars for " +HKDValue + " HK dollars");
        System.out.print("Enter a double HK dollar value: ");
        double doubleHKDValue = input.nextDouble();
        System.out.println("You entered a double HKD value: " +doubleHKDValue);
        double USDValue = doubleHKDValue/7.7807;
        System.out.println("You have exchanged " + doubleHKDValue + " HK dollars for " +USDValue + " US dollars");
    }
}
