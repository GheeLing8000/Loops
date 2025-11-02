import java.util.Scanner;
public class PensionContributionCalculator {
    public static void main (String[] args) {
        // Declare constants
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;

        // Declare variables
        int salary, age;     // to be input
        Scanner in = new Scanner(System.in);  // Scan the keyboard for input
        System.out.print("Enter the monthly salary: $");  // No newline for prompting message
        salary = in.nextInt();                     // Read next input as "int"
        System.out.print("Enter the age: ");
        age = in.nextInt();
        in.close();  // Close Scanner

        int contributableSalary;

        double employeeContribution, employerContribution, totalContribution;

        // Check the contribution cap
        if (salary > SALARY_CEILING)
            contributableSalary = SALARY_CEILING;
        else contributableSalary = salary;
            // Compute various contributions in "double" using a nested-if to handle 4 cases
            if (age <= 55) {         // 55 and below

                employeeContribution = EMPLOYEE_RATE_55_AND_BELOW * (double)contributableSalary;
                employerContribution = EMPLOYER_RATE_55_AND_BELOW * (double)contributableSalary;



            } else if (age <= 60) {  // (60, 65]
                employeeContribution = EMPLOYEE_RATE_55_TO_60 * contributableSalary;
                employerContribution = EMPLOYER_RATE_55_TO_60 * contributableSalary;


            } else if (age <= 65) {  // (55, 60]
                employeeContribution = EMPLOYEE_RATE_60_TO_65 * contributableSalary;
                employerContribution = EMPLOYER_RATE_60_TO_65 * contributableSalary;


            } else {                 // above 65
                employeeContribution = EMPLOYER_RATE_65_ABOVE * contributableSalary;
                employerContribution = EMPLOYER_RATE_65_ABOVE * contributableSalary;
               // Alternatively,
                //if (age > 65) ......
                //else if (age > 60) ......
                //else if (age > 55) ......
                //else ......
            }
        totalContribution = employeeContribution + employerContribution;
        System.out.printf("The employee's contribution is: $%.2f%n",employeeContribution);
        System.out.printf("The employer's contribution is: $%.2f%n",employerContribution);
        System.out.printf("The total contribution is: $%.2f%n",totalContribution);
        }

    }

