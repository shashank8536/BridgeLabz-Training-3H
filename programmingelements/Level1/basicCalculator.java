package programmingelements.Level1;

import java.util.Scanner;

public class basicCalculator {
    public static void BasicCalculator(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        double add = num1 + num2;
        double sub = num1 - num2;
        double mul = num1 * num2;
        double div = num1 / num2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and " + num2 +
        " is " + add + ", " + sub + ", " + mul + ", and " + div);
    }
    public static void main(String[] args) {
        BasicCalculator();
    }
}
