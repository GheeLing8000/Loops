import java.util.Scanner;

public class ConvertLowercaseToUppercase {
    public static void main(String[] args){
        //Create a scanner
        Scanner reader = new Scanner(System.in);
        //Receive the integer
        System.out.print("Enter a lowercase letter example 'a': ");
        char lowercase = reader.next().charAt(0);
        System.out.println("The lowercase letter is " +lowercase);
        int offset = 'a' - 'A';
        //Change the lowercase into uppercase
        char uppercase = (char)(lowercase - offset);
        System.out.println("The uppercase letter " + uppercase + " is converted from lowercase " + lowercase);
    }
}
