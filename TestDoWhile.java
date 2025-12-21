import java.util.Scanner;

public class TestDoWhile {
    public static void main(String[] args) {
        int data;
        int sum = 0;
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //Keep reading data until the input is 0
        do {
            //read the next data
            System.out.print("Enter an int value(the program exits if the input is 0):");
            data = input.nextInt();

            sum += data;
        } while (data != 0);
        System.out.print("The sum is " + sum);
    }
}