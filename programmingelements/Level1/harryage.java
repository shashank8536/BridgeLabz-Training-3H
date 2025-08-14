package programmingelements.Level1;
import java.util.*;

public class harryage {
    public static void calculateAge() {
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;
        System.out.println("Harry's age in 2024 is " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        calculateAge();
    }
}
