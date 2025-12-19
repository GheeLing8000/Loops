import java.util.Scanner;

public class CheckNumberDivisibleBy5Or6 {
    public static void main(String[] args) {
       //Create a Scanner
        Scanner input = new Scanner(System.in);
        //Receive an input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        if (number % 5 == 0  && number % 6 == 0 )
        System.out.println(number + " is divisible by both 5  and 6");
        else if ( number % 5 == 0 ^ number % 6 == 0 )
        System.out.println(number + " is divisible by 5 or 6, but not both");
        else if ( number % 5 == 0 || number % 6 == 0)
        System.out.print("");
        else
        System.out.println(number + " is not divisible by either 5 or 6");

    }
}


























































































































