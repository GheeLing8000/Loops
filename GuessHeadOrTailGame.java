import java.util.Scanner;

public class GuessHeadOrTailGame {
    public static void main(String[] args) {
        //Generate a random number which is 1 or 0
        int number = (int) (Math.random() * 10) % 2;
        System.out.println(number);
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a guess " + "\'0\'" + " for head and " + "\'1\'" + " for tail: ");
        int answer = input.nextInt();

        if (number == answer)
            System.out.println("Your guess is correct.");
        else
            System.out.println("Your guess is wrong");
    }
}


























































































































