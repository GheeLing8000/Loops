import java.util.Scanner;

public class ComputeChangeWOAccuracyLoss {
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);
        //Receive the integer
        System.out.print("Enter an amount in integer for example 1156 to represent 11 dollars 56 cents: ");
        int amount = input.nextInt();
        int dollars = amount / 100;
        int cents = amount % 100;
        System.out.println("The amount is " + dollars + " dollars and " + cents + " cents");
    }
}
