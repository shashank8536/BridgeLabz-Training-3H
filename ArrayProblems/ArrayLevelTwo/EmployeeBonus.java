package ArrayProblems.ArrayLevelTwo;
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMP_COUNT = 10;

        double[] salary = new double[EMP_COUNT];
        double[] yearsOfService = new double[EMP_COUNT];
        double[] bonus = new double[EMP_COUNT];
        double[] newSalary = new double[EMP_COUNT];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ": ");
            double sal = sc.nextDouble();
            System.out.println("Enter years of service for employee " + (i + 1) + ": ");
            double yos = sc.nextDouble();

            
            if (sal <= 0 || yos < 0) {
                System.out.println("Invalid input! Salary must be > 0 and years >= 0. Please enter again.");
                i--; 
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = yos;
        }

        for (int i = 0; i < EMP_COUNT; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; 
            } else {
                bonus[i] = salary[i] * 0.02; 
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nEmployee Bonus Details:");
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("Employee " + (i + 1) +" | Old Salary: " + salary[i] +" | Bonus: " + bonus[i] +" | New Salary: " + newSalary[i]);
        }

        System.out.println("\nTotal Old Salary of all employees = " + totalOldSalary);
        System.out.println("Total Bonus payout = " + totalBonus);
        System.out.println("Total New Salary of all employees = " + totalNewSalary);
    }
}
