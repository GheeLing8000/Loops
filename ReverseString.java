import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Define variables

        String inStr;        //input String
        int inStrLen;        //length of the input String
        char c = 0;
        Scanner in = new Scanner(System.in);
        // Prompt and read input as "String"
        System.out.print("Enter a String: ");
        in.close();
        inStr = in.next();   // use next() to read a String
        inStrLen = inStr.length();
        // Use inStr.charAt(index) in a loop to extract each character
        // The String's index begins at 0 from the left.
        // Process the String from the right
        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {
            // charIdx = inStrLen-1, inStrLen-2, ... ,0
            c = inStr.charAt(charIdx);
            System.out.print(c);
        }


    }
}