import java.util.Scanner;

public class CheckNumberIsEven {
    public static void main(String[] args) {

        //Prompt user to enter a number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

            System.out.println("Is " + number + " an even number? " + (number % 2 == 0));


    }

}