import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       //Prompt the user to enter two integers
        System.out.print("Enter the first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        int n2 = input.nextInt();
        int gcd = 1;
        /*int k = 2;
        while ( k <= n1 && k <= n2){
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;
        }*/
        /*for (int k = 2; k <= n1 && k  <= n2; k++){
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;

        }*/
        for (int k = 2; k <= n1/2 && k <= n2/2; k++){
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
        }
        System.out.println("The greatest common divisor for " +n1 +
                " and " + n2 + " is " + gcd);

    }
}