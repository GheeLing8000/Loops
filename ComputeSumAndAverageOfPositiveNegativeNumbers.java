import java.util.Scanner;

public class ComputeSumAndAverageOfPositiveNegativeNumbers {
    public static void main(String[] args) {
       //Create a scanner
        Scanner input = new Scanner(System.in);
        //Read an initial data
        System.out.print(
                "Enter an int value (the program exits if the input is 0): ");
        int data = input.nextInt();
        //Keep reading the data until the input is 0
        int sum = 0;
        int counter = 0;
        while (data != 0){
            //find the total after including int data sum = sum + data
            sum += data;
            //Increase the count
            counter++;
            //Read the next data
            System.out.print(
                    "Enter an int value (the program exits if the input is 0): ");
            data = input.nextInt();
        }
        System.out.println("The sum is " + sum);
        System.out.println("The number of count is " + counter);



    }
}