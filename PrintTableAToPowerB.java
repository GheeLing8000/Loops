
import java.util.Scanner;

public class PrintTableAToPowerB {
    public static void main(String[] args) {
        int c;
        Scanner input = new Scanner(System.in);
        //Receive the parameter a
        //System.out.print("Enter an integer for parameter 'a' : ");
        //int a = input.nextInt();
        //int b = a + 1;
        //c = (int)(1 * Math.pow(a,b));
        //Display the title
        System.out.println("a         b         pow(a, b)");
             int a = 1; int b = a + 1; c =  (int)(1 * Math.pow(a,b));
            System.out.print(a + "         " + b + "         " + c + "\n");
              a = 2;  b = a + 1; c =  (int)(1 * Math.pow(a,b));
            System.out.print(a + "         " + b + "         " + c + "\n");
              a = 3;  b = a + 1; c =  (int)(1 * Math.pow(a,b));
            System.out.print(a + "         " + b + "         " + c + "\n");
              a = 4;  b = a + 1; c =  (int)(1 * Math.pow(a,b));
            System.out.print(a + "         " + b + "         " + c + "\n");
              a = 5;  b = a + 1; c =  (int)(1 * Math.pow(a,b));
            System.out.print(a + "         " + b + "         " + c + "\n");





    }
}