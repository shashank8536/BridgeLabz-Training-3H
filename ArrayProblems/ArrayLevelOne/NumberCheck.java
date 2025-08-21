package ArrayProblems.ArrayLevelOne;
import java.util.*;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5]; 

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i]; 

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("The number " + num + " is positive and even.");
                } else {
                    System.out.println("The number " + num + " is positive and odd.");
                }
            } else if (num < 0) {
                System.out.println("The number " + num + " is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }

        
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("The first element " + first + " and last element " + last + " are equal.");
        } else if (first > last) {
            System.out.println("The first element " + first + " is greater than last element " + last + ".");
        } else {
            System.out.println("The first element " + first + " is less than last element " + last + ".");
        }
    }
}
