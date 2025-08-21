package ArrayProblems.ArrayLevelOne;
import java.util.*;

public class AgeChecker {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] studentAges = new int[10];  

        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < studentAges.length; i++) {
            studentAges[i] = sc.nextInt();
        }

        
        for (int i = 0; i < studentAges.length; i++) {
            int age = studentAges[i]; 

            if (age < 0) {
                System.out.println("Invalid age entered.");
            } else if (age < 18) {
                System.out.println("The student with age " + age + " cannot vote.");
            } else {
                System.out.println("The student with age " + age + " can vote.");
            }
        }
    }
}
