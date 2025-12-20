import javax.swing.*;
import java.util.Scanner;

public class GuessBirthMonthUsingConfirmationDialog {
    public static void main(String[] args){
        String set1 =
          " 1   3   5   7\n" +
          " 9  11";

        String set2 =
          " 2   3   6   7\n" +
          "10  11";

        String set3 =
          " 4   5   6   7\n" +
          "12";

        String set4 =
          " 8   9  10  11\n" +
          "12";

        int month = 0;
        //Prompt the user to answer the questions
        int answer = JOptionPane.showConfirmDialog(null,
                "Is your birth month in these numbers?\n" + set1);
        if (answer == JOptionPane.YES_OPTION)
            month += 1;
        answer = JOptionPane.showConfirmDialog(null,
                "Is your birth month in these numbers?\n" + set2);
        if(answer == JOptionPane.YES_OPTION)
            month += 2;
        answer = JOptionPane.showConfirmDialog(null,
                "Is your birth month in these numbers?\n" + set3);
        if(answer == JOptionPane.YES_OPTION)
            month += 4;
        answer = JOptionPane.showConfirmDialog(null,
                "Is your birth month in these numbers?\n" + set4);
        if(answer == JOptionPane.YES_OPTION)
            month += 8;
        JOptionPane.showMessageDialog(null,
                "Your birth month is  " + month + "!");

    }
}


























































































































