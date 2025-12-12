import java.util.Scanner;

public class FindCharOfASCII {
    public static void main(String[] args){
        //Create a scanner
        Scanner input = new Scanner(System.in);
        //Receive the integer
        System.out.print("Enter an integer between 0 to 128: ");
        int code_ASCII = input.nextInt();
        System.out.println("The ASCII code is " +code_ASCII);
        //Change the ASCII code to character
        char ch = (char)code_ASCII;
        System.out.println("The character " + "\'" + ch + "\'" + " is converted from ASCII code " + "\'" + code_ASCII+ "\'");
    }
}
