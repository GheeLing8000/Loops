import java.util.Scanner;

public class TestAndOrBoolean {
    public static void main(String[] args) {
       //Create a Scanner
        Scanner input = new Scanner(System.in);
        //Receive an input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("Is " + number + " divisible by 5 and 7? "
                + (number % 5 == 0 && number % 7== 0));
        System.out.println("Is " + number + " divisible by 5 or 7? "
                + (number % 5 == 0 || number % 7== 0));
        System.out.println("Is " + number + " divisible by 5 or 7, but not both? "
                + (number % 5 == 0 ^ number % 7== 0));




    }

}