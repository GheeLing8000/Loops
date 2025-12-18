import java.util.Scanner;

public class ComputeChangeUsingIfToSeparateSingularPluralMonies {
    public static void main(String[] args) {
      //Create a Scanner
        Scanner input = new Scanner(System.in);
        //Receive the amount
        System.out.print("Enter an amount in double, for example 23.67: ");
        double amount = input.nextDouble();
        int remainingAmount = (int)(amount * 100);
        //Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        System.out.println("Your amount " + amount + " consists of ");
        if (numberOfOneDollars == 1)
            System.out.println((int)numberOfOneDollars + " dollar ");
        else if (numberOfOneDollars > 1)
            System.out.println((int)numberOfOneDollars + " dollars ");
        //Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        if (numberOfQuarters == 1)
            System.out.println((int)numberOfQuarters + " quarter");
        else if ( numberOfQuarters > 1)
            System.out.println((int)numberOfQuarters + " quarters ");
        //Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        if (numberOfDimes == 1)
            System.out.println((int)numberOfDimes + " dime ");
        else if (numberOfDimes > 1)
            System.out.println((int)numberOfDimes + " dimes ");
        //Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        if (numberOfNickels == 1 )
            System.out.println((int)numberOfNickels + " nickel ");
        else if (numberOfNickels > 1 )
            System.out.println((int)numberOfNickels + " nickels ");
        //Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;
        if (numberOfPennies == 1)
            System.out.println((int)numberOfQuarters + " penny ");
        else
            System.out.println((int)numberOfPennies + " pennies ");



    }

}