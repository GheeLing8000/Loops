import java.util.Scanner;
import java.util.Arrays;
public class HighestThreeScoresAfterInputNumberOfStudents {
    	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the number of students
		System.out.print("Enter the number of students: ");
		int number = input.nextInt();
		//Create an array to store the grades entered
		double []scores = new double[number];

		for (int i = 0; i < number; i++){
			System.out.print("Enter the score of each student: ");
			scores[i] = input.nextDouble();
		}
			Arrays.sort(scores);
			System.out.println("1st Highest score = "+scores[scores.length - 1]);
			System.out.println("2nd Highest score = "+scores[scores.length - 2]);
			System.out.println("3rd Highest score = "+scores[scores.length - 3]);

	}
}
