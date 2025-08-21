package ArrayProblems.ArrayLevelOne;
import java.util.*;

public class StoreAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[10]; 
        int index = 0;
        double total=0.0;

        System.out.println("Enter numbers (0 or negative to stop, max 10 numbers):");

        while (true) {
            double num = scanner.nextDouble();

            if (num <= 0) {
                break; 
            }

            if (index == 10) {
                break;
            }

            numbers[index] = num;
            index++;
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("The sum of all numbers is: " + total);
    }
}
