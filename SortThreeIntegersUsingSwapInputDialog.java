import javax.swing.*;
import java.util.Scanner;

public class SortThreeIntegersUsingSwapInputDialog {
    public static void main(String[] args) {
        //Enter the first integer
        String firstIntegerString = JOptionPane.showInputDialog("Enter first integer, for example 1: ");
        //Convert string to integer
        int num1 = Integer.parseInt(firstIntegerString);
        //Enter the second integer
        String secondIntegerString = JOptionPane.showInputDialog("Enter second integer, for example 2: ");
        //Convert string to integer
        int num2 = Integer.parseInt(secondIntegerString);
        //Enter the third integer
        String thirdIntegerString = JOptionPane.showInputDialog("Enter third integer, for example 1: ");
        //Convert string to integer
        int num3 = Integer.parseInt(thirdIntegerString);
        //Given num3 is the biggest number
        if (num1 < num3 && num2 < num3) {
            if (num1 < num2) {
                //Assign smallest number num1 to temp
                int temp = num1;
                //Assign middle number num2 to num1
                num1 = num2;
                //Assign smallest number stored in temp to num2
                num2 = temp;
            }

            String output =
                    "The numbers in descending order is " + num3 + " , " + num1 + " , " + num2;
            JOptionPane.showMessageDialog(null, output);
            //The biggest number is num2
        } else if (num1 < num2 && num3 < num2) {
            if (num1 < num3) {
                //Assign the smallest number to temp
                int temp = num1;
                //Assign the middle number to num1
                num1 = num3;
                //Assign the smallest number to num3
                num3 = temp;
            }

            String output1 =
                    "The numbers in descending order is " + num2 + " , " + num1 + " , " + num3;
            JOptionPane.showMessageDialog(null, output1);
        }
        if (num2 < num1 && num3 < num1) {
            if (num2 < num3) {
                int temp = num2;
                num2 = num3;
                num3 = temp;
            }

            String output2 =
                    "The numbers in descending order is " + num1 + " , " + num2 + " , " + num3;
            JOptionPane.showMessageDialog(null, output2);

        }
    }
    }

