import java.util.Scanner;

public class HighestScoreFromStudentsNameScoreInput {
    public static void main(String[] args) {
      //Create a new Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        System.out.print("Enter the student's name: ");
        String nameOfStudent = input.next();
        System.out.print("Enter the student's score: ");
        double scoreOfStudent = input.nextDouble();
        //Create a loop to collect number of students
        for (int number = 1; number < numberOfStudents; number++){
            //Enter new student's name
            System.out.print("Enter the student's name: ");
            String nameOfNewStudent = input.next();
            //Enter new student's score
            System.out.print("Enter the student's score: ");
            double newScoreOfStudent = input.nextDouble();
            /*Replace the existing student name and score with
            new student's higher score and new student name
             */
            if (newScoreOfStudent > scoreOfStudent){
                nameOfStudent = nameOfNewStudent;
                scoreOfStudent = newScoreOfStudent;
            }
        }
        System.out.println(nameOfStudent + " scores the highest with " + scoreOfStudent + " marks.");



    }
}