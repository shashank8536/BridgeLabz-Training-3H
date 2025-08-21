package ArrayProblems.ArrayLevelTwo;
import java.util.*;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10; 
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10;
            number = number / 10;        
            index++;
        }

        int largest = -1, secondLargest = -1;

        for (int i = 0; i < index; i++) {
            int d = digits[i];
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        System.out.println("Largest digit = " + largest);
        if (secondLargest == -1) {
            System.out.println("Second largest digit not found (all digits are same).");
        } else {
            System.out.println("Second largest digit = " + secondLargest);
        }
    }
}
